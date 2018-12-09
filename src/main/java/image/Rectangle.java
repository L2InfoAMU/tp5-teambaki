package image;
import javafx.scene.paint.Color;

public class Rectangle implements Shape{
Color pixels[][];
int width;
int height;
Point dRectangle;
    Rectangle(int x, int y, int width, int height, Color color){
        dRectangle = new Point(x,y);
        this.width=width;
        this.height=height;
        pixels=new Color[width][height];
        int largeur = x;
        int longueur = y;
        for(;longueur >width-x;longueur--)
            for(;largeur<height+y;largeur++)
                pixels[longueur][largeur]=color;
    }
    public boolean contains(Point point){
        return dRectangle.x<=point.x && point.x<=width-dRectangle.x && dRectangle.y>=point.y && point.y >=height+dRectangle.y;

    }
    public Color getColor(){
        return pixels[dRectangle.x][dRectangle.y];
    }
}
