public class Potencia {
    public int potencia(int a, int b) {
        int resultado = 1;
        for (int i = 0; i < b-1; i++) {
            resultado *= a;
        }
        return resultado;
    }
}
