<<<<<<< HEAD:src/main/java/com/hcl/javabasicadvanced/comprable_comprator/TestStringComparisonCompareTo.java
package com.hcl.javabasicadvanced.comprable_comprator;
=======
package com.hcl.javabasicadvanced.collection;

>>>>>>> b7b783554361768895845c9585687c2bb8cefd0a:src/main/java/com/hcl/javabasicadvanced/collection/TestStringComparisonCompareTo.java
class TestStringComparisonCompareTo {
    public static void main(String args[]) {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = "Ratan";
        System.out.println(s1.compareTo(s2));// 0
        System.out.println(s1.compareTo(s3));// 1(because s1>s3)
        System.out.println(s3.compareTo(s1));// -1(because s3 < s1 )
    }
}