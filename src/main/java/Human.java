public class Human implements JumpRun {
    private final int jumpLength;
    private final int runDistance;

    public Human(int jumpLength, int runDistance) {
        this.jumpLength = jumpLength;
        this.runDistance = runDistance;
    }

    public int getJumpLength() {
        return jumpLength;
    }

    public int getRunDistance() {
        return runDistance;
    }

    @Override
    public boolean run(int value) {
        if (runDistance >= value) {
            System.out.println("Human run " + value + " distance");
            return true;
        } else {
            System.out.println("Human did not run " + value + " only " + runDistance);
            return false;
        }
    }

    @Override
    public boolean jump(int value) {
        if (jumpLength >= value) {
            System.out.println("Human jump " + value);
            return true;
        } else {
            System.out.println("Human did not jump " + value + " only " + jumpLength);
            return false;
        }
    }
}
