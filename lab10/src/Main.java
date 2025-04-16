import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.println("Podaj zdanie/tekst");
//        String txt = input.next();
//
//        txt = txt.toLowerCase().replaceAll("[.,!?;:]" , "");
//        String[] words = txt.split("\\s++");
//
//        Map<String,Integer> wordMap = new HashMap<>();
//        for (String word : words){
//            wordMap.put(word, wordMap.getOrDefault(word, 0)+1);
//        }
//        System.out.println("Lista wystąpień:");
//        for (Map.Entry<String, Integer> entry : wordMap.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
        String fileName = "tekst.txt";
        Map<String, Integer> wordMap = new HashMap<>();

        try{
            Scanner fileScanner = new Scanner(new File(fileName));
            StringBuilder sb = new StringBuilder();

            while (fileScanner.hasNextLine()){
                sb.append(fileScanner.nextLine()).append(" ");
            }

            fileScanner.close();
            String txt = sb.toString().toLowerCase().replaceAll(",.!?;:", "");
            String[] words = txt.split("\\s++");


            for (String word : words){
                if(!word.isEmpty())
                    wordMap.put(word, wordMap.getOrDefault(word, 0)+1);
            }

            System.out.println("Lista wystąpień:");
            for (Map.Entry<String, Integer> entry : wordMap.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }


        }catch (FileNotFoundException e){
            System.out.println("Nie znaleziono pliku "+ fileName);
        }


    }
}