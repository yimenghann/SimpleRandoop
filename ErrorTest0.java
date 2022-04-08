package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = 
        		new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = 
        		new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) 
        				constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet6 = 
        		constantDescSet3.subSet((java.lang.constant.ConstantDesc) 1L, (java.lang.constant.ConstantDesc) 0L);
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator7 = constantDescSet3.comparator();
        boolean boolean9 = constantDescSet3.add((java.lang.constant.ConstantDesc) (-1));
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on constantDescSet6 and constantDescSet1.", 
        		constantDescSet6.equals(constantDescSet1) == constantDescSet1.equals(constantDescSet6));
    }
}

