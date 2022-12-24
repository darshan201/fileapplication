package com.app.fileReaderApp;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import com.app.services.DocWriterimpl;
import com.app.services.FileProcessor;
import com.app.services.FileProcessorImpl;
import com.app.services.Readerimpl;
import com.app.services.FileReader;

public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("create a object of all methods ");
		FileProcessorImpl interchage = new FileProcessor();
		interchage.datachange();
		Readerimpl read = new FileReader();
		read.reader();
		DocWriterimpl writee = ()-> {
			try {
			Writer wr = new FileWriter("C:\\Users\\darsh\\OneDrive\\Desktop\\dsp1.txt");
			String s = "this is writer class darshan class le kachuko le";
			wr.write(s);
			wr.close();}
			catch (Exception e) {
				System.out.println(e);
			}
		};
		writee.docWriter();
		
	}
}
