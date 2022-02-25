import processing.core.PApplet;
/*
* A program that uses width and height to compute measurements and coordinates to draw the image of a house.
* @author: L. Pei
*/

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    // background sky
    fill(173, 216, 230);
    rect(width - width, height - height, width, height / 1.45454545f  );

    // background sun
    fill(255, 255, 0);
    ellipse(width / 1.06666667f, height / 16, width / 4, height / 4);

    //chimney
    fill(168, 96, 50);
    rect(width / 2.58064516f, height / 4, width / 26.6666666667f, height / 11.4285714f);

    //shape of the house
    fill(168, 96, 50);
    rect(width / 6.6666666667f, height / 2.66666666667f, width / 3.2f, height / 3.2f);
    triangle(width / 11.4285714f, height / 2.66666666667f, width / 3.27868852f, height / 4.34782609f, width / 1.9047619f, height / 2.66666666667f);

    // window 1
    fill(225, 225, 225);
    ellipse(width / 4.34782609f , height / 2.16216216f, width / 13.3333333333f, height / 13.3333333333f);

    stroke(0, 0, 0);
    line(width / 5.19480519f, height / 2.16216216f, width / 3.73831776f, height / 2.16216216f);
    line(width / 4.34782609f, height / 2.35294118f, width / 4.34782609f, height / 2);

    // window 2
    fill(225, 225, 225);
    ellipse(width / 2.58064516f, height / 2.16216216f, width / 13.3333333333f, height / 13.3333333333f);

    stroke(0, 0, 0);
    line(width / 2.85714286f, height / 2.16216216f, width / 2.35294118f, height / 2.16216216f);
    line(width / 2.58064516f, height / 2.35294118f, width / 2.58064516f, height / 2);

    //door
    fill(145, 61, 7);
    rect(width / 3.63636364f, height / 1.81818182f, width / 16, height / 7.27272727f);
  }
}