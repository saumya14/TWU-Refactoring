package problem2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

//Ensures the change of direction happens correctly
public class RoverTest {
    @Test
    public void shouldHaveNewDirectionAsEastWhenTurningRightFromNorth() {
        Rover rover = new Rover(new North());

        rover.turnRight();

        assertThat(rover, is(new Rover(new East())));
    }

    @Test
    public void shouldHaveNewDirectionAsSouthWhenTurningRightFromEast() {
        Rover rover = new Rover(new East());

        rover.turnRight();

        assertThat(rover, is(new Rover(new South())));
    }

    @Test
    public void shouldHaveNewDirectionAsWestWhenTurningRightFromSouth() {
        Rover rover = new Rover(new South());

        rover.turnRight();

        assertThat(rover, is(new Rover(new West())));
    }

    @Test
    public void shouldHaveNewDirectionAsNorthWhenTurningRightFromWest() {
        Rover rover = new Rover(new West());

        rover.turnRight();

        assertThat(rover, is(new Rover(new North())));
    }

    @Test
    public void shouldHaveNewDirectionAsWestWhenTurningLeftFromNorth() {
        Rover rover = new Rover(new North());

        rover.turnLeft();

        assertThat(rover, is(new Rover(new West())));
    }
}
