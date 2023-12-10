package ImplementTreeset;
import java.util.Comparator;

    public class person {
        private String name;
        private String from;

        public person(String name, String country) {
            this.name = name;
            this.from = country;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCountry() {
            return from;
        }

        public void setCountry(String country) {
            this.from = country;
        }
    }

    class testComparator implements Comparator<person> {

            public int compare(person a, person b) {
                return a.getName().compareTo(b.getName());
            }
        }



