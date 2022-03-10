package exxcellentChallenge;

import java.util.ArrayList;

public class ComparatorWeather extends Comparator {

	@Override
	public int getSmallestDifference() {
		{
			for (int i = 0; i < m_arrIdentifier.size(); ++i) {
				difference = m_arrMaxValue.get(i) - m_arrMinValue.get(i);
				if (i == 0) {
					posSmallestDifference = 0;
					currentSmallestDifference = difference;
				}
				else {
					if (difference < currentSmallestDifference) {
						currentSmallestDifference = difference;
						posSmallestDifference = i;
					}
				}
			}
			return posSmallestDifference;
		}
	}

	@Override
	public void print() {
		System.out.println("Day with smallest temperature spread: Day " + m_arrIdentifier.get(getSmallestDifference())); 
	}
	
	public ComparatorWeather(ArrayList<String> p_arrIdentifier, ArrayList<Integer> p_arrMaxValue, ArrayList<Integer> p_arrMinValue) {
		super(p_arrIdentifier, p_arrMaxValue, p_arrMinValue);
	}
	
}
