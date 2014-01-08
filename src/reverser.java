import java.util.*;


public class reverser
{

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    String str = new String("This is a string");
    System.out.println(str);

    Stack st = new Stack();
    
    char[] chars = str.toCharArray();
    
    for(int i = 0; i < chars.length; i++)
    {
      st.push(chars[i]);
    }
    System.out.println("Reversing string");
    
    while (!st.empty())
    {
      System.out.print(st.pop());
    }
    
  }

}
