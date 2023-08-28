package com.example.emailappjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private TextField firstNameTextField, lastNameTextField, departamentCodeTextField, passwordtextField, emailTextField;
    @FXML
    private ImageView icon;
    Image image = new Image("D:\\Proiecte\\Java\\Java Projects\\Basic Projects\\EmailAppJavaFX\\src\\main\\resources\\user.png");

    private void displayImage(){
        icon.setImage(image);
    }

    @FXML
    private void generateEmailPass(ActionEvent e){
        final String firstName = firstNameTextField.getText();
        final String lastname = lastNameTextField.getText();
        final int code = Integer.parseInt(departamentCodeTextField.getText());
        final String departament;

        switch (code){
            case 1 -> departament = "sales";
            case 2 -> departament = "development";
            case 3 -> departament = "accounting";
            default -> departament = "other";
        }

        emailTextField.setText(firstName.toLowerCase() + lastname.toLowerCase() + departament + "@EasyCompany.com");

        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@$#%";
        char[] password = new char[10];
        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        passwordtextField.setText(new String(password));

    }

    @FXML
    private void reset(ActionEvent e){

        emailTextField.setText("");
        passwordtextField.setText("");
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        departamentCodeTextField.setText("");



    }

}