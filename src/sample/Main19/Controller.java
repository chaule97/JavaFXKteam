package sample.Main19;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField CSharpID, JavaID, PythonID;
    @FXML
    PieChart pieChart;

    public void load (ActionEvent e){
        try{
            int CSharpValue = Integer.parseInt(CSharpID.getText());
            int JavaValue = Integer.parseInt(JavaID.getText());
            int PythonValue = Integer.parseInt(PythonID.getText());
            PieChart.Data CSharp = new PieChart.Data("C#", CSharpValue);
            PieChart.Data Java = new PieChart.Data("Java", JavaValue);
            PieChart.Data Python = new PieChart.Data("Python", PythonValue);
            pieChart.getData().clear();
            pieChart.getData().addAll(CSharp, Java, Python);
        }catch (Exception ex){

        }
    }
}
