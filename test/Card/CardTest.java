package Card;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    Card card;

    @BeforeEach
    void setUp() {
        card = new Card();
    }

    @AfterEach
    void tearDown() {
        card = null;
    }

    @Test
    void testToCheckForUserCardNumber(){
        card.setCardNumber(12345678909877L);
        assertEquals(12345678909877L, card.getCardNumber());
    }

    @Test
    void testToCheckCardLength(){
        card.checkCardLength(12345678909877L);
        assertEquals(14, card.getCardLength());
    }

    @Test
    void testToCheckTheRangeOfTheCardLength(){
        assertThrows(IllegalArgumentException.class, () -> card.setCardNumber(399912727266623L));
    }
}