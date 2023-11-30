package pairmatching;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum MenuChoice {
    MATCHING("1"),
    FETCHING("2"),
    RESET("3"),
    TERMINATE("Q")
    ;

    private final String menuChoiceInput;

    private static final Map<String, MenuChoice> menuChoiceMap = Collections.unmodifiableMap(
            Arrays.stream(values())
                    .collect(Collectors.toMap(MenuChoice::getMenuChoiceInput, Function.identity()))
    );

    public static MenuChoice checkMenuChoice(String menuChoiceInput) {
        return menuChoiceMap.get(menuChoiceInput);
    }

    MenuChoice(String menuChoiceInput) {
        this.menuChoiceInput = menuChoiceInput;
    }

    public String getMenuChoiceInput() {
        return menuChoiceInput;
    }
}
