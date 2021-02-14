//package Tasks;

import java.util.Arrays;

public class ScoreBoard {

     private int numEntry = 0 ;
     private int lastRemoved = -1;
     private int [] board = new int[5];


    public void add(int elem){
        // not removed any item yet.
         if (lastRemoved == -1){
             board[numEntry++] = elem;  // add to the last place.

         }else {
             board[lastRemoved] = elem;  // has some free place for it.
             lastRemoved = -1;
         }
     }

     public void remove(int index) throws IndexOutOfBoundsException{
         if (index >= numEntry || index < 0){
             throw new IndexOutOfBoundsException("Invalid index: " + index);
         }
         board[index] = 0;
         lastRemoved = index;  // save the index for new entry.
     }
    public static void main(String[] args) {
        ScoreBoard sb = new ScoreBoard();
        sb.add(3);
        sb.add(4);
        sb.add(5);

        System.out.println(Arrays.toString(sb.board));
        sb.remove(1);

        System.out.println(Arrays.toString(sb.board));
        sb.add(9);

        System.out.println(Arrays.toString(sb.board));
        sb.add(50);

        System.out.println(Arrays.toString(sb.board));
    }
}
