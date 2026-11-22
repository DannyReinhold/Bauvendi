package example;

public final class FormatterTest {
    public static void main(String[] args) {
        // AT-FMT-01: Leerzeilen duerfen nicht mitgepaddet werden.
        String in = "a\n\nb";
        String expected = "  a\n\n  b\n";
        if (!Formatter.indent(in, 2).equals(expected)) {
            System.out.println("AT-FMT-01 FAIL");
        } else {
            System.out.println("AT-FMT-01 PASS");
        }
        // AT-FMT-02: Leerer Text bleibt eine leere Zeile.
        if (!Formatter.indent("", 2).equals("\n")) {
            System.out.println("AT-FMT-02 FAIL");
        } else {
            System.out.println("AT-FMT-02 PASS");
        }
    }
}
