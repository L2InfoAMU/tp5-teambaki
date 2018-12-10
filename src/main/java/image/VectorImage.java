package image;

import java.util.List;
import javafx.scene.paint.Color;

public class VectorImage extends RasterImage implements Image {
    private List<Shape> shapes;
    private Color[][] colors;

    VectorImage(List<Shape> shapes, int width, int height) {
        super(width, height);
        this.shapes = shapes;
        colors = new Color[width][height];
        for(int k = 0; k < shapes.size(); k++)
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    if (shapes.get(k).contains(new Point(i, j)) && colors[i][j] == null) {
                        colors[i][j] = shapes.get(k).getColor();
                    }
                }
            }

        for (int i = 0; i < width; i++) {
          for (int j = 0; j < height; j++)
            if (colors[i][j] == null)
              colors[i][j] = Color.WHITE;
        }
    }
    public Color getPixelColor(int x, int y){ return colors[x][y]; }
}
