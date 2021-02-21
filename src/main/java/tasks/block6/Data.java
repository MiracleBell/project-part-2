package tasks.block6;


import java.util.Iterator;

public class Data implements Iterable<Integer> {
    private String dataName;
    private Group[] groups;

    public Data(String dataName, Group... groups) {

        setDataName(dataName);
        setGroups(groups);
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        if (dataName == null || dataName.equals("")) {
            throw new NullPointerException("Incorrect data name");
        }
        this.dataName = dataName;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group... groups) {
        if (groups.length < 1) {
            throw new IllegalArgumentException();
        }
        this.groups = groups;
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> iter = new Iterator<Integer>() {
            private int currentGroup = 0;
            private int currentValue = 0;

            @Override
            public boolean hasNext() {
                if (currentValue == groups[currentGroup].getData().length) {
                    currentGroup++;
                    currentValue = 0;
                }
                return currentGroup < groups.length && currentValue < groups[currentGroup].getData().length;
            }

            @Override
            public Integer next() {
                return groups[currentGroup].getData()[currentValue++];
            }
        };
        return iter;
    }
}
