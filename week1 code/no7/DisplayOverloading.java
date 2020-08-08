package over;

public class DisplayOverloading {

public void over(char c)
    {
         System.out.println(c);
    }
    public void over(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
  

  public static void main(String[] args) {
   
   
   
   DisplayOverloading obj = new DisplayOverloading();
       obj.over('a');
       obj.over('a',10);
  
}
}


