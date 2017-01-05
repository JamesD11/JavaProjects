public class ThirdProgram{
   public static void main(String[] args) {
    int x= 3;
    String name= "James";
    x = x * 17;
    System.out.println("x is equal to " + x);
    double d= Math.random();
    //comment
    while (x > 11){
      x= x-1;
    }
    for (x= 0; x<11 ; x = x+1 ) {
      System.out.println("x is now " + x + "\n");

    if (x ==10){
      System.out.println( "x is finally 10! \n");
    }else {
      System.out.println("x isnt 10 \n");
    }
    if ((x<3) & (name.equals("James"))){
      System.out.println("James will be a Java master sooner rather than later\n");
    }

    }
    System.out.println("This runs no matter what\n");
  }
}
