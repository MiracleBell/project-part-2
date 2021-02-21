package tasks.block6;

public class Group {
    private int id;
    private int[] data;

    public Group(int id, int... data) {
        setId(id);
        setData(data);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 1) {
            throw new IllegalArgumentException("Incorrect id");
        }
        this.id = id;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int... data) {
        if (data == null) {
            throw new NullPointerException();
        }
        if (data.length < 1) {
            throw new IllegalArgumentException("Incorrect data");
        }
        this.data = data;
    }

    public int arrayLength() {
        return data.length;
    }
}
