
package practica3;

import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.InnerShadow;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.ClosePath;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.HLineTo;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.QuadCurveTo;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.shape.VLineTo;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * @author Edwin Mendez
 */
public class P extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group group = new Group();

        
        
        Rectangle Dia = new Rectangle(20, 20, 300, 450);
        Dia.setLayoutX(5);
        Dia.setLayoutY(0);
        InnerShadow DiaEfecto = new InnerShadow();
        DiaEfecto.setOffsetX(1.0f);
        DiaEfecto.setOffsetY(1.0f);
        Dia.setEffect(DiaEfecto);
        LinearGradient DiaGradiante = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0.1f, Color.SKYBLUE),new Stop(1.0f, Color.WHITE));
        Dia.setFill(DiaGradiante);
        Dia.setArcHeight(15);
        Dia.setArcWidth(15);
        Dia.setStroke(Color.WHITE);

        Rectangle Noche = new Rectangle(20, 20, 300, 450);
        Noche.setLayoutX(305);
        Noche.setLayoutY(0);
        InnerShadow NocheEfecto = new InnerShadow();
        NocheEfecto.setOffsetX(1.0f);
        NocheEfecto.setOffsetY(1.0f);
        Noche.setEffect(DiaEfecto);
        LinearGradient NocheGradiante = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0.1f, Color.DARKBLUE),new Stop(1.0f, Color.BLACK));
        Noche.setFill(NocheGradiante);
        Noche.setArcHeight(15);
        Noche.setArcWidth(15);
        Noche.setStroke(Color.WHITE);
        
        Circle Sol = new Circle();
        Sol.setRadius(60.0f);
        Sol.setFill(Color.GOLD);
        Sol.setLayoutX(100);
        Sol.setLayoutY(100);        
        Sol.setEffect(new GaussianBlur());
        Efecto_Sol(Sol);
        
        Circle Luna = new Circle();
        Luna.setRadius(60.0f);
        Luna.setLayoutX(400);
        Luna.setLayoutY(100);
        Circle LunaMedia = new Circle();
        LunaMedia.setRadius(40.0f);
        LunaMedia.setLayoutX(420);
        LunaMedia.setLayoutY(90);        
        Shape MediaLuna = Shape.subtract(Luna,LunaMedia);
        MediaLuna.setFill(Color.GOLD);
        MediaLuna.setEffect(new Bloom());

        
        Circle Craater = new Circle();
        Craater.setRadius(8.0f);
        Craater.setLayoutX(392);
        Craater.setFill(Color.ORANGE);
        Craater.setLayoutY(150);

        Circle Craater1 = new Circle();
        Craater1.setRadius(5.0f);
        Craater1.setLayoutX(392);
        Craater1.setLayoutY(130);        
        Craater1.setFill(Color.ORANGE);
 
        Circle Craater2 = new Circle();
        Craater2.setRadius(3.0f);
        Craater2.setLayoutX(380);
        Craater2.setLayoutY(140); 
        Craater2.setFill(Color.ORANGE);

        Circle Craater3 = new Circle();
        Craater3.setRadius(6.0f);
        Craater3.setLayoutX(365);
        Craater3.setLayoutY(60); 
        Craater3.setFill(Color.ORANGE);
        
        Circle Craater4 = new Circle();
        Craater4.setRadius(4.0f);
        Craater4.setLayoutX(358);
        Craater4.setLayoutY(70); 
        Craater4.setFill(Color.ORANGE);
        
        
        Path Montaña1 = new Path(
        new MoveTo(0,0),
        new VLineTo(50),
        new HLineTo(300),
        new VLineTo(-40),                        
        new QuadCurveTo(0,0,0,50)
        );
        Montaña1.setLayoutX(25);
        Montaña1.setLayoutY(400);
        LinearGradient Montaña1Gradiante = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0.1f, Color.LIME),new Stop(1.0f, Color.DARKGREEN));
        Montaña1.setFill(Montaña1Gradiante);
        Montaña1.setStroke(Color.LIME);

        Path Montaña2 = new Path(
        new MoveTo(0,0),
        new VLineTo(50),
        new HLineTo(300),
        new VLineTo(0),                        
        new QuadCurveTo(0,-20,0,0)
        );
        Montaña2.setLayoutX(25);
        Montaña2.setLayoutY(420);
        Montaña2.setFill(Montaña1Gradiante);
        Montaña2.setStroke(Color.LIME);
        
        
        Path MontañaII = new Path(
        new MoveTo(0,0),
        new VLineTo(50),
        new HLineTo(300),
        new VLineTo(-40),                        
        new QuadCurveTo(0,0,0,50)
        );
        MontañaII.setLayoutX(325);
        MontañaII.setLayoutY(400);
        LinearGradient MontañaGradiante = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0.1f, Color.DARKGREEN),new Stop(1.0f, Color.BLACK));
        MontañaII.setFill(MontañaGradiante);
        MontañaII.setStroke(Color.DARKGREEN);

        Path MontañaI = new Path(
        new MoveTo(0,0),
        new VLineTo(50),
        new HLineTo(300),
        new VLineTo(0),                        
        new QuadCurveTo(0,-20,0,0)
        );
        MontañaI.setLayoutX(325);
        MontañaI.setLayoutY(420);
        MontañaI.setFill(MontañaGradiante);
        MontañaI.setStroke(Color.DARKGREEN);

        
       Path Estrella = new Path(
       new MoveTo(0,0),
       new LineTo(-2.5,10),
       new LineTo(-12.5,12.5),
       new LineTo(-2.5,15),
       new LineTo(0,25),
       new LineTo(2.5,15),
       new LineTo(12.5,12.5),
       new LineTo(2.5,10),
       new ClosePath()

       );
       Estrella.setLayoutX(550);
       Estrella.setLayoutY(200);
       Estrella.setStroke(Color.YELLOW);
       Estrella.setFill(Color.WHITE);
       Estrella.setEffect(new Bloom());
       Efecto_Estrella(Estrella);
  
       Path Estrella1 = new Path(
       new MoveTo(0,0),
       new LineTo(-2.5,10),
       new LineTo(-12.5,12.5),
       new LineTo(-2.5,15),
       new LineTo(0,25),
       new LineTo(2.5,15),
       new LineTo(12.5,12.5),
       new LineTo(2.5,10),
       new ClosePath()

       );
       Estrella1.setLayoutX(360);
       Estrella1.setLayoutY(380);
       Estrella1.setStroke(Color.YELLOW);       
       Estrella1.setFill(Color.WHITE);
       Estrella1.setEffect(new Bloom());
       Efecto_Estrella1(Estrella1);
        
       Path Estrella2 = new Path(
       new MoveTo(0,0),
       new LineTo(-2.5,10),
       new LineTo(-12.5,12.5),
       new LineTo(-2.5,15),
       new LineTo(0,25),
       new LineTo(2.5,15),
       new LineTo(12.5,12.5),
       new LineTo(2.5,10),
       new ClosePath()

       );
       Estrella2.setLayoutX(420);
       Estrella2.setStroke(Color.YELLOW);
       Estrella2.setLayoutY(80);
       Estrella2.setFill(Color.WHITE);
       Estrella2.setEffect(new Bloom());
       Efecto_Estrella2(Estrella2);
       
       Path Estrella3 = new Path(
       new MoveTo(0,0),
       new LineTo(-2.5,10),
       new LineTo(-12.5,12.5),
       new LineTo(-2.5,15),
       new LineTo(0,25),
       new LineTo(2.5,15),
       new LineTo(12.5,12.5),
       new LineTo(2.5,10),
       new ClosePath()

       );
       Estrella3.setLayoutX(580);
       Estrella3.setLayoutY(30);
       Estrella3.setStroke(Color.YELLOW);
       Estrella3.setFill(Color.WHITE);
       Estrella3.setEffect(new Bloom());
       Efecto_Estrella3(Estrella3);

       Path EstrellaI = new Path(
       new MoveTo(0,0),
       new LineTo(-1,5),
       new LineTo(-4,6),
       new LineTo(-1,7),
       new LineTo(0,12),
       new LineTo(1,7),
       new LineTo(4,6),
       new LineTo(1,5),
       new ClosePath()

       );
       EstrellaI.setLayoutX(500);
       EstrellaI.setLayoutY(100);
       EstrellaI.setStroke(Color.WHITE);
       EstrellaI.setFill(Color.WHITE);       
       EstrellaI.setEffect(new Bloom());
       Efecto_Estrella(EstrellaI);
       
       Path EstrellaII = new Path(
       new MoveTo(0,0),
       new LineTo(-1,5),
       new LineTo(-4,6),
       new LineTo(-1,7),
       new LineTo(0,12),
       new LineTo(1,7),
       new LineTo(4,6),
       new LineTo(1,5),
       new ClosePath()

       );
       EstrellaII.setLayoutX(350);
       EstrellaII.setLayoutY(180);
       EstrellaII.setStroke(Color.WHITE);
       EstrellaII.setFill(Color.WHITE); 
       EstrellaII.setEffect(new Bloom());
       Efecto_Estrella1(EstrellaII);
       
       Path EstrellaIII = new Path(
       new MoveTo(0,0),
       new LineTo(-1,5),
       new LineTo(-4,6),
       new LineTo(-1,7),
       new LineTo(0,12),
       new LineTo(1,7),
       new LineTo(4,6),
       new LineTo(1,5),
       new ClosePath()

       );
       EstrellaIII.setLayoutX(450);
       EstrellaIII.setLayoutY(300);
       EstrellaIII.setStroke(Color.WHITE);
       EstrellaIII.setFill(Color.WHITE); 
       EstrellaIII.setEffect(new Bloom());
       Efecto_Estrella2(EstrellaIII);
        
       Path EstrellaIV = new Path(
       new MoveTo(0,0),
       new LineTo(-1,5),
       new LineTo(-4,6),
       new LineTo(-1,7),
       new LineTo(0,12),
       new LineTo(1,7),
       new LineTo(4,6),
       new LineTo(1,5),
       new ClosePath()

       );
       EstrellaIV.setLayoutX(600);
       EstrellaIV.setLayoutY(230);
       EstrellaIV.setStroke(Color.WHITE);
       EstrellaIV.setFill(Color.WHITE); 
       EstrellaIV.setEffect(new Bloom());
       Efecto_Estrella3(EstrellaIV);

        Ellipse Nube = new Ellipse(60,30);
        Nube.setLayoutX(85);
        Nube.setLayoutY(180);

        Ellipse Nube1 = new Ellipse(80,30);
        Nube1.setLayoutX(200);
        Nube1.setLayoutY(180);
        
        Ellipse Nube2 = new Ellipse(60,30);
        Nube2.setLayoutX(130);
        Nube2.setLayoutY(160);
        
        Ellipse Nube3 = new Ellipse(60,30);
        Nube3.setLayoutX(150);
        Nube3.setLayoutY(200);
        
        Shape Nubes  = Shape.union(Nube,Nube1);
        Nubes.setFill(Color.WHEAT);
                
        Shape Nubes1  = Shape.union(Nube3,Nube2);
        Nubes1.setFill(Color.WHEAT);  
        
        Shape Nubes2  = Shape.union(Nubes,Nubes1);
        Nubes1.setFill(Color.WHEAT);         

        Ellipse Nube4 = new Ellipse(35,17.5);
        Nube4.setLayoutX(280);
        Nube4.setLayoutY(190);
        
        Shape Nubes3  = Shape.union(Nubes2,Nube4);
        LinearGradient NubeGradiante = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0.1f, Color.WHITE),new Stop(1.0f, Color.DARKGRAY));
        Nubes3.setFill(NubeGradiante);
        Nubes3.setEffect(new GaussianBlur());
        
        group.getChildren().addAll(
                Dia,Noche,Sol,MediaLuna,Montaña1,Montaña2,MontañaII,
                MontañaI,Estrella,Estrella1,Estrella2,Estrella3,EstrellaI,
                EstrellaII,EstrellaIII,EstrellaIV,Nubes3,Craater,Craater1,Craater2,
                Craater3,Craater4
                );

        Scene scene = new Scene(group, 660, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void Efecto_Sol( Circle Sol ){
    
    ScaleTransition scaleTransition = new ScaleTransition(
    Duration.millis(1500), Sol);
    scaleTransition.setToX(0.90f);
    scaleTransition.setToY(0.90f);
    scaleTransition.setCycleCount( 4 );
    scaleTransition.setAutoReverse( true );
    ParallelTransition parallelTransition = new ParallelTransition();
    parallelTransition.getChildren().addAll( scaleTransition);
    parallelTransition.setCycleCount(Timeline.INDEFINITE); 
    parallelTransition.play();
   
    }

    public void Efecto_Estrella1( Path Estrella1 ){
    
    ScaleTransition scaleTransition = new ScaleTransition(
    Duration.millis(1500), Estrella1);
    scaleTransition.setToX(1.4f);
    scaleTransition.setToY(1.4f);
    scaleTransition.setCycleCount( 4 );
    scaleTransition.setAutoReverse( true );
    ParallelTransition parallelTransition = new ParallelTransition();
    parallelTransition.getChildren().addAll( scaleTransition);
    parallelTransition.setCycleCount(Timeline.INDEFINITE); 
    parallelTransition.play();
   
    }    

    public void Efecto_Estrella( Path Estrella ){
    
    ScaleTransition scaleTransition = new ScaleTransition(
    Duration.millis(2000), Estrella);
    scaleTransition.setToX(1.4f);
    scaleTransition.setToY(1.4f);
    scaleTransition.setCycleCount( 4 );
    scaleTransition.setAutoReverse( true );
    ParallelTransition parallelTransition = new ParallelTransition();
    parallelTransition.getChildren().addAll( scaleTransition);
    parallelTransition.setCycleCount(Timeline.INDEFINITE); 
    parallelTransition.play();
   
    }  


    public void Efecto_Estrella2( Path Estrella2 ){
    
    ScaleTransition scaleTransition = new ScaleTransition(
    Duration.millis(2500), Estrella2);
    scaleTransition.setToX(1.4f);
    scaleTransition.setToY(1.4f);
    scaleTransition.setCycleCount( 4 );
    scaleTransition.setAutoReverse( true );
    ParallelTransition parallelTransition = new ParallelTransition();
    parallelTransition.getChildren().addAll( scaleTransition);
    parallelTransition.setCycleCount(Timeline.INDEFINITE); 
    parallelTransition.play();
   
    }

    public void Efecto_Estrella3( Path Estrella3 ){
    
    ScaleTransition scaleTransition = new ScaleTransition(
    Duration.millis(3000), Estrella3);
    scaleTransition.setToX(1.4f);
    scaleTransition.setToY(1.4f);
    scaleTransition.setCycleCount( 4 );
    scaleTransition.setAutoReverse( true );
    ParallelTransition parallelTransition = new ParallelTransition();
    parallelTransition.getChildren().addAll( scaleTransition);
    parallelTransition.setCycleCount(Timeline.INDEFINITE); 
    parallelTransition.play();
   
    }
    
}
