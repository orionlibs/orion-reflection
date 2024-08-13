package io.github.orionlibs.orion_reflection.variable.retrieval.tasks;

import io.github.orionlibs.orion_assert.Assert;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetAllPrivateInstanceVariablesArrayTask
{
    public static Field[] run(Class<?> aClass)
    {
        Assert.notNull(aClass, "class input cannot be null.");
        List<Field> instanceVariables = new ArrayList<>();
        instanceVariables.addAll(Arrays.asList(GetDeclaredPrivateInstanceVariablesArrayTask.run(aClass)));
        instanceVariables.addAll(Arrays.asList(GetInherittedPrivateInstanceVariablesArrayTask.run(aClass)));
        return instanceVariables.toArray(new Field[0]);
    }


    public static Field[] run(Object object)
    {
        Assert.notNull(object, "object input cannot be null.");
        return run(object.getClass());
    }
}