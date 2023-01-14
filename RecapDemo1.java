package Class8;

public class RecapDemo1 {
    public static void main(String[] args) {
        // 10 8 6 4 2
        for ( int i=10; i>=2 ; i-=2 ){
            System.out.println(i);
        }
        System.out.println("---------------");
        int number=10;
        while(number>=2){
            System.out.println(number);
            number-=2;
        }
        System.out.println("----------------");
        int number2=10;
        do{
            System.out.println(number2);
            number2=number2-2;//same as number2-=2
        }while (number2>=2);
    }
}
