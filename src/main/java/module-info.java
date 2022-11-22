module com.example.bodymassindex {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bodymassindex to javafx.fxml;
    exports com.example.bodymassindex;
}