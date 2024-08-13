package io.github.orionlibs.orion_reflection.method.access;

import io.github.orionlibs.orion_reflection.method.access.tasks.CallMethodTask;
import io.github.orionlibs.orion_reflection.method.access.tasks.MakeMethodAccessibleTask;
import java.lang.reflect.Method;

public class ReflectionMethodAccessService
{
    public static void makeMethodAccessible(Method method)
    {
        new MakeMethodAccessibleTask().run(method);
    }


    public static void makeMethodAccessible(String method, Object objectMethodBelongsTo, Class<?>[] argumentTypes) throws NoSuchMethodException
    {
        new MakeMethodAccessibleTask().run(method, objectMethodBelongsTo, argumentTypes);
    }


    public static Object callMethod(Method method, Object objectMethodBelongsTo, Object[] methodArguments)
    {
        return new CallMethodTask().run(method, objectMethodBelongsTo, methodArguments);
    }


    public static Object callMethod(String method, Object objectMethodBelongsTo, Object[] methodArguments)
    {
        return new CallMethodTask().run(method, objectMethodBelongsTo, methodArguments);
    }


    public static Object callMethod(String method, Object objectMethodBelongsTo, Class<?>[] argumentTypes, Object[] methodArguments)
    {
        return new CallMethodTask().run(method, objectMethodBelongsTo, argumentTypes, methodArguments);
    }


    public static Object callMethod(String method, Object objectMethodBelongsTo)
    {
        return new CallMethodTask().run(method, objectMethodBelongsTo);
    }
}