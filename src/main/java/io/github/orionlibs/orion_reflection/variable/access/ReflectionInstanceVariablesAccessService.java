package io.github.orionlibs.orion_reflection.variable.access;

import io.github.orionlibs.orion_assert.InaccessibleException;
import io.github.orionlibs.orion_reflection.variable.access.tasks.InjectObjectToInstanceVariableTask;
import io.github.orionlibs.orion_reflection.variable.access.tasks.InjectStringToInstanceVariableTask;
import io.github.orionlibs.orion_reflection.variable.access.tasks.MakeInstanceVariableAccessibleTask;
import java.lang.reflect.Field;
import java.lang.reflect.InaccessibleObjectException;

public class ReflectionInstanceVariablesAccessService
{
    public static void makeInstanceVariableAccessible(Field instanceVariable) throws InaccessibleObjectException, SecurityException
    {
        new MakeInstanceVariableAccessibleTask().run(instanceVariable);
    }


    public static void injectStringToInstanceVariable(Object object, String stringToInject, Field instanceVariable) throws InaccessibleException
    {
        new InjectStringToInstanceVariableTask().run(object, stringToInject, instanceVariable);
    }


    public static void injectObjectToInstanceVariable(Object object, Object objectToInject, Field instanceVariable) throws InaccessibleException
    {
        new InjectObjectToInstanceVariableTask().run(object, objectToInject, instanceVariable);
    }
}