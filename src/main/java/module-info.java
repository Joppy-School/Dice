module com.jop.dobbelsteen {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jop.dobbelsteen to javafx.fxml;
    exports com.jop.dobbelsteen;
}