package com.app.services;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReader implements Readerimpl {

	@Override
	public void reader() throws IOException {
		FileInputStream ft = new FileInputStream("C:\\Users\\darsh\\OneDrive\\Desktop\\dsp.txt");
		int j;
		while ((j = ft.read()) != -1) {
			System.out.print((char) j);
		}
		ft.close();
	}
}
