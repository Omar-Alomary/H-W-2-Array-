import java.util.Arrays;

public class CountDuplicate {
    public static void main(String[] args) {
        int[]arr={6,2,4,8,8,9,8,9,3,2,7,9,9,2,3,9};
        FindRepeated(arr);
    }
    public static void FindRepeated( int arr[]){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j])
                    count++;
                else
                    break;
            }
            if (count > 1) {
                System.out.println(arr[i] + " Repeated->" + count);
                i += (count - 1); } } }}
