package io.github.orionlibs.orion_reflection.method.retrieval;

import io.github.orionlibs.orion_reflection.method.retrieval.tasks.GetAllMethodsArrayTask;
import io.github.orionlibs.orion_reflection.method.retrieval.tasks.GetDeclaredDefaultMethodsArrayTask;
import io.github.orionlibs.orion_reflection.method.retrieval.tasks.GetDeclaredMethodsArrayTask;
import io.github.orionlibs.orion_reflection.method.retrieval.tasks.GetDeclaredProtectedMethodsArrayTask;
import io.github.orionlibs.orion_reflection.method.retrieval.tasks.GetDeclaredPublicMethodsArrayTask;
import io.github.orionlibs.orion_reflection.method.retrieval.tasks.GetInherittedMethodsArrayTask;
import io.github.orionlibs.orion_reflection.method.retrieval.tasks.GetPrivateMethodsArrayTask;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class ReflectionMethodsRetrievalService
{
    public static Method[] getDeclaredMethodsArray(Object object)
    {
        return GetDeclaredMethodsArrayTask.run(object);
    }


    public static Method[] getDeclaredMethodsArray(Class<?> aClass)
    {
        return GetDeclaredMethodsArrayTask.run(aClass);
    }


    public static List<Method> getDeclaredMethods(Object object)
    {
        return Arrays.asList(getDeclaredMethodsArray(object));
    }


    public static List<Method> getDeclaredMethods(Class<?> aClass)
    {
        return Arrays.asList(getDeclaredMethodsArray(aClass));
    }


    public static Method[] getDeclaredDefaultMethodsArray(Object object)
    {
        return GetDeclaredDefaultMethodsArrayTask.run(object);
    }


    public static Method[] getDeclaredDefaultMethodsArray(Class<?> aClass)
    {
        return GetDeclaredDefaultMethodsArrayTask.run(aClass);
    }


    public static List<Method> getDeclaredDefaultMethods(Object object)
    {
        return Arrays.asList(getDeclaredDefaultMethodsArray(object));
    }


    public static List<Method> getDeclaredDefaultMethods(Class<?> aClass)
    {
        return Arrays.asList(getDeclaredDefaultMethodsArray(aClass));
    }


    public static Method[] getPrivateMethodsArray(Object object)
    {
        return GetPrivateMethodsArrayTask.run(object);
    }


    public static Method[] getPrivateMethodsArray(Class<?> aClass)
    {
        return GetPrivateMethodsArrayTask.run(aClass);
    }


    public static List<Method> getPrivateMethods(Object object)
    {
        return Arrays.asList(getPrivateMethodsArray(object));
    }


    public static List<Method> getPrivateMethods(Class<?> aClass)
    {
        return Arrays.asList(getPrivateMethodsArray(aClass));
    }


    public static Method[] getDeclaredProtectedMethodsArray(Object object)
    {
        return GetDeclaredProtectedMethodsArrayTask.run(object);
    }


    public static Method[] getDeclaredProtectedMethodsArray(Class<?> aClass)
    {
        return GetDeclaredProtectedMethodsArrayTask.run(aClass);
    }


    public static List<Method> getDeclaredProtectedMethods(Object object)
    {
        return Arrays.asList(getDeclaredProtectedMethodsArray(object));
    }


    public static List<Method> getDeclaredProtectedMethods(Class<?> aClass)
    {
        return Arrays.asList(getDeclaredProtectedMethodsArray(aClass));
    }


    public static Method[] getDeclaredPublicMethodsArray(Object object)
    {
        return GetDeclaredPublicMethodsArrayTask.run(object);
    }


    public static Method[] getDeclaredPublicMethodsArray(Class<?> aClass)
    {
        return GetDeclaredPublicMethodsArrayTask.run(aClass);
    }


    public static List<Method> getDeclaredPublicMethods(Object object)
    {
        return Arrays.asList(getDeclaredPublicMethodsArray(object));
    }


    public static List<Method> getDeclaredPublicMethods(Class<?> aClass)
    {
        return Arrays.asList(getDeclaredPublicMethodsArray(aClass));
    }


    public static Method[] getInherittedMethodsArray(Object object)
    {
        return GetInherittedMethodsArrayTask.run(object);
    }


    public static Method[] getInherittedMethodsArray(Class<?> aClass)
    {
        return GetInherittedMethodsArrayTask.run(aClass);
    }


    public static List<Method> getInherittedMethods(Object object)
    {
        return Arrays.asList(getInherittedMethodsArray(object));
    }


    public static List<Method> getInherittedMethods(Class<?> aClass)
    {
        return Arrays.asList(getInherittedMethodsArray(aClass));
    }


    public static Method[] getAllMethodsArray(Object object)
    {
        return GetAllMethodsArrayTask.run(object);
    }


    public static Method[] getAllMethodsArray(Class<?> aClass)
    {
        return GetAllMethodsArrayTask.run(aClass);
    }


    public static List<Method> getAllMethods(Object object)
    {
        return Arrays.asList(getAllMethodsArray(object));
    }


    public static List<Method> getAllMethods(Class<?> aClass)
    {
        return Arrays.asList(getAllMethodsArray(aClass));
    }
}