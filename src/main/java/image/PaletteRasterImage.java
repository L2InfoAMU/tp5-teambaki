package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage implements Image {

    private List<Color> palette;
    private int[][] indexesOfColors;
    private int height;
    private int width;

    public PaletteRasterImage(Color color, int width,int height)
    {
        this.width = width;
        this.height = height;
        indexesOfColors = new int[height][width];
        palette.add(color);

        for(int i=0;i<height;i++)
        {
            for(int j=0;j<width;j++)
            {
                indexesOfColors[j][i] = 0;
            }
        }

    }

    public PaletteRasterImage(Color[][] pixels)
    {
        this.colors=colors;
        this.width=pixels.length;
        this.height=pixels[0].length;
        for(int i=0;i<height;i++)
        {
            for(int j=0;j<width;j++)
            {
                palette.add(pixels[i][j]);
            }
        }

    }

    //Méthode

    public void createRepresentation(){
        palette = new ArrayList<Color>();
        


    }


    public void setPixelColor(Color color, int x, int y){
        colors[x][y]=color;
    }


    public Color getPixelColor(int x, int y){
        return colors[x][y];
    }

    private void setPixelsColor(Color[][] pixels){
        colors = pixels;
    }


    private void setPixelsColor(Color color){
        for(int i=0;i<colors.length;i++)
        {
            for(int j=0;j<colors.length;j++)
            {
                this.colors[i][j]= color;
            }
        }
    }


    public int getWidth() {
        return width;
    }


    public int getHeight() {
        return height;
    }

    protected void setWidth(int width){
        this.width=width;
    }


    protected void setHeight(int height){
        this.height=height;
    }
}
