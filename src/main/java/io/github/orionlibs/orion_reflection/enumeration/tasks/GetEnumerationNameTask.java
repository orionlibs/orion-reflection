package io.github.orionlibs.orion_reflection.enumeration.tasks;

import io.github.orionlibs.orion_assert.Assert;

public class GetEnumerationNameTask
{
    @SuppressWarnings(
    {"rawtypes"})
    public static String run(Enum enumerationDefinition)
    {
        Assert.notNull(enumerationDefinition, "enumerationDefinition input cannot be null.");
        return enumerationDefinition.name();
    }
}