package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class AdLibs
{
  static String currentStory = "";
  static String currentAdverb = "";
  static String currentEdVerb = "";
  static String currentBodyPart = "";

  
  public static void main(String[] args)
  {
    currentAdverb = MessageBox.askForTextInput("Enter an adverb");
    currentEdVerb = MessageBox.askForTextInput("Enter a '-ed' verb");
    currentBodyPart = MessageBox.askForTextInput("Enter a body part");

    //  Ask the user to enter a verb ending in '-ed', save it as currentEdVerb --#4
    //  Ask the user to enter a body part, save it as currentBodyPart --#6
    currentStory = "Today " + "I woke " + currentAdverb + ". " + "Then I " + currentEdVerb + ". " + "my " + currentBodyPart + ". ";
    //  Add the words "I woke " + currentAdverb + ". " to the currentStory --#3
    //  Add the words '"Then I " + currentEdVerb + " " to the currentStory --#5
    //  Add the words "my " + currentBodyPart + ". " to the current story --#7
    MessageBox.showMessage(currentStory);
  }
}