
package aPCorrections.src;

/**
 * Write a description of class Six here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Six
{
    /*Q3 correct calls to checkString*/
    public static int checkString(String[] arr)
    {
        int count = 0;
        for (int k = 0; k < arr.length; k++)
        {
            if (arr[k].length() >= 3)
            {
                count++;
            }
        }
        return count;
    }
    /* the correct way to initialize are
     * checkString(new String[0]); OR
     * String[] str = {"cat", "dog"};
     * checkString(str);
     * 
     * I got this question wrong because I forgot that Arrays in the format
     * name[size] need to be declared with a size, else will not compile
     */

    /*Q4 Change array arr with for loop*/
    public void Q4() {
        int[] arr = {10, 20, 30, 40, 50};
        for(int x = 1; x < arr.length - 1; x++)
        {
            arr[x + 1] = arr[x] + arr[x + 1];
        }
    }

    /*
     * {10, 20, 50, 90, 140}
     * I got this one wrong because I thought the array header started at 0 not 1
     */

    /*Q5 adjust total when traversing array*/
    public void Q5() {
        int[] arr = {4, 3, 2, 1, 0};
        int total = 0;
        for (int k = 0; k <= total; k++)
        {
            if (arr[k] % 2 == 0)
            {
                total += arr[k];
            }
            else
            {
                total -= arr[k];
            }
        }
        System.out.print(total);
    }
    /*
     * correct answer is 1
     * I got this one wrong because I did not add up the total correctly while
     * traversing the array.
     */
}
