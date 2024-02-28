class TwentySevenObject{

   int a;
   float b;
   double c;
   char d;
   boolean bool;
   static int varStatic;

   public static void main(String args[]){
   
    TwentySevenObject obj=new TwentySevenObject();
    
    float b;
    System.out.println("default int value of a is : "+obj.a);
    System.out.println("default float value of b is : "+obj.b);
    System.out.println("default double value of c is : "+obj.c);
    System.out.println("default character value of d is : "+obj.d);
    System.out.println("default boolean value of boolean is : "+obj.bool);


    float varStatic=200;
    System.out.println("default value of int var static is:"+varStatic);
}
}


  