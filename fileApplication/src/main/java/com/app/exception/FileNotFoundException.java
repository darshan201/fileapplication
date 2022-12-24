package com.app.exception;

@SuppressWarnings("serial")
public class FileNotFoundException extends Exception {
	FileNotFoundException(String msg) {
		super(msg);
	}
}
