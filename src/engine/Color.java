package engine;

public class Color {
    /**
     * Represents the red channel.
     */
    public float R = 1f;
    /**
     * Represents the green channel.
     */
    public float G = 1f;
    /**
     * Represents the blue channel.
     */
    public float B = 1f;
    /**
     * Represents the alpha channel.
     */
    public float A = 1f;

    /***
     * Creates a new Color object representing a color.
     * @param R Red channel intensity.
     * @param G Green channel intensity.
     * @param B Blue channel intensity.
     * @param A Alpha channel intensity.
     */
    public Color(float R, float G, float B, float A) {
        this.R = R;
        this.G = G;
        this.B = B;
        this.A = A;
    }

    /***
     * Creates a new Color object representing a color.
     * @param R Red channel intensity.
     * @param G Green channel intensity.
     * @param B Blue channel intensity.
     */
    public Color(float R, float G, float B) {
        this.R = R;
        this.G = G;
        this.B = B;
    }

    /**
     * @return A Color object representing black.
     */
    public static Color black() {
        return new Color(0f, 0f, 0f);
    }

    /**
     * @return A Color object representing white.
     */
    public static Color white() {
        return new Color(1f, 1f, 1f);
    }

    /**
     * @return A Color object representing red.
     */
    public static Color red() {
        return new Color(1f, 0f, 0f);
    }

    /**
     * @return A Color object representing green.
     */
    public static Color green() {
        return new Color(0f, 1f, 0f);
    }

    /**
     * @return A Color object representing blue.
     */
    public static Color blue() {
        return new Color(0f, 0f, 1f);
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
        return new Color(0, 1, 1);
    }

    /**
     * @return A Color object representing yellow.
     */
    public static Color yellow() {
        return new Color(1, 1, 0);
    }

    /**
     * @return A Color object representing magenta.
     */
    public static Color magenta() {
        return new Color(1, 0, 1);
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
