package hrm.OrnageProject.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadData {
 public static String  getData(String filename,String key) throws Exception {
	String filelocation="C:\\Users\\bokka\\eclipse-workspace\\HRMPROJECT123\\Resources\\"+filename+".properties";
	FileInputStream inputStream=new FileInputStream(filelocation);
	Properties pro=new Properties();
	pro.load(inputStream);
	return pro.getProperty(key);
 }
}
