package io.github.orionlibs.orion_reflection.enumeration;

import io.github.orionlibs.orion_reflection.enumeration.tasks.GetEnumerationDefinitionsTask;
import io.github.orionlibs.orion_reflection.enumeration.tasks.GetEnumerationNameTask;
import io.github.orionlibs.orion_reflection.enumeration.tasks.GetEnumerationValueTask;
import io.github.orionlibs.orion_reflection.enumeration.tasks.InstantiateEnumerationTask;
import java.lang.reflect.InvocationTargetException;

public class ReflectionEnumerationService
{
    @SuppressWarnings(
    {"rawtypes"})
    public static Class<Enum> instantiateEnumeration(String enumerationPath) throws ClassNotFoundException
    {
        return InstantiateEnumerationTask.run(enumerationPath);
    }


    @SuppressWarnings("rawtypes")
    public static Enum[] getEnumerationDefinitions(Class<Enum> enumerationClass)
    {
        return GetEnumerationDefinitionsTask.run(enumerationClass);
    }


    @SuppressWarnings("rawtypes")
    public static String getEnumerationName(Enum enumerationDefinition)
    {
        return GetEnumerationNameTask.run(enumerationDefinition);
    }


    @SuppressWarnings(
    {"rawtypes"})
    public static String getEnumerationValue(Class<Enum> enumerationClass, String enumerationName) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        return GetEnumerationValueTask.run(enumerationClass, enumerationName);
    }
}