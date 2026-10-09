import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void calculatesTotalExpenses() {
        assertEquals(2000, App.calculateTotal(1200, 800));
    }

    @Test
    void calculatesRemainingMoney() {
        assertEquals(3000, App.calculateRemaining(5000, 2000));
    }

    @Test
    void showsNegativeBalanceWhenOverBudget() {
        assertEquals(-1000, App.calculateRemaining(5000, 6000));
    }
}