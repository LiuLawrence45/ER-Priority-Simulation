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
		while (usr!=null) {
			if (usr.equals("D")) {
					try{
						er.dequeue();
						order--;
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
				er.printArray();
				System.out.print("input person: ");
				usr = input.readLine();
			
		}
		
	}

}
