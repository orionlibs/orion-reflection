package io.github.orionlibs.orion_reflection.enumeration.tasks;

import io.github.orionlibs.orion_assert.Assert;

public class GetEnumerationDefinitionsTask
{
    @SuppressWarnings(
                    {"rawtypes"})
    public static Enum[] run(Class<Enum> enumerationClass)
    {
        Assert.notNull(enumerationClass, "enumerationClass input cannot be null.");
        return enumerationClass.getEnumConstants();
    }
}