package com.class29;

public  abstract class TaskFile {
	
	public abstract void open();
	public void editmethod()
	{
		System.out.println("this method edits");
	}
	
	public void close()
	{
		System.out.println("this method helps in closing");
	}

}

class JavaFile extends TaskFile
{
	public  void open()
	{
		System.out.println("install notepad++ to open Java file");
	}
}

class WordFile extends TaskFile
{
	public  void open()
	{
		System.out.println("opens the .doc file you need microsoft word");
	}
}

class PdfFile extends TaskFile
{
	public  void open()
	{
		System.out.println("opens the pdf file ");
	}
}