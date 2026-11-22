package example;

public final class Formatter {
    private Formatter() {}

    /** Indent every line by the given number of spaces (buggy: pads blank lines too). */
    public static String indent(String text, int spaces) {
        String pad = " ".repeat(spaces);
        StringBuilder out = new StringBuilder();
        for (String line : text.split("\n", -1)) {
            out.append(pad).append(line).append('\n');
        }
        return out.toString();
    }
}
