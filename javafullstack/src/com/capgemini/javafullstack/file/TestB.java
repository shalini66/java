package com.capgemini.javafullstack.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestB {
	public static void main(String[] args) {
		File f = new File("Mishra.txt");
		String mesg = "ga";
		char ch[] =mesg.toCharArray();
		try(FileWriter fw = new FileWriter("Mishra.txt", true)) {
			f.createNewFile();
			fw.write(ch);
			System.out.println("data written");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
