package loop;
//2. Print Even Numbers between 1 - 100
public class EvenNumber {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\n");
            }
        }
    }
}
