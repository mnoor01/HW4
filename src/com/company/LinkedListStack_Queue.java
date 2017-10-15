package com.company;
import java.util.*;
public class LinkedListStack_Queue {

    Scanner scan= new Scanner(System.in);
    private LinkedList <String> stack_Queue= new LinkedList<>();
    private String tempRemoveCopy;
    private String tempAddCopy;
    public void push() {
        System.out.println("enter String: ");
        String userIn = scan.nextLine();
        stack_Queue.add(userIn);


    }
    public  void setAddCopy(String userIn) {
        this.tempAddCopy= userIn;
    }
    public void copy() {stack_Queue.add(tempAddCopy);}
    public void setTempRemoveCopy(String userIn){
        this.tempRemoveCopy=userIn;
    }
    public void remove(){
        if(stack_Queue.size()>=10) {
            System.out.println("you list is too big make it smaller.");
        }
        else {
            try {
                System.out.println("remove string");
                setTempRemoveCopy(stack_Queue.getLast());
                stack_Queue.removeLast();
            } catch (NoSuchElementException m)
            {
                System.out.println("Empty list please add string first.");
            }
        }
    }
    public void undo() {
        if(!stack_Queue.isEmpty() || tempRemoveCopy != ""){
            stack_Queue.add(tempRemoveCopy);
        }
        else {
            System.out.println("empty list please add string first.");
        }
    }
    public void printList() {
        System.out.println(stack_Queue);

    }

}
