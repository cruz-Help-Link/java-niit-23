module com.example.makepaint {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.base;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
//    requires eu.hansolo.fx.countries;

//    requires eu.hansolo.tilesfx;
//    requires eu.hansolo.fx.heatmap;
//    requires eu.hansolo.toolboxfx;

    requires com.almasb.fxgl.all;
    requires java.scripting;

    opens com.example.makepaint to javafx.fxml;
    exports com.example.makepaint;
}