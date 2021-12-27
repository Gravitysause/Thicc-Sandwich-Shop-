public class Main {
    public static void main(String[] args) {
        System.out.println(codeToWord());
    }

    public static String codeToWord() {
        String x = Sandwich.input();

        return Sandwich.bread(x) + Sandwich.meat(x) + Sandwich.sauce(x) + Sandwich.vegetables(x) + Sandwich.toasted(x);
    }
}