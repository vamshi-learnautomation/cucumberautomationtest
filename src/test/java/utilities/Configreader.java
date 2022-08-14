package utilities;


import java.io.FileReader;

import java.util.Properties;

public class Configreader {
	
	FileReader file;
	Properties prop;
	
	public void read_propdetails() throws Exception
	{
		file=new FileReader("C:\\Users\\Namaswi V\\eclipse-workspace\\cucumberautomation\\src\\test\\java\\properties\\config.properties");
     	prop= new Properties();
     	prop.load(file);
	}
	
	public String get_browser() throws Exception
	{
		read_propdetails();
     	String browser= prop.getProperty("browser");
		return browser;
				      
	}
	public String get_url() throws Exception
	{
		read_propdetails();
		String url=prop.getProperty("url");
		return url;
		
	}
}
