package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import construction.mod.dlm.model.PrefabElementStructuralPropertiesDeflectionLimit;
import construction.mod.dlm.model.PrefabElementStructuralPropertiesLoadBearingCapacity;
import construction.mod.dlm.model.PrefabElementStructuralPropertiesSeismicResistance;
import construction.mod.dlm.model.PrefabElementStructuralPropertiesWindLoadResistance;
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
 * Optional structural performance details like capacity, stiffness, or seismic resistance.
 */

@Schema(name = "PrefabElement_structuralProperties", description = "Optional structural performance details like capacity, stiffness, or seismic resistance.")
@JsonTypeName("PrefabElement_structuralProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-04T08:15:16.967754158Z[Etc/UTC]", comments = "Generator version: 7.14.0-SNAPSHOT")
public class PrefabElementStructuralProperties {

  private @Nullable PrefabElementStructuralPropertiesLoadBearingCapacity loadBearingCapacity;

  private @Nullable PrefabElementStructuralPropertiesSeismicResistance seismicResistance;

  private @Nullable PrefabElementStructuralPropertiesWindLoadResistance windLoadResistance;

  private @Nullable PrefabElementStructuralPropertiesDeflectionLimit deflectionLimit;

  private @Nullable BigDecimal safetyFactor;

  public PrefabElementStructuralProperties loadBearingCapacity(PrefabElementStructuralPropertiesLoadBearingCapacity loadBearingCapacity) {
    this.loadBearingCapacity = loadBearingCapacity;
    return this;
  }

  /**
   * Get loadBearingCapacity
   * @return loadBearingCapacity
   */
  @Valid 
  @Schema(name = "loadBearingCapacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("loadBearingCapacity")
  public PrefabElementStructuralPropertiesLoadBearingCapacity getLoadBearingCapacity() {
    return loadBearingCapacity;
  }

  public void setLoadBearingCapacity(PrefabElementStructuralPropertiesLoadBearingCapacity loadBearingCapacity) {
    this.loadBearingCapacity = loadBearingCapacity;
  }

  public PrefabElementStructuralProperties seismicResistance(PrefabElementStructuralPropertiesSeismicResistance seismicResistance) {
    this.seismicResistance = seismicResistance;
    return this;
  }

  /**
   * Get seismicResistance
   * @return seismicResistance
   */
  @Valid 
  @Schema(name = "seismicResistance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("seismicResistance")
  public PrefabElementStructuralPropertiesSeismicResistance getSeismicResistance() {
    return seismicResistance;
  }

  public void setSeismicResistance(PrefabElementStructuralPropertiesSeismicResistance seismicResistance) {
    this.seismicResistance = seismicResistance;
  }

  public PrefabElementStructuralProperties windLoadResistance(PrefabElementStructuralPropertiesWindLoadResistance windLoadResistance) {
    this.windLoadResistance = windLoadResistance;
    return this;
  }

  /**
   * Get windLoadResistance
   * @return windLoadResistance
   */
  @Valid 
  @Schema(name = "windLoadResistance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("windLoadResistance")
  public PrefabElementStructuralPropertiesWindLoadResistance getWindLoadResistance() {
    return windLoadResistance;
  }

  public void setWindLoadResistance(PrefabElementStructuralPropertiesWindLoadResistance windLoadResistance) {
    this.windLoadResistance = windLoadResistance;
  }

  public PrefabElementStructuralProperties deflectionLimit(PrefabElementStructuralPropertiesDeflectionLimit deflectionLimit) {
    this.deflectionLimit = deflectionLimit;
    return this;
  }

  /**
   * Get deflectionLimit
   * @return deflectionLimit
   */
  @Valid 
  @Schema(name = "deflectionLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deflectionLimit")
  public PrefabElementStructuralPropertiesDeflectionLimit getDeflectionLimit() {
    return deflectionLimit;
  }

  public void setDeflectionLimit(PrefabElementStructuralPropertiesDeflectionLimit deflectionLimit) {
    this.deflectionLimit = deflectionLimit;
  }

  public PrefabElementStructuralProperties safetyFactor(BigDecimal safetyFactor) {
    this.safetyFactor = safetyFactor;
    return this;
  }

  /**
   * Applied safety factor for structural design, typically 1.0–2.0
   * minimum: 1
   * @return safetyFactor
   */
  @Valid @DecimalMin("1") 
  @Schema(name = "safetyFactor", description = "Applied safety factor for structural design, typically 1.0–2.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("safetyFactor")
  public BigDecimal getSafetyFactor() {
    return safetyFactor;
  }

  public void setSafetyFactor(BigDecimal safetyFactor) {
    this.safetyFactor = safetyFactor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementStructuralProperties prefabElementStructuralProperties = (PrefabElementStructuralProperties) o;
    return Objects.equals(this.loadBearingCapacity, prefabElementStructuralProperties.loadBearingCapacity) &&
        Objects.equals(this.seismicResistance, prefabElementStructuralProperties.seismicResistance) &&
        Objects.equals(this.windLoadResistance, prefabElementStructuralProperties.windLoadResistance) &&
        Objects.equals(this.deflectionLimit, prefabElementStructuralProperties.deflectionLimit) &&
        Objects.equals(this.safetyFactor, prefabElementStructuralProperties.safetyFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadBearingCapacity, seismicResistance, windLoadResistance, deflectionLimit, safetyFactor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementStructuralProperties {\n");
    sb.append("    loadBearingCapacity: ").append(toIndentedString(loadBearingCapacity)).append("\n");
    sb.append("    seismicResistance: ").append(toIndentedString(seismicResistance)).append("\n");
    sb.append("    windLoadResistance: ").append(toIndentedString(windLoadResistance)).append("\n");
    sb.append("    deflectionLimit: ").append(toIndentedString(deflectionLimit)).append("\n");
    sb.append("    safetyFactor: ").append(toIndentedString(safetyFactor)).append("\n");
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

