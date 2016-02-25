package ca.uwo.csd.cs2212.team09;

import java.awt.EventQueue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Main class
public class App {
    static Logger logger = LogManager.getLogger(App.class.getName());

    public static void main(String[] args) {
        System.out.println("Starting session");

        //To run this: (uncanned data)
        //java -jar target/team09_FitBitProject-1.0-SNAPSHOT-jar-with-dependencies.jar
        if (args.length == 0){
            UserInterface user = new UserInterface();
            user.refreshData(false, "2016-01-08");
        }
        //To run this: (canned data)
        //java -jar target/team09_FitBitProject-1.0-SNAPSHOT-jar-with-dependencies.jar canned
        else if (args[0].equals("canned")) {
            UserInterface user = new UserInterface();
            user.refreshData(true, "2016-01-08");
        }
        else if (args[0].equals("UITEST")) {
        	System.out.println("UITest mode.");
        	EventQueue.invokeLater(new Runnable() {
    			public void run() {
    				try {
    					MainView window = new MainView();
    				} catch (Exception e) {
    					e.printStackTrace();
    				}
    			}
    		});
        }

        logger.trace("Exiting main");
    }
}
