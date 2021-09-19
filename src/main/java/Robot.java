public class Robot implements JumpRun {
    private final int jumpLength;
    private final int runDistance;

    public Robot(int jumpLength, int runDistance) {
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
            System.out.println("Robot run " + value + " distance");
            return true;
        } else {
            System.out.println("Robot did not run " + value + " only " + runDistance);
            return false;
        }
    }

    @Override
    public boolean jump(int value) {
        if (jumpLength >= value) {
            System.out.println("Robot jump " + value);
            return true;
        } else {
            System.out.println("Robot did not jump " + value + " only " + jumpLength);
            return false;
        }
    }
}
