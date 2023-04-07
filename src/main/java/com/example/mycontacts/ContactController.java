package com.example.mycontacts;

import com.example.mycontacts.datamodel.Contact;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ContactController {
    //Responsible for retrieving data from the dialog pane and
    //creates contact object

    //    ----------------------------Fields--------------------------------
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField phoneNumberField;
    @FXML
    private TextField noteField;

    //--------------------------------Methods------------------------------
    @FXML
    public Contact getNewContact(){
        //retrieves actual data entered and use to create new contact object

        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String phoneNumber = phoneNumberField.getText();
        String notes = noteField.getText();

        //create contact object
        //can add validation (for non-empty information)
        Contact newContact = new Contact(firstName, lastName,
                phoneNumber,notes);
        return newContact;
    }

    public void editContact (Contact contact) {
        //populate edit dialog pane with required information for editing
        firstNameField.setText(contact.getFirstName());
        lastNameField.setText(contact.getLastName());
        phoneNumberField.setText(contact.getPhoneNumber());
        noteField.setText(contact.getNotes());
    }

    public void updateContact (Contact contact) {
        //Updating contact lists at edit dialog
        contact.setFirstName(firstNameField.getText());
        contact.setLastName(lastNameField.getText());
        contact.setPhoneNumber(phoneNumberField.getText());
        contact.setNotes(noteField.getText());
    }
}
