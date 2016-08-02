package com.clarity;

import java.io.Serializable;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.inject.Produces;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;

@Named()
@ConversationScoped()
public class Wizard implements Serializable {
  private static final long serialVersionUID = 1L;
  private Questions questions = new Questions();
  private int cursor = 0;
  
  @Inject
  private Conversation conversation;  
  
  @Produces @Named
  public Question[] getQuestions() {
    return questions.getQuestions();
  }
  
  public void nextButtonClicked(ActionEvent e) {
    incrementCursor();
  }

  public void previousButtonClicked(ActionEvent e) {
    decrementCursor();
  }
    
  public void incrementCursor() { ++cursor; }
  public void decrementCursor() { --cursor; }
  public int  getCursor()       { return cursor; }
  public void resetCursor()     { cursor = 0; }

  public boolean getNextButtonEnabled() {
    return cursor != questions.size() - 1 &&
    (questions.getQuestions())[cursor].isAnswered();
  }
  
  public boolean getPreviousButtonEnabled() {
    return cursor > 0;
  }
  
  public boolean getFinishButtonEnabled() {
    return cursor == questions.size() - 1 &&
    (questions.getQuestions())[cursor].isAnswered();
  }
  
  public String start() {
    conversation.begin();
    return "quizWizard/wizard";
  }
  
  public String end() {
    conversation.end();
    return "/done";
  }
  
  private void setCurrentQuestionUnanswered() {
    Question currentQuestion = (questions.getQuestions())[cursor];
    currentQuestion.setAnswered(false);    
  }
}