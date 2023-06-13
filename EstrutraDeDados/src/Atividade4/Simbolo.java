package Atividade4;

public class Simbolo {
    String simbolo;

    public boolean isOperando(String simbolo) {
        String regex = "-?\\d+(\\.\\d+)?";
        boolean isNumber = simbolo.matches(regex);
        return isNumber;
    }
    public boolean isOperador(String simbolo) {
        return simbolo.equals("+") || simbolo.equals("-") || simbolo.equals("*") || simbolo.equals("/");
    }

    public int verificaPrioridade(String simbolo) {
        switch (simbolo) {
            case "(", ")" -> {
                return 0;
            }
            case "+", "-" -> {
                return 1;
            }
            case "*", "/" -> {
                return 2;
            }
        }
            return -1;
    }

    public boolean abreParentese(String simbolo) {
        return simbolo.equals("(");
    }
    public boolean fechaParentese(String simbolo) {
        return simbolo.equals(")");
    }
}
