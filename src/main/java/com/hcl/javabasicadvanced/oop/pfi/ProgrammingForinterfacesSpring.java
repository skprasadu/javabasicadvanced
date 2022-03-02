package com.hcl.javabasicadvanced.oop.pfi;

interface Car {

	void doSometing();
};

class Mercedezs implements Car {

	@Override
	public void doSometing() {
		// TODO Auto-generated method stub
		
	}
	
}

public class ProgrammingForinterfacesSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Car car = new Car();
		
		Car car1 = new Mercedezs();
		

	}

}

/*
 * <bean id="accountServivce" class="com.hcl.AccountServivceImpl" >
 * 	<property name="accountRepository" class="com.hcl.OracleAccountRepositoryImpl" />
 * 	
 * 	
 * </bean>
 * 
 * <bean id="accountServivce" class="com.hcl.AccountServivceImpl1" >
 * 	<constuctor-args name="accountRepository" class="com.hcl.OracleAccountRepositoryImpl" />
 * 	<constuctor-args name="someOtherRepository" class="com.hcl.OracleSomeOtherRepositoryImpl" />
 * 	
 * </bean>
 * 
 * class AccountServivceImpl implements AccountServivce {
 * 		@Autowired
 * 		@Identifier("someOtherRepository")
 * 		SomeOtherRepository someOtherRepository;
 * 
 * 		@Autowired
 * 		AccountRepository accountRepository;
 * 
 * 		String transfer (){
 * 			accountAccountRepository.find();
 * 			
 * 			return ""
 * 		}
 * }

* class AccountServivceImpl1 implements AccountServivce {
 * 		
 * 		SomeOtherRepository someOtherRepository = null;
 * 
 * 		
 * 		AccountRepository accountRepository = null;
 * 
 * AccountServivceImpl1(AccountRepository accountRepository, SomeOtherRepository someOtherRepository) {
 * 	this.someOtherRepository = someOtherRepository;
 *   this.accountRepository = accountRepository;
 * }
 * 
 * 		String transfer (){
 * 			accountAccountRepository.find();
 * 			
 * 			return ""
 * 		}
 * } */