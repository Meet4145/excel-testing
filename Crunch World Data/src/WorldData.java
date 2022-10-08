import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WorldData {

	public static void main(String[] args) throws FileNotFoundException {

		File f = new File("2010WorldData.csv");

		String[] dataLine;
		double sum = 0;
		double Internet_sum = 0;

		Scanner s = new Scanner(f);
		s.nextLine();
		while (s.hasNext()) {

			dataLine = s.nextLine().split(",");
			if (dataLine[0].equals("Euro area")) {
			} else {
				sum += Double.parseDouble(dataLine[19]);
			}
		}

		System.out.println("The population of world is: " + sum + " millions");

		Scanner s1 = new Scanner(f);
		s1.nextLine();
		while (s1.hasNext()) {
			dataLine = s1.nextLine().split(",");
			if (dataLine[14].equals("")) {
			} else if (dataLine[0].equals("Euro area")) {
			} else {
				Internet_sum += Double.parseDouble(dataLine[14]);
				;
			}

		}
		System.out.println("The average of internet users percent of population of all of the countries is: "
				+ (Internet_sum / 197) + " percent");

		Scanner s2 = new Scanner(f);
		s2.nextLine();
		System.out.println("Countries in the file are: ");
		for(int i=1; i<199; i++) {
			dataLine = s2.nextLine().split(",");
			System.out.println(i + ". " + dataLine[0]);
		}

	}

}