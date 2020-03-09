package com.epam.DesignPatterns.StructuralPattern;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor {
	public void runCommand(String cmd) throws IOException {
		//some heavy implementation
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");
	}
}
