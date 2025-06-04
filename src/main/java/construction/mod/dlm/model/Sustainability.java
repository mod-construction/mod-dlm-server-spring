package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import construction.mod.dlm.model.SustainabilityCircularity;
import construction.mod.dlm.model.SustainabilityEnvironmentalImpact;
import construction.mod.dlm.model.SustainabilityOrigin;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Sustainability attributes of the element.
 */

@Schema(name = "Sustainability", description = "Sustainability attributes of the element.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-04T08:15:16.967754158Z[Etc/UTC]", comments = "Generator version: 7.14.0-SNAPSHOT")
public class Sustainability {

  private SustainabilityEnvironmentalImpact environmentalImpact;

  private SustainabilityCircularity circularity;

  private SustainabilityOrigin origin;

  public Sustainability() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Sustainability(SustainabilityEnvironmentalImpact environmentalImpact, SustainabilityCircularity circularity, SustainabilityOrigin origin) {
    this.environmentalImpact = environmentalImpact;
    this.circularity = circularity;
    this.origin = origin;
  }

  public Sustainability environmentalImpact(SustainabilityEnvironmentalImpact environmentalImpact) {
    this.environmentalImpact = environmentalImpact;
    return this;
  }

  /**
   * Get environmentalImpact
   * @return environmentalImpact
   */
  @NotNull @Valid 
  @Schema(name = "environmentalImpact", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("environmentalImpact")
  public SustainabilityEnvironmentalImpact getEnvironmentalImpact() {
    return environmentalImpact;
  }

  public void setEnvironmentalImpact(SustainabilityEnvironmentalImpact environmentalImpact) {
    this.environmentalImpact = environmentalImpact;
  }

  public Sustainability circularity(SustainabilityCircularity circularity) {
    this.circularity = circularity;
    return this;
  }

  /**
   * Get circularity
   * @return circularity
   */
  @NotNull @Valid 
  @Schema(name = "circularity", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("circularity")
  public SustainabilityCircularity getCircularity() {
    return circularity;
  }

  public void setCircularity(SustainabilityCircularity circularity) {
    this.circularity = circularity;
  }

  public Sustainability origin(SustainabilityOrigin origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Get origin
   * @return origin
   */
  @NotNull @Valid 
  @Schema(name = "origin", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("origin")
  public SustainabilityOrigin getOrigin() {
    return origin;
  }

  public void setOrigin(SustainabilityOrigin origin) {
    this.origin = origin;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sustainability sustainability = (Sustainability) o;
    return Objects.equals(this.environmentalImpact, sustainability.environmentalImpact) &&
        Objects.equals(this.circularity, sustainability.circularity) &&
        Objects.equals(this.origin, sustainability.origin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentalImpact, circularity, origin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sustainability {\n");
    sb.append("    environmentalImpact: ").append(toIndentedString(environmentalImpact)).append("\n");
    sb.append("    circularity: ").append(toIndentedString(circularity)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
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

