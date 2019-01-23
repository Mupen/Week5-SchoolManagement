package se.lexicon.daniel.schoolmanagement.controller;

import se.lexicon.daniel.schoolmanagement.service.SchoolService;

public class ConsoleMenuController {
 	private SchoolService schoolMangment;
 	private boolean running;
 	
 	/* 
 	* @param schoolMangment Initialize the interface that give access 
 	* to signatures from other locations in the program. 
 	*/
 	
	public ConsoleMenuController() {
		schoolMangment.findCourseByName("Math");
		running = true;
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}
	
	public void run() {
		//Write code here	
		System.out.println("Check Before exit");
		
		setRunning(false);
		System.out.println("Check After exit");
	}
}
