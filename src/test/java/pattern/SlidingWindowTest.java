package pattern;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SlidingWindowTest {

  private SlidingWindow sw;
  @BeforeEach
  void setUp() {
    sw = new SlidingWindow();
  }

  @Test
  void averageOfSubarrayOfSizeK() {
    int [] a = { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
    Double[] result = sw.AverageOfSubarrayOfSizeK(a, 5);
    assertEquals("[2.2, 2.8, 2.4, 3.6, 2.8]", Arrays.toString(result));
  }


  @Test
  void testfindAv(){
    int [] a = { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
    Double[] result = sw.findAv(a, 5);
    assertEquals("[2.2, 2.8, 2.4, 3.6, 2.8]", Arrays.toString(result));
  }
}