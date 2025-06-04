package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * PrefabElementPerformanceAcousticProperties
 */

@JsonTypeName("PrefabElement_performance_acousticProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-04T08:15:16.967754158Z[Etc/UTC]", comments = "Generator version: 7.14.0-SNAPSHOT")
public class PrefabElementPerformanceAcousticProperties {

  private BigDecimal weightedSoundReductionIndex;

  private @Nullable BigDecimal spectrumAdaptationTerm;

  public PrefabElementPerformanceAcousticProperties() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PrefabElementPerformanceAcousticProperties(BigDecimal weightedSoundReductionIndex) {
    this.weightedSoundReductionIndex = weightedSoundReductionIndex;
  }

  public PrefabElementPerformanceAcousticProperties weightedSoundReductionIndex(BigDecimal weightedSoundReductionIndex) {
    this.weightedSoundReductionIndex = weightedSoundReductionIndex;
    return this;
  }

  /**
   * Rw value in dB (ISO 717-1)
   * @return weightedSoundReductionIndex
   */
  @NotNull @Valid 
  @Schema(name = "weightedSoundReductionIndex", description = "Rw value in dB (ISO 717-1)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("weightedSoundReductionIndex")
  public BigDecimal getWeightedSoundReductionIndex() {
    return weightedSoundReductionIndex;
  }

  public void setWeightedSoundReductionIndex(BigDecimal weightedSoundReductionIndex) {
    this.weightedSoundReductionIndex = weightedSoundReductionIndex;
  }

  public PrefabElementPerformanceAcousticProperties spectrumAdaptationTerm(BigDecimal spectrumAdaptationTerm) {
    this.spectrumAdaptationTerm = spectrumAdaptationTerm;
    return this;
  }

  /**
   * Ctr value in dB (optional, ISO 717-1)
   * @return spectrumAdaptationTerm
   */
  @Valid 
  @Schema(name = "spectrumAdaptationTerm", description = "Ctr value in dB (optional, ISO 717-1)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spectrumAdaptationTerm")
  public BigDecimal getSpectrumAdaptationTerm() {
    return spectrumAdaptationTerm;
  }

  public void setSpectrumAdaptationTerm(BigDecimal spectrumAdaptationTerm) {
    this.spectrumAdaptationTerm = spectrumAdaptationTerm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementPerformanceAcousticProperties prefabElementPerformanceAcousticProperties = (PrefabElementPerformanceAcousticProperties) o;
    return Objects.equals(this.weightedSoundReductionIndex, prefabElementPerformanceAcousticProperties.weightedSoundReductionIndex) &&
        Objects.equals(this.spectrumAdaptationTerm, prefabElementPerformanceAcousticProperties.spectrumAdaptationTerm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weightedSoundReductionIndex, spectrumAdaptationTerm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementPerformanceAcousticProperties {\n");
    sb.append("    weightedSoundReductionIndex: ").append(toIndentedString(weightedSoundReductionIndex)).append("\n");
    sb.append("    spectrumAdaptationTerm: ").append(toIndentedString(spectrumAdaptationTerm)).append("\n");
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

