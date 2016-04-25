package compiler.commands;

//UPDATE 1: Adding in space support

public class println {

	public static void Execute(String[] args){

		Proceed(args);
	}
	
	public static void Proceed(String[] args) {

		System.out.println(args[1]);
	}
}
