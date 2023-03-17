public class equacao {
        //equação quadrática

    public static void main (String[] args) throws Exception{
        equacaoquadratica equacao1 = new equacaoquadratica();
        equacaoquadratica equacao2 = new equacaoquadratica();
        equacao1.setA(1);
        equacao1.setB(0);
        equacao1.setC(4);

        System.out.println("Equação 1: ");
        System.out.println(equacao1.getA() +"x² +"+ equacao1.getB() + "x +" + equacao1.getC());

        System.out.println("Equação 2: ");
        System.out.println(equacao2.getA() +"x² +"+ equacao2.getB() + "x +" + equacao2.getC());

        try {//diz que o trecho de código pode gerar exceção
            double[] raizes = equacao1.calcularRaizes();// calcular raizes é comportamento do objeto
            System.out.println("X1 =" +raizes[0]);
            System.out.println("X2 =" +raizes[1]);
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}
