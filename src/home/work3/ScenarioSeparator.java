package home.work3;

/**
 * home work from https://stepik.org/lesson/12762/step/10?unit=3110
 */

public class ScenarioSeparator {
    public String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder roleLines = new StringBuilder();
        for (String role : roles) {
            roleLines.append(role + ":\n");
            for (int textLineIndex = 0; textLineIndex < textLines.length; textLineIndex++) {
                if (textLines[textLineIndex].startsWith(role + ": ")) {
                    roleLines.append(textLineIndex + 1);
                    roleLines.append(")");
                    roleLines.append(textLines[textLineIndex].substring(role.length() + 1));
                    roleLines.append("\n");
                }
            }
            roleLines.append("\n");
        }
        return roleLines.toString();
    }
}
