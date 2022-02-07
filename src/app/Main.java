package app;

import java.util.HashMap;
import java.util.Map;

import app.data.TabletData;
import app.visuals.MainFrame;

public class Main extends Thread {
	
	public static Map<String, TabletData> projectData;
	private MainFrame mainFrame;

	public static void main(String[] args) {
		new Main().start();
	}
	
	@Override
	public void run() {
		mainFrame = new MainFrame(this);
	}
	
	public void createProject() {
		projectData = new HashMap<String, TabletData>();
	}
	
	

}
