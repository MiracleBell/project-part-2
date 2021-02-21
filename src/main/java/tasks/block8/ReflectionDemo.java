package tasks.block8;

import tasks.block6.Human;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectionDemo {

    /* Find count of the element from list, where are objects type 'Human' or its subclasses
     * @param list
     * @return counter - value
     * */
    public static <T> int findAllHumans(List<T> list) {
        int counter = 0;
        for (T item : list) {
            if (item.getClass().equals(Human.class)) {
                counter++;
            }
        }
        return counter;
    }

    /* Get list of declared methods from object Для объекта получить список имен его открытых методов
     * @param obj
     * @return list of the methods name -
     * */
    public static <T> List<String> getMethodsNameList(T obj) {
        List<String> methodsNameList = new ArrayList<>();
        for (Method item : obj.getClass().getDeclaredMethods()) {
            methodsNameList.add(item.getName());
        }
        return methodsNameList;
    }

    /* Find count of the element from list, where are objects type 'Human' or its subclasses
     * @param list
     * @return counter - value
     * */
    public static <T> List<String> getAllSuperclassesByObject(T obj) {
        List<String> superclassesName = new ArrayList<>();
        Class clazz = obj.getClass();
        while (clazz != Object.class) {
            superclassesName.add(clazz.getName());
            clazz = clazz.getSuperclass();
        }
        return superclassesName;
    }
}
