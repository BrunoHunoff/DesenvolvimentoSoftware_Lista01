public class Calculadora {

    public static float somar (float n1,float n2) {
        return n1 + n2;
    }

    public static float subtrair (float n1, float n2) {
        return n1 - n2;
    }

    public static float multiplicar (float n1, float n2) {
        return n1 * n2;
    }

    public static float dividir (float n1, float n2) {
        if (n2 == 0) {
            System.out.println("Erro! Nao e possivel dividir por 0");
            return 0;
        }
        return n1 / n2;
    }
    
}
