package io.github.orionlibs.orion_reflection.variable.retrieval.tasks;

import io.github.orionlibs.orion_assert.Assert;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class GetDeclaredProtectedInstanceVariablesArrayTask
{
    public static Field[] run(Class<?> aClass) throws SecurityException
    {
        Assert.notNull(aClass, "class input cannot be null.");
        List<Field> declaredProtectedInstanceVariables = new ArrayList<Field>();

        for(Field instanceVariable : aClass.getDeclaredFields())
        {

            if(IsProtectedVariableTask.run(instanceVariable) && IsNotStaticVariableTask.run(instanceVariable))
            {
                declaredProtectedInstanceVariables.add(instanceVariable);
            }

        }

        return declaredProtectedInstanceVariables.toArray(new Field[0]);
    }


    public static Field[] run(Object object) throws SecurityException
    {
        Assert.notNull(object, "object input cannot be null.");
        return run(object.getClass());
    }
}