module com.example.tienda {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;


    opens com.example.tienda to javafx.fxml;
    exports com.example.tienda;
    exports com.example.tienda.Controllers;
    exports com.example.tienda.Controllers.Admin;
    exports com.example.tienda.Controllers.Client;
    exports com.example.tienda.Models;
    exports com.example.tienda.Views;
}