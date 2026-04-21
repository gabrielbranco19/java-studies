public class Converter {
    //métodos
    public String convertDecHex (String num) {
        int resultado = Integer.parseInt(num, 10);
        return Integer.toString(resultado, 16);
    }

    public String convertDecBin (String num) {
        int resultado = Integer.parseInt(num, 10);
        return Integer.toString(resultado, 2);
    }

    public String convertHexDec (String num) {
        int resultado = Integer.parseInt(num, 16);
        return Integer.toString(resultado, 10);
    }

    public String convertHexBin (String num) {
        int resultado = Integer.parseInt(num, 16);
        return Integer.toString(resultado, 2);
    }

    public String convertBinDec (String num) {
        int resultado = Integer.parseInt(num, 2);
        return Integer.toString(resultado, 10);
    }

    public String convertBinHex (String num) {
        int resultado = Integer.parseInt(num, 2);
        return Integer.toString(resultado, 16);
    }

}
