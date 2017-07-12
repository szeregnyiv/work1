package hu.neuron.java.intern.runtimeanalyzer;

import java.awt.Color;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class ChartMaker extends ApplicationFrame {

	public ChartMaker(String title) {
		super(title);
		JsonReader jsonr = new JsonReader();
		String size = jsonr.elementSize();
		List implementsList = jsonr.getList("implementsList");
		List methodsList = jsonr.getList("methodsList");
		List parametersList = jsonr.getList("parametersList");
		Methods tK= new Methods();
    	Long[] time = tK.setMethodBlock();
		final CategoryDataset dataset1 = createDataset1(implementsList, methodsList, time);
		// create the chart...
		final JFreeChart chart = ChartFactory.createBarChart("Running times", // chart
																				// title
				"Category", // domain axis label
				"Value", // range axis label
				dataset1, // data
				PlotOrientation.VERTICAL, true, // include legend
				true, // tooltips?
				false // URL generator? Not required...
		);

		// NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...
		chart.setBackgroundPaint(Color.white);
		// chart.getLegend().setAnchor(Legend.SOUTH);

		// get a reference to the plot for further customisation...
		final CategoryPlot plot = chart.getCategoryPlot();
		plot.setBackgroundPaint(new Color(0xEE, 0xEE, 0xFF));
		plot.setDomainAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);



		final LineAndShapeRenderer renderer2 = new LineAndShapeRenderer();
		renderer2.setToolTipGenerator(new StandardCategoryToolTipGenerator());
		plot.setRenderer(1, renderer2);
		plot.setDatasetRenderingOrder(DatasetRenderingOrder.REVERSE);
		// OPTIONAL CUSTOMISATION COMPLETED.

		// add the chart to a panel...
		final ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setPreferredSize(new java.awt.Dimension(1000, 500));
		setContentPane(chartPanel);

	}

	public CategoryDataset createDataset1(List listImplements, List methodsList, Long[] times) {

		final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

		int timeindex = 0;
		for (Object obj : listImplements) {
			String object1 = obj + "";
			for (int i = 0; i < methodsList.size(); i++) {
				if(timeindex<times.length){
				String s = times[timeindex].toString();
				Double time = Double.parseDouble(s);
				String methodsName = methodsList.get(i).toString();

				dataset.addValue(time, methodsName, (String) object1);
				timeindex++;
				}
			}
		}

		return dataset;

	}

}