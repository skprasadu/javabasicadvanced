package com.hcl.javabasicadvanced.misc;

class GenericsMethodTest1<T> {
	private T obj1;

	public void add(T obj1) {
		this.obj1 = obj1;
	}

	public T get() {
		return obj1;
	}

	public static void main(String[] args) {
		GenericsMethodTest1<Integer> integercontainer = new GenericsMethodTest1<Integer>();
		GenericsMethodTest1<String> stringcontainer = new GenericsMethodTest1<String>();

		integercontainer.add(new Integer(7));
		stringcontainer.add(new String("You are awesome"));

		System.out.printf("Integer Value :%d\n\n", integercontainer.get());
		System.out.printf("String Value :%s\n", stringcontainer.get());
	}
}