package randoop;



import java.lang.reflect.*;


public class GenerateTest{
	public static void main(String args[]) {

		
		TestingRandoop t = new TestingRandoop();
		try {
			Class thisClass = TestingRandoop.class;
			Method[] methods = thisClass.getDeclaredMethods();
			for (int i = 0; i < methods.length; i++) {
				System.out.println(methods[i].toString());
			}
		} catch(Throwable e) {
			System.err.println(e);
		}
	}
	
}



