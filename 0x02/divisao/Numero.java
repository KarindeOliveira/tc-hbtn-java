public class Numero {

    public static void dividir(int a, int b){

        int divisao = 0;

        try {
            divisao = a / b;
        } catch (Exception e) {
            System.out.println("Nao eh possivel dividir por zero");
        } finally {
            System.out.printf("%d / %d = %d\n",a,b,divisao);
        }
    }
}

