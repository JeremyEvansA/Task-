package HashMap;
import java.util.HashMap;
import java.util.ArrayList;

public class CollectionsHashMap {
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<PersonHash>>  listHashMap = new HashMap<>();

        ArrayList<PersonHash> personList = new ArrayList<>();
        personList.add(new PersonHash("Jeremy","Jakarta"));
        personList.add(new PersonHash("Bambang", "Thailand"));
        personList.add(new PersonHash("Budi", "Malaysia"));

        listHashMap.put(1, personList);

        listHashMap.forEach((k, v) -> {
            for (PersonHash Personn : v) {
                System.out.println("Name: " + Personn.getName() + " From: " + Personn.getCountry());
            }
        });
    }
}
