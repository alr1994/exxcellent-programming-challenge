package exxcellentChallenge;

import java.util.ArrayList;

//class for calculating the difference of min/max temperature and comparison with the currently detected smallest difference
public abstract class Comparator {
	
	//again, working with templates would make sense in real use case
	protected ArrayList<String> m_arrIdentifier;
	protected ArrayList<Integer> m_arrMaxValue, m_arrMinValue;
	
	protected int difference = 0; 
	protected int posSmallestDifference = 0; 
	protected int currentSmallestDifference = 0; //Larger than the largest sensible difference
	
	protected abstract int getSmallestDifference();
	
	protected abstract void print(); 
	
	
	public Comparator (ArrayList<String> p_arrIdentifier, ArrayList<Integer> p_arrMaxValue, ArrayList<Integer> p_arrMinValue) {
		this.m_arrIdentifier = p_arrIdentifier;
		this.m_arrMaxValue = p_arrMaxValue;
		this.m_arrMinValue = p_arrMinValue;
		
	}
}
