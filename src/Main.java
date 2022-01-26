public class Main {
    public static void main (String []args ){
        // распечатать все значения от 0 до 100
        // с использованием функций for, do-while
        int i;
        int b=100;
        for (i=0;i<100;) {
            do {
                i++;
                System.out.println("Печатается значение   " + i);
            } while (i<b);
        }
    }
}

