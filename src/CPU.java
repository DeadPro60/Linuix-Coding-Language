import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import compiler.commands.printstr;

public class CPU {
	
	static ParseCode Comp_ = new ParseCode(); //Create the code parser
	
	public static void LoadProgram(String filepath) { //Read program
		  try{

			    BufferedReader br = new BufferedReader(new FileReader(filepath)); //Create a buffered reader for the file
			    String strLine; //Create a string that will hold the text
			    //Read File Line By Line
			    while ((strLine = br.readLine()) != null)   {
			      // Print the content on the console
			      getCode(strLine);
			    }
			    //Close the input stream
			    br.close();
			    }catch (Exception e){//Catch exception if any
			      System.err.println("Error: " + e.getMessage());
			    }finally{
			    	System.exit(0);
			    }
	}
	public static String[] getCode(String code) {
		System.out.println(code); //Print code in console (not needed!)
		String command = code; //Command is equal to the code
		String[] ProcCommand_ = new String[24]; //Make new string
		ProcCommand_ = command.split(" "); //Now split for args
		ProcessCommand(ProcCommand_); //Compile the command (Do the code's function)
		return ProcCommand_; //Return the command that has just been compiled

	}
    public static void ProcessCommand(String[] Command)
    {
        Comp_.ParseCode(Command); //Parse the given command
    }
	
}
