package io.github.orionlibs.orion_reflection.acccessible_object.tasks;

import java.lang.reflect.AccessibleObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetAllAccessibleObjectsArrayTask
{
    public static AccessibleObject[] run(Class<?> aClass)
    {
        List<AccessibleObject> accessibleObjects = new ArrayList<AccessibleObject>();
        accessibleObjects.addAll(Arrays.asList(GetDeclaredAccessibleObjectsArrayTask.run(aClass)));
        accessibleObjects.addAll(Arrays.asList(GetInherittedAccessibleObjectsArrayTask.run(aClass)));
        return accessibleObjects.toArray(new AccessibleObject[0]);
    }


    public static AccessibleObject[] run(Object object)
    {
        return run(object);
    }
}