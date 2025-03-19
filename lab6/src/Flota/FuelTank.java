package Flota;

public class FuelTank {
    private double capacity;
    private double currentLevel;

    public FuelTank(double capacity, double currentLevel) {
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    public void refuel(double amount){
        if(currentLevel + amount <= capacity){
            currentLevel += amount;
            System.out.println("Zatankowane");
        }
        else{
            System.out.println("Nie można zatankować");
        }

    }

   public void consume(double amount){
        if(amount > currentLevel){
            System.out.println("Nie wystarczająca ilość paliwa! Aktualny poziom: "+currentLevel+"L");
        }
        else{
            currentLevel -= amount;
            System.out.println("Zużyto "+amount+"L paliwa, pozostało: "+currentLevel+"L");
        }
   }

   public void displayInfo(){
       System.out.println("Pojemność zbiornika: "+capacity+"L");
       System.out.println("Poziom paliwa: "+currentLevel+"L");
   }

}
