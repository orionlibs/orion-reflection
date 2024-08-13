package io.github.orionlibs.orion_reflection.constructor.retrieval;

import io.github.orionlibs.orion_reflection.constructor.retrieval.tasks.GetDeclaredConstructorsArrayTask;
import io.github.orionlibs.orion_reflection.constructor.retrieval.tasks.GetPublicConstructorsArrayTask;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

public class ReflectionConstructorsRetrievalService
{
    public static Constructor<?>[] getDeclaredConstructorsArray(Object object)
    {
        return GetDeclaredConstructorsArrayTask.run(object);
    }


    public static Constructor<?>[] getDeclaredConstructorsArray(Class<?> aClass)
    {
        return GetDeclaredConstructorsArrayTask.run(aClass);
    }


    public static List<Constructor<?>> getDeclaredConstructors(Object object)
    {
        return Arrays.asList(getDeclaredConstructorsArray(object));
    }


    public static List<Constructor<?>> getDeclaredConstructors(Class<?> aClass)
    {
        return Arrays.asList(getDeclaredConstructorsArray(aClass));
    }


    public static Constructor<?>[] getPublicConstructorsArray(Object object)
    {
        return GetPublicConstructorsArrayTask.run(object);
    }


    public static Constructor<?>[] getPublicConstructorsArray(Class<?> aClass)
    {
        return GetPublicConstructorsArrayTask.run(aClass);
    }


    public static List<Constructor<?>> getPublicConstructors(Object object)
    {
        return Arrays.asList(getPublicConstructorsArray(object));
    }


    public static List<Constructor<?>> getPublicConstructors(Class<?> aClass)
    {
        return Arrays.asList(getPublicConstructorsArray(aClass));
    }
}