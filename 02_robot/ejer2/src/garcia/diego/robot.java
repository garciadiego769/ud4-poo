package garcia.diego;

public class robot {
    private int x;
    private int y;

    public robot() {
        x=0;
        y=0;
    }

    public robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "robot{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void mover(int dx, int dy){
        if( dx >= -1 && dx <=1 &&
                 dy >= -1 && dy <= 1 &&
                (dx==0 || dy==0) &&
                x > -10 && x < 10 &&
                y > -10 && y < 10
                ) {
            //movemos
            x +=dx;
            y +=dy;

        }
    }
}
