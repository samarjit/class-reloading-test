import example.IExample;


public class MyMain {
  private static IExample example1;
  private static IExample example2;
 
  public static void main(String[] args) throws Exception  {
	  //note the forward slash at the end. It should be there
	  ExampleFactory.CLASSPATHURL = "file:///F:/eclipse/workspace/HTMLProcessor/ClassLoaderTest/bin/";
	  
    example1 = ExampleFactory.newInstance();
 
    while (true) {
      example2 = ExampleFactory.newInstance();
 
      System.out.println("1) " +
        example1.message() + " = " + example1.plusPlus());
      System.out.println("2) " +
        example2.message() + " = " + example2.plusPlus());
      System.out.println();
 
      Thread.currentThread().sleep(3000);
    }
  }
}