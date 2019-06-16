import java.io.*;
import java.net.URL;

public class WebsiteReader {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.otodom.pl/sprzedaz/mieszkanie/sopot/?search%5Bdist%5D=0&search%5Bsubregion_id%5D=280&search%5Bcity_id%5D=208#");
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(url.openStream()));

        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = bufferedReader.readLine()) != null) {

            stringBuilder.append(line);
            stringBuilder.append(System.lineSeparator());
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OtoDom.html"));
        bufferedWriter.write(stringBuilder.toString());
        bufferedWriter.close();

    }
}
