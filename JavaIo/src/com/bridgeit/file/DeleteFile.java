package com.bridgeit.file;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {

		File file = new File("/home/bridgelabz/JavaWorkspace/JavaIo/name.txt");
		if (file.delete()) {
			System.out.println("/home/bridgelabz/JavaWorkspace/JavaIo" + " File deleted..");
		} else {
			System.out.println("/home/bridgelabz/JavaWorkspace/JavaIo" + " File does not exist..");
		}
	}
}
