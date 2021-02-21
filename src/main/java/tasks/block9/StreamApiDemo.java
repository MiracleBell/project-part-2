package tasks.block9;

import java.util.*;

public class StreamApiDemo extends LambdaDemo {
    public static final RemoveAllNull removeAllNull = objects -> objects.removeIf(Objects::isNull);//1

    //    public static final FindPositiveNumber findPositiveNumber = integers -> integers.removeIf(item -> item < 1);//2
    public static final GetLastTreeElements getLastTreeElements = objects -> objects.size() < 4 ? objects : objects.subList(objects.size() - 4, objects.size() - 1);//3
//    public static final GetFirstEvenNumber getFirstEvenNumber = integers -> integers.stream().filter(elem->elem%2==0? elem:null);//4


    /*public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        for (Integer item : integers) {
            if (item % 2 == 0){
                return;
            }
        }
    }*/

    interface RemoveAllNull {
        void removeAllNull(List<Object> objects);
    }

    interface FindPositiveNumber {
        int findPositiveNumber(Set<Integer> set);
    }

    interface GetLastTreeElements {
        List<Object> getLastTreeElements(List<Object> objects);
    }

    interface GetFirstEvenNumber {
        Integer getFirstEvenNumber(List<Integer> integers);
    }

    ;
}
