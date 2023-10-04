//MAIN CLASS
package spring_package;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
          ApplicationContext apcon = new ClassPathXmlApplicationContext("Config.xml");
		//CREATING OBJECT FOR MAKEMYTRIP CLASS AND ACCESSING THE TRAVEL INTERFACE
          MakeMyTrip m= apcon.getBean("makemytrip",MakeMyTrip.class);
          System.out.println(m.getTravel());
          
          System.out.println("Willing to travel by Train");
          Train t = (Train)apcon.getBean("train");
          t.journey();
          t.cost();
          System.out.println();
          
          System.out.println("Willing to travel by Bus");
          Bus b = (Bus)apcon.getBean("bus");
          b.journey();
          b.cost();
          System.out.println();
          
          System.out.println("Willing to travel by Flight");
          Flight f = (Flight)apcon.getBean("flight");
          f.journey();
          f.cost();

	}

}
