package by.academiapvt;

public class Main {
    public static void main(String[] args) {
        RobotCooker robot1 = new RobotCooker();
        robot1.toMakeARobot();
        RobotSapper robot2 = new RobotSapper();
        robot2.toMakeARobot();
        RobotBuilder robot3 = new RobotBuilder();
        robot3.toMakeARobot();
        Robot[] robots = new Robot[3];
        robots[0] = robot1;
        robots[1] = robot2;
        robots[2] = robot3;
//        ******** Task 1.3
        robot1.toShowAbilities();
        robot2.toShowAbilities();
        robot3.toShowAbilities();

//        ******** Task 1.4
        Robot[] allRobots = new Robot[3];
        allRobots[0] = robot1;
        allRobots[1] = robot2;
        allRobots[2] = robot3;
        RobotEngineer[] engineerRobots = new RobotEngineer[2];
        engineerRobots[0] = robot2;
        engineerRobots[1] = robot3;
        RobotSapper[] robotSappers = new RobotSapper[3];
        robotSappers[0] = robot2;
        robotSappers[1] = new RobotSapper ("Минер1", 5600, "ДВС", "Канада", "Отвал", "Сталь", false  );
        robotSappers[2] = new RobotSapper ("Минер2", 2300, "Батарейки", "Чехия", "Универсальный прибор", "Пластик", false  );
        System.out.println("Роботы всех типов");
        for (Robot robot : allRobots) {
            System.out.println(robot);
        }
        System.out.println("Роботы-инженеры");
        for (RobotEngineer robot : engineerRobots) {
            System.out.println(robot);
        }
        System.out.println("Роботы-саперы");
        for (RobotSapper robot : robotSappers) {
            System.out.println(robot);
        }

    }

}

