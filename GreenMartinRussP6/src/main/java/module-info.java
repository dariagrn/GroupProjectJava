module com.cis2235.greenmartinrussp6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.cis2235.greenmartinrussp6 to javafx.fxml;
    exports com.cis2235.greenmartinrussp6;
}