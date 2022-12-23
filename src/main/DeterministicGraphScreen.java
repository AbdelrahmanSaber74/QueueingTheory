package main;
import com.sun.javafx.application.PlatformImpl;
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Pair;
public class DeterministicGraphScreen {
    public static void display(ArrayList<Pair<Integer, Integer>> nOfTPoints, int nOfTMaxXValue, int nOfTMaxYValue, ArrayList<Pair<Integer, Double>> wqOfNPoints, int wqOfNMaxXValue, int wqOfNMaxYValue) {
        PlatformImpl.startup(new Runnable() {
            @Override
            public void run() {
                VBox root = new VBox();

                NumberAxis xAxis = new NumberAxis("t", 0, nOfTMaxXValue, 1);
                NumberAxis yAxis = new NumberAxis("n(t)", 0, nOfTMaxYValue, 1);
                AreaChart<Number, Number> areaChart = new AreaChart(xAxis, yAxis);
                XYChart.Series series = new XYChart.Series();
                Pair<Integer, Integer> nOfTLastPoint = nOfTPoints.get(0);
                for(Pair<Integer, Integer> point : nOfTPoints)
                {
                    series.getData().add(new XYChart.Data(point.getKey(), nOfTLastPoint.getValue()));
                    series.getData().add(new XYChart.Data(point.getKey(), point.getValue()));
                    nOfTLastPoint = point;
                }
                series.setName("Number of Customers at Time t");
                areaChart.getData().addAll(series);
                root.getChildren().add(areaChart);

                xAxis = new NumberAxis("n", 0, wqOfNMaxXValue, 1);
                yAxis = new NumberAxis("Wq(n)", 0, wqOfNMaxYValue, 1);
                areaChart = new AreaChart(xAxis, yAxis);
                series = new XYChart.Series();
                Pair<Integer, Double> wqOfNLastPoint = wqOfNPoints.get(0);
                for(Pair<Integer, Double> point : wqOfNPoints)
                {
                    series.getData().add(new XYChart.Data(point.getKey(), wqOfNLastPoint.getValue()));
                    series.getData().add(new XYChart.Data(point.getKey(), point.getValue()));
                    wqOfNLastPoint = point;
                }
                series.setName("Waiting Time of the n-th Customer");
                areaChart.getData().addAll(series);
                root.getChildren().add(areaChart);

                Scene scene  = new Scene(root, 800, 800);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            }
        });
        PlatformImpl.setImplicitExit(false);
    }
}