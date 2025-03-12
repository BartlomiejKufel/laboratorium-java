import Lesson.Samochod;
import Tasks.Osoba;
import Tasks.Student;
import Zad4.Wydzial;

public class Main {
    public static void main(String[] args) {
        //zadanie 1
        Osoba osoba1 = new Osoba("Bartek", "Kajtowski", 32);
        Osoba osoba2 = new Osoba("Jan", 19);
        Osoba osoba3 = new Osoba("Filip", "Spóźnialski", 20);//pozdro
//        osoba1.View();
//        osoba2.View();
//        osoba3.View();

        Student student1 = new Student(osoba1, 124123, "Zażądzanie", "Ludzie", 2024);
        Student student2 = new Student(12341, "Malarstwo", "Wojna", 1234);
        Student student3 = new Student(osoba2, "Medycyna", "Marchewka");
        Student student4 = new Student(osoba3, 21331, "Cosialstwo");

//        student1.View();
//        student2.View();
//        student3.View();
//        student4.View();
//        student1.ChangeData();
//        student1.View();

        Wydzial informatyka = new Wydzial();
        informatyka.setStudentInIndex(1);
        informatyka.editStudentInIndex(1);
        informatyka.showAllStudenci();
        informatyka.showStudenciInRange(0,5);
        informatyka.removeStudentDataInIndex(1);
        informatyka.showStudent(1);


    }
}