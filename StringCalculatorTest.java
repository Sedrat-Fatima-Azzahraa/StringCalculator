import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
  @Test
  public void returnZeroIfEmpty() {
    StringCalculator sc = new StringCalculator();
    int result = sc.Add("");
    assertEquals(0, result);
  }

  @Test
  public void returnOneIfGivenOne() {
    StringCalculator sc = new StringCalculator();
    int result = sc.Add("1");
    assertEquals(1, result);
  }
}
