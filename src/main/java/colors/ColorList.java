package colors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColorList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        //System.out.println(Arrays.asList(colors));        // too much !!!
        System.out.println(colors);

        for (String strings : colors) { System.out.print(strings + " "); }
        System.out.println();

        colors.add(0,"Yellow");
        System.out.println(colors);

        String color = colors.get(3);
        System.out.println(color);

        colors.set(2, "Grey");
        System.out.println(colors);

        colors.remove(colors.size()-1);
        System.out.println(colors);

        System.out.println(colors.contains("Pink"));
        System.out.println(colors.contains("Red"));

        Collections.sort(colors);
        System.out.println(colors);
        //List<String> colors2 = new ArrayList<>(5);      // initialCapacity ?

        Collections.shuffle(colors);
        System.out.println(colors);

        Collections.reverse(colors);
        System.out.println(colors);

        List<String> fewColors = colors.subList(1,5);
        System.out.println(fewColors);

        for (String strings : colors) { System.out.print(fewColors.contains(strings) + " "); }
        System.out.println();

        Collections.swap(colors,0,4);
        System.out.println(colors);

        colors.addAll(fewColors);
        System.out.println(colors);                     // swap list = swap sublist ?

        List<String> doubledColors = (List<String>) ((ArrayList<String>) colors).clone();
        System.out.println(doubledColors);

        System.out.println(doubledColors.isEmpty());
        doubledColors.removeAll(doubledColors);
        System.out.println(doubledColors.isEmpty());
        System.out.println(doubledColors);

        // foreach int ?
        for (int i=0; i<colors.size(); i++) {
            System.out.print(colors.get(i) + " ");
        }
    }
}