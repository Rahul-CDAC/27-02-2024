
class Demo2{

	int a;	
	float b;
	char c;
	boolean bool;   // instance variable 

	static int varStatic;  // static varible 


	Demo2(){ 
		a = 100;
		b = 100.0f;
		c = 'a';
	}
	
	Demo2(int a1, float b1, char c1){
		a = a1;
		b = b1;
		c = c1;
	}
	
		
	
	public static void main(String args[]){
	
		
		Demo2 obj = new Demo2();
		Demo2 obj1 = new Demo2(2,2.2f,'b');

		float b;  
		System.out.println(obj.a + " Default value of int var a ");
		System.out.println(obj.b + " Default value of float var b ");
		System.out.println(obj.c + "Default value of float var c ");
		System.out.println(obj.bool + " Default value of boolean var b ");
		System.out.println(varStatic + " Default value of Int varStatic b ");
		System.out.println(obj1.a + " Default value of int var a ");
		System.out.println(obj1.b + " Default value of float var b ");
		System.out.println(obj1.c + "Default value of float var c ");
		System.out.println(obj1.bool + " Default value of boolean var b ");

		
		
	} 

}


