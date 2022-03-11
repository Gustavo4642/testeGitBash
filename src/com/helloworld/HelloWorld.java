package com.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client cl = new Client();
		
		cl.setId(1L);
		cl.setDescricao("Ola mundo");
		
		System.out.println(cl.getId());
		System.out.println(cl.getDescricao());
		
	}

}
