package org.teachingkidsprogramming.section01forloops;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class Spiral
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    ColorWheel.addColor(Color.blue);
    //    Add Violet to the Color Wheel --#8
    ColorWheel.addColor(Color.pink);
    //    Add Purple to the Color Wheel --#9
    ColorWheel.addColor(Color.cyan);
    for (int i = 0; i < 75; i++)
    {
      try
      {
        Tortoise.setPenColor(ColorWheel.getNextColor());
        Tortoise.move(i * 5);
        Tortoise.turn(360 / 3);
      }
      catch (RuntimeException re)
      {
        MessageBox.showMessage("Hold up: " + re);
      }
    }
  }
}
