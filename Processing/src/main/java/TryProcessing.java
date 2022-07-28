import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int x = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);

    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }
    @Override
    public void setup() {
        paintWhite();
    }
    @Override
    public void draw() {
     for(int Gap=1;Gap<5;Gap++) {
         drawCircle(Gap*x,HEIGHT*Gap/5);
     }
     x+=1;
    }

    private void drawCircle(int starting_x_position, int starting_y_position) {
        ellipse(starting_x_position,starting_y_position, DIAMETER,DIAMETER);

    }

    private void paintWhite() {
        background(255);
    }

}
/*import processing.core.PApplet;

import java.util.Dictionary;

public class TryProcessing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int x_pos1, x_pos2, x_pos3, x_pos4 = 0;


    public static void main(String args[]) {
        PApplet.main("TryProcessing", args);

    }

    @Override
    public void settings() {
        super.settings();
        size(640, 488);
    }


    @Override
    public void draw() {
        ellipse(x_pos1, HEIGHT / 5, DIAMETER, DIAMETER);
        x_pos1 += 1;

        ellipse(x_pos2, HEIGHT / 5 * 2, DIAMETER, DIAMETER);
        x_pos2 += 2;

        ellipse(x_pos3, HEIGHT / 5 * 3, DIAMETER, DIAMETER);
        x_pos3 += 3;

        ellipse(x_pos4, HEIGHT / 5 * 4, DIAMETER, DIAMETER);
        x_pos4 += 4;

    }

}*/
