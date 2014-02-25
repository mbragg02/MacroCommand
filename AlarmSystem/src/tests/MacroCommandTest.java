package tests;

import org.junit.Test;

import code.CaptureTheHoundsCommand;
import code.Hounds;
import code.MacroCommand;
import code.Command;
import code.Doors;
import code.Lights;
import code.LockDoorsCommand;
import code.ReleaseTheHoundsCommand;
import code.Siren;
import code.TurnLightsOffCommand;
import code.TurnLightsOnCommand;
import code.TurnSirenOffCommand;
import code.TurnSirenOnCommand;
import code.UnlockDoorsCommand;

public class MacroCommandTest {

	@Test
	public void test() {
		Lights lights = new Lights();
		Doors doors = new Doors();
		Siren siren = new Siren();
		Hounds hounds = new Hounds();
		
		Command turnLightsOnCommand = new TurnLightsOnCommand(lights);
		Command turnSirenOnCommand = new TurnSirenOnCommand(siren);
		Command turnSirenOffCommand = new TurnSirenOffCommand(siren);
		Command turnLightsOffCommand = new TurnLightsOffCommand(lights);
		Command lockDoorsCommand = new LockDoorsCommand(doors);
		Command unlocklDoorsCommand = new UnlockDoorsCommand(doors);
		Command releaseTheHounds = new ReleaseTheHoundsCommand(hounds);
		Command captureTheHounds = new CaptureTheHoundsCommand(hounds);
		
		MacroCommand alarmDrill = new MacroCommand();
		
		alarmDrill.add(turnLightsOnCommand);
		alarmDrill.add(turnSirenOnCommand);
		alarmDrill.add(releaseTheHounds);
		alarmDrill.add(lockDoorsCommand);
		alarmDrill.add(unlocklDoorsCommand);
		alarmDrill.add(captureTheHounds);
		alarmDrill.add(turnSirenOffCommand);
		alarmDrill.add(turnLightsOffCommand);
		
		System.out.println("========== MacroCommand Test ========");
		alarmDrill.execute();		
	}
}
