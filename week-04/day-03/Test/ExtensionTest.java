import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  void testAdd_2and4is6() {
    assertEquals(6, extension.add(2, 4));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  void testMaxOfThree_second() {
    assertEquals(5, extension.maxOfThree(3, 5, 1));
  }

  @Test
  void testMedian_four() {
    assertEquals(5, extension.median(Arrays.asList(7, 5, 3, 5)));
  }

  @Test
  void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(1, 2, 3, 4, 5)));
  }

  @Test
  void testMedian_alot() {
    assertEquals(50, extension.median(Arrays.asList(10, 20, 30, 40, 50, 80, 90, 100, 200)));
  }

  @Test
  void testMedian_alot2() {
    assertEquals(45, extension.median(Arrays.asList(1, 10, 20, 30, 40, 50, 80, 90, 100, 200)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_kolbice() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }

  @Test
  void testTranslate_kolbice2() {
    assertEquals("mevegeveszevem", extension.translate("megeszem"));
  }
}