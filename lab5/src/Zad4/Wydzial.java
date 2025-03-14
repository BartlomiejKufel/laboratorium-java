package Zad4;

import InputData.InputData;
import Tasks.Osoba;
import Tasks.Student;

public class Wydzial {
    private Student[] studenci = new Student[100];

    public Wydzial() {
        for (int i = 0; i < studenci.length; i++) {
            studenci[i] = setBasicStudent();
        }
    }

    private Student setBasicStudent(){
        return (new Student(new Osoba("", "", 0),0,"","", 0));
    }

    public void setStudentInIndex(int index){
        if(index >= 0 && index < studenci.length)
            studenci[index].ChangeData();
        else
            System.out.println("Podałeś zły index tablicy, wybierz z przedziału 0 do 100.");
    }

    public void editStudentInIndex(int index){
        if(index > 0 && index < studenci.length){
            System.out.println("Stare dane: ");
            studenci[index].View();

            System.out.println("Podaj nowe dane: ");
            studenci[index].ChangeData();
        }
        else
            System.out.println("Podałeś zły index tablicy, wybierz z przedziału 0 do 100.");
    }

    public void removeStudentDataInIndex(int index){
        InputData input = new InputData();
        if(index > 0 && index < studenci.length){
            System.out.println("Student: ");
            studenci[index].View();

            System.out.println("Jeśli chcesz usunąć dane tego studenta napisz accept: ");
            String accept = input.InputString();
            if(accept.equals("accept")){
                studenci[index] = setBasicStudent();
                System.out.println("Pomyślnie usunięto dane studenta");
            }
            else {
                System.out.println("Źle wpisane");
            }
        }
        else
            System.out.println("Podałeś zły index tablicy, wybierz z przedziału 0 do 100.");
    }

    public void showStudent(int index){
        if(index >= 0 && index < studenci.length){
            studenci[index].View();
            System.out.println();
        }else
            System.out.println("Źle podany index");
    }

    public void showAllStudenci(){
        for (Student std : studenci){
            std.View();
            System.out.println();
        }
    }

    public void showStudenciInRange(int limit1, int limit2){
        if((limit1 >= 0 && limit2 >= 0) && (limit1 <= limit2) && (limit2 < studenci.length)){
            for (int i = limit1; i <= limit2; i++) {
                studenci[i].View();
                System.out.println();
            }
        }
        else{
            System.out.println("Źle podany zakres");
        }
    }

}
