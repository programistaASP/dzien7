import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zadanie {


    public static void main(String[] args) throws IOException {
        List<Person> nameList = new ArrayList<>();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("sex.csv"));

        while (true) {
            System.out.println("Podaj swoje imię:");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();

            if (name.equals("koniec"))
                break;

            if (name.endsWith("a")) {
                System.out.println("jesteś kobietą");
                nameList.add(new Person(name, Sex.FEMALE));

            } else{
                System.out.println("Jesteś mężczyzną");
                nameList.add(new Person(name, Sex.MALE));}
        }
        System.out.println(nameList);

        for (Person person : nameList) {
            bufferedWriter.append(person.toString());
            bufferedWriter.append(System.lineSeparator());

        }
        bufferedWriter.close();


    }
}
