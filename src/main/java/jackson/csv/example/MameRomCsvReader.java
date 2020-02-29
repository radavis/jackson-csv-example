package jackson.csv.example;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import java.io.File;
import java.util.List;

public class MameRomCsvReader {

  private static final char CSV_COLUMN_SEPARATOR = ';';

  public static List<MameRomCsvRow> readFile(File csvFile) throws Exception {
    CsvMapper mapper = new CsvMapper();

    CsvSchema schema =
        mapper
            .schemaFor(MameRomCsvRow.class)
            .withSkipFirstDataRow(true)
            .withColumnSeparator(CSV_COLUMN_SEPARATOR);

    MappingIterator<MameRomCsvRow> iterator =
        mapper.readerFor(MameRomCsvRow.class).with(schema).readValues(csvFile);

    return iterator.readAll();
  }
}
