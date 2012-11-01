package problem2;

//Understands the change of directions
public class North extends Direction {

    public West turnLeft(){
        return new West();
    }

    public East turnRight(){
        return new East();
    }

    @Override
    public int hashCode() {
        return 1;
    }



}
