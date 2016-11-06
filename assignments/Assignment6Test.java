import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import org.junit.Test;

/**
 * Tests for Assignment6.
 *
 * Remember, extra test cases are 1 point extra each up to 20 points.
 */
public class Assignment6Test {
    private static final Random random = new Random();


    // enumerateDivisibleBy3()

    @Test
    public void testEnumerateDivisibleBy3First3() {
        HashMap<Integer, Boolean> result = Assignment6.enumerateDivisibleBy3();
        assertTrue(result.containsKey(1));
        assertEquals(false, result.get(1));
        assertTrue(result.containsKey(2));
        assertEquals(false, result.get(2));
        assertTrue(result.containsKey(3));
        assertEquals(true, result.get(3));
    }

    @Test
    public void testEnumerateDivisibleBy3Other3() {
        HashMap<Integer, Boolean> result = Assignment6.enumerateDivisibleBy3();
        assertTrue(result.containsKey(15));
        assertEquals(true, result.get(15));
        assertTrue(result.containsKey(17));
        assertEquals(false, result.get(17));
        assertTrue(result.containsKey(18));
        assertEquals(true, result.get(18));
    }





    // hasAtLeast10Distinct()

    @Test
    public void testHasAtLeast10DistinctBasicFalse() {
        String s = "assignments";
        assertFalse(Assignment6.hasAtLeast10Distinct(s));
    }

    @Test
    public void testHasAtLeast10DistinctBasicTrue() {
        String s = "thequickbrownfoxjumpedoverthelazydog";
        assertTrue(Assignment6.hasAtLeast10Distinct(s));
    }





    // countAsBsandCs()

    @Test
    public void testCountAsBsandCsBasic() {
        HashMap<Character, Integer> counts =
            Assignment6.countAsBsandCs("AC AC C");
        assertTrue(counts.containsKey('A'));
        assertFalse(counts.containsKey('B'));
        assertTrue(counts.containsKey('C'));
        assertEquals(new Integer(2), counts.get('A'));
        assertEquals(new Integer(3), counts.get('C'));
    }

    @Test
    public void testCountAsBsandCsWord() {
        HashMap<Character, Integer> counts =
            Assignment6.countAsBsandCs("AlphaBet");
        assertTrue(counts.containsKey('A'));
        assertTrue(counts.containsKey('B'));
        assertFalse(counts.containsKey('C'));
        assertEquals(new Integer(1), counts.get('A'));
        assertEquals(new Integer(1), counts.get('B'));
    }

    @Test
    public void testCountAsBsandCsOtherCharsExcluded() {
        HashMap<Character, Integer> counts =
            Assignment6.countAsBsandCs("AllBetCha");
        assertTrue(counts.containsKey('A'));
        assertTrue(counts.containsKey('B'));
        assertTrue(counts.containsKey('C'));
        assertFalse(counts.containsKey('l'));
        assertFalse(counts.containsKey('e'));
        assertFalse(counts.containsKey('t'));
        assertFalse(counts.containsKey('h'));
        assertFalse(counts.containsKey('a'));
        assertEquals(new Integer(1), counts.get('A'));
        assertEquals(new Integer(1), counts.get('B'));
        assertEquals(new Integer(1), counts.get('C'));
    }






    // compressCoinTosses()

    @Test
    public void testCompressCoinTossesBasic() {
        assertEquals("H3T5", Assignment6.compressCoinTosses("HHHTTTTT"));
    }

    @Test
    public void testCompressCoinTossesLonger() {
        assertEquals("H3T5H2T1H1T6",
                Assignment6.compressCoinTosses("HHHTTTTTHHTHTTTTTT"));
    }

    @Test
    public void testCompressCoinTossesSingleBoth() {
        assertEquals("T1H1", Assignment6.compressCoinTosses("TH"));
    }

    @Test
    public void testCompressCoinTossesAlternating() {
        assertEquals("H1T1H1T1H1T1H1",
                Assignment6.compressCoinTosses("HTHTHTH"));
    }





    // createZipLookup()

    @Test
    public void testCreateZipLookupBasic() {
        ArrayList<String> zipCodes = new ArrayList<String>();
        ArrayList<String> cities = new ArrayList<String>();
        zipCodes.add("12345");
        zipCodes.add("67890");
        cities.add("Springfield, MN");
        cities.add("Gary, IN");

        HashMap<String, String> result =
            Assignment6.createZipLookup(zipCodes, cities);
        assertEquals(2, result.size());
        assertTrue(result.containsKey("12345"));
        assertTrue(result.containsKey("67890"));
        assertEquals("Springfield, MN", result.get("12345"));
        assertEquals("Gary, IN", result.get("67890"));
    }

    @Test
    public void testCreateZipLookupFive() {
        ArrayList<String> zipCodes = new ArrayList<String>();
        ArrayList<String> cities = new ArrayList<String>();
        zipCodes.add("12345");
        zipCodes.add("67890");
        zipCodes.add("44444");
        zipCodes.add("99999");
        zipCodes.add("83234-5823");
        cities.add("Springfield, MN");
        cities.add("Gary, IN");
        cities.add("Maui, HI");
        cities.add("Test, FAKE");
        cities.add("Foo, BAR");

        HashMap<String, String> result =
            Assignment6.createZipLookup(zipCodes, cities);
        assertEquals(5, result.size());
        assertTrue(result.containsKey("12345"));
        assertTrue(result.containsKey("67890"));
        assertTrue(result.containsKey("44444"));
        assertTrue(result.containsKey("99999"));
        assertTrue(result.containsKey("83234-5823"));
        assertEquals("Springfield, MN", result.get("12345"));
        assertEquals("Gary, IN", result.get("67890"));
        assertEquals("Maui, HI", result.get("44444"));
        assertEquals("Test, FAKE", result.get("99999"));
        assertEquals("Foo, BAR", result.get("83234-5823"));
    }






    // allValidWords()

    @Test
    public void testAllValidWordsBasic() {
        HashSet<String> dict = new HashSet<String>();
        dict.add("hello");
        dict.add("world");
        assertTrue(Assignment6.allValidWords("hello world", dict));
        assertTrue(Assignment6.allValidWords("world hello", dict));
        assertTrue(Assignment6.allValidWords("world hello world world", dict));
        assertTrue(Assignment6.allValidWords("hello", dict));
        assertTrue(Assignment6.allValidWords("world", dict));
        assertFalse(Assignment6.allValidWords("hello world fisk", dict));
        assertFalse(Assignment6.allValidWords("test hello world", dict));
        assertFalse(Assignment6.allValidWords("foo hello world bar", dict));
    }

    @Test
    public void testAllValidWordsAFew() {
        HashSet<String> dict = new HashSet<String>();
        dict.add("foo");
        dict.add("bar");
        dict.add("baz");
        dict.add("a");
        dict.add("b");
        dict.add("c");
        assertTrue(Assignment6.allValidWords("foo", dict));
        assertTrue(Assignment6.allValidWords("foo bar a", dict));
        assertTrue(Assignment6.allValidWords("bar baz baz bar b", dict));
        assertTrue(Assignment6.allValidWords("bar foo foo", dict));
        assertTrue(Assignment6.allValidWords("baz baz a b c b a b c a b c", dict));
        assertFalse(Assignment6.allValidWords("hello world", dict));
        assertFalse(Assignment6.allValidWords("a b c d", dict));
        assertFalse(Assignment6.allValidWords("d b c a", dict));
        assertFalse(Assignment6.allValidWords("food bar", dict));
    }





    // countCities()

    @Test
    public void testCountCitiesSingle() {
        HashMap<String, ArrayList<String>> stateToCities =
            new HashMap<String, ArrayList<String>>();
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Stockholm");
        cities.add("Huddinge");
        cities.add("Solna");
        stateToCities.put("Sweden", cities);

        HashMap<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("Sweden", 3);

        assertEquals(expected, Assignment6.countCities(stateToCities));
    }

    @Test
    public void testCountCitiesDouble() {
        HashMap<String, ArrayList<String>> stateToCities =
            new HashMap<String, ArrayList<String>>();
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Stillwater");
        cities.add("Norman");
        cities.add("Tulsa");
        ArrayList<String> cities2 = new ArrayList<String>();
        cities2.add("Dallas");
        stateToCities.put("Oklahoma", cities);
        stateToCities.put("Texas", cities2);

        HashMap<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("Oklahoma", 3);
        expected.put("Texas", 1);

        assertEquals(expected, Assignment6.countCities(stateToCities));
    }





    // sort()

    @Test
    public void testSortSingle() {
        Assignment6.Dog d = new Assignment6.Dog(10.0);
        Assignment6.Dog[] orig = {d};
        Assignment6.Dog[] expected = {d};
        Assignment6.sort(orig);
        assertArrayEquals(expected, orig);
    }

    @Test
    public void testSortTwo() {
        Assignment6.Dog d = new Assignment6.Dog(10.0);
        Assignment6.Dog d2 = new Assignment6.Dog(20.0);
        Assignment6.Dog[] orig = {d, d2};
        Assignment6.Dog[] expected = {d2, d};
        Assignment6.sort(orig);
        assertArrayEquals(expected, orig);
    }

    @Test
    public void testSortFive() {
        Assignment6.Dog[] orig = {
            new Assignment6.Dog(10.0),
            new Assignment6.Dog(20.0),
            new Assignment6.Dog(10.0),
            new Assignment6.Dog(40.0),
            new Assignment6.Dog(80.0)};
        Assignment6.Dog[] expected = {
            new Assignment6.Dog(80.0),
            new Assignment6.Dog(40.0),
            new Assignment6.Dog(20.0),
            new Assignment6.Dog(10.0),
            new Assignment6.Dog(10.0)};
        Assignment6.sort(orig);
        assertArrayEquals(expected, orig);
    }

    @Test
    public void testSortNegative() {
        Assignment6.Dog[] orig = {
            new Assignment6.Dog(10.0),
            new Assignment6.Dog(-20.0),
            new Assignment6.Dog(10.0),
            new Assignment6.Dog(-40.0),
            new Assignment6.Dog(-80.0)};
        Assignment6.Dog[] expected = {
            new Assignment6.Dog(10.0),
            new Assignment6.Dog(10.0),
            new Assignment6.Dog(-20.0),
            new Assignment6.Dog(-40.0),
            new Assignment6.Dog(-80.0)};
        Assignment6.sort(orig);
        assertArrayEquals(expected, orig);
    }

    @Test
    public void testSortMix() {
        Assignment6.Dog[] orig = {
            new Assignment6.Dog(10.0),
            new Assignment6.Dog(20.0),
            new Assignment6.Dog(-30.0),
            new Assignment6.Dog(40.0),
            new Assignment6.Dog(-50.0)};
        Assignment6.Dog[] expected = {
            new Assignment6.Dog(40.0),
            new Assignment6.Dog(20.0),
            new Assignment6.Dog(10.0),
            new Assignment6.Dog(-30.0),
            new Assignment6.Dog(-50.0)};
        Assignment6.sort(orig);
        assertArrayEquals(expected, orig);
    }





    // dumbHash()
    // uncomment to test extra credit

    /*
    @Test
    public void testDumbHashBasic() {
        assertEquals(116, Assignment6.dumbHash("hello"));
    }

    @Test
    public void testDumbHashBasic2() {
        assertEquals(266, Assignment6.dumbHash("hello world!"));
    }

    @Test
    public void testDumbHashPunctuation() {
        assertEquals(184, Assignment6.dumbHash("!@#$%^&*()"));
    }

    */

}
