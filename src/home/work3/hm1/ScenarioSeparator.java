package home.work3.hm1;

/**
 * home work from https://stepik.org/lesson/12762/step/10?unit=3110
 */

public class ScenarioSeparator {
    public String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder roleLines = new StringBuilder();
        for (String role : roles) {
            roleLines.append(role + ":\n")
                    .append(printTextLines(role, textLines))
                    .append("\n");
        }
        return roleLines.toString();
    }

    public static String printTextLines(String role, String[] textLines) {
        StringBuilder roleTextLines = new StringBuilder();
        for (int textLineIndex = 0; textLineIndex < textLines.length; textLineIndex++) {
            if (textLines[textLineIndex].startsWith(role + ": ")) {
                roleTextLines.append(textLineIndex + 1);
                roleTextLines.append(")");
                roleTextLines.append(textLines[textLineIndex].substring(role.length() + 1));
                roleTextLines.append("\n");
            }
        }
        return roleTextLines.toString();
    }
}
