package com.Ransom.EduManage.Controller;

import com.Ransom.EduManage.Model.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SignupFormController {
    private AnchorPane signupcontext;
    private TextField fisttxt;
    private TextField Lasttxt;
    private TextField Emailtxt;
    private PasswordField passwordtxt;
    private PasswordField conformpasswordtxt;



    public void SignUPOnaction(ActionEvent actionEvent) throws IOException {
        String firstname=fisttxt.getText().toLowerCase();
        String lastname=Lasttxt.getText();
        String email=Emailtxt.getText();
        String Password=passwordtxt.getText().trim();
        new User(
                firstname,lastname,email,Password
        );
        new Alert(Alert.AlertType.INFORMATION,"Welcome!!!").show();
        SetUi("LoginForm");

    }

    public void AlreadyOnAction(ActionEvent actionEvent) throws IOException {
        SetUi("SignupForm");
    }



    private void SetUi(String location) throws IOException {
       Stage stage1=(Stage)signupcontext.getScene().getWindow();
       stage1.setScene(new Scene(
               FXMLLoader.load(getClass().getResource("../View/"+location+".fxml"))
       ));
       stage1.centerOnScreen();

   }
}
