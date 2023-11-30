package pairmatching;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MenuChoiceTest {
    @Test
    void flow() {
        MenuChoice menuChoice = MenuChoice.checkMenuChoice("1");

        assertThat(menuChoice).isEqualTo(MenuChoice.MATCHING);
    }
}
