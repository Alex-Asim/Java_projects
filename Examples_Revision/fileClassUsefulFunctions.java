import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class fileClassUsefulFunctions {
    public static void main(String[] args) {
        File firstFile = new File("..\\file_handling.java");

        // Prints the name of the file
        System.out.println("File name: " + firstFile.getName());
        
        // Returns the file directory where the file can be found
        System.out.println("Parent: " + firstFile.getParent());
        
        // Returns whether the file or directory exists or not. Usually we use it to check in order to do operations in a file.
        System.out.println("The file exists: " + firstFile.exists());
        
        // Returns whether the file is an object or directory
        System.out.println("The file object is a directory: " + firstFile.isDirectory());
        System.out.println("The file object is a file: " + firstFile.isFile());
        
        // The following returns false if the path is a relative, an absolute path starts with a adisk name (C:\.....)
        System.out.println("This pathname is absolute: " + firstFile.isAbsolute());
        
        // The following returns whether the file can be executed, read it or be written.
        System.out.println("The file can be execute: " + firstFile.canExecute());
        System.out.println("This file can be read: " + firstFile.canRead());
        System.out.println("The file can be written: " + firstFile.canWrite());

        // Returns the relative path
        System.out.println("Get path: " + firstFile.getPath());
        System.out.println("Get absolute path: " + firstFile.getAbsolutePath());
        // We use try.....catch because anything can go wrong when you try to resolve the path
        try {
            System.out.println("Get canonical path: " + firstFile.getCanonicalPath());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println("Get URI path: " + firstFile.toURI());

        Calendar lastModified = Calendar.getInstance();
        lastModified.setTimeInMillis(firstFile.lastModified());
        System.out.println("Last modified: " + lastModified.getTime());

        // Functions that related to storage. You can use the following but you can not take them for garanty.
        System.out.println("Total space: " + firstFile.getTotalSpace() + "bytes");
        System.out.println("Free space: " + firstFile.getFreeSpace() + "bytes");
        System.out.println("Usable space: " + firstFile.getUsableSpace() + "bytes");

        firstFile.setReadOnly();
        firstFile.setReadable(true);
        firstFile.setWritable(true);
        firstFile.setExecutable(true);

        // Set the last modified.
        firstFile.setLastModified(Calendar.getInstance().getTimeInMillis());
        lastModified.setTimeInMillis(firstFile.lastModified());
        System.out.println("New last modified: " + lastModified.getTime());
    }
}
