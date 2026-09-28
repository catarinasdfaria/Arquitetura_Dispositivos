public class F1 {
    public static void ex6() {
        System.out.println("Hello World");
    }
    public static void ex7(float l,float c) {
        float per = 2*l+2*c;
        System.out.println("O perimetro do retangulo é: " + per);
    }
    public static void ex8(float c,float a,float l) {
        float volPar = c*a*l;
        System.out.println("O volume do paralelepipedo é: " + volPar);
    }
    public static void ex9(float t) {
        float calc = (t-32)*(5.0f/9.0f);
        System.out.println("A temperatura " + t + "F convertida para ºC é: " + calc + "ºC");
    }
    private static int maximo(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    private static int minimo(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    private static float media(int[] array) {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma+=array[i];
        }
        float med = soma/array.length;
        return med;
    }
    public static void main(String[] args){
        ex6();
        ex7(5,5);
        ex8(8,4,6);
        ex9(80.6f);
        int[] array = {1,13,8,10,2,4,0,29,15};
        int max = maximo(array);
        System.out.println("O numero maximo do array é: " + max);
        int min = minimo(array);
        System.out.println("O numero minimo do array é: " + min);
        float med = media(array);
        System.out.println("A media do array é: " + med);
    }
}