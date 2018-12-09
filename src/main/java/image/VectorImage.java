package image;

import java.util.List;
import javafx.scene.paint.Color;

public class VectorImage extends RasterImage implements Image {
    List<Shape> shapes;
    private Color[][] colors;

    VectorImage(List<Shape> shapes, int width, int height){
        super(width,height);
        this.shapes=shapes;
        this.width=width;
        this.height=height;
        colors=new Color[width][height];
        for(int i=0;i<width;i++)
        {
            for(int j=0;j<height;j++)
            {
                for(int k=0;k<shapes.size();k++)

                if(shapes.get(k).contains(new Point(i,j))){
                    colors[i][j]=shapes.get(k).getColor();

                }
                //if(colors[i][j]==null)
                  //  colors[i][j]=Color.WHITE;
            }

        }

    }
    public Color getPixelColor(int x, int y){ return colors[x][y]; }
}
