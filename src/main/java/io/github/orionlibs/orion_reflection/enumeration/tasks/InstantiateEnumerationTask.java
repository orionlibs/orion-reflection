package io.github.orionlibs.orion_reflection.enumeration.tasks;

import io.github.orionlibs.orion_assert.Assert;
import io.github.orionlibs.orion_reflection.classes.ReflectionClassesService;

public class InstantiateEnumerationTask
{
    @SuppressWarnings(
    {"unchecked", "rawtypes"})
    public static Class<Enum> run(String enumerationPath) throws ClassNotFoundException
    {
        Assert.notEmpty(enumerationPath, "enumerationPath input cannot be null/empty.");
        return (Class<Enum>)ReflectionClassesService.loadClass(enumerationPath);
    }
}