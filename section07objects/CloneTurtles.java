package org.teachingkidsprogramming.section07objects;

import java.util.ArrayList;

import org.teachingextensions.WindowUtils.MultiTurtleWindow;
import org.teachingextensions.logo.Turtle;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Text;

public class CloneTurtles
{
  // Uncomment the `two lines of code below to create a container and a window for your turtles --#1
  public ArrayList<Turtle> turtles = new ArrayList<Turtle>();
  public MultiTurtleWindow mtw     = new MultiTurtleWindow();
  //
  public CloneTurtles()
  {
    showSomeTurtles();
  }
  //
  private void showSomeTurtles()
  {
    for (int i = 0; i < 3; i++)
    {
      Turtle turtle = new Turtle();
      turtles.add(turtle);
    }
    int numberOfTurtles = turtles.size();
    new Text("There are " + numberOfTurtles + " turtles in the turtle container").setTopLeft(50, 50)
        .setPenColor(PenColors.Yellows.Gold).addTo(mtw);
    //
    // Use a FOREACH loop to add your turtles to your window --#5.1
    for (Turtle turtle : turtles)
    {
      //      Add and Show your turtles on your window --#5.3
      mtw.addAndShowTurtle(turtle);
      // Repeat --#5.2
    }
    //
    // Use a FOR loop to teleport all of your turtles around your window  --#6.1
    for (int i = 0; i < numberOfTurtles; i++)
    {
      turtles.get(i).setX(i * 100 + 350);
      //pay gorn <----------
      turtles.get(i).setY(i * 100 + 100);
    }
    // Repeat --#6.2
    //
    // Use a FOREACH loop to set values for all of your turtles --#7.1
    for (Turtle turtle : turtles)
    {
      turtle.setPenWidth(10);
      turtle.setSpeed(9);
      turtle.drawStar(100);
    }
  }
  //
  public static void main(String[] args)
  {
    new CloneTurtles();
  }
}
