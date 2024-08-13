package io.github.orionlibs.orion_reflection.object.equality;

import io.github.orionlibs.orion_reflection.object.equality.tasks.AreObjectsEqualTask;

public class ObjectsEqualityService
{
    public static boolean areObjectsEqual(Object object1, Object object2, Object... moreObjects)
    {
        return AreObjectsEqualTask.run(object1, object2, moreObjects);
    }
}