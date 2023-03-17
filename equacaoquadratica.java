public class equacaoquadratica {
    private double a;
    private double b;
    private double c;

    public double getA(){
        return this.a;
    }

    public double getB(){
        return this.b;
    }

    public double getC(){
        return this.c;
    }

    public void setA(double a)throws Exception{
        if(a == 0){
            throw new Exception ("Argumento inválido. O coeficiente a não pode ser zero");
        }
        this.a = a;
    }

    public void setB(double b){
        this.b = b;
    }

    public void setC(double c){
        this.c = c;
    }




    private double calcularDelta() //encapsulada na classe
    {
        return b*b - 4*a*c;
    }
    public double[] calcularRaizes () throws Exception {
        //vai retornar um vetor de duas posições
        //u8m objeto se apresenta para o mundo através de interfaces.
        double[] raizes = new double[2]; //[] pode estar antes ou dps do identificador
        double delta = this.calcularDelta();
        if(delta<0){
            throw new Exception("Não existem raízes reais");// vai sair desse método, quando disparar. criou o ex nessa linha
        }
        //não precisa do if <3, pq vai ser redundante
        raizes[0] = (-b + Math.sqrt(delta))/(2*a);
        raizes[1] = (-b - Math.sqrt(delta))/(2*a);
        return raizes;
        }
    }

