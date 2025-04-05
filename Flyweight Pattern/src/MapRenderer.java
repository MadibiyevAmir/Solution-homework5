import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MapRenderer {
    public static void main(String[] args) {
        List<Marker> markers = new ArrayList<>();
        String[] types = {"Gas", "Hospital", "Restaurant"};
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE};
        Random rand = new Random();

        for (int i = 0; i < 10000; i++) {
            String type = types[rand.nextInt(types.length)];
            Color color = colors[rand.nextInt(colors.length)];
            MarkerStyle style = MarkerFactory.getStyle(type, color, "Default");
            Marker marker = new Marker(rand.nextInt(1000), rand.nextInt(1000), style);
            markers.add(marker);
        }

        for (Marker marker : markers) {
            marker.render();
        }

        System.out.println("Total markers: " + markers.size());
        System.out.println("Unique styles: " + MarkerFactory.getStyleCount());
    }
}
