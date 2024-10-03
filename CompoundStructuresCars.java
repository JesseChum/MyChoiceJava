
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompoundStructuresCars {
  public static void main(String[] args) {
    mapAndListDemo();
  }

  public static void mapAndListDemo() {
    List<String> ToyotaMrs = new ArrayList<>();
    ToyotaMrs.add("RWD");
    ToyotaMrs.add("2 seater");
    ToyotaMrs.add("sportscar");

    List<String> NissanSilvia = new ArrayList<>();
    NissanSilvia.add("Kouki");
    NissanSilvia.add("Zenki");
    NissanSilvia.add("RB25");
    NissanSilvia.add("sportscar");

    List<String> Mazdarx7 = new ArrayList<>();
    Mazdarx7 .add("Rotary");
    Mazdarx7 .add("Popup Headlights");
    Mazdarx7 .add("Brap Brap");
    Mazdarx7 .add("sportscar");

    Map<String, List<String>> carbook = new HashMap<>();
    carbook .put("ToyotaMrs", ToyotaMrs);
    carbook .put("NissanSilvia", NissanSilvia);
    carbook .put("Mazdarx7", Mazdarx7);

    // What does this print?
    List<String> carfacts = carbook .get("NissanSilvia");
    System.out.println(carfacts.get(1));
  }
}

