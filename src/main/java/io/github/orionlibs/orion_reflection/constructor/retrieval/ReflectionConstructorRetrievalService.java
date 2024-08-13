package io.github.orionlibs.orion_reflection.constructor.retrieval;

import io.github.orionlibs.orion_reflection.constructor.retrieval.tasks.GetDeclaredConstructorTask;
import io.github.orionlibs.orion_reflection.constructor.retrieval.tasks.GetPublicConstructorTask;
import java.lang.reflect.Constructor;

public class ReflectionConstructorRetrievalService
{
    public static Constructor<?> getDeclaredConstructor(Object object, Class<?>... constructorParameterTypes) throws NoSuchMethodException, SecurityException
    {
        return GetDeclaredConstructorTask.run(object, constructorParameterTypes);
    }


    public static Constructor<?> getDeclaredConstructor(Class<?> aClass, Class<?>... constructorParameterTypes) throws NoSuchMethodException, SecurityException
    {
        return GetDeclaredConstructorTask.run(aClass, constructorParameterTypes);
    }


    public static Constructor<?> getPublicConstructor(Object object, Class<?>... constructorParameterTypes) throws NoSuchMethodException, SecurityException
    {
        return GetPublicConstructorTask.run(object, constructorParameterTypes);
    }


    public static Constructor<?> getPublicConstructor(Class<?> aClass, Class<?>... constructorParameterTypes) throws NoSuchMethodException, SecurityException
    {
        return GetPublicConstructorTask.run(aClass, constructorParameterTypes);
    }
}