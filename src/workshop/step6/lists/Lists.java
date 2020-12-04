package workshop.step6.lists;

import java.util.*;
import java.util.stream.Collectors;

public class Lists {

    public static void main(String[] args) {
        //import java.util.ArrayList;
        //ArrayList<int> intList = new ArrayList<>();
        /*
            int => Integer
            long => Long
            double => Double
            String => ?
         */
        //Initialize
        ArrayList<Integer> intList = new ArrayList<>();
        List<Integer> intList2 = new ArrayList<>();

        //Add
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        for (int i = 1; i <= 10; i++){
            intList2.add(i);
        }
        //Size
        System.out.println("intList2.size(): " + intList2.size());

        //Get
        for (Integer i : intList){
            System.out.println(i);
        }

        for (int i = 0; i < intList2.size(); i++){
            System.out.println("intList2[" + i + "]: " + intList2.get(i));
        }

        intList.set(0, 10);
        for (int i = 0; i < intList2.size(); i++){
            if ((i+1) % 2 == 0){
                intList2.set(i, intList2.get(i) * 10);
            }
        }
        System.out.println(intList2);

        //Remove
        System.out.println("intList before removing: " + intList);
        intList.remove(0);
        System.out.println("intList size after remove an element: " + intList.size());
        intList.clear();
        System.out.println("intList size after clear: " + intList.size());

        //Sort
        System.out.println("intList before ordered: " + intList2);
        intList2.sort(Collections.reverseOrder());
        System.out.println("intList reversed: " + intList2);
        intList2.sort(Comparator.naturalOrder());
        //Collections.sort(intList2);
        System.out.println("intList ordered: " + intList2);

        //Find the index
        System.out.println("The index of element 100: " + intList2.indexOf(100));



        /*List<Integer> aList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> bList = aList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

        System.out.println("aList.map (string.length): " + aList + " -> " +bList);
*/
        List<List<Integer>> aList = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6));
        List<Integer> bList = aList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());

        System.out.println("aList.flatMap -> " + aList + " -> " +bList);
    }
}
