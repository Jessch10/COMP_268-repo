

import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
//import javafx.scene.text.Font; // Added import
//import javafx.scene.text.FontWeight; // Added import

/**
* This file can be used to draw simple pictures. Just fill in
* the definition of drawPicture with the code that draws your picture.
*/
public class Checkerboard extends Application {
	
	/**
	* Draws a picture. The parameters width and height give the size
	* of the drawing area, in pixels.
	*/

	public void drawPicture(GraphicsContext g, int width, int height)	{

		int row;
		int column;
		int x, y;

		for ( row = 0; row < 8; row++) {

			for ( column = 0; column < 8; column++)  {
				x = column * 50;
				y = row * 50;
				if ( (row % 2) == (column % 2))  
					g.setFill(Color.RED);
				else 
					g.setFill(Color.BLACK);
				g.fillRect(x, y, 50, 50);			
			}
		}
		/* g.setFill(Color.WHITE);
		g.fillRect(0, 0, 50, 50);	// First, fill the entire image with a background color

		// As an example, draw a large number of colored disks.
		// To get a different picture, just erase this code, and substitute your own.
		        // Text Settings
        g.setFill(Color.BLACK);
        g.setFont(Font.font("Arial", FontWeight.BOLD, 72));

        // "Hello World" Text
        String message = "Hello World!";
        double textWidth = g.getFont().getSize() * message.length() * 0.6; // Rough estimate
        double x = (width - textWidth) / 2; // Center horizontally
        double y = height / 2; // Center vertically
        g.fillText(message, x, y);
		*/
		


	} 


	// IMPLEMENTATION - WILL LEARN LATER


	public void start(Stage stage)	{
		int width = 400;	// The width of the image. You can modify this value.
		int height = 400;	// The height of the image. You can modify this value.
		Canvas canvas = new Canvas(width, height);
		drawPicture(canvas.getGraphicsContext2D(), width, height);
		BorderPane root = new BorderPane(canvas);
		root.setStyle("-fx-border-width: 4px; -fx-border-color: #444");
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Simple Graphics");		// STRING APPEARS IN WINDOW TITLEBAR
		stage.show();
		stage.setResizable(false);
	}

	public static void main(String[] args)  {
		launch();
	}
}   // End SimpleGraphicStarter










