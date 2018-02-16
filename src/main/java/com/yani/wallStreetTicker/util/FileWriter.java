package util;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public abstract class FileWriter {
	protected String fileName;

	public FileWriter(String fileName) {
		this.fileName = fileName;
	}

	public abstract int read();

	public abstract int write();

	public int create() {
		// Check if the file exists before creating it
		try {
			File file = new File(fileName);
			if (!file.exists() && !file.isDirectory()) {
				PrintWriter out = new PrintWriter(fileName);
				out.close();
				return 1;
			}	
		}
		catch (FileNotFoundException exc) {
			// Process error
		}

		return 0;
	}
}
