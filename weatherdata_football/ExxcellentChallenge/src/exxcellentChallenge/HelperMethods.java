package exxcellentChallenge;

public abstract class HelperMethods {

	//Method for finding the in this case 3rd comma so the unimportant information can be deleted
	//depraved
	public static int deleteStringAfterNthOccurenceOf (String str, String substr, int n) {
		int pos = str.indexOf(substr);
		//if ... and substr was found in str
		while ((--n > 0) && (pos != -1)) {
			//find substr in str after first occurence, repeat until nth occurence is found (starting from the next char after pos)
			pos = str.indexOf(substr, pos + 1);
		}
		return pos;
	}
	
	
}


