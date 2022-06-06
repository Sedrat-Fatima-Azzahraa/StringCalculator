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

  @Test
  public void returnTwoIfGivenTwo() {
    StringCalculator sc = new StringCalculator();
    int result = sc.Add("2");
    assertEquals(2, result);
  }

  @Test
  public void returnTwoIfGivenOneCommaOne() {
    StringCalculator sc = new StringCalculator();
    int result = sc.Add("1,1");
    assertEquals(2, result);
  }

  @Test
  public void returnThirtyIfGivenTenCommaTwenty() {
    StringCalculator sc = new StringCalculator();
    int result = sc.Add("10,20");
    assertEquals(30, result);
  }

  @Test
  public void returnThreeIfGivenOneCommaOneCommaOne() {
    StringCalculator sc = new StringCalculator();
    int result = sc.Add("1,1,1");
    assertEquals(3, result);
  }

  @Test
  public void returnSixtyIfGivenTenCommaTwentyCommaThirty() {
    StringCalculator sc = new StringCalculator();
    int result = sc.Add("10,20,30");
    assertEquals(60, result);
  }

  @Test
  public void returnSixIfGivenOneNewLineTwoCommaThree() {
    StringCalculator sc = new StringCalculator();
    int result = sc.Add("1\n2,3");
    assertEquals(6, result);
  }

  @Test
  public void returnThreeIfGivenCustomDelimiterAndOneDelimiterTwo() {
    StringCalculator sc = new StringCalculator();
    int result = sc.Add("//;\n1;2");
    assertEquals(3, result);
  }
}
