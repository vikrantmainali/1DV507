package vm222cv_assign1;

import java.util.List;
import java.util.ArrayList;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries.XYSeriesRenderStyle;

public class SinMain 
{
	public static void main (String[] args)
	{
	    XYChart chart = new XYChartBuilder().width(800).height(600).build();
	    chart.getStyler().setDefaultSeriesRenderStyle(XYSeriesRenderStyle.Line);
	    chart.getStyler().setMarkerSize(5);
	    
	    List<Double> xData = new ArrayList<Double>();
	    List<Double> yData = new ArrayList<Double>();
	    
	    for (double x = 0; x <= Math.PI*2; x+=0.001)
	    {
	    	double y = (1 + (x/Math.PI)) * Math.cos(x) * Math.cos(40*x);
	    	
	    	xData.add(x);
	    	yData.add(y);
	    }
	    
	    
	    chart.addSeries("Trigonometric curve", xData, yData);
	   
	    new SwingWrapper<XYChart>(chart).displayChart();
	}
}
