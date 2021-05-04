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


/*
input person: Zoe Field 10
[10 1]
input person: Suzy Queue 5
[10 1, 5 2]
input person: Ura Nerd 9
[10 1, 5 2, 9 3]
input person: Cal Kulate 5
[10 1, 5 2, 9 3, 5 4]
input person: Closda Windoes 1
[10 1, 5 2, 9 3, 5 4, 1 5]
input person: Blaise Pascal 2
[10 1, 5 2, 9 3, 5 4, 1 5, 2 6]
input person: Sally Field 3
[10 1, 5 2, 9 3, 5 4, 1 5, 2 6, 3 7]
input person: Qwerty Keys 4
[10 1, 5 2, 9 3, 5 4, 1 5, 2 6, 3 7, 4 8]
input person: Linc List 9
[10 1, 9 9, 9 3, 5 2, 1 5, 2 6, 3 7, 4 8, 5 4]
input person: Ima Geek 1

[10 1, 9 9, 9 3, 5 2, 1 5, 2 6, 3 7, 4 8, 5 4, 1 10]
input person: [10 1, 9 9, 9 3, 5 2, 1 5, 2 6, 3 7, 4 8, 5 4, 1 10]
input person: D
[9 3, 9 9, 3 7, 5 2, 1 5, 2 6, 1 10, 4 8, 5 4, null]
input person: D
[9 9, 5 2, 3 7, 4 8, 1 5, 2 6, 1 10, 5 4, null, null]
input person: D
[5 2, 4 8, 3 7, 5 4, 1 5, 2 6, 1 10, null, null, null]
input person: D
[4 8, 5 4, 3 7, 1 10, 1 5, 2 6, null, null, null, null]
input person: D
[5 4, 1 5, 3 7, 1 10, 2 6, null, null, null, null, null]
input person: D
[3 7, 1 5, 2 6, 1 10, null, null, null, null, null, null]
input person: D
[2 6, 1 5, 1 10, null, null, null, null, null, null, null]
input person: Electromagnetic Field 8
[8 11, 2 6, 1 10, 1 5, null, null, null, null, null, null, null]
input person: Zoe Guest 7
[8 11, 7 12, 1 10, 1 5, 2 6, null, null, null, null, null, null, null]
input person: Sally Guest 2
[8 11, 7 12, 2 13, 1 5, 2 6, 1 10, null, null, null, null, null, null, null]
input person: April Field 1
[8 11, 7 12, 2 13, 1 5, 2 6, 1 10, 1 14, null, null, null, null, null, null, null]
input person: Asdfgh Keys 10
[10 15, 8 11, 2 13, 7 12, 2 6, 1 10, 1 14, 1 5, null, null, null, null, null, null, null]
input person: Mike Rochip 10
[10 15, 10 16, 2 13, 8 11, 2 6, 1 10, 1 14, 1 5, 7 12, null, null, null, null, null, null, null]
input person: Amy Rochip 10
[10 15, 10 16, 2 13, 8 11, 10 17, 1 10, 1 14, 1 5, 7 12, 2 6, null, null, null, null, null, null, null]
input person: Didja Windoes 8
[10 15, 10 16, 2 13, 8 11, 10 17, 1 10, 1 14, 1 5, 7 12, 2 6, 8 18, null, null, null, null, null, null, null]
input person: Data Field 4
[10 15, 10 16, 4 19, 8 11, 10 17, 2 13, 1 14, 1 5, 7 12, 2 6, 8 18, 1 10, null, null, null, null, null, null, null]
input person: Howard Yadoing 3
[10 15, 10 16, 4 19, 8 11, 10 17, 3 20, 1 14, 1 5, 7 12, 2 6, 8 18, 1 10, 2 13, null, null, null, null, null, null, null]
input person: D
[10 16, 10 17, 4 19, 8 11, 8 18, 3 20, 1 14, 1 5, 7 12, 2 6, 2 13, 1 10, null, null, null, null, null, null, null, null]
input person: D
[10 17, 8 11, 4 19, 7 12, 8 18, 3 20, 1 14, 1 5, 1 10, 2 6, 2 13, null, null, null, null, null, null, null, null, null]
input person: D
[8 11, 8 18, 4 19, 7 12, 2 6, 3 20, 1 14, 1 5, 1 10, 2 13, null, null, null, null, null, null, null, null, null, null]
input person: D
[8 18, 7 12, 4 19, 1 5, 2 6, 3 20, 1 14, 2 13, 1 10, null, null, null, null, null, null, null, null, null, null, null]
input person: D
[7 12, 2 6, 4 19, 1 5, 1 10, 3 20, 1 14, 2 13, null, null, null, null, null, null, null, null, null, null, null, null]
input person: Alice Ardvaark 6
[7 12, 6 21, 4 19, 2 6, 1 10, 3 20, 1 14, 2 13, 1 5, null, null, null, null, null, null, null, null, null, null, null, null]
input person: Genevieve Stapos 10
[10 22, 7 12, 4 19, 2 6, 6 21, 3 20, 1 14, 2 13, 1 5, 1 10, null, null, null, null, null, null, null, null, null, null, null, null]
input person: Abe Ardvaark 1
[10 22, 7 12, 4 19, 2 6, 6 21, 3 20, 1 14, 2 13, 1 5, 1 10, 1 23, null, null, null, null, null, null, null, null, null, null, null, null]
input person: Doyour Math 2
[10 22, 7 12, 4 19, 2 6, 6 21, 3 20, 1 14, 2 13, 1 5, 1 10, 1 23, 2 24, null, null, null, null, null, null, null, null, null, null, null, null]
input person: Iluv Math 2
[10 22, 7 12, 4 19, 2 6, 6 21, 3 20, 1 14, 2 13, 1 5, 1 10, 1 23, 2 24, 2 25, null, null, null, null, null, null, null, null, null, null, null, null]
input person: D
[7 12, 6 21, 4 19, 2 6, 1 10, 3 20, 1 14, 2 13, 1 5, 2 25, 1 23, 2 24, null, null, null, null, null, null, null, null, null, null, null, null, null]
input person: D
[6 21, 2 6, 4 19, 2 13, 1 10, 3 20, 1 14, 2 24, 1 5, 2 25, 1 23, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
input person: D
[4 19, 2 6, 3 20, 2 13, 1 10, 1 23, 1 14, 2 24, 1 5, 2 25, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
input person: Sally Pascal 9
[9 26, 4 19, 3 20, 2 13, 2 6, 1 23, 1 14, 2 24, 1 5, 2 25, 1 10, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
input person: D
[4 19, 2 6, 3 20, 2 13, 2 25, 1 23, 1 14, 2 24, 1 5, 1 10, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
input person: D
[3 20, 2 6, 1 14, 2 13, 2 25, 1 23, 1 10, 2 24, 1 5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
input person: D
[2 6, 2 13, 1 14, 2 24, 2 25, 1 23, 1 10, 1 5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
input person: D
[2 13, 2 24, 1 14, 1 5, 2 25, 1 23, 1 10, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
input person: D
[2 24, 2 25, 1 14, 1 5, 1 10, 1 23, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
input person: D
[2 25, 1 5, 1 14, 1 23, 1 10, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
input person: D
[1 5, 1 23, 1 14, 1 10, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
input person: D
[1 14, 1 23, 1 10, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
input person: D
[1 23, 1 10, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
input person: D
[1 10, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
input person: D
[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
input person: D
Queue is empty
[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
input person: q
[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
input person: q
[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
input person: 
*/
