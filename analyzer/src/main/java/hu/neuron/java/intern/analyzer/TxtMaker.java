package hu.neuron.java.intern.analyzer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TxtMaker {

	public void writer(List implementsList, List methodsList, List timesList , String title) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			
			fw = new FileWriter("C:\\Users\\szeregnyiv\\work\\analyzer\\idok.txt");
			bw = new BufferedWriter(fw);
			bw.write(title);
			bw.newLine();
			int timeindex = 0;
			for (Object obj : implementsList) {
				bw.write(obj + "       ");
				bw.newLine();
				System.out.println("ajaj");
				for (int i = 0; i < methodsList.size(); i++) {
					if (timeindex < timesList.size()) {
						bw.write(methodsList.get(i).toString() + "  " + timesList.get(timeindex).toString() + "            ");
						timeindex++;
						System.out.println("ajaj");
					}
				}
				bw.newLine();
			}

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
