import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.numberSquares.services.SQRService;

public class SQRServiceTest {

    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqr(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExactOtherLimit() {
        SQRService service = new SQRService();

        int expected = 7;
        int actual = service.calcSqr(100, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcOtherBorders() {
        SQRService service = new SQRService();

        int expected = 22;
        int actual = service.calcSqr(50, 1000);

        Assertions.assertEquals(expected, actual);
    }
}



