package tasks.block6;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestCollectionsDemo {
    @Test
    public void testFilterStringsBySymbol1() {
        String string1 = "add";
        String string2 = "bad";
        String string3 = "dad";

        List<String> list = new ArrayList<>();
        list.add(string1);
        list.add(string2);
        list.add(string3);

        char symbol = 'a';
        int result = CollectionsDemo.filterStringsBySymbol(list, symbol);
        assertEquals(result, 1);
    }

    @Test
    public void testFilterStringsBySymbol2() {
        String string1 = "add";
        String string2 = "bad";
        String string3 = "dad";

        List<String> list = new ArrayList<>();
        list.add(string1);
        list.add(string2);
        list.add(string3);

        char symbol = 'z';
        int result = CollectionsDemo.filterStringsBySymbol(list, symbol);
        assertEquals(result, 0);
    }

    @Test
    public void testFindNamesakesInList1() {
        Human human1 = new Human("Doe", "John", "John", 30);
        Human human2 = new Human("Ivanov", "Ivan", "Ivanovich", 30);
        Human human3 = new Human("Petrov", "John", "John", 30);
        Human human4 = new Human("Ivanov", "John", "John", 30);

        List<Human> list = new ArrayList<>();
        list.add(human1);
        list.add(human2);
        list.add(human3);
        list.add(human4);

        List<Human> actual = new ArrayList<>();
        actual.add(human1);

        Human human = new Human("Doe", "John", "John", 30);
        List<Human> result = CollectionsDemo.findNamesakesInList(list, human);
        assertArrayEquals(result.toArray(), actual.toArray());
    }

    @Test
    public void testFindNamesakesInList2() {
        Human human1 = new Human("Doe", "John", "John", 30);
        Human human2 = new Human("Ivanov", "Ivan", "Ivanovich", 30);
        Human human3 = new Human("Petrov", "John", "John", 30);
        Human human4 = new Human("Ivanov", "John", "John", 30);

        List<Human> list = new ArrayList<>();
        list.add(human1);
        list.add(human2);
        list.add(human3);
        list.add(human4);

        List<Human> actual = new ArrayList<>();
        actual.add(human2);
        actual.add(human4);

        Human human = new Human("Ivanov", "Vladimir", "Petrovich", 30);
        List<Human> result = CollectionsDemo.findNamesakesInList(list, human);
        assertArrayEquals(result.toArray(), actual.toArray());
    }

    @Test
    public void testDeleteHumanFromList1() {
        Human human1 = new Human("Doe", "John", "John", 30);
        Human human2 = new Human("Ivanov", "Ivan", "Ivanovich", 30);
        Human human3 = new Human("Petrov", "John", "John", 30);
        Human human4 = new Human("Ivanov", "John", "John", 30);

        List<Human> list = new ArrayList<>();
        list.add(human1);
        list.add(human2);
        list.add(human3);
        list.add(human4);

        Human human = new Human("Ivanov", "Vladimir", "Petrovich", 30);
        List<Human> result = CollectionsDemo.deleteHumanFromList(list, human);
        assertArrayEquals(result.toArray(), list.toArray());
    }

    @Test
    public void testDeleteHumanFromList2() {
        Human human1 = new Human("Doe", "John", "John", 30);
        Human human2 = new Human("Ivanov", "Ivan", "Ivanovich", 30);
        Human human3 = new Human("Petrov", "John", "John", 30);
        Human human4 = new Human("Ivanov", "John", "John", 30);

        List<Human> list = new ArrayList<>();
        list.add(human1);
        list.add(human2);
        list.add(human3);
        list.add(human4);

        List<Human> result = CollectionsDemo.deleteHumanFromList(list, human1);
        list.remove(human1);
        assertArrayEquals(result.toArray(), list.toArray());
    }

    @Test
    public void testGetSetsCrossing() {
        Integer integer1 = 1;
        Integer integer2 = 2;
        Integer integer3 = 3;
        Integer integer4 = 4;

        Set<Integer> integers1 = new HashSet<>();
        integers1.add(integer1);
        integers1.add(integer2);
        integers1.add(integer3);
        integers1.add(integer4);

        Set<Integer> integers2 = new HashSet<>();
        integers2.add(integer2);
        integers2.add(integer3);
        integers2.add(integer4);

        Set<Integer> integers3 = new HashSet<>();
        integers3.add(integer2);
        integers3.add(integer3);

        List<Set<Integer>> mainList = new ArrayList<>();
        mainList.add(integers1);
        mainList.add(integers2);
        mainList.add(integers3);

        Set<Integer> supportSet = new HashSet<>();
        supportSet.add(integer1);

        List<Set<Integer>> result = CollectionsDemo.getSetsNotCrossing(mainList, supportSet);
        mainList.remove(integers1);
        assertArrayEquals(result.toArray(), mainList.toArray());
    }

    @Test
    public void testGetHumanWithMaxAge1() {
        Human human1 = new Human("Doe", "John", "John", 30);
        Human human2 = new Human("Ivanov", "Ivan", "Ivanovich", 20);
        Human human3 = new Human("Petrov", "John", "John", 10);
        Human human4 = new Human("Ivanov", "John", "John", 0);

        List<Human> list = new ArrayList<>();
        list.add(human1);
        list.add(human2);
        list.add(human3);
        list.add(human4);

        List<Human> actual = new ArrayList<>();
        actual.add(human1);

        List<Human> result = CollectionsDemo.getHumanWithMaxAge(list);
        assertArrayEquals(result.toArray(), actual.toArray());
    }

    @Test
    public void testGetHumanWithMaxAge2() {
        Human human1 = new Human("Doe", "John", "John", 30);
        Human human2 = new Human("Ivanov", "Ivan", "Ivanovich", 20);
        Human human3 = new Human("Petrov", "John", "John", 10);
        Human human4 = new Human("Ivanov", "John", "John", 0);

        List<Human> list = new ArrayList<>();
        list.add(human1);
        list.add(human2);
        list.add(human3);
        list.add(human4);

        List<Human> actual = new ArrayList<>();
        actual.add(human1);

        List<Human> result = CollectionsDemo.getHumanWithMaxAge(list);
        assertArrayEquals(result.toArray(), actual.toArray());
    }

    @Test
    public void testGetHumanById1() {
        Human human1 = new Human("Doe", "John", "John", 30);
        Human human2 = new Human("Ivanov", "Ivan", "Ivanovich", 20);
        Human human3 = new Human("Petrov", "John", "John", 10);
        Human human4 = new Human("Ivanov", "John", "John", 0);

        List<Human> list = new ArrayList<>();
        list.add(human1);
        list.add(human2);
        list.add(human3);
        list.add(human4);

        Map<Integer, Human> map = new TreeMap<>();
        map.put(1, human1);
        map.put(2, human2);
        map.put(3, human3);
        map.put(4, human4);

        Set<Integer> set = new HashSet<>();
        set.add(2);

        Set<Human> actual = new HashSet<>();
        actual.add(human2);

        Set<Human> result = CollectionsDemo.getHumanById(map, set);
        assertArrayEquals(result.toArray(), actual.toArray());
    }

    @Test
    public void testGetAdultHuman() {



//        CollectionsDemo.getAdultHuman();
    }
}
