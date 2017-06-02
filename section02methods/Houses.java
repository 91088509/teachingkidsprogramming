package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;

public class Houses
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //   Have the tortoise start at 200 pixels in on the X axis --#14
    Tortoise.setX(200);
    int height = 40;
    drawHouse(height);
    //   drawHouse with height 120 (recipe below) --#10
    drawHouse(120);
    //   drawHouse with height 90 (recipe below) --#12
    drawHouse(90);
    //   drawHouse with height 20 (recipe below) --#13
    drawHouse(20);
  }
  public static void drawHouse(int height)
  {
    //       Change the pen color of the line the tortoise draws to lightGray --#15
    Tortoise.move(height);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
}
