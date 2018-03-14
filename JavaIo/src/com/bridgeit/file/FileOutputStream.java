package com.bridgeit.file;

import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStream {

	public static void main(String[] args) throws IOException {

		String fileData = "Abc";
		// System.out.println(fileData);
		OutputStream fileOutputStream = new java.io.FileOutputStream("name.txt");
		// System.out.println(fileOutputStream);
		fileOutputStream.write(fileData.getBytes());
		fileOutputStream.flush();
		fileOutputStream.close();
	}
}
