
package com.app.services;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class DocWriter implements DocWriterimpl {

	@Override
	public void docWriter() throws IOException {
		Writer wr = new FileWriter("C:\\Users\\darsh\\OneDrive\\Desktop\\dsp1.txt");
		String s = "this is writer class darshan class le kachuko le";
		wr.write(s);
		wr.close();

	}

}
