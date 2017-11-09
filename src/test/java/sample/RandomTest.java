package test.java.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import org.junit.jupiter.api.Test;

/**
 * Created by aziring on 10/9/17.
 */
public class RandomTest {


  @Test
  public void findDuplicate() {
    List<Integer> numbers = new ArrayList<Integer>();
    for(int i=1;i<30;i++){
      numbers.add(i);
    }
    //add duplicate number into the list
    numbers.add(22);

    int highestNumber = numbers.size() - 1;
    int total = getSum(numbers);
    int duplicate = total - (highestNumber*(highestNumber+1)/2);

    System.out.println("Duplicate Number: "+duplicate);
  }

  private int getSum(List<Integer> numbers){

    int sum = 0;
    for(int num:numbers){
      sum += num;
    }
    return sum;
  }

  @Test
  public void sortStack() {
    Stack<Integer> input = new Stack<Integer>();
    input.add(34);
    input.add(3);
    input.add(31);
    input.add(98);
    input.add(92);
    input.add(23);

    Stack<Integer> tmpStack = new Stack<Integer>();
    while(!input.isEmpty()) {
      int tmp = input.pop();
      while(!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
        input.push(tmpStack.pop());
      }
      tmpStack.push(tmp);
    }
  }

  @Test
  public void bubbleSort() {
    int[] input = {5, 2, 8, 12, 76, 21, 2};
    int k;
    int arrayLength = input.length;

    for(int i=arrayLength; i>=0; i--) {
      for (int n = 0; n < arrayLength - 1; n++) {
        k=n+1;
        if (input[n] > input[k]) {
          swapNumbers(n, k, input);
        }
      }
      for (int j=0; j<input.length;j++) {
        System.out.print(input[j] + ",");
      }
      System.out.println();
    }

  }

  private void swapNumbers(int i, int j, int[] array) {
    int temp;
    temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  @Test
  public void printFibonacci() {
    int febCount = 15;
    int[] feb = new int[febCount];
    feb[0] = 0;
    feb[1] = 1;
    for(int i=2; i < febCount; i++){
      feb[i] = feb[i-1] + feb[i-2];
    }

    for(int i=0; i< febCount; i++){
      System.out.print(feb[i] + " ");
    }
  }

  @Test
  public void sortMap() {
    Map<String, Integer> myMap = new HashMap<>();
    myMap.put("English", 120);
    myMap.put("Social Studies", 104);
    myMap.put("Science", 45);
    myMap.put("Math", 112);

    Comparator<Entry<String, Integer>> myMapValueSort = new Comparator<Entry<String, Integer>>() {
      @Override
      public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
        return o1.getValue().compareTo(o2.getValue());
      }
    };

    Comparator<Map.Entry<String, Integer>> myMapKeySort = new Comparator<Entry<String, Integer>>() {
      @Override
      public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
        return o1.getKey().compareTo(o2.getKey());
      }
    };

    Set<Entry<String, Integer>> set = myMap.entrySet();
    List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
    Collections.sort(list, myMapValueSort);

    System.out.println("Sort by Value");
    for (Map.Entry<String, Integer> entry : list) {
      System.out.println(entry.getKey() + " = " + entry.getValue());
    }

    list = new ArrayList<Entry<String, Integer>>(set);
    Collections.sort(list, myMapKeySort);

    System.out.println();
    System.out.println("Sort By Key");
    for (Map.Entry<String, Integer> entry : list) {
      System.out.println(entry.getKey() + " = " + entry.getValue());
    }
  }

  @Test
  public void decimalToBinary() {
    Queue<Integer> binaryStack = new LinkedList<>();

    int decimal = 22;
    while (decimal > 0) {
      int rem = decimal%2;
      binaryStack.add(rem);
      decimal/=2;
    }

    String binaryStr = "";
    while(binaryStack.peek() != null) {
      binaryStr = binaryStr + binaryStack.remove();
    }

    System.out.println("Binary String : " + binaryStr);
  }

  @Test
  public void howBigisAnInt() {

    List<String> intStrList = new ArrayList<>();
    intStrList.add("32768");
    intStrList.add("999999");
    intStrList.add("99999999");
    intStrList.add("999999999");
    intStrList.add("2147483649");
    intStrList.add("16000000");
    intStrList.add("29633918040");

    for (String s : intStrList) {
      System.out.print("s: ");
      System.out.println(new Integer(s).intValue());
    }

  }


  @Test
  public void reverseStringWithRecursion() {

    /*public static class ReverseString {

      String reverse = "";
      public String reverseString(String str) {
        if (str.length() == 1) {
          return str;
        } else {
          reverse += str.charAt(str.length()-1) +
              reverseString(str.substring(0, str.length()-1));
          return reverse;
        }
      };
      String strToReverse = "legitimate";
     // System.out.println("Reversed String: " + ReverseString.(strToReverse));
    } */
  }

}
