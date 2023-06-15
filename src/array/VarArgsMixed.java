package array;


public class VarArgsMixed {

        public static void imprimirNumeros(String mensagem, int... numeros) {
            System.out.println("invocado imprimirNumeros(String mensagem, int... numeros)");
            System.out.println("Mensagem: "+ mensagem);

            System.out.println("Foram passados: "+ numeros.length + " como parametro");
            for(int i=0; i < numeros.length; i++){
                System.out.println("Numero: "+ numeros[i]);
            }
        }

        public static void imprimirNumeros(int... numeros) {
            System.out.println("invocado imprimirNumeros(int... numeros)");
            System.out.println("Foram passados: " + numeros.length + " como parametro");

            for(int i=0; i < numeros.length; i++){
                System.out.println("Numero: "+ numeros[i]);
            }
        }

        public static void imprimirNumeros(Long... numeros) {
            System.out.println("invocado imprimirNumeros(Long... numeros)");
            System.out.println("Foram passados: "+ numeros.length + " como parametro");

            for (Long numero : numeros) {
                System.out.println("Numero: " + numero);
            }
        }

        public static void main(String  ...args) {
            imprimirNumeros(1,8,3,4);
            imprimirNumeros(1L,2L,7L,4L);
            imprimirNumeros("Teste",1,2,3,4);
        }

    }
