<<<<<<< HEAD:src/main/java/com/hcl/javabasicadvanced/comprable_comprator/TestStringComparisonBasicDotEquals.java
package com.hcl.javabasicadvanced.comprable_comprator;
=======
package com.hcl.javabasicadvanced.collection;

>>>>>>> b7b783554361768895845c9585687c2bb8cefd0a:src/main/java/com/hcl/javabasicadvanced/collection/TestStringComparisonBasicDotEquals.java
class TestStringComparisonBasicDotEquals {
    public static void main(String args[]) {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin");
        String s4 = "Saurav";
        System.out.println(s1.equals(s2));// true
        System.out.println(s1.equals(s3));// true
        System.out.println(s1.equals(s4));// false
    }
}