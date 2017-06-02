package org.teachingkidsprogramming.section06modelviewcontroller.Katas_And_Varitions;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionAdLibs
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    //MessageBox.showMessage("The adverb is " + adverb);
    String edverb = askEdverb();
    //MessageBox.showMessage("The edverb is " + edverb);
    String bodypart = askBodyPart();
    //MessageBox.showMessage("The body part is " + bodypart);
    String currentStory = "Today I woke " + adverb + ". Then I " + edverb + " my " + bodypart + ". ";
    MessageBox.showMessage(currentStory);
  }
  public static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("What is the adverb");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Please enter an adverb");
      adverb = askAdverb();
    }
    if (adverb.matches("[\\d]*"))//regular expression
    {
      MessageBox.showMessage("No adverb, no story, pay attension and start over.");
      adverb = askAdverb();
    }
    return adverb;
  }
  public static String askEdverb()
  {
    String edverb = MessageBox.askForTextInput("What is the edverb");
    if (edverb.isEmpty())
    {
      MessageBox.showMessage("Please enter an edverb");
      edverb = askAdverb();
    }
    if (edverb.matches("[\\d]*"))//regular expression
    {
      MessageBox.showMessage("No edverb, no story, pay attension and start over.");
      edverb = askAdverb();
    }
    return edverb;
  }
  public static String askBodyPart()
  {
    String bodypart = MessageBox.askForTextInput("What is the body part?");
    if (bodypart.isEmpty())
    {
      MessageBox.showMessage("Please enter a body part");
      bodypart = askBodyPart();
    }
    if (bodypart.matches("[\\d]*"))//regular expression
    {
      MessageBox.showMessage("No body, no story, pay attension and start over.");
      bodypart = askBodyPart();
    }
    return bodypart;
  }
}