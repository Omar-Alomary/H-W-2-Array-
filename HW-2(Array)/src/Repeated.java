

public class Repeated {
    int[]arr={3,4,3,2,6,7,2,3,9};
    public  void FindRepeated( ){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                   System.out.println("the repeated element is  "+arr[j] ); } } } }
    public static void main(String[] args) {
        Repeated R = new Repeated();
       R.FindRepeated(); }}

