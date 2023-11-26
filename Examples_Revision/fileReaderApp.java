import java.io.FileReader;
import java.io.IOException;

public class fileReaderApp {
    public static void main(String[] args) throws IOException {
        String HAMLET_PART_FILE_PATH = ".........write the correct path......";

        // In order to display the first 100 characters from the file you have choose.
        char [] firstHundredCharacters = new char[100];

        try (FileReader hamletReader = new FileReader(HAMLET_PART_FILE_PATH)){
            hamletReader.read(firstHundredCharacters);   
            System.out.println(firstHundredCharacters); 
            System.out.println("Read more");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
