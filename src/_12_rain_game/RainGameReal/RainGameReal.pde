int rainY = 10;
int randomNumber = (int) random(width);
int score = 0;

void setup(){
  size(500, 500);
}

void draw(){
  background(255, 255, 255);
   fill(0, 0, 255);
    stroke(0, 0, 255);
    ellipse(randomNumber, rainY, 15, 15);
    rainY = rainY + 15;
    if(rainY > height){
      rainY = 10;
      checkCatch(randomNumber);
     randomNumber = (int) random(width);
      
    }
    
    fill(0, 255, 0);
    rect(mouseX, 460, 35, 50);
     
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
    
    
    
}

 void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
