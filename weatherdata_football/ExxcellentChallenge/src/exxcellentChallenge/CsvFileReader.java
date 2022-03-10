package exxcellentChallenge;

import java.io.*;
import java.util.ArrayList;



//class for reading the csv file and saving the lines in an array
public class CsvFileReader {
	
	private String m_csvFile;
	private ArrayList<String> m_lines = new ArrayList<String>();
		
	
	public void readFile() {
		
		BufferedReader fileReader;
		try {
			fileReader = new BufferedReader(new FileReader(m_csvFile));
			String currentLine = fileReader.readLine();
			currentLine = fileReader.readLine(); //Skip Header
			while (currentLine != null) {
				//System.out.println(currentLine);
				m_lines.add(currentLine);
				currentLine = fileReader.readLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		//Check content of array
		for (String str : m_lines) {
			System.out.println(str);
		}
		*/
				
	}
	
	public ArrayList<String> getArrLines() {
		return m_lines;
	}
	
	
	public CsvFileReader(String file) {
		m_csvFile = file;
	}
	
}
