package pairmatching;

public enum MenuChoice {
    MATCHING("1"),
    FETCHING("2"),
    RESET("3"),
    TERMINATE("Q")
    ;

    private final String menuChoiceInput;

    MenuChoice(String menuChoiceInput) {
        this.menuChoiceInput = menuChoiceInput;
    }
}
