package jackson.csv.example;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.ToString;

@Getter
@JsonPropertyOrder({"name", "description", "year", "manufacturer", "width", "height", "rotate"})
@ToString
public class MameRomCsvRow {
  private String name;
  private String description;
  private String year;
  private String manufacturer;
  private Integer width;
  private Integer height;
  private Integer rotate;
}
