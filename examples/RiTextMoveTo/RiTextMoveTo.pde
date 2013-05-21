import rita.*;

/**
 * TODO: broken in JS
 *    even-type: RiTa.MOVE_TO vs "moveToComplete"
 *    problem with RiText.distanceTo()/center()
    Error: Object 307.8148741638288 has no method 'center' 
 */ 
RiText rt;

void setup()
{
  size(400, 400);

  RiText.defaultFont("Georgia", 30);

  RiText rt1 = new RiText("ZIG");
  RiText rt2 = new RiText("ZAG");

  rt2.motionType(RiTa.EASE_IN_OUT);

  moveToRandom(rt1);
  moveToRandom(rt2);
}

void draw()
{
  fill(255, 100); // leave trails
  rect(0, 0, width, height);

  RiText.drawAll();
}

void onRiTaEvent(RiTaEvent re) {
  if (re.type() == "moveToCompleted") 
    moveToRandom((RiText) re.source());
}

void moveToRandom(RiText rt)
{
  float newX = RiText.random(width - rt.textWidth()); 
  float newY = RiText.random(rt.textHeight(), height - 10);
  //float dst = rt.distanceTo(newX, newY);

  rt.moveTo(newX, newY, .5);//dst / width);
}
