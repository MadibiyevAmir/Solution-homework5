import java.awt.Color;

public class MarkerStyle {
    private String icon;
    private Color color;
    private String labelStyle;

    public MarkerStyle(String icon, Color color, String labelStyle) {
        this.icon = icon;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    public void render(int x, int y) {
        System.out.printf("Rendering marker at (%d,%d) with icon: %s, color: %s\n", x, y, icon, color);
    }
}
