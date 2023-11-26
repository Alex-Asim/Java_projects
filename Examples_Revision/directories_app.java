import java.io.File;
import java.util.Arrays;;

public class directories_app {

    public static void main(String[] args) {
        File businessBooksDirectory = new File("Ebooks\\Business");

        // Make directory
        if (businessBooksDirectory.mkdirs()) {
            System.out.println("The new directory is created.");
        }
        else{
            System.out.println("Can't create the directory");
        }

        businessBooksDirectory.deleteOnExit();

        File file_handlingDirectory = new File("...\\Examples_Revision\\");
        System.out.println("Files int the handling file directory:");
        System.out.println(Arrays.toString(file_handlingDirectory.list()));
        System.out.println(Arrays.toString(file_handlingDirectory.listFiles()));

    }
}
