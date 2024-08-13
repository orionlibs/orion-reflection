package io.github.orionlibs.orion_reflection.constructor.retrieval.tasks;

import io.github.orionlibs.orion_assert.Assert;
import java.lang.reflect.Constructor;

public class GetDeclaredConstructorTask
{
    public static Constructor<?> run(Object object, Class<?>... constructorParameterTypes) throws NoSuchMethodException, SecurityException
    {
        Assert.notNull(object, "object input cannot be null.");
        return run(object.getClass(), constructorParameterTypes);
    }


    public static Constructor<?> run(Class<?> aClass, Class<?>... constructorParameterTypes) throws NoSuchMethodException, SecurityException
    {
        Assert.notNull(aClass, "class input cannot be null.");

        if(constructorParameterTypes != null && constructorParameterTypes.length == 0)
        {
            constructorParameterTypes = new Class<?>[]
            {Object.class};
        }

        return aClass.getDeclaredConstructor(constructorParameterTypes);
    }
}