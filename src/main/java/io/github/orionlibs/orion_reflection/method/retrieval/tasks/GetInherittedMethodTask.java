package io.github.orionlibs.orion_reflection.method.retrieval.tasks;

import io.github.orionlibs.orion_assert.Assert;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class GetInherittedMethodTask
{
    public static Method run(String methodName, Object object, Class<?>... methodParameterTypes)
    {
        Assert.notEmpty(methodName, "methmethodNameod input cannot be null/empty.");
        Assert.notNull(object, "object input cannot be null.");
        Assert.notNull(methodParameterTypes, "methodParameterTypes input cannot be null.");
        return run(methodName, object.getClass(), methodParameterTypes);
    }


    public static Method run(String methodName, Class<?> aClass, Class<?>... methodParameterTypes)
    {
        Assert.notEmpty(methodName, "methmethodNameod input cannot be null/empty.");
        Assert.notNull(aClass, "class input cannot be null.");
        Assert.notNull(methodParameterTypes, "methodParameterTypes input cannot be null.");

        try
        {

            if(methodParameterTypes.length == 0)
            {
                methodParameterTypes = new Class<?>[]
                {Object.class};
            }

            Method publicOrInherittedMethod = aClass.getMethod(methodName, methodParameterTypes);
            Method declaredMethod = GetDeclaredMethodTask.run(methodName, aClass, methodParameterTypes);

            if(declaredMethod == null || !Modifier.isPublic(declaredMethod.getModifiers()))
            {
                return publicOrInherittedMethod;
            }
            else
            {
                return null;
            }

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