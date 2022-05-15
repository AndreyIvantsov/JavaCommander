module com.ivantsov.javacommander {

    opens com.ivantsov.javacommander to javafx.fxml;
    exports com.ivantsov.javacommander;
    
    opens com.ivantsov.javacommander.progress to javafx.fxml;
    exports com.ivantsov.javacommander.progress;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.controls;	
}
