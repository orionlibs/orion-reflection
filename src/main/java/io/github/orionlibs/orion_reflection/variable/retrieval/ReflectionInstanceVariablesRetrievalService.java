package io.github.orionlibs.orion_reflection.variable.retrieval;

import io.github.orionlibs.orion_assert.Assert;
import io.github.orionlibs.orion_reflection.variable.retrieval.tasks.GetAllInstanceVariablesArrayTask;
import io.github.orionlibs.orion_reflection.variable.retrieval.tasks.GetAllPrivateInstanceVariablesArrayTask;
import io.github.orionlibs.orion_reflection.variable.retrieval.tasks.GetDeclaredInstanceVariablesArrayTask;
import io.github.orionlibs.orion_reflection.variable.retrieval.tasks.GetDeclaredPrivateInstanceVariablesArrayTask;
import io.github.orionlibs.orion_reflection.variable.retrieval.tasks.GetDeclaredProtectedInstanceVariablesArrayTask;
import io.github.orionlibs.orion_reflection.variable.retrieval.tasks.GetDeclaredPublicInstanceVariablesArrayTask;
import io.github.orionlibs.orion_reflection.variable.retrieval.tasks.GetDeclaredStaticVariablesArrayTask;
import io.github.orionlibs.orion_reflection.variable.retrieval.tasks.GetInherittedInstanceVariablesArrayTask;
import io.github.orionlibs.orion_reflection.variable.retrieval.tasks.GetInherittedPrivateInstanceVariablesArrayTask;
import io.github.orionlibs.orion_reflection.variable.retrieval.tasks.GetPrivateInstanceVariablesArrayTask;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class ReflectionInstanceVariablesRetrievalService
{
    public static Field[] getDeclaredInstanceVariablesArray(Object object)
    {
        return GetDeclaredInstanceVariablesArrayTask.run(object);
    }


    public static Field[] getDeclaredInstanceVariablesArray(Class<?> aClass)
    {
        return GetDeclaredInstanceVariablesArrayTask.run(aClass);
    }


    public static List<Field> getDeclaredInstanceVariables(Object object)
    {
        return Arrays.asList(getDeclaredInstanceVariablesArray(object));
    }


    public static List<Field> getDeclaredInstanceVariables(Class<?> aClass)
    {
        return Arrays.asList(getDeclaredInstanceVariablesArray(aClass));
    }


    public static Field[] getPrivateInstanceVariablesArray(Object object)
    {
        return GetPrivateInstanceVariablesArrayTask.run(object);
    }


    public static Field[] getPrivateInstanceVariablesArray(Class<?> aClass)
    {
        return GetPrivateInstanceVariablesArrayTask.run(aClass);
    }


    public static List<Field> getPrivateInstanceVariables(Object object)
    {
        return Arrays.asList(getPrivateInstanceVariablesArray(object));
    }


    public static List<Field> getPrivateInstanceVariables(Class<?> aClass)
    {
        return Arrays.asList(getPrivateInstanceVariablesArray(aClass));
    }


    public static Field[] getDeclaredProtectedInstanceVariablesArray(Object object)
    {
        return GetDeclaredProtectedInstanceVariablesArrayTask.run(object);
    }


    public static Field[] getDeclaredProtectedInstanceVariablesArray(Class<?> aClass)
    {
        return GetDeclaredProtectedInstanceVariablesArrayTask.run(aClass);
    }


    public static List<Field> getDeclaredProtectedInstanceVariables(Object object)
    {
        return Arrays.asList(getDeclaredProtectedInstanceVariablesArray(object));
    }


    public static List<Field> getDeclaredProtectedInstanceVariables(Class<?> aClass)
    {
        return Arrays.asList(getDeclaredProtectedInstanceVariablesArray(aClass));
    }


    public static Field[] getDeclaredPublicInstanceVariablesArray(Object object)
    {
        return GetDeclaredPublicInstanceVariablesArrayTask.run(object);
    }


    public static Field[] getDeclaredPublicInstanceVariablesArray(Class<?> aClass)
    {
        return GetDeclaredPublicInstanceVariablesArrayTask.run(aClass);
    }


    public static List<Field> getDeclaredPublicInstanceVariables(Object object)
    {
        return Arrays.asList(getDeclaredPublicInstanceVariablesArray(object));
    }


    public static List<Field> getDeclaredPublicInstanceVariables(Class<?> aClass)
    {
        return Arrays.asList(getDeclaredPublicInstanceVariablesArray(aClass));
    }


    public static Field[] getDeclaredPrivateInstanceVariablesArray(Object object)
    {
        return GetDeclaredPrivateInstanceVariablesArrayTask.run(object);
    }


    public static Field[] getDeclaredPrivateInstanceVariablesArray(Class<?> aClass)
    {
        return GetDeclaredPrivateInstanceVariablesArrayTask.run(aClass);
    }


    public static List<Field> getDeclaredPrivateInstanceVariables(Object object)
    {
        return Arrays.asList(getDeclaredPrivateInstanceVariablesArray(object));
    }


    public static List<Field> getDeclaredPrivateInstanceVariables(Class<?> aClass)
    {
        return Arrays.asList(getDeclaredPrivateInstanceVariablesArray(aClass));
    }


    public static Field[] getInherittedInstanceVariablesArray(Object object)
    {
        return GetInherittedInstanceVariablesArrayTask.run(object);
    }


    public static Field[] getInherittedInstanceVariablesArray(Class<?> aClass)
    {
        return GetInherittedInstanceVariablesArrayTask.run(aClass);
    }


    public static List<Field> getInherittedInstanceVariables(Object object)
    {
        return Arrays.asList(getInherittedInstanceVariablesArray(object));
    }


    public static List<Field> getInherittedInstanceVariables(Class<?> aClass)
    {
        return Arrays.asList(getInherittedInstanceVariablesArray(aClass));
    }


    public static Field[] getInherittedPrivateInstanceVariablesArray(Object object)
    {
        return GetInherittedPrivateInstanceVariablesArrayTask.run(object);
    }


    public static Field[] getInherittedPrivateInstanceVariablesArray(Class<?> aClass)
    {
        return GetInherittedPrivateInstanceVariablesArrayTask.run(aClass);
    }


    public static List<Field> getInherittedPrivateInstanceVariables(Object object)
    {
        return Arrays.asList(getInherittedPrivateInstanceVariablesArray(object));
    }


    public static List<Field> getInherittedPrivateInstanceVariables(Class<?> aClass)
    {
        return Arrays.asList(getInherittedPrivateInstanceVariablesArray(aClass));
    }


    public static Field[] getAllPrivateInstanceVariablesArray(Object object)
    {
        return GetAllPrivateInstanceVariablesArrayTask.run(object);
    }


    public static Field[] getAllPrivateInstanceVariablesArray(Class<?> aClass)
    {
        return GetAllPrivateInstanceVariablesArrayTask.run(aClass);
    }


    public static List<Field> getAllPrivateInstanceVariables(Object object)
    {
        return Arrays.asList(getAllPrivateInstanceVariablesArray(object));
    }


    public static List<Field> getAllPrivateInstanceVariables(Class<?> aClass)
    {
        return Arrays.asList(getAllPrivateInstanceVariablesArray(aClass));
    }


    public static Field[] getAllInstanceVariablesArray(Object object)
    {
        return GetAllInstanceVariablesArrayTask.run(object);
    }


    public static Field[] getAllInstanceVariablesArray(Class<?> aClass)
    {
        return GetAllInstanceVariablesArrayTask.run(aClass);
    }


    public static List<Field> getAllInstanceVariables(Object object)
    {
        return Arrays.asList(getAllInstanceVariablesArray(object));
    }


    public static List<Field> getAllInstanceVariables(Class<?> aClass)
    {
        return Arrays.asList(getAllInstanceVariablesArray(aClass));
    }


    public static Field[] getDeclaredStaticVariablesArray(Object object)
    {
        Assert.notNull(object, "object input cannot be null.");
        return getDeclaredStaticVariablesArray(object.getClass());
    }


    public static Field[] getDeclaredStaticVariablesArray(Class<?> aClass)
    {
        return GetDeclaredStaticVariablesArrayTask.run(aClass);
    }


    public static List<Field> getDeclaredStaticVariables(Object object)
    {
        return Arrays.asList(getDeclaredStaticVariablesArray(object));
    }


    public static List<Field> getDeclaredStaticVariables(Class<?> aClass)
    {
        return Arrays.asList(getDeclaredStaticVariablesArray(aClass));
    }
}