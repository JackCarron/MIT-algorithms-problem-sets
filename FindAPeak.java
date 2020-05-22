/* Problem: Given an a array of n Integeregers, find a peak
 * Solution: Divide and conquer, go to the middle of the array numList[n/2]
 * if numList[n/2] is < numList[(n/2 - 1)] => go left to find the peak
 * else if numList[n/2] is < numList[(n/2 + 1)] => go right to find the peak
 * else: peak found numList[n/2] 
 */
import java.io.*; 
import java.util.*; 

public class FindAPeak {

  public static void main(String[] args) {
        System.out.println("TEST");
    }


  public static Integer findPeakDivideAndConquer(ArrayList<Integer> numList) {
    Integer n = numList.size();
    Integer centerPos = n/2;
    Integer leftPos = n/2 - 1;
    Integer rightPos = n/2 + 1;
    Integer peak = divideAndConquer(leftPos, centerPos, rightPos, numList);
    return peak;
  }

  public static Integer divideAndConquer(Integer leftPos, Integer centerPos, Integer rightPos, ArrayList<Integer> numList) {
      if (numList.get(centerPos) < numList.get(leftPos)) {
        divideAndConquer(leftPos-1, centerPos-1, rightPos-1, numList);
      }
      else if (numList.get(centerPos) > numList.get(rightPos)) {
        divideAndConquer(leftPos+1, centerPos+1, rightPos+1, numList);
      }
      return centerPos;
  }
}