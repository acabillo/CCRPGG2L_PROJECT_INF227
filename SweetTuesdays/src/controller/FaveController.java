package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

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
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FaveController implements Initializable {

    @FXML
    Pane pane1, pane2, pane3, pane4, pane5, pane6, pane7, pane8, pane9, pane10, pane11, pane12, pane13, pane14, pane15, pane16,
    pane17, pane18, pane19, pane20, pane21, pane22, pane23, pane24, pane25, pane26, pane27, pane28, pane29, pane30, pane31, pane32;

    @FXML
    VBox myvbox;

    @FXML
    Label  name1, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11, name12, name13, name14, name15, name16, name17, name18, name19, name20, name21, name22, name23, name24, name25, name26, name27, name28, name29, name30, name31, name32, 
    price1, price2, price3, price4, price5, price6, price7, price8, price9, price10, price11, price12, price13, price14, price15, price16, price17, price18, price19, price20, price21, price22, price23, price24, price25, price26, price27, price28, price29, price30, price31, price32, 
    total;

    @FXML
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, 
    img13, img14, img15, img16, img17, img18, img19, img20, img21, img22, img23, img24, img25, img26, img27, img28, img29, img30, img31, img32;

    @FXML
    Button homeButton;





    @Override
    public void initialize(URL location, ResourceBundle resources) {
   //CAKE
        name1.setText(LoginController.bForest.getProductName());
        price1.setText(Double.toString(LoginController.bForest.getProductPrice()));
        Image blackForest = new Image(LoginController.bForest.getProductImage());
        img1.setImage(blackForest);
        
        name2.setText(LoginController.cheese.getProductName());
        price2.setText(Double.toString(LoginController.cheese.getProductPrice()));
        Image cheeseCake = new Image(LoginController.cheese.getProductImage());
        img2.setImage(cheeseCake);

        name3.setText(LoginController.chocoCC.getProductName());
        price3.setText(Double.toString(LoginController.chocoCC.getProductPrice()));
        Image chocoMud = new Image(LoginController.chocoCC.getProductImage());
        img3.setImage(chocoMud);
        
        name4.setText(LoginController.cCake.getProductName());
        price4.setText(Double.toString(LoginController.cCake.getProductPrice()));
        Image coffeeCake = new Image(LoginController.cCake.getProductImage());
        img4.setImage(coffeeCake);
        
        name5.setText(LoginController.redCC.getProductName());
        price5.setText(Double.toString(LoginController.redCC.getProductPrice()));
        Image redVelvet = new Image(LoginController.redCC.getProductImage());
        img5.setImage(redVelvet);
           
        name6.setText(LoginController.tiramisu.getProductName());
        price6.setText(Double.toString(LoginController.tiramisu.getProductPrice()));
        Image Tiramisu = new Image(LoginController.tiramisu.getProductImage());
        img6.setImage(Tiramisu);

        //COOKIE
        name7.setText(LoginController.chocoChip.getProductName());
        price7.setText(Double.toString(LoginController.chocoChip.getProductPrice()));
        Image chocochip = new Image(LoginController.chocoChip.getProductImage());
        img7.setImage(chocochip);

        name8.setText(LoginController.cBrulee.getProductName());
        price8.setText(Double.toString(LoginController.cBrulee.getProductPrice()));
        Image cremeBrulee = new Image(LoginController.cBrulee.getProductImage());
        img8.setImage(cremeBrulee);

        name9.setText(LoginController.fCookie.getProductName());
        price9.setText(Double.toString(LoginController.fCookie.getProductPrice()));
        Image fortunecookie = new Image(LoginController.fCookie.getProductImage());
        img9.setImage(fortunecookie);

        name10.setText(LoginController.oatmeal.getProductName());
        price10.setText(Double.toString(LoginController.oatmeal.getProductPrice()));
        Image oatmealcookie = new Image(LoginController.oatmeal.getProductImage());
        img10.setImage(oatmealcookie);

        name11.setText(LoginController.pbCookie.getProductName());
        price11.setText(Double.toString(LoginController.pbCookie.getProductPrice()));
        Image pbBlossom = new Image(LoginController.pbCookie.getProductImage());
        img11.setImage(pbBlossom);

        name12.setText(LoginController.smores.getProductName());
        price12.setText(Double.toString(LoginController.smores.getProductPrice()));
        Image smoresCookie = new Image(LoginController.smores.getProductImage());
        img12.setImage(smoresCookie);

        //DONUTS
        name13.setText(LoginController.bavarian.getProductName());
        price13.setText(Double.toString(LoginController.bavarian.getProductPrice()));
        Image bavarian = new Image(LoginController.bavarian.getProductImage());
        img13.setImage(bavarian);

        name14.setText(LoginController.cFrost.getProductName());
        price14.setText(Double.toString(LoginController.cFrost.getProductPrice()));
        Image chocoFrost = new Image(LoginController.cFrost.getProductImage());
        img14.setImage(chocoFrost);

        name15.setText(LoginController.churros.getProductName());
        price15.setText(Double.toString(LoginController.churros.getProductPrice()));
        Image churros = new Image(LoginController.churros.getProductImage());
        img15.setImage(churros);

        name16.setText(LoginController.cTwist.getProductName());
        price16.setText(Double.toString(LoginController.cTwist.getProductPrice()));
        Image cinnamonTwist = new Image(LoginController.cTwist.getProductImage());
        img16.setImage(cinnamonTwist);

        name17.setText(LoginController.gDonuts.getProductName());
        price17.setText(Double.toString(LoginController.gDonuts.getProductPrice()));
        Image glazedDonut = new Image(LoginController.gDonuts.getProductImage());
        img17.setImage(glazedDonut);

        name18.setText(LoginController.pbDonut.getProductName());
        price18.setText(Double.toString(LoginController.pbDonut.getProductPrice()));
        Image pbDonut = new Image(LoginController.pbDonut.getProductImage());
        img18.setImage(pbDonut);

        //PASTRIES
        name19.setText(LoginController.bibingka.getProductName());
        price19.setText(Double.toString(LoginController.bibingka.getProductPrice()));
        Image Bibingka = new Image(LoginController.bibingka.getProductImage());
        img19.setImage(Bibingka);

        name20.setText(LoginController.cRoll.getProductName());
        price20.setText(Double.toString(LoginController.cRoll.getProductPrice()));
        Image cinnamonRolls = new Image(LoginController.cRoll.getProductImage());
        img20.setImage(cinnamonRolls);

        name21.setText(LoginController.croissant.getProductName());
        price21.setText(Double.toString(LoginController.croissant.getProductPrice()));
        Image Croissant = new Image(LoginController.croissant.getProductImage());
        img21.setImage(Croissant);

        name22.setText(LoginController.eggTart.getProductName());
        price22.setText(Double.toString(LoginController.eggTart.getProductPrice()));
        Image EggTart = new Image(LoginController.eggTart.getProductImage());
        img22.setImage(EggTart);

        name23.setText(LoginController.empanada.getProductName());
        price23.setText(Double.toString(LoginController.empanada.getProductPrice()));
        Image Empanada = new Image(LoginController.empanada.getProductImage());
        img23.setImage(Empanada);

        name24.setText(LoginController.pandesal.getProductName());
        price24.setText(Double.toString(LoginController.pandesal.getProductPrice()));
        Image PanDeSal = new Image(LoginController.pandesal.getProductImage());
        img24.setImage(PanDeSal);

        //TOOLS 
        name25.setText(LoginController.bPans.getProductName());
        price25.setText(Double.toString(LoginController.bPans.getProductPrice()));
        Image bakingPanAndMold = new Image(LoginController.bPans.getProductImage());
        img25.setImage(bakingPanAndMold);

        name26.setText(LoginController.mCup.getProductName());
        price26.setText(Double.toString(LoginController.mCup.getProductPrice()));
        Image measuringCups = new Image(LoginController.mCup.getProductImage());
        img26.setImage(measuringCups);

        name27.setText(LoginController.mBowl.getProductName());
        price27.setText(Double.toString(LoginController.mBowl.getProductPrice()));
        Image MixingBowl = new Image(LoginController.mBowl.getProductImage());
        img27.setImage(MixingBowl);

        name28.setText(LoginController.pBag.getProductName());
        price28.setText(Double.toString(LoginController.pBag.getProductPrice()));
        Image PipingBag = new Image(LoginController.pBag.getProductImage());
        img28.setImage(PipingBag);


        //EQUIPMENT

        name29.setText(LoginController.fProcessor.getProductName());
        price29.setText(Double.toString(LoginController.fProcessor.getProductPrice()));
        Image FoodProcessor = new Image(LoginController.fProcessor.getProductImage());
        img29.setImage(FoodProcessor);

        name30.setText(LoginController.hMixer.getProductName());
        price30.setText(Double.toString(LoginController.hMixer.getProductPrice()));
        Image handMixer = new Image(LoginController.hMixer.getProductImage());
        img30.setImage(handMixer);

        name31.setText(LoginController.mOven.getProductName());
        price31.setText(Double.toString(LoginController.mOven.getProductPrice()));
        Image MicrowaveOven = new Image(LoginController.mOven.getProductImage());
        img31.setImage(MicrowaveOven);

        name32.setText(LoginController.sMixer.getProductName());
        price32.setText(Double.toString(LoginController.sMixer.getProductPrice()));
        Image StandMixer = new Image(LoginController.sMixer.getProductImage());
        img32.setImage(StandMixer);

        clearVbox();
        
        showItems(LoginController.fave.getItemList());
    }


    // Go to Home Page
    public void gotohome(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Home.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    // Show all items in ArrayList
    public void showItems(ArrayList<Pane> itemList) {
        for (Pane p : itemList) {
            myvbox.getChildren().add(p);
        }
    }

    public void clearVbox(){

        if (myvbox != null) {
            myvbox.getChildren().removeAll(myvbox.getChildren());
        }
    }
}
