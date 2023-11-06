public class Main {

    public static void main(String[] args) {

        System.out.println("Задача №1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", он совершеннолетний");
        }
        int age1 = 15;
        if (age1 < 18) {
            System.out.println("Если возраст человека равен " + age1 + ", он не достиг совершеннолетия, нужно немного подождать");
        }


        System.out.println("Задача №2");
        int temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        }
        int temperature1 = 7;
        if (temperature1 >= 5) {
            System.out.println("На улице " + temperature1 + " градусов, можно идти без шапки");
        }


        System.out.println("Задача №3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", придется заплатить штраф");
        }
        int speed1 = 27;
        if (speed1 <= 60) {
            System.out.println("Если скорость " + speed1 + ", можно ездить спокойно");
        }


        System.out.println("Задача №4");
        int age3 = 21;
        boolean kindergarten = age3 >= 2 && age3 <= 6;
        boolean school = age3 >= 7 && age3 <= 17;
        boolean univer = age3 >= 18 && age3 <= 24;

        if (kindergarten) {
            System.out.println("Если возраст человека равен " + age3 + " , то ему нужно ходить в детский сад");
        } else if (school) {
            System.out.println("Если возраст человека равен " + age3 + " , то ему нужно ходить в школу");
        } else if (univer) {
            System.out.println("Если возраст человека равен " + age3 + " , то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age3 + " , то ему нужно ходить на работу");
        }


        System.out.println("Задача 5");
        int age2 = 12;
        if (age2 <= 5) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе.");
        } else if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе в сопровождении взрослых.");
        } else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься без сопровождения взрослого");
        }


        System.out.println("Задача 6");
        int peopleInTrain = 102;
        int allSeatsInTrain = 102;
        int allSeatingTrain = 60;
        int standingPlacesInTrain = allSeatsInTrain - allSeatingTrain;
        int freeSeatingTrain = allSeatingTrain - peopleInTrain;
        int freeStandingPlacesInTrain = allSeatsInTrain - peopleInTrain;
        if (peopleInTrain < allSeatingTrain) {
            System.out.println("Если в вагоне поедут " + peopleInTrain + " человкв. То останется свободно " + freeSeatingTrain + " сидячих мест и " + standingPlacesInTrain + " стоячих мест");
        } else if (peopleInTrain == allSeatingTrain) {
            System.out.println("Если в вагоне поедут " + peopleInTrain + " человека. То все сидячие места заняты, остались только" + standingPlacesInTrain + " стоячих мест");
        } else if (peopleInTrain > allSeatingTrain && peopleInTrain < allSeatsInTrain) {
            System.out.println("Если в вагоне поедут " + peopleInTrain + " человека. То все сидячие места заняты, остались только" + freeStandingPlacesInTrain + " стоячих мест");
        } else if (peopleInTrain == allSeatsInTrain) {
            System.out.println("Если в вагоне поедут " + peopleInTrain + " человека. То все места будут заняты");
        } else if (peopleInTrain > allSeatsInTrain) {
            System.out.println("Все места заняты. Свободных мест нет");
        }


        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println("Самое большое число = " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Самое большое число = " + two);
        } else if (three >= one && three >= two) {
            System.out.println("Самое большое число = " + three);
        }
    }
}
