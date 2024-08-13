package io.github.orionlibs.orion_reflection.classes;

import io.github.orionlibs.orion_assert.Assert;
import io.github.orionlibs.orion_assert.InaccessibleException;
import io.github.orionlibs.orion_reflection.classes.tasks.InstantiateClassTask;
import io.github.orionlibs.orion_reflection.classes.tasks.LoadClassTask;
import java.lang.reflect.InvocationTargetException;

public class ReflectionClassesService
{
    @SuppressWarnings("unchecked")
    public static <T> Class<T> getClassTypeOfGenericType(T object)
    {
        Assert.notNull(object, "object input cannot be null.");
        return (Class<T>)object.getClass().getComponentType();
    }


    public static Class<?> loadClass(String className) throws ClassNotFoundException
    {
        return LoadClassTask.run(className);
    }


    public static Object instantiateClass(Class<?> classToInstantiate, Class<?>[] constructorArgumentTypes, Object[] constructorArguments) throws InvocationTargetException, InaccessibleException
    {
        return InstantiateClassTask.run(classToInstantiate, constructorArgumentTypes, constructorArguments);
    }


    public static Object instantiateClass(String classToInstantiateString, Class<?>[] constructorArgumentTypes, Object[] constructorArguments) throws InvocationTargetException, InaccessibleException
    {
        return InstantiateClassTask.run(classToInstantiateString, constructorArgumentTypes, constructorArguments);
    }
}