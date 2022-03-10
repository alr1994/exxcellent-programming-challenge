package exxcellentChallenge;

public class Main {

	public static void main(String[] args) {
		
		//simple Strings for input of files, could be replaced for an input class which handles other input methods
		//input strings could be replaced for another class that handles a wider variety of input possibilities
		String weatherCsv = "C:\\\\Users\\\\Alex\\\\Desktop\\\\exxcellent\\\\programming-challenge\\\\src\\\\main\\\\resources\\\\de\\\\exxcellent\\\\challenge\\\\weather.csv";
		String footballCsv = "C:\\\\Users\\\\Alex\\\\Desktop\\\\exxcellent\\\\programming-challenge\\\\src\\\\main\\\\resources\\\\de\\\\exxcellent\\\\challenge\\\\football.csv";
	
		
		CsvFileReader reader = new CsvFileReader(weatherCsv); 
		reader.readFile();
		
		
		StringPreparatorWeather prepWeather = new StringPreparatorWeather(reader.getArrLines());
		prepWeather.splitStringsConvertToInt();
		
		ComparatorWeather compWeather = new ComparatorWeather(prepWeather.getArrIdentifier(), prepWeather.getArrMaxValue(), prepWeather.getArrMinValue());
		compWeather.print();
		
		
		
		reader = new CsvFileReader(footballCsv);
		reader.readFile();
		
		StringPreparatorFootball prepFootball = new StringPreparatorFootball(reader.getArrLines());
		prepFootball.splitStringsConvertToInt();
		
		ComparatorFootball compFootball = new ComparatorFootball(prepFootball.getArrIdentifier(), prepFootball.getArrMaxValue(), prepFootball.getArrMinValue());
		compFootball.print();

	}

}
