import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    static String fileLocation = "C:\\Users\\adria\\OneDrive\\Documents\\Java Projects\\Sandwich code\\Thicc-Sandwich-Shop-\\Output\\orders.txt";

    static void createFile() {
        try {
            File orderFile = new File(fileLocation);
            if(orderFile.createNewFile()) {
                System.out.println("new file " + orderFile.getName() + " created");
            } else {
                System.out.println("file " + orderFile.getName() + " already exists");
            }
        } catch(IOException e) {
            System.out.println("error has occured");
        }
    }

    static void writeOrder() {
        try {
            FileWriter order = new FileWriter(fileLocation);

            order.write("Here is the list of orders. \nThe ingredients are ordered: bread, meat, sauce, vegetable, toastyness. \n");
            order.write(Sandwich.codeToWord());
            order.close(); 
        } catch (IOException e) {
            System.out.println("an error has occured");
        }
    }
}
