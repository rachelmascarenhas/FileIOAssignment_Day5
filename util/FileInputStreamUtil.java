package com.montran.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamUtil {

	private byte[] data; //a container that will store all the incoming file data read from the file
	private int fileLength;//to store file length
	private InputStream inputStream; 

	public byte[] getFileData(File file) {
		try {
			fileLength = (int) file.length();//file.length returns long output therefore typecasting is done
			data = new byte[fileLength]; //the size of byte array data[] is intialized to file length
			inputStream = new FileInputStream(file); 
			inputStream.read(data); //reading the file 
			return data;
		} catch (FileNotFoundException e) { //in case file is not found
			System.out.println("FileNotFoundException :: ");
			System.out.println(e.getMessage()); //will display system message 
		} catch (IOException e) {
			System.out.println("IOException :: ");
			System.out.println(e.getMessage());
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				System.out.println("IOException :: ");
				System.out.println(e.getMessage());
			}
		}
		return null;
	}

}
