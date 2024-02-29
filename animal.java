public abstract class animal {
    private int ToGo;
    private int swim;
    private float jump;

    public animal(int ToGo, int swim, float jum) {
        this.ToGo = ToGo;
        this.swim = swim;
        this.jump = jump;
    }

    public void run(int ToGo) { 
        System.out.println("run: " + (ToGo <= ToGo));
    }

    public void swim(int swim) {
        System.out.println("swim: " + (swim <= swim));
    }

    public void jump(float jump) { 
        System.out.println("jump: " + (jump <= jump));
    }
}
