package io.github.orionlibs.orion_reflection.method.retrieval;

import io.github.orionlibs.orion_assert.Assert;
import io.github.orionlibs.orion_reflection.method.retrieval.tasks.GetDeclaredDefaultMethodTask;
import io.github.orionlibs.orion_reflection.method.retrieval.tasks.GetDeclaredMethodTask;
import io.github.orionlibs.orion_reflection.method.retrieval.tasks.GetDeclaredProtectedMethodTask;
import io.github.orionlibs.orion_reflection.method.retrieval.tasks.GetDeclaredPublicMethodTask;
import io.github.orionlibs.orion_reflection.method.retrieval.tasks.GetInherittedMethodTask;
import io.github.orionlibs.orion_reflection.method.retrieval.tasks.GetPrivateMethodTask;
import io.github.orionlibs.orion_reflection.method.retrieval.tasks.IsDefaultMethodTask;
import io.github.orionlibs.orion_reflection.method.retrieval.tasks.IsPrivateMethodTask;
import io.github.orionlibs.orion_reflection.method.retrieval.tasks.IsProtectedMethodTask;
import io.github.orionlibs.orion_reflection.method.retrieval.tasks.IsPublicMethodTask;
import java.lang.reflect.Method;

public class ReflectionMethodRetrievalService
{
    public static Method getDeclaredMethod(String methodName, Object object, Class<?>... methodParameterTypes)
    {
        Assert.notNull(object, "object input cannot be null.");
        return GetDeclaredMethodTask.run(methodName, object.getClass(), methodParameterTypes);
    }


    public static Method getDeclaredMethod(String methodName, Class<?> aClass, Class<?>... methodParameterTypes)
    {
        return GetDeclaredMethodTask.run(methodName, aClass, methodParameterTypes);
    }


    public static Method getPrivateMethod(String methodName, Object object, Class<?>... methodParameterTypes)
    {
        return GetPrivateMethodTask.run(methodName, object, methodParameterTypes);
    }


    public static Method getPrivateMethod(String methodName, Class<?> aClass, Class<?>... methodParameterTypes)
    {
        return GetPrivateMethodTask.run(methodName, aClass, methodParameterTypes);
    }


    public static Method getDeclaredDefaultMethod(String methodName, Object object, Class<?>... methodParameterTypes)
    {
        return GetDeclaredDefaultMethodTask.run(methodName, object, methodParameterTypes);
    }


    public static Method getDeclaredDefaultMethod(String methodName, Class<?> aClass, Class<?>... methodParameterTypes)
    {
        return GetDeclaredDefaultMethodTask.run(methodName, aClass, methodParameterTypes);
    }


    public static Method getDeclaredPublicMethod(String methodName, Object object, Class<?>... methodParameterTypes)
    {
        return GetDeclaredPublicMethodTask.run(methodName, object, methodParameterTypes);
    }


    public static Method getDeclaredPublicMethod(String methodName, Class<?> aClass, Class<?>... methodParameterTypes)
    {
        return GetDeclaredPublicMethodTask.run(methodName, aClass, methodParameterTypes);
    }


    public static Method getDeclaredProtectedMethod(String methodName, Object object, Class<?>... methodParameterTypes)
    {
        return GetDeclaredProtectedMethodTask.run(methodName, object, methodParameterTypes);
    }


    public static Method getDeclaredProtectedMethod(String methodName, Class<?> aClass, Class<?>... methodParameterTypes)
    {
        return GetDeclaredProtectedMethodTask.run(methodName, aClass, methodParameterTypes);
    }


    public static Method getInherittedMethod(String methodName, Object object, Class<?>... methodParameterTypes)
    {
        return GetInherittedMethodTask.run(methodName, object, methodParameterTypes);
    }


    public static Method getInherittedMethod(String methodName, Class<?> aClass, Class<?>... methodParameterTypes)
    {
        return GetInherittedMethodTask.run(methodName, aClass, methodParameterTypes);
    }


    public static boolean isDefaultMethod(Method method)
    {
        return IsDefaultMethodTask.run(method);
    }


    public static boolean isPrivateMethod(Method method)
    {
        return IsPrivateMethodTask.run(method);
    }


    public static boolean isProtectedMethod(Method method)
    {
        return IsProtectedMethodTask.run(method);
    }


    public static boolean isPublicMethod(Method method)
    {
        return IsPublicMethodTask.run(method);
    }
}