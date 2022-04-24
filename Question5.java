import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner start = new Scanner(System.in);
    int times = start.nextInt();
    int count = 0;
    int counts = 0;
    int median = 0;
    ArrayList<Integer> data = new ArrayList<>();
    
    while(count < times) {
      Scanner repeat = new Scanner(System.in);
      int num = repeat.nextInt();
      data.add(num);
      count++;
    }
    
    for(int a = 0; a < data.size(); a++) {
      int counting = 0;
      for(int b = 0; b < data.size(); b++) {
        if(data.get(a) == data.get(b)) {
          counting++;
        }
        else {
          continue;
        }
      }
      if(a == 0) {
        counts = counting;
        median = data.get(a);
      }
      else {
        if(counts < counting) {
          median = data.get(a);
        }
        else {
          continue;
        }
      }
    }
    
    System.out.println(median);
  }
}
