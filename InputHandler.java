package randoop;

//https://www.w3schools.com/java/java_files_read.asp

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.Set;
import java.util.Random;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class InputHandler {
//	private static Set<Object> pool = new HashSet<>(
//			Arrays.asList(0, 1, true, false, "", null, "hi")); //seed values for primitive types
//	
	
	private static Map<String, List<Object>> createPrimitivePool() {
		Map<String, List<Object>> primitivePool = new HashMap<>();
		primitivePool.put("int", new ArrayList<>(Arrays.asList(0, 1, 10, 100, 1000, -100)));
		primitivePool.put("short", new ArrayList<>(Arrays.asList(0, 1, 10, 100, -30000, 30000)));
		primitivePool.put("byte", new ArrayList<>(Arrays.asList(0, 1, 126, -100)));
		primitivePool.put("String", new ArrayList<>(Arrays.asList("", "hi")));
		primitivePool.put("float", new ArrayList<>(Arrays.asList(0.0, -5.0)));
		primitivePool.put("boolean", new ArrayList<>(Arrays.asList(true, false)));
		primitivePool.put("double", new ArrayList<>(Arrays.asList(0.0, -5.0)));
		primitivePool.put("char", new ArrayList<>(Arrays.asList('a', '0')));
		return primitivePool;
	}
	
	private static Map<String, List<Object>> primitivePool = createPrimitivePool();
	
	
	private static List<Method> methodPool = new ArrayList<>();
	
	
	private static List<String> readFile(String fileName) {
		try {
			File f = new File(fileName);
			Scanner myReader = new Scanner(f);
			List<String> res = new ArrayList<>();
			
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				res.add(data);
				//System.out.println(data);
			}
			myReader.close();
			return res;
		} catch (FileNotFoundException e) {
			System.out.println("Error occured for loading classList");
			e.printStackTrace();
			return null;
		}

	}
	
	private static void handleClass(String className) throws ClassNotFoundException {
		Class c = Class.forName(className); //TO DO: how to local class
		Method[] methods = c.getDeclaredMethods();
		
		
		System.out.println("method names : ");
        for (int i = 0; i < methods.length; i++) { 
            System.out.println(methods[i].toString()); 
            Method curMethod = methods[i];
            methodPool.add(curMethod);
            
            Class[] parameterTypes = curMethod.getParameterTypes(); //input parameter types
            //TODO: same name methods
            int numParams = parameterTypes.length; //number of input parameters 
            
        }
        
	}
	
	private static Method randomChooseMethod() {
		int upperBound = methodPool.size();
		Random rand = new Random();
		int int_random = rand.nextInt(upperBound);
		Method chosenMethod = methodPool.get(int_random);
		return chosenMethod;
	}
	
	private static Object randomChoosePrimitiveValue(List<Object> list) {
		int upperBound = list.size();
		Random rand = new Random();
		int int_random = rand.nextInt(upperBound);
		Object chosenValue = list.get(int_random);
		return chosenValue;
	}
	
	private static List<Object> randomChooseSequence(Method method) {
		List<Object> chosenSequence = new ArrayList<>();
		Class[] parameterTypes = method.getParameterTypes(); //input parameter types
        //TODO: same name methods
        int numParams = parameterTypes.length; //number of input parameters 
        Class returnType = method.getReturnType();
        
        //TODO:If the input type not in the value pool, what to do?
        List<Object> chosenPrimitiveValues = new ArrayList<>();
        for (Class c : parameterTypes) {
        	//System.out.println(c.toString());
        	if (c.isPrimitive()) { //handle primitive types
        		System.out.println("primitive type : " + c.toString());
        		List<Object> sameTypeList = primitivePool.get(c.toString());
        		Object value = randomChoosePrimitiveValue(sameTypeList);
        		chosenPrimitiveValues.add(value);
        	} else { //handle object types
        		
        	}
        }
        
        System.out.println("chosen input: ");
        for (Object value : chosenPrimitiveValues) {
        	System.out.println(value);
        }
        
        return chosenSequence;
	}
	
	
	private static void createOutputFile(String fileName) {
	    try {
	        FileWriter aWriter = new FileWriter(fileName + ".java", true);
	        aWriter.write("public class "+ "fileName" + "{");
	        aWriter.write(" public void test0() {");
	        aWriter.write(" System.out.println(\"" + "hello World" + "\");");
	        aWriter.write(" }}\n");
	        aWriter.flush();      
	        aWriter.close();
	        }
	      catch(Exception e){
	        e.printStackTrace();
	        }
	}
	
	
	public static void main(String args[]) throws ClassNotFoundException {
		if (args.length < 2) {
			System.out.println("Invalid Input");
			return;
		}
		String classList = args[0]; //name of class list file
		String timeLimit = args[1]; //time limit
		
		long start = System.currentTimeMillis();
		long end = start + Long.parseLong(timeLimit) * 1000; //try catch
		
		
		System.out.println("classList filename: " + classList);
		System.out.println("time Limit : " + timeLimit);
		
		List<String> classes = readFile("randoop/" + classList); 
		
		
		createOutputFile("SimpleRandoopTest");
		createOutputFile("SimpleRandoopTest0");
		createOutputFile("SimpleRandoopTest1");
		createOutputFile("SimpleRandoopErrorTest");
		createOutputFile("SimpleRandoopErrorTest0");
		
		System.out.println("class Names: ");
		for (String s: classes) {
			System.out.println(s);
			handleClass(s);
		}
		
		System.out.println("current method pool: ");
		for (Method m : methodPool) {
			System.out.println(m.toString());
		}
		
		
		while (System.currentTimeMillis() < end) {
			Method chosenMethod = randomChooseMethod();
			System.out.println("randomly choose method: " + chosenMethod.toString());
			
			
			List<Object> chosenSequences = randomChooseSequence(chosenMethod);
			//output chosen sequences and method to file
		}
		

		
		
	}
}
