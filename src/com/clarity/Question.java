package com.clarity;

import java.io.Serializable;

public class Question implements Serializable {
  private static final long serialVersionUID = 1284490087332362658L;
  private String question, answer;
  private String[] choices;
  private boolean answered = false;
  
  public Question(String question, String[] choices) {
    this.question = question;
    this.choices = choices;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
    answered = true;
  }

  public String getAnswer()    { return answer;   }
  public String getQuestion()  { return question; }
  public String[] getChoices() { return choices;  }
  public boolean isAnswered()  { return answered; }

  public void setAnswered(boolean answered) { this.answered = answered; }  
}