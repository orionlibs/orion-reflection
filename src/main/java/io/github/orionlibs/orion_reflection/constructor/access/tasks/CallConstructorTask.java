package io.github.orionlibs.orion_reflection.constructor.access.tasks;

import io.github.orionlibs.orion_assert.Assert;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CallConstructorTask
{
    public static Object run(Constructor<?> constructor, Object... methodArguments) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException
    {
        Assert.notNull(constructor, "constructor input cannot be null.");
        return constructor.newInstance(methodArguments);
    }
}