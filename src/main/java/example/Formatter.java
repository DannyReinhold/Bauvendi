package example;

public final class Formatter {
    private Formatter() {}

    /** Indent every non-blank line by the given number of spaces. */
    public static String indent(String text, int spaces) {
        String pad = " ".repeat(spaces);
        StringBuilder out = new StringBuilder();
        for (String line : text.split("\n", -1)) {
            if (!line.isBlank()) {
                out.append(pad).append(line);
            }
            out.append('\n');
        }
        return out.toString();
    }
}
