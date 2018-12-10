package image;
import javafx.scene.paint.Color;

public class Rectangle implements Shape{
private Color pixels[][];
private int width;
private int height;
private Point dRectangle;
    Rectangle(int x, int y, int width, int height, Color color){
        dRectangle = new Point(x,y);
        this.width=width;
        this.height=height;
        pixels=new Color[x+width][y+height];
        for(int largeur=x;largeur<x+width;largeur++)
            for(int longueur=y;longueur<y+height;longueur++)
                pixels[largeur][longueur]=color;
    }
    public boolean contains(Point point){

        return dRectangle.x<=point.x && point.x<=dRectangle.x+width&& dRectangle.y<=point.y && point.y <= dRectangle.y+height;

    }
    public Color getColor(){
        return pixels[dRectangle.x][dRectangle.y];
    }
}
