package problem2;

//Understands the change of directions
public class East extends Direction {
    public North turnLeft(){
        return new North();
    }

    public South turnRight(){
        return new South();
    }

    @Override
    public int hashCode() {
        return 3;
    }
}
