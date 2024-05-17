package ProgramNo4;

import java.util.Scanner;

public class ComplexCalculator {
    private double value1;
    private double value2;
    private double value3;

    // Constructor for calculations requiring two values
    public ComplexCalculator(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    // Constructor for calculations requiring three values
    public ComplexCalculator(double value1, double value2, double value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    // Overloaded method to calculate the area of a triangle
    public double calculate(String formula) {
        switch (formula) {
            case "triangle_area":
                return 0.5 * value1 * value2;
            default:
                throw new IllegalArgumentException("Invalid formula for two values.");
        }
    }

    // Overloaded method to calculate the volume of a cylinder
    public double calculate(String formula, String additionalParam) {
        switch (formula) {
            case "cylinder_volume":
                return Math.PI * value1 * value1 * value2;
            default:
                throw new IllegalArgumentException("Invalid formula for two values.");
        }
    }

    // Overloaded method to calculate using three values
    public double calculate(String formula, double ignored) {
        switch (formula) {
            case "quadratic_equation_root1":
                return (-value2 + Math.sqrt(value2 * value2 - 4 * value1 * value3)) / (2 * value1);
            case "quadratic_equation_root2":
                return (-value2 - Math.sqrt(value2 * value2 - 4 * value1 * value3)) / (2 * value1);
            case "kinetic_energy":
                return 0.5 * value1 * value2 * value2;
            default:
                throw new IllegalArgumentException("Invalid formula for three values.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih rumus yang ingin dihitung:");
            System.out.println("1. Luas Segitiga");
            System.out.println("2. Volume Silinder");
            System.out.println("3. Akar-akar Persamaan Kuadrat");
            System.out.println("4. Energi Kinetik");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Masukkan alas segitiga: ");
                    double base = scanner.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double height = scanner.nextDouble();
                    ComplexCalculator triangle = new ComplexCalculator(base, height);
                    System.out.println("Luas Segitiga: " + triangle.calculate("triangle_area"));
                    break;

                case 2:
                    System.out.print("Masukkan jari-jari silinder: ");
                    double radius = scanner.nextDouble();
                    System.out.print("Masukkan tinggi silinder: ");
                    double cylinderHeight = scanner.nextDouble();
                    ComplexCalculator cylinder = new ComplexCalculator(radius, cylinderHeight);
                    System.out.println("Volume Silinder: " + cylinder.calculate("cylinder_volume", ""));
                    break;

                case 3:
                    System.out.print("Masukkan koefisien a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Masukkan koefisien b: ");
                    double b = scanner.nextDouble();
                    System.out.print("Masukkan koefisien c: ");
                    double c = scanner.nextDouble();
                    ComplexCalculator quadratic = new ComplexCalculator(a, b, c);
                    System.out.println("Akar-akar persamaan kuadrat:");
                    System.out.println("Root 1: " + quadratic.calculate("quadratic_equation_root1", 0));
                    System.out.println("Root 2: " + quadratic.calculate("quadratic_equation_root2", 0));
                    break;

                case 4:
                    System.out.print("Masukkan massa benda: ");
                    double mass = scanner.nextDouble();
                    System.out.print("Masukkan kecepatan benda: ");
                    double velocity = scanner.nextDouble();
                    ComplexCalculator kineticEnergy = new ComplexCalculator(mass, velocity);
                    System.out.println("Energi Kinetik: " + kineticEnergy.calculate("kinetic_energy", 0));
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }

        scanner.close();
    }
}
