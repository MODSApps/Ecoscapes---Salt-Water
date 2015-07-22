package com.example.modsexplorer;

import ketai.net.nfc.KetaiNFC;
import ketai.ui.KetaiGesture;
import processing.core.PApplet;
import processing.core.PImage;
import android.view.MotionEvent;

public class MODSExplorerMap extends PApplet {

  int tagValue;
  int ptagValue;
  int mapToggle;
  int imageNumber;
  int pictureCount;
  KetaiNFC ketaiNFC;
  float mapX, mapY, mapWidth, mapHeight;
  float zoomX, zoomY;
  PImage mapFloor1, mapFloor2; 
  PImage aviationStation1, aviationStation2, aviationStation3, aviationStation4, aviationStation5;
  PImage discoveryCenter1;
  PImage ecoScapes1, ecoScapes2, ecoScapes3, ecoScapes4, ecoScapes5, ecoScapes6, ecoScapes7, ecoScapes8;
  PImage everglades1, everglades2;
  PImage gizmoCity1;
  PImage goGreen1, goGreen2, goGreen3;
  PImage otter1, otter2;
  PImage powerfulYou1, powerfulYou2, powerfulYou3, powerfulYou4, powerfulYou5, powerfulYou6, powerfulYou7;
  PImage prehistoric1, prehistoric2;
  PImage stormCenter1, stormCenter2, stormCenter3, stormCenter4, stormCenter5, stormCenter6;
  PImage waterStory1, waterStory2, waterStory3, waterStory4, waterStory5, waterStory6, waterStory7;
  PImage arrowLeft, arrowRight;
  PImage homeButton;
  PImage backButton;
  KetaiGesture gesture;


public void setup() {   
    
    //Sets orientation and instantiates variables 
  
    smooth();
    imageMode(CENTER);
    orientation(PORTRAIT);
    textSize(36);
    textAlign(CENTER, BOTTOM);
    fill(255);
    mapWidth = width;
    mapHeight = 9*height/10;
    mapX = mapWidth/2;
    mapY = mapHeight/2;
    mapToggle = 1;
    tagValue = 0;
    ptagValue = 0;
    imageNumber = 1;
    pictureCount = 0;
    gesture = new KetaiGesture(this);
    
    //establishes images as part of the PImage Class
    
    homeButton = new PImage();
    backButton = new PImage();
    mapFloor1 = new PImage();
    mapFloor2 = new PImage();
    aviationStation1 = new PImage();
    aviationStation2 = new PImage();
    aviationStation3 = new PImage();
    aviationStation4 = new PImage();
    aviationStation5 = new PImage();
    discoveryCenter1 = new PImage();
    ecoScapes1 = new PImage();
    ecoScapes2 = new PImage();
    ecoScapes3 = new PImage();
    ecoScapes4= new PImage();
    ecoScapes5 = new PImage();
    ecoScapes6 = new PImage();
    ecoScapes7 = new PImage();
    ecoScapes8 = new PImage();
    everglades1 = new PImage();
    everglades2 = new PImage();
    gizmoCity1 = new PImage();
    goGreen1 = new PImage();
    goGreen2 = new PImage();
    goGreen3 = new PImage();
    otter1 = new PImage();
    otter2 = new PImage();
    powerfulYou1 = new PImage();
    powerfulYou2 = new PImage();
    powerfulYou3 = new PImage();
    powerfulYou4 = new PImage();
    powerfulYou5 = new PImage();
    powerfulYou6 = new PImage();
    powerfulYou7 = new PImage();
    prehistoric1 = new PImage();
    prehistoric2 = new PImage();
    stormCenter1 = new PImage();
    stormCenter2 = new PImage();
    stormCenter3 = new PImage();
    stormCenter4 = new PImage();
    stormCenter5 = new PImage();
    stormCenter6 = new PImage();
    waterStory1 = new PImage();
    waterStory2 = new PImage();
    waterStory3 = new PImage();
    waterStory4 = new PImage();
    waterStory5 = new PImage();
    waterStory6 = new PImage();
    waterStory7 = new PImage();
    arrowLeft = new PImage();
    arrowRight = new PImage();
    
    homeButton = loadImage("home button_2.png");
    backButton = loadImage("Back Button.png");
    mapFloor1 = loadImage("mapFloor1.png");
    mapFloor2 = loadImage("mapFloor2.png");
    arrowLeft = loadImage("Arrow Left.png");
    arrowRight = loadImage("Arrow Right.png");
    aviationStation1 = loadImage("aviationStation_1.JPG");
    aviationStation2 = loadImage("aviationStation_2.JPG");
    aviationStation3 = loadImage("aviationStation_3.JPG");
    aviationStation4 = loadImage("aviationStation_4.JPG");
    aviationStation5 = loadImage("aviationStation_5.JPG");
    discoveryCenter1 = loadImage("discoveryCenter_1.JPG");
    ecoScapes1 = loadImage("ecoScapes_1.JPG");
    ecoScapes2 = loadImage("ecoScapes_2.JPG");
    ecoScapes3 = loadImage("ecoScapes_3.JPG");
    ecoScapes4= loadImage("ecoScapes_4.JPG");
    ecoScapes5 = loadImage("ecoScapes_5.JPG");
    ecoScapes6 = loadImage("ecoScapes_6.JPG");
    ecoScapes7 = loadImage("ecoScapes_7.JPG");
    ecoScapes8 = loadImage("ecoScapes_8.JPG");
    everglades1 = loadImage("everglades_1.JPG");
    everglades2 = loadImage("everglades_2.JPG");
    gizmoCity1 = loadImage("gizmoCity_1.JPG");
    goGreen1 = loadImage("goGreen_1.JPG");
    goGreen2 = loadImage("goGreen_2.JPG");
    goGreen3 = loadImage("goGreen_3.JPG");
    otter1 = loadImage("otter_1.png");
    otter2 = loadImage("otter_2.JPG");
    powerfulYou1 = loadImage("powerfulYou_1.JPG");
    powerfulYou2 = loadImage("powerfulYou_2.JPG");
    powerfulYou3 = loadImage("powerfulYou_3.JPG");
    powerfulYou4 = loadImage("powerfulYou_4.JPG");
    powerfulYou5 = loadImage("powerfulYou_5.JPG");
    powerfulYou6 = loadImage("powerfulYou_6.JPG");
    powerfulYou7 = loadImage("powerfulYou_7.JPG");
    prehistoric1 = loadImage("prehistoric_1.png");
    prehistoric2 = loadImage("prehistoric_2.JPG");
    stormCenter1 = loadImage("stormCenter_1.JPG");
    stormCenter2 = loadImage("stormCenter_2.JPG");
    stormCenter3 = loadImage("stormCenter_3.JPG");
    stormCenter4 = loadImage("stormCenter_4.JPG");
    stormCenter5 = loadImage("stormCenter_5.png");
    stormCenter6 = loadImage("stormCenter_6.JPG");
    waterStory1 = loadImage("waterStory_1.JPG");
    waterStory2 = loadImage("waterStory_2.JPG");
    waterStory3 = loadImage("waterStory_3.JPG");
    waterStory4 = loadImage("waterStory_4.JPG");
    waterStory5 = loadImage("waterStory_5.JPG");
    waterStory6 = loadImage("waterStory_6.JPG");
    waterStory7 = loadImage("waterStory_7.JPG");
}

public void draw() {

if(tagValue != ptagValue) {
  imageNumber = 1;
}

if(tagValue == 0){
	background(255);
	pushMatrix();
	if(mapToggle == 1) {
		  image(mapFloor1, mapX, mapY, mapWidth, mapHeight);
		} else if(mapToggle == 2) {
		  image(mapFloor2, mapX, mapY, mapWidth, mapHeight); 
		}
	popMatrix();
}

switch(tagValue) {
case 0:
break;

case 1:
fill(0);
pictureCount = 5;
aviationStation();
break;

case 2:
fill(0);	
pictureCount = 1;
discoveryCenter();
break;

/*case 3:
fill(0);
pictureCount = 0;
discoveryLab();
break;
*/
case 4:
fill(0);
pictureCount = 8;
ecoScapes();
break;

case 5: 
fill(0);
pictureCount = 2;
everglades();
break;

case 6:
fill(0);
pictureCount = 1;
gizmoCity();
break;

case 7:
fill(0);
pictureCount = 3;
goGreen();
break;

case 8:
fill(0);
pictureCount = 2;
otter();
break;

case 9:
fill(0);
pictureCount = 7;
powerfulYou();
break;

case 10:
fill(0);
pictureCount = 2;
prehistoric();
break;

case 11:
fill(0);
pictureCount = 6;
stormCenter();
break;

case 12:
fill(0);
pictureCount = 7;
waterStory();
break;

}

fill(255, 247, 114);
rect(0, 9*height/10, width, height/10);
image(homeButton, width/2, 19*height/20, width/7, height/10+2);



if(tagValue != 0) {
  image(arrowLeft, width/20, 19*height/20, width/10, height/10);
  image(arrowRight, 19*width/20, 19*height/20, width/10, height/10);
  image(backButton, width/14, height/20, width/7, height/10);
}

ptagValue = tagValue;
}
public void mousePressed() {
  if(tagValue != 0 && mouseX>0 && mouseX<width/10 && mouseY>9*height/10 && mouseY<height) {
      if(imageNumber>1) {
        imageNumber--;
      } else {
        imageNumber = pictureCount;
      }
    }
    if(tagValue != 0 && mouseX>9*width/10 && mouseX<width && mouseY>9*height/10 && mouseY<height) {
      if(imageNumber<pictureCount) {
        imageNumber++;
      } else {
        imageNumber = 1;
      }
    }
    if(tagValue != 0 && mouseX>0 && mouseX<width/7 && mouseY>0 && mouseY<height/10) {
    	mapToggle = 1;
        mapWidth = width;
        mapHeight = 9*height/10; 
        mapX = mapWidth/2;
        mapY = mapHeight/2;
        tagValue = 0;
    }
    
    // Exit screen
    if(mouseX>3*width/7 && mouseX<4*width/7 && mouseY>9*height/10 && mouseY<height) {
    	exit();
    }
}

  public void onTap(float x, float y) {
      zoomX = mapWidth/width;
    zoomY = mapHeight/(9*height/10);
      
      if(mapToggle == 1 && mouseY < 9*height/10) {
        
    	  if(mouseX > ((((1748-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((2416-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1410-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1612-1650)*height/3300)*zoomY)+mapY)) {

              mapToggle = 2;
                mapWidth = width;
                mapHeight = 9*height/10; 
                mapX = mapWidth/2;
                mapY = mapHeight/2;
          
        }
        
        if(mouseX > ((((866-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1152-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((450-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((856-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 5;
          
        }
        if(mouseX > ((((866-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1152-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((866-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1206-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 11;
          
        }
        if(mouseX > ((((866-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1152-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1222-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1566-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 7;
          
        }
        if(mouseX > ((((866-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1152-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1580-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((2040-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 2;
          
        }
        if(mouseX > ((((1270-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1464-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1134-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1852-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 4;
          
        }
        if(mouseX > ((((1466-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1634-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1258-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1852-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 4;
          
        }
        if(mouseX > ((((1638-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1752-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1370-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((2090-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 4;
          
        }
        if(mouseX > ((((1270-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1464-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((688-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1130-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 12;
          
        }
        if(mouseX > ((((1466-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1634-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((688-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1258-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 12;
          
        }
        if(mouseX > ((((1638-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1752-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((688-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1368-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 12;
          
        }
        if(mouseX > ((((1270-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1522-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((332-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((682-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 10;
          
        }
        if(mouseX > ((((1534-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1754-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((414-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((682-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 8;
          
        }
      } else if(mapToggle == 2 && mouseY<9*height/10) {
          
          if(mouseX > ((((1748-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((2416-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1410-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1612-1650)*height/3300)*zoomY)+mapY)) {

            mapToggle = 1;
              mapWidth = width;
              mapHeight = 9*height/10; 
              mapX = mapWidth/2;
              mapY = mapHeight/2;
              
              
            }
        
        if(mouseX > ((((386-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((778-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1752-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((2502-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 1;
          
        }
        if(mouseX > ((((386-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((778-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1350-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1744-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 6;
          
        }
        if(mouseX > ((((866-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1284-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1150-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1828-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 9;
          
        }
        if(mouseX > ((((1392-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1716-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1310-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1542-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 3;
          
        }
        if(mouseX > ((((1298-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1696-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((340-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((734-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 8;
          
        }
        }


  }
  
  public void mouseDragged() {
      if((mouseX-pmouseX) < 0) { //swipe to the left
        if((mapX + mapWidth/2) > width) {
          mapX += mouseX-pmouseX;
        } 
      } else { //swipe to the right
        if((mapX-mapWidth/2) < 0) {
          mapX += mouseX-pmouseX;
        }
      }
      
      if((mouseY-pmouseY) < 0) { //swipe up
        if((mapY + mapHeight/2) > 9*height/10) {
          mapY += mouseY-pmouseY;
        }
      } else { //swipe down
        if(mapY-(mapHeight/2) < 0)  {
          mapY += mouseY-pmouseY;
        }
     } 
      
    }
  public void onPinch(float x, float y, float d) {
      mapWidth = constrain(mapWidth + 2 * d, width, 2*width);
      mapHeight = constrain(mapHeight + 2 * (mapHeight/mapWidth) * d, 9*height/10, 2*9*height/10);
      }
  public void aviationStation() {
    background(255,247,114);
    switch(imageNumber) {
    case 1:
      text("Climb into three different replica cockpit simulators and practice your piloting skills by test “flying” the LockHeed Martin F/35 Joint Strike fighter (the newest jet fighter now being developed), the Edge 540 (an aerobatic single engine aircraft used in the worldwide Red Bull Air Race), and the Vought F4U Corsair (argued to be one of the finest aircrafts of WWII).", 0,0,width, 8*height/10);
      image(aviationStation1, width/2, height/2);
      break;
    case 2:
      text("Experiment with the power of air pressure by launching a projectile in parabolic motion.", 0,0,width, 8*height/10);
      image(aviationStation2, width/2, height/2);
      break;
    case 3:
      text("Explore space in the Mars Rover simulator and view the extraordinary surface of Mars.", 0,0,width, 8*height/10);
      image(aviationStation3, width/2, height/2);
      break;
    case 4:
      text("Ride the MaxFlight full motion simulator! With 360 – degree pitch, roll and spin technology, visitors will be able to experience adrenaline-filled aerial races and stunt flying (You must be at least 48” tall to ride the MaxFlight motion simulator).", 0,0,width, 8*height/10);
      image(aviationStation4, width/2, height/2);
      break;
    case 5:
    	text("Examine the controls of an airplane and learn how each control affects the plane.", 0,0,width, 8*height/10);
      image(aviationStation5, width/2, height/2);
    }
  }
  public void discoveryCenter() {
    background(255,247,114);
    text("Go to the discovery center to explore a world of fun and adventure. Great for small children!", 0,0,width, 8*height/10);
    image(discoveryCenter1, width/2, height/2);
  }
  public void discoveryLab() {
    background(255,247,114);
  }
  public void ecoScapes() {
    background(255,247,114);

    switch(imageNumber) {
    case 1:
    	text("This exhibit contains many species of fish. You can look at each tank and learn about the fish. ", 0,0,width, 8*height/10);
      image(ecoScapes1, width/2, height/2);
      break;
    case 2:
    	text("The exhibit also contains a reptile area.", 0,0,width, 8*height/10);
      image(ecoScapes2, width/2, height/2);
      break;
    case 3:
    	text("Go upstairs to see even more animals.", 0,0,width, 8*height/10);
      image(ecoScapes3, width/2, height/2);
      break;
    case 4:
    	text("Make sure to look around you! There are many different types of animals above you.", 0,0,width, 8*height/10);
      image(ecoScapes4, width/2, height/2);
      break;
    case 5:
    	text("Walk down the stairs to look at several species of fish. ", 0,0,width, 8*height/10);
      image(ecoScapes5, width/2, height/2);
      break;
    case 6:
    	text("Continue walking down the pathway to see each tank.", 0,0,width, 8*height/10);
      image(ecoScapes6, width/2, height/2);
      break;
    case 7:
    	text("Walk along the edge of the exhibit to see each tank containing fish, reptiles", 0,0,width, 8*height/10);
      image(ecoScapes7, width/2, height/2);
      break;
    case 8:
    	text("Discovery how aquifers work with this interactive diagram. Click the buttons on the wall to see each step of the process.", 0,0,width, 8*height/10);
      image(ecoScapes8, width/2, height/2);
    }
  }
  public void everglades() {
    background(255,247,114);

    switch(imageNumber) {
    case 1:
    	text("Enter here for the Everglades Airboat Adventure. Make sure to read the panels on the wall to learn about different animals found in the everglades. ", 0,0,width, 8*height/10);
      image(everglades1, width/2, height/2);
      break;
    case 2:
    	text("Once inside the Everglades Airboat Adventure, discover how it feels to ride through the everglades on an airboat. You can view images on the screen and feel the airboat rock as you navigate.", 0,0,width, 8*height/10);
      image(everglades2, width/2, height/2);
      break;
    }
  }
    
  public void gizmoCity() {
    background(255,247,114);
    text("Work your way through Gizmo City where you can learn about mechanical advantage and how simple devices work. ", 0,0,width, 8*height/10);
    image(gizmoCity1, width/2, height/2);
  }
  public void goGreen() {
    background(255,247,114);

    switch(imageNumber) {
    case 1:
    	text("Use a variety of computers throughout the Go Green exhibit to learn more about the environment and how to preserve it.", 0,0,width, 8*height/10);
      image(goGreen1, width/2, height/2);
      break;
    case 2:
    	text("Use your strength to create enough electricity to power the different types of light bulbs. Notice the amount of electricity required changes based on the type of light bulb. ", 0,0,width, 8*height/10);
      image(goGreen2, width/2, height/2);
      break;
    case 3:
    	text("Meet Harry the Heap, the recycling robot. He will teach you about the importance of recycling, safe waste disposal, and making choices for a sustainable lifestyle.", 0,0,width, 8*height/10);
      image(goGreen3, width/2, height/2);
      break;
    }
  }
  public void otter() {
    background(255,247,114);

    switch(imageNumber) {
    case 1:
    	text("Active both day and night, North American river otters have a curious and animated nature, entertaining with a wide variety of sliding, hunting and chasing behaviors.", 0,0,width, 8*height/10);
      image(otter1, width/2, height/2);
      break;
    case 2:
    	text("You can view the otters from both the first and second floors. ", 0,0,width, 8*height/10);
      image(otter2, width/2, height/2);
      break;
    }
  }
  public void powerfulYou() {
    background(255,247,114);

    switch(imageNumber) {
    case 1:
    	text("Get inside and discover what it’s like to drive an ambulance. Great for small children!", 0,0,width, 8*height/10);
      image(powerfulYou1, width/2, height/2);
      break;
    case 2:
    	text("View each wonderfully complex mechanism of the human body with this interactive exhibit.", 0,0,width, 8*height/10);
      image(powerfulYou2, width/2, height/2);
      break;
    case 3:
    	text("Scan the different systems of the body and see how different types of doctors are needed to help you maintain a healthy body and provide care in the event of a medical emergency. ", 0,0,width, 8*height/10);
      image(powerfulYou3, width/2, height/2);
      break;
    case 4:
    	text("Explore the innovation of robotic surgery and attempt to control the robotic arm.", 0,0,width, 8*height/10);
      image(powerfulYou4, width/2, height/2);
      break;
    case 5:
    	text("Test your skills as a surgeon by keeping your hands steady in this exhibit.", 0,0,width, 8*height/10);
      image(powerfulYou5, width/2, height/2);
      break;
    case 6:
    	text("Measure your strength with the strength tester. ", 0,0,width, 8*height/10);
      image(powerfulYou6, width/2, height/2);
      break;
    case 7:
    	text("Put your balance to the test by practicing your surfing.", 0,0,width, 8*height/10);
      image(powerfulYou7, width/2, height/2);
      break;
    }
  }
  public void prehistoric() {
    background(255,247,114);

    switch(imageNumber) {
    case 1:
    	text("Get close to a confrontation between a saber-toothed cat and an Imperial Mammoth and learn how they came to live in ancient Florida.", 0,0,width, 8*height/10);
      image(prehistoric1, width/2, height/2);
      break;
    case 2:
    	text("Step into the mouth of a giant 50 foot megalodon, an extinct species of shark that lived many millions of years ago, and live to tell the tale.", 0,0,width, 8*height/10);
      image(prehistoric2, width/2, height/2);
      break;
    }
  }
  

  public void stormCenter() {
    background(255,247,114);

    switch(imageNumber) {
    case 1:
    	text("Generate a cloud by pushing down on the ring.", 0,0,width, 8*height/10);
      image(stormCenter1, width/2, height/2);
      break;
    case 2:
    	text("Learn about what happens after a hurricane hits by using the interactive hurricane aftermath computer. ", 0,0,width, 8*height/10);
      image(stormCenter2, width/2, height/2);
      break;
    case 3:
    	text("Step into the hurricane and feel the rush of hurricane force winds.", 0,0,width, 8*height/10);
      image(stormCenter3, width/2, height/2);
      break;
    case 4:
    	text("Peer into the plasma ball, which represents the state of matter that lights up the sky in the form of lightning. ", 0,0,width, 8*height/10);
      image(stormCenter4, width/2, height/2);
      break;
    case 5:
    	text("View some of our most infamous hurricanes on a 60” digital projection globe.", 0,0,width, 8*height/10);
      image(stormCenter5, width/2, height/2);
      break;
    case 6:
    	text("Watch as a tornado is created before your eyes! Then you can touch the vortex of the 10-foot tornado.", 0,0,width, 8*height/10);
      image(stormCenter6, width/2, height/2);
      break;
    }
  }
  public void waterStory() {
    background(255,247,114);

    switch(imageNumber) {
    case 1:
    	text("Play the alligator game with up to three other people.", 0,0,width, 8*height/10);
      image(waterStory1, width/2, height/2);
      break;
    case 2:
    	text("Use computers throughout this exhibit to expand your knowledge of Florida.", 0,0,width, 8*height/10);
      image(waterStory2, width/2, height/2);
      break;
    case 3:
    	text("Learn about the water cycle of Florida by using these interactive computers.", 0,0,width, 8*height/10);
      image(waterStory3, width/2, height/2);
      break;
    case 4:
    	text("View a map of North and South America. ", 0,0,width, 8*height/10);
      image(waterStory4, width/2, height/2);
      break;
    case 5:
    	text("Learn more about the environment of Florida by using interactive computer programs.", 0,0,width, 8*height/10);
      image(waterStory5, width/2, height/2);
      break;
    case 6:
    	text("Examine the different types of water flow that take place in the Florida Everglades. Laminar flow is a smooth flow, which is safe for the Everglades. Turbulent flow, however, is dangerous for the Everglades and prevents wildlife from obtaining food.", 0,0,width, 8*height/10);
      image(waterStory6, width/2, height/2);
      break;
    case 7:
    	text("Water pollution in Florida is a major issue. Check out common pollutants and their effects on the environment here.", 0,0,width, 8*height/10);
      image(waterStory7, width/2, height/2);
      break;
    }
  }



  public boolean surfaceTouchEvent(MotionEvent event) {  //(20)
      //call to keep mouseX and mouseY constants updated
      super.surfaceTouchEvent(event);
      //forward events
      return gesture.surfaceTouchEvent(event);
    }


}
