package io.github.orionlibs.orion_reflection.variable.retrieval.tasks;

import io.github.orionlibs.orion_assert.Assert;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class IsNotStaticVariableTask
{
    public static boolean run(Field variable)
    {
        Assert.notNull(variable, "The given variable input cannot be null.");
        return !Modifier.isStatic(variable.getModifiers());
    }
}