package tasks.block9;

import java.util.function.Function;

public class LambdaDemo {
    public static final Function<String, Integer> length = String::length;
    public static final Function<String, Character> GSFS = str -> (str != null && str.equals("")) ? str.charAt(0) : null;
    public static final Function<String, Boolean> CS = str -> str.contains(" ");
    public static final Function<String, Integer> GWFS = str -> str.split(",").length;
    public static final Function<Human, Integer> GHS = human -> human.getAge();
    //
    public static final Function<Human, String> GFN = human -> human.getSurname().concat(" ").concat(human.getName()).concat(" ").concat(human.getSecondName());
    public static final Function<Human, Human> COH = human -> new Human(
            human.getSurname(),
            human.getName(),
            human.getSecondName(),
            human.getAge() + 1,
            human.getGender()
    );
    //

    public static final GetStringLength GET_STRING_LENGTH = str -> str.length();
    public static final GetStringFirstSymbol GET_STRING_FIRST_SYMBOL = str -> str != null ? str.charAt(0) : null;
    public static final checkSpaces CHECK_SPACES = str -> str.contains(" ");
    public static final GetWordsFromString GET_WORDS_FROM_STRING = str -> str.split(",").length;
    public static final GetHumansAge GET_HUMANS_AGE = human -> human.getAge();

    public static final CheckNamesakes CHECK_NAMESAKES = ((h1, h2) -> h1.getSurname().equals(h2.getSurname()) ? true : false);

    public static final GetFullName GET_FULL_NAME = human -> human.getSurname().concat(" ").concat(human.getName()).concat(" ").concat(human.getSecondName());
    public static final CreateOlderHuman CREATE_OLDER_HUMAN = human -> new Human(
            human.getSurname(),
            human.getName(),
            human.getSecondName(),
            human.getAge() + 1,
            human.getGender()
    );
    public static final Operation8 IsYounger = ((h1, h2, h3, maxAge) ->
            h1.getAge() < maxAge &&
                    h2.getAge() < maxAge &&
                    h3.getAge() < maxAge ? true : false);


    interface GetStringLength {
        int getLength(String str);
    }

    interface GetStringFirstSymbol {
        char getFirstSymbol(String str);
    }

    interface checkSpaces {
        boolean hasSpaces(String str);
    }

    interface GetWordsFromString {
        int face(String str);
    }

    interface Operation3 {
        int getFirstSymbol(String str);
    }

    interface GetHumansAge {
        int getAge(Human human);
    }

    interface CheckNamesakes {
        boolean isNamesakes(Human h1, Human h2);
    }

    interface GetFullName {
        String getFullName(Human human);
    }

    interface CreateOlderHuman {
        Human makeOldestHuman(Human human);
    }

    interface Operation8 {
        boolean youngerMaxAge(Human h1, Human h2, Human h3, int maxAge);
    }
}
