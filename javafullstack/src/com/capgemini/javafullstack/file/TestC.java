package com.capgemini.javafullstack.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestC {
	public static void main(String[] args) {
		
		try(FileInputStream fin = new FileInputStream("Shalini.txt")){
			int x = 0;
			//-1 means end of file
			while( (x= fin.read()) != -1) {
				System.out.print((char)x);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
