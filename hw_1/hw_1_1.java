// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class hw_1_1 {

    public static void main(String[] args) {
        int num = 5;
        int sum = 0;
        int comp = 1;
        for (int i = 1; i < num+1; i++) {
            sum += i;
        }
        for (int j = 1; j < num; j++) {
            comp += comp * j;
        }
        System.out.println(sum);
        System.out.println(comp);
    }
}