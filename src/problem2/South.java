package problem2;

//Understands the change of directions
public class South extends Direction {

    public East turnLeft(){
        return new East();
    }

    public West turnRight(){
        return new West();
    }

    @Override
    public int hashCode() {
        return 2;
    }
}
