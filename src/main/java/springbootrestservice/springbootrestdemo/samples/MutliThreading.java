package springbootrestservice.springbootrestdemo.samples;

public class MutliThreading {

	public static void main(String[] args) {
		
		A a=new A();
		B b=new B();
		a.start();
		b.start();
	}

}
