
    class ArrayAverage {
    public static void main(String[] args) {
        double[] numbers = { 10.5, 20.3, 15.7, 8.9 };
        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / numbers.length;
        System.out.println("Array values:");
        for (double num : numbers) {
            System.out.println(num);
        }
        System.out.println("Average: " + average);
    }
}

