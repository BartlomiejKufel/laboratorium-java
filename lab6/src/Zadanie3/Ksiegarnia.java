package Zadanie3;

import Tasks.InputData;

public class Ksiegarnia {
    //zakupy — tablica zakupów, ma reprezentować listę zakupów w księgarni
    public Zakup[] zakupy = new Zakup[20];

    public Ksiegarnia(){
        for(int i=0;i<zakupy.length;i++){
            zakupy[i] = new Zakup();
        }
    }

    public void showZakupy(int howMuch){
        InputData inputData = new InputData();

        for(int i=0;i< zakupy.length/howMuch;i++){
            for (int j=i*howMuch;j< (i+1)*howMuch;j++){
                System.out.println(j);
                System.out.println("==============================================================================================================================");
                zakupy[j].showInfo();
                System.out.println("==============================================================================================================================");
            }
            System.out.println("Aby przejść dalej wpisz: >");
            inputData.InputString();

        }
    }



}
