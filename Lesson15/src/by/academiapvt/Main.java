package by.academiapvt;

import java.io.*;

public class Main {
    public static void main(String[] args) {
//        Task 1.1, 1.3
        File file1 = new File("src\\file1.txt");
        try (FileWriter fileWriter = new FileWriter(file1)) {
            fileWriter.write("The Rostóvs knew everybody in Moscow. The old count had money enough that year, " +
                    "as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, " +
                    "very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, " +
                    "and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very " +
                    "gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it " +
                    "very pleasant to be at home again. He felt that he had grown up and matured very much. His despair at " +
                    "failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his " +
                    "kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. " +
                    "Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George," +
                    " awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected " +
                    "racing men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom " +
                    "he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field" +
                    " Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to" +
                    " whom Denísov had introduced him.");
        } catch (IOException e) {
            throw new RuntimeException((e.getMessage()));
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1))) {
            String text = bufferedReader.readLine();
            System.out.println(text);
        } catch (Throwable e) {
            e.printStackTrace();
        }
//        Task 1.2, 1.4
        File file2 = new File("d:\\example", "file2.txt");
//        Папку example создал вручную
        try (FileWriter fileWriter = new FileWriter(file2)) {
            fileWriter.write("The Rostóvs knew everybody in Moscow. The old count had money enough that year, " +
                    "as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, " +
                    "very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, " +
                    "and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very " +
                    "gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it " +
                    "very pleasant to be at home again. He felt that he had grown up and matured very much. His despair at " +
                    "failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his " +
                    "kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. " +
                    "Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George," +
                    " awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected " +
                    "racing men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom " +
                    "he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field" +
                    " Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to" +
                    " whom Denísov had introduced him.");
        } catch (IOException e) {
            throw new RuntimeException((e.getMessage()));
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1))) {
            String text = bufferedReader.readLine();
            System.out.println("***********Сейчас этот текст выведется из второго файла");
            System.out.println(text);
        } catch (Throwable e) {
            e.printStackTrace();
        }
//        Task 2
        System.out.println("*****************");
        Car car = new Car("VW", "Touareg", "gen2", 2015);
        String file3 = "serialization/serialization.txt";
        serialize(car,file3);
        deserialize(file3);
    }
    static void serialize(Car car, String file){
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))){
            objectOutputStream.writeObject(car);
        }catch (Throwable e){
            e.printStackTrace();
        }
    }
    static void deserialize(String file){
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))){
            Car car = (Car) objectInputStream.readObject();
            System.out.println(car);
        }catch (Throwable e){
            e.printStackTrace();
        }
    }
}
