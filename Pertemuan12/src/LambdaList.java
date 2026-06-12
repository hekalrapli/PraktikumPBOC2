import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList  = new ArrayList<>();
        mahasiswaList.add("Ambatron");
        mahasiswaList.add("Byokovi");
        mahasiswaList.add("Chong Koh Wi");
        mahasiswaList.add("Dol Ki wi");

        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
