package exxcellentChallenge;

import java.util.ArrayList;

public class StringPreparatorWeather extends StringPreparator {

	@Override
	public void splitStringsConvertToInt() {		
		for (String str : m_arrLines)  {
			
			String[] splitList = new String[14];//more or less consistent size -> pure array, could be replaced with (Array)List to support files with more columns
			splitList = str.split(","); //fills splitList with the separated contents of str 
						
			m_arrIdentifier.add(splitList[0]);
			m_arrMaxValue.add(Integer.parseInt(splitList[1]));
			m_arrMinValue.add(Integer.parseInt(splitList[2]));
		}
				
		//check correctness of arrays
		/*
		for (int i = 0; i < m_arrIdentifier.size(); ++i) {
			System.out.print("Tag: " + m_arrIdentifier.get(i) + ", TempMax: " + m_arrMaxValue.get(i) + ", TempMin: " + m_arrMinValue.get(i) + "\n");
		}
		*/
	}
	
	
	public StringPreparatorWeather(ArrayList<String> p_arrLines) {
		super(p_arrLines);
	}

}
