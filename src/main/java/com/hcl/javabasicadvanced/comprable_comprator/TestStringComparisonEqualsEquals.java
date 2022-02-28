<<<<<<< HEAD:src/main/java/com/hcl/javabasicadvanced/comprable_comprator/TestStringComparisonEqualsEquals.java
package com.hcl.javabasicadvanced.comprable_comprator;
=======
package com.hcl.javabasicadvanced.collection;

>>>>>>> b7b783554361768895845c9585687c2bb8cefd0a:src/main/java/com/hcl/javabasicadvanced/collection/TestStringComparisonEqualsEquals.java
class TestStringComparisonEqualsEquals {
    public static void main(String args[]) {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin");
        System.out.println(s1 == s2);// true (because both refer to same instance)
        System.out.println(s1 == s3);// false(because s3 refers to instance created in nonpool)
    }
}