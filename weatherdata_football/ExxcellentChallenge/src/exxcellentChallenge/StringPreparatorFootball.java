package exxcellentChallenge;

import java.util.ArrayList;

public class StringPreparatorFootball extends StringPreparator {

	@Override
	public void splitStringsConvertToInt() {		
		for (String str : m_arrLines)  {
			String[] splitList = new String[8];//more or less consistent size -> pure array, could be replaced with (Array)List to support files with more columns
			splitList = str.split(","); //fills splitList with the separated contents of str 
						
			m_arrIdentifier.add(splitList[0]);
			m_arrMaxValue.add(Integer.parseInt(splitList[5]));
			m_arrMinValue.add(Integer.parseInt(splitList[6]));
			}
		/*
		for (int i = 0; i < m_arrIdentifier.size(); ++i) {
			System.out.print("Name: " + m_arrIdentifier.get(i) + ", Goals: " + m_arrMaxValue.get(i) + ", Goals allowed: " + m_arrMinValue.get(i) + "\n");
		}
		*/
	}
	
	public StringPreparatorFootball (ArrayList<String> p_arrLines) {
		super(p_arrLines);
	}

}
