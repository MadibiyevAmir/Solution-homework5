import java.util.HashMap;
import java.util.Map;

public class MarkerFactory {
    private static final Map<String, MarkerStyle> styles = new HashMap<>();

    public static MarkerStyle getStyle(String type, java.awt.Color color, String labelStyle) {
        String key = type + color.toString() + labelStyle;
        styles.putIfAbsent(key, new MarkerStyle(type, color, labelStyle));
        return styles.get(key);
    }

    public static int getStyleCount() {
        return styles.size();
    }
}
