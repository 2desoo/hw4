public class Main {
    public static void main(String[] args) {
        public static void oper1() {
            int age = 7;
            boolean adult = age > 18;
            if (adult) {
                System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
            } else {
                System.out.println("Если возраст человека равен " + age + ", то нужно немного подождать.");
            }
        }

        public static void oper2() {
            int temp = 7;
            boolean cold = temp < 5;
            if (cold) {
                System.out.println("На улице холодно, нужно надеть шапку");
            } else {
                System.out.println("Сегодня тепло, можно идти без шапки");
            }
        }

        public static void oper3() {
            int speed = 100;
            boolean penalty = speed > 60;
            if (penalty) {
                System.out.println("Если скорость" + speed + ", то придется заплатить штраф.");
            } else {
                System.out.println("Если скорость" + speed + ", то можно ездить спокойно.");
            }
        }

        public static void oper4() {
            int age = 6;
            boolean kindergarten = age >= 2 && age <= 6;
            boolean school = age >= 7 && age <= 17;
            boolean univer = age >= 18 && age <= 24;

            if (kindergarten) {
                System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад");
            } else if (school) {
                System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");
            } else if (univer) {
                System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет");
            } else {
                System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу");
            }
        }

        public static void oper5() {
            int age = 6;
            boolean little = age < 5;
            boolean junior = age >= 5 && age < 14;

            if (little) {
                System.out.println("Если возраст ребенка равен " + age + " , то ему нельзя кататься на аттракционе");
            } else if (junior) {
                System.out.println("Если возраст ребенка равен " + age + " , то можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + age + " , то можно кататься на аттракционе без сопровождения взрослого");
            }
        }

        public static void oper6() {
            int people = 63;
            int capacity = 102;
            int seat = 60;

            boolean freeSeatPlace = people < seat;
            boolean freeStandPlace = people < capacity && people >= seat;
            if (freeStandPlace) {
                System.out.println("В вагоне есть стоячее место");
            } else if (freeSeatPlace) {
                System.out.println("В вагоне есть сидячее место");
            } else {
                System.out.println("В вагоне мест нет");
            }
        }

        public static void oper7() {
            int one = 1;
            int two = 5;
            int three = 3;
            if (one > two && one > three) {
                System.out.println("Большее число: " + one);
            } else if (two > one && two > three) {
                System.out.println("Большее число: " + two);
            } else {
                System.out.println("Большее число: " + three);
            }
        }
    }

}
}