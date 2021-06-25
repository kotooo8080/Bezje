package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import models.Bezje;
import models.Line;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

public class ControllerMyForm {
    @FXML
    private Button buttonOK;
    @FXML
    private TextField pointX1;
    @FXML
    private TextField pointX2;
    @FXML
    private TextField pointX3;
    @FXML
    private TextField pointX4;
    @FXML
    private TextField pointY1;
    @FXML
    private TextField pointY2;
    @FXML
    private TextField pointY3;
    @FXML
    private TextField pointY4;
    @FXML
    private Canvas drawArea;
    @FXML
    private Pane mainPane;
    @FXML
    private Label queLabel;

    public void clckOK(ActionEvent actionEvent) throws Exception {
        WritableImage im = new WritableImage(500, 500);
        PixelWriter pw = im.getPixelWriter();

        Line first = new Line(Integer.parseInt(pointX1.getText()), Integer.parseInt(pointY1.getText()), Integer.parseInt(pointX2.getText()), Integer.parseInt(pointY2.getText()));
        Line second = new Line(Integer.parseInt(pointX2.getText()), Integer.parseInt(pointY2.getText()), Integer.parseInt(pointX3.getText()), Integer.parseInt(pointY3.getText()));
        Line third = new Line(Integer.parseInt(pointX3.getText()), Integer.parseInt(pointY3.getText()), Integer.parseInt(pointX4.getText()), Integer.parseInt(pointY4.getText()));
        drawArea.setHeight(500);
        drawArea.setWidth(500);
        GraphicsContext gr = drawArea.getGraphicsContext2D();
        gr.clearRect(0, 0, drawArea.getWidth(), drawArea.getHeight());
        gr.setLineWidth(1.0);
        gr.setStroke(Color.BLUE);
        gr.beginPath();
        gr.moveTo(first.getX1(), first.getY1());
        gr.lineTo(first.getX2(), first.getY2());
        gr.lineTo(third.getX1(), third.getY1());
        gr.lineTo(third.getX2(), third.getY2());
        gr.stroke();
        gr.closePath();
        Bezje curve = new Bezje(first, third);
        curve.Draw(gr);

    }
}