package exxcellentChallenge;

import java.util.ArrayList;


public abstract class StringPreparator {
	protected ArrayList<String> m_arrLines = new ArrayList<String>();
	
	//working with templates could be useful to cover floats etc.
	protected ArrayList<String> m_arrIdentifier = new ArrayList<String>(); //first column in csv files
	protected ArrayList<Integer> m_arrMaxValue = new ArrayList<Integer>();
	protected ArrayList<Integer> m_arrMinValue = new ArrayList<Integer>();
	
	
	public abstract void splitStringsConvertToInt();
	
	
	public ArrayList<String> getArrIdentifier() {
		return m_arrIdentifier;
	}
	
	public ArrayList<Integer> getArrMaxValue() {
		return m_arrMaxValue;
	}
	
	public ArrayList<Integer> getArrMinValue() {
		return m_arrMinValue;
	}
	
	
	//Constructor awaiting an ArrayList
	public StringPreparator(ArrayList<String> p_arrLines) {
		this.m_arrLines = p_arrLines;
	}

//discarded
	
	//leaves only the important data in the array, only "useful" for weather.csv
	//actually unecessary
	/*
	public void removeEnding() {
		int i = 0;
		for (String str : m_arrLines) {
				str = str.substring(0, HelperMethods.deleteStringAfterNthOccurenceOf(str, ",", 3)); 
				m_arrLines.set(i, str); //replaces the full information string at position i with the new substring (= relevant information)
				++i;
		}
		//check content of array
		
		//for (String str : m_lines) {
		//	System.out.println(str);
		//}
	}
	*/
	
}
