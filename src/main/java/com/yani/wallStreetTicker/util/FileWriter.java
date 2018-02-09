package util;

import java.io.File;

public abstract class FileWriter {
	protected String fileName;

	public FileWriter(String fileName) {
		this.fileName = fileName;
	}

	public abstract int read();

	public abstract int write();

	public int create() {
		// Check if the file exists
		File file = new File(fileName);
		if (!file.exists() && !file.isDirectory()) {
			System.out.println("File does not exist!");
		}	

		return 0;
	}
}
