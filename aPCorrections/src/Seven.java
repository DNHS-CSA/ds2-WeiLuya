//
package aPCorrections.src;
import java.util.*;

/**
 * Write a description of class Seven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Seven
{
    /*Q2 create ArrayList object to hold Integers*/
    public static void Q2() {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> numbers2 =new ArrayList();
    }
    /*
     * I just need to review arrayList syntax and how to declare.
     */

    /*Q13 change to loop header in sequentialSearch method*/
    public static int sequentialSearch(ArrayList<Integer> elements, int target)
    {
        for (int j = 0; j < elements.size(); j++)     // Line 3
        {   //(int j = (elements.size() - 1); j >= 0; j--)
            if (elements.get(j) == target)
            {
                return j;
            }
        }
        return -1;
    }
    /*
     * The modified method will return the index of the last appearance of the target value in the list, or -1 if the target value does not appear in the list.
     * I got this wrong becasue I incorrectly assumed that all elements of the 
     * array would be unique
     */

    /*Q14 change to value returned by search method*/
    public static int search(int[] arr, int target)
    {
        int result = -1;
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] == target)
            {
                result = j;  // Line 8
            }
        }
        return result;
    }
    /*
     * misread the question, should have gotten this one correct
     */

    /*Q15 modification to sequential search method*/
    public int seqSearch(int[] arr, int target)

    {
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] == target)
            {
                return j;
            }
        }
        return -1;
    }

    public int seqSearch2(int[] arr, int target)
    {
        for (int j : arr)
        {
            if (j == target)
            {
                return j;
            }
        }
        return -1;
    }
    /*
     * The modification in seqSearch2 will cause the value of target to be returned instead of the index of target in cases where target appears in arr.
     * I got this wrong because I didn't understand for-each loops
     */
}
