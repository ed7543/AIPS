class EvenOdd {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0, even = 0, odd = 0, i;
        float avg;

        for(i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if(numbers[i] % 2 == 0) {
                even++;
            } else if(numbers[i] % 2 != 0) {
                odd++;
            }
        }

        int len = numbers.length;

        avg = (float)sum / (float)len;

        System.out.println("Even: " + even + "\nOdd: " + odd);
        System.out.println("Average: " + avg);
        
    }
}