import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

//        ArrayList<Integer> list =new ArrayList<>(5);
//        list.add(20);
//        list.add(1,25);
//        System.out.println(list);

//        int[] arr1= {1,32,8,6,89,32,46,3,45};
//
//
//
//
//        ArrayList<Integer> arr= new ArrayList<>(10);
//
//        Collections.addAll(arr,1,2,3,6,5,9,7,9,1,2,3,98,3,3,1,8);
//
//        System.out.println(arr);
//        Collections.addAll(arr,arr1);
//        System.out.println(arr);

        ArrayList<Integer> list1 = new ArrayList<>();
         Integer[] arr={1,23,65,4854,4545,};
         List<Integer> arr1= Arrays.asList(arr);
        Collections.addAll(list1,arr);
        list1.add(125486654);
        System.out.println(list1);
        System.out.println(list1.size());

        System.out.println(arr.length);


        Integer[] ar={1,25,5,5441};
        List<Integer> l= Arrays.asList(ar);
        Collections.addAll(list1,ar);
        System.out.println(l);
        System.out.println(list1);


        ArrayList<Integer> l1 = new ArrayList<>();
        Collections.addAll(l1,1,265,312584,31254,24,8);

        ArrayList<Integer> l2= new ArrayList<>();
        Collections.addAll(l2,115,8484,54,87,12,4);



        System.out.println(l1);

    }
}
