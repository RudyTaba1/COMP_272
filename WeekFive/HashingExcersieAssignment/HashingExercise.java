package HashingExcersieAssignment;

import java.util.HashMap;
import java.util.ArrayList;

class HashingExercise {

        /*
       *  
       *
       *  DO NOT FORGET TO PLACE YOUR NAME ABOVE, ALSO
       *  RECALL IF NO VALUES FOUND, RETURNING 0.0 IS NOT
       *  CORRECT. MAKE SURE YOU ARE RETURNING 0.0/0.0
       *  (WHICH RETURNS NOT A NUMBER, or 'NaN').
       */
  public double getAverage(HashMap<Integer, Integer> map,
                           int[] array)
  {
    double NaN = 0.0/0;
    double sum = 0;
    double avg = sum/array.length;
    
    for(int i = 0; i<array.length;i++){
      map.put(i+1, array[i]);
    }

    
    if(array.length == 0 || map.size() == 0){
      return NaN;
      }
      else{
        for(int i = 0; i < array.length; i++){
          if(map.containsKey(array[i])){
            sum += map.get(array[i]);
          }
        }
        if(sum == 0){
          return NaN;
        }
        else{
          return avg;
        }
      
      }


  }


  public ArrayList<String> odd(HashMap<Integer, String> map) {

      ArrayList<String> result = new ArrayList<>();

      /*
       *  YOUR CODE GOES HERE
       */

      return result;
  }


}

