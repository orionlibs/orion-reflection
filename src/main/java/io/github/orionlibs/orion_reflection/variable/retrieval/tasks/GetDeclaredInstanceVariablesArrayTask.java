package io.github.orionlibs.orion_reflection.variable.retrieval.tasks;

import io.github.orionlibs.orion_assert.Assert;
import io.github.orionlibs.orion_stream.OrionStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.stream.Stream;

public class GetDeclaredInstanceVariablesArrayTask
{
    public static Field[] run(Class<?> aClass)
    {
        Assert.notNull(aClass, "aClass input cannot be null.");
        Field[] fields = aClass.getDeclaredFields();
        Stream<Field> stream = Arrays.stream(fields)
                        .filter(field -> IsNotStaticVariableTask.run(field));
        return OrionStream.getAsArray(stream, Field.class);
    }


    public static Field[] run(Object object)
    {
        Assert.notNull(object, "object input cannot be null.");
        return run(object.getClass());
    }
}