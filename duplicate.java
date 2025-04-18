
class Main {


    public static int set(int number) {
        return number * 2; 
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 3, 5};

        for (int i = 0; i < num.length; i++) {
            System.out.println("Original: " + num[i]);

            int a = set(num[i]); 
            System.out.println("Processed: " + a);
        }
    }
}
