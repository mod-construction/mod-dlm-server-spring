package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SustainabilityOrigin
 */

@JsonTypeName("Sustainability_origin")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-04T08:15:16.967754158Z[Etc/UTC]", comments = "Generator version: 7.14.0-SNAPSHOT")
public class SustainabilityOrigin {

  private String countryOfManufacturing;

  public SustainabilityOrigin() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SustainabilityOrigin(String countryOfManufacturing) {
    this.countryOfManufacturing = countryOfManufacturing;
  }

  public SustainabilityOrigin countryOfManufacturing(String countryOfManufacturing) {
    this.countryOfManufacturing = countryOfManufacturing;
    return this;
  }

  /**
   * Country of production for lifecycle and logistics assessment.
   * @return countryOfManufacturing
   */
  @NotNull 
  @Schema(name = "countryOfManufacturing", example = "Germany", description = "Country of production for lifecycle and logistics assessment.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("countryOfManufacturing")
  public String getCountryOfManufacturing() {
    return countryOfManufacturing;
  }

  public void setCountryOfManufacturing(String countryOfManufacturing) {
    this.countryOfManufacturing = countryOfManufacturing;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SustainabilityOrigin sustainabilityOrigin = (SustainabilityOrigin) o;
    return Objects.equals(this.countryOfManufacturing, sustainabilityOrigin.countryOfManufacturing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryOfManufacturing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SustainabilityOrigin {\n");
    sb.append("    countryOfManufacturing: ").append(toIndentedString(countryOfManufacturing)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

