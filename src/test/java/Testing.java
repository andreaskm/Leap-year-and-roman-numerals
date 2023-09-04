import org.example.SomethingClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testing {

    @Test
    void shouldDoSomething(){
        SomethingClass roman = new SomethingClass();
        //assertEquals(roman.intToRoman(6), "VI");
        //assertEquals(roman.intToRoman(252), "CCLII");
        //assertEquals(roman.intToRoman(873), "DCCCLXXIII");
        //assertEquals(roman.intToRoman(9001), "MMMMMMMMMI");

        assertEquals(roman.romanToInt("CCLII"), 252);

    }
}
