package filemethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileExample {
	public static void main(String[] args) throws IOException {
		Path filepath=Path.of("C:\\File Handling/kpFile");
		//create and write
		Files.writeString(filepath, "Anusha");
		System.out.println("File Written Successfully");
		
		//reading from a file
		String readContent=Files.readString(filepath);
		System.out.println(readContent);
		
	}

}
