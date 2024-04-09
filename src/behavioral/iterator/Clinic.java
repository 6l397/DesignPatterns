package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Clinic implements AnimalList {
    private List<Animalt> animals;

    public Clinic() {
        this.animals = new ArrayList<>();
    }

    public void addAnimalt(Animalt animal) {
        animals.add(animal);
    }

    @Override
    public Iterator<Animalt> createIterator() {
        return new ClinicAnimaltIterator();
    }

    private class ClinicAnimaltIterator implements Iterator<Animalt> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < animals.size();
        }

        @Override
        public Animalt next() {
            return animals.get(currentIndex++);
        }
    }
}