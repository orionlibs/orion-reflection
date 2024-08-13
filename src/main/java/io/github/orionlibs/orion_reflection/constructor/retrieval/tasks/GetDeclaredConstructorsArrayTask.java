package io.github.orionlibs.orion_reflection.constructor.retrieval.tasks;

import io.github.orionlibs.orion_assert.Assert;
import java.lang.reflect.Constructor;

public class GetDeclaredConstructorsArrayTask
{
    public static Constructor<?>[] run(Class<?> aClass) throws SecurityException
    {
        Assert.notNull(aClass, "class input cannot be null.");
        return aClass.getDeclaredConstructors();
    }


    public static Constructor<?>[] run(Object object) throws SecurityException
    {
        Assert.notNull(object, "object input cannot be null.");
        return run(object.getClass());
    }
}