package ImplementTreeset;
import java.util.TreeSet;



   public class Treeset {
       public static void main(String[] args) {
           TreeSet<person> country = new TreeSet<person>(new testComparator());

           country.add(new person("Jakarta", "Indonesia"));
           country.add(new person("Tokyo", "Japan"));
           country.add(new person("Singapura", "Singapura"));


           for(person list: country)
           {
               System.out.println(list.getName()+" National Capital from "+list.getCountry());
           }
       }
   }
