package image;

import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage extends RasterImage implements Image  {
    private Color[][] colors;
    /* Constructeurs */
    public BruteRasterImage(Color color,int width, int height)
    {
        super(width,height);
        colors = new Color[this.width][this.height];
        for(int i=0;i<this.width;i++)
        {
            for(int j=0;j<this.height;j++)
            {
                colors[i][j]= color;
            }
        }
    }
    public BruteRasterImage(Color[][] colors)
    {

        super(Matrices.getRowCount(colors),Matrices.getColumnCount(colors));
        Matrices.requiresNonNull(colors);
        Matrices.requiresNonZeroDimensions(colors);
        Matrices.requiresRectangularMatrix(colors);
        this.colors=colors;
    }
    public void createRepresentation(){
        colors = new Color[width][height];
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
        new BruteRasterImage(color,width,height);
    }
}
