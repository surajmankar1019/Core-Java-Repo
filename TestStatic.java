public class TestStatic
{
   static int x=10;

   public static void main(String args[])
   {
      TestStatic ts=new TestStatic();
      System.out.println(ts.x);  // valid
      System.out.println(TestStatic.x);  // valid  
      System.out.println(x);
                                        
   }
}