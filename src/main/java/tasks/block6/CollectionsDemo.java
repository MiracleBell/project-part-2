package tasks.block6;

import java.util.*;

public class CollectionsDemo {

    /*
     * @param stringList - list there keep strings
     *        symbol - value witch there must started string in list
     * @throw
     * @return - count of strings then start with symbol
     * */
    public static int filterStringsBySymbol(List<String> stringList, char symbol) {
        if (stringList == null) {
            throw new NullPointerException("strings list direction to null or empty");
        }
        int count = 0;
        for (String item : stringList) {
            if (item.charAt(0) == symbol) {
                count++;
            }
        }
        return count;
    }

    /* Find humans from  list whose surname equals humans surname
     * @param humans - list there keep strings
     *        human - value witch there must started string in list
     * @throw
     * @return - Namesakes list
     * */
    public static List<Human> findNamesakesInList(List<Human> humans, Human human) {
        if (humans == null) {
            throw new NullPointerException("Humans list direction to null or empty");
        }
        if (human == null) {
            throw new NullPointerException("Object human direction to null or empty");
        }
        List<Human> allNamesakes = new ArrayList<>();
        for (Human item : humans) {
            if (item == null) {
                throw new NullPointerException("Object direction to null in List<E>");
            }
            if (item.getSurname().equals(human.getSurname())) {
                allNamesakes.add(item);
            }
        }
        return allNamesakes;
    }

    /*
     * @param stringList - list there keep strings
     *        symbol - value witch there must started string in list
     * @throw
     * @return - count of strings then start with symbol
     * */
    public static List<Human> deleteHumanFromList(List<Human> humans, Human human) {
        if (humans == null) {
            throw new NullPointerException("Humans list direction to null or empty");
        }
        if (human == null) {
            throw new NullPointerException("Object human direction to null or empty");
        }
        List<Human> newList = new ArrayList<>(humans);
        newList.remove(human);
        return newList;
    }

    public static List<Set<Integer>> getSetsNotCrossing(List<Set<Integer>> integerSets, Set<Integer> integerSet) {
        if (integerSets == null || integerSets.isEmpty()) {
            throw new NullPointerException("List direction to null or empty");
        }
        if (integerSet.isEmpty()) {
            return integerSets;
        }

        List<Set<Integer>> result = new ArrayList<>(integerSets);
        for (Set<Integer> item : integerSets) {
            for (Integer elem : item) {
                if (integerSet.contains(elem)) {
                    result.remove(item);
                }
            }
        }
        return result;
    }

    /*
     * @param stringList - list there keep strings
     *        symbol - value witch there must started string in list
     * @throw
     * @return - count of strings then start with symbol
     * */
    public static <T extends Human> List<T> getHumanWithMaxAge(List<T> humans) {
        if (humans == null || humans.isEmpty()) {
            throw new NullPointerException("Humans list direction to null or empty");
        }
        int maximum = 0;
        List<T> result = new ArrayList<>();
        for (T item : humans) {
            if (item.getAge() > maximum) {
                maximum = item.getAge();
                result.clear();
            }
            if (item.getAge() == maximum) {
                result.add(item);
            }
        }
        return result;
    }

    /*
     * @param stringList - list there keep strings
     *        symbol - value witch there must started string in list
     * @throw
     * @return - count of strings then start with symbol
     * */
    public static <T extends Human> Set<T> getHumanById(Map<Integer, T> idToHuman, Set<Integer> humansId) {
        if (idToHuman == null || idToHuman.isEmpty()) {
            throw new NullPointerException("Map direction to null or empty");
        }
        if (humansId == null) {
            throw new NullPointerException("Set direction to null");
        }
        Set<T> result = new HashSet<>();
        for (Integer item : humansId) {
            if (idToHuman.containsKey(item)) {
                result.add(idToHuman.get(item));
            }
        }
        return result;
    }

    /*
     * @param stringList - list there keep strings
     *        symbol - value witch there must started string in list
     * @throw
     * @return - count of strings then start with symbol
     * */
    public static <T extends Human> List<Integer> getAdultHuman(Map<Integer, T> idToHuman) {
        if (idToHuman == null || idToHuman.isEmpty()) {
            throw new NullPointerException("Map direction to null or empty");
        }

        List<Integer> result = new ArrayList<>();
        for (Integer item : idToHuman.keySet()) {
            if (idToHuman.get(item).getAge() >= 18) {
                result.add(item);
            }
        }
        return result;
    }

    /*
     * @param stringList - list there keep strings
     *        symbol - value witch there must started string in list
     * @throw
     * @return - count of strings then start with symbol
     * */
    public static <T extends Human> Map<Integer, Integer> getMapIdToAge(Map<Integer, T> idToHuman) {
        if (idToHuman == null || idToHuman.isEmpty()) {
            throw new NullPointerException("Map direction to null or empty");
        }

        Map<Integer, Integer> result = new TreeMap<>();
        for (Integer item : idToHuman.keySet()) {
            result.put(item, idToHuman.get(item).getAge());
        }
        return result;
    }

    /*
     * @param stringList - list there keep strings
     *        symbol - value witch there must started string in list
     * @throw
     * @return - count of strings then start with symbol
     * */
    public static <T extends Human> Map<Integer, Set<Human>> getMapAgeToHumans(Set<Human> humans) {
        if (humans == null || humans.isEmpty()) {
            throw new NullPointerException("Map direction to null or empty");
        }

        Map<Integer, Set<Human>> resultMap = new TreeMap<>();
        for (Human item : humans) {
            resultMap.put(item.getAge(), humans);
            for (Human elem : humans) {
                if (item.getAge() != elem.getAge()) {
                    resultMap.get(item.getAge()).remove(elem);
                }
            }
        }
        return resultMap;
    }

    /*
     * @param stringList - list there keep strings
     *        symbol - value witch there must started string in list
     * @throw
     * @return - count of strings then start with symbol
     * */
    //TODO: доделать до 14.02
    public static <T extends Human> Map<Integer, Map<Character, Set<Human>>> getAdvancedMap(Set<Human> humans) {
        Map<Integer, Map<Character, Set<Human>>> resultMap = new TreeMap<>();
        Map<Integer, Set<Human>> supportMap = getMapAgeToHumans(humans);
        for (Integer item : supportMap.keySet()) {
            Map<Character, Set<Human>> supMap = new TreeMap<>((o1, o2) -> o1.compareTo(o2));
//            for (Human elem : humans) {
//                if ()
//            }
//            resultMap.put(
//                    item,
//
//                    )
        }
        return resultMap;
    }

}
