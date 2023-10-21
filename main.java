import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class main {
     /*
    Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    Создать множество ноутбуков.
    Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет
    ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
    Например:
    “Введите цифру, соответствующую необходимому критерию:
    1 - ОЗУ
    2 - Объем ЖД
    3 - Операционная система
    4 - Цвет …
    Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
    Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
    Работу сдать как обычно ссылкой на гит репозиторий
    Частые ошибки:
    1. Заставляете пользователя вводить все существующие критерии фильтрации
    2. Невозможно использовать более одного критерия фильтрации одновременно
    3. При выборке выводятся ноутбуки, которые удовлетворяют только одному фильтру, а не всем введенным пользователем
    4. Работа выполнена только для каких то конкретных ноутбуков, и если поменять характеристики ноутбуков или
    добавить еще ноутбук, то программа начинает работать некорректно
     */

    public static void main(String[] args) {

        Set<Laptop> laptops = new HashSet<>();

        Laptop laptop1 = new Laptop();
        laptop1.setRam(ram());
        laptop1.setHardDriveCapacity(hardDriveCapacity());
        laptop1.setOperationSystem(operationSystem());
        laptop1.setColor(color());
        laptop1.setScreenSize(screenSize());
        laptop1.setName(name());

        Laptop laptop2 = new Laptop();
        laptop2.setRam(ram());
        laptop2.setHardDriveCapacity(hardDriveCapacity());
        laptop2.setOperationSystem(operationSystem());
        laptop2.setColor(color());
        laptop2.setScreenSize(screenSize());
        laptop2.setName(name());

        Laptop laptop3 = new Laptop();
        laptop3.setRam(ram());
        laptop3.setHardDriveCapacity(hardDriveCapacity());
        laptop3.setOperationSystem(operationSystem());
        laptop3.setColor(color());
        laptop3.setScreenSize(screenSize());
        laptop3.setName(name());

        Laptop laptop4 = new Laptop();
        laptop4.setRam(ram());
        laptop4.setHardDriveCapacity(hardDriveCapacity());
        laptop4.setOperationSystem(operationSystem());
        laptop4.setColor(color());
        laptop4.setScreenSize(screenSize());
        laptop4.setName(name());

        Laptop laptop5 = new Laptop();
        laptop5.setRam(ram());
        laptop5.setHardDriveCapacity(hardDriveCapacity());
        laptop5.setOperationSystem(operationSystem());
        laptop5.setColor(color());
        laptop5.setScreenSize(screenSize());
        laptop5.setName(name());

        Laptop laptop6 = new Laptop();
        laptop6.setRam(ram());
        laptop6.setHardDriveCapacity(hardDriveCapacity());
        laptop6.setOperationSystem(operationSystem());
        laptop6.setColor(color());
        laptop6.setScreenSize(screenSize());
        laptop6.setName(name());

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);


        menuFiltr();
        filtr(laptops);
        Set<Laptop> filtrLaptop = new HashSet<>();
        filtrLaptop.add(laptopfiltr);
        System.out.print("Опции фильтра: ");
        printLaptops(filtrLaptop);
        System.out.println();
        System.out.println("Список ноутбуков отвечающих требованиям: ");
        filtrPrint(laptops, filtrLaptop);
    }
    public static Laptop laptopfiltr = new Laptop();
    static Integer ram() {
        Integer[] rams = {4, 6, 8, 16, 32, 64};
        Random random = new Random();
        return rams[random.nextInt(rams.length)];
    }

    static Integer hardDriveCapacity() {
        Integer[] hardDriveCapacity = {120, 240, 500, 1000, 2000};
        Random random = new Random();
        int hardDriveCapacitys = hardDriveCapacity[random.nextInt(hardDriveCapacity.length)];
        return hardDriveCapacitys;
    }

    static String operationSystem() {
        String[] strings = {"Ubuntu", "Windows 11", "MacOS", "Linux"};
        Random random = new Random();
        String system = strings[random.nextInt(strings.length)];
        return system;
    }

    static String color() {
        String[] strings = {"Серебристый", "Белый", "Чёрный", "Красный", "Артхаус"};
        Random random = new Random();
        String color = strings[random.nextInt(strings.length)];
        return color;
    }

    static Integer screenSize() {
        Integer[] integers = {13, 15, 17, 19};
        Random random = new Random();
        int screenSize = integers[random.nextInt(integers.length)];
        return screenSize;
    }

    static String name() {
        String[] strings = {"ASUS", "ACER", "Apple", "GIGABYTE", "MSI", "HUAWEI"};
        Random random = new Random();
        String name = strings[random.nextInt(strings.length)];
        return name;
    }


    static void printLaptops(Set<Laptop> laptops) {
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }

    static Laptop filtr(Set<Laptop> laptops) {
        boolean exit = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите число: ");
        int line = scanner.nextInt();
        switch (line) {
            case 1: //выбор объема памяти
                System.out.println("Напишите необходимый объем памяти RAM: 1. 4 Гб, 2. 6 Гб, 3. 8 Гб, 4. 16 Гб, 5. 32 Гб, 6. 64 Гб");
                Scanner scanner2 = new Scanner(System.in);
                int line2 = scanner2.nextInt();
                switch (line2) {
                    case 1 -> laptopfiltr.setRam(4);
                    case 2 -> laptopfiltr.setRam(6);
                    case 3 -> laptopfiltr.setRam(8);
                    case 4 -> laptopfiltr.setRam(16);
                    case 5 -> laptopfiltr.setRam(32);
                    case 6 -> laptopfiltr.setRam(64);
                    default -> System.out.println("Вы ввели неверный объем RAM");
                }
                menuFiltr();
                return filtr(laptops);
            case 2: //Выберите объем Hard disc
                System.out.println("Напишите необходимый объем HDD: 1. 120 Гб, 2. 240 Гб, 3. 500 Гб, 4. 1000 Гб, 5. 2000 Гб");
                Scanner scanner3 = new Scanner(System.in);
                int line3 = scanner3.nextInt();
                switch (line3) {
                    case 1 -> laptopfiltr.setHardDriveCapacity(120);
                    case 2 -> laptopfiltr.setHardDriveCapacity(240);
                    case 3 -> laptopfiltr.setHardDriveCapacity(500);
                    case 4 -> laptopfiltr.setHardDriveCapacity(1000);
                    case 5 -> laptopfiltr.setHardDriveCapacity(2000);
                    default -> System.out.println("Выбранного объема  HDD нет");
                }
                menuFiltr();
                return filtr(laptops);
            case 3: //Выберите размер диагонали дисплея
                System.out.println("Напишите необходимую диагональ дисплея: 1. 13 дюймов, 2. 15 дюймов, 3. 17 дюймов, 4. 19 дюймов, 5. 21 дюйм");
                Scanner scanner4 = new Scanner(System.in);
                int line4 = scanner4.nextInt();
                switch (line4) {
                    case 1 -> laptopfiltr.setScreenSize(13);
                    case 2 -> laptopfiltr.setScreenSize(15);
                    case 3 -> laptopfiltr.setScreenSize(17);
                    case 4 -> laptopfiltr.setScreenSize(19);
                    case 5 -> laptopfiltr.setScreenSize(21);
                    default -> System.out.println("Выбранной диагонали дисплея нет");
                }
                menuFiltr();
                return filtr(laptops);
            case 4: //Выберите операционную систему
                System.out.println("Напишите необходимую операционную систему: 1. Ubuntu, 2. Windows 11, 3. MacOS, 4. Linux");
                Scanner scanner5 = new Scanner(System.in);
                int line5 = scanner5.nextInt();
                switch (line5) {
                    case 1 -> laptopfiltr.setOperationSystem("Ubuntu");
                    case 2 -> laptopfiltr.setOperationSystem("Windows");
                    case 3 -> laptopfiltr.setOperationSystem("MacOS");
                    case 4 -> laptopfiltr.setOperationSystem("Linux");
                    default -> System.out.println("Выбранной операционной системы нет");
                }
                menuFiltr();
                return filtr(laptops);
            case 5: //Выберите цвет
                System.out.println("Напишите необходимый цвет ноутбука: 1. Серебристый, 2. Белый, 3. Чёрный, 4. Красный, 5. Артхаус");
                Scanner scanner6 = new Scanner(System.in);
                int line6 = scanner6.nextInt();
                switch (line6) {
                    case 1 -> laptopfiltr.setColor("Серебристый");
                    case 2 -> laptopfiltr.setColor("Белый");
                    case 3 -> laptopfiltr.setColor("Чёрный");
                    case 4 -> laptopfiltr.setColor("Красный");
                    case 5 -> laptopfiltr.setColor("Артхаус");
                    default -> System.out.println("Выбранного цвета нет");
                }
                menuFiltr();
                return filtr(laptops);
            case 6: //Выберите производителя
                System.out.println("Напишите необходимого производителя: 1. ASUS, 2. ACER, 3. Apple, 4. GIGABYTE, 5. MSI, 6. HUAWEI");
                Scanner scanner7 = new Scanner(System.in);
                int line7 = scanner7.nextInt();
                switch (line7) {
                    case 1 -> laptopfiltr.setName("ASUS");
                    case 2 -> laptopfiltr.setName("ACER");
                    case 3 -> laptopfiltr.setName("Apple");
                    case 4 -> laptopfiltr.setName("GIGABYTE");
                    case 5 -> laptopfiltr.setName("MSI");
                    case 6 -> laptopfiltr.setName("HUAWEI");
                    default -> System.out.println("Вы ввели неверную цифру производителя");
                }
                menuFiltr();
                return filtr(laptops);
            case 7: //Вывести все ноутбуки в наличии
                System.out.println();
                System.out.println("Все ноутбуки");
                for (Laptop laptop : laptops) {
                    System.out.println(laptop);
                }
                System.out.println();
                menuFiltr();
                return filtr(laptops);
            case 8: //выход
                exit = false;
                break;
            default:
                System.out.println("Вы ввели неверный пункт поиска, попробуйте еще раз");
                menuFiltr();
                return filtr(laptops);
        }
        return laptopfiltr;
    }

    static void menuFiltr() {
        System.out.println("Выберете требуемый поиск:");
        System.out.println("1. Выберите объем RAM");
        System.out.println("2. Выберите объем Hard disc(HDD)");
        System.out.println("3. Выберите размер диагонали дисплея");
        System.out.println("4. Выберите операционную систему(OS)");
        System.out.println("5. Выберите цвет");
        System.out.println("6. Выберите производителя");
        System.out.println("7. Вывести все ноутбуки в наличии");
        System.out.println("8. Закончить поиск и показать результат ");
    }

    static void filtrPrint(Set<Laptop> laptops, Set<Laptop> filtrLaptop) {
        boolean foundMatch = false;
        for (Laptop laptop : laptops) {
            for (Laptop laptop1 : filtrLaptop) {
                if ((laptop1.getRam() == null) & (laptop1.getHardDriveCapacity() == null) & (laptop1.getScreenSize()) == null) {
                    if ((Objects.equals(laptop.getColor(), laptop1.getColor())) | (Objects.equals(laptop.getName(), laptop1.getName())) | (Objects.equals(laptop.getOperationSystem(), laptop1.getOperationSystem()))){
                        System.out.println(laptop);
                        foundMatch = true;
                    }
                }
                if ((laptop1.getRam() != null) & (laptop1.getHardDriveCapacity() == null) & (laptop1.getScreenSize()) == null){
                    if ((laptop.getRam() >= laptop1.getRam()) | (Objects.equals(laptop.getColor(), laptop1.getColor())) | (Objects.equals(laptop.getName(), laptop1.getName())) | (Objects.equals(laptop.getOperationSystem(), laptop1.getOperationSystem()))) {
                        System.out.println(laptop);
                        foundMatch = true;
                    }
                }
                if ((laptop1.getRam() != null) & (laptop1.getHardDriveCapacity() != null) & (laptop1.getScreenSize()) == null){
                    if ((laptop.getRam() >= laptop1.getRam()) | (laptop.getHardDriveCapacity() >= laptop1.getHardDriveCapacity()) | (Objects.equals(laptop.getColor(), laptop1.getColor())) | (Objects.equals(laptop.getName(), laptop1.getName())) | (Objects.equals(laptop.getOperationSystem(), laptop1.getOperationSystem()))) {
                        System.out.println(laptop);
                        foundMatch = true;
                    }
                }
                if ((laptop1.getRam() != null) & (laptop1.getHardDriveCapacity() == null) & (laptop1.getScreenSize()) != null){
                    if ((laptop.getRam() >= laptop1.getRam()) | (laptop.getScreenSize() >= laptop1.getScreenSize()) | (Objects.equals(laptop.getColor(), laptop1.getColor())) | (Objects.equals(laptop.getName(), laptop1.getName())) | (Objects.equals(laptop.getOperationSystem(), laptop1.getOperationSystem()))) {
                        System.out.println(laptop);
                        foundMatch = true;
                    }
                }
                if ((laptop1.getRam() == null) & (laptop1.getHardDriveCapacity() != null) & (laptop1.getScreenSize()) == null){
                    if ((laptop.getHardDriveCapacity() >= laptop1.getHardDriveCapacity()) | (Objects.equals(laptop.getColor(), laptop1.getColor())) | (Objects.equals(laptop.getName(), laptop1.getName())) | (Objects.equals(laptop.getOperationSystem(), laptop1.getOperationSystem()))) {
                        System.out.println(laptop);
                        foundMatch = true;
                    }
                }
                if ((laptop1.getRam() == null) & (laptop1.getHardDriveCapacity() != null) & (laptop1.getScreenSize()) != null){
                    if ((laptop.getHardDriveCapacity() >= laptop1.getHardDriveCapacity()) | (laptop.getScreenSize() >= laptop1.getScreenSize()) | (Objects.equals(laptop.getColor(), laptop1.getColor())) | (Objects.equals(laptop.getName(), laptop1.getName())) | (Objects.equals(laptop.getOperationSystem(), laptop1.getOperationSystem()))) {
                        System.out.println(laptop);
                        foundMatch = true;
                    }
                }
                if ((laptop1.getRam() == null) & (laptop1.getHardDriveCapacity() == null) & (laptop1.getScreenSize()) != null){
                    if ((laptop.getScreenSize() >= laptop1.getScreenSize()) | (Objects.equals(laptop.getColor(), laptop1.getColor())) | (Objects.equals(laptop.getName(), laptop1.getName())) | (Objects.equals(laptop.getOperationSystem(), laptop1.getOperationSystem()))) {
                        System.out.println(laptop);
                        foundMatch = true;
                    }
                }
            }
        }
        if (!foundMatch) {
            System.out.println("Подходящих ноутбуков не найдено");
        }
    }
}
