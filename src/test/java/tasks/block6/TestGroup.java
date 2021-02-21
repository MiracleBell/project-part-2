package tasks.block6;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestGroup {
    @Test
    public void testClassConstructorAndGetters1() {
        int id = 1;
        int[] data = {1, 2, 3, 4, 5, 7, 6};
        Group group = new Group(id, data);

        assertEquals(id, group.getId());
        assertArrayEquals(data, group.getData());
        assertEquals(data.length, group.arrayLength());
    }

    @Test
    public void testClassConstructorAndGetters2() {
        int id = 1;
        int[] data = {1, 2, 3, 4, 5, 7, 6};
        Group group = new Group(id, 1, 2, 3, 4, 5, 7, 6);

        assertEquals(id, group.getId());
        assertEquals(data.length, group.arrayLength());
        assertArrayEquals(data, group.getData());
    }

    @Test
    public void testClassSetters() {
        int id = 1;
        int[] data = {1, 2, 3, 4, 5, 7, 6};
        Group group = new Group(id, data);

        int newId = 4;
        int[] newData = {4, 3, 2, 1};
        group.setId(newId);
        group.setData(newData);

        assertEquals(newId, group.getId());
        assertEquals(newData.length, group.arrayLength());
        assertArrayEquals(newData, group.getData());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClassException1() {
        int id = -1;
        int[] data = {1, 2, 3, 4, 5, 7, 6};
        Group group = new Group(id, data);

    }

    @Test(expected = NullPointerException.class)
    public void testClassException2() {
        int id = 1;
        int[] data = null;
        Group group = new Group(id, data);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testClassException3() {
        int id = 1;
        int[] data = {1, 2, 3, 4, 5, 7, 6};
        Group group = new Group(id, data);
        group.setId(-33);
    }


    @Test(expected = NullPointerException.class)
    public void testClassException() {
        int id = 1;
        int[] data = {1, 2, 3, 4, 5, 7, 6};
        Group group = new Group(id, data);
        group.setData(null);
    }
}
