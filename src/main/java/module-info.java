module com.example.hattrick_fileexplorer_java {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.hattrick_fileexplorer_java to javafx.fxml;
    exports com.example.hattrick_fileexplorer_java;
}