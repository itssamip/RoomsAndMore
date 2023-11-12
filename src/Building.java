import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Building {

	public static void main(String[] args) {
		Scanner kybd = new Scanner(System.in);

        ArrayList<Room> rooms = new ArrayList<Room>();
		Random rand = new Random();

		System.out.println("Enter \n\t1: create classroom\n\t2: create create elevator" + "\n\t3: exit");
		int inp = kybd.nextInt();
		while (inp != 3) {
			if (inp == 1) {
				System.out.println("How many chairs? ");
				int ch = kybd.nextInt();
				Room current = new Classroom(rand.nextInt(1000) + 100, ch);
				rooms.add(current);
			} else if (inp == 2) {
				Elevator current = new Elevator(rand.nextInt(100) + 10);
				if (rand.nextInt(2) == 0) {
					current.up(rand.nextInt(10));
				} else {
					current.down(rand.nextInt(10));
				}
				rooms.add(current);
			}
			System.out.println("Enter \n\t1: create classroom\n\t2: create create elevator" + "\n\t3: exit");
			inp = kybd.nextInt();
		}
		kybd.close();
		for(int i=0; i<rooms.size(); i++)
       {
           System.out.println((i+ 1)+ ". " + rooms.get(i));
       }

	}

}
