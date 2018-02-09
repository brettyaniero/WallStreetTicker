package util;

import java.io.File;
import java.io.PrintWriter;

public abstract class FileWriter {
	protected String fileName;

	public FileWriter(String fileName) {
		this.fileName = fileName;
	}

	public abstract int read();

	public abstract int write();

	public int create() {
		// Check if the file exists before creating it
		File file = new File(fileName);
		if (!file.exists() && !file.isDirectory()) {
			PrintWriter out = new PrintWriter(fileName);
			out.close();
			return 1;
		}	

		return 0;
	}
}
