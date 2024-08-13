package io.github.orionlibs.orion_reflection.object.tasks;

import java.util.Arrays;

public class AreObjectsNotNullTask
{
    public static boolean run(Object... objects)
    {
        if(objects != null && objects.length > 0)
        {
            return !Arrays.stream(objects).anyMatch(object -> object == null);
        }
        return false;
    }
}