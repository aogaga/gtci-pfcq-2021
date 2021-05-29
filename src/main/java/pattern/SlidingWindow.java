package pattern;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindow {

  public Double[] AverageOfSubarrayOfSizeK(int [] a, int k){
    List<Double> listResult = new ArrayList<>();

    for(int i = 0; i <= a.length - k; i++){

      Double sum = 0.00;

      for(int x = i; x < i+k; x++ ){
        sum = sum + a[x];
      }

      Double average = sum / k;

      listResult.add(average);
    }

    Double[] result = new Double[listResult.size()];
    result = listResult.toArray(result);
    return result;
  }

  public Double[] findAverages(int [] a, int k){
    Double [] result = new Double[a.length -k + 1];
    Double windowSum = 0.00;
    int windowStart  = 0;

    for(int windowEnd = 0; windowEnd < a.length; windowEnd++){
      windowSum = windowSum + a[windowEnd];

      if(windowEnd >= k -1){
        result[windowStart] = windowSum / k;
        windowSum = windowSum - a[windowStart];
        windowStart++;
      }
    }
    return result;
  }

  public Double[] findAv(int [] a, int k){
    List<Double> result = new ArrayList<>();

    int start = k -1;
    int previous = 0;
    Double sum = 0.00;
    for(int i = 0; i < a.length; i++){
      sum = sum + a[i];
      System.out.println(a[i]);
      if(i == k -1){
        result.add((sum/k));

      }

      if(i > k-1){
       sum = sum - a[previous];

       result.add(sum/k);
      }

      previous = i;
    }

    Double [] endResult = new Double[result.size()];
    endResult = result.toArray(endResult);

    return  endResult;
  }

  public  int findMinSubArray(int S, int[] arr){
    ArrayDeque<Integer> combinations = new ArrayDeque<>();

    for(int i = 0; i < arr.length; i++){

      if()
    }

    return combinations.size();
  }




}
