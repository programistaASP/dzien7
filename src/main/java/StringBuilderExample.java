public class StringBuilderExample {
    StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Imie: ");
        stringBuilder.append("Marcin");
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("Nazwisko: ");
        stringBuilder.append("Wiktor");
        System.out.println(stringBuilder.toString());
    }
}
