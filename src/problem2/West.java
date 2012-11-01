package problem2;

//Understands the change of directions
public class West extends Direction {

    public South turnLeft(){
        return new South();
    }

    public North turnRight(){
        return new North();
    }

    @Override
    public int hashCode() {
        return 4;
    }
}
