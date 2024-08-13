package io.github.orionlibs.orion_reflection.variable.retrieval.tasks;

import io.github.orionlibs.orion_assert.Assert;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetInherittedPrivateInstanceVariablesArrayTask
{
    public static Field[] run(Class<?> aClass) throws SecurityException
    {
        Assert.notNull(aClass, "class input cannot be null.");
        List<Field> instanceVariables = new ArrayList<Field>();
        Class<?> currentSuperClass = aClass.getSuperclass();
        while(currentSuperClass != null)
        {
            instanceVariables.addAll(Arrays.asList(GetDeclaredPrivateInstanceVariablesArrayTask.run(currentSuperClass)));
            currentSuperClass = currentSuperClass.getSuperclass();
        }
        return instanceVariables.toArray(new Field[0]);
    }


    public static Field[] run(Object object) throws SecurityException
    {
        Assert.notNull(object, "object input cannot be null.");
        return run(object.getClass());
    }
}