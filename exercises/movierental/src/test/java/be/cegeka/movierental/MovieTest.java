package be.cegeka.movierental;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MovieTest {

    @Test
    public void name() throws Exception {
        assertThat(new Movie().name()).isEqualTo("Wayne's World");
    }
}