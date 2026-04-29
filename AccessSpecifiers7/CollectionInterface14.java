import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import java.util.stream.Stream;

public class CollectionInterface14{
    public static void main(String args[]){

        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(45);
        nums.add(12);
        nums.add(30);

        // We can directly print the collection
        // We don't use indexing here

        for(int n : nums){
            System.out.println(n);
        }

        System.out.println(nums);

        // We can use indexing in List
        List<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(100);
        nums1.add(300);
        nums1.add(450);
        nums1.add(900);

        System.out.println(nums1.get(3));
        System.out.println(nums1.indexOf(300));


        // Set -> Unique elements
        Set<Integer> nums2 = new HashSet<Integer>();
        nums2.add(100);
        nums2.add(300);
        nums2.add(300);
        nums2.add(900);

        for(int n : nums2){
            System.out.println(n);
        }

        // Set doesn't suppoet index value
        
        // Sorted order in Treeset
        Collection<Integer> nums3 = new TreeSet<Integer>();
        nums3.add(100);
        nums3.add(300);
        nums3.add(670);
        nums3.add(900);

        for(int n : nums3){
            System.out.println(n);
        }


        // Maps
        // Unique keys
        // Keys are set, Values are list
        Map<String, Integer> students = new HashMap<>();

        students.put("sonu", 1);
        students.put("Birea", 41);
        students.put("Topi", 78);

        System.out.println(students);
        System.out.println(students.keySet());

        for(String key : students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }

        // Sorting ---

        List<Integer> arr = new ArrayList<>();
        arr.add(49);
        arr.add(16);
        arr.add(57);
        arr.add(32);

        Collections.sort(arr);
        System.out.println(arr);

        // Sort based on their Last Digit
        // create comparator

        Comparator<Integer> com = new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                if(i%10 > j%10) return 1;
                else return -1;
            }
        };
        // /Comparing based on last digit
        Collections.sort(arr, com);
        System.out.println(arr);


        List<Integer> array = Arrays.asList(16, 5, 7, 2);
        int sum = 0;

        for(int n : array){
            if(n%2 == 0) sum += n*2;
        }

        System.out.println(sum);


        // Using the Lambda Function
        array.forEach(n -> System.out.println(n));

        // Stream<Integer> s1 = nums.stream();
        // s1.forEach(n -> System.out.println(n));
    }
}