package es.luixal.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.jsefa.Serializer;
import org.jsefa.csv.CsvIOFactory;

public class Main {
	
	public static void main(String[] args) {
		
		final String OUTPUT_FILENAME = "output.csv";
		
		// showing message and exiting when arguments are invalid:
		if (!validArguments(args)) {
			System.out.println("Usage: convert <filename>\n");
			return;
		}
		// reading and parsing items from text file:
		final String filename = args[0];
		final String outputFilename = (args.length > 1) ? args[1] : OUTPUT_FILENAME;
		
		try {
			// opening reading buffer:
			BufferedReader br = new BufferedReader(new FileReader(filename));
			// opening file writer and creating serializer:
			FileWriter fw = new FileWriter(outputFilename);
			Serializer serializer = CsvIOFactory.createFactory(Item.class).createSerializer();
			serializer.open(fw);
			// writing output header:
			serializer.write(Item.headerObject());
			
			// aux variables:
			String line;
			int counter = 0;
			ArrayList<String> lines = new ArrayList<String>(19);
			
			// reading text line, parsing item, serializing item to CSV format, and writing it:
			System.out.println("Converting file " + filename + "...");
			while ( (line = br.readLine()) != null ) {
				if (!line.isEmpty()) lines.add(line);
				if (line.isEmpty() || line == null) {
					if (!lines.isEmpty()) serializer.write(Item.fromTextLines(lines));
					lines.clear();
					counter++;
					System.out.print("\r" + counter + " items processed");
					System.out.flush();
				}
			}
			System.out.println("\nFile converted. Output file is " + outputFilename);
			// closing writer:
			fw.close();
			// closing buffered reader:
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File " + filename + " not found!\n");
		}
		catch (IOException e) {
			System.out.println("ERROR: File " + filename + " could not be read!\n");
		}
	}
	
	private static boolean validArguments(String[] args) {
		return args.length > 0;
	}

}
