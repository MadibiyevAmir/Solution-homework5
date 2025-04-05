public class Marker {
    private int x, y;
    private MarkerStyle style;

    public Marker(int x, int y, MarkerStyle style) {
        this.x = x;
        this.y = y;
        this.style = style;
    }

    public void render() {
        style.render(x, y);
    }
}
