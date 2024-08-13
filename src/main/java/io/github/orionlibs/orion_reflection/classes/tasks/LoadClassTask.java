package io.github.orionlibs.orion_reflection.classes.tasks;

import io.github.orionlibs.orion_assert.Assert;

public class LoadClassTask
{
    public static Class<?> run(String className) throws ClassNotFoundException
    {
        Assert.notEmpty(className, "className input cannot be null/empty.");
        return ClassLoader.getSystemClassLoader().loadClass(className);
    }
}