package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage extends RasterImage implements Image {

    private List<Color> palette;
    private int[][] indexesOfColors;

    public PaletteRasterImage(Color color, int width,int height)
    {
        super(width,height);
        createRepresentation();
        palette.add(color);

        for(int i=0;i<height;i++)
        {
            for(int j=0;j<width;j++)
            {
                indexesOfColors[i][j] = 0;
            }
        }

    }

    public PaletteRasterImage(Color[][] pixels)
    {

        super(pixels.length,pixels[0].length);
        createRepresentation();
        for(int i=0;i<width;i++)
        {
            for(int j=0;j<height;j++)
            {
                if(!palette.contains(pixels[i][j]))
                palette.add(pixels[i][j]);
                indexesOfColors[i][j]=palette.indexOf(pixels[i][j]);
            }
        }

    }

    //Méthode

    private void createRepresentation(){
        palette = new ArrayList<>();
        indexesOfColors = new int[width][height];
    }


    public void setPixelColor(Color color, int x, int y){
        if(!palette.contains(color))
            palette.add(color);
        indexesOfColors[x][y]=palette.indexOf(color);
    }


    public Color getPixelColor(int x, int y){
        return palette.get(indexesOfColors[x][y]);
    }

    private void setPixelsColor(Color[][] pixels){
        for(int i=0;i<height;i++)
        {
            for(int j=0;j<width;j++)
            {
                if(!palette.contains(pixels[i][j]))
                    palette.add(pixels[i][j]);
                indexesOfColors[i][j]=palette.indexOf(pixels[i][j]);
            }
        }
    }


    private void setPixelsColor(Color color){
        palette.clear();
        palette.add(color);
        for(int i=0;i<height;i++)
        {
            for(int j=0;j<width;j++)
            {
                indexesOfColors[i][j] = 0;
            }
        }

    }
}
