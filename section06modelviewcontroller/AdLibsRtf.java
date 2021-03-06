package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.MVCUtils.Viewer;

public class AdLibsRtf
{
  public static class Words
  {
    // adverb
    private String adverb;
    // ed verb
    private String edVerb;
    // bodypart
    private String bodyPart;
  }
  public static void main(String[] args)
  {
    //MVC Pattern - Model,View,Controller
    Words words = new Words();//Model
    words.adverb = MessageBox.askForTextInput("Enter an adverb.");
    words.edVerb = MessageBox.askForTextInput("Enter an 'ed' verb.");
    words.bodyPart = MessageBox.askForTextInput("Enter a body part.");
    //  Connect the words in the currentStory to an RTF file parser (use the Parser object)  --#1.2
    String currentStory = org.teachingextensions.logo.utils.MVCUtils.Parser.parseRtfFile("view.rtf", words);//controller
    //  Display the currentStory in an RTF file (use the Viewer object) --#1.3 // view
    Viewer.displayRtfFile(currentStory);
  }
}