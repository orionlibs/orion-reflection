package io.github.orionlibs.orion_reflection.variable.retrieval.tasks;

import io.github.orionlibs.orion_assert.Assert;
import java.lang.reflect.Field;

public class GetDeclaredInstanceVariableTask
{
    public static Field run(String instanceVariableName, Object object) throws NoSuchFieldException, SecurityException
    {
        Assert.notEmpty(instanceVariableName, "instanceVariableName input cannot be null/empty.");
        Assert.notNull(object, "object input cannot be null.");
        return run(instanceVariableName, object.getClass());
    }


    public static Field run(String instanceVariableName, Class<?> aClass) throws NoSuchFieldException, SecurityException
    {
        Assert.notNull(aClass, "class input cannot be null.");
        return aClass.getDeclaredField(instanceVariableName);
    }
}