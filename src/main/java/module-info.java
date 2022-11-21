module com.example.javaformpractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaformpractice to javafx.fxml;
    exports com.example.javaformpractice;
}

/*
    ASSIGNMENT
    Create user models (classes)
    Create interface for our BlackKnight game
    // Knight creation
    // handle view and attack knight
 */