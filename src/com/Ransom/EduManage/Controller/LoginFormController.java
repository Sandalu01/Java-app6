package com.Ransom.EduManage.Controller;

import com.Ransom.EduManage.DB.database;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public PasswordField txtPassword;
    public TextField txtEmail;
    public AnchorPane context;

    public void LoginOnaction(ActionEvent actionEvent) {
        String email=txtEmail.getText().toLowerCase();
        String password=txtPassword.getText().trim();
        for (Object user: database.UserTable){
           if (user.equals(email)){
               if (user.equals(password)){
                   System.out.println(user.toString());
                   return;
               }
           }else {
               new Alert(Alert.AlertType.ERROR,"Wrong Password").show();
               return;
           }

        }
        new Alert(Alert.AlertType.WARNING,String.format("User Not Found(%S)",email)).show();


    }

    public void CreateAccOnaction(ActionEvent actionEvent) throws IOException {
        setui("SignupForm");
    }

    public void forgetpwdOnaction(ActionEvent actionEvent) {
    }
   //pass the location ui of the signup form as parameter
    private void setui(String location) throws IOException
    {
        Stage stage=(Stage)context.getScene().getWindow();
        stage.setScene(new Scene(
                FXMLLoader.load(getClass().getResource("../View/"+location+".fxml"))
        ));
        stage.centerOnScreen();

    }

}
