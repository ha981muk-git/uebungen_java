module com.mycompany.mediaplayer {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.mediaplayer to javafx.fxml;
    exports com.mycompany.mediaplayer;
}
