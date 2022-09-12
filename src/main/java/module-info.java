module com.example.javafxl_lesson1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxl_lesson1 to javafx.fxml;
    exports com.example.javafxl_lesson1;
}