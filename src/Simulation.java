/**
 * Simulation class placing patients within a priority queue
 * @author lawrenceliu
 *
 */
import java.io.*;
import java.util.*;

public class Simulation {

	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Patient> er = new PriorityQueue<Patient>();
		
		System.out.print("input person: ");
		int order = 1;
		String usr = input.readLine();
		while (usr!="q") {
			if (usr.equals("D")) {
					try{
						er.dequeue();
						//er.printArray();
					}
					catch(Exception e){
						System.out.println("Queue is empty");
					}
				}
			else {
					String [] line = usr.split(" ");
					if (line.length >= 3) {
						Patient foo = new Patient(line[0],line[1],Integer.parseInt(line[2]), order);
						er.enqueue(foo);
						order++;
					}
				}
			//er.printArray();
				System.out.print("input person: ");
				usr = input.readLine();
			
		}
		
	}

}


/*
input person: Zoe Field 10
input person: 
input person: Suzy Queue 5
input person: Ura Nerd 9
input person: Cal Kulate 5
input person: Closda Windoes 1
input person: 
input person: Blaise Pascal 2
input person: Sally Field 3
input person: Qwerty Keys 4
input person: Linc List 9
input person: Ima Geek 1

input person: input person: D
Zoe Field 10
input person: D
Ura Nerd 9
input person: D
Linc List 9
input person: D
Suzy Queue 5
input person: D
Qwerty Keys 4
input person: D
Cal Kulate 5
input person: D
Sally Field 3
input person: Electromagnetic Field 8
input person: Zoe Guest 7
input person: Sally Guest 2
input person: April Field 1
input person: Asdfgh Keys 10
input person: Mike Rochip 10
input person: Amy Rochip 10
input person: Didja Windoes 8
input person: Data Field 4
input person: Howard Yadoing 3
input person: D
Asdfgh Keys 10
input person: D
Mike Rochip 10
input person: D
Amy Rochip 10
input person: D
Electromagnetic Field 8
input person: D
Didja Windoes 8
input person: Alice Ardvaark 6
input person: Genevieve Stapos 10
input person: Abe Ardvaark 1
input person: Doyour Math 2
input person: Iluv Math 2

input person: input person: D
Genevieve Stapos 10
input person: D
Zoe Guest 7
input person: D
Alice Ardvaark 6
input person: Sally Pascal 9
input person: D
Sally Pascal 9
input person: D
Data Field 4
input person: D
Howard Yadoing 3
input person: D
Blaise Pascal 2
input person: D
Sally Guest 2
input person: D
Doyour Math 2
input person: D
Iluv Math 2
input person: D
Closda Windoes 1
input person: D
April Field 1
input person: D
Abe Ardvaark 1
input person: D
Ima Geek 1
input person: D
Queue is empty
input person: Exception in thread "main" 
*/
