package rita.test.sketches;
import java.util.ArrayList;

import processing.core.PApplet;

import rita.RiGrammar;
import rita.RiText;

public class McGrammar extends PApplet
{
  int MAX_LINE_LENGTH = 80;

  RiText[] rts;
  RiGrammar grammar;
  ArrayList buf = new ArrayList();
  boolean clicked, drawRectangle = true;

  public void setup()
  {    
    size(600, 300);
    RiText.defaultFont("Times",15); 
    RiText.defaults.alignment=LEFT; 

    // create a new grammar 
    grammar = new RiGrammar();
    grammar.setGrammarFromFile("mcgrammar.g");  
    grammar.print();
  }

  public void drawX() {
    background(0);    
    RiText.drawAll();
    if (drawRectangle) {
      stroke(255);
      rect(25,20,515,240);
    }
  }

  public void mouseClicked() {

    clicked = true;

    // grab 10 lines from the grammar
    
    buf.clear();
    for (int i = 0; i < 10; i++) {
      String line = grammar.expand();
      while (line.length() > MAX_LINE_LENGTH) {
        String toAdd = line.substring(0,MAX_LINE_LENGTH);
        line = line.substring(MAX_LINE_LENGTH, line.length());
        int idx = toAdd.lastIndexOf(" ");
        String end = "";

        if (idx >= 0) {
          end = toAdd.substring(idx, toAdd.length());      
          toAdd = toAdd.substring(0,idx); 
        }
        buf.add(toAdd);
        line = end + line; 
      }
      buf.add(line);
    }
    setLinesForPage();
  }

  void setLinesForPage() {
    RiText[] rts = new RiText[10];
    for (int i = 0; i < buf.size(); i++) {
      if (i == rts.length) break;
      String line = buf.get(i)+"";
      rts[i] = new RiText(this,line,40,50+20*i);
    }
    for (int i = 0; i < rts.length; i++) {
      if (buf.size()>0)
        buf.remove(0);
    } 
    if (rts[0] != null)
      rts[0].x += 2;
  }

  public void keyPressed() {
    setLinesForPage();
  }
}
