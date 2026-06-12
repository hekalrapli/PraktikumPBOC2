import java.util.*;
public class LambdaMap {
     public static void main(String[] args) {
        Map<String, String> mahasiswaMap  = new HashMap<>();
        mahasiswaMap.put("1352406", "Sherina");
        mahasiswaMap.put("1342447", "Izzati");
        mahasiswaMap.put("1302406", "Tuzzahra");
        mahasiswaMap.put("1512414", "Lubis");
        mahasiswaMap.put("1322467", "Taz");
      

        mahasiswaMap.forEach((nim,nama) -> System.out.println(nim + " " +nama));
    }
}
