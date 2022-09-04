import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;


public class Main {
    public static void main(String[] args) {

        List<Purchaselist> purchaselists = new PurchalistHelper().getPurchalist();
        purchaselists.sort(new Comparator<Purchaselist>() {
            @Override
            public int compare(Purchaselist o1, Purchaselist o2) {
                return o1.getCourseName().compareTo(o2.getCourseName());
            }
        });
        String course = purchaselists.get(1).getCourseName();
        int i = 0;
        int count = 1;
        while (i < purchaselists.size()) {

            if ((purchaselists.get(i).getCourseName()).equals(course)) {
                count++;
            } else {
                System.out.println("Курс: " + purchaselists.get(i).getCourseName() + "\tКупило: " + count + " человек");
                count = 1;
            }
            i++;
            try {
                course = purchaselists.get(i + 1).getCourseName();
            } catch (IndexOutOfBoundsException ignore) {

            }

        }

    }
}