package randoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimitivePool {
	private Map<String, List<Object>> primitivePool;
	
	public PrimitivePool() {
		primitivePool = new HashMap<>();
		primitivePool.put("int", new ArrayList<>(Arrays.asList(0, 1, 10, 100, 1000, -100)));
		primitivePool.put("short", new ArrayList<>(Arrays.asList(0, 1, 10, 100, -30000, 30000)));
		primitivePool.put("byte", new ArrayList<>(Arrays.asList(0, 1, 126, -100)));
		primitivePool.put("String", new ArrayList<>(Arrays.asList("", "hi")));
		primitivePool.put("float", new ArrayList<>(Arrays.asList(0.0, -5.0)));
		primitivePool.put("boolean", new ArrayList<>(Arrays.asList(true, false)));
		primitivePool.put("double", new ArrayList<>(Arrays.asList(0.0, -5.0)));
		primitivePool.put("char", new ArrayList<>(Arrays.asList('a', '0')));
	}
	public Map<String, List<Object>> getPool() {
		return this.primitivePool;
	}
}
