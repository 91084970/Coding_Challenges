/*
 * Author: Morelia
 * Created: 9/21/17
 * Description: Three parts to this problem: 
1)Print the integers 0 through 9 to the console. They must be on the same line!
2)Print a blank line
3)Print the integers 1 through 10 to the console. They must be on the same line!
 * 
 * 
 */
public class Ch004
{
  public static void main(String[] args)
  {
    //1) Print the integers 0 through 9 to the console. They must be on the same line!
    for (int i = 0; i < 10; i++)
    {
      System.out.println(i + "");
    }
    // 2) Print a blank line
    System.out.println("\n");
    // 3)Print the integers 1 through 10 to the console. They must be on the same line!
    for (int i = 1; i < 11; i++)
    {
      System.out.println(i + "");
    }
  }
}
