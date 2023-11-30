package pairmatching;

import static pairmatching.Level.LEVEL1;
import static pairmatching.Level.LEVEL2;
import static pairmatching.Level.LEVEL4;

public enum Mission {
    CAR_RACING(LEVEL1, "자동차경주"),
    LOTTO(LEVEL1, "로또"),
    NUMBER_BASEBALL(LEVEL1, "숫자야구게임"),

    SHOPPING(LEVEL2, "장바구니"),
    PAYMENT(LEVEL2, "결제"),
    SUBWAY_MAP(LEVEL2, "지하철노선도"),

    PERFORMANCE(LEVEL4, "성능개선"),
    DISTRIBUTION(LEVEL4, "배포")
    ;

    private final Level level;
    private final String missionName;

    Mission(Level level, String missionName) {
        this.level = level;
        this.missionName = missionName;
    }
}
