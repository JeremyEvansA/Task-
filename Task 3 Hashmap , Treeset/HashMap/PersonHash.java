package HashMap;

public class PersonHash {
        private String name;
        private String from;

        public PersonHash(String name, String country) {
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

