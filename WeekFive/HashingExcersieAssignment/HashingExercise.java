package HashingExcersieAssignment;

import java.util.HashMap;
import java.util.ArrayList;

class HashingExercise {

  /*
   * 
   *
   * DO NOT FORGET TO PLACE YOUR NAME ABOVE, ALSO
   * RECALL IF NO VALUES FOUND, RETURNING 0.0 IS NOT
   * CORRECT. MAKE SURE YOU ARE RETURNING 0.0/0.0
   * (WHICH RETURNS NOT A NUMBER, or 'NaN').
   */
  public double getAverage(HashMap<Integer, Integer> map, int[] array) {
    double sum = 0;
    int NumOfTerms = 0;
    // at first I tired to pass through the elements of the int into the hashmap and
    // then add them to the sum, but it didn't work.
    // I then relised that all the passing through happens in main, and this is what
    // happens when I don't get much sleep
    // the messages for the grader, hope I gave you a little giggle.
    for (int i = 0; i < array.length; i++) {
      if (map.containsKey(array[i])) {
        sum += map.get(array[i]);
        NumOfTerms++;
      }
    }

    if (NumOfTerms == 0) {
      return Double.NaN;
    } else {
      return sum / NumOfTerms;
    }
  }

  /**
   * This method should return an ArrayList with values of the
   * corresponding odd keys.
   * 
   * @param map- the HashMap to be searched
   * @return- values of odd keys in the hashmap
   */
  public ArrayList<String> odd(HashMap<Integer, String> map) {
    // the same thing happened here, and then I fixed it
    ArrayList<String> result = new ArrayList<String>();
    // initally used a for loop, but that caused efficiency issues and would only
    // work half the time.
    for (Integer i : map.keySet()) {
      if (i % 2 != 0) {
        result.add(map.get(i));
      }
    }

    return result;
  }

}

