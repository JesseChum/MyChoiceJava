import java.util.HashMap;
import java.util.Map;


public class MapTrails {
  public static void main(String[] args) {
    putTrails();
  }

  public static void putTrails() {
    Map<String, String> trails = new HashMap<>();
    trails.put("easy", "RattleSnake Ledge");
    trails.put("medium", "Quechee Gorge Trail");
    trails.put("hard", "Angels Landing Trail");
    trails.put("veryhard", "Skyline Loop");

   //print1
    System.out.println(trails.get("easy"));

    //print2
    trails.put("veryhard", "Skyline Loop");
    System.out.println(trails.get("veryhard"));
  }
}