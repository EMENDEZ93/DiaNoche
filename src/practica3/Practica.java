
package practica3;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import javafx.animation.FillTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
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
import javafx.scene.shape.QuadCurveTo;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.shape.VLineTo;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/*
 * @author Edwin Mendez
 */
public class Practica extends Application{

Integer Segundos =  0;    
Integer Minutos = 12;
Text Reloj = new Text();    
Rectangle DiaNoche;
Integer Entrada = 0;
LinearGradient MontañaGradiante;
Circle c;
Path Estrella1;
Path Estrella;

@Override
    public void start(Stage Stage) throws Exception {
        
         Group ADD = new Group();
         Group ColorNodo = new Group();

         Path Coltejer = new Path(
         new MoveTo(0,0),
         new VLineTo(350),
         new HLineTo(-52),
         new VLineTo(50),
         new QuadCurveTo(2,20,0,0)        
       );
       Coltejer.setLayoutX(450);
       Coltejer.setLayoutY(150);
       LinearGradient ColtejerGradiante = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0.1f, Color.WHITESMOKE),new Stop(1.0f, Color.DARKGREY));
       Coltejer.setStroke(ColtejerGradiante);
       Coltejer.setFill(ColtejerGradiante);
       
        Path Coltejer2 = new Path(
         new MoveTo(0,0),
         new VLineTo(370),
         new HLineTo(52),
         new VLineTo(50),
         new QuadCurveTo(2,20,0,0)        
       );
        Coltejer2.setLayoutX(460);
        Coltejer2.setLayoutY(130);    
        Coltejer2.setStroke(ColtejerGradiante);        
        Coltejer2.setFill(ColtejerGradiante);
                       
       
        Rectangle Ventana = new Rectangle(20,20,18,10);
        Ventana.setArcHeight(5);
        Ventana.setArcWidth(5);
        Ventana.setLayoutX(400);
        Ventana.setLayoutY(180);

        Rectangle Medio = new Rectangle(20,20,10,320);
        Medio.setArcHeight(5);
        Medio.setArcWidth(5);
        Medio.setLayoutX(430);
        Medio.setLayoutY(160);
        LinearGradient MedioGradiante = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0.1f, Color.DARKSLATEGRAY),new Stop(1.0f, Color.BLACK));
        Medio.setFill(MedioGradiante);

        
        Rectangle BordeD = new Rectangle(20,20,3,320);
        BordeD.setRotate(-0.5);
        BordeD.setArcHeight(5);
        BordeD.setArcWidth(5);
        BordeD.setLayoutX(492);
        BordeD.setLayoutY(160);
        BordeD.setFill(MedioGradiante);

        
        Rectangle BordeI = new Rectangle(20,20,3,300);
        BordeI.setRotate(0.5);
        BordeI.setArcHeight(5);
        BordeI.setArcWidth(5);
        BordeI.setLayoutX(375);
        BordeI.setLayoutY(180);
        BordeI.setFill(MedioGradiante);

        
        
        Path Poste = new Path(
         new MoveTo(0,0),
         new VLineTo(30)
       );
        Poste.setLayoutX(460);
        Poste.setLayoutY(100);    
        Poste.setStroke(Color.BLACK);



       Path Bandera = new Path(
         new MoveTo(0,0),
         new LineTo(-20,10),
         new LineTo(-20,20),
         new LineTo(0,10),            
         new ClosePath()
       );
        Bandera.setLayoutX(460);
        Bandera.setLayoutY(100);    
        Bandera.setStroke(Color.WHITE);
        Bandera.setFill(Color.WHITE);
        

        Path Bandera2 = new Path(
         new MoveTo(0,0),
         new LineTo(-20,10),
         new LineTo(-20,20),
         new LineTo(0,10),            
         new ClosePath()
       );                
        Bandera2.setLayoutX(460);
        Bandera2.setLayoutY(110);    
        LinearGradient BanderaGradiante = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0.1f, Color.GREEN),new Stop(1.0f, Color.DARKSLATEGRAY));        
        Bandera2.setStroke(BanderaGradiante);
        Bandera2.setFill(BanderaGradiante);
        
        Rectangle Edificio = new Rectangle(90,100 );
        Edificio.setLayoutX(0);
        Edificio.setLayoutY(410);
        LinearGradient EdificioGradiante = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0.1f, Color.BISQUE),new Stop(1.0f, Color.TAN));                
        Edificio.setFill(EdificioGradiante);        
        Edificio.setStroke(EdificioGradiante);

        
        Rectangle TEdificio = new Rectangle(85,20 );
        TEdificio.setLayoutX(2.5);
        TEdificio.setLayoutY(385);
        TEdificio.setFill(EdificioGradiante);
        TEdificio.setStroke(EdificioGradiante);
        
        Rectangle Edificio2 = new Rectangle(60,80 );
        Edificio2.setLayoutX(250);
        Edificio2.setLayoutY(430);
        LinearGradient Edificio2Gradiante = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0.1f, Color.TAN),new Stop(1.0f, Color.SIENNA));                        
        Edificio2.setFill(Edificio2Gradiante);
        Edificio2.setStroke(Edificio2Gradiante);

        Rectangle Edificio3 = new Rectangle(80,100 );
        Edificio3.setLayoutX(270);
        Edificio3.setLayoutY(410);
        LinearGradient Edificio3Gradiante = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0.1f, Color.YELLOWGREEN),new Stop(1.0f, Color.DARKGOLDENROD));        
        Edificio3.setFill(Edificio3Gradiante);
        Edificio3.setStroke(Edificio3Gradiante);

        Rectangle Edificio4 = new Rectangle(60,50 );
        Edificio4.setLayoutX(120);
        Edificio4.setLayoutY(460);
        LinearGradient Edificio4Gradiante = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0.1f, Color.DARKSEAGREEN),new Stop(1.0f, Color.SEAGREEN));
        Edificio4.setFill(Edificio4Gradiante);
        Edificio4.setStroke(Edificio4Gradiante);
        

        Rectangle Edificio5 = new Rectangle(40,130 );
        Edificio5.setLayoutX(160);
        Edificio5.setLayoutY(380);
        LinearGradient Edificio5Gradiante = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0.1f, Color.CORAL),new Stop(1.0f, Color.CHOCOLATE));
        Edificio5.setFill(Edificio5Gradiante);
        Edificio5.setStroke(Edificio5Gradiante);

        Path Edificio6 = new Path(
         new MoveTo(0,0),
         new LineTo(-100,30),
         new LineTo(-100,120),
         new LineTo(0,120),            
         new ClosePath()
       );        
        Edificio6.setLayoutX(660);
        Edificio6.setLayoutY(380); 
        LinearGradient Edificio6Gradiante = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0.1f, Color.CHOCOLATE),new Stop(1.0f, Color.DARKRED));
        Edificio6.setFill(Edificio6Gradiante); 
        Edificio6.setStroke(Edificio6Gradiante);

        
       Path Montaña = new Path(
         new MoveTo(0,0)
         ,new LineTo(33,5)
         ,new LineTo(38,5)
         ,new LineTo(43,2.5)
         ,new LineTo(48,0)
         ,new LineTo(53,0)
         ,new LineTo(63,2.5)
         ,new LineTo(73,5)
         ,new LineTo(83,0)
         ,new LineTo(88,0)
         ,new LineTo(93,-2.5)
         ,new LineTo(103,-5)
         ,new LineTo(108,-5)
         ,new LineTo(125,-10)
         ,new LineTo(135,-15)
         ,new LineTo(155,-15)
         ,new LineTo(165,-18)
         ,new LineTo(175,-14)
         ,new LineTo(195,-12)
         ,new LineTo(205,-10)
         ,new LineTo(215,-14)
         ,new LineTo(235,-8)
         ,new LineTo(255,-4)
         ,new LineTo(275,-2)
         ,new LineTo(295,0)
         ,new LineTo(305,-2)
         ,new LineTo(325,-0) //
         ,new LineTo(345,-6)
         ,new LineTo(365,0)
         ,new LineTo(385,2)
         ,new LineTo(405,0)
         ,new LineTo(425,2)
         ,new LineTo(445,-2)
         ,new LineTo(465,-6)
         ,new LineTo(485,-8)
         ,new LineTo(505,-8)
         ,new LineTo(525,-4)
         ,new LineTo(545,-10)
         ,new LineTo(565,-2)
         ,new LineTo(585,-0)
         ,new LineTo(605,2)
         ,new LineTo(625,6)
         ,new LineTo(645,-4)
         ,new LineTo(660,-2)
         ,new VLineTo(190)
         ,new HLineTo(-660)
         ,new ClosePath()
       );        
        Montaña.setLayoutX(0);
        Montaña.setLayoutY(310);         
         MontañaGradiante = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0.1f, Color.DARKSLATEGRAY),new Stop(1.0f, Color.GREEN));      
        Montaña.setFill(MontañaGradiante);
        Montaña.setStroke(MontañaGradiante);


       Path Montaña2 = new Path(
         new MoveTo(0,0)
         ,new LineTo(33,5)
         ,new LineTo(38,5)
         ,new LineTo(43,2.5)
         ,new LineTo(48,0)
         ,new LineTo(53,0)
         ,new LineTo(63,2.5)
         ,new LineTo(73,5)
         ,new LineTo(83,0)
         ,new LineTo(88,0)
         ,new LineTo(93,-2.5)
         ,new LineTo(103,-5)
         ,new LineTo(108,-5)
         ,new LineTo(125,-10)
         ,new LineTo(135,-15)
         ,new LineTo(155,-15)
         ,new LineTo(165,-18)
         ,new LineTo(175,-14)
         ,new LineTo(195,-12)
         ,new LineTo(205,-10)
         ,new LineTo(215,-14)
         ,new LineTo(235,-4)
         ,new LineTo(245,-4)
         ,new LineTo(255,-2)
         ,new LineTo(265,4)
         ,new LineTo(275,8)
         ,new LineTo(285,14)
         ,new LineTo(295,19)
         ,new LineTo(305,19)
         ,new LineTo(315,23)
         ,new LineTo(325,27)
         ,new LineTo(335,29)
         ,new LineTo(345,35)
         ,new LineTo(365,42)
         ,new LineTo(375,58)
         ,new LineTo(395,62)
         ,new LineTo(425,74)
         ,new LineTo(535,89)
         ,new LineTo(545,94)
         ,new LineTo(565,102)
         ,new LineTo(575,108)
         ,new LineTo(585,106)
         ,new LineTo(595,108)
         ,new LineTo(605,112)
         ,new LineTo(615,112)
         ,new VLineTo(220)
         ,new HLineTo(-615)
         ,new ClosePath()
       );        
        Montaña2.setLayoutX(0);
        Montaña2.setLayoutY(280);        
        LinearGradient Montaña2Gradiante = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0.1f,  Color.GRAY),new Stop(1.0f, Color.DARKGREEN));      
        Montaña2.setFill(Montaña2Gradiante);
        Montaña2.setStroke(Montaña2Gradiante);
 

        
         Path Montaña3 = new Path(
         new MoveTo(0,0)
         ,new LineTo(20,-2)
         ,new LineTo(30,-4)
         ,new LineTo(50,-2)
         ,new LineTo(70,-0)
         ,new LineTo(90, 5)
         ,new LineTo(110,10)
         ,new LineTo(120,20)
         ,new LineTo(140,30)
         ,new LineTo(160,40)
         ,new LineTo(180,40)
         ,new LineTo(200,44)
         ,new LineTo(220,55)
         ,new LineTo(240,60)
         ,new LineTo(260,62)
         ,new VLineTo(130)
         ,new HLineTo(-260)
         ,new ClosePath()
                 
       );        
        Montaña3.setLayoutX(0);
        Montaña3.setLayoutY(380);  
        LinearGradient Montaña3Gradiante = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0.1f, Color.WHITE),new Stop(1.0f, Color.DARKGREEN));              
        Montaña3.setFill(Montaña3Gradiante);
        Montaña3.setStroke(Montaña3Gradiante);
        
        Path Ventadas = new Path(
          new MoveTo(0,0)
         ,new LineTo(0, 80)
         ,new ClosePath()
         ,new MoveTo(5,0)                
         ,new LineTo(5,80)
         ,new ClosePath()
         ,new MoveTo(10,0)                
         ,new LineTo(10,80)
         ,new ClosePath()                
         ,new MoveTo(15,0)                
         ,new LineTo(15,80)
         ,new ClosePath() 
         ,new MoveTo(20,0)                
         ,new LineTo(20,80)
         ,new ClosePath() 
         ,new MoveTo(25,0)                
         ,new LineTo(25,80)
         ,new ClosePath() 
         ,new MoveTo(30,0)                
         ,new LineTo(30,80)
         ,new ClosePath()       
         ,new MoveTo(35,0)                
         ,new LineTo(35,80)
         ,new ClosePath()          
         ,new MoveTo(40,0)                
         ,new LineTo(40,80)
         ,new ClosePath() 
         ,new MoveTo(45,0)                
         ,new LineTo(45,80)
         ,new ClosePath() 
         ,new MoveTo(50,0)                
         ,new LineTo(50,80)
         ,new ClosePath() 
         ,new MoveTo(55,0)                
         ,new LineTo(55,80)
         ,new ClosePath() 
         ,new MoveTo(60,0)                
         ,new LineTo(60,80)
         ,new ClosePath() 
         ,new MoveTo(65,0)                
         ,new LineTo(65,80)
         ,new ClosePath() 
        );
        Ventadas.setLayoutX(10);
        Ventadas.setLayoutY(420);        
        Ventadas.setFill(Color.RED);
        Ventadas.setStrokeWidth(2);


        Path Ventadas1 = new Path(
          new MoveTo(0,0)
         ,new LineTo(0, 30)
         ,new ClosePath()
         ,new MoveTo(5,0)                
         ,new LineTo(5,30)
         ,new ClosePath()
         ,new MoveTo(10,0)                
         ,new LineTo(10,30)
         ,new ClosePath()                
         ,new MoveTo(15,0)                
         ,new LineTo(15,30)
         ,new ClosePath() 
         ,new MoveTo(20,0)                
         ,new LineTo(20,30)
         ,new ClosePath() 
         ,new MoveTo(25,0)                
         ,new LineTo(25,30)
         ,new ClosePath() 
         ,new MoveTo(30,0)                
         ,new LineTo(30,30)
         ,new ClosePath()       
         ,new MoveTo(35,0)                
         ,new LineTo(35,30)
         ,new ClosePath()          
         ,new MoveTo(40,0)                
         ,new LineTo(40,30)
         ,new ClosePath() 
         ,new MoveTo(45,0)                
         ,new LineTo(45,30)
         ,new ClosePath() 
         ,new MoveTo(50,0)                
         ,new LineTo(50,30)
         ,new ClosePath() 
                
        );
        Ventadas1.setLayoutX(125);
        Ventadas1.setLayoutY(465);        
        Ventadas1.setFill(Color.RED);
        Ventadas1.setStrokeWidth(2);

         Path Ventadas2 = new Path(
          new MoveTo(0,5)
         ,new HLineTo(30)
         ,new ClosePath()                
         ,new MoveTo(0,15)
         ,new HLineTo(30)
         ,new ClosePath()
         ,new MoveTo(0,25)
         ,new HLineTo(30)
         ,new ClosePath()         
         ,new MoveTo(0,35)
         ,new HLineTo(30)
         ,new ClosePath()         
         ,new MoveTo(0,45)
         ,new HLineTo(30)
         ,new ClosePath()
         ,new MoveTo(0,55)
         ,new HLineTo(30)
         ,new ClosePath()
         ,new MoveTo(0,65)
         ,new HLineTo(30)
         ,new ClosePath()
         ,new MoveTo(0,75)
         ,new HLineTo(30)
         ,new ClosePath()
         ,new MoveTo(0,85)
         ,new HLineTo(30)
         ,new ClosePath()
         ,new MoveTo(0,95)
         ,new HLineTo(30)
         ,new ClosePath()
         ,new MoveTo(0,105)
         ,new HLineTo(30)
         ,new ClosePath()
         ,new MoveTo(0,115)
         ,new HLineTo(30)
         ,new ClosePath()                 
         );
        Ventadas2.setLayoutX(165);
        Ventadas2.setLayoutY(385);        
        Ventadas2.setFill(Color.RED);
        Ventadas2.setStrokeWidth(4);
       
        
         Path Ventadas3 = new Path(
          new MoveTo(0,5)
         ,new HLineTo(50)
         ,new ClosePath()                
         ,new MoveTo(0,15)
         ,new HLineTo(50)
         ,new ClosePath()
         ,new MoveTo(0,25)
         ,new HLineTo(50)
         ,new ClosePath()         
         ,new MoveTo(0,35)
         ,new HLineTo(50)
         ,new ClosePath()         
         ,new MoveTo(0,45)
         ,new HLineTo(50)
         ,new ClosePath()
         ,new MoveTo(0,55)
         ,new HLineTo(50)
         ,new ClosePath()
         ,new MoveTo(0,65)
         ,new HLineTo(50)
         ,new ClosePath()

                
         );
        Ventadas3.setLayoutX(255);
        Ventadas3.setLayoutY(435);        
        Ventadas3.setFill(Color.RED);
        Ventadas3.setStrokeWidth(4);
        
        
         Path Ventadas4 = new Path(
          new MoveTo(5,0)
         ,new VLineTo(70)
         ,new ClosePath()                
         ,new MoveTo(15,0)
         ,new VLineTo(70)
         ,new ClosePath()
         ,new MoveTo(25,0)
         ,new VLineTo(70)
         ,new ClosePath()         
         ,new MoveTo(35,0)
         ,new VLineTo(70)
         ,new ClosePath()         
         ,new MoveTo(45,0)
         ,new VLineTo(70)
         ,new ClosePath()

         );
        Ventadas4.setLayoutX(255);
        Ventadas4.setLayoutY(435);        
        Ventadas4.setStroke(Edificio2Gradiante);
        Ventadas4.setStrokeWidth(4);
        
                
         Path Ventadas6 = new Path(
          new MoveTo(0,5)
         ,new HLineTo(60)
         ,new ClosePath()                
         ,new MoveTo(0,15)
         ,new HLineTo(60)
         ,new ClosePath()
         ,new MoveTo(0,25)
         ,new HLineTo(60)
         ,new ClosePath()         
         ,new MoveTo(0,35)
         ,new HLineTo(60)
         ,new ClosePath()         
         ,new MoveTo(0,45)
         ,new HLineTo(60)
         ,new ClosePath()
         ,new MoveTo(0,55)
         ,new HLineTo(60)
         ,new ClosePath()
         ,new MoveTo(0,65)
         ,new HLineTo(60)
         ,new ClosePath()
         ,new MoveTo(0,75)
         ,new HLineTo(60)
         ,new ClosePath()
         ,new MoveTo(0,85)
         ,new HLineTo(60)
         ,new ClosePath()                
         );
        Ventadas6.setLayoutX(280);
        Ventadas6.setLayoutY(415);        
        Ventadas6.setFill(Color.RED);
        Ventadas6.setStrokeWidth(4);
        
        
         Path Ventadas7 = new Path(                

          new MoveTo(83,30)
         ,new HLineTo(60)
         ,new ClosePath()         
         ,new MoveTo(30,45)
         ,new HLineTo(87)
         ,new ClosePath()         
         ,new MoveTo(0,60)
         ,new HLineTo(87)
         ,new ClosePath()
         ,new MoveTo(0,75)
         ,new HLineTo(87)
         ,new ClosePath()
         ,new MoveTo(0,90)
         ,new HLineTo(87)
         ,new ClosePath()
         ,new MoveTo(0,105)
         ,new HLineTo(87)
         ,new ClosePath()
         ,new MoveTo(0,120)
         ,new HLineTo(87)
         ,new ClosePath()                
         );
        Ventadas7.setLayoutX(567);
        Ventadas7.setLayoutY(368);        
        Ventadas7.setFill(Color.RED);
        Ventadas7.setStrokeWidth(8);
        
        DiaNoche = new Rectangle(660,500);
        LinearGradient DiaGradiante = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0.1f, Color.SKYBLUE),new Stop(1.0f, Color.WHITE));
        DiaNoche.setFill(DiaGradiante);
    
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
        Nubes3.setLayoutX(0);
        Nubes3.setLayoutY(0);

         Shape Nubes4  = Shape.union(Nubes2,Nube4);
        LinearGradient Nube2Gradiante = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0.1f, Color.WHITE),new Stop(1.0f, Color.DIMGRAY));
         Nubes4.setFill(Nube2Gradiante);
         Nubes4.setEffect(new GaussianBlur());         
         Nubes4.setLayoutX(200);
         Nubes4.setLayoutY(70);

         Shape Nubes5  = Shape.union(Nubes2,Nube4);
         LinearGradient Nube3Gradiante = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0.1f, Color.WHITE),new Stop(1.0f, Color.DIMGRAY));
         Nubes5.setFill(Nube3Gradiante);
         Nubes5.setEffect(new GaussianBlur());         
         Nubes5.setLayoutX(260);
         Nubes5.setLayoutY(20); 
         
         Shape Nubes6  = Shape.union(Nubes2,Nube4);
         LinearGradient Nube4Gradiante = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0.1f, Color.WHITE),new Stop(1.0f, Color.DIMGRAY));
         Nubes6.setFill(Nube4Gradiante);
         Nubes6.setEffect(new GaussianBlur());         
         Nubes6.setLayoutX(420);
         Nubes6.setLayoutY(100);          

        inicioFallido(Nubes6);
        inicioFallido(Nubes5);
        inicioFallido(Nubes4);
        inicioFallido(Nubes3);

        
        Circle Sol = new Circle();
        Sol.setRadius(60.0f);
        Sol.setFill(Color.GOLD);
        Sol.setLayoutX(400);
        Sol.setLayoutY(100);        
        Sol.setEffect(new GaussianBlur());

         
        Circle Luna = new Circle();
        Luna.setRadius(60.0f);
        Luna.setLayoutX(400);
        Luna.setLayoutY(100);
        Circle LunaMedia = new Circle();
        LunaMedia.setRadius(40.0f);
        LunaMedia.setLayoutX(420);
        LunaMedia.setLayoutY(90);        
        LunaMedia.setFill( Color.GOLD);
        Shape MediaLuna = Shape.subtract(Luna,LunaMedia);
        MediaLuna.setFill(Color.GOLD);
        MediaLuna.setEffect(new Bloom());
        MediaLuna.setLayoutX(5);
        MediaLuna.setLayoutY(5);

        
//_____________________________________________________________________________         


    FillTransition fillTransition = new FillTransition(Duration.seconds(60));
    fillTransition.setFromValue(Color.DARKBLUE);
    fillTransition.setToValue(Color.SKYBLUE);
    fillTransition.setCycleCount(1);
    SequentialTransition st = new SequentialTransition();
    st.setNode(DiaNoche);
    st.getChildren().add(fillTransition);
    st.play();

    
    FillTransition fillTransition2 = new FillTransition(Duration.seconds(60));
    fillTransition2.setFromValue(Color.SKYBLUE);
    fillTransition2.setToValue(Color.DARKBLUE);
    fillTransition2.setCycleCount(1);
    SequentialTransition st2 = new SequentialTransition();
    st2.setNode(DiaNoche);
    st2.getChildren().add(fillTransition2);
    
    
    KeyValue InitKeyValue0 = new KeyValue(Sol.translateXProperty(), 660);
    KeyFrame InitFrame0 = new KeyFrame(Duration.ZERO, InitKeyValue0);
    KeyValue EndKeyValue0 = new KeyValue(Sol.translateXProperty(),660);
    KeyFrame EndFrame0 = new KeyFrame(Duration.seconds(1), EndKeyValue0);
    Timeline Time0 = new Timeline(InitFrame0,EndFrame0);
    Time0.setCycleCount(Integer.valueOf(1));
    Time0.play();
    
    
    KeyValue InitKeyValue = new KeyValue(MediaLuna.translateXProperty(), -70);
    KeyFrame InitFrame = new KeyFrame(Duration.ZERO, InitKeyValue);
    KeyValue EndKeyValue = new KeyValue(MediaLuna.translateXProperty(),330);
    KeyFrame EndFrame = new KeyFrame(Duration.seconds(60), EndKeyValue);
    Timeline Time = new Timeline(InitFrame,EndFrame);
    Time.setCycleCount(Integer.valueOf(1));
    Time.play();
    reproducirSonido(3);
    
    KeyValue InitKeyValue2 = new KeyValue(Sol.translateXProperty(), -470);
    KeyFrame InitFrame2 = new KeyFrame(Duration.ZERO, InitKeyValue2);
    KeyValue EndKeyValue2 = new KeyValue(Sol.translateXProperty(),330);
    KeyFrame EndFrame2 = new KeyFrame(Duration.seconds(120), EndKeyValue2);
    Timeline Time2 = new Timeline(InitFrame2,EndFrame2);
    Time2.setCycleCount(Integer.valueOf(1));

    KeyValue InitKeyValue3 = new KeyValue(MediaLuna.translateXProperty(), -470);
    KeyFrame InitFrame3 = new KeyFrame(Duration.ZERO, InitKeyValue3);
    KeyValue EndKeyValue3 = new KeyValue(MediaLuna.translateXProperty(),330);
    KeyFrame EndFrame3 = new KeyFrame(Duration.seconds(120), EndKeyValue3);
    Timeline Time3 = new Timeline(InitFrame3,EndFrame3);
    Time3.setCycleCount(Integer.valueOf(1));

    
   
    
    
        Stage.setTitle( Minutos.toString() + " | PM");
                
       
       
        
        Group cir = new Group();
        AnchorPane root = new AnchorPane();
        Random rand = new Random();


                Timeline timeline = new Timeline(new KeyFrame(
        Duration.seconds(1), new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
                        
            
            Segundos++;
            System.out.println(Segundos);          

            //si es mayor que 9 marque 1 minuto
            if ( Segundos > 9 ) {
           
            Segundos=0;
            Minutos++;   
            System.out.println("Minutos " +Minutos);
            
            
            if (Minutos== 6) {
                Time3.play();

            }        
                if (Minutos== 4) {
                st2.play();
               Nube(Nubes6);
               Nube(Nubes5);
               Nube(Nubes4);
               Nube(Nubes3);
               Montaña2.setEffect(new GaussianBlur());
               Montaña.setEffect(new GaussianBlur());               
               Montaña3.setEffect(new GaussianBlur());                

                       for (int i = 0; i < 50; i++) {
            int r = rand.nextInt(255);
            int g = rand.nextInt(255);
            int b = rand.nextInt(255);
      
            
       Estrella = new Path(
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

       
       Estrella1 = new Path(
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

       
       
       
          //el circulo inicialmente es muy pequeño y el color es aleatorio
             c = new Circle(0.1, Color.rgb(r, g, b, 0.5));
            //Se genera la posición del circulo aletaoriamente
            c.setCenterX(rand.nextInt(800));//genera un numero aleatorio entre 0 y 800
            c.setCenterY(rand.nextInt(500));
            Timeline t = new Timeline();
            t.setCycleCount(Timeline.INDEFINITE);
            t.setAutoReverse(true);
            //la duración es aleatoria
            Duration d = Duration.seconds(rand.nextInt(30) + 15);
            //la propiedad que cambia es el readio
            //se define el radio final como aleatorio
            KeyValue kv = new KeyValue(c.radiusProperty(), rand.nextInt(100));
            //se agrega el frame final

        

       Estrella.setLayoutX(rand.nextInt(800));
       Estrella.setLayoutY(rand.nextInt(500));
       Estrella.setStroke(Color.TRANSPARENT);
       Estrella.setFill(Color.TRANSPARENT);
      // Estrella.setEffect(new Bloom());
       Estrella1.setLayoutX(rand.nextInt(800));
       Estrella1.setLayoutY(rand.nextInt(500));
       Estrella1.setStroke(Color.TRANSPARENT);       
       Estrella1.setFill(Color.TRANSPARENT);
     //  Estrella1.setEffect(new Bloom());
      
            KeyFrame kf = new KeyFrame(d, kv);
            t.getKeyFrames().add(kf);
            cir.getChildren().addAll(Estrella,Estrella1);
            t.play();
            
          Efecto_Estrella(Estrella);
          Efecto_Estrella2(Estrella1);
          EstrellaXD(Estrella);
          EstrellaXD2(Estrella1);       


       }
               
               
                }

                if (Minutos == 12) {
                 st.play();
                }
                
                if (Minutos == 9) {
                   reproducirSonido(2);    
                }
                
            if ( Minutos > 12) {                
                Entrada++;  
                Stage.setTitle( Entrada.toString() + " | AM");
                    
                
                if (Entrada == 5) {
                  reproducirSonido(0);
                }else if (Entrada == 9) {
                  reproducirSonido(1);                    
                }
                

                if (Entrada == 6) {
                   Time2.play();
                   Nube(Nubes6);
                   Nube(Nubes5);
                   Nube(Nubes4);
                   Nube(Nubes3);
                   Montaña2.setEffect(null);
                   Montaña3.setEffect(null);
                   Montaña.setEffect(null);

                }
                
                
                if (Entrada ==12) {
                Minutos=0;    
                Entrada=0;    
        
                
                }
    
                
            }else if (Minutos > 0 && Minutos < 13) {
                    
            Stage.setTitle( Minutos.toString() + " | PM");
    
            }
            
     
            
            }
        }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play(); 
        
        
        ADD.getChildren().addAll(
                DiaNoche,Reloj,cir,Sol,MediaLuna,Nubes6,Nubes5,Nubes4,Nubes3,Montaña,Montaña2,Montaña3,Edificio6,Edificio5,Ventadas2,Edificio4,Edificio3,
                Ventadas6,Edificio2,BordeD,BordeI,Poste,Bandera,Bandera2,Coltejer,Coltejer2,Ventana,Medio,TEdificio,Edificio,Ventadas,Ventadas1,
                Ventadas3,Ventadas4,Ventadas7);


        Scene scene = new Scene( ADD, 660, 500);
        Stage.setScene(scene);
        Stage.show();
    }
    
    
public static void main(String[] Args){
    launch(Args);
}    

public void Nube(Shape Nubes){
    
    FillTransition fillTransition2 = new FillTransition(Duration.seconds(30));
    fillTransition2.setFromValue(Color.TRANSPARENT);
    fillTransition2.setToValue(Color.WHITESMOKE);
    fillTransition2.setCycleCount(1);
   // SequentialTransition st2 = new SequentialTransition();
   // st2.setNode(Nubes);
  //  st2.getChildren().add(fillTransition2);
  //  st2.play();
    
    
    KeyValue InitKeyValueNube = new KeyValue(Nubes.translateXProperty(), -70);
    KeyFrame InitFrameNube = new KeyFrame(Duration.ZERO, InitKeyValueNube);
    KeyValue EndKeyValueNube = new KeyValue(Nubes.translateXProperty(),330);
    KeyFrame EndFrameNube = new KeyFrame(Duration.seconds(60), EndKeyValueNube);
    Timeline TimeNube = new Timeline(InitFrameNube,EndFrameNube);
    TimeNube.setCycleCount(Integer.valueOf(1));
  //  TimeNube.play();
   
    FillTransition fillTransition = new FillTransition(Duration.seconds(10));
    fillTransition.setFromValue(Color.WHITESMOKE);
    fillTransition.setToValue(Color.TRANSPARENT);
    fillTransition.setCycleCount(1);
    SequentialTransition st = new SequentialTransition();
    st.setNode(Nubes);
    st.getChildren().addAll(fillTransition2,TimeNube,fillTransition);
    st.play();



} 


public void inicioFallido(Shape Nubes){
  //  KeyValue InitKeyValue0 = new KeyValue(Nubes.translateXProperty(), -70);
  //  KeyFrame InitFrame0 = new KeyFrame(Duration.ZERO, InitKeyValue0);
  //  KeyValue EndKeyValue0 = new KeyValue(Nubes.translateXProperty(),660);
 //   KeyFrame EndFrame0 = new KeyFrame(Duration.seconds(1), EndKeyValue0);
 //   Timeline Time0 = new Timeline(InitFrame0,EndFrame0);
 //   Time0.setCycleCount(Integer.valueOf(1));
  //  Time0.play();

    KeyValue InitKeyValue0 = new KeyValue(Nubes.translateXProperty(), 660);
    KeyFrame InitFrame0 = new KeyFrame(Duration.ZERO, InitKeyValue0);
    KeyValue EndKeyValue0 = new KeyValue(Nubes.translateXProperty(),660);
    KeyFrame EndFrame0 = new KeyFrame(Duration.seconds(1), EndKeyValue0);
    Timeline Time0 = new Timeline(InitFrame0,EndFrame0);
    Time0.setCycleCount(Integer.valueOf(1));
    Time0.play();    
    
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

    public void Efecto_Estrella2( Path Estrella1 ){
    
    ScaleTransition scaleTransition = new ScaleTransition(
    Duration.millis(1000), Estrella1);
    scaleTransition.setToX(1.4f);
    scaleTransition.setToY(1.4f);
    scaleTransition.setCycleCount( 4 );
    scaleTransition.setAutoReverse( true );
    ParallelTransition parallelTransition = new ParallelTransition();
    parallelTransition.getChildren().addAll( scaleTransition);
    parallelTransition.setCycleCount(Timeline.INDEFINITE); 
    parallelTransition.play();
   
    } 

public void EstrellaXD(Path Estrella1 ){
    
    FillTransition fillTransition2 = new FillTransition(Duration.seconds(80));
    fillTransition2.setFromValue(Color.TRANSPARENT);
    fillTransition2.setToValue(Color.WHITE);
    fillTransition2.setCycleCount(1);
    
   
    FillTransition fillTransition = new FillTransition(Duration.seconds(80));
    fillTransition.setFromValue(Color.WHITE);
    fillTransition.setToValue(Color.TRANSPARENT);
    fillTransition.setCycleCount(1);
    SequentialTransition st = new SequentialTransition();
    st.setNode(Estrella1);
    st.getChildren().addAll(fillTransition2,fillTransition);
    st.play();



} 

public void EstrellaXD2(Path Estrella ){
    
    FillTransition fillTransition2 = new FillTransition(Duration.seconds(80));
    fillTransition2.setFromValue(Color.TRANSPARENT);
    fillTransition2.setToValue(Color.YELLOW);
    fillTransition2.setCycleCount(1);
   
    FillTransition fillTransition = new FillTransition(Duration.seconds(80));
    fillTransition.setFromValue(Color.YELLOW);
    fillTransition.setToValue(Color.TRANSPARENT);
    fillTransition.setCycleCount(1);
    SequentialTransition st = new SequentialTransition();
    st.setNode(Estrella);
    st.getChildren().addAll(fillTransition2,fillTransition);
    st.play();

} 

    MediaPlayer mediaPlayer;
    Media media;

    public void reproducirSonido(int opcion) {
        java.nio.file.Path fileSonido = null;
        if (opcion == 0) {
          fileSonido = Paths.get("").toAbsolutePath().resolve("src\\practica3\\Ama.mp3");
        } else if (opcion == 1){
          fileSonido = Paths.get("").toAbsolutePath().resolve("src\\practica3\\Med.mp3");
        }else if (opcion == 2) {
          fileSonido = Paths.get("").toAbsolutePath().resolve("src\\practica3\\Noc.mp3");
        }else if (opcion == 3) {
          fileSonido = Paths.get("").toAbsolutePath().resolve("src\\practica3\\Mad.mp3");
  
        }
        System.out.println("ruta" + fileSonido.toString());
        if (Files.exists(fileSonido)) {
            System.out.println("existe");
            media = new Media(fileSonido.toUri().toString());
            mediaPlayer = new MediaPlayer(media);
            //mediaPlayer.setAutoPlay(true);
            mediaPlayer.play();
            mediaPlayer.setCycleCount(1);//reproducir infinitamente
            mediaPlayer.setOnError(() -> System.out.println(mediaPlayer.getError().getMessage()));

            // Create a 400X300 MediaView
            /*MediaView mediaView = new MediaView(mediaPlayer);
            mediaView.setFitWidth(400);
            mediaView.setFitHeight(300);*/
        } else {
            System.out.println("No existe" + fileSonido.toString());
        }
    }


}
