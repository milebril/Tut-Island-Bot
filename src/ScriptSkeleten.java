import org.rspeer.runetek.adapter.scene.Player;
import org.rspeer.runetek.api.scene.Players;
import org.rspeer.script.Script;
import org.rspeer.script.ScriptMeta;

import Sections.CreateUsernameSection;
import Sections.Sections;

import org.rspeer.script.ScriptCategory;

@ScriptMeta(name = "Tutorial Island Delux",  desc = "Easy Peasy Completion", developer = "Qu3st; Ender; BottBoss", category = ScriptCategory.QUESTING)
public class ScriptSkeleten extends Script {
	
	private Sections currentSection; 
	
	private CreateUsernameSection createUsernameSection = new CreateUsernameSection();
	
    @Override
    public void onStart() {
    		currentSection = Sections.CREATE_USERNAME;
    }

    @Override
    public int loop() {
    		Player player = Players.getLocal();
    		int sleepTime = 0;
    		
        if (player.getAnimation() != -1 || player.isMoving()) {
            return 1000;
        }
        
        switch (currentSection) {
        case CREATE_USERNAME:
        		sleepTime = createUsernameSection.loop();
        		break;
        		
		default:
			sleepTime = 1000;
			break;
        }
    	
		return sleepTime;    	
    }

    @Override
    public void onStop() {
        //When the script is stopped the segment of code in this method will be ran once.   
    }
}