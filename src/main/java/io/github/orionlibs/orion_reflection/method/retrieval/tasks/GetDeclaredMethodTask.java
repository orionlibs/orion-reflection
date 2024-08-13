package io.github.orionlibs.orion_reflection.method.retrieval.tasks;

import io.github.orionlibs.orion_assert.Assert;
import java.lang.reflect.Method;

public class GetDeclaredMethodTask
{
    public static Method run(String methodName, Object object, Class<?>... methodParameterTypes)
    {
        Assert.notEmpty(methodName, "methodName input cannot be null/empty.");
        Assert.notNull(object, "object input cannot be null.");
        Assert.notNull(methodParameterTypes, "methodParameterTypes input cannot be null.");
        return run(methodName, object.getClass(), methodParameterTypes);
    }


    public static Method run(String methodName, Class<?> aClass, Class<?>... methodParameterTypes)
    {
        Assert.notEmpty(methodName, "methodName input cannot be null/empty.");
        Assert.notNull(aClass, "class input cannot be null.");
        Assert.notNull(methodParameterTypes, "methodParameterTypes input cannot be null.");

        try
        {

            if(methodParameterTypes.length == 0)
            {
                methodParameterTypes = new Class<?>[]
                {Object.class};
            }

            return aClass.getDeclaredMethod(methodName, methodParameterTypes);
        }
        catch(NoSuchMethodException e)
        {
            return null;
        }
        catch(SecurityException e)
        {
            return null;
        }

    }
}