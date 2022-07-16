import static java.lang.Character.*;

class SqueakyClean {

    static String clean(String identifier) {

        StringBuilder stringFinal = new StringBuilder();

        for (int i = 0; i < identifier.length(); i++){
            char ch = identifier.charAt(i);

            if (ch == ' '){
                stringFinal.append("_");
            } else if (isISOControl(ch)){
                stringFinal.append("CTRL");
            } else if (ch == '-') {
                ch = identifier.charAt(i + 1);

                if (isLetter(ch)) {
                    ch = toUpperCase(ch);
                    stringFinal.append(ch);
                    i++;
                }
            } else {
                if (isLetter(ch) && (!(ch >= 'α' && ch <= 'ω'))){
                    stringFinal.append(ch);
                }
            }
        }
        return stringFinal.toString();
    }
}