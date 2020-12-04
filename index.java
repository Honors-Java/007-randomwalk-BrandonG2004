//Put all your variables up here outside the setup or draw functions
//What variables may you want?
//  x, y, number of steps to take, and current steps taken

int n = 300;
int steps = 0;
int x = 200;
int y = 200;




void setup() {
	size(500, 500);
  frameRate(30);
}

void draw() {
	stroke(1);
  //starts random walking from 200,200
  rect(x, y, 10, 10);
  
  //Here is where you should create the new rectangles to create the illusion of 'random walking'
  int r = (int)(Math.random() * 6);
  // You will need to make sure you dont draw more rectangles than the limit of steps
  //You'll need to use the Math.random() to decide how to create randomness in your drawing of rectangles.
  // Keep your canvas and rectangle width and height as I've given you
    if(r == 0){
      rect(x,y,10,10);
      x = x + 0;
      y = y - 10;
      steps = steps + 1;
    }else if(r == 1){
      rect(x,y,10,10);
      x = x + 10;
      y = y + 0;
      steps = steps + 1;
    }else if(r == 2){
      rect(x,y,10,10);
      x = x + 0;
      y = y + 10;
      steps = steps + 1;
    }else if(r == 3){
      rect(x,y,10,10);
      x = x - 10;
      y = y + 0;
      steps = steps + 1;
    }else if(r == 4){
      rect(x,y,10,10);
      x = x - 10;
      y = y - 10;
      steps = steps + 1;
    }else if(r == 5){
      rect(x,y,10,10);
      x = x + 10;
      y = y + 10;
      steps = steps + 1;
    }
    if(x > 500){
      rect(x,y,10,10);
      x = x - 10;
     
    }else if (y > 500){
      rect(x,y,10,10);
    
      y = y - 10;
    }else if(y == 0){
      rect(x,y,10,10);
    
      y = y + 10;
    }else if(x == 0){
      rect(x,y,10,10);
      x = x + 10;
      
    }
      


 
    println(n);
    println("drew rect at: " + x + ", " + y);
    println("Steps taken: " + steps);
}



	



