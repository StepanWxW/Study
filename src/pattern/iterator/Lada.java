package pattern.iterator;

public class Lada implements Collection {
    String name;
    String[] equipment;

    public Lada(String name, String[] equipment) {
        this.name = name;
        this.equipment = equipment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getEquipment() {
        return equipment;
    }

    public void setEquipment(String[] equipment) {
        this.equipment = equipment;
    }

    @Override
    public Iterator getIterator() {
        return new EquipmentIterator();
    }
    private class EquipmentIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if (index < equipment.length) {
                return true;
            } else return false;
        }

        @Override
        public Object next() {
            return equipment[index++];
        }
    }
}
