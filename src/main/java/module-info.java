module com.example.mycontacts {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.example.mycontacts to javafx.fxml;
    opens com.example.mycontacts.datamodel;
    exports com.example.mycontacts;

}