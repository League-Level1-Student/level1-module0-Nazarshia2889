float circleX = 0;
float circleY = 0;
float x = random(255);

void setup(){
    size(500, 500);
    background(1, 1, 1);
}

void draw(){
  makeMagical();
  for(int i = 0;i<300;i++){
    fill(0, i, x);
    ellipse(getWormX(i), getWormY(i), 10, 10);
    if(mousePressed == true){
      ellipse(getWormX(i), getWormY(i), 10, 10);
    }
  }
  
}

 float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
