package exxcellentChallenge;

import java.util.ArrayList;

public class ComparatorFootball extends Comparator {

	@Override
	protected int getSmallestDifference() {
		{
			for (int i = 0; i < m_arrIdentifier.size(); ++i) {
				difference = m_arrMaxValue.get(i) - m_arrMinValue.get(i);
				difference = Math.abs(difference);
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
	protected void print() {
		System.out.println("Team with least difference of scored and allowed goals: " + m_arrIdentifier.get(getSmallestDifference())); 

	}

	public ComparatorFootball(ArrayList<String> p_arrIdentifier, ArrayList<Integer> p_arrMaxValue, ArrayList<Integer> p_arrMinValue) {
		super(p_arrIdentifier, p_arrMaxValue, p_arrMinValue);	
	}
	
}
