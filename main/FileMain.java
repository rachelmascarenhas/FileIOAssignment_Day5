package com.montran.main;

import java.io.File;
import java.util.Scanner;

import com.montran.util.FileInputStreamUtil;
import com.montran.util.FileOutputStreamUtil;

public class FileMain {

	public static void main(String[] args) {
		int employeeId;
		String employeeName;
		double employeeSalary;
		byte[] filedata;
		Scanner scanner = new Scanner(System.in);
		FileInputStreamUtil util = new FileInputStreamUtil();
		FileOutputStreamUtil utill = new FileOutputStreamUtil();
		String filePath;
		String data;
		File file;
        
		System.out.println("Enter Path");
		filePath = scanner.next();
		file = new File(filePath);
		
		System.out.println("Enter employee details");
		System.out.println("Enter employee Id");
		employeeId=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter employee name");
		employeeName=scanner.nextLine();
		System.out.println("Enter employee salary");
		employeeSalary=scanner.nextInt();
		
		
		data = employeeId +" "+employeeName+" "+employeeSalary;
		utill.writeDataIntoFile(file, data.getBytes());
		
		
		System.out.println("Employee details added");

		System.out.println("Data From File");
		filedata=util.getFileData(file);
		for (byte b : filedata) {
			System.out.print((char) b);
		}
			
		scanner.close();
	}

}
