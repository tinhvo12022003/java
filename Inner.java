interface Person {
	public void Info();
}

interface Showable {
	interface Message {
		public void msg();
	}
}

class Outer {
	static int temp = 10;
	int temp2 = 20;
	class Inner {
		public void msg(){
			System.out.println("Inner class");
		}
	}
	public void display(){
		class localInner {
			public void abc(){
				System.out.println("class abc");
			}
		}
		localInner local = new localInner();
		local.abc();
	}

	static class nest {
		public static void show(){
			System.out.println("static data is " + temp);
			//System.out.println("non-static data is " + temp2);
		}
	}
}

class test_Interface implements Showable.Message{
	public void msg(){
		System.out.println("message inner interface");
	}
}

public class Inner {
	public static void main(String[] args){
		Outer o = new Outer();
		Outer.Inner i =  o.new Inner();
		i.msg();

		Person p = new Person(){
			public void Info(){
				System.out.println("class Person duoc tao");
			}
		};

		p.Info();
		o.display();
		Outer.nest.show();

		test_Interface ti = new test_Interface();
		ti.msg(); 
	}
}
