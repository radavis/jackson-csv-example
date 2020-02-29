package jackson.csv.example;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MameRomCsvReaderTests {

  private Path csvPath;

  private List<MameRomCsvRow> rows;

  @BeforeEach
  void setUp() throws Exception {
    csvPath = Paths.get("src/main/resources/romlist.csv");
    rows = MameRomCsvReader.readFile(csvPath.toFile());
  }

  @Test
  void test_readFileLoadsAllRows() throws IOException {
    long lineCount = Files.lines(csvPath).count();
    assertEquals(rows.size(), lineCount - 1);
  }
}
