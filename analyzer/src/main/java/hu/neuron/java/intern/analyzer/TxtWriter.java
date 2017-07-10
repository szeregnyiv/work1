package hu.neuron.java.intern.analyzer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TxtWriter {
	
	public void writer(List list){
		BufferedWriter bw = null;
		FileWriter fw = null;
		

		try {

			fw = new FileWriter("C:\\Users\\szeregnyiv\\work\\metodusIdok\\idok.txt");
			bw = new BufferedWriter(fw);
				for (Object object : list) {
					bw.write(object + "       ");
					bw.newLine();
				}
				
				bw.newLine();

		} catch (IOException e) {

			e.printStackTrace();

		} finally {
			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		System.out.println("Játék vége!");
	}
}
