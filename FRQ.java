
/**
 * Write a description of class run here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FRQ
{
    public static boolean isSelfDivisor(int number) { 
        int digits = 0;
        while (digits > 0) {
         int digit = (digits % number/10);
         if (digit == 0 || digits % digit = 0) {
             return false; 
         }
         number /= 10;
       }
        return true; 
      }
      
    public static int[] firstNumSelfDivisors(int start, int num) {
        int[] result = new int[num];
        int current = start;
        int count = 0;
        if (isSelfDivisor(start) == true)
        while (count < num) {
            if (isSelfDivisor(current)) {
                result[count] = current;
                count++;
            }
            current++;
        }
        return result;
    }
}

