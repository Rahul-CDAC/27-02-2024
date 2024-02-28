class TwentySevenCons{

   int a;
   float b;
   double c;
   char d;
   boolean bool;
   static int varStatic;
   
    TwentySevenCons(){
      a=100;
      b=100.4f;
      c=100.98;
      d='r';
}
    TwentySevenCons(int a1, float b1, double c1, char d1){
       a=a1;
       b=b1;
       c=c1;
       d=d1;
}

   

    public static void main(String args[]){
   
    TwentySevenCons obj=new TwentySevenCons();
    TwentySevenCons obj1=new TwentySevenCons(20,20.4f,25.8,'n');
    
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


  