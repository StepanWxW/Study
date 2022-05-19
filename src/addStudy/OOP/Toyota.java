package addStudy.OOP;

class Toyota extends Auto {

    Toyota() {

        super("sdfsd", 12, 1666.1);
    }
        String name = "Toyota";
        int radius = 17;
        double maxSpeed =188.8;

        @Override
        public String toString () {
            return "Toyota{" +
                    "name='" + name + '\'' +
                    ", radius=" + radius +
                    ", maxSpeed=" + maxSpeed +
                    '}';
        }

        @Override
        void Characteristics () {
            System.out.println(toString());
        }
    }
