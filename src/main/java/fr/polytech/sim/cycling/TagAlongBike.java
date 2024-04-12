package fr.polytech.sim.cycling;

import java.util.Objects;

public class TagAlongBike extends Bike{

    public TagAlongBike(SimpleBike simpleBike) {
        Objects.requireNonNull(simpleBike, "Bike must not be null.");
        this.components.add(simpleBike);
    }

    public TagAlongBike() {
        this(new SimpleBike());
    }
}
