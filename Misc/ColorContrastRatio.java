package Misc;

/**
 * A Java implementation of the offcial W3 documented procedure
 * to calculate contrast ratio between colors on the web.
 *
 * @since 2020-10-15
 * @see <a href="https://www.w3.org/TR/WCAG20-TECHS/G17.html#G17-procedure">Color Contrast Ratio Procedure</a>
 * @author Seth Falco (https://elypia.org/)
 */
public class ColorContrastRatio {

    /**
     * Calculates the contrast ratio between two given colors.
     *
     * @param a Any color, used to get the red, green, and blue values.
     * @param b Another color, which will be compared against the first color.
     * @return The contrast ratio between the two colors.
     */
    public double getContrastRatio(Color a, Color b) {
        final double aColorLuminance = getRelativeLuminance(a);
        final double bColorLuminance = getRelativeLuminance(b);

        if (aColorLuminance > bColorLuminance)
            return (aColorLuminance + 0.05) / (bColorLuminance + 0.05);
        else
            return (bColorLuminance + 0.05) / (aColorLuminance + 0.05);
    }

    /**
     * Calculates the relative luminance of a given color.
     *
     * @param color Any color, used to get the red, green, and blue values.
     * @return The relative luminance of the color.
     * @see <a href="https://www.w3.org/TR/2008/REC-WCAG20-20081211/#relativeluminancedef">More info on relative luminance.</a>
     */
    public double getRelativeLuminance(Color color) {
        final double red = getColor(color.getRed());
        final double green = getColor(color.getGreen());
        final double blue = getColor(color.getBlue());

        return 0.2126 * red + 0.7152 * green + 0.0722 * blue;
    }

    /**
     * Calculates the final value for a color to be used in the
     * relative luminance formula as described in step 1.
     *
     * @param color8Bit The 8-bit repretation of a color component value.
     * @return Value for the provided color component to be used in the relative luminance formula.
     */
    public double getColor(int value) {
        final double sRgb = getColorSRgb(value);
        return (sRgb <= 0.03928) ? sRgb / 12.92 : Math.pow((sRgb + 0.055) / 1.055, 2.4);
    }

    /**
     * Calculates the Color sRGB value as denoted in step 1
     * of the procedure document.
     *
     * @param color8Bit The 8-bit repretation of a color component value.
     * @return A percentile value of the color component.
     */
    private double getColorSRgb(double color8Bit) {
        return color8Bit / 255.0;
    }
}
