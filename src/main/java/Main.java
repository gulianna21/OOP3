public class Main {
    public static void main(String[] args) {
        JumpRun[] party = {
                new Human(100, 500),
                new Cat(30, 100),
                new Robot(250, 1000),
        };

        Obstacle[] lets = {
                new Treadmill(100),
                new Wall(100),
                new Treadmill(200),
                new Wall(200),
                new Treadmill(600),
                new Wall(300),
        };

        for (JumpRun member : party) {
            for (Obstacle let : lets) {
                boolean check;
                if (let instanceof Wall) {
                    check = member.jump(((Wall) let).getHeight());
                } else {
                    check = member.run(((Treadmill) let).getLength());
                }
                if (!check)
                    break;
            }
        }
    }
}
