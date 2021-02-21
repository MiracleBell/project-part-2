package tasks.block6;

import java.util.*;

public class PhoneBook {
    private Map<Human, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new TreeMap<>(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getSurname().compareTo(o2.getSurname() + o1.getName().compareTo(o2.getName()));
            }
        });
    }

    /*
     * @param stringList - list there keep strings
     *        symbol - value witch there must started string in list
     * @throw
     * @return - count of strings then start with symbol
     * */
    public void addPhoneNumber(Human human, String number) {
        if (!phoneBook.containsKey(human)) {
            phoneBook.put(human, new ArrayList<>());
        }
        phoneBook.get(human).add(number);
    }

    /*
     * @param stringList - list there keep strings
     *        symbol - value witch there must started string in list
     * @throw
     * @return - count of strings then start with symbol
     * */
    public void removePhoneNumber(String number) {
        for (List<String> item : phoneBook.values()) {
            if (item.contains(number)) {
                item.remove(number);
                break;
            }
        }
    }

    /*
     * @param stringList - list there keep strings
     *        symbol - value witch there must started string in list
     * @throw
     * @return - count of strings then start with symbol
     * */
    public List<String> getPhonesByHuman(Human human) {
        return phoneBook.get(human);
    }

    /*
     * @param stringList - list there keep strings
     *        symbol - value witch there must started string in list
     * @throw
     * @return - count of strings then start with symbol
     * */
    public Human findHumanByPhoneNumber(String number) {
        for (Human item : phoneBook.keySet()) {
            if (phoneBook.get(item).contains(number)) {
                return item;
            }
        }
        return null;//так делать нехорошо
    }

    /*
     * @param stringList - list there keep strings
     *        symbol - value witch there must started string in list
     * @throw
     * @return - count of strings then start with symbol
     * */
    public Map<Human, List<String>> findHumanBySymbol(String str) {
        Map<Human, List<String>> resultMap = new TreeMap<>();
        for (Human item : phoneBook.keySet()) {
            if (item.getSurname().startsWith(str)) {
                resultMap.put(item, phoneBook.get(item));
            }
        }
        return resultMap;
    }
}
