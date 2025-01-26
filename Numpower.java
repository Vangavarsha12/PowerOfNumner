public class Numpower {
    public static void main(String[] args) {
        double base=2;
        double exponent=3;
        double result=Math.pow(base,exponent);
        System.out.println(base+" raised to power of "+exponent+result);
        double negativebase=-4;
        double fractionalexponent=0.5;
        double complexresult=Math.pow(negativebase,fractionalexponent);
        System.out.println(negativebase+" raised power of "+fractionalexponent+" is "+result);
    }
    
}
