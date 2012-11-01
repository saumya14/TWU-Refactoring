package problem2;
//Understands the

public class Rover {
    public Direction direction;

    public Rover(Direction direction) {
        this.direction = direction;
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Rover another = (Rover) object;

        return direction.equals(another.direction);

    }

    @Override
    public int hashCode() {
        return direction.hashCode();
    }
}
