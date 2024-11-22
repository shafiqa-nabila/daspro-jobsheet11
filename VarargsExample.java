public class VarargsExample {
    public static void main(String[] args) {
        printData(10, 20, 30);
        printData("Andi", "Budi", "Citra");
        printDataMixed(10, 20, "Andi", "Budi"); // Metode baru untuk campuran
    }

    public static void printData(int... numbers) {
        System.out.println("Integers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printData(String... names) {
        System.out.println("Strings:");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

    // Metode baru untuk menangani campuran
    public static void printDataMixed(int num1, int num2, String name1, String name2) {
        System.out.println("Mixed Data:");
        System.out.print(num1 + " " + num2 + " " + name1 + " " + name2 + " ");
        System.out.println();
    }
}