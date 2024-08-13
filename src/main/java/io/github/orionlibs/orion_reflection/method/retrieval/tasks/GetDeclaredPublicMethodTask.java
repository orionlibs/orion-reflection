package io.github.orionlibs.orion_reflection.method.retrieval.tasks;

import io.github.orionlibs.orion_assert.Assert;
import java.lang.reflect.Method;

public class GetDeclaredPublicMethodTask
{
    public static Method run(String methodName, Class<?> aClass, Class<?>... methodParameterTypes)
    {
        Assert.notEmpty(methodName, "methodName input cannot be null/empty.");
        Assert.notNull(aClass, "class input cannot be null.");
        Assert.notNull(methodParameterTypes, "methodParameterTypes input cannot be null.");
        Method method = GetDeclaredMethodTask.run(methodName, aClass, methodParameterTypes);
        if(method != null && IsPublicMethodTask.run(method))
        {
            return method;
        }
        return null;
    }


    public static Method run(String methodName, Object object, Class<?>... methodParameterTypes)
    {
        Assert.notEmpty(methodName, "methodName input cannot be null/empty.");
        Assert.notNull(object, "object input cannot be null.");
        Assert.notNull(methodParameterTypes, "methodParameterTypes input cannot be null.");
        return run(methodName, object.getClass(), methodParameterTypes);
    }
}