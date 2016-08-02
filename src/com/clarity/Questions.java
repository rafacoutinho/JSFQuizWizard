package com.clarity;

import java.io.Serializable;

import com.corejsf.util.Messages;

public class Questions implements Serializable {
  private static final long serialVersionUID = -7148843668107920897L;
  private String question;
  private Question[] questions = {      
    new Question(
       Messages.getString("com.clarity.messages", "expandQuestion", null),
       new String[] { 
         Messages.getString("com.clarity.messages", "hydrogen", null),
         Messages.getString("com.clarity.messages", "helium", null),
         Messages.getString("com.clarity.messages", "water", null),
         Messages.getString("com.clarity.messages", "asphalt", null)
       }),
       
   new Question(
       Messages.getString("com.clarity.messages", "waterSGQuestion", null),
       new String[] { 
         Messages.getString("com.clarity.messages", "onedotoh", null),
         Messages.getString("com.clarity.messages", "twodotoh", null),
         Messages.getString("com.clarity.messages", "onehundred", null),
         Messages.getString("com.clarity.messages", "onethousand", null)
       }),
       
   new Question(
       Messages.getString("com.clarity.messages", "numThermoLawsQuestion", null),
       new String[] { 
         Messages.getString("com.clarity.messages", "one", null),
         Messages.getString("com.clarity.messages", "three", null),
         Messages.getString("com.clarity.messages", "five", null),
         Messages.getString("com.clarity.messages", "ten", null)
       }),
       
   new Question(
       Messages.getString("com.clarity.messages", "closestSunQuestion", null),
       new String[] { 
         Messages.getString("com.clarity.messages", "venus", null),
         Messages.getString("com.clarity.messages", "mercury", null),
         Messages.getString("com.clarity.messages", "mars", null),
         Messages.getString("com.clarity.messages", "earth", null)
       })         
  };
  
  public int size()                        { return questions.length; }
  public String getQuestion()              { return question; }
  public void setQuestion(String question) { this.question = question; }
  public Question[] getQuestions()         { return questions; }
}