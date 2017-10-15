package com.company;
import java.util.*;

public class Main {
public static LinkedListStack_Queue nuevoList= new LinkedListStack_Queue();
    public static void main(String[] args) {
        nuevoList.printList();
        options();
        nuevoList.printList();

	// write your code here
    }
    public static void options() {
        int quitLoop = 0;
        do {

            System.out.println("enter command:");
            System.out.println("options");
            System.out.println("Type\"add\" to input String to list.");
            System.out.println("Type\"copy\" to re enter last string.");
            System.out.println("type\"delete\" to remove last string.");
            System.out.println("Type\"undo\" to add back removed string.");
            System.out.println("Type\"quit\" to exit program.");

            Scanner scan = new Scanner(System.in);
            String command = scan.nextLine();
            command = command.toUpperCase();

            switch (command) {
                case "ADD":
                    nuevoList.push();
                    break;
                case "COPY":
                    nuevoList.copy();
                case "DELETE":
                    nuevoList.remove();
                    break;
                case "UNDO":
                    nuevoList.undo();
                    break;
                case "QUIT":
                    System.out.println("Ending process.");
                    quitLoop++;
                    break;
                default:
                    System.out.println("Enter valid number.");
                    continue;
            }

            nuevoList.printList();
        } while (quitLoop == 0);

    }
}
