import java.util.Scanner;

public class GameEntry {
    private String name;
    private int score;
    public GameEntry(String name, int score){

    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "GameEntry{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
   public static class Scoreboard {
       private int numEntries = 0;
       private GameEntry[] board;

       public Scoreboard(int capacity) {
           board = new GameEntry[capacity];
       }


       public void add(GameEntry e) {
           int newScore = e.getScore();
           if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
               if (numEntries < board.length)
                   numEntries++;
               int j = numEntries - 1;
               while (j > 0 && board[j - 1].getScore() < newScore) {
                   board[j] = board[j - 1];
                   j--;
               }
               board[j] = e;
           }
       }

       public GameEntry remove(int i) throws IndexOutOfBoundsException {
           if (i < 0 || i >= numEntries)
               throw new IndexOutOfBoundsException("Invalid index:"+i);
           GameEntry temp=board[i];
           for (int j = i; j < numEntries-1; j++) {
               board[j]=board[j+1];
               board[numEntries-1]=null;
               numEntries--;
               return temp;

           }
           return temp;
       }



       public static void main(String[] args) {
           GameEntry g=new GameEntry("omar",11);

           System.out.println(g.toString());
           Scoreboard s=new Scoreboard(12);
           Scanner f=new Scanner(System.in);









       }



   }











}
