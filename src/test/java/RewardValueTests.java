import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cash = 50;
        int Miles = 14285;
        var rewardValue = new RewardValue(cash);
        assertEquals(Miles, rewardValue.getMilesValue());

    }

    @Test
    void convert_from_miles_to_cash() {
        double cash = 149.9995;
        int Miles = 42857;
        var rewardValue = new RewardValue(Miles);
        assertEquals(cash, rewardValue.getCashValue());
    }
}
