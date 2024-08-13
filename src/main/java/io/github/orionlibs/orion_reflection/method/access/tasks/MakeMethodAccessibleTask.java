package io.github.orionlibs.orion_reflection.method.access.tasks;

import io.github.orionlibs.orion_assert.Assert;
import java.lang.reflect.Method;

public class MakeMethodAccessibleTask
{
    public void run(Method method) throws SecurityException
    {
        Assert.notNull(method, "method input cannot be null.");
        method.setAccessible(true);
    }


    public void run(String method, Object objectMethodBelongsTo, Class<?>[] argumentTypes) throws SecurityException, NoSuchMethodException
    {
        Assert.notNull(method, "method input cannot be null.");
        objectMethodBelongsTo.getClass().getDeclaredMethod(method, argumentTypes).setAccessible(true);
    }
}