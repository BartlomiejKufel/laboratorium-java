package Zadanie3;

import Tasks.InputData;


public class Klient {
    protected String imie;
    protected String nazwisko;
    protected int wiek;
    protected String numerTelefonu;
    protected String email;

    public Klient(String imie, String nazwisko, int wiek, String numerTelefonu, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.numerTelefonu = numerTelefonu;
        this.email = email;
    }

    public Klient() {
        this.imie = "";
        this.nazwisko = "";
        this.wiek = 0;
        this.numerTelefonu = "";
        this.email = "";
    }

    //showInfo — wyświetlanie danych klienta
    public void showInfo(){
        System.out.println("Klient: Imię i Nazwisko: "+imie+" "+nazwisko+"; Wiek: "+wiek+"; Nr Telefonu: "+numerTelefonu+"; Email: "+email+";");
    }

    //showInfo — wyświetlanie danych klienta przekazanych do metody
    public void showInfo(String tmpImie, String tmpNazwisko, int tmpWiek, String tmpNumerTelefonu, String tmpEmail){
        System.out.println("Klient: Imię i Nazwisko: "+tmpImie+" "+tmpNazwisko+"; Wiek: "+tmpWiek+"; Nr Telefonu: "+tmpNumerTelefonu+"; Email: "+tmpEmail+";");
    }



    //setKlient — przypisywanie wartości przekazanych do tej metody
    public void setKlient(String imie, String nazwisko, int wiek, String numerTelefonu, String email){
        this.imie = imie;
        this.nazwisko = nazwisko;
        if(wiek > 3) //no bo jak ma się mniej niż 3 lata to za bardzo się jeszcze nie wie co się dzieje ~ Mateusz K.
            this.wiek = wiek;
        this.numerTelefonu = numerTelefonu;
        this.email = email;
    }

    //addKlient — dodanie danych do pustego klienta, dane wpisuje użytkownik
    public void addKlient(){
        InputData input = new InputData();
        System.out.println("Wpisywanie Danych Klienta: ");
        System.out.println("Podaj imię:");
        String imie = input.InputString();
        System.out.println("Podaj nazwisko:");
        String nazwisko = input.InputString();
        System.out.println("Podaj wiek:");
        int wiek = input.InputInt();
        System.out.println("Podaj numer telefonu:");
        String numerTelefonu = input.InputString();
        System.out.println("Podaj email:");
        String email = input.InputString();

        System.out.println("=================================================Nowe Dane====================================================================");
        showInfo(imie, nazwisko, wiek, numerTelefonu, email);
        System.out.println("==============================================================================================================================");
        System.out.println("Aby Zapisać dane wpisz: Tak");
        if(input.InputString().equals("Tak")){
            setKlient(imie, nazwisko, wiek, numerTelefonu, email);
            System.out.println("Dane zapisane");
        }
    }

    //editKlient — edycja danych klienta, nowe dane wpisuje użytkownik
    public void editKlient(){
        System.out.println("=================================================Aktualne Dane================================================================");
        showInfo();
        System.out.println("==============================================================================================================================");

        InputData input = new InputData();
        System.out.println("Edycja Danych Klienta: ");
        System.out.println("Podaj nowe imię:");
        String imie = input.InputString();
        System.out.println("Podaj nowe nazwisko:");
        String nazwisko = input.InputString();
        System.out.println("Podaj nowy wiek:");
        int wiek = input.InputInt();
        System.out.println("Podaj nowy numer telefonu:");
        String numerTelefonu = input.InputString();
        System.out.println("Podaj nowy email:");
        String email = input.InputString();

        System.out.println("=================================================Nowe Dane====================================================================");
        showInfo(imie, nazwisko, wiek, numerTelefonu, email);
        System.out.println("==============================================================================================================================");
        System.out.println("Aby Zapisać zmiany wpisz: Tak");
        if(input.InputString().equals("Tak")){
            setKlient(imie, nazwisko, wiek, numerTelefonu, email);
            System.out.println("Zmiany zapisane");
        }
    }

    // deleteKlient — usuwanie danych klienta/ ustawianie ich na puste
    public void deleteKlient(){
        System.out.println("=================================================Aktualne Dane================================================================");
        showInfo();
        System.out.println("==============================================================================================================================");

        InputData input = new InputData();
        System.out.println("Jeśli chcesz usunąć dane tego użytkownika wpisz: Tak");
        if(input.InputString().equals("Tak")){
            setKlient("", "", 0,"","");
            System.out.println("Dane usunięte");
        }

    }


}
