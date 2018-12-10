package image;
import javafx.scene.paint.Color;
import util.Matrices;

import java.util.HashMap;
import java.util.Map;

public class SparseRasterImage extends RasterImage implements Image{
    private Map<Point, Color> pixels = new HashMap<>();

    public SparseRasterImage(Color color, int width, int height){
      super(width,height);
      for(int x=0;x<this.width;x++)
          for(int y=0;y<this.height;y++)
              pixels.put(new Point(x,y), color);
    }
    public SparseRasterImage(Color[][] pixels){
        super(Matrices.getRowCount(pixels),Matrices.getColumnCount(pixels));
        for(int x=0;x<this.width;x++)
            for(int y=0;y<this.height;y++)
                this.pixels.put(new Point(x,y), pixels[x][y]);
    }
    public void createRepresentation(){
        pixels = new HashMap<>();
    }
    public void setPixelColor(Color color, int x, int y){ pixels.put(new Point(x,y), color); }
    public Color getPixelColor(int x, int y){
       return pixels.get(new Point(x,y));
    }
    private void setPixelsColor(Color[][] pixels){ new SparseRasterImage(pixels); }
    private void setPixelsColor(Color color){ new SparseRasterImage(color,width,height); }


}
