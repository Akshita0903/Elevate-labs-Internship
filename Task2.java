package task1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

class  Student{
    private int Id;
    private String name;
    private long contactNum;
    Student(int Id, String name,long contactNum){
        this.Id=Id;
        this.name=name;
        this.contactNum=contactNum;

    }
    public int getId(){
        return Id;
    }
    public String getName(){
        return name;
    }
    public long getcontactNum(){
        return contactNum;
    }
    public String toString(){
        return Id+" "+name+" "+contactNum;
    }
}
class Task2{
    public static void main(String[] args) {
        List<Student> c=new ArrayList<Student>();
        Scanner sc=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        int ch;
        do{
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.print("Enter your choice: ");
            ch=sc.nextInt();
           // s1.nextLine();
            switch (ch) {
                case 1:
                System.out.println("-----------entering details");
                    System.out.print("Enter Student Id: ");
                    int s_id=sc.nextInt();
                    //sc.nextLine();
                    System.out.print("Enter student name: ");
                    String name=s1.nextLine();
                    System.out.print("Enter student contact number: ");
                    long contactNum=sc.nextLong();
                   // sc.nextLine();
                    c.add(new Student(s_id, name, contactNum));
                    System.out.println("student added successfully!");
                    break;
                case 2:
                System.out.println("-------Display details----------");
                Iterator<Student> i=c.iterator();
                while(i.hasNext()){
                    Student e=i.next();
                    System.out.println(e);
                }
                System.out.println("Details displayed successfully!");
                break; 
                case 3: 
                boolean found=false;
                System.out.print("Enter student id to search: ");
                int search_id=sc.nextInt();
                System.out.println("-------Search details----------");
                i=c.iterator();
                while(i.hasNext()){
                    Student e=i.next();
                    if(e.getId()==search_id){
                        System.out.println(e);
                        found=true;
                    }
                }
                System.out.println("------------------------------");
                if(!found){
                    System.out.println("Record not found: ");
                }
                break;
                case 4:
                found=false;
                System.out.print("enter details to delete----------");
               int del_id=sc.nextInt();
                //sc.nextLine();
                i=c.iterator();
                while(i.hasNext()){
                    Student e=i.next();
                    if(e.getId()==del_id){
                        i.remove();
                        found=true;
                    }
                }
                if(!found){
                    System.out.println("record not found");
                }
                else{
                    System.out.println("Record deleted successfully: ");
                }
                System.out.println("-----------------------------");
                break;
            case 5:
                found=false;
                System.out.print("enter student details to update: ");
                int update_id=sc.nextInt();
                //sc.nextLine();
                ListIterator<Student>li=c.listIterator();
                while(li.hasNext()){
                    Student e=li.next();
                    if(e.getId()==update_id){
                        System.out.println("enter new name: ");
                        String new_name=s1.nextLine();
                        System.out.println("enter new contact number:");
                        long new_contactNum=sc.nextLong();
                        sc.nextLine();
                        li.set( new Student(update_id, new_name, new_contactNum));
                        found=true;
                    }
                }
                if(!found){
                    System.out.println("Record not found");
                }
                else{
                    System.out.println("Record updated successfully! ");
                }
                break;
            case 0:
                System.out.println("Exiting");
                break;
            
                default:
                System.out.println("Invalid choice, try again");
            }
        }while (ch!=0); {
            sc.close();
            s1.close();
        }
    }
}
