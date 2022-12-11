package com.example.assignment3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Assignment3Controller {

    @FXML
    private ColorPicker colorPicked;

    @FXML
    private Label errorShown;

    @FXML
    private TextField nameOfStudent;

    @FXML
    private Pane color1;

    @FXML
    private Pane color2;

    @FXML
    private Pane color3;

    @FXML
    private Pane color4;

    @FXML
    private Pane color5;

    @FXML
    private Pane color6;

    @FXML
    private Pane color7;

    @FXML
    private Pane color8;

    @FXML
    private Pane color9;

    @FXML
    private Text sName1;

    @FXML
    private Text sName2;

    @FXML
    private Text sName3;

    @FXML
    private Text sName4;

    @FXML
    private Text sName5;

    @FXML
    private Text sName6;

    @FXML
    private Text sName7;

    @FXML
    private Text sName8;

    @FXML
    private Text sName9;



    ArrayList<Integer> arrList = new ArrayList<Integer>(10);

    int count = 0;
    int st = 0;


    int randomFunction(int randomNum) {

        do {
            Random rand = new Random();
            int max = 9;
            int min = 1;
            int range = max - min + 1;
            int r1 = (int) (Math.random() * range) + min;

            if (arrList.contains(r1)) {
                continue;
            } else {
                arrList.add(r1);

                return r1;

            }
        } while (true);
    }


    @FXML
    void onAddStudent(ActionEvent event) {
        Random any = new Random();
        int failure = 0;
        String stuName = nameOfStudent.getText();
        Color color = colorPicked.getValue();

        int randomNum = any.nextInt(1, 10);

        int randNumber = randomFunction(randomNum);


        if (sName1.getText().compareTo(stuName) == 0 || sName2.getText().compareTo(stuName) == 0 || sName3.getText().equals(stuName)
                || sName4.getText().equals(stuName) || sName5.getText().equals(stuName) || sName6.getText().equals(stuName) ||
                sName7.getText().equals(stuName) || sName8.getText().equals(stuName) || sName9.getText().equals(stuName)) {
            failure = 1;
            arrList.remove(arrList.indexOf(randNumber));
        }

        if (color.toString().equals("0xffffffff")) {
            failure = 2;
        }
        if (color1.getStyle().equals("-fx-background-color: #" + color.toString().substring(2)) || color2.getStyle().equals("-fx-background-color: #" + color.toString().substring(2)) ||
        color3.getStyle().equals("-fx-background-color: #" + color.toString().substring(2)) || color4.getStyle().equals("-fx-background-color: #" + color.toString().substring(2)) ||color5.getStyle().equals("-fx-background-color: #" + color.toString().substring(2)) || color6.getStyle().equals("-fx-background-color: #" + color.toString().substring(2))
        || color7.getStyle().equals("-fx-background-color: #" + color.toString().substring(2)) || color8.getStyle().equals("-fx-background-color: #" + color.toString().substring(2))||
        color9.getStyle().equals("-fx-background-color: #" + color.toString().substring(2))) {

            failure = 2;
        }
        if (stuName.isEmpty()) {
            failure = 6;
            errorShown.setText("Please enter name");
            errorShown.setVisible(true);
            arrList.remove(randNumber);
            arrList.remove(arrList.indexOf(randNumber));

        }


        if (failure == 0) {
            count++;
            switch (randNumber) {
                case 1 -> {
                    errorShown.setVisible(false);
                    color1.setStyle("-fx-background-color: #" + color.toString().substring(2));
                    sName1.setText(stuName);
                    sName1.setVisible(true);
                    if (count == 9) {
                        errorShown.setVisible(true);
                        errorShown.setText("CONGRATULATION! SEAT BOOKED");
                        st = 20;
                    }
                }
            }
            switch (randNumber) {
                case 2 -> {
                    errorShown.setVisible(false);
                    color2.setStyle("-fx-background-color: #" + color.toString().substring(2));
                    sName2.setText(stuName);
                    sName2.setVisible(true);
                    if (count == 9) {
                        errorShown.setVisible(true);
                        errorShown.setText("CONGRATULATION! SEAT BOOKED");
                        st = 20;
                    }
                }
            }
            switch (randNumber) {
                case 3 -> {
                    errorShown.setVisible(false);
                    color3.setStyle("-fx-background-color: #" + color.toString().substring(2));
                    sName3.setText(stuName);
                    sName3.setVisible(true);
                    if (count == 9) {
                        errorShown.setVisible(true);
                        errorShown.setText("CONGRATULATION! SEAT BOOKED");
                        st = 20;
                    }
                }
            }
            switch (randNumber) {
                case 4 -> {
                    errorShown.setVisible(false);
                    color4.setStyle("-fx-background-color: #" + color.toString().substring(2));
                    sName4.setText(stuName);
                    sName4.setVisible(true);
                    if (count == 9) {
                        errorShown.setVisible(true);
                        errorShown.setText("CONGRATULATION! SEAT BOOKED");
                        st = 20;
                    }
                }
            }
            switch (randNumber) {
                case 5 -> {
                    errorShown.setVisible(false);
                    color5.setStyle("-fx-background-color: #" + color.toString().substring(2));
                    sName5.setText(stuName);
                    sName5.setVisible(true);
                    if (count == 9) {
                        errorShown.setVisible(true);
                        errorShown.setText("CONGRATULATION! SEATS TAKEN");
                        st = 20;
                    }
                }
            }
            switch (randNumber) {
                case 6 -> {
                    errorShown.setVisible(false);
                    color6.setStyle("-fx-background-color: #" + color.toString().substring(2));
                    sName6.setText(stuName);
                    sName6.setVisible(true);
                    if (count == 9) {
                        errorShown.setVisible(true);
                        errorShown.setText("CONGRATULATION! SEAT BOOKED");
                        st = 20;

                    }
                }
            }
            switch (randNumber) {
                case 7 -> {
                    errorShown.setVisible(false);
                    color7.setStyle("-fx-background-color: #" + color.toString().substring(2));
                    sName7.setText(stuName);
                    sName7.setVisible(true);
                    if (count == 9) {
                        errorShown.setVisible(true);
                        errorShown.setText("CONGRATULATION! SEAT BOOKED");
                        st = 20;
                    }
                }
            }
            switch (randNumber) {
                case 8 -> {
                    errorShown.setVisible(false);
                    color8.setStyle("-fx-background-color: #" + color.toString().substring(2));
                    sName8.setText(stuName);
                    sName8.setVisible(true);
                    if (count == 9) {
                        errorShown.setVisible(true);
                        errorShown.setText("CONGRATULATION! SEAT BOOKED");
                        st = 20;
                    }
                }
            }
            switch (randNumber) {
                case 9 -> {
                    errorShown.setVisible(false);
                    color9.setStyle("-fx-background-color: #" + color.toString().substring(2));
                    sName9.setText(stuName);
                    sName9.setVisible(true);
                    if (count == 9) {
                        errorShown.setVisible(true);
                        errorShown.setText("CONGRATULATION! SEAT BOOKED");

                    }
                }
            }

            System.out.println(count);


        } else if (failure == 1) {
            errorShown.setText("STUDENT NAME ALREADY TAKEN!!");
            errorShown.setStyle("-fx-background-color: rgba(255,0,0,.5)");
            errorShown.setVisible(true);
            arrList.remove((Integer) randNumber);

        } else if (failure == 2) {
            errorShown.setText("COLOR ALREADY TAKEN");
            errorShown.setStyle("-fx-background-color: rgba(255,0,0,.5)");
            errorShown.setVisible(true);
            arrList.remove(arrList.indexOf(randNumber));

        } else {
            errorShown.setVisible(false);
            errorShown.setText("SEATS ARE FULL!!");
            errorShown.setStyle("-fx-background-color: rgba(255,0,0,.5)");
            errorShown.setVisible(true);

        }


    }

    @FXML
    void initialize() {
        for (Text text : Arrays.asList(sName1, sName2, sName3, sName4, sName5, sName6, sName7, sName8, sName9)) {
            text.setVisible(false);
        }
        errorShown.setVisible(false);
    }
}

