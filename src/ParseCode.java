
public class ParseCode {

	public void ParseCode(String[] command) { //Parse function
        String Com_ = command[0]; //Create a command var
        
        switch(Com_) { //Now switch
        
        case "print": //print command
        	compiler.commands.printstr prnt = new compiler.commands.printstr();
        	prnt.Execute(command);
        	break;
        case "cls":
        	compiler.commands.cls cls = new compiler.commands.cls();
        	cls.Execute(command);
        	break;
        }
	}
	
}
