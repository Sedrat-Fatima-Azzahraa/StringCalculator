import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StringCalculatorTest {
  @Test
  public void returnZeroIfEmpty() throws Exception {
    StringCalculator sc = new StringCalculator();
    int result = sc.Add("");
    assertEquals(0, result);
  }

  @Test
  public void returnOneIfGivenOne() throws Exception {
    StringCalculator sc = new StringCalculator();
    int result = sc.Add("1");
    assertEquals(1, result);
  }

  @Test
  public void returnTwoIfGivenTwo() throws Exception {
    StringCalculator sc = new StringCalculator();
    int result = sc.Add("2");
    assertEquals(2, result);
  }

  @Test
  public void returnTwoIfGivenOneCommaOne() throws Exception {
    StringCalculator sc = new StringCalculator();
    int result = sc.Add("1,1");
    assertEquals(2, result);
  }

  @Test
  public void returnThirtyIfGivenTenCommaTwenty() throws Exception {
    StringCalculator sc = new StringCalculator();
    int result = sc.Add("10,20");
    assertEquals(30, result);
  }

  @Test
  public void returnThreeIfGivenOneCommaOneCommaOne() throws Exception {
    StringCalculator sc = new StringCalculator();
    int result = sc.Add("1,1,1");
    assertEquals(3, result);
  }

  @Test
  public void returnSixtyIfGivenTenCommaTwentyCommaThirty() throws Exception {
    StringCalculator sc = new StringCalculator();
    int result = sc.Add("10,20,30");
    assertEquals(60, result);
  }

  @Test
  public void returnSixIfGivenOneNewLineTwoCommaThree() throws Exception {
    StringCalculator sc = new StringCalculator();
    int result = sc.Add("1\n2,3");
    assertEquals(6, result);
  }

  @Test
  public void returnThreeIfGivenCustomDelimiterAndOneDelimiterTwo() throws Exception {
    StringCalculator sc = new StringCalculator();
    int result = sc.Add("//;\n1;2");
    assertEquals(3, result);
  }

  @Test
  public void throwsExceptionIfGivenNegativeNumbers() throws Exception {
    StringCalculator sc = new StringCalculator();
    try {
      int result = sc.Add("//;\n1;-2;3;-4");
    } catch (Exception e) {
      assertEquals("negatives not allowed: -2, -4." ,e.getMessage());
      return ;
    }
    fail("StringCalculator Add method did not throw exception on negative numbers.");
  }
}
