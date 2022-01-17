package day05;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StringStatisticsTest {

    @Test
    void testCountCharacterNumberPerCharacter() {
        StringStatistics stringStatistics = new StringStatistics();
        Map<Character, Integer> result = stringStatistics.countCharacterNumberPerCharacter("almafa-ALMAFA");
        assertEquals(3, result.get('a'));
        assertEquals(3, result.get('A'));
    }

}