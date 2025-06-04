package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import construction.mod.dlm.model.PrefabElementPerformanceAcousticProperties;
import construction.mod.dlm.model.PrefabElementPerformanceFireResistance;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Optional performance metrics related to strength, insulation, or soundproofing.
 */

@Schema(name = "PrefabElement_performance", description = "Optional performance metrics related to strength, insulation, or soundproofing.")
@JsonTypeName("PrefabElement_performance")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-04T08:15:16.967754158Z[Etc/UTC]", comments = "Generator version: 7.14.0-SNAPSHOT")
public class PrefabElementPerformance {

  private PrefabElementPerformanceFireResistance fireResistance;

  private BigDecimal thermalTransmittance;

  private @Nullable PrefabElementPerformanceAcousticProperties acousticProperties;

  private BigDecimal airTightness;

  private BigDecimal vaporPermeability;

  public PrefabElementPerformance() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PrefabElementPerformance(PrefabElementPerformanceFireResistance fireResistance, BigDecimal thermalTransmittance, BigDecimal airTightness, BigDecimal vaporPermeability) {
    this.fireResistance = fireResistance;
    this.thermalTransmittance = thermalTransmittance;
    this.airTightness = airTightness;
    this.vaporPermeability = vaporPermeability;
  }

  public PrefabElementPerformance fireResistance(PrefabElementPerformanceFireResistance fireResistance) {
    this.fireResistance = fireResistance;
    return this;
  }

  /**
   * Get fireResistance
   * @return fireResistance
   */
  @NotNull @Valid 
  @Schema(name = "fireResistance", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fireResistance")
  public PrefabElementPerformanceFireResistance getFireResistance() {
    return fireResistance;
  }

  public void setFireResistance(PrefabElementPerformanceFireResistance fireResistance) {
    this.fireResistance = fireResistance;
  }

  public PrefabElementPerformance thermalTransmittance(BigDecimal thermalTransmittance) {
    this.thermalTransmittance = thermalTransmittance;
    return this;
  }

  /**
   * Thermal transmittance (U-value) in W/m²K, typically between 0 and 2
   * minimum: 0
   * maximum: 2
   * @return thermalTransmittance
   */
  @NotNull @Valid @DecimalMin("0") @DecimalMax("2") 
  @Schema(name = "thermalTransmittance", description = "Thermal transmittance (U-value) in W/m²K, typically between 0 and 2", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("thermalTransmittance")
  public BigDecimal getThermalTransmittance() {
    return thermalTransmittance;
  }

  public void setThermalTransmittance(BigDecimal thermalTransmittance) {
    this.thermalTransmittance = thermalTransmittance;
  }

  public PrefabElementPerformance acousticProperties(PrefabElementPerformanceAcousticProperties acousticProperties) {
    this.acousticProperties = acousticProperties;
    return this;
  }

  /**
   * Get acousticProperties
   * @return acousticProperties
   */
  @Valid 
  @Schema(name = "acousticProperties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acousticProperties")
  public PrefabElementPerformanceAcousticProperties getAcousticProperties() {
    return acousticProperties;
  }

  public void setAcousticProperties(PrefabElementPerformanceAcousticProperties acousticProperties) {
    this.acousticProperties = acousticProperties;
  }

  public PrefabElementPerformance airTightness(BigDecimal airTightness) {
    this.airTightness = airTightness;
    return this;
  }

  /**
   * Air permeability (e.g., n50 value in 1/h or q50 in m³/h·m²) - lower values indicate better airtightness
   * minimum: 0
   * @return airTightness
   */
  @NotNull @Valid @DecimalMin("0") 
  @Schema(name = "airTightness", description = "Air permeability (e.g., n50 value in 1/h or q50 in m³/h·m²) - lower values indicate better airtightness", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("airTightness")
  public BigDecimal getAirTightness() {
    return airTightness;
  }

  public void setAirTightness(BigDecimal airTightness) {
    this.airTightness = airTightness;
  }

  public PrefabElementPerformance vaporPermeability(BigDecimal vaporPermeability) {
    this.vaporPermeability = vaporPermeability;
    return this;
  }

  /**
   * Vapor permeability in µ or Sd value in meters (ISO 12572) - measures resistance to water vapor diffusion
   * minimum: 0
   * @return vaporPermeability
   */
  @NotNull @Valid @DecimalMin("0") 
  @Schema(name = "vaporPermeability", description = "Vapor permeability in µ or Sd value in meters (ISO 12572) - measures resistance to water vapor diffusion", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vaporPermeability")
  public BigDecimal getVaporPermeability() {
    return vaporPermeability;
  }

  public void setVaporPermeability(BigDecimal vaporPermeability) {
    this.vaporPermeability = vaporPermeability;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementPerformance prefabElementPerformance = (PrefabElementPerformance) o;
    return Objects.equals(this.fireResistance, prefabElementPerformance.fireResistance) &&
        Objects.equals(this.thermalTransmittance, prefabElementPerformance.thermalTransmittance) &&
        Objects.equals(this.acousticProperties, prefabElementPerformance.acousticProperties) &&
        Objects.equals(this.airTightness, prefabElementPerformance.airTightness) &&
        Objects.equals(this.vaporPermeability, prefabElementPerformance.vaporPermeability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fireResistance, thermalTransmittance, acousticProperties, airTightness, vaporPermeability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementPerformance {\n");
    sb.append("    fireResistance: ").append(toIndentedString(fireResistance)).append("\n");
    sb.append("    thermalTransmittance: ").append(toIndentedString(thermalTransmittance)).append("\n");
    sb.append("    acousticProperties: ").append(toIndentedString(acousticProperties)).append("\n");
    sb.append("    airTightness: ").append(toIndentedString(airTightness)).append("\n");
    sb.append("    vaporPermeability: ").append(toIndentedString(vaporPermeability)).append("\n");
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

