package com.hcl.javabasicadvanced.exceptions;

<<<<<<< HEAD
class MyExceptionDemo{
	static int flag=0;
	public static void main(String args[]) {
		try {
			int age=14;
			if(age < 18)
				throw new MyException();
		}
		
		catch(NumberFormatException e) {
			flag=1;
			System.out.println("Exception : "+ e);
		}
		catch (MyException e) {
			flag=1;
			System.out.println("Exception : "+ e);
		}
		if(flag==0)
			System.out.println("Everything is fine");
	}
=======
class MyExceptionDemo {
    static int flag = 0;

    public static void main(String args[]) {
        try {
            int age = 14;
            if (age < 18)
                throw new MyException();
        } catch (NumberFormatException e) {
            flag = 1;
            System.out.println("Exception : " + e);
        } catch (MyException e) {
            flag = 1;
            System.out.println("Exception : " + e);
        }
        if (flag == 0)
            System.out.println("Everything is fine");
    }
>>>>>>> b7b783554361768895845c9585687c2bb8cefd0a
}
