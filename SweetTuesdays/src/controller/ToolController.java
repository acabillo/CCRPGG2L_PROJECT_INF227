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

public class ToolController implements Initializable {

    @FXML
    private Button fave1, fave2, fave3, fave4, cart1, 
    cart2, cart3, cart4, cakeButton, cookieButton, donutButton, 
    pastryButton, toolButton, equipButton, faveButton, homeButton, cartbasket;

    @FXML
    private ImageView img1, img2, img3, img4;

    @FXML
    private Label price1, price2, price3, price4,
    name1, name2, name3, name4;

    @FXML
    private Scene scene;
    @FXML
    private Stage stage;

    @FXML
    private Parent root = null;
    FXMLLoader loader;

    @FXML
    CheckoutController checkoutController = null;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
        // ============== BAKING PANS/MOLDS ==================//
        name1.setText(LoginController.bPans.getProductName());
        price1.setText(Double.toString(LoginController.bPans.getProductPrice()));
        Image bakingPan = new Image(LoginController.bPans.getProductImage());
        img1.setImage(bakingPan);

        // ============== MEASURING CUPS ==================//
        name2.setText(LoginController.mCup.getProductName());
        price2.setText(Double.toString(LoginController.mCup.getProductPrice()));
        Image measuringCup = new Image(LoginController.mCup.getProductImage());
        img2.setImage(measuringCup);

        // ============== MIXING BOWLS ==================//
        name3.setText(LoginController.mBowl.getProductName());
        price3.setText(Double.toString(LoginController.mBowl.getProductPrice()));
        Image mixingBowl = new Image(LoginController.mBowl.getProductImage());
        img3.setImage(mixingBowl);

        // ============== PIPING BAG AND TIPS ==================//
        name4.setText(LoginController.pBag.getProductName());
        price4.setText(Double.toString(LoginController.pBag.getProductPrice()));
        Image pipingBag = new Image(LoginController.pBag.getProductImage());
        img4.setImage(pipingBag);

        
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

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        // If cart button is pressed, set product status to true
        if (sourceButton.equals(cart1)) {
            LoginController.bPans.setProductStatus(true);
            LoginController.bPans.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane25);
        }

        else if (sourceButton == cart2) {
            LoginController.mCup.setProductStatus(true);
            LoginController.mCup.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane26);
        }
        
        else if (sourceButton == cart3) {
            LoginController.mBowl.setProductStatus(true);
            LoginController.mBowl.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane27);
        }
        else if (sourceButton == cart4) {
            LoginController.pBag.setProductStatus(true);
            LoginController.pBag.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane28);
        }
      

        LoginController.cart.showItems();
    }


public void fave(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Sweet Tuesdays", "Added to Favorites");

        Button sourceButton = (Button) event.getSource();

        // If cakeCart button is pressed, set product status to true
        if (sourceButton.equals(fave1)) {
            LoginController.bPans.setProductStatus(true);
            LoginController.bPans.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane25);
        }

        else if (sourceButton == fave2) {
            LoginController.mCup.setProductStatus(true);
            LoginController.mCup.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane26);
        }

        else if (sourceButton == fave3) {
            LoginController.mBowl.setProductStatus(true);
            LoginController.mBowl.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane27);
        }
        else if (sourceButton == fave4) {
            LoginController.pBag.setProductStatus(true);
            LoginController.pBag.setProductQuantity(1);
            LoginController.fave.addItem(LoginController.faveController.pane28);
        }
       

        LoginController.fave.showItems();
    }

    

}
