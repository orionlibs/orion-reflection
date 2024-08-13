package io.github.orionlibs.orion_reflection.variable.retrieval.tasks;

import io.github.orionlibs.orion_assert.Assert;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class IsStaticVariableTask
{
    public static boolean run(Field instanceVariable)
    {
        Assert.notNull(instanceVariable, "instanceVariable input cannot be null.");
        return Modifier.isStatic(instanceVariable.getModifiers());
    }
}