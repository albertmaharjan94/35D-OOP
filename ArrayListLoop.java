import java.util.ArrayList;
public class ArrayListLoop{
    public static void main(String[] args){
        /* Import ArrayList from java.util */
        ArrayList<String> names = new ArrayList<>();

        names.add("Aayam");
        names.add("Adhar");
        names.add("Yausan");
        names.add("Niraj");
        names.add("Ayush");
        names.add("Rijan");

        /* To loop, find the lenght/element count, .size() */
        int namesLength = names.size();
        /* Loop same as array */
        for(int index = 0; index < namesLength; index ++){
            // Get each element with .get(index)
            String singleName = names.get(index);
            System.out.println("Index : " + index + " Value " + singleName);
        }

        /* Using foreach in java, iterate with element/actual value */
        for(String element: names){
            System.out.println(element);
        }

        /* Task
        * Make an ArrayList animals
        * ["Cat", "Tiger", "Dog", "Elephant"]
        * Make two more ArrayList called, wildAnimal, domesticAnimal
        * Loop the animals 
        * If the element/value is "Cat", "Dog" add in domesticAnimal
        * If the element/value is "Tiger", "Elephant" add in wildAnimal
        * Print domesticAnimal, wildAnimal
        */
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Tiger");
        animals.add("Dog");
        animals.add("Elephant");
        int animalLength = animals.size();
        // for loop
        ArrayList<String> domesticAnimals = new ArrayList<>();
        ArrayList<String> wildAnimals = new ArrayList<>();
        for(int index = 0; index < animalLength; index ++){
            String singleAnimal = animals.get(index);
            if(singleAnimal == "Cat" || singleAnimal == "Dog"){
                domesticAnimals.add(singleAnimal);
            }else{
                wildAnimals.add(singleAnimal);
            }
        }
        /* Using for - each */
        for(String elem: animals){
            if(elem == "Cat" || elem == "Dog"){
                domesticAnimals.add(elem);
            }else{
                wildAnimals.add(elem);
            }
        }
    }
}