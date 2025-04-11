public class Potencia {
    public int potencia(int a, int b) {
        int n = a;
        for (int i = 0; i < b-1; i++) {
            a *= n;
        }
        return a;
    }
}
