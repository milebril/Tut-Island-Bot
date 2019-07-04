package Sections;

import org.rspeer.script.Script;

public class CreateUsernameSection {
	
	private String username = "NieuweUserOfzo";
	
	private States state;
	private enum States {
			USERNAME, 
			OUTFIT;
	};
	
	public CreateUsernameSection() {
		state = States.USERNAME;
	}
	
	public int loop() {
		switch(state) {
		case USERNAME:
			
			break;
		case OUTFIT:
			
			break;
		}
		
		return 0;
	}
	
}
