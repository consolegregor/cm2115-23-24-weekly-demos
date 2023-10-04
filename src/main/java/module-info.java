module uk.ac.rgu {
    requires transitive javafx.controls;
    requires transitive javafx.fxml;

    opens uk.ac.rgu.topic2 to javafx.fxml;
    exports uk.ac.rgu.topic2;
}
