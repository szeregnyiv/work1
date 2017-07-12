package hu.neuron.java.intern.runtimeanalyzer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TxtMaker implements Maker {

	public void maker() {
		
		JsonReader jsonr = new JsonReader();
		List implementsList = jsonr.getList("implementsList");
		List methodsList = jsonr.getList("methodsList");
    	Long[] times = MethodsOperations.setMethodFromJsonFile();
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			
			fw = new FileWriter("C:\\Users\\szeregnyiv\\Desktop\\work1\\runtim\\idok.txt");
			bw = new BufferedWriter(fw);
			bw.newLine();
			int timeindex = 0;
			for (Object obj : implementsList) {
				bw.write(obj + "       ");
				bw.newLine();
				for (int i = 0; i < methodsList.size(); i++) {
					if (timeindex < times.length) {
						bw.write(methodsList.get(i).toString() + "  " + times[timeindex].toString() + "            ");
						timeindex++;
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
