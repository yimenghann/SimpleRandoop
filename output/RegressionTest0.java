package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.util.List list0 = java.util.Collections.EMPTY_LIST;
        org.junit.Assert.assertNotNull(list0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.List<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableMapList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(strComparableMapList0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.List<java.lang.Iterable<java.lang.String>> strIterableList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(strIterableList0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Map<java.util.Set<java.lang.String>, java.util.List> strSetMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(strSetMap0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Set<java.lang.String> strSet1 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet2 = java.util.Collections.synchronizedSet(strSet1);
        java.lang.Class<java.lang.String> strClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.String> strCollection4 = java.util.Collections.checkedCollection((java.util.Collection<java.lang.String>) strSet2, strClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.NavigableSet<java.util.Iterator<java.io.Serializable>> serializableItorSet0 = java.util.Collections.emptyNavigableSet();
        org.junit.Assert.assertNotNull(serializableItorSet0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.ListIterator<java.util.AbstractSet<java.lang.constant.ConstantDesc>> constantDescSetItor0 = java.util.Collections.emptyListIterator();
        org.junit.Assert.assertNotNull(constantDescSetItor0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.SortedSet<java.lang.Cloneable> cloneableSet0 = java.util.Collections.emptySortedSet();
        org.junit.Assert.assertNotNull(cloneableSet0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Set<java.lang.String> strSet1 = java.util.Collections.singleton("hi!");
        java.lang.Class<java.lang.String> strClass2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet3 = java.util.Collections.checkedSet(strSet1, strClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.constant.ConstantDesc[] constantDescArray10 = new java.lang.constant.ConstantDesc[] { 1, 1L, 1.0f, "", 0L, (-1.0f), 100, 1.0f, (-1), 1 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList11 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList11, constantDescArray10);
        java.util.Iterator[] iteratorArray14 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<java.io.Serializable>[] serializableItorArray15 = (java.util.Iterator<java.io.Serializable>[]) iteratorArray14;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.io.Serializable>[] serializableItorArray16 = constantDescList11.toArray(serializableItorArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: arraycopy: element type mismatch: can not cast one of the elements of java.lang.Object[] to the type of the destination array, java.util.Iterator");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iteratorArray14);
        org.junit.Assert.assertNotNull(serializableItorArray15);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Map<java.lang.String, java.lang.constant.ConstantDesc> strMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.Set set0 = java.util.Collections.EMPTY_SET;
        java.lang.Class<?> wildcardClass1 = set0.getClass();
        java.util.List<java.lang.reflect.GenericDeclaration> genericDeclarationList2 = java.util.Collections.singletonList((java.lang.reflect.GenericDeclaration) wildcardClass1);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericDeclarationList2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.ListIterator<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableMapItor0 = java.util.Collections.emptyListIterator();
        org.junit.Assert.assertNotNull(strComparableMapItor0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.SortedSet<java.lang.Comparable<java.lang.String>> strComparableSet0 = java.util.Collections.emptySortedSet();
        org.junit.Assert.assertNotNull(strComparableSet0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.util.SortedMap<TestingRandoop, java.lang.CharSequence> testingRandoopMap0 = java.util.Collections.emptySortedMap();
        org.junit.Assert.assertNotNull(testingRandoopMap0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.Set<java.util.Comparator<java.lang.constant.ConstantDesc>> constantDescComparatorSet2 = java.util.Collections.singleton(constantDescComparator1);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNotNull(constantDescComparatorSet2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = constantDescSet1.contains(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"value\" because \"anotherInteger\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.SortedMap<java.lang.Comparable<java.lang.String>, java.util.List> strComparableMap0 = java.util.Collections.emptySortedMap();
        org.junit.Assert.assertNotNull(strComparableMap0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.List<java.io.Serializable> serializableList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(serializableList0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc7 = constantDescSet1.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescItor6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.Set<java.lang.String> strSet0 = java.util.Collections.emptySet();
        java.util.Set<java.lang.String> strSet1 = java.util.Collections.synchronizedSet(strSet0);
        java.lang.Class<java.lang.String> strClass2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet3 = java.util.Collections.checkedSet(strSet1, strClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.Iterator<java.util.SortedSet<java.lang.constant.ConstantDesc>> constantDescSetItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(constantDescSetItor0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.SortedSet<java.lang.Class<?>> wildcardClassSet0 = java.util.Collections.emptySortedSet();
        org.junit.Assert.assertNotNull(wildcardClassSet0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.Map<java.util.Set<java.lang.String>, java.util.NavigableSet<java.lang.constant.ConstantDesc>> strSetMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(strSetMap0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.NavigableSet<java.lang.Cloneable> cloneableSet0 = java.util.Collections.emptyNavigableSet();
        org.junit.Assert.assertNotNull(cloneableSet0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.iterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 10.0d, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc10 = constantDescSet1.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNotNull(constantDescSet9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum(0, 1);
        int int6 = testingRandoop0.sum((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.util.List<java.lang.Cloneable> cloneableList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(cloneableList0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.checkedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1, constantDescClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.Iterator<java.lang.reflect.Type> typeItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(typeItor0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.String[] strArray2 = new java.lang.String[] { "[]", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.Class<java.lang.String> strClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.String> strCollection6 = java.util.Collections.checkedCollection((java.util.Collection<java.lang.String>) strList3, strClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.util.NavigableMap<java.lang.constant.ConstantDesc[], java.lang.invoke.TypeDescriptor> constantDescArrayMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(constantDescArrayMap0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.SortedSet<java.util.AbstractCollection<java.lang.constant.ConstantDesc>> constantDescCollectionSet0 = java.util.Collections.emptySortedSet();
        org.junit.Assert.assertNotNull(constantDescCollectionSet0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.Comparator<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldComparator0 = java.util.Collections.reverseOrder();
        org.junit.Assert.assertNotNull(wildcardClassOfFieldComparator0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.lang.Object[] objArray6 = constantDescSet1.toArray();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator7 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet8.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean12 = constantDescSet8.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator13 = constantDescSet8.spliterator();
        java.lang.Object obj14 = constantDescSet8.clone();
        boolean boolean15 = constantDescSet1.remove((java.lang.Object) constantDescSet8);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "hi!", "[]", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray22 = constantDescSet8.toArray(strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.Integer");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator7);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.iterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 10.0d, false);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet11 = java.util.Collections.checkedNavigableSet(constantDescSet9, constantDescClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNotNull(constantDescSet9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.SortedMap<java.util.RandomAccess, java.util.TreeSet<java.lang.constant.ConstantDesc>> randomAccessMap0 = java.util.Collections.emptySortedMap();
        org.junit.Assert.assertNotNull(randomAccessMap0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.NavigableSet<java.util.ArrayList<java.lang.String>> strListSet0 = java.util.Collections.emptyNavigableSet();
        org.junit.Assert.assertNotNull(strListSet0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet3.lower((java.lang.constant.ConstantDesc) 1.0f);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(constantDesc6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet1 = java.util.Collections.emptySet();
        boolean boolean2 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet0, (java.util.Collection<java.lang.String>) strSet1);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator3 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator4 = java.util.Collections.reverseOrder(constantDescComparator3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = java.util.Collections.min((java.util.Collection<java.lang.String>) strSet0, constantDescComparator4);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(constantDescComparator3);
        org.junit.Assert.assertNotNull(constantDescComparator4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.Set<java.lang.String> strSet14 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet15 = java.util.Collections.synchronizedSet(strSet14);
        boolean boolean16 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList11, (java.util.Collection<java.lang.String>) strSet14);
        java.util.AbstractList[] abstractListArray18 = new java.util.AbstractList[1];
        @SuppressWarnings("unchecked")
        java.util.AbstractList<java.lang.String>[] strListArray19 = (java.util.AbstractList<java.lang.String>[]) abstractListArray18;
        strListArray19[0] = strList11;
        // The following exception was thrown during execution in test generation
        try {
            java.util.AbstractList<java.lang.String>[] strListArray22 = constantDescSet1.toArray(strListArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.Integer");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(abstractListArray18);
        org.junit.Assert.assertNotNull(strListArray19);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.lang.Class<?> wildcardClass6 = constantDescSet1.getClass();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator5 = constantDescSet3.spliterator();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSpliterator5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.NavigableMap<java.lang.constant.Constable, java.util.List> constableMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(constableMap0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.Set set0 = java.util.Collections.EMPTY_SET;
        java.lang.Class<?> wildcardClass1 = set0.getClass();
        java.util.Set<java.lang.invoke.TypeDescriptor> typeDescriptorSet2 = java.util.Collections.singleton((java.lang.invoke.TypeDescriptor) wildcardClass1);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(typeDescriptorSet2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.util.SortedSet<java.io.Serializable[]> serializableArraySet0 = java.util.Collections.emptySortedSet();
        org.junit.Assert.assertNotNull(serializableArraySet0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.util.Map<java.lang.Cloneable, java.util.HashSet<java.lang.String>> cloneableMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(cloneableMap0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.util.NavigableMap<java.util.HashSet<java.lang.String>, java.util.Spliterator<java.lang.constant.ConstantDesc>> strSetMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(strSetMap0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet1 = java.util.Collections.emptySet();
        boolean boolean2 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet0, (java.util.Collection<java.lang.String>) strSet1);
        java.lang.Class<java.lang.String> strClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.String> strCollection4 = java.util.Collections.checkedCollection((java.util.Collection<java.lang.String>) strSet1, strClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.Set<java.lang.String> strSet7 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet8 = java.util.Collections.synchronizedSet(strSet7);
        boolean boolean9 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList4, (java.util.Collection<java.lang.String>) strSet7);
        java.lang.Class<?> wildcardClass10 = strSet7.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.Comparator<java.lang.Object[]> objArrayComparator0 = java.util.Collections.reverseOrder();
        org.junit.Assert.assertNotNull(objArrayComparator0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.Map<java.util.ArrayList<java.lang.String>, java.lang.reflect.AnnotatedElement> strListMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(strListMap0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.Set<java.util.NavigableSet<java.lang.constant.ConstantDesc>> constantDescSetSet0 = java.util.Collections.emptySet();
        org.junit.Assert.assertNotNull(constantDescSetSet0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = java.util.Collections.emptyListIterator();
        org.junit.Assert.assertNotNull(strComparableItor0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap0 = java.util.Collections.emptyNavigableMap();
        java.util.List<java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>> comparableMapMapList1 = java.util.Collections.singletonList((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap0);
        java.lang.Class<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableMapClass2 = null;
        java.lang.Class<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap4 = java.util.Collections.checkedNavigableMap(strComparableMapMap0, strComparableMapClass2, constantDescSetClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableMapMap0);
        org.junit.Assert.assertNotNull(comparableMapMapList1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.Map<java.lang.AutoCloseable, java.util.Spliterator<java.lang.constant.ConstantDesc>> autoCloseableMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(autoCloseableMap0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.util.Set<java.lang.String> strSet0 = java.util.Collections.emptySet();
        java.util.Set<java.lang.String> strSet1 = java.util.Collections.synchronizedSet(strSet0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator2);
        java.lang.Object[] objArray4 = constantDescSet3.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet5 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet6 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet5);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator7 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet8.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean12 = constantDescSet8.remove((java.lang.Object) (byte) -1);
        boolean boolean13 = constantDescSet5.equals((java.lang.Object) boolean12);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor14 = constantDescSet5.iterator();
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator15 = constantDescSet5.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable16 = java.util.Collections.max((java.util.Collection<java.lang.String>) strSet1, (java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator15);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator7);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(constantDescItor14);
        org.junit.Assert.assertNotNull(wildcardComparator15);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator5 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet6 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator5);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet6.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean10 = constantDescSet6.remove((java.lang.Object) (byte) -1);
        boolean boolean11 = constantDescSet3.equals((java.lang.Object) boolean10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet14 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) "[]", (java.lang.constant.ConstantDesc) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Double (java.lang.String and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator5);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
        boolean boolean8 = constantDescSet1.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet10 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1, constantDescClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap0 = java.util.Collections.emptyMap();
        java.lang.Class<java.lang.Comparable<java.lang.String>> strComparableClass1 = null;
        java.lang.Class<java.lang.CharSequence> charSequenceClass2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap3 = java.util.Collections.checkedMap(strComparableMap0, strComparableClass1, charSequenceClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableMap0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc[] constantDescArray12 = new java.lang.constant.ConstantDesc[] { 1.0f, 100.0d, 10L, (-1), 10.0f, 10L };
        java.lang.constant.ConstantDesc[] constantDescArray13 = constantDescSet1.toArray(constantDescArray12);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor14 = constantDescSet1.descendingIterator();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator15 = constantDescSet1.spliterator();
        java.util.TreeSet<java.lang.String> strSet16 = new java.util.TreeSet<java.lang.String>();
        java.util.stream.Stream<java.lang.String> strStream17 = strSet16.parallelStream();
        java.util.TreeSet<java.lang.String> strSet18 = new java.util.TreeSet<java.lang.String>();
        java.util.stream.Stream<java.lang.String> strStream19 = strSet18.stream();
        java.util.stream.Stream[] streamArray21 = new java.util.stream.Stream[2];
        @SuppressWarnings("unchecked")
        java.util.stream.Stream<java.lang.String>[] strStreamArray22 = (java.util.stream.Stream<java.lang.String>[]) streamArray21;
        strStreamArray22[0] = strStream17;
        strStreamArray22[1] = strStream19;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.String>[] strStreamArray27 = constantDescSet1.toArray(strStreamArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.Integer");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescArray12);
        org.junit.Assert.assertNotNull(constantDescArray13);
        org.junit.Assert.assertNotNull(constantDescItor14);
        org.junit.Assert.assertNotNull(constantDescSpliterator15);
        org.junit.Assert.assertNotNull(strStream17);
        org.junit.Assert.assertNotNull(strStream19);
        org.junit.Assert.assertNotNull(streamArray21);
        org.junit.Assert.assertNotNull(strStreamArray22);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.Iterator<java.util.AbstractSet<java.lang.constant.ConstantDesc>> constantDescSetItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(constantDescSetItor0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.higher((java.lang.constant.ConstantDesc) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Integer (java.lang.Long and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.Iterator<java.util.AbstractList<java.lang.String>> strListItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(strListItor0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet7 = java.util.Collections.emptySet();
        boolean boolean8 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet6, (java.util.Collection<java.lang.String>) strSet7);
        boolean boolean9 = constantDescSet1.removeAll((java.util.Collection<java.lang.String>) strSet7);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet11 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1, constantDescClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Set<java.util.AbstractSet<java.lang.constant.ConstantDesc>> constantDescSetSet6 = java.util.Collections.singleton((java.util.AbstractSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Set<java.lang.String> strSet7 = java.util.Collections.emptySet();
        java.util.Set<java.lang.String> strSet8 = java.util.Collections.synchronizedSet(strSet7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = constantDescSet1.contains((java.lang.Object) strSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Collections$EmptySet cannot be cast to class java.lang.Comparable (java.util.Collections$EmptySet and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSetSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.Set<java.lang.invoke.TypeDescriptor> typeDescriptorSet0 = java.util.Collections.emptySet();
        org.junit.Assert.assertNotNull(typeDescriptorSet0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet3 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 100);
        java.util.Collection<java.lang.String> strCollection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = constantDescSet1.containsAll(strCollection4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.iterator()\" because \"c\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescSet3);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.Set<java.lang.String> strSet1 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet2 = java.util.Collections.synchronizedSet(strSet1);
        java.lang.Class<java.lang.String> strClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.String> strCollection4 = java.util.Collections.checkedCollection((java.util.Collection<java.lang.String>) strSet1, strClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.Map<java.io.Serializable, java.lang.String> serializableMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(serializableMap0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet6 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) (-1L), true);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.Set<java.lang.String> strSet17 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet18 = java.util.Collections.synchronizedSet(strSet17);
        boolean boolean19 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList14, (java.util.Collection<java.lang.String>) strSet17);
        boolean boolean20 = constantDescSet1.retainAll((java.util.Collection<java.lang.String>) strSet17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc21 = constantDescSet1.last();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(constantDescSet9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap0 = java.util.Collections.emptyNavigableMap();
        java.util.List<java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>> comparableMapMapList1 = java.util.Collections.singletonList((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap0);
        java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap2 = java.util.Collections.synchronizedSortedMap((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap0);
        java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap3 = java.util.Collections.synchronizedSortedMap((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap0);
        org.junit.Assert.assertNotNull(strComparableMapMap0);
        org.junit.Assert.assertNotNull(comparableMapMapList1);
        org.junit.Assert.assertNotNull(strComparableMapMap2);
        org.junit.Assert.assertNotNull(strComparableMapMap3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet1.tailSet(constantDesc4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Comparable.compareTo(Object)\" because \"c2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        boolean boolean6 = constantDescSet3.equals((java.lang.Object) (short) 100);
        java.lang.String str7 = constantDescSet3.toString();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.util.List<java.util.stream.Stream<java.lang.String>> strStreamList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(strStreamList0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.util.Set<java.lang.constant.ConstantDesc> constantDescSet1 = java.util.Collections.singleton((java.lang.constant.ConstantDesc) 0.0d);
        org.junit.Assert.assertNotNull(constantDescSet1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.Map<java.lang.constant.ConstantDesc, java.util.Spliterator<java.lang.constant.ConstantDesc>> constantDescMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(constantDescMap0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator2);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator2);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet6 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet4, constantDescClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.descendingIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet11 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) "[]", true, (java.lang.constant.ConstantDesc) (-1L), true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Long (java.lang.String and java.lang.Long are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescItor6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.util.Comparator<java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>> comparableMapMapComparator0 = java.util.Collections.reverseOrder();
        org.junit.Assert.assertNotNull(comparableMapMapComparator0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.Enumeration<java.lang.Comparable<java.lang.String>> strComparableEnumeration0 = java.util.Collections.emptyEnumeration();
        org.junit.Assert.assertNotNull(strComparableEnumeration0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc[] constantDescArray12 = new java.lang.constant.ConstantDesc[] { 1.0f, 100.0d, 10L, (-1), 10.0f, 10L };
        java.lang.constant.ConstantDesc[] constantDescArray13 = constantDescSet1.toArray(constantDescArray12);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor14 = constantDescSet1.descendingIterator();
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet16 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1, constantDescClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescArray12);
        org.junit.Assert.assertNotNull(constantDescArray13);
        org.junit.Assert.assertNotNull(constantDescItor14);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.util.Map<java.util.Spliterator<java.lang.constant.ConstantDesc>, java.util.List> constantDescSpliteratorMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(constantDescSpliteratorMap0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(constantDescSet7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.NavigableMap<java.lang.constant.Constable, java.lang.String> constableMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(constableMap0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator2);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator2);
        boolean boolean6 = constantDescSet4.add((java.lang.constant.ConstantDesc) 10L);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet1 = java.util.Collections.unmodifiableNavigableSet(constantDescSet0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"s\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.lang.Object obj7 = constantDescSet1.clone();
        java.lang.Class<?> wildcardClass8 = constantDescSet1.getClass();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.util.Map<java.util.Iterator<java.io.Serializable>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> serializableItorMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(serializableItorMap0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.Set<java.util.List> listSet0 = java.util.Collections.emptySet();
        org.junit.Assert.assertNotNull(listSet0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc7 = constantDescSet1.last();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet8 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) 10L, true, (java.lang.constant.ConstantDesc) 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Double (java.lang.Long and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor2 = constantDescSet1.descendingIterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet3 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Collection<java.lang.String> strCollection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = constantDescSet1.containsAll(strCollection4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.iterator()\" because \"c\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescItor2);
        org.junit.Assert.assertNotNull(constantDescSet3);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.util.Comparator<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableMapComparator0 = java.util.Collections.reverseOrder();
        org.junit.Assert.assertNotNull(strComparableMapComparator0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet3.descendingSet();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.util.Enumeration<java.util.AbstractSet<java.lang.constant.ConstantDesc>> constantDescSetEnumeration0 = java.util.Collections.emptyEnumeration();
        org.junit.Assert.assertNotNull(constantDescSetEnumeration0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.util.NavigableMap<java.util.stream.Stream<java.lang.String>, java.util.List> strStreamMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(strStreamMap0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.util.Map<java.util.Collection<java.lang.String>, java.lang.Cloneable> strCollectionMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(strCollectionMap0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator0 = java.util.Collections.reverseOrder();
        org.junit.Assert.assertNotNull(charSequenceComparator0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.iterator();
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.lang.String[] strArray9 = constantDescSet1.toArray(strArray8);
        java.util.List<java.lang.String[]> strArrayList10 = java.util.Collections.singletonList(strArray8);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArrayList10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap0 = java.util.Collections.emptyNavigableMap();
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap1 = java.util.Collections.synchronizedNavigableMap(strComparableMapMap0);
        java.lang.Class<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableMapClass2 = null;
        java.lang.Class<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap4 = java.util.Collections.checkedNavigableMap(strComparableMapMap1, strComparableMapClass2, constantDescSetClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableMapMap0);
        org.junit.Assert.assertNotNull(strComparableMapMap1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.util.SortedSet<java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>> comparableMapMapSet0 = java.util.Collections.emptySortedSet();
        org.junit.Assert.assertNotNull(comparableMapMapSet0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet7 = java.util.Collections.emptySet();
        boolean boolean8 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet6, (java.util.Collection<java.lang.String>) strSet7);
        boolean boolean9 = constantDescSet1.removeAll((java.util.Collection<java.lang.String>) strSet7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet1.pollFirst();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator11 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet12 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator11);
        java.lang.constant.ConstantDesc constantDesc14 = constantDescSet12.floor((java.lang.constant.ConstantDesc) "[]");
        boolean boolean15 = constantDescSet1.contains((java.lang.Object) constantDescSet12);
        java.lang.constant.ConstantDesc constantDesc17 = constantDescSet12.ceiling((java.lang.constant.ConstantDesc) 10.0d);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 0.0f + "'", constantDesc10, 0.0f);
        org.junit.Assert.assertNotNull(constantDescComparator11);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(constantDesc17);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap0 = java.util.Collections.emptyNavigableMap();
        java.util.List<java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>> comparableMapMapList1 = java.util.Collections.singletonList((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap0);
        java.lang.Class<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableMapClass2 = null;
        java.lang.Class<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap4 = java.util.Collections.checkedSortedMap((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap0, strComparableMapClass2, constantDescSetClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableMapMap0);
        org.junit.Assert.assertNotNull(comparableMapMapList1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap0 = java.util.Collections.emptyNavigableMap();
        java.lang.Class<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableMapClass1 = null;
        java.lang.Class<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetClass2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap3 = java.util.Collections.checkedNavigableMap(strComparableMapMap0, strComparableMapClass1, constantDescSetClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableMapMap0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.NavigableSet<java.lang.Object> objSet0 = java.util.Collections.emptyNavigableSet();
        org.junit.Assert.assertNotNull(objSet0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc7 = constantDescSet1.last();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescItor6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.Set<TestingRandoop[]> testingRandoopArraySet0 = java.util.Collections.emptySet();
        org.junit.Assert.assertNotNull(testingRandoopArraySet0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.Set<java.lang.String> strSet1 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet2 = java.util.Collections.synchronizedSet(strSet1);
        java.util.TreeSet<java.lang.String> strSet3 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap4 = java.util.Collections.emptyNavigableMap();
        java.util.List<java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>> comparableMapMapList5 = java.util.Collections.singletonList((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap4);
        java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap6 = java.util.Collections.synchronizedSortedMap((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap4);
        int int7 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strSet1, (java.lang.Object) strComparableMapMap6);
        java.lang.Class<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableMapClass8 = null;
        java.lang.Class<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap10 = java.util.Collections.checkedSortedMap(strComparableMapMap6, strComparableMapClass8, constantDescSetClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strComparableMapMap4);
        org.junit.Assert.assertNotNull(comparableMapMapList5);
        org.junit.Assert.assertNotNull(strComparableMapMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.util.Set<java.util.Enumeration<java.lang.String>> strEnumerationSet0 = java.util.Collections.emptySet();
        org.junit.Assert.assertNotNull(strEnumerationSet0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
        boolean boolean8 = constantDescSet1.containsAll((java.util.Collection<java.lang.String>) strSet7);
        int int9 = constantDescSet1.size();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.Iterable<java.lang.String>> strComparableMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(strComparableMap0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.util.Set<java.lang.String> strSet1 = java.util.Collections.singleton("hi!");
        java.util.Enumeration<java.lang.String> strEnumeration2 = java.util.Collections.enumeration((java.util.Collection<java.lang.String>) strSet1);
        java.util.ArrayList<java.lang.String> strList3 = java.util.Collections.list(strEnumeration2);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strEnumeration2);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator5 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet6 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator5);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet6.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean10 = constantDescSet6.remove((java.lang.Object) (byte) -1);
        boolean boolean11 = constantDescSet3.equals((java.lang.Object) boolean10);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.Set<java.lang.String> strSet19 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet20 = java.util.Collections.synchronizedSet(strSet19);
        boolean boolean21 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList16, (java.util.Collection<java.lang.String>) strSet19);
        java.lang.Class<?> wildcardClass22 = strSet19.getClass();
        java.util.Set set23 = java.util.Collections.EMPTY_SET;
        java.lang.Class<?> wildcardClass24 = set23.getClass();
        java.util.Set<java.lang.invoke.TypeDescriptor> typeDescriptorSet25 = java.util.Collections.singleton((java.lang.invoke.TypeDescriptor) wildcardClass24);
        java.lang.Class[] classArray27 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        wildcardClassArray28[0] = wildcardClass22;
        wildcardClassArray28[1] = wildcardClass24;
        java.lang.Class<?>[] wildcardClassArray33 = constantDescSet3.toArray(wildcardClassArray28);
        boolean boolean34 = constantDescSet3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc35 = constantDescSet3.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator5);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(typeDescriptorSet25);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.ListIterator<java.util.HashSet<java.lang.String>> strSetItor0 = java.util.Collections.emptyListIterator();
        org.junit.Assert.assertNotNull(strSetItor0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.Set<java.lang.CharSequence> charSequenceSet0 = java.util.Collections.emptySet();
        org.junit.Assert.assertNotNull(charSequenceSet0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.util.NavigableMap<java.util.RandomAccess, java.util.RandomAccess> randomAccessMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(randomAccessMap0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet1 = java.util.Collections.emptySet();
        boolean boolean2 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet0, (java.util.Collection<java.lang.String>) strSet1);
        java.util.Set<java.lang.String> strSet3 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.String>) strSet0);
        java.lang.Class<java.lang.String> strClass4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet5 = java.util.Collections.checkedSet((java.util.Set<java.lang.String>) strSet0, strClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc4 = constantDescSet3.last();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.util.Iterator<java.util.Enumeration<java.lang.String>> strEnumerationItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(strEnumerationItor0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet7 = java.util.Collections.emptySet();
        boolean boolean8 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet6, (java.util.Collection<java.lang.String>) strSet7);
        boolean boolean9 = constantDescSet1.removeAll((java.util.Collection<java.lang.String>) strSet7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet1.pollFirst();
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator11 = constantDescSet1.comparator();
        java.util.Collection<java.lang.String> strCollection12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = constantDescSet1.retainAll(strCollection12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 0.0f + "'", constantDesc10, 0.0f);
        org.junit.Assert.assertNotNull(wildcardComparator11);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.util.NavigableMap<java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>, java.util.stream.BaseStream<java.lang.String, java.util.stream.Stream<java.lang.String>>> comparableMapMapMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(comparableMapMapMap0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.util.Comparator<java.lang.Comparable<java.lang.String>> strComparableComparator0 = java.util.Collections.reverseOrder();
        org.junit.Assert.assertNotNull(strComparableComparator0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc[] constantDescArray12 = new java.lang.constant.ConstantDesc[] { 1.0f, 100.0d, 10L, (-1), 10.0f, 10L };
        java.lang.constant.ConstantDesc[] constantDescArray13 = constantDescSet1.toArray(constantDescArray12);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor14 = constantDescSet1.descendingIterator();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator15 = constantDescSet1.spliterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet16 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet18 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1, constantDescClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescArray12);
        org.junit.Assert.assertNotNull(constantDescArray13);
        org.junit.Assert.assertNotNull(constantDescItor14);
        org.junit.Assert.assertNotNull(constantDescSpliterator15);
        org.junit.Assert.assertNotNull(constantDescSet16);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.util.NavigableMap<java.util.stream.BaseStream<java.lang.String, java.util.stream.Stream<java.lang.String>>, java.util.ArrayList<java.lang.String>> strBaseStreamMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(strBaseStreamMap0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc[] constantDescArray12 = new java.lang.constant.ConstantDesc[] { 1.0f, 100.0d, 10L, (-1), 10.0f, 10L };
        java.lang.constant.ConstantDesc[] constantDescArray13 = constantDescSet1.toArray(constantDescArray12);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor14 = constantDescSet1.descendingIterator();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator15 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet16 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator15);
        java.lang.Object[] objArray17 = constantDescSet16.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet18 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet16);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet21 = constantDescSet18.subSet((java.lang.constant.ConstantDesc) 1L, (java.lang.constant.ConstantDesc) 0L);
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator22 = constantDescSet18.comparator();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet23 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator22);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator24 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet25 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator24);
        java.lang.constant.ConstantDesc constantDesc27 = constantDescSet25.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str28 = constantDescSet25.toString();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator29 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet30 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator29);
        java.lang.constant.ConstantDesc constantDesc32 = constantDescSet30.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean34 = constantDescSet30.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor35 = constantDescSet30.iterator();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator36 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet37 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator36);
        java.lang.constant.ConstantDesc constantDesc39 = constantDescSet37.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean41 = constantDescSet37.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc[] constantDescArray48 = new java.lang.constant.ConstantDesc[] { 1.0f, 100.0d, 10L, (-1), 10.0f, 10L };
        java.lang.constant.ConstantDesc[] constantDescArray49 = constantDescSet37.toArray(constantDescArray48);
        java.lang.constant.ConstantDesc constantDesc50 = constantDescSet37.last();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator51 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet52 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator51);
        java.lang.constant.ConstantDesc constantDesc54 = constantDescSet52.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean56 = constantDescSet52.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator57 = constantDescSet52.spliterator();
        java.util.AbstractSet[] abstractSetArray59 = new java.util.AbstractSet[5];
        @SuppressWarnings("unchecked")
        java.util.AbstractSet<java.lang.constant.ConstantDesc>[] constantDescSetArray60 = (java.util.AbstractSet<java.lang.constant.ConstantDesc>[]) abstractSetArray59;
        constantDescSetArray60[0] = constantDescSet23;
        constantDescSetArray60[1] = constantDescSet25;
        constantDescSetArray60[2] = constantDescSet30;
        constantDescSetArray60[3] = constantDescSet37;
        constantDescSetArray60[4] = constantDescSet52;
        // The following exception was thrown during execution in test generation
        try {
            java.util.AbstractSet<java.lang.constant.ConstantDesc>[] constantDescSetArray71 = constantDescSet1.toArray(constantDescSetArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.Integer");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescArray12);
        org.junit.Assert.assertNotNull(constantDescArray13);
        org.junit.Assert.assertNotNull(constantDescItor14);
        org.junit.Assert.assertNotNull(constantDescComparator15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(constantDescSet21);
        org.junit.Assert.assertNotNull(wildcardComparator22);
        org.junit.Assert.assertNotNull(constantDescComparator24);
        org.junit.Assert.assertNull(constantDesc27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertNotNull(constantDescComparator29);
        org.junit.Assert.assertNull(constantDesc32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(constantDescItor35);
        org.junit.Assert.assertNotNull(constantDescComparator36);
        org.junit.Assert.assertNull(constantDesc39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(constantDescArray48);
        org.junit.Assert.assertNotNull(constantDescArray49);
        org.junit.Assert.assertEquals("'" + constantDesc50 + "' != '" + 1 + "'", constantDesc50, 1);
        org.junit.Assert.assertNotNull(constantDescComparator51);
        org.junit.Assert.assertNull(constantDesc54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator57);
        org.junit.Assert.assertNotNull(abstractSetArray59);
        org.junit.Assert.assertNotNull(constantDescSetArray60);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class<?>[] wildcardClassArray9 = constantDescSet1.toArray((java.lang.Class<?>[]) classArray7);
        int int10 = constantDescSet1.size();
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet12 = java.util.Collections.checkedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1, constantDescClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.util.List<java.lang.CharSequence> charSequenceList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(charSequenceList0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum((int) (byte) 0, (int) '#');
        int int6 = testingRandoop0.sum((int) (short) -1, 0);
        int int9 = testingRandoop0.sum((int) (short) 1, (int) (short) 1);
        java.util.Set<TestingRandoop> testingRandoopSet10 = java.util.Collections.singleton(testingRandoop0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(testingRandoopSet10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator5 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet6 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator5);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet6.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean10 = constantDescSet6.remove((java.lang.Object) (byte) -1);
        boolean boolean11 = constantDescSet3.equals((java.lang.Object) boolean10);
        java.lang.constant.ConstantDesc constantDesc13 = constantDescSet3.higher((java.lang.constant.ConstantDesc) 134);
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet18 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 1L, false, (java.lang.constant.ConstantDesc) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Integer (java.lang.Long and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator5);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(constantDesc13);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.util.Map<java.util.ArrayList<java.lang.String>, java.io.Serializable[]> strListMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(strListMap0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Set<java.util.AbstractSet<java.lang.constant.ConstantDesc>> constantDescSetSet6 = java.util.Collections.singleton((java.util.AbstractSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.ceiling((java.lang.constant.ConstantDesc) 1.0f);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = constantDescSet1.descendingSet();
        java.lang.constant.ConstantDesc constantDesc10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet12 = constantDescSet1.tailSet(constantDesc10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Comparable.compareTo(Object)\" because \"c2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSetSet6);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 0.0f + "'", constantDesc8, 0.0f);
        org.junit.Assert.assertNotNull(constantDescSet9);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator1);
        java.lang.constant.ConstantDesc constantDesc4 = constantDescSet2.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.List<java.util.NavigableSet<java.lang.constant.ConstantDesc>> constantDescSetList5 = java.util.Collections.nCopies((int) (short) 0, (java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet2);
        java.util.Set<java.lang.String> strSet6 = java.util.Collections.emptySet();
        java.util.Set<java.lang.String> strSet7 = java.util.Collections.synchronizedSet(strSet6);
        boolean boolean8 = constantDescSet2.retainAll((java.util.Collection<java.lang.String>) strSet7);
        java.lang.Class<java.lang.String> strClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet10 = java.util.Collections.checkedSet(strSet7, strClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNotNull(constantDescSetList5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet7 = java.util.Collections.emptySet();
        boolean boolean8 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet6, (java.util.Collection<java.lang.String>) strSet7);
        boolean boolean9 = constantDescSet1.removeAll((java.util.Collection<java.lang.String>) strSet7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet1.last();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 0.0f + "'", constantDesc10, 0.0f);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc[] constantDescArray12 = new java.lang.constant.ConstantDesc[] { 1.0f, 100.0d, 10L, (-1), 10.0f, 10L };
        java.lang.constant.ConstantDesc[] constantDescArray13 = constantDescSet1.toArray(constantDescArray12);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor14 = constantDescSet1.descendingIterator();
        java.lang.Class<?> wildcardClass15 = constantDescSet1.getClass();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescArray12);
        org.junit.Assert.assertNotNull(constantDescArray13);
        org.junit.Assert.assertNotNull(constantDescItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 0.0f);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.pollFirst();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.util.Enumeration<java.lang.Class<?>> wildcardClassEnumeration0 = java.util.Collections.emptyEnumeration();
        org.junit.Assert.assertNotNull(wildcardClassEnumeration0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.util.SortedSet<java.lang.String[]> strArraySet0 = java.util.Collections.emptySortedSet();
        org.junit.Assert.assertNotNull(strArraySet0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.util.Iterator<java.util.ArrayList<java.lang.String>> strListItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(strListItor0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.util.Set<java.lang.String> strSet0 = java.util.Collections.emptySet();
        java.util.Set<java.lang.String> strSet1 = java.util.Collections.synchronizedSet(strSet0);
        java.lang.Class<?> wildcardClass2 = strSet1.getClass();
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.util.Set<java.lang.String> strSet0 = java.util.Collections.emptySet();
        java.util.Set<java.lang.String> strSet1 = java.util.Collections.synchronizedSet(strSet0);
        java.lang.Class<java.lang.String> strClass2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet3 = java.util.Collections.checkedSet(strSet0, strClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int4 = testingRandoop0.sum((int) (byte) 100, 45, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 245 + "'", int4 == 245);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.util.List<java.lang.Object[]> objArrayList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(objArrayList0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.util.Enumeration<java.lang.reflect.GenericDeclaration> genericDeclarationEnumeration0 = java.util.Collections.emptyEnumeration();
        org.junit.Assert.assertNotNull(genericDeclarationEnumeration0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.util.SortedSet<java.util.LinkedHashSet<java.lang.String>> strSetSet0 = java.util.Collections.emptySortedSet();
        org.junit.Assert.assertNotNull(strSetSet0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.util.ListIterator<TestingRandoop> testingRandoopItor0 = java.util.Collections.emptyListIterator();
        org.junit.Assert.assertNotNull(testingRandoopItor0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator2);
        java.lang.Object[] objArray4 = constantDescSet3.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet5 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.List<java.lang.String> strList8 = java.util.Collections.nCopies((int) ' ', "hi!");
        java.util.stream.Stream<java.lang.String> strStream9 = strList8.parallelStream();
        boolean boolean10 = constantDescSet5.removeAll((java.util.Collection<java.lang.String>) strList8);
        boolean boolean11 = constantDescSet1.contains((java.lang.Object) boolean10);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet13 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1, constantDescClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.util.Enumeration<java.util.Spliterator<java.lang.constant.ConstantDesc>> constantDescSpliteratorEnumeration0 = java.util.Collections.emptyEnumeration();
        org.junit.Assert.assertNotNull(constantDescSpliteratorEnumeration0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Set<java.util.AbstractSet<java.lang.constant.ConstantDesc>> constantDescSetSet6 = java.util.Collections.singleton((java.util.AbstractSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = constantDescSet1.add((java.lang.constant.ConstantDesc) "[]");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Float (java.lang.String and java.lang.Float are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSetSet6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = java.util.Collections.checkedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet2, constantDescClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 10.0d);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator7 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet8.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean12 = constantDescSet8.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.TreeSet<java.lang.String> strSet13 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet14 = java.util.Collections.emptySet();
        boolean boolean15 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet13, (java.util.Collection<java.lang.String>) strSet14);
        boolean boolean16 = constantDescSet8.removeAll((java.util.Collection<java.lang.String>) strSet14);
        java.lang.constant.ConstantDesc constantDesc17 = constantDescSet8.pollFirst();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator18 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator19 = java.util.Collections.reverseOrder(constantDescComparator18);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet20 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator18);
        java.util.Set<java.lang.String> strSet22 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet23 = java.util.Collections.synchronizedSet(strSet22);
        java.util.TreeSet<java.lang.String> strSet24 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet22);
        boolean boolean25 = constantDescSet20.retainAll((java.util.Collection<java.lang.String>) strSet22);
        boolean boolean26 = constantDescSet8.equals((java.lang.Object) strSet22);
        boolean boolean27 = constantDescSet1.removeAll((java.util.Collection<java.lang.String>) strSet22);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(constantDescComparator7);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 0.0f + "'", constantDesc17, 0.0f);
        org.junit.Assert.assertNotNull(constantDescComparator18);
        org.junit.Assert.assertNotNull(constantDescComparator19);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class<?>[] wildcardClassArray9 = constantDescSet1.toArray((java.lang.Class<?>[]) classArray7);
        int int10 = constantDescSet1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc11 = constantDescSet1.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.stream.Stream<java.lang.String> strStream1 = strSet0.parallelStream();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator2);
        java.lang.Object[] objArray4 = constantDescSet3.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet5 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet8 = constantDescSet5.subSet((java.lang.constant.ConstantDesc) 1L, (java.lang.constant.ConstantDesc) 0L);
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator9 = constantDescSet5.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = java.util.Collections.min((java.util.Collection<java.lang.String>) strSet0, (java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator9);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strStream1);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(constantDescSet8);
        org.junit.Assert.assertNotNull(wildcardComparator9);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollFirst();
        constantDescSet1.clear();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc6);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.util.NavigableMap<java.lang.invoke.TypeDescriptor, java.util.ListIterator<java.io.Serializable>> typeDescriptorMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(typeDescriptorMap0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.util.NavigableMap<java.lang.invoke.TypeDescriptor, java.lang.Object[]> typeDescriptorMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(typeDescriptorMap0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor2 = constantDescSet1.descendingIterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet3 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet4 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet1.higher((java.lang.constant.ConstantDesc) 10L);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescItor2);
        org.junit.Assert.assertNotNull(constantDescSet3);
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNull(constantDesc7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.util.Iterator<java.lang.String[]> strArrayItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(strArrayItor0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.List<java.lang.String> strList10 = java.util.Collections.nCopies((int) ' ', "hi!");
        boolean boolean11 = constantDescSet1.containsAll((java.util.Collection<java.lang.String>) strList10);
        int int13 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strList10, (java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.util.Map<java.util.TreeSet<java.lang.constant.ConstantDesc>, java.lang.String> constantDescSetMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(constantDescSetMap0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet8 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0L, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNotNull(constantDescSet8);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet1 = java.util.Collections.emptySet();
        boolean boolean2 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet0, (java.util.Collection<java.lang.String>) strSet1);
        java.util.Set<java.lang.String> strSet3 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.String>) strSet0);
        java.util.Set<java.lang.String> strSet5 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet6 = java.util.Collections.synchronizedSet(strSet5);
        boolean boolean7 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet0, (java.util.Collection<java.lang.String>) strSet5);
        java.util.stream.Stream<java.lang.String> strStream8 = strSet0.parallelStream();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strStream8);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet0 = java.util.Collections.emptySortedSet();
        org.junit.Assert.assertNotNull(constantDescSet0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap0 = java.util.Collections.emptyNavigableMap();
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap1 = java.util.Collections.synchronizedNavigableMap(strComparableMapMap0);
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap2 = java.util.Collections.synchronizedNavigableMap(strComparableMapMap1);
        org.junit.Assert.assertNotNull(strComparableMapMap0);
        org.junit.Assert.assertNotNull(strComparableMapMap1);
        org.junit.Assert.assertNotNull(strComparableMapMap2);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.util.List<java.lang.constant.Constable> constableList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(constableList0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        boolean boolean6 = constantDescSet3.equals((java.lang.Object) (short) 100);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.lang.Object obj8 = constantDescSet3.clone();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.util.Set<java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>> comparableMapMapSet0 = java.util.Collections.emptySet();
        org.junit.Assert.assertNotNull(comparableMapMapSet0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.util.ListIterator<java.io.Serializable> serializableItor0 = java.util.Collections.emptyListIterator();
        java.util.Set<java.util.ListIterator<java.io.Serializable>> serializableItorSet1 = java.util.Collections.singleton(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItorSet1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator2);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator2);
        java.util.List<java.lang.Object> objList5 = java.util.Collections.singletonList((java.lang.Object) constantDescSet4);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertNotNull(objList5);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.util.NavigableMap<java.util.Collection<java.lang.String>[], java.lang.String[]> strCollectionArrayMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(strCollectionArrayMap0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.util.Map<java.lang.CharSequence, java.util.Comparator<java.lang.constant.ConstantDesc>> charSequenceMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(charSequenceMap0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator2);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator2);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator5 = java.util.Collections.reverseOrder(constantDescComparator2);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertNotNull(constantDescComparator5);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.util.Map<java.lang.Class<?>[], java.util.Enumeration<java.lang.String>> wildcardClassArrayMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(wildcardClassArrayMap0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.util.NavigableMap<java.util.ListIterator<java.io.Serializable>[], java.util.Enumeration<java.lang.String>> serializableItorArrayMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(serializableItorArrayMap0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.descendingIterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 1L);
        java.lang.Object obj10 = constantDescSet1.clone();
        constantDescSet1.clear();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "[]");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.util.SortedMap<java.util.Enumeration<java.lang.String>, java.util.stream.Stream<java.lang.String>[]> strEnumerationMap0 = java.util.Collections.emptySortedMap();
        org.junit.Assert.assertNotNull(strEnumerationMap0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(constantDescItor0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.lang.Cloneable> strComparableMapMap1 = java.util.Collections.unmodifiableSortedMap(strComparableMapMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"m\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.util.NavigableMap<java.lang.Class<?>[], java.lang.AutoCloseable> wildcardClassArrayMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(wildcardClassArrayMap0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.util.ListIterator<java.lang.invoke.TypeDescriptor> typeDescriptorItor0 = java.util.Collections.emptyListIterator();
        org.junit.Assert.assertNotNull(typeDescriptorItor0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator1);
        java.lang.constant.ConstantDesc constantDesc4 = constantDescSet2.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.List<java.util.NavigableSet<java.lang.constant.ConstantDesc>> constantDescSetList5 = java.util.Collections.nCopies((int) (short) 0, (java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet2);
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator6 = constantDescSet2.comparator();
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNotNull(constantDescSetList5);
        org.junit.Assert.assertNotNull(wildcardComparator6);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet6 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) (-1L), true);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet10 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet9);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(constantDescSet9);
        org.junit.Assert.assertNotNull(constantDescSet10);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet1.ceiling((java.lang.constant.ConstantDesc) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollLast();
        constantDescSet1.clear();
        int int8 = constantDescSet1.size();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 1 + "'", constantDesc6, 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.util.Set<java.lang.constant.ConstantDesc> constantDescSet0 = java.util.Collections.emptySet();
        org.junit.Assert.assertNotNull(constantDescSet0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet1.descendingSet();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.last();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 1 + "'", constantDesc8, 1);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet9 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1, constantDescClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescSet7);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
        boolean boolean8 = constantDescSet1.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.Set<java.lang.String> strSet9 = java.util.Collections.unmodifiableSet((java.util.Set<java.lang.String>) strSet7);
        java.util.Collection<java.lang.String> strCollection10 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>) strSet7);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strCollection10);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.util.SortedSet<java.util.Iterator<java.io.Serializable>> serializableItorSet0 = java.util.Collections.emptySortedSet();
        org.junit.Assert.assertNotNull(serializableItorSet0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.util.NavigableSet<java.util.ListIterator<java.io.Serializable>[]> serializableItorArraySet0 = java.util.Collections.emptyNavigableSet();
        org.junit.Assert.assertNotNull(serializableItorArraySet0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.util.Enumeration<java.util.Collection<java.lang.String>[]> strCollectionArrayEnumeration0 = java.util.Collections.emptyEnumeration();
        org.junit.Assert.assertNotNull(strCollectionArrayEnumeration0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet6 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) (-1L), true);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator10 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet11 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator10);
        java.lang.Object[] objArray12 = constantDescSet11.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet13 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet11);
        java.lang.constant.ConstantDesc constantDesc15 = constantDescSet11.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc16 = constantDescSet11.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet17 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet11);
        java.util.List<java.lang.String> strList20 = java.util.Collections.nCopies((int) ' ', "hi!");
        boolean boolean21 = constantDescSet11.containsAll((java.util.Collection<java.lang.String>) strList20);
        java.util.Set<java.lang.String> strSet22 = java.util.Collections.emptySet();
        boolean boolean23 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList20, (java.util.Collection<java.lang.String>) strSet22);
        java.lang.Object obj24 = null;
        int int25 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strList20, obj24);
        boolean boolean26 = constantDescSet1.removeAll((java.util.Collection<java.lang.String>) strList20);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet28 = java.util.Collections.checkedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1, constantDescClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(constantDescSet9);
        org.junit.Assert.assertNotNull(constantDescComparator10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertNull(constantDesc16);
        org.junit.Assert.assertNotNull(constantDescSet17);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.util.Set<java.util.Spliterator<java.lang.constant.ConstantDesc>> constantDescSpliteratorSet0 = java.util.Collections.emptySet();
        org.junit.Assert.assertNotNull(constantDescSpliteratorSet0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.util.Enumeration<java.lang.Object> objEnumeration0 = java.util.Collections.emptyEnumeration();
        org.junit.Assert.assertNotNull(objEnumeration0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.util.NavigableMap<java.util.Set<java.lang.String>, java.util.Spliterator<java.lang.constant.ConstantDesc>> strSetMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(strSetMap0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet3.tailSet((java.lang.constant.ConstantDesc) (-1), false);
        java.util.List<java.lang.Object> objList7 = java.util.Collections.singletonList((java.lang.Object) false);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(objList7);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap0 = java.util.Collections.emptyNavigableMap();
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap1 = java.util.Collections.synchronizedNavigableMap(strComparableMapMap0);
        java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap2 = java.util.Collections.synchronizedSortedMap((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap0);
        java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap3 = java.util.Collections.synchronizedSortedMap(strComparableMapMap2);
        org.junit.Assert.assertNotNull(strComparableMapMap0);
        org.junit.Assert.assertNotNull(strComparableMapMap1);
        org.junit.Assert.assertNotNull(strComparableMapMap2);
        org.junit.Assert.assertNotNull(strComparableMapMap3);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.util.Collection<java.lang.String> strCollection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.String> strCollection1 = java.util.Collections.synchronizedCollection(strCollection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.lang.Object obj7 = constantDescSet1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.floor((java.lang.constant.ConstantDesc) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Integer (java.lang.Double and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[1]");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc[] constantDescArray12 = new java.lang.constant.ConstantDesc[] { 1.0f, 100.0d, 10L, (-1), 10.0f, 10L };
        java.lang.constant.ConstantDesc[] constantDescArray13 = constantDescSet1.toArray(constantDescArray12);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor14 = constantDescSet1.descendingIterator();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator15 = constantDescSet1.spliterator();
        java.lang.constant.ConstantDesc constantDesc16 = constantDescSet1.pollFirst();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescArray12);
        org.junit.Assert.assertNotNull(constantDescArray13);
        org.junit.Assert.assertNotNull(constantDescItor14);
        org.junit.Assert.assertNotNull(constantDescSpliterator15);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 1 + "'", constantDesc16, 1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator1);
        java.lang.Object[] objArray3 = constantDescSet2.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet2);
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet2.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet2.pollFirst();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator8 = constantDescSet2.spliterator();
        java.util.List<java.util.Spliterator<java.lang.constant.ConstantDesc>> constantDescSpliteratorList9 = java.util.Collections.singletonList(constantDescSpliterator8);
        java.util.List<java.util.Spliterator<java.lang.constant.ConstantDesc>> constantDescSpliteratorList10 = java.util.Collections.nCopies(10, constantDescSpliterator8);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNotNull(constantDescSpliterator8);
        org.junit.Assert.assertNotNull(constantDescSpliteratorList9);
        org.junit.Assert.assertNotNull(constantDescSpliteratorList10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.util.NavigableMap<TestingRandoop, java.lang.Class<?>> testingRandoopMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(testingRandoopMap0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.util.Comparator<java.lang.Class<?>> wildcardClassComparator0 = java.util.Collections.reverseOrder();
        org.junit.Assert.assertNotNull(wildcardClassComparator0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.util.NavigableMap<java.lang.Iterable<java.lang.String>, java.util.LinkedHashSet<java.lang.String>> strIterableMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(strIterableMap0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet0 = java.util.Collections.emptySet();
        org.junit.Assert.assertNotNull(annotatedElementSet0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.util.SortedSet<java.util.Collection<java.lang.String>> strCollectionSet0 = java.util.Collections.emptySortedSet();
        org.junit.Assert.assertNotNull(strCollectionSet0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.List<java.lang.String> strList10 = java.util.Collections.nCopies((int) ' ', "hi!");
        boolean boolean11 = constantDescSet1.containsAll((java.util.Collection<java.lang.String>) strList10);
        java.util.Set<java.lang.String> strSet12 = java.util.Collections.emptySet();
        boolean boolean13 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList10, (java.util.Collection<java.lang.String>) strSet12);
        java.lang.Class<java.lang.String> strClass14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.String> strCollection15 = java.util.Collections.checkedCollection((java.util.Collection<java.lang.String>) strList10, strClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.util.NavigableSet<java.util.stream.Stream<java.lang.String>[]> strStreamArraySet0 = java.util.Collections.emptyNavigableSet();
        org.junit.Assert.assertNotNull(strStreamArraySet0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.util.List<java.util.Spliterator<java.lang.constant.ConstantDesc>> constantDescSpliteratorList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(constantDescSpliteratorList0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.List<java.lang.String> strList10 = java.util.Collections.nCopies((int) ' ', "hi!");
        boolean boolean11 = constantDescSet1.containsAll((java.util.Collection<java.lang.String>) strList10);
        java.util.Set<java.lang.String> strSet12 = java.util.Collections.emptySet();
        boolean boolean13 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList10, (java.util.Collection<java.lang.String>) strSet12);
        java.util.Collection<java.lang.String> strCollection14 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>) strSet12);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strCollection14);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.util.Set<java.lang.String> strSet0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet1 = java.util.Collections.synchronizedSet(strSet0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        boolean boolean5 = constantDescSet1.isEmpty();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 100.0d);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator8 = constantDescSet1.spliterator();
        boolean boolean10 = constantDescSet1.remove((java.lang.Object) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc11 = constantDescSet1.last();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 1L, (java.lang.constant.ConstantDesc) 0L);
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator7 = constantDescSet3.comparator();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator7);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet8);
        boolean boolean10 = constantDescSet8.isEmpty();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator11 = constantDescSet8.spliterator();
        java.util.Map<java.util.Spliterator<java.lang.constant.ConstantDesc>, java.lang.constant.Constable> constantDescSpliteratorMap13 = java.util.Collections.singletonMap(constantDescSpliterator11, (java.lang.constant.Constable) (short) -1);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(wildcardComparator7);
        org.junit.Assert.assertNotNull(constantDescSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator11);
        org.junit.Assert.assertNotNull(constantDescSpliteratorMap13);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet8 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 1L, true, (java.lang.constant.ConstantDesc) 134, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Integer (java.lang.Long and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator2);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.util.Map<java.lang.Iterable<java.lang.String>, java.util.stream.Stream<java.lang.String>[]> strIterableMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(strIterableMap0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator4 = java.util.Collections.reverseOrder(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNotNull(constantDescComparator4);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.util.Map<java.util.ListIterator<java.io.Serializable>[], java.lang.CharSequence> serializableItorArrayMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(serializableItorArrayMap0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap0 = java.util.Collections.emptyNavigableMap();
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap1 = java.util.Collections.synchronizedNavigableMap(strComparableMapMap0);
        java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap2 = java.util.Collections.synchronizedSortedMap((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap0);
        java.lang.Class<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableMapClass3 = null;
        java.lang.Class<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetClass4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap5 = java.util.Collections.checkedNavigableMap(strComparableMapMap0, strComparableMapClass3, constantDescSetClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableMapMap0);
        org.junit.Assert.assertNotNull(strComparableMapMap1);
        org.junit.Assert.assertNotNull(strComparableMapMap2);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator7 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet8.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean12 = constantDescSet8.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator13 = constantDescSet8.spliterator();
        java.lang.Object obj14 = constantDescSet8.clone();
        boolean boolean15 = constantDescSet8.isEmpty();
        boolean boolean16 = constantDescSet1.equals((java.lang.Object) constantDescSet8);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator17 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet18 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator17);
        java.lang.constant.ConstantDesc constantDesc20 = constantDescSet18.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean22 = constantDescSet18.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor23 = constantDescSet18.iterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet26 = constantDescSet18.tailSet((java.lang.constant.ConstantDesc) 10.0d, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = constantDescSet8.contains((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Integer (java.lang.Double and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescComparator7);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(constantDescComparator17);
        org.junit.Assert.assertNull(constantDesc20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(constantDescItor23);
        org.junit.Assert.assertNotNull(constantDescSet26);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet4 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 10.0f);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.unmodifiableSortedSet(constantDescSet6);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(constantDescSet7);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.util.NavigableMap<TestingRandoop, java.util.Enumeration<java.lang.String>> testingRandoopMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(testingRandoopMap0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet0 = null;
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet2 = java.util.Collections.checkedNavigableSet(constantDescSet0, constantDescClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: c");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap0 = java.util.Collections.emptyNavigableMap();
        java.lang.Class<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableMapClass1 = null;
        java.lang.Class<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetClass2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap3 = java.util.Collections.checkedSortedMap((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap0, strComparableMapClass1, constantDescSetClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableMapMap0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.util.Enumeration<java.lang.String> strEnumeration0 = null;
        java.util.Set<java.util.Enumeration<java.lang.String>> strEnumerationSet1 = java.util.Collections.singleton(strEnumeration0);
        org.junit.Assert.assertNotNull(strEnumerationSet1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor2 = constantDescSet1.descendingIterator();
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator3 = constantDescSet1.comparator();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc5 = constantDescSet4.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescItor2);
        org.junit.Assert.assertNotNull(wildcardComparator3);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.descendingIterator();
        int int7 = constantDescSet1.size();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.util.Comparator<java.lang.Class<?>[][]> wildcardClassArrayComparator0 = java.util.Collections.reverseOrder();
        org.junit.Assert.assertNotNull(wildcardClassArrayComparator0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet7 = java.util.Collections.emptySet();
        boolean boolean8 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet6, (java.util.Collection<java.lang.String>) strSet7);
        boolean boolean9 = constantDescSet1.removeAll((java.util.Collection<java.lang.String>) strSet7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet1.pollFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet15 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) 1, true, (java.lang.constant.ConstantDesc) 45, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromKey > toKey");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 0.0f + "'", constantDesc10, 0.0f);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        boolean boolean5 = constantDescSet1.isEmpty();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) (-1.0d));
        java.lang.Object obj8 = null;
        boolean boolean9 = constantDescSet1.equals(obj8);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 10.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet8 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet7);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet9 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet7);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet10 = java.util.Collections.synchronizedNavigableSet(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescSet8);
        org.junit.Assert.assertNotNull(constantDescSet9);
        org.junit.Assert.assertNotNull(constantDescSet10);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet12 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) 0.0d, true, (java.lang.constant.ConstantDesc) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Long (java.lang.Double and java.lang.Long are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescSet7);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum((int) (byte) 0, (int) '#');
        int int6 = testingRandoop0.sum((int) ' ', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 33 + "'", int6 == 33);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.descendingIterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 1L);
        java.lang.Object obj10 = constantDescSet1.clone();
        java.lang.String str11 = constantDescSet1.toString();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.last();
        java.lang.Object obj9 = constantDescSet1.clone();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 1 + "'", constantDesc8, 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[1]");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollLast();
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 45);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 1 + "'", constantDesc6, 1);
        org.junit.Assert.assertNull(constantDesc8);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.iterator();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
        boolean boolean8 = constantDescSet1.retainAll((java.util.Collection<java.lang.String>) strSet7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet1.higher((java.lang.constant.ConstantDesc) 2);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(constantDesc10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.lang.Object obj7 = constantDescSet1.clone();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor9 = constantDescSet1.descendingIterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet10 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet11 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet10);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[1]");
        org.junit.Assert.assertNotNull(constantDescItor9);
        org.junit.Assert.assertNotNull(constantDescSet10);
        org.junit.Assert.assertNotNull(constantDescSet11);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator5 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet6 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator5);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet6.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean10 = constantDescSet6.remove((java.lang.Object) (byte) -1);
        boolean boolean11 = constantDescSet3.equals((java.lang.Object) boolean10);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.Set<java.lang.String> strSet19 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet20 = java.util.Collections.synchronizedSet(strSet19);
        boolean boolean21 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList16, (java.util.Collection<java.lang.String>) strSet19);
        java.lang.Class<?> wildcardClass22 = strSet19.getClass();
        java.util.Set set23 = java.util.Collections.EMPTY_SET;
        java.lang.Class<?> wildcardClass24 = set23.getClass();
        java.util.Set<java.lang.invoke.TypeDescriptor> typeDescriptorSet25 = java.util.Collections.singleton((java.lang.invoke.TypeDescriptor) wildcardClass24);
        java.lang.Class[] classArray27 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        wildcardClassArray28[0] = wildcardClass22;
        wildcardClassArray28[1] = wildcardClass24;
        java.lang.Class<?>[] wildcardClassArray33 = constantDescSet3.toArray(wildcardClassArray28);
        boolean boolean34 = constantDescSet3.isEmpty();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet35 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet40 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 1.0f, false, (java.lang.constant.ConstantDesc) 100L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Long (java.lang.Float and java.lang.Long are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator5);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(typeDescriptorSet25);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(constantDescSet35);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet8 = java.util.Collections.unmodifiableSortedSet(constantDescSet7);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet9 = java.util.Collections.synchronizedSortedSet(constantDescSet8);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescSet8);
        org.junit.Assert.assertNotNull(constantDescSet9);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator5 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet6 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator5);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet6.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean10 = constantDescSet6.remove((java.lang.Object) (byte) -1);
        boolean boolean11 = constantDescSet3.equals((java.lang.Object) boolean10);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.Set<java.lang.String> strSet19 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet20 = java.util.Collections.synchronizedSet(strSet19);
        boolean boolean21 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList16, (java.util.Collection<java.lang.String>) strSet19);
        java.lang.Class<?> wildcardClass22 = strSet19.getClass();
        java.util.Set set23 = java.util.Collections.EMPTY_SET;
        java.lang.Class<?> wildcardClass24 = set23.getClass();
        java.util.Set<java.lang.invoke.TypeDescriptor> typeDescriptorSet25 = java.util.Collections.singleton((java.lang.invoke.TypeDescriptor) wildcardClass24);
        java.lang.Class[] classArray27 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        wildcardClassArray28[0] = wildcardClass22;
        wildcardClassArray28[1] = wildcardClass24;
        java.lang.Class<?>[] wildcardClassArray33 = constantDescSet3.toArray(wildcardClassArray28);
        boolean boolean34 = constantDescSet3.isEmpty();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet35 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        constantDescSet3.clear();
        java.util.TreeSet<java.lang.String> strSet37 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet38 = java.util.Collections.emptySet();
        boolean boolean39 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet37, (java.util.Collection<java.lang.String>) strSet38);
        java.util.Set<java.lang.String> strSet40 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.String>) strSet37);
        java.util.Set<java.lang.String> strSet42 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet43 = java.util.Collections.synchronizedSet(strSet42);
        boolean boolean44 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet37, (java.util.Collection<java.lang.String>) strSet42);
        java.util.Collection<java.lang.String> strCollection45 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>) strSet37);
        boolean boolean46 = constantDescSet3.removeAll((java.util.Collection<java.lang.String>) strSet37);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator5);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(typeDescriptorSet25);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(constantDescSet35);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strCollection45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.util.Map<java.util.Collection<java.lang.String>[], java.lang.CharSequence> strCollectionArrayMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(strCollectionArrayMap0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet7 = java.util.Collections.emptySet();
        boolean boolean8 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet6, (java.util.Collection<java.lang.String>) strSet7);
        boolean boolean9 = constantDescSet1.removeAll((java.util.Collection<java.lang.String>) strSet7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet1.pollFirst();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator11 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator12 = java.util.Collections.reverseOrder(constantDescComparator11);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet13 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator11);
        java.util.Set<java.lang.String> strSet15 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet16 = java.util.Collections.synchronizedSet(strSet15);
        java.util.TreeSet<java.lang.String> strSet17 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet15);
        boolean boolean18 = constantDescSet13.retainAll((java.util.Collection<java.lang.String>) strSet15);
        boolean boolean19 = constantDescSet1.equals((java.lang.Object) strSet15);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet21 = java.util.Collections.checkedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1, constantDescClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 0.0f + "'", constantDesc10, 0.0f);
        org.junit.Assert.assertNotNull(constantDescComparator11);
        org.junit.Assert.assertNotNull(constantDescComparator12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.util.Map<java.lang.invoke.TypeDescriptor, java.util.Collection<java.lang.String>[]> typeDescriptorMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(typeDescriptorMap0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.String str4 = constantDescSet1.toString();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.util.ListIterator<java.util.stream.BaseStream<java.lang.String, java.util.stream.Stream<java.lang.String>>> strBaseStreamItor0 = java.util.Collections.emptyListIterator();
        org.junit.Assert.assertNotNull(strBaseStreamItor0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator1);
        java.lang.Object[] objArray3 = constantDescSet2.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet2);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet2.descendingSet();
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet2.lower((java.lang.constant.ConstantDesc) 10.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet8 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet2);
        java.util.List<java.util.SortedSet<java.lang.constant.ConstantDesc>> constantDescSetList9 = java.util.Collections.nCopies(10, (java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet8);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet10 = java.util.Collections.unmodifiableNavigableSet(constantDescSet8);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNotNull(constantDescSet8);
        org.junit.Assert.assertNotNull(constantDescSetList9);
        org.junit.Assert.assertNotNull(constantDescSet10);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet6 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet8 = java.util.Collections.checkedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1, constantDescClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSet6);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.util.ListIterator<java.lang.Object> objItor0 = java.util.Collections.emptyListIterator();
        org.junit.Assert.assertNotNull(objItor0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.util.Set<java.util.AbstractSet<java.lang.constant.ConstantDesc>> constantDescSetSet0 = java.util.Collections.emptySet();
        org.junit.Assert.assertNotNull(constantDescSetSet0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet7 = java.util.Collections.emptySet();
        boolean boolean8 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet6, (java.util.Collection<java.lang.String>) strSet7);
        boolean boolean9 = constantDescSet1.removeAll((java.util.Collection<java.lang.String>) strSet7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet1.pollFirst();
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator11 = constantDescSet1.comparator();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator12 = java.util.Collections.reverseOrder((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator11);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet13 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator11);
        constantDescSet13.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc15 = constantDescSet13.last();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 0.0f + "'", constantDesc10, 0.0f);
        org.junit.Assert.assertNotNull(wildcardComparator11);
        org.junit.Assert.assertNotNull(constantDescComparator12);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator2);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator4 = java.util.Collections.reverseOrder(constantDescComparator2);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator5 = java.util.Collections.reverseOrder(constantDescComparator4);
        java.util.Map<java.lang.Object, java.lang.String> objMap7 = java.util.Collections.singletonMap((java.lang.Object) constantDescComparator4, "[]");
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertNotNull(constantDescComparator4);
        org.junit.Assert.assertNotNull(constantDescComparator5);
        org.junit.Assert.assertNotNull(objMap7);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.util.Iterator<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableMapItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(strComparableMapItor0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
        boolean boolean8 = constantDescSet1.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.stream.Stream<java.lang.String> strStream9 = strSet7.parallelStream();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strStream9);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc[] constantDescArray12 = new java.lang.constant.ConstantDesc[] { 1.0f, 100.0d, 10L, (-1), 10.0f, 10L };
        java.lang.constant.ConstantDesc[] constantDescArray13 = constantDescSet1.toArray(constantDescArray12);
        java.lang.constant.ConstantDesc constantDesc14 = constantDescSet1.last();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator15 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet16 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator15);
        java.lang.Object[] objArray17 = constantDescSet16.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet18 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet16);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet19 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet18);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator20 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet21 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator20);
        java.lang.constant.ConstantDesc constantDesc23 = constantDescSet21.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean25 = constantDescSet21.remove((java.lang.Object) (byte) -1);
        boolean boolean26 = constantDescSet18.equals((java.lang.Object) boolean25);
        boolean boolean27 = constantDescSet1.equals((java.lang.Object) constantDescSet18);
        boolean boolean29 = constantDescSet1.add((java.lang.constant.ConstantDesc) 2);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescArray12);
        org.junit.Assert.assertNotNull(constantDescArray13);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 1 + "'", constantDesc14, 1);
        org.junit.Assert.assertNotNull(constantDescComparator15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator20);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder(constantDescComparator1);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator3 = java.util.Collections.reverseOrder(constantDescComparator1);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertNotNull(constantDescComparator3);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 1L, (java.lang.constant.ConstantDesc) 0L);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        constantDescSet3.clear();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(constantDescSet7);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.util.Map<java.lang.AutoCloseable, java.util.ListIterator<java.io.Serializable>[]> autoCloseableMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(autoCloseableMap0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Set<java.util.AbstractSet<java.lang.constant.ConstantDesc>> constantDescSetSet6 = java.util.Collections.singleton((java.util.AbstractSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet7 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc9 = constantDescSet7.lower((java.lang.constant.ConstantDesc) "[1]");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Float (java.lang.String and java.lang.Float are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSetSet6);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.util.NavigableSet<java.lang.Comparable<java.lang.String>> strComparableSet0 = java.util.Collections.emptyNavigableSet();
        org.junit.Assert.assertNotNull(strComparableSet0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum((int) (byte) 0, (int) '#');
        int int6 = testingRandoop0.sum((int) (short) -1, 0);
        int int9 = testingRandoop0.sum((int) (short) 1, (int) (short) 1);
        int int12 = testingRandoop0.sum(3, 51);
        int int15 = testingRandoop0.sum(0, (-1));
        int int19 = testingRandoop0.sum(196, 35, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 54 + "'", int12 == 54);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 230 + "'", int19 == 230);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.iterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 10.0d, false);
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator10 = constantDescSet1.comparator();
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet12 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1, constantDescClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNotNull(constantDescSet9);
        org.junit.Assert.assertNotNull(wildcardComparator10);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.util.Comparator<java.util.ArrayList<java.lang.String>> strListComparator0 = java.util.Collections.reverseOrder();
        org.junit.Assert.assertNotNull(strListComparator0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet4 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = java.util.Collections.unmodifiableSortedSet(constantDescSet4);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNotNull(constantDescSet5);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum((int) (byte) 0, (int) '#');
        int int6 = testingRandoop0.sum((int) (short) -1, 0);
        int int10 = testingRandoop0.sum((int) (byte) 0, (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.util.List<java.util.List> listList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(listList0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.util.Comparator<java.lang.Cloneable> cloneableComparator0 = java.util.Collections.reverseOrder();
        org.junit.Assert.assertNotNull(cloneableComparator0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.util.SortedMap<java.lang.Class<?>[][], java.util.stream.Stream<java.lang.String>[]> wildcardClassArrayMap0 = java.util.Collections.emptySortedMap();
        org.junit.Assert.assertNotNull(wildcardClassArrayMap0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.descendingIterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 1L);
        java.lang.Object[] objArray10 = constantDescSet1.toArray();
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator11 = constantDescSet1.comparator();
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet13 = java.util.Collections.emptySet();
        boolean boolean14 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet12, (java.util.Collection<java.lang.String>) strSet13);
        java.util.Set<java.lang.String> strSet15 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.String>) strSet12);
        boolean boolean16 = constantDescSet1.containsAll((java.util.Collection<java.lang.String>) strSet12);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardComparator11);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator1);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.util.Set<java.lang.Object> objSet0 = java.util.Collections.emptySet();
        org.junit.Assert.assertNotNull(objSet0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator7 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet8.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean12 = constantDescSet8.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator13 = constantDescSet8.spliterator();
        java.lang.Object obj14 = constantDescSet8.clone();
        boolean boolean15 = constantDescSet8.isEmpty();
        boolean boolean16 = constantDescSet1.equals((java.lang.Object) constantDescSet8);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet17 = constantDescSet1.descendingSet();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet18 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet17);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescComparator7);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(constantDescSet17);
        org.junit.Assert.assertNotNull(constantDescSet18);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor2 = constantDescSet1.descendingIterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet3 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet4 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.checkedSortedSet(constantDescSet5, constantDescClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescItor2);
        org.junit.Assert.assertNotNull(constantDescSet3);
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNotNull(constantDescSet5);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 10.0d);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 2);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor9 = constantDescSet1.iterator();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNotNull(constantDescItor9);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = null;
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator1);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.util.List<java.util.Iterator<java.io.Serializable>> serializableItorList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(serializableItorList0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 10.0d);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 2);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNotNull(constantDescSet9);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.lang.Object obj7 = constantDescSet1.clone();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Set<java.lang.String> strSet10 = java.util.Collections.singleton("hi!");
        java.util.Enumeration<java.lang.String> strEnumeration11 = java.util.Collections.enumeration((java.util.Collection<java.lang.String>) strSet10);
        boolean boolean12 = constantDescSet1.retainAll((java.util.Collection<java.lang.String>) strSet10);
        java.util.Set<java.lang.Object> objSet13 = java.util.Collections.singleton((java.lang.Object) constantDescSet1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor14 = constantDescSet1.descendingIterator();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[1]");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strEnumeration11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objSet13);
        org.junit.Assert.assertNotNull(constantDescItor14);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.util.List<java.lang.String> strList2 = java.util.Collections.nCopies((int) ' ', "hi!");
        java.util.stream.Stream<java.lang.String> strStream3 = strList2.parallelStream();
        java.util.stream.Stream<java.lang.String> strStream4 = strList2.parallelStream();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strStream3);
        org.junit.Assert.assertNotNull(strStream4);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.util.ListIterator<java.lang.reflect.Type> typeItor0 = java.util.Collections.emptyListIterator();
        org.junit.Assert.assertNotNull(typeItor0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.descendingIterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 1L);
        java.lang.Object[] objArray10 = constantDescSet1.toArray();
        java.lang.constant.ConstantDesc constantDesc11 = constantDescSet1.pollFirst();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc4 = constantDescSet1.last();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.stream.Stream<java.lang.String> strStream1 = strSet0.stream();
        java.util.Set<java.lang.String> strSet3 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet4 = java.util.Collections.synchronizedSet(strSet3);
        java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet3);
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap6 = java.util.Collections.emptyNavigableMap();
        java.util.List<java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>> comparableMapMapList7 = java.util.Collections.singletonList((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap6);
        java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap8 = java.util.Collections.synchronizedSortedMap((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap6);
        int int9 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strSet3, (java.lang.Object) strComparableMapMap8);
        int int10 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strSet0, (java.lang.Object) strSet3);
        java.util.Enumeration<java.lang.String> strEnumeration11 = java.util.Collections.enumeration((java.util.Collection<java.lang.String>) strSet3);
        java.lang.Class<java.lang.String> strClass12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.String> strCollection13 = java.util.Collections.checkedCollection((java.util.Collection<java.lang.String>) strSet3, strClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strStream1);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strComparableMapMap6);
        org.junit.Assert.assertNotNull(comparableMapMapList7);
        org.junit.Assert.assertNotNull(strComparableMapMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strEnumeration11);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator3 = java.util.Collections.reverseOrder(constantDescComparator2);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator4 = java.util.Collections.reverseOrder(constantDescComparator2);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertNotNull(constantDescComparator3);
        org.junit.Assert.assertNotNull(constantDescComparator4);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet7 = java.util.Collections.emptySet();
        boolean boolean8 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet6, (java.util.Collection<java.lang.String>) strSet7);
        boolean boolean9 = constantDescSet1.removeAll((java.util.Collection<java.lang.String>) strSet7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet1.pollFirst();
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator11 = constantDescSet1.comparator();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator12 = java.util.Collections.reverseOrder((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator11);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator13 = java.util.Collections.reverseOrder((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator11);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet14 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator11);
        java.lang.Object[] objArray15 = constantDescSet14.toArray();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet16 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet14);
        java.lang.constant.ConstantDesc constantDesc18 = constantDescSet14.lower((java.lang.constant.ConstantDesc) 230);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 0.0f + "'", constantDesc10, 0.0f);
        org.junit.Assert.assertNotNull(wildcardComparator11);
        org.junit.Assert.assertNotNull(constantDescComparator12);
        org.junit.Assert.assertNotNull(constantDescComparator13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(constantDescSet16);
        org.junit.Assert.assertNull(constantDesc18);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator7 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet8.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean12 = constantDescSet8.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator13 = constantDescSet8.spliterator();
        java.lang.Object obj14 = constantDescSet8.clone();
        boolean boolean15 = constantDescSet8.isEmpty();
        boolean boolean16 = constantDescSet1.equals((java.lang.Object) constantDescSet8);
        java.lang.constant.ConstantDesc constantDesc17 = constantDescSet8.first();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescComparator7);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + constantDesc17 + "' != '" + 1 + "'", constantDesc17, 1);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        boolean boolean6 = constantDescSet1.isEmpty();
        constantDescSet1.clear();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet6 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) (-1L), true);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator10 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet11 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator10);
        java.lang.Object[] objArray12 = constantDescSet11.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet13 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet11);
        java.lang.constant.ConstantDesc constantDesc15 = constantDescSet11.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc16 = constantDescSet11.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet17 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet11);
        java.util.List<java.lang.String> strList20 = java.util.Collections.nCopies((int) ' ', "hi!");
        boolean boolean21 = constantDescSet11.containsAll((java.util.Collection<java.lang.String>) strList20);
        java.util.Set<java.lang.String> strSet22 = java.util.Collections.emptySet();
        boolean boolean23 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList20, (java.util.Collection<java.lang.String>) strSet22);
        java.lang.Object obj24 = null;
        int int25 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strList20, obj24);
        boolean boolean26 = constantDescSet1.removeAll((java.util.Collection<java.lang.String>) strList20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc27 = constantDescSet1.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(constantDescSet9);
        org.junit.Assert.assertNotNull(constantDescComparator10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertNull(constantDesc16);
        org.junit.Assert.assertNotNull(constantDescSet17);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.last();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet9 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet1.pollFirst();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 1 + "'", constantDesc8, 1);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 1 + "'", constantDesc10, 1);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = java.util.Collections.synchronizedMap(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc[] constantDescArray12 = new java.lang.constant.ConstantDesc[] { 1.0f, 100.0d, 10L, (-1), 10.0f, 10L };
        java.lang.constant.ConstantDesc[] constantDescArray13 = constantDescSet1.toArray(constantDescArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc15 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Integer (java.lang.Long and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescArray12);
        org.junit.Assert.assertNotNull(constantDescArray13);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollLast();
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.higher((java.lang.constant.ConstantDesc) "[]");
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 1 + "'", constantDesc6, 1);
        org.junit.Assert.assertNull(constantDesc8);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.util.List<java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>> comparableMapMapList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(comparableMapMapList0);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.util.Iterator<java.lang.constant.ConstantDesc[]> constantDescArrayItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(constantDescArrayItor0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.Object obj5 = constantDescSet1.clone();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        int int7 = constantDescSet1.size();
        java.lang.Object[] objArray8 = constantDescSet1.toArray();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[]");
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.util.NavigableSet<java.lang.CharSequence> charSequenceSet0 = java.util.Collections.emptyNavigableSet();
        org.junit.Assert.assertNotNull(charSequenceSet0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.util.NavigableSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet0 = java.util.Collections.emptyNavigableSet();
        org.junit.Assert.assertNotNull(serializableItorSet0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 1L, (java.lang.constant.ConstantDesc) 0L);
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator7 = constantDescSet3.comparator();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator7);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet8);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet10 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet8);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet12 = java.util.Collections.checkedNavigableSet(constantDescSet10, constantDescClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(wildcardComparator7);
        org.junit.Assert.assertNotNull(constantDescSet9);
        org.junit.Assert.assertNotNull(constantDescSet10);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.descendingIterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.higher((java.lang.constant.ConstantDesc) 54);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNull(constantDesc9);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet6 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1, constantDescClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.util.List<java.lang.invoke.TypeDescriptor> typeDescriptorList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(typeDescriptorList0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.util.Map<java.lang.Object, java.lang.invoke.TypeDescriptor> objMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(objMap0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.Object obj5 = constantDescSet1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.last();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[]");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet3.tailSet((java.lang.constant.ConstantDesc) (-1), false);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.unmodifiableNavigableSet(constantDescSet6);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet8 = java.util.Collections.synchronizedNavigableSet(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescSet8);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.lang.Object obj7 = constantDescSet1.clone();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Set<java.lang.String> strSet10 = java.util.Collections.singleton("hi!");
        java.util.Enumeration<java.lang.String> strEnumeration11 = java.util.Collections.enumeration((java.util.Collection<java.lang.String>) strSet10);
        boolean boolean12 = constantDescSet1.retainAll((java.util.Collection<java.lang.String>) strSet10);
        java.lang.Class<?> wildcardClass13 = strSet10.getClass();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[1]");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strEnumeration11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap0 = java.util.Collections.emptyNavigableMap();
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap1 = java.util.Collections.synchronizedNavigableMap(strComparableMapMap0);
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap2 = java.util.Collections.synchronizedNavigableMap(strComparableMapMap0);
        java.lang.Class<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableMapClass3 = null;
        java.lang.Class<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetClass4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap5 = java.util.Collections.checkedNavigableMap(strComparableMapMap0, strComparableMapClass3, constantDescSetClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableMapMap0);
        org.junit.Assert.assertNotNull(strComparableMapMap1);
        org.junit.Assert.assertNotNull(strComparableMapMap2);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet1 = java.util.Collections.emptySet();
        boolean boolean2 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet0, (java.util.Collection<java.lang.String>) strSet1);
        java.util.Set<java.lang.String> strSet3 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.String>) strSet0);
        java.util.Set<java.lang.String> strSet5 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet6 = java.util.Collections.synchronizedSet(strSet5);
        boolean boolean7 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet0, (java.util.Collection<java.lang.String>) strSet5);
        java.util.Collection<java.lang.String> strCollection8 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>) strSet0);
        java.lang.Class<?> wildcardClass9 = strSet0.getClass();
        java.util.List<java.lang.reflect.Type> typeList10 = java.util.Collections.singletonList((java.lang.reflect.Type) wildcardClass9);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeList10);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet4 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.descendingSet();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet6 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSet6);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.util.NavigableMap<java.util.stream.Stream<java.lang.String>[], java.lang.Comparable<java.lang.String>> strStreamArrayMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(strStreamArrayMap0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "[]");
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet8 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) (-1.0f), true, (java.lang.constant.ConstantDesc) (-1.0f), false);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet11 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 0L, true);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet14 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 45, false);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet8);
        org.junit.Assert.assertNotNull(constantDescSet11);
        org.junit.Assert.assertNotNull(constantDescSet14);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum(0, 1);
        int int6 = testingRandoop0.sum(45, 54);
        int int10 = testingRandoop0.sum((int) (byte) 0, 3, 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 102 + "'", int10 == 102);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
        boolean boolean8 = constantDescSet1.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.Set<java.lang.String> strSet9 = java.util.Collections.unmodifiableSet((java.util.Set<java.lang.String>) strSet7);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator10 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet11 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator10);
        java.lang.constant.ConstantDesc constantDesc13 = constantDescSet11.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet15 = constantDescSet11.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet16 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet11);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet17 = java.util.Collections.unmodifiableNavigableSet(constantDescSet16);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet18 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet17);
        int int19 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strSet7, (java.lang.Object) constantDescSet17);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet20 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet17);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(constantDescComparator10);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertNotNull(constantDescSet15);
        org.junit.Assert.assertNotNull(constantDescSet16);
        org.junit.Assert.assertNotNull(constantDescSet17);
        org.junit.Assert.assertNotNull(constantDescSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(constantDescSet20);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        boolean boolean5 = constantDescSet1.isEmpty();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) (-1.0d));
        java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
        java.util.stream.Stream<java.lang.String> strStream9 = strSet8.stream();
        java.util.Set<java.lang.AutoCloseable> autoCloseableSet10 = java.util.Collections.singleton((java.lang.AutoCloseable) strStream9);
        boolean boolean11 = constantDescSet1.equals((java.lang.Object) strStream9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc12 = constantDescSet1.last();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertNotNull(autoCloseableSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "[]");
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        constantDescSet1.clear();
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet1.pollLast();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator1);
        java.lang.constant.ConstantDesc constantDesc4 = constantDescSet2.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean6 = constantDescSet2.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Set<java.util.AbstractSet<java.lang.constant.ConstantDesc>> constantDescSetSet7 = java.util.Collections.singleton((java.util.AbstractSet<java.lang.constant.ConstantDesc>) constantDescSet2);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator8 = constantDescSet2.spliterator();
        java.lang.Class<?> wildcardClass9 = constantDescSpliterator8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.invoke.TypeDescriptor> typeDescriptorList10 = java.util.Collections.nCopies((int) (short) -1, (java.lang.invoke.TypeDescriptor) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(constantDescSetSet7);
        org.junit.Assert.assertNotNull(constantDescSpliterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator1);
        java.lang.constant.ConstantDesc constantDesc4 = constantDescSet2.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean6 = constantDescSet2.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Set<java.util.AbstractSet<java.lang.constant.ConstantDesc>> constantDescSetSet7 = java.util.Collections.singleton((java.util.AbstractSet<java.lang.constant.ConstantDesc>) constantDescSet2);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator8 = constantDescSet2.spliterator();
        java.lang.Class<?> wildcardClass9 = constantDescSpliterator8.getClass();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator10 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet11 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator10);
        java.lang.Object[] objArray12 = constantDescSet11.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet13 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet11);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet14 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet13);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator15 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet16 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator15);
        java.lang.constant.ConstantDesc constantDesc18 = constantDescSet16.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean20 = constantDescSet16.remove((java.lang.Object) (byte) -1);
        boolean boolean21 = constantDescSet13.equals((java.lang.Object) boolean20);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.Set<java.lang.String> strSet29 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet30 = java.util.Collections.synchronizedSet(strSet29);
        boolean boolean31 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList26, (java.util.Collection<java.lang.String>) strSet29);
        java.lang.Class<?> wildcardClass32 = strSet29.getClass();
        java.util.Set set33 = java.util.Collections.EMPTY_SET;
        java.lang.Class<?> wildcardClass34 = set33.getClass();
        java.util.Set<java.lang.invoke.TypeDescriptor> typeDescriptorSet35 = java.util.Collections.singleton((java.lang.invoke.TypeDescriptor) wildcardClass34);
        java.lang.Class[] classArray37 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        wildcardClassArray38[0] = wildcardClass32;
        wildcardClassArray38[1] = wildcardClass34;
        java.lang.Class<?>[] wildcardClassArray43 = constantDescSet13.toArray(wildcardClassArray38);
        java.util.Map<java.lang.Class<?>, java.lang.Class<?>[]> wildcardClassMap44 = java.util.Collections.singletonMap(wildcardClass9, wildcardClassArray43);
        java.util.List<java.lang.reflect.AnnotatedElement> annotatedElementList45 = java.util.Collections.singletonList((java.lang.reflect.AnnotatedElement) wildcardClass9);
        java.util.List<java.lang.reflect.AnnotatedElement> annotatedElementList46 = java.util.Collections.nCopies((int) (short) 10, (java.lang.reflect.AnnotatedElement) wildcardClass9);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(constantDescSetSet7);
        org.junit.Assert.assertNotNull(constantDescSpliterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(constantDescComparator10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator15);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(typeDescriptorSet35);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassMap44);
        org.junit.Assert.assertNotNull(annotatedElementList45);
        org.junit.Assert.assertNotNull(annotatedElementList46);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.util.NavigableMap<java.util.ListIterator<java.io.Serializable>, java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>> serializableItorMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(serializableItorMap0);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap0 = java.util.Collections.emptyNavigableMap();
        java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap1 = java.util.Collections.synchronizedSortedMap((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap0);
        java.lang.Class<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableMapClass2 = null;
        java.lang.Class<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap4 = java.util.Collections.checkedNavigableMap(strComparableMapMap0, strComparableMapClass2, constantDescSetClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableMapMap0);
        org.junit.Assert.assertNotNull(strComparableMapMap1);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Set<java.util.AbstractSet<java.lang.constant.ConstantDesc>> constantDescSetSet6 = java.util.Collections.singleton((java.util.AbstractSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.ceiling((java.lang.constant.ConstantDesc) 1.0f);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet10 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 100.0f);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSetSet6);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 0.0f + "'", constantDesc8, 0.0f);
        org.junit.Assert.assertNotNull(constantDescSet10);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet8 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0L, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet11 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) 1L, (java.lang.constant.ConstantDesc) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Integer (java.lang.Long and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNotNull(constantDescSet8);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.util.Map<java.lang.reflect.AnnotatedElement, java.util.Set<java.lang.String>> annotatedElementMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(annotatedElementMap0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet2.tailSet((java.lang.constant.ConstantDesc) 0.0f, true);
        java.lang.Class<?> wildcardClass6 = constantDescSet5.getClass();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 0);
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.ceiling((java.lang.constant.ConstantDesc) 35);
        java.lang.constant.ConstantDesc constantDesc11 = constantDescSet1.floor((java.lang.constant.ConstantDesc) 99);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        int int4 = constantDescSet1.size();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(constantDescSet5);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.lang.Object[] objArray6 = constantDescSet1.toArray();
        int int7 = constantDescSet1.size();
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 134);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(constantDesc9);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.util.Map<java.lang.Object, java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>> objMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(objMap0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.lang.Object obj7 = constantDescSet1.clone();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Set<java.lang.String> strSet10 = java.util.Collections.singleton("hi!");
        java.util.Enumeration<java.lang.String> strEnumeration11 = java.util.Collections.enumeration((java.util.Collection<java.lang.String>) strSet10);
        boolean boolean12 = constantDescSet1.retainAll((java.util.Collection<java.lang.String>) strSet10);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet14 = java.util.Collections.checkedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1, constantDescClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[1]");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strEnumeration11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.List<java.lang.String> strList6 = java.util.Collections.nCopies((int) ' ', "hi!");
        java.util.stream.Stream<java.lang.String> strStream7 = strList6.parallelStream();
        boolean boolean8 = constantDescSet3.removeAll((java.util.Collection<java.lang.String>) strList6);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet10 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3, constantDescClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc[] constantDescArray12 = new java.lang.constant.ConstantDesc[] { 1.0f, 100.0d, 10L, (-1), 10.0f, 10L };
        java.lang.constant.ConstantDesc[] constantDescArray13 = constantDescSet1.toArray(constantDescArray12);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor14 = constantDescSet1.descendingIterator();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator15 = constantDescSet1.spliterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet16 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        boolean boolean17 = constantDescSet1.isEmpty();
        java.lang.constant.ConstantDesc constantDesc18 = constantDescSet1.pollFirst();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescArray12);
        org.junit.Assert.assertNotNull(constantDescArray13);
        org.junit.Assert.assertNotNull(constantDescItor14);
        org.junit.Assert.assertNotNull(constantDescSpliterator15);
        org.junit.Assert.assertNotNull(constantDescSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + constantDesc18 + "' != '" + 1 + "'", constantDesc18, 1);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 1L, (java.lang.constant.ConstantDesc) 0L);
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator7 = constantDescSet3.comparator();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator7);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor9 = constantDescSet8.descendingIterator();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(wildcardComparator7);
        org.junit.Assert.assertNotNull(constantDescItor9);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "[1]" };
        java.util.List<java.lang.String[]> strArrayList6 = java.util.Collections.nCopies(236, strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArrayList6);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.lang.String str7 = constantDescSet1.toString();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet10 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 236, false);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(constantDescSet10);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        java.util.List<java.util.Set<java.lang.String>> strSetList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(strSetList0);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet3.tailSet((java.lang.constant.ConstantDesc) (-1), false);
        java.lang.Object obj7 = constantDescSet3.clone();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator8 = constantDescSet3.spliterator();
        constantDescSet3.clear();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet10 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet12 = java.util.Collections.checkedNavigableSet(constantDescSet10, constantDescClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[]");
        org.junit.Assert.assertNotNull(constantDescSpliterator8);
        org.junit.Assert.assertNotNull(constantDescSet10);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.util.SortedSet<java.util.NavigableSet<java.lang.constant.ConstantDesc>> constantDescSetSet0 = java.util.Collections.emptySortedSet();
        org.junit.Assert.assertNotNull(constantDescSetSet0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        boolean boolean5 = constantDescSet3.add((java.lang.constant.ConstantDesc) 10);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 0.0d);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(constantDescSet6);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.descendingIterator();
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "");
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor9 = constantDescSet1.descendingIterator();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNotNull(constantDescItor9);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet1 = java.util.Collections.emptySet();
        boolean boolean2 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet0, (java.util.Collection<java.lang.String>) strSet1);
        java.util.Set<java.lang.String> strSet3 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.String>) strSet0);
        java.util.Enumeration<java.lang.String> strEnumeration4 = java.util.Collections.enumeration((java.util.Collection<java.lang.String>) strSet3);
        java.util.List<java.util.Enumeration<java.lang.String>> strEnumerationList5 = java.util.Collections.singletonList(strEnumeration4);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertNotNull(strEnumerationList5);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator5 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet6 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator5);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet6.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean10 = constantDescSet6.remove((java.lang.Object) (byte) -1);
        boolean boolean11 = constantDescSet3.equals((java.lang.Object) boolean10);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.Set<java.lang.String> strSet19 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet20 = java.util.Collections.synchronizedSet(strSet19);
        boolean boolean21 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList16, (java.util.Collection<java.lang.String>) strSet19);
        java.lang.Class<?> wildcardClass22 = strSet19.getClass();
        java.util.Set set23 = java.util.Collections.EMPTY_SET;
        java.lang.Class<?> wildcardClass24 = set23.getClass();
        java.util.Set<java.lang.invoke.TypeDescriptor> typeDescriptorSet25 = java.util.Collections.singleton((java.lang.invoke.TypeDescriptor) wildcardClass24);
        java.lang.Class[] classArray27 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        wildcardClassArray28[0] = wildcardClass22;
        wildcardClassArray28[1] = wildcardClass24;
        java.lang.Class<?>[] wildcardClassArray33 = constantDescSet3.toArray(wildcardClassArray28);
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet38 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 0L, false, (java.lang.constant.ConstantDesc) (-1.0d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Double (java.lang.Long and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator5);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(typeDescriptorSet25);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.iterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 10.0d, false);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator10 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet11 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator10);
        java.lang.constant.ConstantDesc constantDesc13 = constantDescSet11.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean15 = constantDescSet11.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc[] constantDescArray22 = new java.lang.constant.ConstantDesc[] { 1.0f, 100.0d, 10L, (-1), 10.0f, 10L };
        java.lang.constant.ConstantDesc[] constantDescArray23 = constantDescSet11.toArray(constantDescArray22);
        boolean boolean24 = constantDescSet1.equals((java.lang.Object) constantDescArray23);
        java.lang.Object obj25 = constantDescSet1.clone();
        java.lang.constant.ConstantDesc constantDesc27 = constantDescSet1.ceiling((java.lang.constant.ConstantDesc) 134);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNotNull(constantDescSet9);
        org.junit.Assert.assertNotNull(constantDescComparator10);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(constantDescArray22);
        org.junit.Assert.assertNotNull(constantDescArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "[]");
        org.junit.Assert.assertNull(constantDesc27);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 10.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator8 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet9 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator8);
        java.lang.constant.ConstantDesc constantDesc11 = constantDescSet9.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean13 = constantDescSet9.add((java.lang.constant.ConstantDesc) 1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet14 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet9);
        boolean boolean15 = constantDescSet1.contains((java.lang.Object) constantDescSet9);
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator16 = constantDescSet1.comparator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet17 = constantDescSet1.descendingSet();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescComparator8);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(constantDescSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardComparator16);
        org.junit.Assert.assertNotNull(constantDescSet17);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescSet0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.SortedSet.comparator()\" because \"s\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 1L, (java.lang.constant.ConstantDesc) 0L);
        constantDescSet3.clear();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet6);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.Object[] objArray8 = constantDescSet1.toArray();
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.last();
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet1.first();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertEquals("'" + constantDesc9 + "' != '" + 1 + "'", constantDesc9, 1);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 1 + "'", constantDesc10, 1);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        java.util.NavigableMap<java.util.Collection<java.lang.String>, java.util.Set<java.lang.String>> strCollectionMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(strCollectionMap0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum(0, 1);
        int int7 = testingRandoop0.sum((int) '4', 0, (int) (byte) -1);
        int int10 = testingRandoop0.sum(245, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 345 + "'", int10 == 345);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator5 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet6 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator5);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet6.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean10 = constantDescSet6.remove((java.lang.Object) (byte) -1);
        boolean boolean11 = constantDescSet3.equals((java.lang.Object) boolean10);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet12 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet14 = constantDescSet3.tailSet((java.lang.constant.ConstantDesc) 135);
        java.lang.constant.ConstantDesc constantDesc16 = constantDescSet3.higher((java.lang.constant.ConstantDesc) (-1L));
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet18 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3, constantDescClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator5);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(constantDescSet14);
        org.junit.Assert.assertNull(constantDesc16);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator4 = constantDescSet3.spliterator();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNotNull(constantDescSpliterator4);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet1.ceiling((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator8 = constantDescSet1.spliterator();
        int int9 = constantDescSet1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet14 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) 0.0d, false, (java.lang.constant.ConstantDesc) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Integer (java.lang.Double and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNotNull(constantDescSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator7 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet8.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean12 = constantDescSet8.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator13 = constantDescSet8.spliterator();
        java.lang.Object obj14 = constantDescSet8.clone();
        boolean boolean15 = constantDescSet8.isEmpty();
        boolean boolean16 = constantDescSet1.equals((java.lang.Object) constantDescSet8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet21 = constantDescSet8.subSet((java.lang.constant.ConstantDesc) 10L, true, (java.lang.constant.ConstantDesc) 54, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Integer (java.lang.Long and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescComparator7);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.Object[] objArray8 = constantDescSet1.toArray();
        java.lang.String str9 = constantDescSet1.toString();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator10 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet11 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator10);
        java.lang.constant.ConstantDesc constantDesc13 = constantDescSet11.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet15 = constantDescSet11.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet16 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet11);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet19 = constantDescSet11.headSet((java.lang.constant.ConstantDesc) (-1L), true);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator20 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet21 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator20);
        java.lang.Object[] objArray22 = constantDescSet21.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet23 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet21);
        java.lang.constant.ConstantDesc constantDesc25 = constantDescSet21.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc26 = constantDescSet21.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet27 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet21);
        java.util.List<java.lang.String> strList30 = java.util.Collections.nCopies((int) ' ', "hi!");
        boolean boolean31 = constantDescSet21.containsAll((java.util.Collection<java.lang.String>) strList30);
        java.util.Set<java.lang.String> strSet32 = java.util.Collections.emptySet();
        boolean boolean33 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList30, (java.util.Collection<java.lang.String>) strSet32);
        java.lang.Object obj34 = null;
        int int35 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strList30, obj34);
        boolean boolean36 = constantDescSet11.removeAll((java.util.Collection<java.lang.String>) strList30);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator37 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet38 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator37);
        java.lang.constant.ConstantDesc constantDesc40 = constantDescSet38.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator41 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet42 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator41);
        java.lang.constant.ConstantDesc constantDesc44 = constantDescSet42.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet46 = constantDescSet42.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator47 = constantDescSet42.spliterator();
        java.util.TreeSet<java.lang.String> strSet48 = new java.util.TreeSet<java.lang.String>();
        boolean boolean49 = constantDescSet42.containsAll((java.util.Collection<java.lang.String>) strSet48);
        java.util.Set<java.lang.String> strSet50 = java.util.Collections.unmodifiableSet((java.util.Set<java.lang.String>) strSet48);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator51 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet52 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator51);
        java.lang.constant.ConstantDesc constantDesc54 = constantDescSet52.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet56 = constantDescSet52.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet57 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet52);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet58 = java.util.Collections.unmodifiableNavigableSet(constantDescSet57);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet59 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet58);
        int int60 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strSet48, (java.lang.Object) constantDescSet58);
        boolean boolean61 = constantDescSet38.removeAll((java.util.Collection<java.lang.String>) strSet48);
        boolean boolean62 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList30, (java.util.Collection<java.lang.String>) strSet48);
        java.util.stream.Stream<java.lang.String> strStream63 = strList30.parallelStream();
        boolean boolean64 = constantDescSet1.equals((java.lang.Object) strStream63);
        java.lang.String str65 = constantDescSet1.toString();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[1]" + "'", str9, "[1]");
        org.junit.Assert.assertNotNull(constantDescComparator10);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertNotNull(constantDescSet15);
        org.junit.Assert.assertNotNull(constantDescSet16);
        org.junit.Assert.assertNotNull(constantDescSet19);
        org.junit.Assert.assertNotNull(constantDescComparator20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNull(constantDesc25);
        org.junit.Assert.assertNull(constantDesc26);
        org.junit.Assert.assertNotNull(constantDescSet27);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(constantDescComparator37);
        org.junit.Assert.assertNull(constantDesc40);
        org.junit.Assert.assertNotNull(constantDescComparator41);
        org.junit.Assert.assertNull(constantDesc44);
        org.junit.Assert.assertNotNull(constantDescSet46);
        org.junit.Assert.assertNotNull(constantDescSpliterator47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertNotNull(constantDescComparator51);
        org.junit.Assert.assertNull(constantDesc54);
        org.junit.Assert.assertNotNull(constantDescSet56);
        org.junit.Assert.assertNotNull(constantDescSet57);
        org.junit.Assert.assertNotNull(constantDescSet58);
        org.junit.Assert.assertNotNull(constantDescSet59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strStream63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[1]" + "'", str65, "[1]");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Set<java.util.AbstractSet<java.lang.constant.ConstantDesc>> constantDescSetSet6 = java.util.Collections.singleton((java.util.AbstractSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet7 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator8 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet9 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator8);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator10 = java.util.Collections.reverseOrder(constantDescComparator8);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet11 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = constantDescSet1.remove((java.lang.Object) constantDescComparator10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Comparators$NaturalOrderComparator cannot be cast to class java.lang.Float (java.util.Comparators$NaturalOrderComparator and java.lang.Float are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSetSet6);
        org.junit.Assert.assertNotNull(constantDescComparator8);
        org.junit.Assert.assertNotNull(constantDescComparator10);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
        boolean boolean8 = constantDescSet1.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator9 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet10 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator9);
        java.lang.Object[] objArray11 = constantDescSet10.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet12 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet10);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet13 = constantDescSet10.descendingSet();
        boolean boolean14 = constantDescSet1.remove((java.lang.Object) constantDescSet10);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet15 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet10);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(constantDescComparator9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(constantDescSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet1.first();
        constantDescSet1.clear();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet10 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) (-1L));
        java.lang.Object obj11 = null;
        boolean boolean12 = constantDescSet1.contains(obj11);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertEquals("'" + constantDesc7 + "' != '" + 0.0f + "'", constantDesc7, 0.0f);
        org.junit.Assert.assertNotNull(constantDescSet10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet6 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) (-1L), true);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.Set<java.lang.String> strSet17 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet18 = java.util.Collections.synchronizedSet(strSet17);
        boolean boolean19 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList14, (java.util.Collection<java.lang.String>) strSet17);
        boolean boolean20 = constantDescSet1.retainAll((java.util.Collection<java.lang.String>) strSet17);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet21 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet26 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) "[]", true, (java.lang.constant.ConstantDesc) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Float (java.lang.String and java.lang.Float are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(constantDescSet9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.lang.Object obj7 = constantDescSet1.clone();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor9 = constantDescSet1.descendingIterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet10 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet12 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet10, constantDescClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[1]");
        org.junit.Assert.assertNotNull(constantDescItor9);
        org.junit.Assert.assertNotNull(constantDescSet10);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.descendingIterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 1L);
        java.lang.Object[] objArray10 = constantDescSet1.toArray();
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator11 = constantDescSet1.comparator();
        java.lang.constant.ConstantDesc constantDesc12 = constantDescSet1.pollFirst();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardComparator11);
        org.junit.Assert.assertNull(constantDesc12);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescSet7);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.Object[] objArray8 = constantDescSet1.toArray();
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.last();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator10 = constantDescSet1.spliterator();
        boolean boolean11 = constantDescSet1.isEmpty();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertEquals("'" + constantDesc9 + "' != '" + 1 + "'", constantDesc9, 1);
        org.junit.Assert.assertNotNull(constantDescSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.descendingIterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedMap<java.lang.Class<?>[], java.util.Iterator<java.io.Serializable>> wildcardClassArrayMap8 = java.util.Collections.emptySortedMap();
        boolean boolean9 = constantDescSet1.contains((java.lang.Object) wildcardClassArrayMap8);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(wildcardClassArrayMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        java.util.List<java.lang.reflect.Type> typeList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(typeList0);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollLast();
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.ceiling((java.lang.constant.ConstantDesc) 100.0d);
        java.lang.constant.ConstantDesc constantDesc9 = null;
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet1.floor(constantDesc9);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 1 + "'", constantDesc6, 1);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNull(constantDesc10);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        TestingRandoop testingRandoop1 = new TestingRandoop();
        int int4 = testingRandoop1.sum((int) (byte) 0, (int) '#');
        int int7 = testingRandoop1.sum((int) (short) -1, 0);
        int int11 = testingRandoop1.sum((int) (short) 1, (int) (byte) 100, 35);
        TestingRandoop testingRandoop12 = new TestingRandoop();
        int int15 = testingRandoop12.sum((int) (byte) 0, (int) '#');
        int int18 = testingRandoop12.sum((int) (short) -1, 0);
        int int22 = testingRandoop12.sum((int) (short) 1, (int) (byte) 100, 35);
        java.util.List<TestingRandoop> testingRandoopList23 = java.util.Collections.singletonList(testingRandoop12);
        int int27 = testingRandoop12.sum((int) '#', 100, (-1));
        int int31 = testingRandoop12.sum((int) '#', 51, (int) (byte) 100);
        int int35 = testingRandoop12.sum((int) (short) 100, 52, 0);
        TestingRandoop[] testingRandoopArray36 = new TestingRandoop[] { testingRandoop1, testingRandoop12 };
        java.util.List<TestingRandoop[]> testingRandoopArrayList37 = java.util.Collections.nCopies(152, testingRandoopArray36);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 136 + "'", int11 == 136);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 136 + "'", int22 == 136);
        org.junit.Assert.assertNotNull(testingRandoopList23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 134 + "'", int27 == 134);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 186 + "'", int31 == 186);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 152 + "'", int35 == 152);
        org.junit.Assert.assertNotNull(testingRandoopArray36);
        org.junit.Assert.assertNotNull(testingRandoopArrayList37);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class<?>[] wildcardClassArray9 = constantDescSet1.toArray((java.lang.Class<?>[]) classArray7);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet10 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        boolean boolean11 = constantDescSet1.isEmpty();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(constantDescSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator7 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet8.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean12 = constantDescSet8.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator13 = constantDescSet8.spliterator();
        java.lang.Object obj14 = constantDescSet8.clone();
        boolean boolean15 = constantDescSet8.isEmpty();
        boolean boolean16 = constantDescSet1.equals((java.lang.Object) constantDescSet8);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet18 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet8, constantDescClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescComparator7);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.String str6 = constantDescSet1.toString();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[1]" + "'", str6, "[1]");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.List<java.lang.String> strList10 = java.util.Collections.nCopies((int) ' ', "hi!");
        boolean boolean11 = constantDescSet1.containsAll((java.util.Collection<java.lang.String>) strList10);
        java.util.Set<java.lang.String> strSet12 = java.util.Collections.emptySet();
        boolean boolean13 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList10, (java.util.Collection<java.lang.String>) strSet12);
        java.util.Enumeration<java.lang.String> strEnumeration14 = java.util.Collections.enumeration((java.util.Collection<java.lang.String>) strList10);
        java.util.ArrayList<java.lang.String> strList15 = java.util.Collections.list(strEnumeration14);
        java.util.stream.Stream<java.lang.String> strStream16 = strList15.parallelStream();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strEnumeration14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strStream16);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator5 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet6 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator5);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet6.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean10 = constantDescSet6.remove((java.lang.Object) (byte) -1);
        boolean boolean11 = constantDescSet3.equals((java.lang.Object) boolean10);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor12 = constantDescSet3.iterator();
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator13 = constantDescSet3.comparator();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet14 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet17 = constantDescSet3.headSet((java.lang.constant.ConstantDesc) (-1L), true);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator5);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(constantDescItor12);
        org.junit.Assert.assertNotNull(wildcardComparator13);
        org.junit.Assert.assertNotNull(constantDescSet17);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        java.util.NavigableSet<java.util.AbstractCollection<java.lang.constant.ConstantDesc>> constantDescCollectionSet0 = java.util.Collections.emptyNavigableSet();
        org.junit.Assert.assertNotNull(constantDescCollectionSet0);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator7 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet8.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean12 = constantDescSet8.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator13 = constantDescSet8.spliterator();
        java.lang.Object obj14 = constantDescSet8.clone();
        boolean boolean15 = constantDescSet8.isEmpty();
        boolean boolean16 = constantDescSet1.equals((java.lang.Object) constantDescSet8);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet17 = constantDescSet1.descendingSet();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator18 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet19 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator18);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator20 = java.util.Collections.reverseOrder(constantDescComparator18);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet21 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator18);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet24 = constantDescSet21.tailSet((java.lang.constant.ConstantDesc) (-1), false);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet25 = java.util.Collections.unmodifiableNavigableSet(constantDescSet24);
        boolean boolean26 = constantDescSet1.remove((java.lang.Object) constantDescSet25);
        java.lang.constant.ConstantDesc constantDesc28 = constantDescSet1.lower((java.lang.constant.ConstantDesc) "[]");
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescComparator7);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(constantDescSet17);
        org.junit.Assert.assertNotNull(constantDescComparator18);
        org.junit.Assert.assertNotNull(constantDescComparator20);
        org.junit.Assert.assertNotNull(constantDescSet24);
        org.junit.Assert.assertNotNull(constantDescSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(constantDesc28);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescSet7);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        java.util.Iterator<java.util.LinkedHashSet<java.lang.String>> strSetItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(strSetItor0);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        java.util.Set<java.lang.String> strSet0 = java.util.Collections.emptySet();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
        java.util.Set<java.lang.String> strSet2 = java.util.Collections.synchronizedSet(strSet0);
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum((int) (byte) 0, (int) '#');
        int int6 = testingRandoop0.sum((int) (short) -1, 0);
        int int9 = testingRandoop0.sum((int) (short) 1, (int) (short) 1);
        int int12 = testingRandoop0.sum(3, 51);
        int int15 = testingRandoop0.sum(54, 135);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 54 + "'", int12 == 54);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 189 + "'", int15 == 189);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator5 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet6 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator5);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet6.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean10 = constantDescSet6.remove((java.lang.Object) (byte) -1);
        boolean boolean11 = constantDescSet3.equals((java.lang.Object) boolean10);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.Set<java.lang.String> strSet19 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet20 = java.util.Collections.synchronizedSet(strSet19);
        boolean boolean21 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList16, (java.util.Collection<java.lang.String>) strSet19);
        java.lang.Class<?> wildcardClass22 = strSet19.getClass();
        java.util.Set set23 = java.util.Collections.EMPTY_SET;
        java.lang.Class<?> wildcardClass24 = set23.getClass();
        java.util.Set<java.lang.invoke.TypeDescriptor> typeDescriptorSet25 = java.util.Collections.singleton((java.lang.invoke.TypeDescriptor) wildcardClass24);
        java.lang.Class[] classArray27 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        wildcardClassArray28[0] = wildcardClass22;
        wildcardClassArray28[1] = wildcardClass24;
        java.lang.Class<?>[] wildcardClassArray33 = constantDescSet3.toArray(wildcardClassArray28);
        boolean boolean34 = constantDescSet3.isEmpty();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet35 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.lang.constant.ConstantDesc constantDesc37 = constantDescSet3.higher((java.lang.constant.ConstantDesc) 3);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet39 = constantDescSet3.tailSet((java.lang.constant.ConstantDesc) 35);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator40 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet41 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator40);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator42 = java.util.Collections.reverseOrder(constantDescComparator40);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet43 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator40);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet46 = constantDescSet43.tailSet((java.lang.constant.ConstantDesc) (-1), false);
        boolean boolean47 = constantDescSet3.remove((java.lang.Object) false);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator5);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(typeDescriptorSet25);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(constantDescSet35);
        org.junit.Assert.assertNull(constantDesc37);
        org.junit.Assert.assertNotNull(constantDescSet39);
        org.junit.Assert.assertNotNull(constantDescComparator40);
        org.junit.Assert.assertNotNull(constantDescComparator42);
        org.junit.Assert.assertNotNull(constantDescSet46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.iterator();
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.lang.String[] strArray9 = constantDescSet1.toArray(strArray8);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet10 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(constantDescSet10);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        java.util.Iterator<java.lang.reflect.Type[]> typeArrayItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(typeArrayItor0);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        boolean boolean6 = constantDescSet1.isEmpty();
        TestingRandoop testingRandoop7 = new TestingRandoop();
        int int10 = testingRandoop7.sum((int) (byte) 0, (int) '#');
        int int13 = testingRandoop7.sum((int) (short) -1, 0);
        int int17 = testingRandoop7.sum((int) (short) 1, (int) (byte) 100, 35);
        java.util.List<TestingRandoop> testingRandoopList18 = java.util.Collections.singletonList(testingRandoop7);
        boolean boolean19 = constantDescSet1.remove((java.lang.Object) testingRandoop7);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet21 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 10.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet24 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 35, false);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 136 + "'", int17 == 136);
        org.junit.Assert.assertNotNull(testingRandoopList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(constantDescSet21);
        org.junit.Assert.assertNotNull(constantDescSet24);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollFirst();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator7 = constantDescSet1.spliterator();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor8 = constantDescSet1.descendingIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.last();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(constantDescSpliterator7);
        org.junit.Assert.assertNotNull(constantDescItor8);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 0.0f);
        java.util.List<java.lang.String> strList11 = java.util.Collections.nCopies((int) ' ', "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = constantDescSet1.containsAll((java.util.Collection<java.lang.String>) strList11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Float (java.lang.String and java.lang.Float are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.Collection<java.lang.String> strCollection4 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>) strList2);
        java.util.List<java.util.List> listList5 = java.util.Collections.singletonList((java.util.List) strList2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(listList5);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        java.util.Comparator<java.lang.reflect.GenericDeclaration> genericDeclarationComparator0 = java.util.Collections.reverseOrder();
        org.junit.Assert.assertNotNull(genericDeclarationComparator0);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet8 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0L, false);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor9 = constantDescSet1.iterator();
        java.lang.String str10 = constantDescSet1.toString();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNotNull(constantDescSet8);
        org.junit.Assert.assertNotNull(constantDescItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc[] constantDescArray12 = new java.lang.constant.ConstantDesc[] { 1.0f, 100.0d, 10L, (-1), 10.0f, 10L };
        java.lang.constant.ConstantDesc[] constantDescArray13 = constantDescSet1.toArray(constantDescArray12);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor14 = constantDescSet1.descendingIterator();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator15 = constantDescSet1.spliterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet16 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.Object obj17 = constantDescSet1.clone();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescArray12);
        org.junit.Assert.assertNotNull(constantDescArray13);
        org.junit.Assert.assertNotNull(constantDescItor14);
        org.junit.Assert.assertNotNull(constantDescSpliterator15);
        org.junit.Assert.assertNotNull(constantDescSet16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "[1]");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        java.util.SortedSet<java.lang.reflect.AnnotatedElement> annotatedElementSet0 = java.util.Collections.emptySortedSet();
        org.junit.Assert.assertNotNull(annotatedElementSet0);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator2);
        java.lang.Object[] objArray4 = constantDescSet3.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet5 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.List<java.lang.String> strList8 = java.util.Collections.nCopies((int) ' ', "hi!");
        java.util.stream.Stream<java.lang.String> strStream9 = strList8.parallelStream();
        boolean boolean10 = constantDescSet5.removeAll((java.util.Collection<java.lang.String>) strList8);
        boolean boolean11 = constantDescSet1.contains((java.lang.Object) boolean10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc12 = constantDescSet1.last();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc[] constantDescArray12 = new java.lang.constant.ConstantDesc[] { 1.0f, 100.0d, 10L, (-1), 10.0f, 10L };
        java.lang.constant.ConstantDesc[] constantDescArray13 = constantDescSet1.toArray(constantDescArray12);
        java.lang.constant.ConstantDesc constantDesc14 = constantDescSet1.last();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator15 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet16 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator15);
        java.lang.Object[] objArray17 = constantDescSet16.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet18 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet16);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet19 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet18);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator20 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet21 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator20);
        java.lang.constant.ConstantDesc constantDesc23 = constantDescSet21.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean25 = constantDescSet21.remove((java.lang.Object) (byte) -1);
        boolean boolean26 = constantDescSet18.equals((java.lang.Object) boolean25);
        boolean boolean27 = constantDescSet1.equals((java.lang.Object) constantDescSet18);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet28 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet18);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescArray12);
        org.junit.Assert.assertNotNull(constantDescArray13);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 1 + "'", constantDesc14, 1);
        org.junit.Assert.assertNotNull(constantDescComparator15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator20);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(constantDescSet28);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum(0, 1);
        int int6 = testingRandoop0.sum(45, 54);
        int int9 = testingRandoop0.sum((int) (byte) -1, (int) ' ');
        int int13 = testingRandoop0.sum(136, 51, 135);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 322 + "'", int13 == 322);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum(100, (int) '#');
        int int7 = testingRandoop0.sum(5, 196, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 135 + "'", int3 == 135);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 202 + "'", int7 == 202);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet10 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) 100.0d, (java.lang.constant.ConstantDesc) 202);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Integer (java.lang.Double and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Class<?> wildcardClass2 = constantDescSet1.getClass();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        java.util.Map<java.lang.Comparable<java.lang.String>, java.util.Iterator<java.io.Serializable>> strComparableMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(strComparableMap0);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator7 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet8.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean12 = constantDescSet8.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator13 = constantDescSet8.spliterator();
        java.lang.Object obj14 = constantDescSet8.clone();
        boolean boolean15 = constantDescSet8.isEmpty();
        boolean boolean16 = constantDescSet1.equals((java.lang.Object) constantDescSet8);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet17 = constantDescSet1.descendingSet();
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet19 = java.util.Collections.checkedNavigableSet(constantDescSet17, constantDescClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescComparator7);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(constantDescSet17);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc[] constantDescArray12 = new java.lang.constant.ConstantDesc[] { 1.0f, 100.0d, 10L, (-1), 10.0f, 10L };
        java.lang.constant.ConstantDesc[] constantDescArray13 = constantDescSet1.toArray(constantDescArray12);
        java.util.Set<java.lang.constant.ConstantDesc[]> constantDescArraySet14 = java.util.Collections.singleton(constantDescArray12);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescArray12);
        org.junit.Assert.assertNotNull(constantDescArray13);
        org.junit.Assert.assertNotNull(constantDescArraySet14);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        boolean boolean6 = constantDescSet1.isEmpty();
        TestingRandoop testingRandoop7 = new TestingRandoop();
        int int10 = testingRandoop7.sum((int) (byte) 0, (int) '#');
        int int13 = testingRandoop7.sum((int) (short) -1, 0);
        int int17 = testingRandoop7.sum((int) (short) 1, (int) (byte) 100, 35);
        java.util.List<TestingRandoop> testingRandoopList18 = java.util.Collections.singletonList(testingRandoop7);
        boolean boolean19 = constantDescSet1.remove((java.lang.Object) testingRandoop7);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet21 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 10.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet24 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 230, true);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 136 + "'", int17 == 136);
        org.junit.Assert.assertNotNull(testingRandoopList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(constantDescSet21);
        org.junit.Assert.assertNotNull(constantDescSet24);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
        boolean boolean8 = constantDescSet1.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.TreeSet<java.lang.String> strSet9 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet10 = java.util.Collections.emptySet();
        boolean boolean11 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet9, (java.util.Collection<java.lang.String>) strSet10);
        boolean boolean12 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet7, (java.util.Collection<java.lang.String>) strSet10);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet10 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 1, true);
        java.lang.constant.ConstantDesc constantDesc11 = constantDescSet1.pollLast();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescSet10);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        java.util.NavigableMap<java.lang.Iterable<java.lang.String>, java.lang.CharSequence> strIterableMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(strIterableMap0);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        java.util.Iterator<java.lang.Iterable<java.lang.String>> strIterableItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(strIterableItor0);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        boolean boolean5 = constantDescSet3.add((java.lang.constant.ConstantDesc) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = constantDescSet3.add((java.lang.constant.ConstantDesc) 45);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Float (java.lang.Integer and java.lang.Float are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator5 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet6 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator5);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet6.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean10 = constantDescSet6.remove((java.lang.Object) (byte) -1);
        boolean boolean11 = constantDescSet3.equals((java.lang.Object) boolean10);
        java.lang.constant.ConstantDesc constantDesc12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet14 = constantDescSet3.headSet(constantDesc12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Comparable.compareTo(Object)\" because \"c2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator5);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator1);
        java.lang.constant.ConstantDesc constantDesc4 = constantDescSet2.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean6 = constantDescSet2.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Set<java.util.AbstractSet<java.lang.constant.ConstantDesc>> constantDescSetSet7 = java.util.Collections.singleton((java.util.AbstractSet<java.lang.constant.ConstantDesc>) constantDescSet2);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator8 = constantDescSet2.spliterator();
        java.lang.Class<?> wildcardClass9 = constantDescSpliterator8.getClass();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator10 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet11 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator10);
        java.lang.Object[] objArray12 = constantDescSet11.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet13 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet11);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet14 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet13);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator15 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet16 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator15);
        java.lang.constant.ConstantDesc constantDesc18 = constantDescSet16.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean20 = constantDescSet16.remove((java.lang.Object) (byte) -1);
        boolean boolean21 = constantDescSet13.equals((java.lang.Object) boolean20);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.Set<java.lang.String> strSet29 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet30 = java.util.Collections.synchronizedSet(strSet29);
        boolean boolean31 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList26, (java.util.Collection<java.lang.String>) strSet29);
        java.lang.Class<?> wildcardClass32 = strSet29.getClass();
        java.util.Set set33 = java.util.Collections.EMPTY_SET;
        java.lang.Class<?> wildcardClass34 = set33.getClass();
        java.util.Set<java.lang.invoke.TypeDescriptor> typeDescriptorSet35 = java.util.Collections.singleton((java.lang.invoke.TypeDescriptor) wildcardClass34);
        java.lang.Class[] classArray37 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        wildcardClassArray38[0] = wildcardClass32;
        wildcardClassArray38[1] = wildcardClass34;
        java.lang.Class<?>[] wildcardClassArray43 = constantDescSet13.toArray(wildcardClassArray38);
        java.util.Map<java.lang.Class<?>, java.lang.Class<?>[]> wildcardClassMap44 = java.util.Collections.singletonMap(wildcardClass9, wildcardClassArray43);
        java.util.List<java.lang.invoke.TypeDescriptor> typeDescriptorList45 = java.util.Collections.nCopies((int) (short) 100, (java.lang.invoke.TypeDescriptor) wildcardClass9);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(constantDescSetSet7);
        org.junit.Assert.assertNotNull(constantDescSpliterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(constantDescComparator10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator15);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(typeDescriptorSet35);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassMap44);
        org.junit.Assert.assertNotNull(typeDescriptorList45);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        java.util.Set<java.util.AbstractList<java.lang.String>> strListSet0 = java.util.Collections.emptySet();
        org.junit.Assert.assertNotNull(strListSet0);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class<?>[] wildcardClassArray9 = constantDescSet1.toArray((java.lang.Class<?>[]) classArray7);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet12 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) 100.0f, (java.lang.constant.ConstantDesc) 0.0f);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet15 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 5, false);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet17 = java.util.Collections.checkedNavigableSet(constantDescSet15, constantDescClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(constantDescSet12);
        org.junit.Assert.assertNotNull(constantDescSet15);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        java.util.Enumeration<java.util.ArrayList<java.lang.String>> strListEnumeration0 = java.util.Collections.emptyEnumeration();
        org.junit.Assert.assertNotNull(strListEnumeration0);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        java.util.NavigableMap<java.lang.String, java.io.Serializable[]> strMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        java.util.Set set0 = java.util.Collections.EMPTY_SET;
        java.lang.Class<?> wildcardClass1 = set0.getClass();
        java.util.List<java.lang.invoke.TypeDescriptor> typeDescriptorList2 = java.util.Collections.singletonList((java.lang.invoke.TypeDescriptor) wildcardClass1);
        java.util.Set<java.lang.reflect.Type> typeSet3 = java.util.Collections.singleton((java.lang.reflect.Type) wildcardClass1);
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet4 = java.util.Collections.singleton((java.lang.reflect.AnnotatedElement) wildcardClass1);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(typeDescriptorList2);
        org.junit.Assert.assertNotNull(typeSet3);
        org.junit.Assert.assertNotNull(annotatedElementSet4);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap0 = java.util.Collections.emptyNavigableMap();
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap1 = java.util.Collections.synchronizedNavigableMap(strComparableMapMap0);
        java.lang.Class<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableMapClass2 = null;
        java.lang.Class<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap4 = java.util.Collections.checkedNavigableMap(strComparableMapMap0, strComparableMapClass2, constantDescSetClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableMapMap0);
        org.junit.Assert.assertNotNull(strComparableMapMap1);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet7 = java.util.Collections.emptySet();
        boolean boolean8 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet6, (java.util.Collection<java.lang.String>) strSet7);
        boolean boolean9 = constantDescSet1.removeAll((java.util.Collection<java.lang.String>) strSet7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet1.pollFirst();
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator11 = constantDescSet1.comparator();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator12 = java.util.Collections.reverseOrder((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator11);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator13 = java.util.Collections.reverseOrder((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator11);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet14 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator13);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator15 = constantDescSet14.spliterator();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 0.0f + "'", constantDesc10, 0.0f);
        org.junit.Assert.assertNotNull(wildcardComparator11);
        org.junit.Assert.assertNotNull(constantDescComparator12);
        org.junit.Assert.assertNotNull(constantDescComparator13);
        org.junit.Assert.assertNotNull(constantDescSpliterator15);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 1L, (java.lang.constant.ConstantDesc) 0L);
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator7 = constantDescSet3.comparator();
        constantDescSet3.clear();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(wildcardComparator7);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        java.util.Iterator<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(wildcardClassOfFieldItor0);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator5 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet6 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator5);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet6.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean10 = constantDescSet6.remove((java.lang.Object) (byte) -1);
        boolean boolean11 = constantDescSet3.equals((java.lang.Object) boolean10);
        java.lang.constant.ConstantDesc constantDesc13 = constantDescSet3.higher((java.lang.constant.ConstantDesc) 134);
        java.lang.constant.ConstantDesc constantDesc14 = constantDescSet3.pollLast();
        java.lang.constant.ConstantDesc constantDesc15 = constantDescSet3.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet18 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 35, (java.lang.constant.ConstantDesc) 2);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator5);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertNotNull(constantDescSet18);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap0 = java.util.Collections.emptyNavigableMap();
        java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap1 = java.util.Collections.synchronizedSortedMap((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap0);
        java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap2 = java.util.Collections.synchronizedSortedMap(strComparableMapMap1);
        java.lang.Class<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableMapClass3 = null;
        java.lang.Class<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetClass4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap5 = java.util.Collections.checkedSortedMap(strComparableMapMap2, strComparableMapClass3, constantDescSetClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableMapMap0);
        org.junit.Assert.assertNotNull(strComparableMapMap1);
        org.junit.Assert.assertNotNull(strComparableMapMap2);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet7 = java.util.Collections.emptySet();
        boolean boolean8 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet6, (java.util.Collection<java.lang.String>) strSet7);
        boolean boolean9 = constantDescSet1.removeAll((java.util.Collection<java.lang.String>) strSet7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet1.pollFirst();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator11 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator12 = java.util.Collections.reverseOrder(constantDescComparator11);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet13 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator11);
        java.util.Set<java.lang.String> strSet15 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet16 = java.util.Collections.synchronizedSet(strSet15);
        java.util.TreeSet<java.lang.String> strSet17 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet15);
        boolean boolean18 = constantDescSet13.retainAll((java.util.Collection<java.lang.String>) strSet15);
        boolean boolean19 = constantDescSet1.equals((java.lang.Object) strSet15);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet20 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet25 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) 135, true, (java.lang.constant.ConstantDesc) 10.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Float (java.lang.Integer and java.lang.Float are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 0.0f + "'", constantDesc10, 0.0f);
        org.junit.Assert.assertNotNull(constantDescComparator11);
        org.junit.Assert.assertNotNull(constantDescComparator12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(constantDescSet20);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator5 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet6 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator5);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet6.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean10 = constantDescSet6.remove((java.lang.Object) (byte) -1);
        boolean boolean11 = constantDescSet3.equals((java.lang.Object) boolean10);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet12 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet14 = constantDescSet3.tailSet((java.lang.constant.ConstantDesc) 135);
        java.lang.constant.ConstantDesc constantDesc16 = constantDescSet3.higher((java.lang.constant.ConstantDesc) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet21 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 51, false, (java.lang.constant.ConstantDesc) 54, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromKey > toKey");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator5);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(constantDescSet14);
        org.junit.Assert.assertNull(constantDesc16);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet8 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0L, false);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator9 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet10 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator9);
        java.lang.constant.ConstantDesc constantDesc12 = constantDescSet10.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet14 = constantDescSet10.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet15 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet10);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet18 = constantDescSet10.headSet((java.lang.constant.ConstantDesc) (-1L), true);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.Set<java.lang.String> strSet26 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet27 = java.util.Collections.synchronizedSet(strSet26);
        boolean boolean28 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList23, (java.util.Collection<java.lang.String>) strSet26);
        boolean boolean29 = constantDescSet10.retainAll((java.util.Collection<java.lang.String>) strSet26);
        boolean boolean30 = constantDescSet1.remove((java.lang.Object) strSet26);
        java.util.Enumeration<java.lang.String> strEnumeration31 = java.util.Collections.enumeration((java.util.Collection<java.lang.String>) strSet26);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNotNull(constantDescSet8);
        org.junit.Assert.assertNotNull(constantDescComparator9);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNotNull(constantDescSet14);
        org.junit.Assert.assertNotNull(constantDescSet15);
        org.junit.Assert.assertNotNull(constantDescSet18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strEnumeration31);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        java.util.Iterator<java.lang.AutoCloseable> autoCloseableItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(autoCloseableItor0);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        java.util.Enumeration<java.lang.String> strEnumeration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.String> strList1 = java.util.Collections.list(strEnumeration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Enumeration.hasMoreElements()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class<?>[] wildcardClassArray9 = constantDescSet1.toArray((java.lang.Class<?>[]) classArray7);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet11 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 10.0d);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(constantDescSet11);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.iterator();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
        boolean boolean8 = constantDescSet1.retainAll((java.util.Collection<java.lang.String>) strSet7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet1.floor((java.lang.constant.ConstantDesc) 52);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet12 = java.util.Collections.checkedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1, constantDescClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(constantDesc10);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet8 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) "", true);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet1.ceiling((java.lang.constant.ConstantDesc) (-1.0f));
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSet8);
        org.junit.Assert.assertNull(constantDesc10);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 0);
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.higher((java.lang.constant.ConstantDesc) 196);
        boolean boolean10 = constantDescSet1.isEmpty();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet3.tailSet((java.lang.constant.ConstantDesc) (-1), false);
        java.lang.Object obj7 = constantDescSet3.clone();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator8 = constantDescSet3.spliterator();
        constantDescSet3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet12 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 31, (java.lang.constant.ConstantDesc) 245);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromKey > toKey");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[]");
        org.junit.Assert.assertNotNull(constantDescSpliterator8);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet1 = java.util.Collections.synchronizedNavigableSet(constantDescSet0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator1);
        java.lang.constant.ConstantDesc constantDesc4 = constantDescSet2.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.List<java.util.NavigableSet<java.lang.constant.ConstantDesc>> constantDescSetList5 = java.util.Collections.nCopies((int) (short) 0, (java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet2);
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet2.lower((java.lang.constant.ConstantDesc) 136);
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet2.higher((java.lang.constant.ConstantDesc) 1.0d);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet11 = constantDescSet2.tailSet((java.lang.constant.ConstantDesc) 136);
        java.lang.Object[] objArray12 = constantDescSet2.toArray();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet14 = constantDescSet2.tailSet((java.lang.constant.ConstantDesc) 33);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNotNull(constantDescSetList5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNotNull(constantDescSet11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(constantDescSet14);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 0);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor8 = constantDescSet1.descendingIterator();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescItor8);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        java.lang.String[] strArray2 = new java.lang.String[] { "[]", "[1]" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.Collection<java.lang.String> strCollection1 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>) strSet0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator2);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet3.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean7 = constantDescSet3.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet9 = java.util.Collections.emptySet();
        boolean boolean10 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet8, (java.util.Collection<java.lang.String>) strSet9);
        boolean boolean11 = constantDescSet3.removeAll((java.util.Collection<java.lang.String>) strSet9);
        java.lang.constant.ConstantDesc constantDesc12 = constantDescSet3.pollFirst();
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator13 = constantDescSet3.comparator();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator14 = java.util.Collections.reverseOrder((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence15 = java.util.Collections.max((java.util.Collection<java.lang.String>) strSet0, constantDescComparator14);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + constantDesc12 + "' != '" + 0.0f + "'", constantDesc12, 0.0f);
        org.junit.Assert.assertNotNull(wildcardComparator13);
        org.junit.Assert.assertNotNull(constantDescComparator14);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        java.util.NavigableMap<java.util.AbstractList<java.lang.String>, TestingRandoop> strListMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(strListMap0);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor2 = constantDescSet1.descendingIterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet3 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.Object obj4 = constantDescSet1.clone();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator5 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet6 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator5);
        java.lang.Object[] objArray7 = constantDescSet6.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet6);
        boolean boolean10 = constantDescSet8.add((java.lang.constant.ConstantDesc) 10.0f);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet11 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet8);
        boolean boolean12 = constantDescSet1.contains((java.lang.Object) constantDescSet8);
        java.util.Collection<java.lang.String> strCollection13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = constantDescSet8.addAll(strCollection13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.iterator()\" because \"c\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescItor2);
        org.junit.Assert.assertNotNull(constantDescSet3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor2 = constantDescSet1.descendingIterator();
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator3 = constantDescSet1.comparator();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 1, false);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescItor2);
        org.junit.Assert.assertNotNull(wildcardComparator3);
        org.junit.Assert.assertNotNull(constantDescSet7);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet6 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) (-1L), true);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.Set<java.lang.String> strSet17 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet18 = java.util.Collections.synchronizedSet(strSet17);
        boolean boolean19 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList14, (java.util.Collection<java.lang.String>) strSet17);
        boolean boolean20 = constantDescSet1.retainAll((java.util.Collection<java.lang.String>) strSet17);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet21 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc23 = constantDescSet1.ceiling((java.lang.constant.ConstantDesc) (-1L));
        java.lang.constant.ConstantDesc constantDesc25 = constantDescSet1.higher((java.lang.constant.ConstantDesc) 10.0f);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(constantDescSet9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertNull(constantDesc25);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.stream.Stream<java.lang.String> strStream1 = strSet0.stream();
        java.util.Set<java.lang.String> strSet3 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet4 = java.util.Collections.synchronizedSet(strSet3);
        java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet3);
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap6 = java.util.Collections.emptyNavigableMap();
        java.util.List<java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>> comparableMapMapList7 = java.util.Collections.singletonList((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap6);
        java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap8 = java.util.Collections.synchronizedSortedMap((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap6);
        int int9 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strSet3, (java.lang.Object) strComparableMapMap8);
        int int10 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strSet0, (java.lang.Object) strSet3);
        java.util.Enumeration<java.lang.String> strEnumeration11 = java.util.Collections.enumeration((java.util.Collection<java.lang.String>) strSet3);
        java.util.ArrayList<java.lang.String> strList12 = java.util.Collections.list(strEnumeration11);
        java.util.stream.Stream<java.lang.String> strStream13 = strList12.parallelStream();
        org.junit.Assert.assertNotNull(strStream1);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strComparableMapMap6);
        org.junit.Assert.assertNotNull(comparableMapMapList7);
        org.junit.Assert.assertNotNull(strComparableMapMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strEnumeration11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strStream13);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        java.util.ListIterator<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetItor0 = java.util.Collections.emptyListIterator();
        org.junit.Assert.assertNotNull(constantDescSetItor0);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        java.util.Set<java.lang.reflect.Type> typeSet0 = java.util.Collections.emptySet();
        org.junit.Assert.assertNotNull(typeSet0);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.stream.Stream<java.lang.String> strStream1 = strSet0.stream();
        java.util.Set<java.lang.String> strSet3 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet4 = java.util.Collections.synchronizedSet(strSet3);
        java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet3);
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap6 = java.util.Collections.emptyNavigableMap();
        java.util.List<java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>> comparableMapMapList7 = java.util.Collections.singletonList((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap6);
        java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap8 = java.util.Collections.synchronizedSortedMap((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap6);
        int int9 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strSet3, (java.lang.Object) strComparableMapMap8);
        int int10 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strSet0, (java.lang.Object) strSet3);
        java.util.Enumeration<java.lang.String> strEnumeration11 = java.util.Collections.enumeration((java.util.Collection<java.lang.String>) strSet3);
        java.util.ArrayList<java.lang.String> strList12 = java.util.Collections.list(strEnumeration11);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator13 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet14 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator13);
        java.lang.constant.ConstantDesc constantDesc16 = constantDescSet14.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet18 = constantDescSet14.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor19 = constantDescSet14.descendingIterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet20 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet14);
        java.lang.constant.ConstantDesc constantDesc22 = constantDescSet14.lower((java.lang.constant.ConstantDesc) 1L);
        java.lang.Object[] objArray23 = constantDescSet14.toArray();
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator24 = constantDescSet14.comparator();
        java.lang.Comparable<java.lang.String> strComparable25 = java.util.Collections.min((java.util.Collection<java.lang.String>) strList12, (java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator24);
        org.junit.Assert.assertNotNull(strStream1);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strComparableMapMap6);
        org.junit.Assert.assertNotNull(comparableMapMapList7);
        org.junit.Assert.assertNotNull(strComparableMapMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strEnumeration11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(constantDescComparator13);
        org.junit.Assert.assertNull(constantDesc16);
        org.junit.Assert.assertNotNull(constantDescSet18);
        org.junit.Assert.assertNotNull(constantDescItor19);
        org.junit.Assert.assertNotNull(constantDescSet20);
        org.junit.Assert.assertNull(constantDesc22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(wildcardComparator24);
        org.junit.Assert.assertEquals("'" + strComparable25 + "' != '" + "hi!" + "'", strComparable25, "hi!");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        java.util.Map<java.util.Comparator<java.lang.constant.ConstantDesc>, java.lang.Comparable<java.lang.String>> constantDescComparatorMap5 = java.util.Collections.emptyMap();
        boolean boolean6 = constantDescSet1.equals((java.lang.Object) constantDescComparatorMap5);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = constantDescSet1.descendingSet();
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator8 = constantDescSet1.comparator();
        java.lang.Object obj9 = constantDescSet1.clone();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNotNull(constantDescComparatorMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(wildcardComparator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[]");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.Object[] objArray8 = constantDescSet1.toArray();
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.last();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator10 = constantDescSet1.spliterator();
        java.lang.constant.ConstantDesc constantDesc11 = constantDescSet1.pollFirst();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertEquals("'" + constantDesc9 + "' != '" + 1 + "'", constantDesc9, 1);
        org.junit.Assert.assertNotNull(constantDescSpliterator10);
        org.junit.Assert.assertEquals("'" + constantDesc11 + "' != '" + 1 + "'", constantDesc11, 1);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap1 = java.util.Collections.synchronizedSortedMap(strComparableMapMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 1L, (java.lang.constant.ConstantDesc) 0L);
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator7 = constantDescSet3.comparator();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator7);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet8);
        boolean boolean10 = constantDescSet8.isEmpty();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet13 = constantDescSet8.headSet((java.lang.constant.ConstantDesc) 31, true);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(wildcardComparator7);
        org.junit.Assert.assertNotNull(constantDescSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(constantDescSet13);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 1L, (java.lang.constant.ConstantDesc) 0L);
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator7 = constantDescSet3.comparator();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator7);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet8);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet10 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet8);
        constantDescSet8.clear();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet13 = constantDescSet8.tailSet((java.lang.constant.ConstantDesc) 52);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(wildcardComparator7);
        org.junit.Assert.assertNotNull(constantDescSet9);
        org.junit.Assert.assertNotNull(constantDescSet10);
        org.junit.Assert.assertNotNull(constantDescSet13);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        java.util.Enumeration<java.util.SortedSet<java.lang.constant.ConstantDesc>> constantDescSetEnumeration0 = java.util.Collections.emptyEnumeration();
        org.junit.Assert.assertNotNull(constantDescSetEnumeration0);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        java.util.Collection<java.lang.String> strCollection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration<java.lang.String> strEnumeration1 = java.util.Collections.enumeration(strCollection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.iterator()\" because \"this.val$c\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.iterator();
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.lang.String[] strArray9 = constantDescSet1.toArray(strArray8);
        java.util.Set<java.lang.String[]> strArraySet10 = java.util.Collections.singleton(strArray8);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArraySet10);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc[] constantDescArray12 = new java.lang.constant.ConstantDesc[] { 1.0f, 100.0d, 10L, (-1), 10.0f, 10L };
        java.lang.constant.ConstantDesc[] constantDescArray13 = constantDescSet1.toArray(constantDescArray12);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor14 = constantDescSet1.descendingIterator();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator15 = constantDescSet1.spliterator();
        java.lang.Object[] objArray16 = constantDescSet1.toArray();
        java.lang.Object[] objArray17 = constantDescSet1.toArray();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescArray12);
        org.junit.Assert.assertNotNull(constantDescArray13);
        org.junit.Assert.assertNotNull(constantDescItor14);
        org.junit.Assert.assertNotNull(constantDescSpliterator15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1]");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet2.tailSet((java.lang.constant.ConstantDesc) 0.0f, true);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet6 = java.util.Collections.unmodifiableNavigableSet(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSet6);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet7 = java.util.Collections.emptySet();
        boolean boolean8 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet6, (java.util.Collection<java.lang.String>) strSet7);
        boolean boolean9 = constantDescSet1.removeAll((java.util.Collection<java.lang.String>) strSet7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet1.pollFirst();
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator11 = constantDescSet1.comparator();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator12 = java.util.Collections.reverseOrder((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator11);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator13 = java.util.Collections.reverseOrder(constantDescComparator12);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 0.0f + "'", constantDesc10, 0.0f);
        org.junit.Assert.assertNotNull(wildcardComparator11);
        org.junit.Assert.assertNotNull(constantDescComparator12);
        org.junit.Assert.assertNotNull(constantDescComparator13);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet11 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) 3, true, (java.lang.constant.ConstantDesc) 135, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromKey > toKey");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        java.util.SortedMap<java.util.ArrayList<java.lang.String>, java.lang.Object[]> strListMap0 = java.util.Collections.emptySortedMap();
        org.junit.Assert.assertNotNull(strListMap0);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        java.util.SortedSet<java.util.Set<java.lang.String>> strSetSet0 = java.util.Collections.emptySortedSet();
        java.lang.Class<?> wildcardClass1 = strSetSet0.getClass();
        org.junit.Assert.assertNotNull(strSetSet0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc[] constantDescArray12 = new java.lang.constant.ConstantDesc[] { 1.0f, 100.0d, 10L, (-1), 10.0f, 10L };
        java.lang.constant.ConstantDesc[] constantDescArray13 = constantDescSet1.toArray(constantDescArray12);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor14 = constantDescSet1.descendingIterator();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator15 = constantDescSet1.spliterator();
        java.lang.constant.ConstantDesc constantDesc17 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 136);
        java.lang.constant.ConstantDesc constantDesc19 = constantDescSet1.higher((java.lang.constant.ConstantDesc) 0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet20 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescArray12);
        org.junit.Assert.assertNotNull(constantDescArray13);
        org.junit.Assert.assertNotNull(constantDescItor14);
        org.junit.Assert.assertNotNull(constantDescSpliterator15);
        org.junit.Assert.assertNull(constantDesc17);
        org.junit.Assert.assertNull(constantDesc19);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet1.pollLast();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertEquals("'" + constantDesc7 + "' != '" + 0.0f + "'", constantDesc7, 0.0f);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        java.util.List<java.util.Collection<java.lang.String>> strCollectionList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(strCollectionList0);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        java.util.Iterator<java.util.List> listItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(listItor0);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum(100, (int) '#');
        int int6 = testingRandoop0.sum(10, (int) '#');
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator7 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator7);
        java.lang.Object[] objArray9 = constantDescSet8.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet10 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet8);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet11 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet10);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator12 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet13 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator12);
        java.lang.constant.ConstantDesc constantDesc15 = constantDescSet13.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean17 = constantDescSet13.remove((java.lang.Object) (byte) -1);
        boolean boolean18 = constantDescSet10.equals((java.lang.Object) boolean17);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.Set<java.lang.String> strSet26 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet27 = java.util.Collections.synchronizedSet(strSet26);
        boolean boolean28 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList23, (java.util.Collection<java.lang.String>) strSet26);
        java.lang.Class<?> wildcardClass29 = strSet26.getClass();
        java.util.Set set30 = java.util.Collections.EMPTY_SET;
        java.lang.Class<?> wildcardClass31 = set30.getClass();
        java.util.Set<java.lang.invoke.TypeDescriptor> typeDescriptorSet32 = java.util.Collections.singleton((java.lang.invoke.TypeDescriptor) wildcardClass31);
        java.lang.Class[] classArray34 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        wildcardClassArray35[0] = wildcardClass29;
        wildcardClassArray35[1] = wildcardClass31;
        java.lang.Class<?>[] wildcardClassArray40 = constantDescSet10.toArray(wildcardClassArray35);
        java.util.Map<TestingRandoop, java.lang.Object[]> testingRandoopMap41 = java.util.Collections.singletonMap(testingRandoop0, (java.lang.Object[]) wildcardClassArray35);
        int int45 = testingRandoop0.sum((int) (byte) 10, 5, 186);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 135 + "'", int3 == 135);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 45 + "'", int6 == 45);
        org.junit.Assert.assertNotNull(constantDescComparator7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator12);
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(typeDescriptorSet32);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(testingRandoopMap41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 201 + "'", int45 == 201);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum((int) (byte) 0, (int) '#');
        int int6 = testingRandoop0.sum((int) (short) -1, 0);
        int int10 = testingRandoop0.sum((int) (short) 1, (int) (byte) 100, 35);
        java.util.List<TestingRandoop> testingRandoopList11 = java.util.Collections.singletonList(testingRandoop0);
        int int15 = testingRandoop0.sum((int) '#', 100, (-1));
        int int19 = testingRandoop0.sum((int) '#', 51, (int) (byte) 100);
        int int23 = testingRandoop0.sum((int) (short) 100, 52, 0);
        int int26 = testingRandoop0.sum(322, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 136 + "'", int10 == 136);
        org.junit.Assert.assertNotNull(testingRandoopList11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 134 + "'", int15 == 134);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 186 + "'", int19 == 186);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 152 + "'", int23 == 152);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 419 + "'", int26 == 419);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 10.0d);
        java.util.Set<java.io.Serializable[]> serializableArraySet7 = java.util.Collections.emptySet();
        boolean boolean8 = constantDescSet1.equals((java.lang.Object) serializableArraySet7);
        boolean boolean9 = constantDescSet1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet14 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) 100L, false, (java.lang.constant.ConstantDesc) 189, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Integer (java.lang.Long and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(serializableArraySet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet7 = java.util.Collections.emptySet();
        boolean boolean8 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet6, (java.util.Collection<java.lang.String>) strSet7);
        boolean boolean9 = constantDescSet1.removeAll((java.util.Collection<java.lang.String>) strSet7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet1.pollFirst();
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator11 = constantDescSet1.comparator();
        int int12 = constantDescSet1.size();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 0.0f + "'", constantDesc10, 0.0f);
        org.junit.Assert.assertNotNull(wildcardComparator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator2);
        java.lang.Object[] objArray4 = constantDescSet3.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet5 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet3.descendingSet();
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet3.lower((java.lang.constant.ConstantDesc) 10.0d);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet3.lower((java.lang.constant.ConstantDesc) 2);
        java.lang.Object obj11 = constantDescSet3.clone();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet12 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        boolean boolean13 = constantDescSet1.remove((java.lang.Object) constantDescSet12);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet16 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) 202, (java.lang.constant.ConstantDesc) 31);
        int int17 = constantDescSet1.size();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(constantDescSet16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        java.util.Map<java.lang.Class<?>, java.lang.reflect.Type> wildcardClassMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(wildcardClassMap0);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap0 = null;
        java.lang.Class<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableMapClass1 = null;
        java.lang.Class<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetClass2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap3 = java.util.Collections.checkedNavigableMap(strComparableMapMap0, strComparableMapClass1, constantDescSetClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet6 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.Object[] objArray7 = constantDescSet1.toArray();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet9 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 35);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1]");
        org.junit.Assert.assertNotNull(constantDescSet9);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc[] constantDescArray12 = new java.lang.constant.ConstantDesc[] { 1.0f, 100.0d, 10L, (-1), 10.0f, 10L };
        java.lang.constant.ConstantDesc[] constantDescArray13 = constantDescSet1.toArray(constantDescArray12);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor14 = constantDescSet1.descendingIterator();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator15 = constantDescSet1.spliterator();
        java.lang.constant.ConstantDesc constantDesc17 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 136);
        java.lang.constant.ConstantDesc constantDesc19 = constantDescSet1.higher((java.lang.constant.ConstantDesc) 0);
        java.lang.constant.ConstantDesc constantDesc21 = constantDescSet1.floor((java.lang.constant.ConstantDesc) 1);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescArray12);
        org.junit.Assert.assertNotNull(constantDescArray13);
        org.junit.Assert.assertNotNull(constantDescItor14);
        org.junit.Assert.assertNotNull(constantDescSpliterator15);
        org.junit.Assert.assertNull(constantDesc17);
        org.junit.Assert.assertNull(constantDesc19);
        org.junit.Assert.assertEquals("'" + constantDesc21 + "' != '" + 1 + "'", constantDesc21, 1);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        java.util.Iterator<java.util.ListIterator<java.io.Serializable>> serializableItorItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(serializableItorItor0);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator5 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet6 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator5);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet6.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean10 = constantDescSet6.remove((java.lang.Object) (byte) -1);
        boolean boolean11 = constantDescSet3.equals((java.lang.Object) boolean10);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.Set<java.lang.String> strSet19 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet20 = java.util.Collections.synchronizedSet(strSet19);
        boolean boolean21 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList16, (java.util.Collection<java.lang.String>) strSet19);
        java.lang.Class<?> wildcardClass22 = strSet19.getClass();
        java.util.Set set23 = java.util.Collections.EMPTY_SET;
        java.lang.Class<?> wildcardClass24 = set23.getClass();
        java.util.Set<java.lang.invoke.TypeDescriptor> typeDescriptorSet25 = java.util.Collections.singleton((java.lang.invoke.TypeDescriptor) wildcardClass24);
        java.lang.Class[] classArray27 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        wildcardClassArray28[0] = wildcardClass22;
        wildcardClassArray28[1] = wildcardClass24;
        java.lang.Class<?>[] wildcardClassArray33 = constantDescSet3.toArray(wildcardClassArray28);
        boolean boolean34 = constantDescSet3.isEmpty();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet35 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet37 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3, constantDescClass36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator5);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(typeDescriptorSet25);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(constantDescSet35);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        java.util.Map<java.util.AbstractCollection<java.lang.constant.ConstantDesc>, java.util.NavigableSet<java.lang.constant.ConstantDesc>> constantDescCollectionMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(constantDescCollectionMap0);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.descendingIterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 1L);
        java.lang.Object[] objArray10 = constantDescSet1.toArray();
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator11 = constantDescSet1.comparator();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor12 = constantDescSet1.descendingIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet15 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) 35, (java.lang.constant.ConstantDesc) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Long (java.lang.Integer and java.lang.Long are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardComparator11);
        org.junit.Assert.assertNotNull(constantDescItor12);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        java.util.Set<java.util.ListIterator<java.io.Serializable>[]> serializableItorArraySet0 = java.util.Collections.emptySet();
        org.junit.Assert.assertNotNull(serializableItorArraySet0);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        java.util.Collection<java.lang.String> strCollection1 = null;
        java.util.List<java.util.Collection<java.lang.String>> strCollectionList2 = java.util.Collections.nCopies(54, strCollection1);
        org.junit.Assert.assertNotNull(strCollectionList2);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.lang.String str7 = constantDescSet1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(strComparableItor0);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.iterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = constantDescSet1.descendingSet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNotNull(constantDescSet7);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        java.util.NavigableSet<java.util.Enumeration<java.lang.String>> strEnumerationSet0 = java.util.Collections.emptyNavigableSet();
        org.junit.Assert.assertNotNull(strEnumerationSet0);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        java.util.Iterator<java.util.Collection<java.lang.String>> strCollectionItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(strCollectionItor0);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        java.util.SortedMap<java.util.List, java.lang.Class<?>> listMap0 = java.util.Collections.emptySortedMap();
        org.junit.Assert.assertNotNull(listMap0);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet1 = java.util.Collections.emptySet();
        boolean boolean2 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet0, (java.util.Collection<java.lang.String>) strSet1);
        java.util.Set<java.lang.String> strSet3 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.String>) strSet0);
        java.util.TreeSet<java.lang.String> strSet4 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet3);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        java.util.NavigableMap<java.lang.String[], java.util.SortedSet<java.lang.constant.ConstantDesc>> strArrayMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(strArrayMap0);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet3.tailSet((java.lang.constant.ConstantDesc) (-1), false);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(constantDescSet7);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator8 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet9 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator8);
        java.lang.Object[] objArray10 = constantDescSet9.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet11 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet9);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet12 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet11);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator13 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet14 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator13);
        java.lang.constant.ConstantDesc constantDesc16 = constantDescSet14.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean18 = constantDescSet14.remove((java.lang.Object) (byte) -1);
        boolean boolean19 = constantDescSet11.equals((java.lang.Object) boolean18);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.Set<java.lang.String> strSet27 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet28 = java.util.Collections.synchronizedSet(strSet27);
        boolean boolean29 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList24, (java.util.Collection<java.lang.String>) strSet27);
        java.lang.Class<?> wildcardClass30 = strSet27.getClass();
        java.util.Set set31 = java.util.Collections.EMPTY_SET;
        java.lang.Class<?> wildcardClass32 = set31.getClass();
        java.util.Set<java.lang.invoke.TypeDescriptor> typeDescriptorSet33 = java.util.Collections.singleton((java.lang.invoke.TypeDescriptor) wildcardClass32);
        java.lang.Class[] classArray35 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        wildcardClassArray36[0] = wildcardClass30;
        wildcardClassArray36[1] = wildcardClass32;
        java.lang.Class<?>[] wildcardClassArray41 = constantDescSet11.toArray(wildcardClassArray36);
        boolean boolean42 = constantDescSet1.equals((java.lang.Object) wildcardClassArray36);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescComparator8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator13);
        org.junit.Assert.assertNull(constantDesc16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(typeDescriptorSet33);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "[]");
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet1.ceiling((java.lang.constant.ConstantDesc) "[]");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator8 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet9 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator8);
        java.lang.constant.ConstantDesc constantDesc11 = constantDescSet9.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean13 = constantDescSet9.add((java.lang.constant.ConstantDesc) 1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet14 = constantDescSet9.descendingSet();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet17 = constantDescSet9.tailSet((java.lang.constant.ConstantDesc) 54, true);
        boolean boolean18 = constantDescSet1.remove((java.lang.Object) constantDescSet9);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNotNull(constantDescComparator8);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(constantDescSet14);
        org.junit.Assert.assertNotNull(constantDescSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.iterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = constantDescSet1.descendingSet();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNotNull(constantDescSet7);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        java.util.List<java.lang.String> strList2 = java.util.Collections.nCopies((int) ' ', "hi!");
        java.util.stream.Stream<java.lang.String> strStream3 = strList2.parallelStream();
        java.util.TreeSet<java.lang.String> strSet4 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strList2);
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection5 = java.util.Collections.unmodifiableCollection((java.util.Collection<java.lang.String>) strSet4);
        java.util.stream.Stream<java.lang.String> strStream6 = strSet4.parallelStream();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strStream3);
        org.junit.Assert.assertNotNull(strComparableCollection5);
        org.junit.Assert.assertNotNull(strStream6);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 1L, (java.lang.constant.ConstantDesc) 0L);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet8 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3, constantDescClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet6);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.last();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet9 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor10 = constantDescSet1.iterator();
        java.lang.Object obj11 = constantDescSet1.clone();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 1 + "'", constantDesc8, 1);
        org.junit.Assert.assertNotNull(constantDescItor10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[1]");
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 10.0d);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 2);
        java.lang.Object obj9 = constantDescSet1.clone();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet10 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator11 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet12 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator11);
        java.lang.constant.ConstantDesc constantDesc14 = constantDescSet12.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean16 = constantDescSet12.remove((java.lang.Object) (byte) -1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet18 = constantDescSet12.headSet((java.lang.constant.ConstantDesc) 0);
        java.lang.constant.ConstantDesc constantDesc20 = constantDescSet12.ceiling((java.lang.constant.ConstantDesc) 35);
        boolean boolean21 = constantDescSet12.isEmpty();
        boolean boolean22 = constantDescSet1.remove((java.lang.Object) constantDescSet12);
        java.lang.Object[] objArray23 = constantDescSet12.toArray();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator11);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(constantDescSet18);
        org.junit.Assert.assertNull(constantDesc20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum(100, (int) '#');
        int int7 = testingRandoop0.sum(1, (int) '#', 54);
        int int10 = testingRandoop0.sum((int) '4', 5);
        int int14 = testingRandoop0.sum((int) '4', 152, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 135 + "'", int3 == 135);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 90 + "'", int7 == 90);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 57 + "'", int10 == 57);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 204 + "'", int14 == 204);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.stream.Stream<java.lang.String> strStream1 = strSet0.stream();
        java.util.Set<java.lang.String> strSet3 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet4 = java.util.Collections.synchronizedSet(strSet3);
        java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet3);
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap6 = java.util.Collections.emptyNavigableMap();
        java.util.List<java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>> comparableMapMapList7 = java.util.Collections.singletonList((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap6);
        java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap8 = java.util.Collections.synchronizedSortedMap((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap6);
        int int9 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strSet3, (java.lang.Object) strComparableMapMap8);
        int int10 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strSet0, (java.lang.Object) strSet3);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator11 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet12 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator11);
        java.lang.constant.ConstantDesc constantDesc14 = constantDescSet12.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet16 = constantDescSet12.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator17 = constantDescSet12.spliterator();
        java.util.TreeSet<java.lang.String> strSet18 = new java.util.TreeSet<java.lang.String>();
        boolean boolean19 = constantDescSet12.containsAll((java.util.Collection<java.lang.String>) strSet18);
        java.util.Set<java.lang.String> strSet20 = java.util.Collections.unmodifiableSet((java.util.Set<java.lang.String>) strSet18);
        int int21 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strSet3, (java.lang.Object) strSet20);
        java.util.TreeSet<java.lang.String> strSet22 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet20);
        org.junit.Assert.assertNotNull(strStream1);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strComparableMapMap6);
        org.junit.Assert.assertNotNull(comparableMapMapList7);
        org.junit.Assert.assertNotNull(strComparableMapMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(constantDescComparator11);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertNotNull(constantDescSet16);
        org.junit.Assert.assertNotNull(constantDescSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "[]");
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean6 = constantDescSet1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet11 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) 0.0d, false, (java.lang.constant.ConstantDesc) 322, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Integer (java.lang.Double and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 1L, (java.lang.constant.ConstantDesc) 0L);
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator7 = constantDescSet3.comparator();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor8 = constantDescSet3.descendingIterator();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(wildcardComparator7);
        org.junit.Assert.assertNotNull(constantDescItor8);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.lang.String str7 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.higher((java.lang.constant.ConstantDesc) 1.0d);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet10 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor11 = constantDescSet1.descendingIterator();
        boolean boolean13 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNotNull(constantDescSet10);
        org.junit.Assert.assertNotNull(constantDescItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.ListIterator<java.io.Serializable> serializableItor8 = java.util.Collections.emptyListIterator();
        java.util.ListIterator<java.io.Serializable> serializableItor9 = java.util.Collections.emptyListIterator();
        java.util.ListIterator<java.io.Serializable> serializableItor10 = java.util.Collections.emptyListIterator();
        java.util.ListIterator[] listIteratorArray12 = new java.util.ListIterator[3];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<java.io.Serializable>[] serializableItorArray13 = (java.util.ListIterator<java.io.Serializable>[]) listIteratorArray12;
        serializableItorArray13[0] = serializableItor8;
        serializableItorArray13[1] = serializableItor9;
        serializableItorArray13[2] = serializableItor10;
        java.util.ListIterator<java.io.Serializable>[] serializableItorArray20 = constantDescSet1.toArray(serializableItorArray13);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet21 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator22 = constantDescSet21.spliterator();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(serializableItor8);
        org.junit.Assert.assertNotNull(serializableItor9);
        org.junit.Assert.assertNotNull(serializableItor10);
        org.junit.Assert.assertNotNull(listIteratorArray12);
        org.junit.Assert.assertNotNull(serializableItorArray13);
        org.junit.Assert.assertNotNull(serializableItorArray20);
        org.junit.Assert.assertNotNull(constantDescSpliterator22);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 10.0d);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 2);
        java.lang.Object obj9 = constantDescSet1.clone();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet10 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator11 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet12 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator11);
        java.lang.Object[] objArray13 = constantDescSet12.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet14 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet12);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet15 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet14);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator16 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet17 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator16);
        java.lang.constant.ConstantDesc constantDesc19 = constantDescSet17.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean21 = constantDescSet17.remove((java.lang.Object) (byte) -1);
        boolean boolean22 = constantDescSet14.equals((java.lang.Object) boolean21);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.Set<java.lang.String> strSet30 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet31 = java.util.Collections.synchronizedSet(strSet30);
        boolean boolean32 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList27, (java.util.Collection<java.lang.String>) strSet30);
        java.lang.Class<?> wildcardClass33 = strSet30.getClass();
        java.util.Set set34 = java.util.Collections.EMPTY_SET;
        java.lang.Class<?> wildcardClass35 = set34.getClass();
        java.util.Set<java.lang.invoke.TypeDescriptor> typeDescriptorSet36 = java.util.Collections.singleton((java.lang.invoke.TypeDescriptor) wildcardClass35);
        java.lang.Class[] classArray38 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray39 = (java.lang.Class<?>[]) classArray38;
        wildcardClassArray39[0] = wildcardClass33;
        wildcardClassArray39[1] = wildcardClass35;
        java.lang.Class<?>[] wildcardClassArray44 = constantDescSet14.toArray(wildcardClassArray39);
        boolean boolean45 = constantDescSet14.isEmpty();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet46 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet14);
        java.lang.constant.ConstantDesc constantDesc48 = constantDescSet14.higher((java.lang.constant.ConstantDesc) 3);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet50 = constantDescSet14.tailSet((java.lang.constant.ConstantDesc) 35);
        boolean boolean51 = constantDescSet1.remove((java.lang.Object) constantDescSet50);
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator52 = constantDescSet1.comparator();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet53 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator52);
        int int54 = constantDescSet53.size();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator16);
        org.junit.Assert.assertNull(constantDesc19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(typeDescriptorSet36);
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(constantDescSet46);
        org.junit.Assert.assertNull(constantDesc48);
        org.junit.Assert.assertNotNull(constantDescSet50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardComparator52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        java.util.NavigableSet<java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>> comparableMapMapSet0 = java.util.Collections.emptyNavigableSet();
        org.junit.Assert.assertNotNull(comparableMapMapSet0);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.last();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet9 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet10 = constantDescSet9.descendingSet();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 1 + "'", constantDesc8, 1);
        org.junit.Assert.assertNotNull(constantDescSet10);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor2 = constantDescSet1.descendingIterator();
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator3 = constantDescSet1.comparator();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Set<java.lang.String> strSet6 = java.util.Collections.singleton("hi!");
        java.util.Enumeration<java.lang.String> strEnumeration7 = java.util.Collections.enumeration((java.util.Collection<java.lang.String>) strSet6);
        boolean boolean8 = constantDescSet4.addAll((java.util.Collection<java.lang.String>) strSet6);
        java.util.Comparator<java.util.stream.BaseStream<java.lang.String, java.util.stream.Stream<java.lang.String>>> strBaseStreamComparator9 = java.util.Collections.reverseOrder();
        int int10 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strSet6, (java.lang.Object) strBaseStreamComparator9);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescItor2);
        org.junit.Assert.assertNotNull(wildcardComparator3);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strEnumeration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strBaseStreamComparator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        java.util.ListIterator<java.util.AbstractList<java.lang.String>> strListItor0 = java.util.Collections.emptyListIterator();
        java.lang.Class<?> wildcardClass1 = strListItor0.getClass();
        org.junit.Assert.assertNotNull(strListItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        java.util.List<java.lang.constant.Constable[]> constableArrayList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(constableArrayList0);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.last();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet9 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet10 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet9);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 1 + "'", constantDesc8, 1);
        org.junit.Assert.assertNotNull(constantDescSet10);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.lang.Object obj7 = constantDescSet1.clone();
        boolean boolean8 = constantDescSet1.isEmpty();
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet10 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1, constantDescClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        boolean boolean5 = constantDescSet1.isEmpty();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 100.0d);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator8 = constantDescSet1.spliterator();
        boolean boolean10 = constantDescSet1.remove((java.lang.Object) 100.0f);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator11 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet12 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator11);
        java.lang.Object[] objArray13 = constantDescSet12.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet14 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet12);
        java.lang.constant.ConstantDesc constantDesc16 = constantDescSet12.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc17 = constantDescSet12.pollFirst();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator18 = constantDescSet12.spliterator();
        java.util.List<java.util.Spliterator<java.lang.constant.ConstantDesc>> constantDescSpliteratorList19 = java.util.Collections.singletonList(constantDescSpliterator18);
        boolean boolean20 = constantDescSet1.remove((java.lang.Object) constantDescSpliteratorList19);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet23 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) "[]", true);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator24 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet25 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator24);
        java.lang.constant.ConstantDesc constantDesc27 = constantDescSet25.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean29 = constantDescSet25.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.TreeSet<java.lang.String> strSet30 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet31 = java.util.Collections.emptySet();
        boolean boolean32 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet30, (java.util.Collection<java.lang.String>) strSet31);
        boolean boolean33 = constantDescSet25.removeAll((java.util.Collection<java.lang.String>) strSet31);
        java.lang.constant.ConstantDesc constantDesc34 = constantDescSet25.pollFirst();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator35 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet36 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator35);
        java.lang.constant.ConstantDesc constantDesc38 = constantDescSet36.floor((java.lang.constant.ConstantDesc) "[]");
        boolean boolean39 = constantDescSet25.contains((java.lang.Object) constantDescSet36);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet40 = constantDescSet36.descendingSet();
        boolean boolean41 = constantDescSet1.contains((java.lang.Object) constantDescSet40);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(constantDescComparator11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(constantDesc16);
        org.junit.Assert.assertNull(constantDesc17);
        org.junit.Assert.assertNotNull(constantDescSpliterator18);
        org.junit.Assert.assertNotNull(constantDescSpliteratorList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(constantDescSet23);
        org.junit.Assert.assertNotNull(constantDescComparator24);
        org.junit.Assert.assertNull(constantDesc27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + constantDesc34 + "' != '" + 0.0f + "'", constantDesc34, 0.0f);
        org.junit.Assert.assertNotNull(constantDescComparator35);
        org.junit.Assert.assertNull(constantDesc38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(constantDescSet40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }
}

