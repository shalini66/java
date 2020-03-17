package com.capgemini.javafullstack.exception;

import java.io.File;
import java.io.IOException;

public class MusicPlayer {
	void produce() throws IOException{
		System.out.println("produce started");
		File f = new File("M:/Shalini.txt");
		try {
			f.createNewFile();
			System.out.println("File creaated");
		}
		catch(IOException e) {
			System.out.println("Exception caught at produce");
			throw e;
		}
		System.out.println("produce ended");
	}
}
