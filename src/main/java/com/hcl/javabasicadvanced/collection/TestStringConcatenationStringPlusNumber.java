package com.hcl.javabasicadvanced.collection;

class TestStringConcatenationStringPlusNumber {
    public static void main(String[] args) {
        String s = 50 + 30 + "Sachin" + 40 + 40 + null;
        System.out.println(s);// 80Sachin4040
    }
}