public class Adres {
    String ulica;
    int numerDomu;
    String kodPocztowy;
    String miasto;

    public Adres(String ulica, int numerDomu, String kodPocztowy, String miasto) throws NieprawidlowyAdresException {
        String msg="";
        if(ulica == null) {
            msg +=" Ulica nie może być null";
        }
        if(numerDomu <= 0){
            msg += " numerDomu nie może być <= 0";
        }
        if(kodPocztowy == null) {
            msg += " kodPocztowy nie może być null";
        }
        if(miasto == null) {
            msg += " Miasto nie może być null";
        }

        if(!(msg.isEmpty())){
            throw new NieprawidlowyAdresException(msg);
        }
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;


    }
    public static class NieprawidlowyAdresException extends Exception {
        public NieprawidlowyAdresException(String message) {
            super(message);
        }
    }



}
