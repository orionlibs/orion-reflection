package io.github.orionlibs.orion_reflection.method.retrieval.tasks;

import io.github.orionlibs.orion_assert.Assert;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class IsProtectedMethodTask
{
    public static boolean run(Method method)
    {
        Assert.notNull(method, "method input cannot be null.");
        return Modifier.isProtected(method.getModifiers());
    }
}