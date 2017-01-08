public class NinetyNine{
   public static void main(String[] args) {
     int x= 0;
     int y= 0;
    for (x= 99; x>0 ; x = x-1 ) {
       y= (x-1);
      System.out.println( x + " bottles of beer on the wall...take one down... " + y + " bottles of beer on the wall!\n");
    }
    System.out.println("One hell of a hangover!");
  }
}
