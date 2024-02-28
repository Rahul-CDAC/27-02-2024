class Mcalling{
int a;
float b;
char c;
boolean bool;


 Mcalling(){
}
 Mcalling(int a1, float b1, char c1){
 a=a1;
b=b1;
c=c1;


}

public static void main(String args[]){
Mcalling obj = new Mcalling();
Mcalling obj1= new Mcalling(2,2.2f,'r');


obj.addNumber(500);
obj1.addNumber(1000);
}

void addNumber(){
System.out.println(100 +a);
System.out.println(100 +b);
System.out.println(100 +c);
}

void addNumber(int a){
System.out.println(a+b);

}

float addNumber(float a){
return a+50.0f;
}
}