package com.dakakolp;

public class HomeTaskTest4 {
    public static void main(String[] args) {
        //HomeTasks//

        //1
//        min_maxTask1();


        //2 circle
//        System.out.println("AreaOfCircle: " + MyMath.areaOfCircle(100));


        //3
//        employeeTask3();


        //4 calcPi
//        System.out.println("PI: " + MyCalc.calcPi(10000));


        //5 pyramid
//        MyPyramid.printPyramid(9);


        //6 gravity
//        gravityTask6(2);

    }

    //1
    public static void min_maxTask1() {
        int[] a1 = new int[10];
        System.out.print("Array: ");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = (int) (Math.random() * 100);
            System.out.print(a1[i] + " ");
        }

        System.out.println();
        System.out.println("Min: " + MyMath.findMin(a1));
        System.out.println("Max: " + MyMath.findMax(a1));

        int[] a2 = new int[]{12, 86, 45, 9, 85, 44, 79, 19, 5, 85};

        System.out.println();
        System.out.println("Min: " + MyMath.findMin(a2));
        System.out.println("Max: " + MyMath.findMax(a2));
    }

    //3
    public static void employeeTask3() {
        Employee e1 = new Employee("Mark", "Ivanov", "student", "123-45-67");
        Employee e2 = new Employee("Ivan", "Petrov", "director", "789-45-12");
        Employee e3 = new Employee("Nikola", "Sidorov", "secretary", "852-41-63");

        System.out.println("NumberOfEmployees: " + Employee.getNumberOfEmployees());
    }

    //6
    public static void gravityTask6(double time) {
        GravityCalculator gc = new GravityCalculator(0,0);
        System.out.println("Position: " + gc.calcDist(time));
    }

}
