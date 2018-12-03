package image;

import javafx.scene.paint.Color;

public class BruteRasterImage implements Image  {
    private Color[][] colors;
    private int height;
    private int width;

    /* Constructeurs */
    public BruteRasterImage(Color color,int width, int height)
    {
        colors = new Color[height][width];
        for(int i=0;i<height;i++)
        {
            for(int j=0;j<width;j++)
            {
                 colors[i][j]= color;
            }
        }
    }

    public BruteRasterImage(Color[][] colors)
    {
        this.colors=colors;
    }

    public void createRepresentation(){
        colors = new Color[height][width];
    }


    public void setPixelColor(Color color, int x, int y){
        colors[y][x]=color;
    }


    public Color getPixelColor(int x, int y){
        return colors[y][x];
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
