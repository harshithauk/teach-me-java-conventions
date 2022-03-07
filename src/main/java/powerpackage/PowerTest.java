package powerpackage;

import org.junit.jupiter.api.Test;

public class PowerTest {
    @Test
    public void shouldReturnOneForOneRaisedToOne() {
        assert powerfinder.OF(1,1) == 1;
    }

    @Test
    public void shouldReturnTwoForTwoRaisedToOne() {
        assert powerfinder.OF(2,1) == 2;
    }

    @Test
    public void shouldReturnFourForTwoRaisedToTwo() {
        assert powerfinder.OF(2, 2) == 4;
    }

    @Test
    public void shouldReturnSixForTwoRaisedToThree()
    {
        assert powerfinder.OF(3, 2) == 3*3;
    }

}
