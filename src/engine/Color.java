package engine;

public class Color {
    public static final float CHANNEL_HIGH = 1f;
    public static final float CHANNEL_LOW = 0f;
    /**
     * Represents the red channel.
     */
    private float R;
    /**
     * Represents the green channel.
     */
    private float G;
    /**
     * Represents the blue channel.
     */
    private float B;
    /**
     * Represents the alpha channel.
     */
    private float A = CHANNEL_HIGH;

    /***
     * Creates a new Color object representing a color.
     * @param R Red channel intensity.
     * @param G Green channel intensity.
     * @param B Blue channel intensity.
     * @param A Alpha channel intensity.
     */
    public Color(float R, float G, float B, float A) {
        this.R = normalizeChannel(R);
        this.G = normalizeChannel(G);
        this.B = normalizeChannel(B);
        this.A = normalizeChannel(A);
    }

    /***
     * Creates a new Color object representing a color.
     * @param R Red channel intensity.
     * @param G Green channel intensity.
     * @param B Blue channel intensity.
     */
    public Color(float R, float G, float B) {
        this.R = normalizeChannel(R);
        this.G = normalizeChannel(G);
        this.B = normalizeChannel(B);
    }

    /***
     * Normalizes the channel value to be
     * @param f Value to be normalized.
     * @return Normalized channel value.
     */
    public static float normalizeChannel(float f) {
        if (f < CHANNEL_LOW) return CHANNEL_LOW;
        else return Math.min(f, CHANNEL_HIGH);
    }

    /**
     * @return A Color object representing black.
     */
    public static Color black() {
        return new Color(CHANNEL_LOW, CHANNEL_LOW, CHANNEL_LOW);
    }

    /**
     * @return A Color object representing white.
     */
    public static Color white() {
        return new Color(CHANNEL_HIGH, CHANNEL_HIGH, CHANNEL_HIGH);
    }

    /**
     * @return A Color object representing red.
     */
    public static Color red() {
        return new Color(CHANNEL_HIGH, CHANNEL_LOW, CHANNEL_LOW);
    }

    /**
     * @return A Color object representing green.
     */
    public static Color green() {
        return new Color(CHANNEL_LOW, CHANNEL_HIGH, CHANNEL_LOW);
    }

    /**
     * @return A Color object representing blue.
     */
    public static Color blue() {
        return new Color(CHANNEL_LOW, CHANNEL_LOW, CHANNEL_HIGH);
    }

    /**
     * @return A Color object representing grey.
     */
    public static Color grey() {
        return new Color(0.5f, 0.5f, 0.5f);
    }

    /**
     * @return A Color object representing cyan.
     */
    public static Color cyan() {
        return new Color(CHANNEL_LOW, CHANNEL_HIGH, CHANNEL_HIGH);
    }

    /**
     * @return A Color object representing yellow.
     */
    public static Color yellow() {
        return new Color(CHANNEL_HIGH, CHANNEL_HIGH, CHANNEL_LOW);
    }

    /**
     * @return A Color object representing magenta.
     */
    public static Color magenta() {
        return new Color(CHANNEL_HIGH, CHANNEL_LOW, CHANNEL_HIGH);
    }

    @Override
    public String toString() {
        return "R: " + R + ",G: " + G + ",B: " + B + ",A: " + A;
    }

    public float getR() {
        return R;
    }

    public void setR(float R) {
        this.R = R;
    }

    public float getG() {
        return G;
    }

    public void setG(float G) {
        this.G = G;
    }

    public float getB() {
        return B;
    }

    public void setB(float B) {
        this.B = B;
    }

    public float getA() {
        return A;
    }

    public void setA(float A) {
        this.A = A;
    }
}
