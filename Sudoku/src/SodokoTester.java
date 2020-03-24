import processing.core.PApplet;

public class SodokuTester extends PApplet
{
    Sodoku s;
    int xPos;
    int yPos;
    public static void main(String[] args) {
        PApplet.main("SodokuTester");
    }
    public void settings() {
        size(810,810);
    }
    public void setup() {
        s = new Sodoku();
        s.generate();
        background(255);
    }
    public void draw() {
        for(int x = 0; x < 9; x++) {
            for(int y = 0; y < 9; y++) {
                strokeWeight(1);
                fill(255);
                rect(y * 90, x * 90, 90, 90);
                mouseClicked();
                if(s.get(x, y) != 0)
                {
                    fill(0, 0, 255);
                    textSize(70);
                    text(s.get(x, y), y * 90 + 20, x * 90 + 75);
                }
            }
        }
        strokeWeight(4);
        line(0, 0, 0, 810);
        line(270, 0, 270, 810);
        line(540, 0, 540, 810);
        line(808, 0, 808, 810);
        line(810, 270, 0, 270);
        line(810, 540, 0, 540);
        line(810, 808, 0, 808);
        line(810, 0, 0, 0);
    }
    public void mouseClicked() {
        for(int y = 0; y <= 720; y += 90) {
            for(int x = 0; x <= 720; x += 90) {
                if(mouseX >= x && mouseX < x + 90 && mouseY >= y && mouseY < y + 90) {
                    xPos = x / 90;
                    yPos = y / 90;
                    fill(200);
                    rect(x, y, 90, 90);
                    if(s.get(y / 90, x / 90) != 0) {
                        fill(0, 0, 255);
                        textSize(70);
                        text(s.get(y / 90, x / 90), x + 20, y + 75);
                    }
                }
            }
        }
    }
    public void keyPressed() {
        if(key == '0') {
            s.set(yPos, xPos, 0);
        }
        if(key == '1') {
            s.set(yPos, xPos, 1);
        }
        if(key == '2') {
            s.set(yPos, xPos, 2);
        }
        if(key == '3') {
            s.set(yPos, xPos, 3);
        }
        if(key == '4') {
            s.set(yPos, xPos, 4);
        }
        if(key == '5') {
            s.set(yPos, xPos, 5);
        }
        if(key == '6') {
            s.set(yPos, xPos, 6);
        }
        if(key == '7') {
            s.set(yPos, xPos, 7);
        }
        if(key == '8') {
            s.set(yPos, xPos, 8);
        }
        if(key == '9') {
            s.set(yPos, xPos, 9);
        }
    }
}

