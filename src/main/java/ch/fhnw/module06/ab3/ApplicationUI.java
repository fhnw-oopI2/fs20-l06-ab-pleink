package ch.fhnw.module06.ab3;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import java.util.stream.Stream;

public class ApplicationUI extends BorderPane {

    private TextArea textArea;
    private Button buttonTop;
    private Button buttonLeft;
    private Button buttonRight;
    private Button buttonBottom;

    public ApplicationUI(){
        initializeControls();
        layoutControls();
    }

    private void initializeControls(){
        textArea = new TextArea("text area");
        buttonTop = new Button("Top");
        buttonLeft = new Button("Left");
        buttonRight = new Button("Right");
        buttonBottom = new Button("Bottom");
    }

    private void layoutControls(){
        setTop(buttonTop);
        setLeft(buttonLeft);
        setRight(buttonRight);
        setBottom(buttonBottom);
        setCenter(textArea);

        buttonTop.setMaxWidth(380d);
        buttonBottom.setMaxWidth(380d);

        setMargin(buttonTop, new Insets(10));
        setMargin(buttonRight, new Insets(0, 10, 0, 10));
        setMargin(buttonLeft, new Insets(0, 10, 0, 10));
        setMargin(buttonBottom, new Insets(10));
    }
}
