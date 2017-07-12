package hu.neuron.java.intern.runtimeanalyzer;

import java.util.List;

import org.jfree.ui.RefineryUtilities;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	JsonReader jsonr = new JsonReader();
    	List visualizationList = jsonr.getList("visualizationList");
    	for (Object object : visualizationList) {
			if(object.toString().equals("txt")){
				TxtMaker writer = new TxtMaker();
				writer.writer("Szia");
			}
			if(object.toString().equals("chart")){

		    	final ChartMaker demo = new ChartMaker("Szia");
				demo.pack();
				RefineryUtilities.centerFrameOnScreen(demo);
				demo.setVisible(true);
			}
		}
    }
    
}
