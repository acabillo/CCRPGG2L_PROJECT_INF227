package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CakeController implements Initializable {

    @FXML
    ImageView img1, img2, img3, img4, img5, img6;

    @FXML
    Button cartButton, homeButton, cakeButton, cookieButton, donutButton, pastryButton, toolButton, equipButton, faveButton,
    fave1, fave2, fave3, fave4, fave5, fave6, 
    cart1, cart2, cart3, cart4, cart5, cart6;

    @FXML
    Label price1, price2, price3, price4, price5, price6, 
    name1, name2, name3, name4, name5, name6; 

    @FXML
    CheckoutController checkoutController = null;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    static Parent root = null;
    FXMLLoader loader;

    @FXML 
    static FaveController faveController = null;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
        // ============== BLACK FOREST ==================//
        name1.setText(LoginController.bForest.getProductName());
        price1.setText(Double.toString(LoginController.bForest.getProductPrice()));
        Image blackforest = new Image(LoginController.bForest.getProductImage());
        img1.setImage(blackforest);

         // ============== CHEESEimg ==================//
        name2.setText(LoginController.cheese.getProductName());
        price2.setText(Double.toString(LoginController.cheese.getProductPrice()));
        Image cheese = new Image(LoginController.cheese.getProductImage());
        img2.setImage(cheese);

         // ============== CHOCO MUD CUPimg ==================//
        name3.setText(LoginController.chocoCC.getProductName());
        price3.setText(Double.toString(LoginController.chocoCC.getProductPrice()));
        Image chocomudcupcake = new Image(LoginController.chocoCC.getProductImage());
        img3.setImage(chocomudcupcake);

         // ============== COFFEE CAKE ==================//
        name4.setText(LoginController.cCake.getProductName());
        price4.setText(Double.toString(LoginController.cCake.getProductPrice()));
        Image coffeecake = new Image(LoginController.cCake.getProductImage());
        img4.setImage(coffeecake);

         // ============== RED VELVET ==================//
        name5.setText(LoginController.redCC.getProductName());
        price5.setText(Double.toString(LoginController.redCC.getProductPrice()));
        Image redvelvet = new Image(LoginController.redCC.getProductImage());
        img5.setImage(redvelvet);

         // ============== TIRAMISU ==================//
        name6.setText(LoginController.tiramisu.getProductName());
        price6.setText(Double.toString(LoginController.tiramisu.getProductPrice()));
        Image tiramisuu = new Image(LoginController.tiramisu.getProductImage());
        img6.setImage(tiramisuu);
        
    }
    

    public void buy(ActionEvent event) throws IOException {

       AlertMaker.showSimpleAlert("Sweet Tuesdays", "Item added");
        Button sourceButton = (Button) event.getSource();

        // If cart button is pressed, set product status to true
        if (sourceButton.equals(cart1)) {
            System.out.println("bought black forest");
            LoginController.bForest.setProductStatus(true);
            LoginController.bForest.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane1);
        }

        else if (sourceButton == cart2) {
            LoginController.cheese.setProductStatus(true);
            LoginController.cheese.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane2);
        }

        else if (sourceButton == cart3) {
            LoginController.chocoCC.setProductStatus(true);
            LoginController.chocoCC.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane3);
        }
        else if (sourceButton == cart4) {
            LoginController.cCake.setProductStatus(true);
            LoginController.cCake.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane4);
        }
        else if (sourceButton == cart5) {
            LoginController.redCC.setProductStatus(true);
            LoginController.redCC.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane5);
        }
        else if (sourceButton == cart6) {
            LoginController.tiramisu.setProductStatus(true);
            LoginController.tiramisu.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane6);
        }

        LoginController.cart.showItems();
    }
    
    // Goes to Cakes.fxml
    public void gotocakes(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Cakes.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Cookies.fxml
    public void gotocookies(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Cookies.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Donuts.fxml
    public void gotodonuts(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Donuts.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Pastry.fxml
    public void gotopastry(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Pastry.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Tools.fxml
    public void gototools(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Tools.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Equipment.fxml
    public void gotoequip(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Equipment.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Favorite.fxml
    public void gotofaves (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Favorites.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Credits.fxml
    public void gotocredits (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/About.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Home.fxml
    public void gotohome (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Checkout.fxml
    public void gotocart(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Checkout.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    

    public void fave(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Sweet Tuesdays", "Added to Favorites");

        Button sourceButton = (Button) event.getSource();

        // If cakeCart button is pressed, set product status to true
        if (sourceButton.equals(fave1)) {
            LoginController.bForest.setProductStatus(true);
            LoginController.bForest.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane1);
        }

        else if (sourceButton == fave2) {
            LoginController.cheese.setProductStatus(true);
            LoginController.cheese.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane2);
        }

        else if (sourceButton == fave3) {
            LoginController.chocoCC.setProductStatus(true);
            LoginController.chocoCC.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane3);
        }
        else if (sourceButton == fave4) {
            LoginController.cCake.setProductStatus(true);
            LoginController.cCake.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane4);
        
        }
        else if (sourceButton == fave5) {
            LoginController.redCC.setProductStatus(true);
            LoginController.redCC.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane5);
        }
        else if (sourceButton == fave6) {
            LoginController.tiramisu.setProductStatus(true);
            LoginController.tiramisu.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane6);
        }

        LoginController.fave.showItems();
    }
}