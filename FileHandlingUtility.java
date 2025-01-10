import java.io.*;
import java.nio.file.*;

public class FileHandlingUtility {

    // Method to read content from a file
    public static void readFile(String fileName) {
        try {
            // Open the file and read line by line
            File file = new File(fileName);
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line;
                System.out.println("Reading file content:");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } else {
                System.out.println("File does not exist.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    // Method to write content to a file (overwrites existing content)
    public static void writeFile(String fileName, String content) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(content);
            writer.close();
            System.out.println("Content written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    // Method to append content to an existing file
    public static void appendToFile(String fileName, String content) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));  // true to append
            writer.write(content);
            writer.newLine(); // Add new line after appending
            writer.close();
            System.out.println("Content appended to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file: " + e.getMessage());
        }
    }

    // Method to modify content in a file
    public static void modifyFile(String fileName, String oldContent, String newContent) {
        try {
            Path path = Paths.get(fileName);
            String content = new String(Files.readAllBytes(path)); // Read all file content as String
            content = content.replace(oldContent, newContent); // Replace old content with new content

            // Write the modified content back to the file
            Files.write(path, content.getBytes());
            System.out.println("File modified successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while modifying the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        // Hardcoded file name and content for operations
        String fileName = "example.txt";  // File name to be used
        String contentToWrite = "This is the new content written to the file.";  // Content for write operation
        String contentToAppend = "This is an appended line of text.";  // Content for append operation
        String oldContent = "Java";  // Old content to replace
        String newContent = "Java Programming";  // New content to replace old content

        // Read operation
        System.out.println("\n---- Read Operation ----");
        readFile(fileName);

        // Write operation
        System.out.println("\n---- Write Operation ----");
        writeFile(fileName, contentToWrite);

        // Append operation
        System.out.println("\n---- Append Operation ----");
        appendToFile(fileName, contentToAppend);

        // Modify operation
        System.out.println("\n---- Modify Operation ----");
        modifyFile(fileName, oldContent, newContent);

        // Final read operation to see modifications
        System.out.println("\n---- Final Read Operation ----");
        readFile(fileName);
    }
}
