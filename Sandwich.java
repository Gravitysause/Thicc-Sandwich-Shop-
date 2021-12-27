import javax.swing.JOptionPane;

public class Sandwich {

    //creates text box for you to type code into
    static String input() {
        String code = JOptionPane.showInputDialog(null, "Enter sandwich code here");
        return code;
    }
    
    //bread
    static String bread(String x) {
        char y = x.charAt(0);
        String b;

        switch (y) {
            case 'w':
                b = "white bread";
                break;
            case 'r':
                b = "rye bread (eww)";
                break;
            case 's':
                b = "sour dough bread";
                break;
            case 'i':
                b = "italian herb";
                break;
            default:
                b = "invalid bread";
                break;
        }

        return b + ", ";
    }

    //meat
    static String meat(String x) {
        char y = x.charAt(1);
        String m;

        switch (y) {
            case 's':
                m = "steak";
                break;
            case 'c':
                m = "chicken";
                break;
            case 'b':
                m = "beyond meat";
                break;
            case 'p':
                m = "pork";
                break;
            case 'h': 
                m = "sheep meat";
                break;
            case 'i':
                m = "mixed meats";
                break;
            case 'n':
                m = "no meat";
                break;
            default:
                m = "invalid meat";
                break;
        }

        return m + ", ";
    }

    //sauce
    static String sauce(String x) {
        char y = x.charAt(2);
        String s;

        switch (y) {
            case 'h':
                s = "hot sauce";
                break;
            case 'm':
                s = "mustard";
                break;
            case 't':
                s = "tomato sauce";
                break;
            case 'n':
                s = "no sauce";
                break;
            default:
                s = "invalid sauce";
                break;
        }

        return s + ", ";
    }

    //vegetables
    static String vegetables(String x) {
        char y = x.charAt(3);
        String v;

        switch (y) {
            case 'l':
                v = "letuce";
                break;
            case 'p':
                v = "pickles";
                break;
            case 't':
                v = "tomatos";
                break;
            case 'n':
                v = "no vegetables";
                break;
            default:
                v = "invalid vegetable";
                break;
        }

        return v + ", ";
    }

    //toasted
    static String toasted(String x) {
        char y = x.charAt(4);
        String t;
        int z = y - '0';

        String[] levelsOfToastyness = {"untoasted", "rare", "medium-rare", "medium", "medium-well", "well-done"};
        
        try {
            t = levelsOfToastyness[z];
        } catch (Exception e) {
            t = "invalid level of toastyness";
        }

        return t;
    }
}
