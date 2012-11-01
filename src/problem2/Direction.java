package problem2;

//Understands the changes in the direction
public class Direction {

    public Direction turnLeft(){
        return null;
    }
    public Direction turnRight(){
        return null;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        return  (object != null || getClass() == object.getClass());
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
