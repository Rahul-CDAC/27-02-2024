
class Demo4{
	int a;	
	float b;
	char c;
	boolean bool;   

	Demo4(){}

	Demo4(int a1, float b1, char c1){
		a = a1;
		b = b1;
		c = c1;
	}
	
	public static void main(String args[]){
	
		Demo4 obj = new Demo4();
		Demo4 obj1 = new Demo4(2,2.2f,'b');

		obj.addNumber();
		obj1.addNumber();  // method calling

		obj.addNumber(1000);
		obj1.addNumber(500); 
		
		float f = obj.addNumber(1000.0f);
		System.out.println(f);
		System.out.println(obj1.addNumber(500.0f));

		
	} 

	void addNumber(){
		System.out.println(100 + a);
	}	
	void addNumber(int a){
		System.out.println(a + b);
	}

	float addNumber(float a){ // here float is a return type
		return a+50.0f;
	}
	


}


