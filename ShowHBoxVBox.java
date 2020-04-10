/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.String;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import org.controlsfx.control.CheckComboBox;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.effect.BlendMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;



/**
 *
 * @author kalua
 */
public class ShowHBoxVBox extends Application {

 @Override // Override the start method in the Application class
 public void start(Stage primaryStage) throws FileNotFoundException {
 // Create a border pane
 BorderPane pane = new BorderPane();

 

 // Place nodes in the pane
 pane.setTop(getHBox());
 starter();
 
 pane.setLeft(getVBox());
 
 ScrollPane AllRecipe = new ScrollPane (getGridPane());
 pane.setCenter(AllRecipe);
 
 pane.setRight(getVBox2());

  SplitPane splitPane = new SplitPane();
  splitPane.getItems().addAll(pane, recipeView);
  recipeView.setMaxSize(650, 900);
  FileInputStream input5 = new FileInputStream("C:/Users/kalua/OneDrive/Desktop/group/pic52.jpg");
  
 /* recipeView.setStyle(
  "-fx-background-image: url(" +
  "-fx-background-size: cover;"
  );*/
  BackgroundImage backgroundimage = new BackgroundImage(new Image(input5, 650,900, true, true),  
                                             BackgroundRepeat.NO_REPEAT,  
                                             BackgroundRepeat.NO_REPEAT,  
                                             BackgroundPosition.CENTER,  
                                             new  BackgroundSize(100, 100, true, true,true, true));
  Background background = new Background(backgroundimage); 
  recipeView.setBackground(background);

 // Create a scene and place it in the stage
 Scene scene = new Scene(splitPane);
primaryStage.setTitle("Easy Breakfast"); // Set the stage title
 primaryStage.setScene(scene); // Place the scene in the stage
 primaryStage.show(); // Display the stage
 }
public void starter()
    {
        Multip thread =  new Multip();
        thread.start();
        
    }

    public class Multip extends Thread
    { 
        @Override
        public void run()
        {
            try
            { 
                while(true) 
                {                   
                    text.setText(xxx);
                    char x = xxx.charAt(0);
                    String xx = xxx.substring(1);
                    xxx=xx + x;
                    Thread.sleep(300);
                }
            } 
            catch (InterruptedException e) 
            { 
                // Throwing an exception 
                System.out.println ("Exception is caught"); 
            } 
        }
    }
 
 
 Text text=new Text();
 String xxx = "       What's for breakfast? ";
 
 private HBox getHBox() throws FileNotFoundException {
 HBox hBox = new HBox();
 hBox.setPadding(new Insets(5, 5, 5, 5));
 hBox.setStyle("-fx-background-color: gold");
 

 FileInputStream input = new FileInputStream("C:/Users/kalua/OneDrive/Desktop/group/pic.jpg");

ImageView iw = new ImageView(new Image(input)); 
 iw.setFitHeight(100);
 iw.setFitWidth(150);  
 hBox.getChildren().add(new Label("",iw));
 
 
 text.setFont(Font.font("Papyrus", FontWeight.SEMI_BOLD, 70)); 
 text.setFill(Color.SIENNA);
 //text.setStroke(Color.BEIGE);
 
 HBox qu = new HBox(text);
 qu.setAlignment(Pos.TOP_RIGHT);
 
 hBox.getChildren().add(qu);
// ImageView imageView = new ImageView(new Image("image/us.gif"));
 //hBox.getChildren().add(imageView);
 return hBox;
 }

     Label[] ingredientList = {new Label(), new Label()};
     

 private VBox getVBox() 
 {
    VBox vBox = new VBox(15);
    vBox.setPadding(new Insets(15, 5, 5, 5));
    vBox.setMaxWidth(200);
    vBox.getChildren().add(new Label("Select your ingredients"));

    
    Label[] courses = {new Label("Dairy"), new Label("Meat"), new Label("Vegetable"), new Label("Fruit"), new Label("Herbs and Spices"), new Label("Condiments")};
    //ComboBox comboBox1 = new ComboBox();
    //comboBox1.getItems().addAll("Option 4", "Option 5","Option 6");

     final ObservableList<String> strings = FXCollections.observableArrayList();
     strings.addAll("Milk","Yogurt","Cream","Butter","Cheese","ice cream");
 
     final ObservableList<String> strings1 = FXCollections.observableArrayList();
     strings1.addAll("Pork","Beef","Lamb","Chicken","Turkey","Bison");
     
     final ObservableList<String> strings2 = FXCollections.observableArrayList();
     strings2.addAll("Broccoli","Carrot","Cabbage","Corn","Bell-Paeper","Lettuce","Mushroom","Onion","Garlic");
     
     final ObservableList<String> strings3 = FXCollections.observableArrayList();
     strings3.addAll("Acai","Apple","Avocado","Banana","Blackberry","Blueberry","Grape","Lemon","Lime", "Mango");
     
     final ObservableList<String> strings4 = FXCollections.observableArrayList();
     strings4.addAll("allspice","bay leaf","basil","Chili pepper","Chives","Cilantro","Cinnamon","Clove","Curry","Cumin");
     
     final ObservableList<String> strings5 = FXCollections.observableArrayList();
     strings5.addAll("allspice","bay leaf","basil","Chili pepper","Chives","Cilantro","Cinnamon","Clove","Curry","Cumin","allspice","bay leaf","basil","Chili pepper","Chives","Cilantro","Cinnamon","Clove","Curry","Cumin");
     
     

 // Create the CheckComboBox with the data 
final CheckComboBox<String> checkComboBox = new CheckComboBox<>(strings);
final CheckComboBox<String> checkComboBox1 = new CheckComboBox<>(strings1);
final CheckComboBox<String> checkComboBox2 = new CheckComboBox<>(strings2);
final CheckComboBox<String> checkComboBox3 = new CheckComboBox<>(strings3);
final CheckComboBox<String> checkComboBox4 = new CheckComboBox<>(strings4);
final CheckComboBox<String> checkComboBox5 = new CheckComboBox<>(strings5);

 
checkComboBox.getCheckModel().getCheckedItems().addListener(new ListChangeListener<String>() {
   @Override
   public void onChanged(ListChangeListener.Change<? extends String> c) {
        System.out.println(checkComboBox.getCheckModel().getCheckedItems());
        ingredientList[0].setText(checkComboBox.getCheckModel().getCheckedItems().toString());
     }
 });
checkComboBox1.getCheckModel().getCheckedItems().addListener(new ListChangeListener<String>() {
   @Override
   public void onChanged(ListChangeListener.Change<? extends String> c) {
        System.out.println(checkComboBox1.getCheckModel().getCheckedItems());
        ingredientList[1].setText(checkComboBox1.getCheckModel().getCheckedItems().toString());        
     }
 });
 checkComboBox2.getCheckModel().getCheckedItems().addListener(new ListChangeListener<String>() {
   @Override
   public void onChanged(ListChangeListener.Change<? extends String> c) {
        System.out.println(checkComboBox2.getCheckModel().getCheckedItems());
     }
 });
    
    // for (Label courses: courses)
     for(int i=0; i<courses.length; i++)
     {
     VBox.setMargin(courses[i], new Insets(0, 0, 0, 15));
     vBox.getChildren().add(courses[i]);
     
     if(i==0)
     vBox.getChildren().add(checkComboBox);
     if(i==1)
     vBox.getChildren().add(checkComboBox1);  
     if(i==2)
     vBox.getChildren().add(checkComboBox2); 
     if(i==3)
     vBox.getChildren().add(checkComboBox3); 
     if(i==4)
     vBox.getChildren().add(checkComboBox4); 
     if(i==5)
     vBox.getChildren().add(checkComboBox5);     
     }
     
     Button b3 = new Button ("GO");
    vBox.getChildren().add(b3);
   // b3.setBorder(Border.);
    
    
     return vBox;
   }
 
 private VBox getVBox2()
 {
    VBox vBox2 = new VBox(15);
    
    vBox2.setMaxWidth(200);
   
    //add(vbox)
    for(int i=0; i<ingredientList.length;i++)
    vBox2.getChildren().add(ingredientList[i]);
    
     return vBox2;
 }
 
 Text showRecipe = new Text("Recipe Information");
 FlowPane recipeView = new FlowPane();
 
private GridPane getGridPane() throws FileNotFoundException 
{
    GridPane gridPane = new GridPane();
    gridPane.setMinSize(400, 200);
    gridPane.setPadding(new Insets(10, 10, 10, 10)); 
     
  //  gridPane.setGridLinesVisible(true);
    
      //Setting the vertical and horizontal gaps between the columns 
      gridPane.setVgap(10); 
      gridPane.setHgap(10);       
      
      //Setting the Grid alignment 
      //gridPane.setAlignment(Pos.CENTER); 
      
     gridPane.setStyle("-fx-background-color: cornsilk");

     for(int i=0;i<ingredientList.length;i++)
     {    
      gridPane.getChildren().add(ingredientList[i]); 
      ingredientList[i].setAlignment(Pos.BOTTOM_LEFT);
     }
     
    FileInputStream input = new FileInputStream("C:/Users/kalua/OneDrive/Desktop/group/pic.jpg");
    ImageView iw = new ImageView(new Image(input));
     iw.setFitHeight(200);
     iw.setFitWidth(200); 
    FileInputStream input1 = new FileInputStream("C:/Users/kalua/OneDrive/Desktop/group/pic1.jpg");
    ImageView iw1 = new ImageView(new Image(input1));
     iw1.setFitHeight(200);
     iw1.setFitWidth(200); 
     FileInputStream input2 = new FileInputStream("C:/Users/kalua/OneDrive/Desktop/group/pic2.jpg");
     ImageView iw2 = new ImageView(new Image(input2));
     iw2.setFitHeight(200);
     iw2.setFitWidth(200); 
    
   // FileInputStream input = new FileInputStream("C:/Users/kalua/OneDrive/Desktop/pic.jpg");
   // ImageView iw = new ImageView(new Image(input));
     
  Label[] food = {new Label("Recipe 1",iw2), new Label("Recipe 2",iw1), new Label("Recipe 3",iw), new Label("Recipe 4",iw2), new Label("Recipe 5",iw), 
                  new Label("Recipe 6",iw),new Label("Recipe 1",iw2), new Label("Recipe 2",iw1), new Label("Recipe 3",iw), new Label("Recipe 4",iw2), 
                  new Label("Recipe 5",iw), new Label("Recipe 6",iw),new Label("Recipe 1",iw2), new Label("Recipe 2",iw1), new Label("Recipe 3",iw), 
                  new Label("Recipe 4",iw2), new Label("Recipe 5",iw), new Label("Recipe 6",iw), new Label("Recipe 1",iw2), new Label("Recipe 2",iw1), 
                  new Label("Recipe 3",iw), new Label("Recipe 4",iw2), new Label("Recipe 5",iw), new Label("Recipe 6",iw)};
  Label[] checkbox = new Label [food.length];
 
   recipeView.getChildren().add(showRecipe);

    food[0].setOnMouseClicked(e-> {showRecipe.setText("hi");});
    food[1].setOnMouseClicked(e-> {showRecipe.setText("hi2");});
    food[2].setOnMouseClicked(e-> {showRecipe.setText("hi3");});
    food[3].setOnMouseClicked(e-> {showRecipe.setText("hi4");});
    food[4].setOnMouseClicked(e-> {showRecipe.setText("hi5");});
    food[5].setOnMouseClicked(e-> {showRecipe.setText("hi6");});
    //food[6].setOnMouseClicked(e-> {System.out.println(food[6].getText());});
    //food[7].setOnMouseClicked(e-> {System.out.println(food[].getText());});
   // food[8].setOnMouseClicked(e-> {System.out.println(food[0].getText());});

   int j=0, k=0, l=1;
   for(int i=0;i<food.length;i++)
   {
      food[i].setContentDisplay(ContentDisplay.TOP);
      food[i].setStyle("-fx-border-color: white;");

      checkbox[i]= new Label ("# Missing Ingredients",new CheckBox() );
      
      if(i%5==0 && i!=0)
      { k+=2; l+=2; j=0;}
      
      gridPane.add(checkbox[i], j, k);
      gridPane.add(food[i], j, l);
      
      j++;
      
   }
    return gridPane;
}


  /* private FlowPane getFlowPane()
   {
    FlowPane recipeView = new FlowPane();
    
    final ObservableList<String> strings = FXCollections.observableArrayList();
     strings.addAll("Milk","Yogurt","Cream","Butter","Cheese","ice cream");
 
     final ObservableList<String> strings1 = FXCollections.observableArrayList();
     strings1.addAll("Pork","Beef","Lamb","Chicken","Turkey","Bison");
     
     final ObservableList<String> strings2 = FXCollections.observableArrayList();
     strings2.addAll("Broccoli","Carrot","Cabbage","Corn","Bell-Paeper","Lettuce","Mushroom","Onion","Garlic");
     
     final ObservableList<String> strings3 = FXCollections.observableArrayList();
     strings3.addAll("Acai","Apple","Avocado","Banana","Blackberry","Blueberry","Grape","Lemon","Lime", "Mango");
     
     final ObservableList<String> strings4 = FXCollections.observableArrayList();
     strings4.addAll("allspice","bay leaf","basil","Chili pepper","Chives","Cilantro","Cinnamon","Clove","Curry","Cumin");
     
     final ObservableList<String> strings5 = FXCollections.observableArrayList();
     strings5.addAll("allspice","bay leaf","basil","Chili pepper","Chives","Cilantro","Cinnamon","Clove","Curry","Cumin","allspice","bay leaf","basil","Chili pepper","Chives","Cilantro","Cinnamon","Clove","Curry","Cumin");
     
    
    for  (int i=0; i<viewRecipe.length; i++)
    {    
        if(viewRecipe[i])
        {
            recipeView.getChildren().clear();
            showRecipe.setText("hi");
            recipeView.getChildren().add(showRecipe);
            viewRecipe[i]= false;
            break;
        }
            
    }      
        
    return recipeView;
   }*/
}
