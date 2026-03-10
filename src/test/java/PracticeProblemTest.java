import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {

   @Test
   @DisplayName("")
   void findTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int[].class, int.class };
         Method method = testClass.getDeclaredMethod("find", cArg);
         // Enter code here
         assertEquals(3, (int) method.invoke(null, new int[] { 0, 1, 2, 3 }, 3));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int[].class, int.class };
         Method method = testClass.getDeclaredMethod("find", cArg);
         // Enter code here
         assertEquals(0, (int) method.invoke(null, new int[] { 0, 1, 2, 3 }, 0));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int[].class, int.class };
         Method method = testClass.getDeclaredMethod("find", cArg);
         // Enter code here
         assertEquals(-1, (int) method.invoke(null, new int[] { 0, 1, 2, 3 }, 10));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int[].class, int.class };
         Method method = testClass.getDeclaredMethod("find", cArg);
         // Enter code here
         assertEquals(-1, (int) method.invoke(null, new int[] {}, 3));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findTest5() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int[].class, int.class };
         Method method = testClass.getDeclaredMethod("find", cArg);
         // Enter code here
         assertEquals(0, (int) method.invoke(null, new int[] { 3, 3, 3, 3 }, 3));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findLastTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String[].class, String.class };
         Method method = testClass.getDeclaredMethod("findLast", cArg);
         // Enter code here
         assertEquals(3, (int) method.invoke(null, new String[] { "0", "1", "2", "3" }, "3"));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findLastTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String[].class, String.class };
         Method method = testClass.getDeclaredMethod("findLast", cArg);
         // Enter code here
         assertEquals(0, (int) method.invoke(null, new String[] { "0", "1", "2", "3" }, "0"));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findLastTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String[].class, String.class };
         Method method = testClass.getDeclaredMethod("findLast", cArg);
         // Enter code here
         assertEquals(-1, (int) method.invoke(null, new String[] { "0", "1", "2", "3" }, "adjfkls"));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findLastTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String[].class, String.class };
         Method method = testClass.getDeclaredMethod("findLast", cArg);
         // Enter code here
         assertEquals(-1, (int) method.invoke(null, new String[] {}, "Help"));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findLastTest5() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String[].class, String.class };
         Method method = testClass.getDeclaredMethod("findLast", cArg);
         // Enter code here
         assertEquals(3, (int) method.invoke(null, new String[] { "3", "3", "3", "3" }, "3"));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findSecondTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { char[].class, char.class };
         Method method = testClass.getDeclaredMethod("findSecond", cArg);
         // Enter code here
         assertEquals(3, (int) method.invoke(null, new char[] { '0', '1', '2', '3' }, '3'));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findSecondTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { char[].class, char.class };
         Method method = testClass.getDeclaredMethod("findSecond", cArg);
         // Enter code here
         assertEquals(2, (int) method.invoke(null, new char[] { '0', '2', '2', '3' }, '2'));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findSecondTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { char[].class, char.class };
         Method method = testClass.getDeclaredMethod("findSecond", cArg);
         // Enter code here
         assertEquals(-1, (int) method.invoke(null, new char[] { '0', '1', '2', '3' }, 'a'));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findSecondTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { char[].class, char.class };
         Method method = testClass.getDeclaredMethod("findSecond", cArg);
         // Enter code here
         assertEquals(-1, (int) method.invoke(null, new char[] {}, '3'));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findSecondTest5() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { char[].class, char.class };
         Method method = testClass.getDeclaredMethod("findSecond", cArg);
         // Enter code here
         assertEquals(1, (int) method.invoke(null, new char[] { '3', '3', '3', '3' }, '3'));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findAllTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { double[].class, double.class };
         Method method = testClass.getDeclaredMethod("findAll", cArg);
         // Enter code here
         assertArrayEquals(new int[]{0, 2}, (int[])method.invoke(null, new double[] { 3.3, 3.5, 3.3, 3.2 }, 3.3));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findAllTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { double[].class, double.class };
         Method method = testClass.getDeclaredMethod("findAll", cArg);
         // Enter code here
         assertArrayEquals(new int[]{}, (int[]) method.invoke(null, new double[] { 3.3, 3.5, 3.3, 3.2 }, 3.4));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findAllTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { double[].class, double.class };
         Method method = testClass.getDeclaredMethod("findAll", cArg);
         // Enter code here
         assertArrayEquals(new int[]{3}, (int[]) method.invoke(null, new double[] { 3.3, 3.5, 3.3, 3.2 }, 3.2));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findAllTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { double[].class, double.class };
         Method method = testClass.getDeclaredMethod("findAll", cArg);
         // Enter code here
         assertArrayEquals(new int[]{}, (int[]) method.invoke(null, new double[] {}, 3.3));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findAllTest5() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { double[].class, double.class };
         Method method = testClass.getDeclaredMethod("findAll", cArg);
         // Enter code here
         assertArrayEquals(new int[]{1, 4, 9}, (int[]) method.invoke(null, new double[] { 3.3, 0.0, 3.5, 3.3, 0.0, 3.2, 5.5, 3.2, 4.2, 0.0 }, 0.0));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }
}
