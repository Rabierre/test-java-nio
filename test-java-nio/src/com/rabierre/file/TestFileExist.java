package com.rabierre.file;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;

public class TestFileExist {
	public static void main(String []args) throws IOException {
		Path path = FileSystems.getDefault().getPath("/Users/seojihye/Documents/workspace-sts-3.0.0.RELEASE/simple-wiki", "TestFile.txt");
		boolean isFileExist = Files.exists(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
		System.out.println("File Exist? : " + (isFileExist ? "YES" : "NO"));
		
		if(isFileExist == false) {
			Files.createFile(path);
		}
		
		isFileExist = Files.exists(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
		System.out.println("File Exist? : " + (isFileExist ? "YES" : "NO"));
		
	}
}
