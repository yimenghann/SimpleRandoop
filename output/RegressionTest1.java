package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        java.util.Iterator<java.lang.CharSequence> charSequenceItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(charSequenceItor0);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        java.util.NavigableMap<java.util.AbstractSet<java.lang.constant.ConstantDesc>, java.lang.Iterable<java.lang.String>[]> constantDescSetMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(constantDescSetMap0);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        java.util.Collection<java.lang.String> strCollection0 = null;
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder(constantDescComparator1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet3.ceiling((java.lang.constant.ConstantDesc) (-1L));
        java.util.Iterator<java.lang.Cloneable> cloneableItor6 = java.util.Collections.emptyIterator();
        boolean boolean7 = constantDescSet3.remove((java.lang.Object) cloneableItor6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = java.util.Collections.frequency(strCollection0, (java.lang.Object) constantDescSet3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.iterator()\" because \"c\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNotNull(cloneableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        java.util.Iterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(genericDeclarationItor0);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap0 = java.util.Collections.emptyMap();
        java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = java.util.Collections.synchronizedMap(strComparableMap0);
        java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap2 = java.util.Collections.synchronizedMap(strComparableMap1);
        java.lang.Class<java.lang.Comparable<java.lang.String>> strComparableClass3 = null;
        java.lang.Class<java.lang.CharSequence> charSequenceClass4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap5 = java.util.Collections.checkedMap(strComparableMap1, strComparableClass3, charSequenceClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableMap0);
        org.junit.Assert.assertNotNull(strComparableMap1);
        org.junit.Assert.assertNotNull(strComparableMap2);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 10.0d);
        java.util.Set<java.io.Serializable[]> serializableArraySet7 = java.util.Collections.emptySet();
        boolean boolean8 = constantDescSet1.equals((java.lang.Object) serializableArraySet7);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet11 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 100.0f, false);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator12 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet13 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator12);
        java.lang.constant.ConstantDesc constantDesc15 = constantDescSet13.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet16 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet13);
        boolean boolean17 = constantDescSet1.equals((java.lang.Object) constantDescSet13);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet19 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1, constantDescClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(constantDescSet11);
        org.junit.Assert.assertNotNull(constantDescComparator12);
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertNotNull(constantDescSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        java.util.Comparator<java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>> comparableMapMapComparator0 = java.util.Collections.reverseOrder();
        org.junit.Assert.assertNotNull(comparableMapMapComparator0);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
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
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator24 = constantDescSet1.spliterator();
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
        org.junit.Assert.assertNotNull(constantDescSpliterator24);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.Collection<java.lang.String> strCollection5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>) strList3);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator6 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet7 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator6);
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet7.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet11 = constantDescSet7.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet12 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet7);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet15 = constantDescSet7.headSet((java.lang.constant.ConstantDesc) (-1L), true);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator16 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet17 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator16);
        java.lang.Object[] objArray18 = constantDescSet17.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet19 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet17);
        java.lang.constant.ConstantDesc constantDesc21 = constantDescSet17.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc22 = constantDescSet17.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet23 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet17);
        java.util.List<java.lang.String> strList26 = java.util.Collections.nCopies((int) ' ', "hi!");
        boolean boolean27 = constantDescSet17.containsAll((java.util.Collection<java.lang.String>) strList26);
        java.util.Set<java.lang.String> strSet28 = java.util.Collections.emptySet();
        boolean boolean29 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList26, (java.util.Collection<java.lang.String>) strSet28);
        java.lang.Object obj30 = null;
        int int31 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strList26, obj30);
        boolean boolean32 = constantDescSet7.removeAll((java.util.Collection<java.lang.String>) strList26);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator33 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet34 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator33);
        java.lang.constant.ConstantDesc constantDesc36 = constantDescSet34.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator37 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet38 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator37);
        java.lang.constant.ConstantDesc constantDesc40 = constantDescSet38.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet42 = constantDescSet38.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator43 = constantDescSet38.spliterator();
        java.util.TreeSet<java.lang.String> strSet44 = new java.util.TreeSet<java.lang.String>();
        boolean boolean45 = constantDescSet38.containsAll((java.util.Collection<java.lang.String>) strSet44);
        java.util.Set<java.lang.String> strSet46 = java.util.Collections.unmodifiableSet((java.util.Set<java.lang.String>) strSet44);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator47 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet48 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator47);
        java.lang.constant.ConstantDesc constantDesc50 = constantDescSet48.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet52 = constantDescSet48.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet53 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet48);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet54 = java.util.Collections.unmodifiableNavigableSet(constantDescSet53);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet55 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet54);
        int int56 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strSet44, (java.lang.Object) constantDescSet54);
        boolean boolean57 = constantDescSet34.removeAll((java.util.Collection<java.lang.String>) strSet44);
        boolean boolean58 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList26, (java.util.Collection<java.lang.String>) strSet44);
        java.util.stream.Stream<java.lang.String> strStream59 = strList26.parallelStream();
        java.util.Map<java.lang.Iterable<java.lang.String>, java.util.stream.Stream<java.lang.String>> strIterableMap60 = java.util.Collections.singletonMap((java.lang.Iterable<java.lang.String>) strCollection5, strStream59);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(constantDescComparator6);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNotNull(constantDescSet11);
        org.junit.Assert.assertNotNull(constantDescSet12);
        org.junit.Assert.assertNotNull(constantDescSet15);
        org.junit.Assert.assertNotNull(constantDescComparator16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNull(constantDesc21);
        org.junit.Assert.assertNull(constantDesc22);
        org.junit.Assert.assertNotNull(constantDescSet23);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(constantDescComparator33);
        org.junit.Assert.assertNull(constantDesc36);
        org.junit.Assert.assertNotNull(constantDescComparator37);
        org.junit.Assert.assertNull(constantDesc40);
        org.junit.Assert.assertNotNull(constantDescSet42);
        org.junit.Assert.assertNotNull(constantDescSpliterator43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(constantDescComparator47);
        org.junit.Assert.assertNull(constantDesc50);
        org.junit.Assert.assertNotNull(constantDescSet52);
        org.junit.Assert.assertNotNull(constantDescSet53);
        org.junit.Assert.assertNotNull(constantDescSet54);
        org.junit.Assert.assertNotNull(constantDescSet55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strStream59);
        org.junit.Assert.assertNotNull(strIterableMap60);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        java.util.NavigableSet<java.util.Spliterator<java.lang.constant.ConstantDesc>> constantDescSpliteratorSet0 = java.util.Collections.emptyNavigableSet();
        org.junit.Assert.assertNotNull(constantDescSpliteratorSet0);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet3 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 100);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator4 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet5 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator4);
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet5.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean9 = constantDescSet5.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet11 = java.util.Collections.emptySet();
        boolean boolean12 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet10, (java.util.Collection<java.lang.String>) strSet11);
        boolean boolean13 = constantDescSet5.removeAll((java.util.Collection<java.lang.String>) strSet11);
        java.lang.constant.ConstantDesc constantDesc14 = constantDescSet5.pollFirst();
        boolean boolean15 = constantDescSet1.equals((java.lang.Object) constantDescSet5);
        constantDescSet5.clear();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescSet3);
        org.junit.Assert.assertNotNull(constantDescComparator4);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 0.0f + "'", constantDesc14, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
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
        java.lang.String str25 = constantDescSet1.toString();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet1 = java.util.Collections.emptySet();
        boolean boolean2 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet0, (java.util.Collection<java.lang.String>) strSet1);
        java.util.Set<java.lang.String> strSet3 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.String>) strSet0);
        java.util.stream.Stream<java.lang.String> strStream4 = strSet0.stream();
        java.lang.Class<?> wildcardClass5 = strSet0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strStream4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.lang.Object[] objArray5 = constantDescSet4.toArray();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.iterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 10.0d, false);
        java.lang.constant.ConstantDesc constantDesc11 = constantDescSet1.floor((java.lang.constant.ConstantDesc) 100);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNotNull(constantDescSet9);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap0 = java.util.Collections.emptyNavigableMap();
        java.util.List<java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>> comparableMapMapList1 = java.util.Collections.singletonList((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap0);
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap2 = java.util.Collections.synchronizedNavigableMap(strComparableMapMap0);
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap3 = java.util.Collections.synchronizedNavigableMap(strComparableMapMap2);
        org.junit.Assert.assertNotNull(strComparableMapMap0);
        org.junit.Assert.assertNotNull(comparableMapMapList1);
        org.junit.Assert.assertNotNull(strComparableMapMap2);
        org.junit.Assert.assertNotNull(strComparableMapMap3);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
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
        java.lang.Object obj15 = constantDescSet3.clone();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet16 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.lang.constant.ConstantDesc constantDesc18 = constantDescSet3.lower((java.lang.constant.ConstantDesc) 54);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator5);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(constantDescSet14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[]");
        org.junit.Assert.assertNotNull(constantDescSet16);
        org.junit.Assert.assertNull(constantDesc18);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.last();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet9 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.Object obj10 = constantDescSet9.clone();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 1 + "'", constantDesc8, 1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "[1]");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.iterator();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
        boolean boolean8 = constantDescSet1.retainAll((java.util.Collection<java.lang.String>) strSet7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet1.floor((java.lang.constant.ConstantDesc) 52);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet11 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertNotNull(constantDescSet11);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.Set<java.lang.String> strSet14 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet15 = java.util.Collections.synchronizedSet(strSet14);
        boolean boolean16 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList11, (java.util.Collection<java.lang.String>) strSet14);
        java.util.List<java.util.AbstractList<java.lang.String>> strListList17 = java.util.Collections.nCopies(236, (java.util.AbstractList<java.lang.String>) strList11);
        boolean boolean18 = constantDescSet1.removeAll((java.util.Collection<java.lang.String>) strList11);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strListList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        TestingRandoop testingRandoop1 = new TestingRandoop();
        int int4 = testingRandoop1.sum(100, (int) '#');
        int int7 = testingRandoop1.sum(10, (int) '#');
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
        java.util.Map<TestingRandoop, java.lang.Object[]> testingRandoopMap42 = java.util.Collections.singletonMap(testingRandoop1, (java.lang.Object[]) wildcardClassArray36);
        java.util.List<java.lang.constant.Constable[]> constableArrayList43 = java.util.Collections.nCopies(33, (java.lang.constant.Constable[]) wildcardClassArray36);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 135 + "'", int4 == 135);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 45 + "'", int7 == 45);
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
        org.junit.Assert.assertNotNull(testingRandoopMap42);
        org.junit.Assert.assertNotNull(constableArrayList43);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 10.0d);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 2);
        java.lang.Object obj9 = constantDescSet1.clone();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet10 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc12 = constantDescSet1.floor((java.lang.constant.ConstantDesc) 1);
        constantDescSet1.clear();
        boolean boolean14 = constantDescSet1.isEmpty();
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
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet6 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) (-1L), true);
        boolean boolean10 = constantDescSet1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc11 = constantDescSet1.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(constantDescSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        java.util.Collection<java.lang.String> strCollection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>(strCollection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.size()\" because \"c\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
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
        boolean boolean15 = constantDescSet3.add((java.lang.constant.ConstantDesc) 99);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator5);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet10 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 1, true);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor11 = constantDescSet1.iterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet12 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet13 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescSet10);
        org.junit.Assert.assertNotNull(constantDescItor11);
        org.junit.Assert.assertNotNull(constantDescSet12);
        org.junit.Assert.assertNotNull(constantDescSet13);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 1L, (java.lang.constant.ConstantDesc) 0L);
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator7 = constantDescSet3.comparator();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator7);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet8);
        java.lang.Object[] objArray10 = constantDescSet8.toArray();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(wildcardComparator7);
        org.junit.Assert.assertNotNull(constantDescSet9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet1.descendingSet();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet7 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSet6);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        java.util.List<java.lang.constant.Constable> constableList2 = java.util.Collections.nCopies(152, (java.lang.constant.Constable) 419);
        org.junit.Assert.assertNotNull(constableList2);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator1);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator3 = java.util.Collections.reverseOrder(constantDescComparator1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator3);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator5 = constantDescSet4.spliterator();
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = java.util.Collections.nCopies(236, constantDescSet4);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNotNull(constantDescComparator3);
        org.junit.Assert.assertNotNull(constantDescSpliterator5);
        org.junit.Assert.assertNotNull(constantDescSetList6);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
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
        int int17 = constantDescSet3.size();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet22 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 202, false, (java.lang.constant.ConstantDesc) 196, true);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet23 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(constantDescSet22);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Set<java.util.AbstractSet<java.lang.constant.ConstantDesc>> constantDescSetSet6 = java.util.Collections.singleton((java.util.AbstractSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.ceiling((java.lang.constant.ConstantDesc) 1.0f);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = constantDescSet1.descendingSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = constantDescSet1.add((java.lang.constant.ConstantDesc) 132);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Float (java.lang.Integer and java.lang.Float are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
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
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        java.util.Map<java.util.Comparator<java.lang.constant.ConstantDesc>, java.lang.Comparable<java.lang.String>> constantDescComparatorMap5 = java.util.Collections.emptyMap();
        boolean boolean6 = constantDescSet1.equals((java.lang.Object) constantDescComparatorMap5);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = constantDescSet1.descendingSet();
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator8 = constantDescSet1.comparator();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator9 = java.util.Collections.reverseOrder((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator8);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNotNull(constantDescComparatorMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(wildcardComparator8);
        org.junit.Assert.assertNotNull(constantDescComparator9);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.iterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 10.0d, false);
        java.lang.constant.ConstantDesc constantDesc11 = constantDescSet1.ceiling((java.lang.constant.ConstantDesc) 245);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet12 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNotNull(constantDescSet9);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertNotNull(constantDescSet12);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc4 = constantDescSet2.ceiling((java.lang.constant.ConstantDesc) (-1L));
        boolean boolean6 = constantDescSet2.remove((java.lang.Object) 1L);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet6 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
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
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet22 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        boolean boolean23 = constantDescSet1.isEmpty();
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
        org.junit.Assert.assertNotNull(constantDescSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.lang.String str7 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.higher((java.lang.constant.ConstantDesc) 1.0d);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet10 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc12 = constantDescSet1.higher((java.lang.constant.ConstantDesc) 0.0f);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNotNull(constantDescSet10);
        org.junit.Assert.assertNull(constantDesc12);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum(0, 1);
        int int7 = testingRandoop0.sum((int) 'a', 100, (-1));
        int int11 = testingRandoop0.sum(132, (int) (byte) 100, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 196 + "'", int7 == 196);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 265 + "'", int11 == 265);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.Object obj5 = constantDescSet1.clone();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor7 = constantDescSet1.descendingIterator();
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.pollFirst();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[]");
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescItor7);
        org.junit.Assert.assertNull(constantDesc8);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet3 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 100);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator4 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet5 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator4);
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet5.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean9 = constantDescSet5.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet11 = java.util.Collections.emptySet();
        boolean boolean12 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet10, (java.util.Collection<java.lang.String>) strSet11);
        boolean boolean13 = constantDescSet5.removeAll((java.util.Collection<java.lang.String>) strSet11);
        java.lang.constant.ConstantDesc constantDesc14 = constantDescSet5.pollFirst();
        boolean boolean15 = constantDescSet1.equals((java.lang.Object) constantDescSet5);
        boolean boolean17 = constantDescSet1.add((java.lang.constant.ConstantDesc) 33);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescSet3);
        org.junit.Assert.assertNotNull(constantDescComparator4);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 0.0f + "'", constantDesc14, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        java.util.Iterator<java.util.ListIterator<java.io.Serializable>[]> serializableItorArrayItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(serializableItorArrayItor0);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        java.util.List<java.lang.constant.ConstantDesc> constantDescList2 = java.util.Collections.nCopies(132, (java.lang.constant.ConstantDesc) (-1));
        org.junit.Assert.assertNotNull(constantDescList2);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator7 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator8 = java.util.Collections.reverseOrder(constantDescComparator7);
        java.util.Map<java.util.Spliterator<java.lang.constant.ConstantDesc>, java.util.Comparator<java.lang.constant.ConstantDesc>> constantDescSpliteratorMap9 = java.util.Collections.singletonMap(constantDescSpliterator6, constantDescComparator7);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet10 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator7);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescComparator7);
        org.junit.Assert.assertNotNull(constantDescComparator8);
        org.junit.Assert.assertNotNull(constantDescSpliteratorMap9);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor5 = constantDescSet4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet10 = constantDescSet4.subSet((java.lang.constant.ConstantDesc) 10.0d, false, (java.lang.constant.ConstantDesc) (-1.0f), false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Float (java.lang.Double and java.lang.Float are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescItor5);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet1 = java.util.Collections.unmodifiableSortedSet(constantDescSet0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"s\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        java.util.SortedSet<java.util.ListIterator<java.io.Serializable>[]> serializableItorArraySet0 = java.util.Collections.emptySortedSet();
        org.junit.Assert.assertNotNull(serializableItorArraySet0);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        java.util.NavigableMap<java.util.stream.Stream<java.lang.String>[], java.util.Iterator<java.io.Serializable>> strStreamArrayMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(strStreamArrayMap0);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet3 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 100);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator4 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet5 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator4);
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet5.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean9 = constantDescSet5.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet11 = java.util.Collections.emptySet();
        boolean boolean12 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet10, (java.util.Collection<java.lang.String>) strSet11);
        boolean boolean13 = constantDescSet5.removeAll((java.util.Collection<java.lang.String>) strSet11);
        java.lang.constant.ConstantDesc constantDesc14 = constantDescSet5.pollFirst();
        boolean boolean15 = constantDescSet1.equals((java.lang.Object) constantDescSet5);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet20 = constantDescSet5.subSet((java.lang.constant.ConstantDesc) 230, true, (java.lang.constant.ConstantDesc) 5, false);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet21 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescSet3);
        org.junit.Assert.assertNotNull(constantDescComparator4);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 0.0f + "'", constantDesc14, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(constantDescSet20);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.lang.Object obj7 = constantDescSet1.clone();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor9 = constantDescSet1.descendingIterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet10 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc12 = constantDescSet1.higher((java.lang.constant.ConstantDesc) 0);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet13 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        constantDescSet1.clear();
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
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNotNull(constantDescSet13);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet8 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) "", true);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet9 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc11 = constantDescSet1.higher((java.lang.constant.ConstantDesc) 1L);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet12 = constantDescSet1.descendingSet();
        java.lang.constant.ConstantDesc constantDesc14 = constantDescSet1.higher((java.lang.constant.ConstantDesc) 204);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSet8);
        org.junit.Assert.assertNotNull(constantDescSet9);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertNotNull(constantDescSet12);
        org.junit.Assert.assertNull(constantDesc14);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "[]");
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet8 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) (-1.0f), true, (java.lang.constant.ConstantDesc) (-1.0f), false);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet11 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 0L, true);
        java.lang.Class<?> wildcardClass12 = constantDescSet1.getClass();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet8);
        org.junit.Assert.assertNotNull(constantDescSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet1.ceiling((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator8 = constantDescSet1.spliterator();
        constantDescSet1.clear();
        java.lang.Class<?> wildcardClass10 = constantDescSet1.getClass();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNotNull(constantDescSpliterator8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 10.0d);
        java.util.Set<java.io.Serializable[]> serializableArraySet7 = java.util.Collections.emptySet();
        boolean boolean8 = constantDescSet1.equals((java.lang.Object) serializableArraySet7);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet11 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 100.0f, false);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator12 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet13 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator12);
        java.lang.constant.ConstantDesc constantDesc15 = constantDescSet13.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet17 = constantDescSet13.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet18 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet13);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet19 = java.util.Collections.unmodifiableNavigableSet(constantDescSet18);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet20 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet18);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet21 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet18);
        boolean boolean22 = constantDescSet1.contains((java.lang.Object) constantDescSet21);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(serializableArraySet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(constantDescSet11);
        org.junit.Assert.assertNotNull(constantDescComparator12);
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertNotNull(constantDescSet17);
        org.junit.Assert.assertNotNull(constantDescSet18);
        org.junit.Assert.assertNotNull(constantDescSet19);
        org.junit.Assert.assertNotNull(constantDescSet20);
        org.junit.Assert.assertNotNull(constantDescSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.descendingIterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 1L);
        java.lang.Object obj10 = constantDescSet1.clone();
        java.lang.constant.ConstantDesc constantDesc12 = constantDescSet1.floor((java.lang.constant.ConstantDesc) 10.0d);
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
        org.junit.Assert.assertNull(constantDesc12);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
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
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor53 = constantDescSet1.iterator();
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
        org.junit.Assert.assertNotNull(constantDescItor53);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator1);
        java.lang.constant.ConstantDesc constantDesc4 = constantDescSet2.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str5 = constantDescSet2.toString();
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet2.pollLast();
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet2.ceiling((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator9 = constantDescSet2.spliterator();
        java.util.List<java.util.Spliterator<java.lang.constant.ConstantDesc>> constantDescSpliteratorList10 = java.util.Collections.nCopies(2, constantDescSpliterator9);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNotNull(constantDescSpliterator9);
        org.junit.Assert.assertNotNull(constantDescSpliteratorList10);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
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
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator53 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet54 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator53);
        java.lang.constant.ConstantDesc constantDesc56 = constantDescSet54.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet58 = constantDescSet54.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.lang.Object[] objArray59 = constantDescSet54.toArray();
        int int60 = constantDescSet54.size();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator61 = constantDescSet54.spliterator();
        java.util.NavigableMap<java.lang.Iterable<java.lang.String>, java.util.Collection<java.lang.String>> strIterableMap62 = java.util.Collections.emptyNavigableMap();
        boolean boolean63 = constantDescSet54.equals((java.lang.Object) strIterableMap62);
        boolean boolean64 = constantDescSet1.equals((java.lang.Object) constantDescSet54);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator65 = constantDescSet54.spliterator();
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
        org.junit.Assert.assertNotNull(constantDescComparator53);
        org.junit.Assert.assertNull(constantDesc56);
        org.junit.Assert.assertNotNull(constantDescSet58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(constantDescSpliterator61);
        org.junit.Assert.assertNotNull(strIterableMap62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator65);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        boolean boolean5 = constantDescSet1.isEmpty();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) (-1.0d));
        int int8 = constantDescSet1.size();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
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
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator17 = java.util.Collections.reverseOrder((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator16);
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
        org.junit.Assert.assertNotNull(constantDescComparator17);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap1 = java.util.Collections.emptyNavigableMap();
        java.util.List<java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>> comparableMapMapList2 = java.util.Collections.nCopies((int) (byte) 1, strComparableMapMap1);
        java.lang.Class<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableMapClass3 = null;
        java.lang.Class<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetClass4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap5 = java.util.Collections.checkedSortedMap((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap1, strComparableMapClass3, constantDescSetClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableMapMap1);
        org.junit.Assert.assertNotNull(comparableMapMapList2);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
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
        java.lang.constant.ConstantDesc constantDesc13 = null;
        java.lang.constant.ConstantDesc constantDesc14 = constantDescSet1.higher(constantDesc13);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet15 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
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
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertNotNull(constantDescSet15);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum(0, 1);
        int int7 = testingRandoop0.sum((int) 'a', 100, (-1));
        int int11 = testingRandoop0.sum(4, (int) 'a', (int) (byte) -1);
        int int15 = testingRandoop0.sum(99, 186, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 196 + "'", int7 == 196);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 289 + "'", int15 == 289);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet1 = java.util.Collections.emptySet();
        boolean boolean2 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet0, (java.util.Collection<java.lang.String>) strSet1);
        java.util.Set<java.lang.String> strSet3 = java.util.Collections.unmodifiableSet((java.util.Set<java.lang.String>) strSet0);
        java.util.Enumeration<java.lang.String> strEnumeration4 = java.util.Collections.enumeration((java.util.Collection<java.lang.String>) strSet3);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strEnumeration4);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollLast();
        constantDescSet1.clear();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator8 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet9 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator8);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator10 = java.util.Collections.reverseOrder(constantDescComparator8);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet11 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator10);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator12 = java.util.Collections.reverseOrder(constantDescComparator10);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator13 = java.util.Collections.reverseOrder(constantDescComparator12);
        boolean boolean14 = constantDescSet1.contains((java.lang.Object) constantDescComparator13);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 1 + "'", constantDesc6, 1);
        org.junit.Assert.assertNotNull(constantDescComparator8);
        org.junit.Assert.assertNotNull(constantDescComparator10);
        org.junit.Assert.assertNotNull(constantDescComparator12);
        org.junit.Assert.assertNotNull(constantDescComparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet10 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 1, true);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor11 = constantDescSet1.iterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet12 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc14 = constantDescSet1.floor((java.lang.constant.ConstantDesc) 92);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescSet10);
        org.junit.Assert.assertNotNull(constantDescItor11);
        org.junit.Assert.assertNotNull(constantDescSet12);
        org.junit.Assert.assertNull(constantDesc14);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "[]");
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator4 = constantDescSet1.comparator();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(wildcardComparator4);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.last();
        java.util.TreeSet<java.lang.String> strSet9 = new java.util.TreeSet<java.lang.String>();
        java.util.Collection<java.lang.String> strCollection10 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>) strSet9);
        boolean boolean11 = constantDescSet1.retainAll((java.util.Collection<java.lang.String>) strSet9);
        java.lang.constant.ConstantDesc constantDesc13 = constantDescSet1.higher((java.lang.constant.ConstantDesc) 51);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 1 + "'", constantDesc8, 1);
        org.junit.Assert.assertNotNull(strCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(constantDesc13);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        java.util.NavigableMap<java.lang.CharSequence, java.lang.constant.ConstantDesc[]> charSequenceMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(charSequenceMap0);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet4 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Set<java.util.AbstractCollection<java.lang.constant.ConstantDesc>> constantDescCollectionSet5 = java.util.Collections.emptySet();
        boolean boolean6 = constantDescSet1.contains((java.lang.Object) constantDescCollectionSet5);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNotNull(constantDescCollectionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator1);
        java.lang.constant.ConstantDesc constantDesc4 = constantDescSet2.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.List<java.util.NavigableSet<java.lang.constant.ConstantDesc>> constantDescSetList5 = java.util.Collections.nCopies((int) (short) 0, (java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet2);
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet2.lower((java.lang.constant.ConstantDesc) 136);
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet2.higher((java.lang.constant.ConstantDesc) 1.0d);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet2.pollFirst();
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNotNull(constantDescSetList5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNull(constantDesc10);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollLast();
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.ceiling((java.lang.constant.ConstantDesc) 100.0d);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor9 = constantDescSet1.iterator();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator10 = constantDescSet1.spliterator();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 1 + "'", constantDesc6, 1);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertNotNull(constantDescItor9);
        org.junit.Assert.assertNotNull(constantDescSpliterator10);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        java.util.Set<java.lang.constant.Constable[]> constableArraySet0 = java.util.Collections.emptySet();
        org.junit.Assert.assertNotNull(constableArraySet0);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        java.util.Set<java.lang.String> strSet1 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet2 = java.util.Collections.synchronizedSet(strSet1);
        java.util.TreeSet<java.lang.String> strSet3 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet1);
        java.util.Set<java.lang.String> strSet4 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.String>) strSet3);
        java.util.stream.Stream<java.lang.String> strStream5 = strSet4.parallelStream();
        java.util.Collection<java.lang.String> strCollection6 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>) strSet4);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strStream5);
        org.junit.Assert.assertNotNull(strCollection6);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc[] constantDescArray12 = new java.lang.constant.ConstantDesc[] { 1.0f, 100.0d, 10L, (-1), 10.0f, 10L };
        java.lang.constant.ConstantDesc[] constantDescArray13 = constantDescSet1.toArray(constantDescArray12);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor14 = constantDescSet1.descendingIterator();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator15 = constantDescSet1.spliterator();
        java.lang.Object[] objArray16 = constantDescSet1.toArray();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet17 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
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
        org.junit.Assert.assertNotNull(constantDescSet17);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 10.0d);
        java.util.Set<java.io.Serializable[]> serializableArraySet7 = java.util.Collections.emptySet();
        boolean boolean8 = constantDescSet1.equals((java.lang.Object) serializableArraySet7);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet11 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 100.0f, false);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator12 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet13 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator12);
        java.lang.constant.ConstantDesc constantDesc15 = constantDescSet13.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet16 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet13);
        boolean boolean17 = constantDescSet1.equals((java.lang.Object) constantDescSet13);
        java.util.Set<java.lang.String> strSet19 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet20 = java.util.Collections.synchronizedSet(strSet19);
        boolean boolean21 = constantDescSet13.removeAll((java.util.Collection<java.lang.String>) strSet19);
        java.lang.constant.ConstantDesc constantDesc22 = constantDescSet13.pollFirst();
        java.lang.constant.ConstantDesc constantDesc24 = constantDescSet13.higher((java.lang.constant.ConstantDesc) 0L);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(serializableArraySet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(constantDescSet11);
        org.junit.Assert.assertNotNull(constantDescComparator12);
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertNotNull(constantDescSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(constantDesc22);
        org.junit.Assert.assertNull(constantDesc24);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        java.util.List<java.util.SortedSet<java.lang.constant.ConstantDesc>> constantDescSetList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(constantDescSetList0);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        java.util.ListIterator<java.util.AbstractCollection<java.lang.constant.ConstantDesc>> constantDescCollectionItor0 = java.util.Collections.emptyListIterator();
        org.junit.Assert.assertNotNull(constantDescCollectionItor0);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet1.ceiling((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator8 = constantDescSet1.spliterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = constantDescSet1.descendingSet();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNotNull(constantDescSpliterator8);
        org.junit.Assert.assertNotNull(constantDescSet9);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = constantDescSet1.descendingSet();
        java.util.List<java.lang.String> strList10 = java.util.Collections.nCopies((int) ' ', "hi!");
        java.util.stream.Stream<java.lang.String> strStream11 = strList10.parallelStream();
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = constantDescSet1.addAll((java.util.Collection<java.lang.String>) strSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strStream11);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        java.util.Set<java.lang.Iterable<java.lang.String>[]> strIterableArraySet0 = java.util.Collections.emptySet();
        org.junit.Assert.assertNotNull(strIterableArraySet0);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        java.util.Comparator<java.util.Collection<java.lang.String>[]> strCollectionArrayComparator0 = java.util.Collections.reverseOrder();
        org.junit.Assert.assertNotNull(strCollectionArrayComparator0);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        boolean boolean5 = constantDescSet1.isEmpty();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator7 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet8.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str11 = constantDescSet8.toString();
        java.lang.constant.ConstantDesc constantDesc12 = constantDescSet8.pollLast();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator13 = constantDescSet8.spliterator();
        boolean boolean14 = constantDescSet1.contains((java.lang.Object) constantDescSpliterator13);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescComparator7);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNotNull(constantDescSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
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
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator14 = java.util.Collections.reverseOrder(constantDescComparator13);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet15 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator14);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet17 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet15, constantDescClass16);
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
        org.junit.Assert.assertNotNull(wildcardComparator11);
        org.junit.Assert.assertNotNull(constantDescComparator12);
        org.junit.Assert.assertNotNull(constantDescComparator13);
        org.junit.Assert.assertNotNull(constantDescComparator14);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        java.util.NavigableMap<java.util.Collection<java.lang.String>, java.util.Comparator<java.lang.constant.ConstantDesc>> strCollectionMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(strCollectionMap0);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
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
        boolean boolean17 = constantDescSet1.add((java.lang.constant.ConstantDesc) 419);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        java.util.Comparator<java.util.AbstractSet<java.lang.constant.ConstantDesc>> constantDescSetComparator0 = java.util.Collections.reverseOrder();
        org.junit.Assert.assertNotNull(constantDescSetComparator0);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.iterator();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
        boolean boolean8 = constantDescSet1.retainAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet10 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 4);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(constantDescSet10);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        java.util.Iterator<java.util.stream.Stream<java.lang.String>> strStreamItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(strStreamItor0);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        java.util.SortedMap<java.lang.AutoCloseable, java.util.ListIterator<java.io.Serializable>[]> autoCloseableMap0 = java.util.Collections.emptySortedMap();
        org.junit.Assert.assertNotNull(autoCloseableMap0);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        java.util.NavigableMap<java.lang.constant.ConstantDesc, java.util.AbstractCollection<java.lang.constant.ConstantDesc>> constantDescMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(constantDescMap0);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
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
        java.util.ArrayList<java.lang.String> strList13 = java.util.Collections.list(strEnumeration11);
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
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.List<java.lang.String> strList6 = java.util.Collections.nCopies((int) ' ', "hi!");
        java.util.stream.Stream<java.lang.String> strStream7 = strList6.parallelStream();
        boolean boolean8 = constantDescSet3.removeAll((java.util.Collection<java.lang.String>) strList6);
        java.util.Collection<java.lang.String> strCollection9 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>) strList6);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strCollection9);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        java.util.Comparator<java.util.LinkedHashSet<java.lang.String>> strSetComparator0 = java.util.Collections.reverseOrder();
        org.junit.Assert.assertNotNull(strSetComparator0);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet4 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 10.0f);
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet1.pollLast();
        java.lang.Object obj8 = constantDescSet1.clone();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet1.descendingSet();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        boolean boolean8 = constantDescSet1.isEmpty();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.last();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor9 = constantDescSet1.iterator();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 1 + "'", constantDesc8, 1);
        org.junit.Assert.assertNotNull(constantDescItor9);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        boolean boolean5 = constantDescSet1.isEmpty();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 100.0d);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator8 = constantDescSet1.spliterator();
        boolean boolean10 = constantDescSet1.remove((java.lang.Object) 100.0f);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet12 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 1L);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet13 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescSet12);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(constantDescSet12);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet3 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 100);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator4 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet5 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator4);
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet5.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean9 = constantDescSet5.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet11 = java.util.Collections.emptySet();
        boolean boolean12 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet10, (java.util.Collection<java.lang.String>) strSet11);
        boolean boolean13 = constantDescSet5.removeAll((java.util.Collection<java.lang.String>) strSet11);
        java.lang.constant.ConstantDesc constantDesc14 = constantDescSet5.pollFirst();
        boolean boolean15 = constantDescSet1.equals((java.lang.Object) constantDescSet5);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "[1]" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.TreeSet<java.lang.String> strSet21 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet22 = java.util.Collections.emptySet();
        boolean boolean23 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet21, (java.util.Collection<java.lang.String>) strSet22);
        java.util.Set<java.lang.String> strSet24 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.String>) strSet21);
        java.util.Set<java.lang.String> strSet26 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet27 = java.util.Collections.synchronizedSet(strSet26);
        boolean boolean28 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet21, (java.util.Collection<java.lang.String>) strSet26);
        boolean boolean29 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList19, (java.util.Collection<java.lang.String>) strSet26);
        boolean boolean30 = constantDescSet5.retainAll((java.util.Collection<java.lang.String>) strList19);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescSet3);
        org.junit.Assert.assertNotNull(constantDescComparator4);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 0.0f + "'", constantDesc14, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap1 = java.util.Collections.synchronizedNavigableMap(strComparableMapMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator3 = java.util.Collections.reverseOrder(constantDescComparator2);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator4 = java.util.Collections.reverseOrder(constantDescComparator3);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertNotNull(constantDescComparator3);
        org.junit.Assert.assertNotNull(constantDescComparator4);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        java.util.NavigableSet<java.lang.Iterable<java.lang.String>[]> strIterableArraySet0 = java.util.Collections.emptyNavigableSet();
        org.junit.Assert.assertNotNull(strIterableArraySet0);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.iterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 10.0d, false);
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator10 = constantDescSet1.comparator();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet11 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator10);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNotNull(constantDescSet9);
        org.junit.Assert.assertNotNull(wildcardComparator10);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
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
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor20 = constantDescSet1.iterator();
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
        org.junit.Assert.assertNotNull(constantDescItor20);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object obj3 = constantDescSet2.clone();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "[]");
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum((int) (byte) 0, (int) '#');
        int int6 = testingRandoop0.sum((int) (short) -1, 0);
        int int9 = testingRandoop0.sum((int) (short) 1, (int) (short) 1);
        int int12 = testingRandoop0.sum(3, 51);
        int int15 = testingRandoop0.sum(0, (-1));
        int int18 = testingRandoop0.sum(2, 245);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 54 + "'", int12 == 54);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 247 + "'", int18 == 247);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        java.util.Map<java.util.Enumeration<java.lang.String>, java.lang.Class<?>[]> strEnumerationMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(strEnumerationMap0);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        java.util.Enumeration<java.lang.reflect.AnnotatedElement> annotatedElementEnumeration0 = java.util.Collections.emptyEnumeration();
        org.junit.Assert.assertNotNull(annotatedElementEnumeration0);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        java.util.Map<java.lang.constant.Constable[], java.lang.reflect.AnnotatedElement> constableArrayMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(constableArrayMap0);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.last();
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.last();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor10 = constantDescSet1.descendingIterator();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 1 + "'", constantDesc8, 1);
        org.junit.Assert.assertEquals("'" + constantDesc9 + "' != '" + 1 + "'", constantDesc9, 1);
        org.junit.Assert.assertNotNull(constantDescItor10);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.lang.Object[] objArray6 = constantDescSet1.toArray();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(constantDescSet7);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet1 = java.util.Collections.emptySet();
        boolean boolean2 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet0, (java.util.Collection<java.lang.String>) strSet1);
        java.util.Set<java.lang.String> strSet3 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.String>) strSet0);
        java.util.Set<java.lang.String> strSet5 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet6 = java.util.Collections.synchronizedSet(strSet5);
        boolean boolean7 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet0, (java.util.Collection<java.lang.String>) strSet5);
        java.util.Set<java.lang.String> strSet8 = java.util.Collections.synchronizedSet(strSet5);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        java.util.List<java.util.ListIterator<java.io.Serializable>[]> serializableItorArrayList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(serializableItorArrayList0);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
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
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor14 = constantDescSet3.descendingIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc15 = constantDescSet3.last();
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
        org.junit.Assert.assertNotNull(constantDescItor12);
        org.junit.Assert.assertNotNull(wildcardComparator13);
        org.junit.Assert.assertNotNull(constantDescItor14);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
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
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator21 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet22 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator21);
        java.lang.constant.ConstantDesc constantDesc24 = constantDescSet22.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet25 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet22);
        boolean boolean26 = constantDescSet1.equals((java.lang.Object) constantDescSet25);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator27 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet28 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator27);
        java.lang.constant.ConstantDesc constantDesc30 = constantDescSet28.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet32 = constantDescSet28.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet33 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet28);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet36 = constantDescSet28.headSet((java.lang.constant.ConstantDesc) (-1L), true);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.util.Set<java.lang.String> strSet44 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet45 = java.util.Collections.synchronizedSet(strSet44);
        boolean boolean46 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList41, (java.util.Collection<java.lang.String>) strSet44);
        boolean boolean47 = constantDescSet28.retainAll((java.util.Collection<java.lang.String>) strSet44);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet48 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet28);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet49 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet28);
        boolean boolean50 = constantDescSet1.remove((java.lang.Object) constantDescSet49);
        java.lang.constant.ConstantDesc constantDesc51 = constantDescSet1.pollFirst();
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
        org.junit.Assert.assertNotNull(constantDescComparator21);
        org.junit.Assert.assertNull(constantDesc24);
        org.junit.Assert.assertNotNull(constantDescSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(constantDescComparator27);
        org.junit.Assert.assertNull(constantDesc30);
        org.junit.Assert.assertNotNull(constantDescSet32);
        org.junit.Assert.assertNotNull(constantDescSet33);
        org.junit.Assert.assertNotNull(constantDescSet36);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(constantDescSet49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(constantDesc51);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
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
        java.lang.constant.ConstantDesc constantDesc16 = constantDescSet1.pollFirst();
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
        org.junit.Assert.assertNull(constantDesc16);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        java.util.ListIterator<java.lang.Class<?>[][]> wildcardClassArrayItor0 = java.util.Collections.emptyListIterator();
        org.junit.Assert.assertNotNull(wildcardClassArrayItor0);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
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
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet22 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet21);
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
        org.junit.Assert.assertNotNull(constantDescSet22);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.floor((java.lang.constant.ConstantDesc) 0L);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(constantDesc5);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
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
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet24 = constantDescSet12.tailSet((java.lang.constant.ConstantDesc) 10.0d);
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
        org.junit.Assert.assertNotNull(constantDescSet24);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc[] constantDescArray12 = new java.lang.constant.ConstantDesc[] { 1.0f, 100.0d, 10L, (-1), 10.0f, 10L };
        java.lang.constant.ConstantDesc[] constantDescArray13 = constantDescSet1.toArray(constantDescArray12);
        java.lang.constant.ConstantDesc constantDesc14 = constantDescSet1.last();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator15 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet16 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator15);
        java.lang.constant.ConstantDesc constantDesc18 = constantDescSet16.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet20 = constantDescSet16.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet21 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet16);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet24 = constantDescSet16.headSet((java.lang.constant.ConstantDesc) (-1L), true);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator25 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet26 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator25);
        java.lang.Object[] objArray27 = constantDescSet26.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet28 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet26);
        java.lang.constant.ConstantDesc constantDesc30 = constantDescSet26.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc31 = constantDescSet26.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet32 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet26);
        java.util.List<java.lang.String> strList35 = java.util.Collections.nCopies((int) ' ', "hi!");
        boolean boolean36 = constantDescSet26.containsAll((java.util.Collection<java.lang.String>) strList35);
        java.util.Set<java.lang.String> strSet37 = java.util.Collections.emptySet();
        boolean boolean38 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList35, (java.util.Collection<java.lang.String>) strSet37);
        java.lang.Object obj39 = null;
        int int40 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strList35, obj39);
        boolean boolean41 = constantDescSet16.removeAll((java.util.Collection<java.lang.String>) strList35);
        java.util.Enumeration<java.lang.String> strEnumeration42 = java.util.Collections.enumeration((java.util.Collection<java.lang.String>) strList35);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = constantDescSet1.contains((java.lang.Object) strEnumeration42);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Collections$3 cannot be cast to class java.lang.Comparable (java.util.Collections$3 and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescArray12);
        org.junit.Assert.assertNotNull(constantDescArray13);
        org.junit.Assert.assertEquals("'" + constantDesc14 + "' != '" + 1 + "'", constantDesc14, 1);
        org.junit.Assert.assertNotNull(constantDescComparator15);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertNotNull(constantDescSet20);
        org.junit.Assert.assertNotNull(constantDescSet21);
        org.junit.Assert.assertNotNull(constantDescSet24);
        org.junit.Assert.assertNotNull(constantDescComparator25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNull(constantDesc30);
        org.junit.Assert.assertNull(constantDesc31);
        org.junit.Assert.assertNotNull(constantDescSet32);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strEnumeration42);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
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
        java.lang.constant.ConstantDesc constantDesc17 = constantDescSet1.higher((java.lang.constant.ConstantDesc) 230);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(constantDescSet12);
        org.junit.Assert.assertNotNull(constantDescSet15);
        org.junit.Assert.assertNull(constantDesc17);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator1);
        java.lang.Object[] objArray3 = constantDescSet2.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet4 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet2);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet2.descendingSet();
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet2.lower((java.lang.constant.ConstantDesc) 10.0d);
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
        java.lang.reflect.Type[] typeArray42 = constantDescSet2.toArray((java.lang.reflect.Type[]) wildcardClassArray36);
        java.util.List<java.lang.constant.Constable[]> constableArrayList43 = java.util.Collections.nCopies(419, (java.lang.constant.Constable[]) wildcardClassArray36);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNull(constantDesc7);
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
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(constableArrayList43);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet2.tailSet((java.lang.constant.ConstantDesc) 0.0f, true);
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet2.floor((java.lang.constant.ConstantDesc) (-1L));
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet2.pollFirst();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNull(constantDesc8);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum((int) (byte) 0, (int) '#');
        int int7 = testingRandoop0.sum(322, (int) ' ', 33);
        int int11 = testingRandoop0.sum(247, 134, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 387 + "'", int7 == 387);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 381 + "'", int11 == 381);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet8 = constantDescSet1.descendingSet();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescSet8);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet10 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 1, true);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor11 = constantDescSet1.iterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet12 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet13 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet14 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescSet10);
        org.junit.Assert.assertNotNull(constantDescItor11);
        org.junit.Assert.assertNotNull(constantDescSet12);
        org.junit.Assert.assertNotNull(constantDescSet13);
        org.junit.Assert.assertNotNull(constantDescSet14);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
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
        java.util.TreeSet<java.lang.String> strSet28 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet29 = java.util.Collections.emptySet();
        boolean boolean30 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet28, (java.util.Collection<java.lang.String>) strSet29);
        java.util.Set<java.lang.String> strSet31 = java.util.Collections.unmodifiableSet((java.util.Set<java.lang.String>) strSet28);
        java.util.stream.Stream<java.lang.String> strStream32 = strSet28.stream();
        boolean boolean33 = constantDescSet1.addAll((java.util.Collection<java.lang.String>) strSet28);
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
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(strStream32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.lang.Object[] objArray6 = constantDescSet1.toArray();
        int int7 = constantDescSet1.size();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator8 = constantDescSet1.spliterator();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator9 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet10 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator9);
        java.lang.Object[] objArray11 = constantDescSet10.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet12 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet10);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet13 = constantDescSet10.descendingSet();
        java.lang.constant.ConstantDesc constantDesc15 = constantDescSet10.lower((java.lang.constant.ConstantDesc) 10.0d);
        java.lang.constant.ConstantDesc constantDesc17 = constantDescSet10.lower((java.lang.constant.ConstantDesc) 2);
        java.lang.Object obj18 = constantDescSet10.clone();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet19 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet10);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator20 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet21 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator20);
        java.lang.Object[] objArray22 = constantDescSet21.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet23 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet21);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet24 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet23);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator25 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet26 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator25);
        java.lang.constant.ConstantDesc constantDesc28 = constantDescSet26.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean30 = constantDescSet26.remove((java.lang.Object) (byte) -1);
        boolean boolean31 = constantDescSet23.equals((java.lang.Object) boolean30);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.Set<java.lang.String> strSet39 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet40 = java.util.Collections.synchronizedSet(strSet39);
        boolean boolean41 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList36, (java.util.Collection<java.lang.String>) strSet39);
        java.lang.Class<?> wildcardClass42 = strSet39.getClass();
        java.util.Set set43 = java.util.Collections.EMPTY_SET;
        java.lang.Class<?> wildcardClass44 = set43.getClass();
        java.util.Set<java.lang.invoke.TypeDescriptor> typeDescriptorSet45 = java.util.Collections.singleton((java.lang.invoke.TypeDescriptor) wildcardClass44);
        java.lang.Class[] classArray47 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray48 = (java.lang.Class<?>[]) classArray47;
        wildcardClassArray48[0] = wildcardClass42;
        wildcardClassArray48[1] = wildcardClass44;
        java.lang.Class<?>[] wildcardClassArray53 = constantDescSet23.toArray(wildcardClassArray48);
        boolean boolean54 = constantDescSet23.isEmpty();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet55 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet23);
        java.lang.constant.ConstantDesc constantDesc57 = constantDescSet23.higher((java.lang.constant.ConstantDesc) 3);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet59 = constantDescSet23.tailSet((java.lang.constant.ConstantDesc) 35);
        boolean boolean60 = constantDescSet10.remove((java.lang.Object) constantDescSet59);
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator61 = constantDescSet10.comparator();
        boolean boolean62 = constantDescSet1.remove((java.lang.Object) wildcardComparator61);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(constantDescSpliterator8);
        org.junit.Assert.assertNotNull(constantDescComparator9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(constantDescSet13);
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertNull(constantDesc17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator25);
        org.junit.Assert.assertNull(constantDesc28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(typeDescriptorSet45);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(constantDescSet55);
        org.junit.Assert.assertNull(constantDesc57);
        org.junit.Assert.assertNotNull(constantDescSet59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardComparator61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        java.util.NavigableSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldSet0 = java.util.Collections.emptyNavigableSet();
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSet0);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        java.util.Iterator<java.util.Iterator<java.io.Serializable>> serializableItorItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(serializableItorItor0);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.lang.Object obj7 = constantDescSet1.clone();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet8 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor9 = constantDescSet1.descendingIterator();
        java.lang.constant.ConstantDesc constantDesc11 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 10);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[1]");
        org.junit.Assert.assertNotNull(constantDescItor9);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.iterator();
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.lang.String[] strArray9 = constantDescSet1.toArray(strArray8);
        java.lang.constant.ConstantDesc constantDesc11 = constantDescSet1.ceiling((java.lang.constant.ConstantDesc) (-1L));
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(constantDesc11);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Set<java.util.AbstractSet<java.lang.constant.ConstantDesc>> constantDescSetSet6 = java.util.Collections.singleton((java.util.AbstractSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator7 = constantDescSet1.spliterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet8 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSetSet6);
        org.junit.Assert.assertNotNull(constantDescSpliterator7);
        org.junit.Assert.assertNotNull(constantDescSet8);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        java.util.NavigableMap<java.util.stream.Stream<java.lang.String>[], java.util.Comparator<java.lang.constant.ConstantDesc>> strStreamArrayMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(strStreamArrayMap0);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor2 = constantDescSet1.descendingIterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet3 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet4 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollFirst();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescItor2);
        org.junit.Assert.assertNotNull(constantDescSet3);
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        TestingRandoop testingRandoop5 = new TestingRandoop();
        int int8 = testingRandoop5.sum(0, 1);
        TestingRandoop testingRandoop9 = new TestingRandoop();
        int int12 = testingRandoop9.sum((int) (byte) 0, (int) '#');
        int int15 = testingRandoop9.sum((int) (short) -1, 0);
        int int18 = testingRandoop9.sum((int) (short) 1, (int) (short) 1);
        TestingRandoop testingRandoop19 = new TestingRandoop();
        int int22 = testingRandoop19.sum(0, 1);
        int int25 = testingRandoop19.sum((int) (short) 0, 0);
        TestingRandoop testingRandoop26 = new TestingRandoop();
        int int29 = testingRandoop26.sum((int) (byte) 0, (int) '#');
        int int32 = testingRandoop26.sum((int) (short) -1, 0);
        int int35 = testingRandoop26.sum((int) (short) 1, (int) (short) 1);
        TestingRandoop[] testingRandoopArray36 = new TestingRandoop[] { testingRandoop5, testingRandoop9, testingRandoop19, testingRandoop26 };
        TestingRandoop[] testingRandoopArray37 = constantDescSet1.toArray(testingRandoopArray36);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet40 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 45, true);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(testingRandoopArray36);
        org.junit.Assert.assertNotNull(testingRandoopArray37);
        org.junit.Assert.assertNotNull(constantDescSet40);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor2 = constantDescSet1.descendingIterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet3 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet4 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.last();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescItor2);
        org.junit.Assert.assertNotNull(constantDescSet3);
        org.junit.Assert.assertNotNull(constantDescSet4);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
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
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet23 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) 0L, (java.lang.constant.ConstantDesc) "[]");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.String (java.lang.Long and java.lang.String are in module java.base of loader 'bootstrap')");
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
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.last();
        java.util.TreeSet<java.lang.String> strSet9 = new java.util.TreeSet<java.lang.String>();
        java.util.Collection<java.lang.String> strCollection10 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>) strSet9);
        boolean boolean11 = constantDescSet1.retainAll((java.util.Collection<java.lang.String>) strSet9);
        java.util.Set<java.lang.String> strSet12 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.String>) strSet9);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 1 + "'", constantDesc8, 1);
        org.junit.Assert.assertNotNull(strCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet3 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 100);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet5 = java.util.Collections.checkedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1, constantDescClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescSet3);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.iterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 10.0d, false);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet10 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet9);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet11 = java.util.Collections.unmodifiableSortedSet(constantDescSet10);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertNotNull(constantDescSet9);
        org.junit.Assert.assertNotNull(constantDescSet10);
        org.junit.Assert.assertNotNull(constantDescSet11);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
        boolean boolean8 = constantDescSet1.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.Enumeration<java.lang.String> strEnumeration9 = java.util.Collections.enumeration((java.util.Collection<java.lang.String>) strSet7);
        java.util.ArrayList<java.lang.String> strList10 = java.util.Collections.list(strEnumeration9);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strEnumeration9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class<?>[] wildcardClassArray9 = constantDescSet1.toArray((java.lang.Class<?>[]) classArray7);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet12 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) 100.0f, (java.lang.constant.ConstantDesc) 0.0f);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet15 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) "[]", false);
        java.lang.Object[] objArray16 = constantDescSet1.toArray();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet18 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 100.0d);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(constantDescSet12);
        org.junit.Assert.assertNotNull(constantDescSet15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(constantDescSet18);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        org.junit.Assert.assertNotNull(serializableSet0);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum((int) (byte) 0, (int) '#');
        int int6 = testingRandoop0.sum((int) (short) -1, 0);
        int int10 = testingRandoop0.sum((int) (short) 1, (int) (byte) 100, 35);
        java.util.List<TestingRandoop> testingRandoopList11 = java.util.Collections.singletonList(testingRandoop0);
        int int15 = testingRandoop0.sum(2, 90, (int) (short) 0);
        int int19 = testingRandoop0.sum(381, 3, 289);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 136 + "'", int10 == 136);
        org.junit.Assert.assertNotNull(testingRandoopList11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 673 + "'", int19 == 673);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        java.util.Enumeration<java.util.HashSet<java.lang.String>> strSetEnumeration0 = java.util.Collections.emptyEnumeration();
        org.junit.Assert.assertNotNull(strSetEnumeration0);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        java.util.NavigableSet<java.lang.String[]> strArraySet0 = java.util.Collections.emptyNavigableSet();
        org.junit.Assert.assertNotNull(strArraySet0);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        java.util.NavigableSet<java.util.HashSet<java.lang.String>> strSetSet0 = java.util.Collections.emptyNavigableSet();
        org.junit.Assert.assertNotNull(strSetSet0);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor2 = constantDescSet1.descendingIterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet3 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator4 = constantDescSet1.comparator();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet5 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator4);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet6 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet9 = constantDescSet6.subSet((java.lang.constant.ConstantDesc) 5, (java.lang.constant.ConstantDesc) 135);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromKey > toKey");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescItor2);
        org.junit.Assert.assertNotNull(constantDescSet3);
        org.junit.Assert.assertNotNull(wildcardComparator4);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum(0, 1);
        int int6 = testingRandoop0.sum(136, (int) (short) 100);
        int int9 = testingRandoop0.sum(35, 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 236 + "'", int6 == 236);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 86 + "'", int9 == 86);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
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
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator21 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet22 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator21);
        java.lang.constant.ConstantDesc constantDesc24 = constantDescSet22.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet25 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet22);
        boolean boolean26 = constantDescSet1.equals((java.lang.Object) constantDescSet25);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator27 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet28 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator27);
        java.lang.constant.ConstantDesc constantDesc30 = constantDescSet28.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet32 = constantDescSet28.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet33 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet28);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet36 = constantDescSet28.headSet((java.lang.constant.ConstantDesc) (-1L), true);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.util.Set<java.lang.String> strSet44 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet45 = java.util.Collections.synchronizedSet(strSet44);
        boolean boolean46 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strList41, (java.util.Collection<java.lang.String>) strSet44);
        boolean boolean47 = constantDescSet28.retainAll((java.util.Collection<java.lang.String>) strSet44);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet48 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet28);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet49 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet28);
        boolean boolean50 = constantDescSet1.remove((java.lang.Object) constantDescSet49);
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet55 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) 4, true, (java.lang.constant.ConstantDesc) 92, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromKey > toKey");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(constantDescComparator21);
        org.junit.Assert.assertNull(constantDesc24);
        org.junit.Assert.assertNotNull(constantDescSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(constantDescComparator27);
        org.junit.Assert.assertNull(constantDesc30);
        org.junit.Assert.assertNotNull(constantDescSet32);
        org.junit.Assert.assertNotNull(constantDescSet33);
        org.junit.Assert.assertNotNull(constantDescSet36);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(constantDescSet49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
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
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet37 = constantDescSet3.headSet((java.lang.constant.ConstantDesc) 10.0f);
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
        org.junit.Assert.assertNotNull(constantDescSet37);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
        boolean boolean8 = constantDescSet1.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator9 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet10 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator9);
        java.lang.constant.ConstantDesc constantDesc12 = constantDescSet10.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean14 = constantDescSet10.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor15 = constantDescSet10.iterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet18 = constantDescSet10.tailSet((java.lang.constant.ConstantDesc) 10.0d, false);
        boolean boolean19 = constantDescSet1.contains((java.lang.Object) constantDescSet18);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator20 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet21 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator20);
        java.lang.constant.ConstantDesc constantDesc23 = constantDescSet21.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean25 = constantDescSet21.add((java.lang.constant.ConstantDesc) 1);
        java.lang.constant.ConstantDesc[] constantDescArray32 = new java.lang.constant.ConstantDesc[] { 1.0f, 100.0d, 10L, (-1), 10.0f, 10L };
        java.lang.constant.ConstantDesc[] constantDescArray33 = constantDescSet21.toArray(constantDescArray32);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor34 = constantDescSet21.descendingIterator();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator35 = constantDescSet21.spliterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet36 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet21);
        boolean boolean37 = constantDescSet21.isEmpty();
        boolean boolean38 = constantDescSet1.equals((java.lang.Object) constantDescSet21);
        java.util.Enumeration<java.lang.String>[] strEnumerationArray39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration<java.lang.String>[] strEnumerationArray40 = constantDescSet1.toArray(strEnumerationArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(constantDescComparator9);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(constantDescItor15);
        org.junit.Assert.assertNotNull(constantDescSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(constantDescComparator20);
        org.junit.Assert.assertNull(constantDesc23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(constantDescArray32);
        org.junit.Assert.assertNotNull(constantDescArray33);
        org.junit.Assert.assertNotNull(constantDescItor34);
        org.junit.Assert.assertNotNull(constantDescSpliterator35);
        org.junit.Assert.assertNotNull(constantDescSet36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 1L, (java.lang.constant.ConstantDesc) 0L);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator8 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet9 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator8);
        java.lang.constant.ConstantDesc constantDesc11 = constantDescSet9.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str12 = constantDescSet9.toString();
        java.lang.constant.ConstantDesc constantDesc13 = constantDescSet9.pollLast();
        boolean boolean14 = constantDescSet9.isEmpty();
        TestingRandoop testingRandoop15 = new TestingRandoop();
        int int18 = testingRandoop15.sum((int) (byte) 0, (int) '#');
        int int21 = testingRandoop15.sum((int) (short) -1, 0);
        int int25 = testingRandoop15.sum((int) (short) 1, (int) (byte) 100, 35);
        java.util.List<TestingRandoop> testingRandoopList26 = java.util.Collections.singletonList(testingRandoop15);
        boolean boolean27 = constantDescSet9.remove((java.lang.Object) testingRandoop15);
        boolean boolean28 = constantDescSet3.contains((java.lang.Object) constantDescSet9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet33 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 5, false, (java.lang.constant.ConstantDesc) 201, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromKey > toKey");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescComparator8);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 136 + "'", int25 == 136);
        org.junit.Assert.assertNotNull(testingRandoopList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Set<java.util.AbstractSet<java.lang.constant.ConstantDesc>> constantDescSetSet6 = java.util.Collections.singleton((java.util.AbstractSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.Class<?> wildcardClass7 = constantDescSet1.getClass();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSetSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        java.util.Comparator<java.lang.reflect.Type[]> typeArrayComparator0 = java.util.Collections.reverseOrder();
        org.junit.Assert.assertNotNull(typeArrayComparator0);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap0 = java.util.Collections.emptyNavigableMap();
        java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap1 = java.util.Collections.synchronizedSortedMap((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap0);
        java.lang.Class<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableMapClass2 = null;
        java.lang.Class<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap4 = java.util.Collections.checkedSortedMap(strComparableMapMap1, strComparableMapClass2, constantDescSetClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableMapMap0);
        org.junit.Assert.assertNotNull(strComparableMapMap1);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        java.util.ListIterator<java.util.ArrayList<java.lang.String>> strListItor0 = java.util.Collections.emptyListIterator();
        org.junit.Assert.assertNotNull(strListItor0);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
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
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet14 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.Comparator<java.lang.constant.ConstantDesc>) wildcardComparator11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet19 = constantDescSet14.subSet((java.lang.constant.ConstantDesc) 1.0d, false, (java.lang.constant.ConstantDesc) 134, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Integer (java.lang.Double and java.lang.Integer are in module java.base of loader 'bootstrap')");
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
        org.junit.Assert.assertNotNull(wildcardComparator11);
        org.junit.Assert.assertNotNull(constantDescComparator12);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        java.util.Enumeration<java.lang.reflect.Type> typeEnumeration0 = java.util.Collections.emptyEnumeration();
        org.junit.Assert.assertNotNull(typeEnumeration0);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum((int) (byte) 0, (int) '#');
        int int6 = testingRandoop0.sum((int) (short) -1, 0);
        int int10 = testingRandoop0.sum((int) (short) 1, (int) (byte) 100, 35);
        java.util.List<TestingRandoop> testingRandoopList11 = java.util.Collections.singletonList(testingRandoop0);
        int int15 = testingRandoop0.sum((int) '#', 100, (-1));
        int int19 = testingRandoop0.sum((int) '#', 51, (int) (byte) 100);
        int int23 = testingRandoop0.sum((int) (short) 100, 52, 0);
        int int26 = testingRandoop0.sum((int) '#', (int) 'a');
        int int30 = testingRandoop0.sum(196, (int) (byte) 0, 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 136 + "'", int10 == 136);
        org.junit.Assert.assertNotNull(testingRandoopList11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 134 + "'", int15 == 134);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 186 + "'", int19 == 186);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 152 + "'", int23 == 152);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 132 + "'", int26 == 132);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 282 + "'", int30 == 282);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator2);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator4 = constantDescSet3.spliterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = constantDescSet3.tailSet((java.lang.constant.ConstantDesc) "", true);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertNotNull(constantDescSpliterator4);
        org.junit.Assert.assertNotNull(constantDescSet7);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        boolean boolean5 = constantDescSet1.isEmpty();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 100.0d);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator8 = constantDescSet1.spliterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet9 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.String str10 = constantDescSet1.toString();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescSpliterator8);
        org.junit.Assert.assertNotNull(constantDescSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator2);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator4 = java.util.Collections.reverseOrder(constantDescComparator2);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator5 = java.util.Collections.reverseOrder(constantDescComparator4);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet6 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator5);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator7 = java.util.Collections.reverseOrder(constantDescComparator5);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertNotNull(constantDescComparator4);
        org.junit.Assert.assertNotNull(constantDescComparator5);
        org.junit.Assert.assertNotNull(constantDescComparator7);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        java.util.ListIterator<java.util.LinkedHashSet<java.lang.String>> strSetItor0 = java.util.Collections.emptyListIterator();
        org.junit.Assert.assertNotNull(strSetItor0);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        java.util.SortedSet<java.util.stream.Stream<java.lang.String>> strStreamSet0 = java.util.Collections.emptySortedSet();
        org.junit.Assert.assertNotNull(strStreamSet0);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet4 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNotNull(constantDescSet4);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
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
        java.lang.Class[][] classArray38 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray39 = (java.lang.Class<?>[][]) classArray38;
        java.util.Map<java.util.AbstractCollection<java.lang.constant.ConstantDesc>, java.lang.Class<?>[][]> constantDescCollectionMap40 = java.util.Collections.singletonMap((java.util.AbstractCollection<java.lang.constant.ConstantDesc>) constantDescSet3, wildcardClassArray39);
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
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(constantDescCollectionMap40);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.lang.String str7 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.higher((java.lang.constant.ConstantDesc) 1.0d);
        java.lang.constant.ConstantDesc constantDesc10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = constantDescSet1.add(constantDesc10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Comparable.compareTo(Object)\" because \"c2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(constantDesc9);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.descendingIterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 1L);
        java.lang.Object obj10 = constantDescSet1.clone();
        boolean boolean11 = constantDescSet1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.iterator();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
        boolean boolean8 = constantDescSet1.retainAll((java.util.Collection<java.lang.String>) strSet7);
        java.lang.constant.ConstantDesc constantDesc10 = constantDescSet1.floor((java.lang.constant.ConstantDesc) 52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc11 = constantDescSet1.last();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
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
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.remove((java.lang.Object) (byte) -1);
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class<?>[] wildcardClassArray9 = constantDescSet1.toArray((java.lang.Class<?>[]) classArray7);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet12 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) 100.0f, (java.lang.constant.ConstantDesc) 0.0f);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator13 = constantDescSet1.spliterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet15 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) "");
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(constantDescSet12);
        org.junit.Assert.assertNotNull(constantDescSpliterator13);
        org.junit.Assert.assertNotNull(constantDescSet15);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum(0, 1);
        int int7 = testingRandoop0.sum((int) 'a', 100, (-1));
        int int11 = testingRandoop0.sum(245, 196, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 196 + "'", int7 == 196);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 474 + "'", int11 == 474);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc4 = constantDescSet2.ceiling((java.lang.constant.ConstantDesc) (-1L));
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = constantDescSet2.headSet((java.lang.constant.ConstantDesc) 5, true);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator8 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet9 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator8);
        java.lang.constant.ConstantDesc constantDesc11 = constantDescSet9.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator12 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet13 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator12);
        java.lang.constant.ConstantDesc constantDesc15 = constantDescSet13.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet17 = constantDescSet13.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator18 = constantDescSet13.spliterator();
        java.util.TreeSet<java.lang.String> strSet19 = new java.util.TreeSet<java.lang.String>();
        boolean boolean20 = constantDescSet13.containsAll((java.util.Collection<java.lang.String>) strSet19);
        java.util.Set<java.lang.String> strSet21 = java.util.Collections.unmodifiableSet((java.util.Set<java.lang.String>) strSet19);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator22 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet23 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator22);
        java.lang.constant.ConstantDesc constantDesc25 = constantDescSet23.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet27 = constantDescSet23.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet28 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet23);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet29 = java.util.Collections.unmodifiableNavigableSet(constantDescSet28);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet30 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet29);
        int int31 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strSet19, (java.lang.Object) constantDescSet29);
        boolean boolean32 = constantDescSet9.removeAll((java.util.Collection<java.lang.String>) strSet19);
        boolean boolean33 = constantDescSet2.addAll((java.util.Collection<java.lang.String>) strSet19);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescComparator8);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertNotNull(constantDescComparator12);
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertNotNull(constantDescSet17);
        org.junit.Assert.assertNotNull(constantDescSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(constantDescComparator22);
        org.junit.Assert.assertNull(constantDesc25);
        org.junit.Assert.assertNotNull(constantDescSet27);
        org.junit.Assert.assertNotNull(constantDescSet28);
        org.junit.Assert.assertNotNull(constantDescSet29);
        org.junit.Assert.assertNotNull(constantDescSet30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap0 = java.util.Collections.emptyMap();
        java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = java.util.Collections.synchronizedMap(strComparableMap0);
        java.lang.Class<java.lang.Comparable<java.lang.String>> strComparableClass2 = null;
        java.lang.Class<java.lang.CharSequence> charSequenceClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap4 = java.util.Collections.checkedMap(strComparableMap1, strComparableClass2, charSequenceClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableMap0);
        org.junit.Assert.assertNotNull(strComparableMap1);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        constantDescSet1.clear();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        java.util.NavigableMap<java.lang.Class<?>[], java.util.stream.Stream<java.lang.String>[]> wildcardClassArrayMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(wildcardClassArrayMap0);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
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
        java.lang.constant.ConstantDesc constantDesc17 = constantDescSet3.higher((java.lang.constant.ConstantDesc) 57);
        java.lang.String str18 = constantDescSet3.toString();
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
        org.junit.Assert.assertNull(constantDesc17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
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
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator13 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet14 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator13);
        java.lang.constant.ConstantDesc constantDesc16 = constantDescSet14.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet18 = constantDescSet14.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet19 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet14);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet22 = constantDescSet14.headSet((java.lang.constant.ConstantDesc) (-1L), true);
        boolean boolean23 = constantDescSet14.isEmpty();
        boolean boolean24 = constantDescSet3.contains((java.lang.Object) constantDescSet14);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescComparator5);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(constantDescItor12);
        org.junit.Assert.assertNotNull(constantDescComparator13);
        org.junit.Assert.assertNull(constantDesc16);
        org.junit.Assert.assertNotNull(constantDescSet18);
        org.junit.Assert.assertNotNull(constantDescSet19);
        org.junit.Assert.assertNotNull(constantDescSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet10 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 1, true);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor11 = constantDescSet1.iterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet12 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet13 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet12);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescSet10);
        org.junit.Assert.assertNotNull(constantDescItor11);
        org.junit.Assert.assertNotNull(constantDescSet12);
        org.junit.Assert.assertNotNull(constantDescSet13);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
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
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet28 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
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
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
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
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet14 = constantDescSet3.descendingSet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet17 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 57, (java.lang.constant.ConstantDesc) 99);
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
        org.junit.Assert.assertNotNull(constantDescItor12);
        org.junit.Assert.assertNotNull(wildcardComparator13);
        org.junit.Assert.assertNotNull(constantDescSet14);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
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
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet56 = constantDescSet53.tailSet((java.lang.constant.ConstantDesc) 86, true);
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
        org.junit.Assert.assertNotNull(constantDescSet56);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.lang.Object[] objArray6 = constantDescSet1.toArray();
        int int7 = constantDescSet1.size();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator8 = constantDescSet1.spliterator();
        java.util.SortedMap<java.util.Collection<java.lang.String>, java.lang.Comparable<java.lang.String>> strCollectionMap9 = java.util.Collections.emptySortedMap();
        boolean boolean10 = constantDescSet1.contains((java.lang.Object) strCollectionMap9);
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
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(constantDescSpliterator8);
        org.junit.Assert.assertNotNull(strCollectionMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        java.util.Comparator<java.util.Spliterator<java.lang.constant.ConstantDesc>> constantDescSpliteratorComparator0 = java.util.Collections.reverseOrder();
        org.junit.Assert.assertNotNull(constantDescSpliteratorComparator0);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator1);
        java.lang.constant.ConstantDesc constantDesc4 = constantDescSet2.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean6 = constantDescSet2.add((java.lang.constant.ConstantDesc) 1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = constantDescSet2.descendingSet();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet8 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet2);
        java.util.List<java.lang.Object> objList9 = java.util.Collections.nCopies(289, (java.lang.Object) constantDescSet8);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescSet8);
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum((int) (byte) 0, (int) '#');
        int int6 = testingRandoop0.sum(189, 134);
        int int9 = testingRandoop0.sum(100, 387);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 323 + "'", int6 == 323);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 487 + "'", int9 == 487);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator2);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator4 = java.util.Collections.reverseOrder(constantDescComparator2);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator5 = java.util.Collections.reverseOrder(constantDescComparator4);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet6 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator5);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet8 = constantDescSet6.headSet((java.lang.constant.ConstantDesc) 323);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertNotNull(constantDescComparator4);
        org.junit.Assert.assertNotNull(constantDescComparator5);
        org.junit.Assert.assertNotNull(constantDescSet8);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        TestingRandoop testingRandoop0 = new TestingRandoop();
        int int3 = testingRandoop0.sum(100, (int) '#');
        int int7 = testingRandoop0.sum(0, 33, (int) (short) 100);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator8 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet9 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator8);
        java.lang.constant.ConstantDesc constantDesc11 = constantDescSet9.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean13 = constantDescSet9.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor14 = constantDescSet9.iterator();
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.lang.String[] strArray17 = constantDescSet9.toArray(strArray16);
        java.util.Map<TestingRandoop, java.lang.Cloneable> testingRandoopMap18 = java.util.Collections.singletonMap(testingRandoop0, (java.lang.Cloneable) constantDescSet9);
        java.lang.constant.ConstantDesc constantDesc19 = constantDescSet9.pollFirst();
        java.lang.constant.ConstantDesc constantDesc21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet22 = constantDescSet9.subSet((java.lang.constant.ConstantDesc) 282, constantDesc21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Comparable.compareTo(Object)\" because \"c2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 135 + "'", int3 == 135);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 133 + "'", int7 == 133);
        org.junit.Assert.assertNotNull(constantDescComparator8);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(constantDescItor14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(testingRandoopMap18);
        org.junit.Assert.assertNull(constantDesc19);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
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
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet22 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet27 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) 133, true, (java.lang.constant.ConstantDesc) 247, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromKey > toKey");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(constantDescSet22);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor2 = constantDescSet1.descendingIterator();
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.pollFirst();
        boolean boolean4 = constantDescSet1.isEmpty();
        boolean boolean6 = constantDescSet1.add((java.lang.constant.ConstantDesc) 57);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescItor2);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor2 = constantDescSet1.descendingIterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet3 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = java.util.Collections.checkedSortedSet(constantDescSet3, constantDescClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescItor2);
        org.junit.Assert.assertNotNull(constantDescSet3);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.stream.Stream<java.lang.String> strStream7 = strSet6.stream();
        java.util.Set<java.lang.String> strSet9 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet10 = java.util.Collections.synchronizedSet(strSet9);
        java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet9);
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap12 = java.util.Collections.emptyNavigableMap();
        java.util.List<java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>> comparableMapMapList13 = java.util.Collections.singletonList((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap12);
        java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap14 = java.util.Collections.synchronizedSortedMap((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap12);
        int int15 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strSet9, (java.lang.Object) strComparableMapMap14);
        int int16 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strSet6, (java.lang.Object) strSet9);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator17 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet18 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator17);
        java.lang.constant.ConstantDesc constantDesc20 = constantDescSet18.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet22 = constantDescSet18.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator23 = constantDescSet18.spliterator();
        java.util.TreeSet<java.lang.String> strSet24 = new java.util.TreeSet<java.lang.String>();
        boolean boolean25 = constantDescSet18.containsAll((java.util.Collection<java.lang.String>) strSet24);
        java.util.Set<java.lang.String> strSet26 = java.util.Collections.unmodifiableSet((java.util.Set<java.lang.String>) strSet24);
        int int27 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strSet9, (java.lang.Object) strSet26);
        boolean boolean28 = constantDescSet1.retainAll((java.util.Collection<java.lang.String>) strSet9);
        java.util.stream.Stream<java.lang.String> strStream29 = strSet9.stream();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strComparableMapMap12);
        org.junit.Assert.assertNotNull(comparableMapMapList13);
        org.junit.Assert.assertNotNull(strComparableMapMap14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(constantDescComparator17);
        org.junit.Assert.assertNull(constantDesc20);
        org.junit.Assert.assertNotNull(constantDescSet22);
        org.junit.Assert.assertNotNull(constantDescSpliterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strStream29);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        java.lang.invoke.TypeDescriptor typeDescriptor0 = null;
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator1);
        java.lang.constant.ConstantDesc constantDesc4 = constantDescSet2.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean6 = constantDescSet2.remove((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor7 = constantDescSet2.iterator();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.lang.String[] strArray10 = constantDescSet2.toArray(strArray9);
        java.util.Map<java.lang.invoke.TypeDescriptor, java.lang.String[]> typeDescriptorMap11 = java.util.Collections.singletonMap(typeDescriptor0, strArray9);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(constantDescItor7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(typeDescriptorMap11);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 10.0d);
        java.util.Set<java.io.Serializable[]> serializableArraySet7 = java.util.Collections.emptySet();
        boolean boolean8 = constantDescSet1.equals((java.lang.Object) serializableArraySet7);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet11 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 100.0f, false);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator12 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet13 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator12);
        java.lang.constant.ConstantDesc constantDesc15 = constantDescSet13.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet16 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet13);
        boolean boolean17 = constantDescSet1.equals((java.lang.Object) constantDescSet13);
        java.lang.constant.ConstantDesc constantDesc18 = constantDescSet13.pollLast();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(serializableArraySet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(constantDescSet11);
        org.junit.Assert.assertNotNull(constantDescComparator12);
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertNotNull(constantDescSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(constantDesc18);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator1 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet2 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc4 = constantDescSet2.ceiling((java.lang.constant.ConstantDesc) (-1L));
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = constantDescSet2.headSet((java.lang.constant.ConstantDesc) 5, true);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet9 = constantDescSet2.headSet((java.lang.constant.ConstantDesc) 189);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescSet9);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet1.higher((java.lang.constant.ConstantDesc) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet12 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) 0.0f, false, (java.lang.constant.ConstantDesc) 136, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Integer (java.lang.Float and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet0 = java.util.Collections.emptySet();
        org.junit.Assert.assertNotNull(strIterableSet0);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.lang.Object obj7 = constantDescSet1.clone();
        boolean boolean8 = constantDescSet1.isEmpty();
        java.util.TreeSet<java.lang.String> strSet9 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet10 = java.util.Collections.emptySet();
        boolean boolean11 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet9, (java.util.Collection<java.lang.String>) strSet10);
        java.util.Set<java.lang.String> strSet12 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.String>) strSet9);
        java.util.Enumeration<java.lang.String> strEnumeration13 = java.util.Collections.enumeration((java.util.Collection<java.lang.String>) strSet12);
        boolean boolean14 = constantDescSet1.addAll((java.util.Collection<java.lang.String>) strSet12);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strEnumeration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        java.util.Set<java.lang.String> strSet1 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet2 = java.util.Collections.synchronizedSet(strSet1);
        java.util.TreeSet<java.lang.String> strSet3 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap4 = java.util.Collections.emptyNavigableMap();
        java.util.List<java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>> comparableMapMapList5 = java.util.Collections.singletonList((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap4);
        java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap6 = java.util.Collections.synchronizedSortedMap((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap4);
        int int7 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strSet1, (java.lang.Object) strComparableMapMap6);
        java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap8 = java.util.Collections.synchronizedSortedMap(strComparableMapMap6);
        java.lang.Class<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableMapClass9 = null;
        java.lang.Class<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetClass10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap11 = java.util.Collections.checkedSortedMap(strComparableMapMap8, strComparableMapClass9, constantDescSetClass10);
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
        org.junit.Assert.assertNotNull(strComparableMapMap8);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
        boolean boolean8 = constantDescSet1.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.Set<java.lang.String> strSet9 = java.util.Collections.unmodifiableSet((java.util.Set<java.lang.String>) strSet7);
        java.util.Enumeration<java.lang.String> strEnumeration10 = java.util.Collections.enumeration((java.util.Collection<java.lang.String>) strSet7);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator11 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet12 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator11);
        java.lang.constant.ConstantDesc constantDesc14 = constantDescSet12.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean16 = constantDescSet12.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator17 = constantDescSet12.spliterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet18 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet12);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet19 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet18);
        int int20 = java.util.Collections.frequency((java.util.Collection<java.lang.String>) strSet7, (java.lang.Object) constantDescSet19);
        int int21 = constantDescSet19.size();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strEnumeration10);
        org.junit.Assert.assertNotNull(constantDescComparator11);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator17);
        org.junit.Assert.assertNotNull(constantDescSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        java.util.NavigableMap<java.util.LinkedHashSet<java.lang.String>, java.lang.Class<?>> strSetMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(strSetMap0);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Set<java.util.AbstractSet<java.lang.constant.ConstantDesc>> constantDescSetSet6 = java.util.Collections.singleton((java.util.AbstractSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator7 = constantDescSet1.spliterator();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator8 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet9 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator8);
        java.lang.constant.ConstantDesc constantDesc11 = constantDescSet9.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean13 = constantDescSet9.add((java.lang.constant.ConstantDesc) 1);
        boolean boolean14 = constantDescSet1.equals((java.lang.Object) constantDescSet9);
        java.lang.Class<java.lang.constant.ConstantDesc> constantDescClass15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet16 = java.util.Collections.checkedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet9, constantDescClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSetSet6);
        org.junit.Assert.assertNotNull(constantDescSpliterator7);
        org.junit.Assert.assertNotNull(constantDescComparator8);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        java.io.Serializable[] serializableArray0 = new java.io.Serializable[] {};
        java.util.Iterator<java.io.Serializable> serializableItor1 = null;
        java.util.Map<java.io.Serializable[], java.util.Iterator<java.io.Serializable>> serializableArrayMap2 = java.util.Collections.singletonMap(serializableArray0, serializableItor1);
        org.junit.Assert.assertNotNull(serializableArray0);
        org.junit.Assert.assertNotNull(serializableArrayMap2);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollFirst();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator7 = constantDescSet1.spliterator();
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.ceiling((java.lang.constant.ConstantDesc) 52);
        java.lang.constant.ConstantDesc constantDesc10 = null;
        java.lang.constant.ConstantDesc constantDesc11 = constantDescSet1.higher(constantDesc10);
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
        java.util.Set<java.lang.String> strSet13 = java.util.Collections.emptySet();
        boolean boolean14 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet12, (java.util.Collection<java.lang.String>) strSet13);
        java.util.Set<java.lang.String> strSet15 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.String>) strSet12);
        java.util.Set<java.lang.String> strSet17 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet18 = java.util.Collections.synchronizedSet(strSet17);
        boolean boolean19 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet12, (java.util.Collection<java.lang.String>) strSet17);
        boolean boolean20 = constantDescSet1.containsAll((java.util.Collection<java.lang.String>) strSet17);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(constantDescSpliterator7);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
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
        java.util.TreeSet<java.lang.String> strSet22 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet3);
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
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet4 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator5 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet6 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator5);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet6.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean10 = constantDescSet6.add((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Set<java.util.AbstractSet<java.lang.constant.ConstantDesc>> constantDescSetSet11 = java.util.Collections.singleton((java.util.AbstractSet<java.lang.constant.ConstantDesc>) constantDescSet6);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet12 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet6);
        boolean boolean13 = constantDescSet1.contains((java.lang.Object) constantDescSet6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc15 = constantDescSet6.lower((java.lang.constant.ConstantDesc) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Float (java.lang.Double and java.lang.Float are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNotNull(constantDescComparator5);
        org.junit.Assert.assertNull(constantDesc8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(constantDescSetSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        boolean boolean5 = constantDescSet1.isEmpty();
        boolean boolean7 = constantDescSet1.add((java.lang.constant.ConstantDesc) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.lower((java.lang.constant.ConstantDesc) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Integer (java.lang.Float and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
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
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator14 = java.util.Collections.reverseOrder(constantDescComparator13);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet15 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator14);
        java.util.Iterator<java.lang.Cloneable> cloneableItor16 = java.util.Collections.emptyIterator();
        boolean boolean17 = constantDescSet15.remove((java.lang.Object) cloneableItor16);
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
        org.junit.Assert.assertNotNull(constantDescComparator14);
        org.junit.Assert.assertNotNull(cloneableItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet3.subSet((java.lang.constant.ConstantDesc) 1L, (java.lang.constant.ConstantDesc) 0L);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator8 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet9 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator8);
        java.lang.constant.ConstantDesc constantDesc11 = constantDescSet9.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str12 = constantDescSet9.toString();
        java.lang.constant.ConstantDesc constantDesc13 = constantDescSet9.pollLast();
        boolean boolean14 = constantDescSet9.isEmpty();
        TestingRandoop testingRandoop15 = new TestingRandoop();
        int int18 = testingRandoop15.sum((int) (byte) 0, (int) '#');
        int int21 = testingRandoop15.sum((int) (short) -1, 0);
        int int25 = testingRandoop15.sum((int) (short) 1, (int) (byte) 100, 35);
        java.util.List<TestingRandoop> testingRandoopList26 = java.util.Collections.singletonList(testingRandoop15);
        boolean boolean27 = constantDescSet9.remove((java.lang.Object) testingRandoop15);
        boolean boolean28 = constantDescSet3.contains((java.lang.Object) constantDescSet9);
        boolean boolean29 = constantDescSet9.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc30 = constantDescSet9.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(constantDescComparator8);
        org.junit.Assert.assertNull(constantDesc11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 136 + "'", int25 == 136);
        org.junit.Assert.assertNotNull(testingRandoopList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        java.util.Set<java.lang.String> strSet0 = java.util.Collections.emptySet();
        java.util.Collection<java.lang.String> strCollection1 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>) strSet0);
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(strCollection1);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescSet1.last();
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.last();
        constantDescSet1.clear();
        int int11 = constantDescSet1.size();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet14 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 387, false);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 1 + "'", constantDesc8, 1);
        org.junit.Assert.assertEquals("'" + constantDesc9 + "' != '" + 1 + "'", constantDesc9, 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(constantDescSet14);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        java.util.Iterator<java.io.Serializable[]> serializableArrayItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(serializableArrayItor0);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        java.util.Enumeration<java.util.List> listEnumeration0 = java.util.Collections.emptyEnumeration();
        org.junit.Assert.assertNotNull(listEnumeration0);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet4 = constantDescSet1.descendingSet();
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.ceiling((java.lang.constant.ConstantDesc) 1);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNull(constantDesc6);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
        org.junit.Assert.assertNotNull(constantDescSet7);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet9 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) "", (java.lang.constant.ConstantDesc) 419);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet5);
        org.junit.Assert.assertNotNull(constantDescSpliterator6);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.lang.String str4 = constantDescSet1.toString();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.pollLast();
        java.lang.constant.ConstantDesc constantDesc7 = constantDescSet1.ceiling((java.lang.constant.ConstantDesc) 0.0f);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator8 = constantDescSet1.spliterator();
        constantDescSet1.clear();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet14 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) 381, true, (java.lang.constant.ConstantDesc) 3, false);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNotNull(constantDescSpliterator8);
        org.junit.Assert.assertNotNull(constantDescSet14);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
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
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet15 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet14);
        java.lang.Class<?> wildcardClass16 = constantDescSet15.getClass();
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
        org.junit.Assert.assertNotNull(constantDescSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
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
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor12 = constantDescSet1.descendingIterator();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + constantDesc10 + "' != '" + 0.0f + "'", constantDesc10, 0.0f);
        org.junit.Assert.assertNotNull(wildcardComparator11);
        org.junit.Assert.assertNotNull(constantDescItor12);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.descendingIterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 1L);
        java.lang.Object obj10 = constantDescSet1.clone();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor11 = constantDescSet1.iterator();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator12 = constantDescSet1.spliterator();
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator13 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet14 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator13);
        java.lang.constant.ConstantDesc constantDesc16 = constantDescSet14.floor((java.lang.constant.ConstantDesc) "hi!");
        int int17 = constantDescSet14.size();
        java.util.Set<java.lang.String> strSet19 = java.util.Collections.singleton("hi!");
        java.util.Set<java.lang.String> strSet20 = java.util.Collections.synchronizedSet(strSet19);
        boolean boolean21 = constantDescSet14.retainAll((java.util.Collection<java.lang.String>) strSet20);
        java.util.Set<java.lang.String> strSet22 = java.util.Collections.synchronizedSet(strSet20);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator23 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet24 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator23);
        java.lang.Object[] objArray25 = constantDescSet24.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet26 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet24);
        java.lang.constant.ConstantDesc constantDesc28 = constantDescSet24.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc29 = constantDescSet24.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet30 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet24);
        java.util.ListIterator<java.io.Serializable> serializableItor31 = java.util.Collections.emptyListIterator();
        java.util.ListIterator<java.io.Serializable> serializableItor32 = java.util.Collections.emptyListIterator();
        java.util.ListIterator<java.io.Serializable> serializableItor33 = java.util.Collections.emptyListIterator();
        java.util.ListIterator[] listIteratorArray35 = new java.util.ListIterator[3];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<java.io.Serializable>[] serializableItorArray36 = (java.util.ListIterator<java.io.Serializable>[]) listIteratorArray35;
        serializableItorArray36[0] = serializableItor31;
        serializableItorArray36[1] = serializableItor32;
        serializableItorArray36[2] = serializableItor33;
        java.util.ListIterator<java.io.Serializable>[] serializableItorArray43 = constantDescSet24.toArray(serializableItorArray36);
        java.lang.constant.ConstantDesc constantDesc44 = constantDescSet24.pollLast();
        java.util.TreeSet<java.lang.String> strSet45 = new java.util.TreeSet<java.lang.String>();
        boolean boolean46 = constantDescSet24.containsAll((java.util.Collection<java.lang.String>) strSet45);
        boolean boolean47 = java.util.Collections.disjoint((java.util.Collection<java.lang.String>) strSet22, (java.util.Collection<java.lang.String>) strSet45);
        boolean boolean48 = constantDescSet1.removeAll((java.util.Collection<java.lang.String>) strSet22);
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
        org.junit.Assert.assertNotNull(constantDescItor11);
        org.junit.Assert.assertNotNull(constantDescSpliterator12);
        org.junit.Assert.assertNotNull(constantDescComparator13);
        org.junit.Assert.assertNull(constantDesc16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(constantDescComparator23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(constantDesc28);
        org.junit.Assert.assertNull(constantDesc29);
        org.junit.Assert.assertNotNull(constantDescSet30);
        org.junit.Assert.assertNotNull(serializableItor31);
        org.junit.Assert.assertNotNull(serializableItor32);
        org.junit.Assert.assertNotNull(serializableItor33);
        org.junit.Assert.assertNotNull(listIteratorArray35);
        org.junit.Assert.assertNotNull(serializableItorArray36);
        org.junit.Assert.assertNotNull(serializableItorArray43);
        org.junit.Assert.assertNull(constantDesc44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap0 = java.util.Collections.emptyNavigableMap();
        java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap1 = java.util.Collections.synchronizedSortedMap((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap0);
        java.util.NavigableMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap2 = java.util.Collections.synchronizedNavigableMap(strComparableMapMap0);
        java.lang.Class<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableMapClass3 = null;
        java.lang.Class<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetClass4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>> strComparableMapMap5 = java.util.Collections.checkedSortedMap((java.util.SortedMap<java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.util.TreeSet<java.lang.constant.ConstantDesc>>) strComparableMapMap2, strComparableMapClass3, constantDescSetClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableMapMap0);
        org.junit.Assert.assertNotNull(strComparableMapMap1);
        org.junit.Assert.assertNotNull(strComparableMapMap2);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.Object[] objArray2 = constantDescSet1.toArray();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescSet1.higher((java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc6 = constantDescSet1.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.List<java.lang.String> strList10 = java.util.Collections.nCopies((int) ' ', "hi!");
        boolean boolean11 = constantDescSet1.containsAll((java.util.Collection<java.lang.String>) strList10);
        java.lang.Object[] objArray12 = constantDescSet1.toArray();
        boolean boolean13 = constantDescSet1.isEmpty();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertNull(constantDesc6);
        org.junit.Assert.assertNotNull(constantDescSet7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
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
        java.lang.constant.ConstantDesc constantDesc22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet24 = constantDescSet1.headSet(constantDesc22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Comparable.compareTo(Object)\" because \"c2\" is null");
        } catch (java.lang.NullPointerException e) {
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
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet5 = constantDescSet1.tailSet((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescSet1.descendingIterator();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.lower((java.lang.constant.ConstantDesc) 1L);
        java.lang.Object obj10 = constantDescSet1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc11 = constantDescSet1.last();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
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
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "[]");
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet8 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) (-1.0f), true, (java.lang.constant.ConstantDesc) (-1.0f), false);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet11 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 0L, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet16 = constantDescSet1.subSet((java.lang.constant.ConstantDesc) 152, false, (java.lang.constant.ConstantDesc) "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet8);
        org.junit.Assert.assertNotNull(constantDescSet11);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet4 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet1.headSet((java.lang.constant.ConstantDesc) 10.0f);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor7 = constantDescSet1.iterator();
        java.lang.String str8 = constantDescSet1.toString();
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertNotNull(constantDescSet4);
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(constantDescItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
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
        java.util.stream.Stream<java.lang.String> strStream22 = strSet20.stream();
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
        org.junit.Assert.assertNotNull(strStream22);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        java.util.List<java.util.Comparator<java.lang.constant.ConstantDesc>> constantDescComparatorList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(constantDescComparatorList0);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator2 = java.util.Collections.reverseOrder(constantDescComparator0);
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet3 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet6 = constantDescSet3.tailSet((java.lang.constant.ConstantDesc) (-1), false);
        java.lang.Object obj7 = constantDescSet3.clone();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator8 = constantDescSet3.spliterator();
        constantDescSet3.clear();
        java.util.NavigableSet<java.lang.constant.ConstantDesc> constantDescSet10 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.constant.ConstantDesc>) constantDescSet3);
        java.lang.constant.ConstantDesc constantDesc12 = constantDescSet3.ceiling((java.lang.constant.ConstantDesc) 0.0d);
        org.junit.Assert.assertNotNull(constantDescComparator0);
        org.junit.Assert.assertNotNull(constantDescComparator2);
        org.junit.Assert.assertNotNull(constantDescSet6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[]");
        org.junit.Assert.assertNotNull(constantDescSpliterator8);
        org.junit.Assert.assertNotNull(constantDescSet10);
        org.junit.Assert.assertNull(constantDesc12);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
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
        java.lang.constant.ConstantDesc constantDesc28 = constantDescSet18.pollFirst();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet30 = constantDescSet18.tailSet((java.lang.constant.ConstantDesc) 132);
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
        org.junit.Assert.assertNull(constantDesc28);
        org.junit.Assert.assertNotNull(constantDescSet30);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
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
        java.lang.constant.ConstantDesc constantDesc15 = constantDescSet3.ceiling((java.lang.constant.ConstantDesc) 10L);
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
        org.junit.Assert.assertNull(constantDesc15);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
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
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor17 = constantDescSet1.iterator();
        java.lang.Object obj18 = null;
        boolean boolean19 = constantDescSet1.remove(obj18);
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
        org.junit.Assert.assertNotNull(constantDescItor17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        java.util.List<java.util.HashSet<java.lang.String>> strSetList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(strSetList0);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        java.util.Comparator<java.lang.constant.ConstantDesc> constantDescComparator0 = java.util.Collections.reverseOrder();
        java.util.TreeSet<java.lang.constant.ConstantDesc> constantDescSet1 = new java.util.TreeSet<java.lang.constant.ConstantDesc>(constantDescComparator0);
        java.lang.constant.ConstantDesc constantDesc3 = constantDescSet1.floor((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean5 = constantDescSet1.add((java.lang.constant.ConstantDesc) 1);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator6 = constantDescSet1.spliterator();
        java.util.SortedSet<java.lang.constant.ConstantDesc> constantDescSet7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.constant.ConstantDesc>) constantDescSet1);
        java.lang.Object[] objArray8 = constantDescSet1.toArray();
        java.lang.constant.ConstantDesc constantDesc9 = constantDescSet1.last();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator10 = constantDescSet1.spliterator();
        java.lang.String str11 = constantDescSet1.toString();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[1]" + "'", str11, "[1]");
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        java.util.Map map0 = java.util.Collections.EMPTY_MAP;
        java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = java.util.Collections.synchronizedMap((java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>) map0);
        java.util.Map<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap2 = java.util.Collections.synchronizedMap(strComparableMap1);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(strComparableMap1);
        org.junit.Assert.assertNotNull(strComparableMap2);
    }
}

