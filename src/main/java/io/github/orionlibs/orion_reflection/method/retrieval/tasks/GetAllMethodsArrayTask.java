package io.github.orionlibs.orion_reflection.method.retrieval.tasks;

import io.github.orionlibs.orion_assert.Assert;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetAllMethodsArrayTask
{
    public static Method[] run(Class<?> aClass)
    {
        Assert.notNull(aClass, "class input cannot be null.");
        List<Method> instanceMethods = new ArrayList<Method>();
        List<Method> inherittedMethods = Arrays.asList(GetInherittedMethodsArrayTask.run(aClass));
        List<Method> declaredMethods = Arrays.asList(GetDeclaredMethodsArrayTask.run(aClass));
        instanceMethods.addAll(inherittedMethods);
        instanceMethods.addAll(declaredMethods);
        return instanceMethods.toArray(new Method[0]);
    }


    public static Method[] run(Object object)
    {
        Assert.notNull(object, "object input cannot be null.");
        return run(object.getClass());
    }
}