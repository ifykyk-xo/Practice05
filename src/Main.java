import java.util.Arrays;
import java.util.Scanner;

class Practice05 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Завдання 1
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        numbers[0] = 10;
        numbers[2] = 30;
        numbers[4] = 50;

        System.out.println(Arrays.toString(numbers));


        // Завдання 2
        String[] days = {
                "Понеділок", "Вівторок", "Середа",
                "Четвер", "П'ятниця", "Субота", "Неділя"
        };

        System.out.println("Кількість днів: " + days.length);
        System.out.println("Перший день: " + days[0]);
        System.out.println("Останній день: " + days[days.length - 1]);

        days[5] = "Вихідний (Сб)";
        days[6] = "Вихідний (Нд)";

        System.out.println(Arrays.toString(days));


        // Завдання 3
        double[] prices = {120.50, 45.00, 890.99, 15.30, 420.00};

        System.out.println("Початкові ціни: " + Arrays.toString(prices));

        prices[2] = prices[2] * 0.8;

        System.out.println("Оновлені ціни: " + Arrays.toString(prices));


        // Завдання 4
        System.out.print("Введіть число N: ");
        int n = scanner.nextInt();

        int[] arr4 = new int[n];

        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr4));


        // Завдання 5
        int[] arr5 = {4, 8, 15, 16, 23, 42};

        for (int i = arr5.length - 1; i >= 0; i--) {
            System.out.print(arr5[i]);

            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        // Завдання 6
        int[] powers = new int[10];

        powers[0] = 1;

        for (int i = 1; i < powers.length; i++) {
            powers[i] = powers[i - 1] * 2;
        }

        System.out.println(Arrays.toString(powers));


        // Завдання 7
        int[] original = {3, 7, 1, 9, 4};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        copy[0] = 999;

        System.out.println("Оригінал: " + Arrays.toString(original));
        System.out.println("Копія: " + Arrays.toString(copy));


        // Завдання 8
        int[] grades = {95, 84, 70, 99, 65, 88, 92};

        int sumGrades = 0;

        for (int i = 0; i < grades.length; i++) {
            sumGrades += grades[i];
        }

        double averageGrade = (double) sumGrades / grades.length;

        System.out.println("Сума: " + sumGrades);
        System.out.println("Середній бал: " + averageGrade);


        // Завдання 9
        int[] temps = {18, 21, 15, 24, 13, 27, 20};

        int min = temps[0];
        int max = temps[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < temps.length; i++) {
            if (temps[i] < min) {
                min = temps[i];
                minIndex = i;
            }

            if (temps[i] > max) {
                max = temps[i];
                maxIndex = i;
            }
        }

        System.out.println("Мінімальна температура: " + min
                + ", індекс: " + minIndex);
        System.out.println("Максимальна температура: " + max
                + ", індекс: " + maxIndex);


        // Завдання 10
        int[] data = {12, -5, 0, 43, -19, 0, -2, 8, 0, 15};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                positive++;
            } else if (data[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Додатних: " + positive);
        System.out.println("Від'ємних: " + negative);
        System.out.println("Нулів: " + zero);


        // Завдання 11
        int[] numbers11 = {12, 7, 4, 9, 16, 3, 8, 11, 20, 5};

        int evenCount = 0;
        int oddSum = 0;

        for (int i = 0; i < numbers11.length; i++) {
            if (numbers11[i] % 2 == 0) {
                evenCount++;
            } else {
                oddSum += numbers11[i];
            }
        }

        System.out.println("Кількість парних: " + evenCount);
        System.out.println("Сума непарних: " + oddSum);


        // Завдання 12
        int[] students = {1042, 2031, 3055, 4018, 5099};

        System.out.print("Введіть номер студента: ");
        int target = scanner.nextInt();

        int foundIndex = -1;

        for (int i = 0; i < students.length; i++) {
            if (students[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Студента знайдено. Індекс: " + foundIndex);
        } else {
            System.out.println("Студента з таким номером не знайдено");
        }


        // Завдання 13
        int[] rolls = {3, 6, 2, 6, 1, 4, 6, 5, 2, 6};

        System.out.print("Введіть число від 1 до 6: ");
        int targetRoll = scanner.nextInt();

        int rollCount = 0;

        for (int i = 0; i < rolls.length; i++) {
            if (rolls[i] == targetRoll) {
                rollCount++;
            }
        }

        System.out.println("Число випало " + rollCount + " разів");


        // Завдання 14
        int[] salaries = {18000, 25000, 32000, 15000, 41000, 29000};

        int salarySum = 0;

        for (int i = 0; i < salaries.length; i++) {
            salarySum += salaries[i];
        }

        double averageSalary = (double) salarySum / salaries.length;

        System.out.println("Середня зарплата: " + averageSalary);
        System.out.println("Зарплати вище середньої:");

        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > averageSalary) {
                System.out.println(salaries[i]);
            }
        }


        // Завдання 15
        double[] prices15 = {42.5, 41.8, 44.1, 40.9, 43.6, 45.0};

        double minPrice = prices15[0];
        double maxPrice = prices15[0];

        for (int i = 1; i < prices15.length; i++) {
            if (prices15[i] < minPrice) {
                minPrice = prices15[i];
            }

            if (prices15[i] > maxPrice) {
                maxPrice = prices15[i];
            }
        }

        double difference = maxPrice - minPrice;
        difference = Math.round(difference * 100.0) / 100.0;

        System.out.println("Розмах цін: " + difference);


        // Завдання 16
        String[] cities = {"Київ", "Львів", "Харків", "Одеса", "Дніпро"};

        for (String city : cities) {
            System.out.println("Ласкаво просимо до міста " + city + "!");
        }


        // Завдання 17
        double[] salaries2 = {20000.0, 25000.0, 18000.0, 30000.0};

        for (int i = 0; i < salaries2.length; i++) {
            salaries2[i] = Math.round(salaries2[i] * 1.10 * 100.0) / 100.0;
        }

        System.out.println(Arrays.toString(salaries2));


        // Завдання 18
        int[] arr18 = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arr18.length / 2; i++) {
            int temp = arr18[i];
            arr18[i] = arr18[arr18.length - 1 - i];
            arr18[arr18.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(arr18));


        // Завдання 19
        int[] base = {2, 4, 6, 8, 10};
        int[] squares = new int[base.length];

        for (int i = 0; i < base.length; i++) {
            squares[i] = base[i] * base[i];
        }

        System.out.println("Початковий масив: " + Arrays.toString(base));
        System.out.println("Масив квадратів: " + Arrays.toString(squares));


        // Завдання 20
        int[] arr3 = {2, 5, 8, 12, 15};
        boolean isSorted = true;
        for (int i = 0; i < arr3.length - 1; i++) {
            if (arr3[i] > arr3[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Масив відсортований за зростанням");
        } else {
            System.out.println("Масив не відсортований за зростанням");
        }


        // Завдання 21
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6, 7};
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        System.out.println(Arrays.toString(c));


        // Завдання 22
        int[] test = {45, 12, 89, 3, 27};
        System.out.println(Arrays.toString(test));
        Arrays.sort(test);
        System.out.println(Arrays.toString(test));
        Arrays.fill(test, -1);
        System.out.println(Arrays.toString(test));


        // Завдання 23
        int[][] table = {
                {1, 2, 3},
                {3, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.println(table[i][j] + "\t");
            }
            System.out.println();
        }


        // Завдання 24
        int[][] matrix24 = {
                {10, 20, 30, 40},
                {50, 60, 70, 80}
        };
        System.out.println("Кількість рядків: " + matrix24.length);
        System.out.println("Кількість стовпчиків: " + matrix24[0].length);
        System.out.println(matrix24[0][0]);
        System.out.println(matrix24[0][3]);
        System.out.println(matrix24[1][0]);
        System.out.println(matrix24[1][3]);


        // Завдання 25
        int[][] grid = new int[3][4];
        int counter = 1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = counter;
                counter++;
                System.out.println(grid[i][j] + "\t");
            }
            System.out.println();
        }


        // Завдання 26
        int[][] randomGrid = new int[4][3];
        for (int i = 0; i < randomGrid.length; i++) {
            for (int j = 0; j < randomGrid[i].length; j++) {
                randomGrid[i][j] = (int) (Math.random() * 90) + 10;
            }
        }
        System.out.println(Arrays.deepToString(randomGrid));
        for (int i = 0; i < randomGrid.length; i++) {
            for (int j = 0; j < randomGrid[i].length; j++) {
                System.out.println(randomGrid[i][j] + "\t");
            }
            System.out.println();
        }


        // Завдання 27
        int[][] muItTable = new int[9][9];
        for (int i = 0; i < muItTable.length; i++) {
            for (int j = 0; j < muItTable[i].length; j++) {
                muItTable[i][j] = (i + 1) * (j + 1);
                System.out.println(muItTable[i][j] + "\t");
            }
            System.out.println();
        }


        // Завдання 28
        int[][] identity = new int[5][5];
        for (int i = 0; i < identity.length; i++) {
            for (int j = 0; j < identity[i].length; j++) {
                if (i == j) {
                    identity[i][j] = 1;
                } else {
                    identity[i][j] = 0;
                }
                System.out.print(identity[i][j] + "\t");
            }
            System.out.println();
        }


        // Завдання 29
        int[][] modified = new int[4][4];

        for (int i = 0; i < modified.length; i++) {
            for (int j = 0; j < modified[i].length; j++) {
                modified[i][j] = 1;
            }
        }

        for (int j = 0; j < modified[1].length; j++) {
            modified[1][j] = 0;
        }

        for (int i = 0; i < modified.length; i++) {
            modified[i][2] = 7;
        }

        for (int i = 0; i < modified.length; i++) {
            for (int j = 0; j < modified[i].length; j++) {
                System.out.print(modified[i][j] + "\t");
            }
            System.out.println();
        }


        // Завдання 30
        int[][] matrix30 = {
                {2, 4, 6},
                {8, 10, 12},
                {14, 16, 18},
        };
        int sum4 = 0;
        int count4 = 0;
        for (int i = 0; i < matrix30.length; i++) {
            for (int j = 0; j < matrix30[i].length; j++) {
                sum4 += matrix30[i][j];
                count4++;
            }
        }
        double average5 = (double) sum4 / count4;
        System.out.println("Сума: " + sum4);
        System.out.println("Кількість: " + count4);
        System.out.println("Середнє значення: " + average5);


        // Завдання 31
        int[][] matrix31 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };
        int[] rowSums = new int[3];
        for (int i = 0; i < matrix31.length; i++) {
            for (int j = 0; j < matrix31[i].length; j++) {
                rowSums[i] += matrix31[i][j];
            }
            System.out.println("Рядок " + i + ": сума = " + rowSums[i]);
        }


        // Завдання 32
        int[][] matrix32 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int j = 0; j < matrix32[0].length; j++) {
            int sum32 = 0;

            for (int i = 0; i < matrix32.length; i++) {
                sum32 += matrix32[i][j];
            }

            System.out.print(sum32 + "\t");
        }
        System.out.println();


        // Завдання 33
        int[][] matrix33 = {
                {4, -2, 15, 7},
                {9, 21, -5, 3},
                {11, 6, 8, -1},
        };
        int max33 = matrix33[0][0];
        int maxRow33 = 0;
        int maxCol33 = 0;

        for (int i = 0; i < matrix33.length; i++) {
            for (int j = 0; j < matrix33[i].length; j++) {
                if (matrix33[i][j] > max33) {
                    max33 = matrix33[i][j];
                    maxRow33 = i;
                    maxCol33 = j;
                }
            }
        }
        System.out.println("Максимум: " + max33 + " у комірці [" + maxRow33 + ", " + maxCol33 + "]");


        // Завдання 34
        int[][] matrix34 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        int mainDiagonal = 0;
        int sideDiagonal = 0;
        for (int i = 0; i < matrix34.length; i++) {
            mainDiagonal += matrix34[i][0];
            sideDiagonal += matrix34[i][matrix34.length - 1 - i];
        }
        System.out.println("Головна діагональ: " + mainDiagonal);
        System.out.println("Побічна діагональ: " + sideDiagonal);
        if (mainDiagonal > sideDiagonal) {
            System.out.println("Головна діагональ більша");
        } else if (mainDiagonal < sideDiagonal) {
            System.out.println("Побічна діагональ більша");
        } else {
            System.out.println("Суми рівні");
        }


        // Завдання 35
        int[][] matrix35 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int[][] transposed = new int[3][3];
        for (int i = 0; i < matrix35.length; i++) {
            for (int j = 0; j < matrix35[i].length; j++) {
                transposed[j][i] = matrix35[i][j];
            }
        }
        System.out.println("Транспонована матриця:");

        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + "\t");
            }
            System.out.println();
        }


        // Завдання 36
        int[][] ladder = new int[4][];
        for (int i = 0; i < ladder.length; i++) {
            ladder[i] = new int[i + 1];
            for (int j = 0; j < ladder[i].length; j++) {
                ladder[i][j] = i;
                System.out.println(ladder[i][j] + " ");
            }
            System.out.println();
        }


        // Завдання 37
        String[][] weekSchedule = new String[5][];

        weekSchedule[0] = new String[]{
                "Вища математика", "Основи програмування", "Фізика"
        };
        weekSchedule[1] = new String[]{
                "Англійська мова", "Історія України"
        };
        weekSchedule[2] = new String[]{
                "Основи програмування", "Основи програмування",
                "Бази даних", "Фізвиховання"
        };
        weekSchedule[3] = new String[]{
                "Дискретна математика"
        };
        weekSchedule[4] = new String[]{
                "Філософія", "Основи алгоритмізації", "Практикум"
        };

        String[] weekDays = {
                "Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця"
        };

        for (int i = 0; i < weekSchedule.length; i++) {
            System.out.println(weekDays[i] + " — кількість пар: " + weekSchedule[i].length);

            for (int j = 0; j < weekSchedule[i].length; j++) {
                System.out.println(weekSchedule[i][j]);
            }
        }


        // Завдання 38
        int[][] pascal = new int[5][];

        for (int i = 0; i < pascal.length; i++) {
            pascal[i] = new int[i + 1];

            for (int j = 0; j < pascal[i].length; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1]
                            + pascal[i - 1][j];
                }
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }


        // Завдання 39
        int[][][] cube = new int[3][3][3];
        for (int x = 0; x < cube.length; x++) {
            for (int y = 0; y < cube[x].length; y++) {
                for (int z = 0; z < cube[x][y].length; z++) {
                    cube[x][y][z] = x * y + z;
                }
            }
        }
        for (int x = 0; x < cube.length; x++) {
            System.out.println("--- Шар " + x + " ---");
            for (int y = 0; y < cube[x].length; y++) {
                for (int z = 0; z < cube[x][y].length; z++) {
                    System.out.println(cube[x][y][z] + "\t");
                }
                System.out.println();
            }
        }


        // Завдання 40
        double[][][] weather = new double[3][7][2];
        String[] cities40 = {"Київ", "Львів", "Одеса"};
        double[][] temperatures40 = {
                {18, 10, 19, 11, 21, 12, 20, 10, 22, 13, 19, 9, 20, 11},
                {15, 7, 16, 8, 17, 9, 18, 8, 16, 7, 17, 8, 15, 6},
                {23, 15, 24, 16, 25, 17, 24, 15, 26, 18, 25, 16, 24, 14}
        };
        for (int i = 0; i < weather.length; i++) {
            for (int j = 0; j < weather[i].length; j++) {
                weather[i][j][0] = temperatures40[i][j * 2];
                weather[i][j][1] = temperatures40[i][j * 2 + 1];
            }
        }

        for (int i = 0; i < weather.length; i++) {
            double sumDay = 0;
            for (int j = 0; j < weather[i].length; j++) {
                sumDay += weather[i][j][0];
            }
            double averageDay = Math.round(sumDay / 7.0 * 10) / 10.0;
            System.out.println("Середня денна температура, " + cities40[i] + ": " + averageDay);
        }
        double coldestNight = weather[0][0][1];

        for (int i = 0; i < weather.length; i++) {
            for (int j = 0; j < weather[i].length; j++) {
                if (weather[i][j][1] < coldestNight) {
                    coldestNight = weather[i][j][1];
                }
            }
        }

        System.out.println("Найхолодніша ніч: " + coldestNight);
    }
}
