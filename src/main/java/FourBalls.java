import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 10;
    int SpeedOfFirstBall = 0;
    int SpeedOfSecondBall = 0;
    int SpeedOfThirdBall = 0;
    int SpeedOfFourthBall = 0;


    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void draw() {
        getFirstBall();
        getSecondBall();
        getThirdBall();
        getFourthBall();
    }

    private void getFirstBall() {
        ellipse(SpeedOfFirstBall , HEIGHT/5 , DIAMETER, DIAMETER);
        SpeedOfFirstBall += 1;
    }

    private void getSecondBall() {
        ellipse(SpeedOfSecondBall , (HEIGHT/5)*2 , DIAMETER , DIAMETER);
        SpeedOfSecondBall += 2;
    }

    private void getThirdBall() {
        ellipse(SpeedOfThirdBall , (HEIGHT/5)*3 , DIAMETER , DIAMETER);
        SpeedOfThirdBall += 3;
    }

    private void getFourthBall() {
        ellipse(SpeedOfFourthBall , (HEIGHT/5)*4 , DIAMETER , DIAMETER);
        SpeedOfFourthBall += 4;
    }
}
