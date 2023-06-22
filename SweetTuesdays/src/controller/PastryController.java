package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
// import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class PastryController implements Initializable {

    @FXML
    private Button fave1, fave2, fave3, fave4, fave5, fave6, cart1, 
    cart2, cart3, cart4, cart5, cart6,cakeButton, cookieButton, donutButton, 
    pastryButton, toolButton, equipButton, faveButton, homeButton, cartbasket;

    @FXML
    private ImageView img1, img2, img3, img4, img5, img6;

    @FXML
    private Label price1, price2, price3, price4, price5, price6, 
    name1, name2, name3, name4, name5, name6;

    @FXML
    private Scene scene;
    @FXML
    private Stage stage;

    @FXML
    private Parent root = null;
    FXMLLoader loader;

    @FXML
    static CheckoutController checkoutController = null;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
        // ============== BIBINGKA ==================//
        name1.setText(LoginController.bibingka.getProductName());
        price1.setText(Double.toString(LoginController.bibingka.getProductPrice()));
        Image bibingkaa = new Image(LoginController.bibingka.getProductImage());
        img1.setImage(bibingkaa);

        // ============== CINNAMON ROLL ==================/
        name2.setText(LoginController.cRoll.getProductName());
        price2.setText(Double.toString(LoginController.cRoll.getProductPrice()));
        Image cremebrulee = new Image(LoginController.cRoll.getProductImage());
        img2.setImage(cremebrulee);

        // ============== CINNAMON TWIST ==================/
        name3.setText(LoginController.croissant.getProductName());
        price3.setText(Double.toString(LoginController.croissant.getProductPrice()));
        Image croissantt = new Image(LoginController.croissant.getProductImage());
        img3.setImage(croissantt);

        // ============== EGG TART ==================//
        name4.setText(LoginController.eggTart.getProductName());
        price4.setText(Double.toString(LoginController.eggTart.getProductPrice()));
        Image eggTartt = new Image(LoginController.eggTart.getProductImage());
        img4.setImage(eggTartt);

        // ============== EMPANADA ==================/
        name5.setText(LoginController.empanada.getProductName());
        price5.setText(Double.toString(LoginController.empanada.getProductPrice()));
        Image peanutbutter = new Image(LoginController.empanada.getProductImage());
        img5.setImage(peanutbutter);

        // ============== PANDESAL ==================/
        name6.setText(LoginController.pandesal.getProductName());
        price6.setText(Double.toString(LoginController.pandesal.getProductPrice()));
        Image pandesall = new Image(LoginController.pandesal.getProductImage());
        img6.setImage(pandesall);

         try {
            loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
            root = loader.load();
        } catch (Exception e) {
            // TODO: handle exception
        }

        // Clears all items in Checkout.fxml
        checkoutController = loader.getController();
        checkoutController.myvbox.getChildren().removeAll(checkoutController.myvbox.getChildren());
    }
    


    // Goes to Home.fxml
   public void gotohome(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Cakes.fxml
    public void gotocakes (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Cakes.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Cookies.fxml
    public void gotocookies (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Cookies.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Donuts.fxml
    public void gotodonuts (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Donuts.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Pastry.fxml
    public void gotopastry (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Pastry.fxml"));
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

    // Goes to Tools.fxml
    public void gototools (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Tools.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Equipment.fxml
    public void gotoequip (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Equipment.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Checkout.fxml
    public void gotocart (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Checkout.fxml"));
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

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("hello ", "item added");

        Button sourceButton = (Button) event.getSource();

        // If cart button is pressed, set product status to true
        if (sourceButton.equals(cart1)) {
            LoginController.bibingka.setProductStatus(true);
            LoginController.bibingka.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane19);
        }

        else if (sourceButton == cart2) {
            LoginController.cRoll.setProductStatus(true);
            LoginController.cRoll.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane20);
        }

        else if (sourceButton == cart3) {
            LoginController.croissant.setProductStatus(true);
            LoginController.croissant.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane21);
        }
        else if (sourceButton == cart4) {
            LoginController.eggTart.setProductStatus(true);
            LoginController.eggTart.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane22);
        }
        else if (sourceButton == cart5) {
            LoginController.empanada.setProductStatus(true);
            LoginController.empanada.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane23);
        }
        else if (sourceButton == cart6) {
            LoginController.pandesal.setProductStatus(true);
            LoginController.pandesal.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane24);
        }

        LoginController.cart.showItems();
    }

    public void fave(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Sweet Tuesdays", "Added to Favorites");

        Button sourceButton = (Button) event.getSource();

        // If cakeCart button is pressed, set product status to true
        if (sourceButton.equals(fave1)) {
            LoginController.bibingka.setProductStatus(true);
            LoginController.bibingka.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane19);
        }

        else if (sourceButton == fave2) {
            LoginController.cRoll.setProductStatus(true);
            LoginController.cRoll.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane20);
        }

        else if (sourceButton == fave3) {
            LoginController.croissant.setProductStatus(true);
            LoginController.croissant.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane21);
        }
        else if (sourceButton == fave4) {
            LoginController.eggTart.setProductStatus(true);
            LoginController.eggTart.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane22);
        }
        else if (sourceButton == fave5) {
            LoginController.empanada.setProductStatus(true);
            LoginController.empanada.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane23);
        }
        else if (sourceButton == fave6) {
            LoginController.pandesal.setProductStatus(true);
            LoginController.pandesal.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane24);
        }

        LoginController.fave.showItems();
    }


    

}
