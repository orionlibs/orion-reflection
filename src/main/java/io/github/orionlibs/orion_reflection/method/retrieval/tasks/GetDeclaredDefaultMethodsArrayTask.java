package io.github.orionlibs.orion_reflection.method.retrieval.tasks;

import io.github.orionlibs.orion_assert.Assert;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetDeclaredDefaultMethodsArrayTask
{
    public static Method[] run(Class<?> aClass)
    {
        Assert.notNull(aClass, "class input cannot be null.");
        List<Method> declaredDefaultMethods = new ArrayList<Method>();
        Arrays.stream(aClass.getDeclaredMethods())
                        .filter(method -> !Modifier.isPrivate(method.getModifiers())
                                        && !Modifier.isProtected(method.getModifiers())
                                        && !Modifier.isPublic(method.getModifiers()))
                        .forEach(method -> declaredDefaultMethods.add(method));
        return declaredDefaultMethods.toArray(new Method[0]);
    }


    public static Method[] run(Object object)
    {
        Assert.notNull(object, "object input cannot be null.");
        return run(object.getClass());
    }
}