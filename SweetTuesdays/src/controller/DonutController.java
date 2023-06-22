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

public class DonutController implements Initializable {

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
       
         // ============== BAVARIAN CREAM FILLED ==================//
        name1.setText(LoginController.bavarian.getProductName());
        price1.setText(Double.toString(LoginController.bavarian.getProductPrice()));
        Image Bavarian = new Image(LoginController.bavarian.getProductImage());
        img1.setImage(Bavarian);

         // ============== CHOCO FROSTED DONUT ==================//
        name2.setText(LoginController.cFrost.getProductName());
        price2.setText(Double.toString(LoginController.cFrost.getProductPrice()));
        Image chocoFrost = new Image(LoginController.cFrost.getProductImage());
        img2.setImage(chocoFrost);

         // ============== CHURROS ==================//
        name3.setText(LoginController.churros.getProductName());
        price3.setText(Double.toString(LoginController.churros.getProductPrice()));
        Image Churros = new Image(LoginController.churros.getProductImage());
        img3.setImage(Churros);

         // ============== CINNAMON TWIST ==================//
        name4.setText(LoginController.cTwist.getProductName());
        price4.setText(Double.toString(LoginController.cTwist.getProductPrice()));
        Image cinnamonTwist = new Image(LoginController.cTwist.getProductImage());
        img4.setImage(cinnamonTwist);

         // ============== GLAZED DONUTS ==================//
        name5.setText(LoginController.gDonuts.getProductName());
        price5.setText(Double.toString(LoginController.gDonuts.getProductPrice()));
        Image glazedDonut = new Image(LoginController.gDonuts.getProductImage());
        img5.setImage(glazedDonut);

         // ============== PEANUT BUTTER DONUTS ==================//
        name6.setText(LoginController.pbDonut.getProductName());
        price6.setText(Double.toString(LoginController.pbDonut.getProductPrice()));
        Image pbDonuts = new Image(LoginController.pbDonut.getProductImage());
        img6.setImage(pbDonuts);
    
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

        AlertMaker.showSimpleAlert("Sweet Tuesdays", "Item added");

        Button sourceButton = (Button) event.getSource();

        // If cart button is pressed, set product status to true
        if (sourceButton.equals(cart1)) {
            LoginController.bavarian.setProductStatus(true);
            LoginController.bavarian.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane13);
        }

        else if (sourceButton == cart2) {
            LoginController.cFrost.setProductStatus(true);
            LoginController.cFrost.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane14);
        }

        else if (sourceButton == cart3) {
            LoginController.churros.setProductStatus(true);
            LoginController.churros.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane15);
        }
        else if (sourceButton == cart4) {
            LoginController.cTwist.setProductStatus(true);
            LoginController.cTwist.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane16);
        }
        else if (sourceButton == cart5) {
            LoginController.gDonuts.setProductStatus(true);
            LoginController.gDonuts.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane17);
        }
        else if (sourceButton == cart6) {
            LoginController.pbDonut.setProductStatus(true);
            LoginController.pbDonut.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane18);
        }

        LoginController.cart.showItems();
    }

public void fave(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Sweet Tuesdays", "Added to Favorites");

        Button sourceButton = (Button) event.getSource();

        // If cakeCart button is pressed, set product status to true
        if (sourceButton.equals(fave1)) {
            LoginController.bavarian.setProductStatus(true);
            LoginController.bavarian.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane13);
        }

        else if (sourceButton == fave2) {
            LoginController.cFrost.setProductStatus(true);
            LoginController.cFrost.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane14);
        }

        else if (sourceButton == fave3) {
            LoginController.churros.setProductStatus(true);
            LoginController.churros.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane15);
        }
        else if (sourceButton == fave4) {
            LoginController.cTwist.setProductStatus(true);
            LoginController.cTwist.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane16);
        }
        else if (sourceButton == fave5) {
            LoginController.gDonuts.setProductStatus(true);
            LoginController.gDonuts.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane17);
        }
        else if (sourceButton == fave6) {
            LoginController.pbDonut.setProductStatus(true);
            LoginController.pbDonut.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane18);
        }

        LoginController.fave.showItems();
    }


    

}
