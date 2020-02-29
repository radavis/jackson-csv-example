package jackson.csv.example;

import java.io.File;
import java.util.List;

public class App {
  public static void main(String[] args) throws Exception {
    File csvFile = new File("src/main/resources/romlist.csv");
    List<MameRomCsvRow> rows = MameRomCsvReader.readFile(csvFile);

    rows.iterator()
        .forEachRemaining(
            (row) -> {
              System.out.println(row.toString());
            });
  }
}
