package io.github.orionlibs.orion_reflection.object.equality.tasks;

import io.github.orionlibs.orion_reflection.object.ReflectionObjectsService;

public class AreObjectsEqualTask
{
    //we have object1 and object2 to make sure the user provides at least 2 objects to compare
    public static boolean run(Object object1, Object object2, Object... moreObjects)
    {
        boolean areObjectsEqual = false;
        if(ReflectionObjectsService.areObjectsNotNull(object1, object2))
        {
            areObjectsEqual = object1.equals(object2);
            if(areObjectsEqual && moreObjects.length > 0)
            {
                for(Object object : moreObjects)
                {
                    //we use object1 to compare since we know by now that object1 = object2, so it doesn't matter which we use
                    areObjectsEqual = object1.equals(object);
                    if(!areObjectsEqual)
                    {
                        return false;
                    }
                }
            }
        }
        return areObjectsEqual;
    }
}