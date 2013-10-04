package com.lowcoupling.dono.m2t.dono2msw.main;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.core.resources.IProject;

public class ImgToBase64Encoder {
	static IProject project;
	public static IProject getProject() {
		return project;
	}
	public static void setProject(IProject project) {
		ImgToBase64Encoder.project = project;
	}
	public ImgToBase64Encoder(){
		
	}
	public String encode(String url){
		//project.getFile(url).getRawLocation().makeAbsolute();
		System.out.println(url);
		Path path = Paths.get(project.getFile(url).getRawLocation().makeAbsolute().toOSString());
		String result=project.getFile(url).getRawLocation().makeAbsolute().toOSString();
		byte[] data= null;
		try {
			 data = Files.readAllBytes(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(data!=null){
			result=Base64Coder.encodeLines(data).toString();
		}
		
		return result;
	}
}
