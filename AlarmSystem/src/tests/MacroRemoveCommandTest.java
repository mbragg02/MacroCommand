package tests;

import org.junit.Test;

import code.ActionFactory;
import code.CaptureTheHoundsCommand;
import code.Command;
import code.CommandFactory;
import code.Doors;
import code.Hounds;
import code.Lights;
import code.LockDoorsCommand;
import code.MacroCommand;
import code.ReleaseTheHoundsCommand;
import code.Siren;
import code.TurnLightsOffCommand;
import code.TurnLightsOnCommand;
import code.TurnSirenOffCommand;
import code.TurnSirenOnCommand;
import code.UnlockDoorsCommand;

public class MacroRemoveCommandTest {


	@Test
	public void test() {
		
		ActionFactory act   = ActionFactory.getInstance();
		CommandFactory cmd = CommandFactory.getInstance();
		MacroCommand alarmDrill = new MacroCommand();
		
		Command turnLightsOnCommand  = cmd.getTurnLightsOnCommand(act.getLights());
		Command turnSirenOnCommand   = cmd.getTurnSirenOnCommand(act.getSiren());
		Command turnSirenOffCommand  = cmd.getTurnSirenOffCommand(act.getSiren());
		Command turnLightsOffCommand = cmd.getTurnLightsOffCommand(act.getLights());
		Command lockDoorsCommand     = cmd.getLockDoorsCommand(act.getDoors());
		Command unlocklDoorsCommand  = cmd.getUnlockDoorsCommand(act.getDoors());
		Command releaseTheHounds     = cmd.getReleaseTheHoundsCommand(act.getHounds());
		Command captureTheHounds     = cmd.getCaptureTheHoundsCommand(act.getHounds());
	
		alarmDrill.add(turnLightsOnCommand);
		alarmDrill.add(turnSirenOnCommand);
		alarmDrill.add(releaseTheHounds);
		alarmDrill.add(lockDoorsCommand);
		alarmDrill.add(unlocklDoorsCommand);
		alarmDrill.add(captureTheHounds);
		alarmDrill.add(turnSirenOffCommand);
		alarmDrill.add(turnLightsOffCommand);
		
		// Remove commands!
		alarmDrill.remove(turnSirenOnCommand);
		alarmDrill.remove(turnSirenOffCommand);
		
		System.out.println("========== MacroCommand Test ========");
		alarmDrill.execute();
	}

}
