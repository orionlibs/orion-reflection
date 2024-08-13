package io.github.orionlibs.orion_reflection.variable.access.tasks;

import io.github.orionlibs.orion_assert.Assert;
import java.lang.reflect.Field;
import java.lang.reflect.InaccessibleObjectException;

public class MakeInstanceVariableAccessibleTask
{
    public void run(Field instanceVariable) throws InaccessibleObjectException, SecurityException
    {
        Assert.notNull(instanceVariable, "instanceVariable input cannot be null.");
        instanceVariable.setAccessible(true);
    }
}