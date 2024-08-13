package io.github.orionlibs.orion_reflection.constructor.access;

import io.github.orionlibs.orion_reflection.constructor.access.tasks.CallConstructorTask;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionConstructorAccessService
{
    public static Object callConstructor(Constructor<?> constructor, Object... constructorArguments) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException
    {
        return CallConstructorTask.run(constructor, constructorArguments);
    }
}