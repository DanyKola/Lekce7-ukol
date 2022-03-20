import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {


    @Test
    public void testNasobeni(){
        Main main = new Main();
        main.nasobeni(3,5);
        assertEquals (15,main.nasobeni(3,5) );

    }
    @Test
    public void testNasobeniError(){
        Main main = new Main();
        main.nasobeni(4,5);
        assertEquals (21,main.nasobeni(4,5) );

    }
}

