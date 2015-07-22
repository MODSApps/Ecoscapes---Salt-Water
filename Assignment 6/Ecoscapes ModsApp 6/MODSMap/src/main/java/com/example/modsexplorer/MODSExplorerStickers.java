package com.example.modsexplorer;

import java.util.Map;

import ketai.ui.KetaiGesture;
import processing.core.PApplet;
import processing.core.PImage;
import android.view.MotionEvent;

import com.parse.ParseUser;

public class MODSExplorerStickers extends PApplet{
	
  int imageNumber;
  int stickerPageNumber;
  boolean prehistoricBoolean, evergladesBoolean, goGreenBoolean;
  boolean otterBoolean, powerfulYouBoolean, ecoScapesBoolean;
  boolean aviationStationBoolean, stormCenterBoolean, waterStoryBoolean;
  PImage paper;
  PImage homeButton;
  PImage arrowLeft, arrowRight;
  PImage stickerPrehistoric, stickerPrehistoricGray, stickerEverglades, stickerEvergladesGray, stickerGoGreen, stickerGoGreenGray;
  PImage stickerOtter, stickerOtterGray, stickerPowerfulYou, stickerPowerfulYouGray, stickerEcoScapes, stickerEcoScapesGray;
  PImage stickerAviationStation, stickerAviationStationGray, stickerStormCenter, stickerStormCenterGray, stickerWaterStory, stickerWaterStoryGray; 
  KetaiGesture gesture;
  
  public void setup() {     
	  
	  // Get the current user's sticker collection
	  ParseUser user = ParseUser.getCurrentUser();
	  @SuppressWarnings("unchecked")
	  Map<String, Boolean> stickerCollection = (Map<String, Boolean>) user.get("stickerCollection");
	  
	  // Restores stickerCollection data  
	  prehistoricBoolean = stickerCollection.get("prehistoric");
	  evergladesBoolean = stickerCollection.get("everglades");
	  goGreenBoolean = stickerCollection.get("goGreen");
	  otterBoolean = stickerCollection.get("otter");
	  powerfulYouBoolean = stickerCollection.get("powerfulYou");
	  ecoScapesBoolean = stickerCollection.get("ecoScapes");
	  aviationStationBoolean = stickerCollection.get("aviationStation");
	  stormCenterBoolean = stickerCollection.get("stormCenter");
	  waterStoryBoolean = stickerCollection.get("waterStory");
	  
      //Sets orientation and instantiates variables   
      smooth();
      imageMode(CENTER);
      orientation(PORTRAIT);
      textSize(36);
      textAlign(CENTER, CENTER);
      fill(255);
      
      imageNumber = 1;
      gesture = new KetaiGesture(this);
      stickerPageNumber = 1;
      
      paper = new PImage();
      homeButton = new PImage();
      arrowLeft = new PImage();
      arrowRight = new PImage();
      stickerPrehistoric = new PImage();
      stickerPrehistoricGray = new PImage();
      stickerEverglades = new PImage();
      stickerEvergladesGray = new PImage();
      stickerGoGreen = new PImage();
      stickerGoGreenGray = new PImage();
      stickerOtter = new PImage();
      stickerOtterGray = new PImage();
      stickerPowerfulYou = new PImage();
      stickerPowerfulYouGray = new PImage();
      stickerEcoScapes = new PImage();
      stickerEcoScapesGray = new PImage();
      stickerAviationStation = new PImage();
      stickerAviationStationGray = new PImage();
      stickerStormCenter = new PImage();
      stickerStormCenterGray = new PImage();
      stickerWaterStory = new PImage();
      stickerWaterStoryGray = new PImage();
      
      paper = loadImage("Paper.png");
      homeButton = loadImage("home button_2.png");
      arrowLeft = loadImage("Arrow Left.png");
      arrowRight = loadImage("Arrow Right.png");
      stickerPrehistoric = loadImage("Sticker_Prehistoric.png");
      stickerPrehistoricGray = loadImage("Sticker_Prehistoric_Grayscale.png");
      stickerEverglades = loadImage("Sticker_Everglades.png");
      stickerEvergladesGray = loadImage("Sticker_Everglades_Grayscale.png");
      stickerGoGreen = loadImage("Sticker_GoGreen.png");
      stickerGoGreenGray = loadImage("Sticker_GoGreen_Grayscale.png");
      stickerOtter = loadImage("Sticker_Otter.png");
      stickerOtterGray = loadImage("Sticker_Otter_Grayscale.png");
      stickerPowerfulYou = loadImage("Sticker_PowerfulYou.png");
      stickerPowerfulYouGray = loadImage("Sticker_PowerfulYou_Grayscale.png");
      stickerEcoScapes = loadImage("Sticker_Ecoscapes.png");
      stickerEcoScapesGray = loadImage("Sticker_Ecoscapes_Grayscale.png");
      stickerAviationStation = loadImage("Sticker_Space.png");
      stickerAviationStationGray = loadImage("Sticker_Space_Grayscale.png");
      stickerStormCenter = loadImage("Sticker_Storm.png");
      stickerStormCenterGray = loadImage("Sticker_Storm_Grayscale.png");
      stickerWaterStory = loadImage("Sticker_WaterCycle.png");
      stickerWaterStoryGray = loadImage("Sticker_WaterCycle_Grayscale.png");
      
  }
  public void draw() {
	image(paper, width/2, 9*height/20, width, 9*height/10);
    fill(255,247,114);
    rect(0,9*height/10, width, height/10);
    image(homeButton, width/2, 19*height/20, width/7, height/10+2);
    image(arrowLeft, width/20, 19*height/20, width/10, height/10);
    image(arrowRight, 19*width/20, 19*height/20, width/10, height/10);
    
      switch(stickerPageNumber) {
      case 1:
        image(stickerPrehistoricGray, width/2, 3*height/12, 5*width/12, height/3);
        image(stickerEvergladesGray, 3*width/12, 2*height/3, 5*width/12, height/3);
        image(stickerGoGreenGray, 9*width/12, 2*height/3, 5*width/12, height/3);
        if(prehistoricBoolean == true) {
          image(stickerPrehistoric, width/2, 3*height/12, 5*width/12, height/3);
        }
        if(evergladesBoolean == true) {
          image(stickerEverglades, 3*width/12, 2*height/3, 5*width/12, height/3);
        }
        if(goGreenBoolean == true) {
          image(stickerGoGreen, 9*width/12, 2*height/3, 5*width/12, height/3);
        }
        break;
      case 2:
        image(stickerOtterGray, width/2, 3*height/12, width/3, height/3);
        image(stickerPowerfulYouGray, 3*width/12, 2*height/3, width/2, height/3);
        image(stickerEcoScapesGray, 9*width/12, 2*height/3, width/3, height/3);
        if(otterBoolean == true) {
          image(stickerOtter, width/2, 3*height/12, width/3, height/3);
        }
        if(powerfulYouBoolean == true) {
          image(stickerPowerfulYou, 3*width/12, 2*height/3, width/2, height/3);
        }
        if(ecoScapesBoolean == true) {
          image(stickerEcoScapes, 9*width/12, 2*height/3, width/3, height/3);
        }
        break;
      case 3:
        image(stickerAviationStationGray, width/2, height/4, width/3, height/3);
        image(stickerStormCenterGray, width/4, 2*height/3, width/3, height/3);
        image(stickerWaterStoryGray, 3*width/4, 2*height/3, width/3, height/3);
        if(aviationStationBoolean == true) {
          image(stickerAviationStation, width/2, height/4, width/3, height/3);
        }
        if(stormCenterBoolean == true) {
          image(stickerStormCenter, width/4, 2*height/3, width/3, height/3);
        }
        if(waterStoryBoolean == true) {
          image(stickerWaterStory, 3*width/4, 2*height/3, width/3, height/3);
        }
        break;
        
      }
}
  
  public void mousePressed() {
     if(mouseX>0 && mouseX<width/10 && mouseY>9*height/10 && mouseY<height) {
          if(stickerPageNumber>1) {
            stickerPageNumber--;
          } else {
            stickerPageNumber = 3;
          }
        }
        if(mouseX>9*width/10 && mouseX<width && mouseY>9*height/10 && mouseY<height) {
          if(stickerPageNumber<3) {
            stickerPageNumber++;
          } else {
            stickerPageNumber = 1;
          }
        }
        if(mouseX>3*width/7 && mouseX<4*width/7 && mouseY>9*height/10 && mouseY<height) {
        	exit();
        }
  }
  
  public boolean surfaceTouchEvent(MotionEvent event) {  //(20)
      //call to keep mouseX and mouseY constants updated
      super.surfaceTouchEvent(event);
      //forward events
      return gesture.surfaceTouchEvent(event);
    }
  }

