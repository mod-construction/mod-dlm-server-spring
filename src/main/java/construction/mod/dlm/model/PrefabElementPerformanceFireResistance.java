package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Fire resistance classification of the material, based on Euroclass standards (EN 13501-1).
 */

@Schema(name = "PrefabElement_performance_fireResistance", description = "Fire resistance classification of the material, based on Euroclass standards (EN 13501-1).")
@JsonTypeName("PrefabElement_performance_fireResistance")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-04T08:15:16.967754158Z[Etc/UTC]", comments = "Generator version: 7.14.0-SNAPSHOT")
public class PrefabElementPerformanceFireResistance {

  /**
   * Fire resistance classification based on Euroclass standards (EN 13501-1).
   */
  public enum ReactionToFireClassificationEnum {
    A1("A1"),
    
    A2("A2"),
    
    B("B"),
    
    C("C"),
    
    D("D"),
    
    E("E"),
    
    F("F");

    private final String value;

    ReactionToFireClassificationEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReactionToFireClassificationEnum fromValue(String value) {
      for (ReactionToFireClassificationEnum b : ReactionToFireClassificationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ReactionToFireClassificationEnum reactionToFireClassification;

  /**
   * Fire resistance duration in minutes (EN 1363-1 / ASTM E119).
   */
  public enum FireResistanceDurationEnum {
    _30MIN("30min"),
    
    _60MIN("60min"),
    
    _90MIN("90min"),
    
    _120MIN("120min"),
    
    _180MIN("180min"),
    
    _240MIN("240min");

    private final String value;

    FireResistanceDurationEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FireResistanceDurationEnum fromValue(String value) {
      for (FireResistanceDurationEnum b : FireResistanceDurationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FireResistanceDurationEnum fireResistanceDuration;

  public PrefabElementPerformanceFireResistance() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PrefabElementPerformanceFireResistance(ReactionToFireClassificationEnum reactionToFireClassification, FireResistanceDurationEnum fireResistanceDuration) {
    this.reactionToFireClassification = reactionToFireClassification;
    this.fireResistanceDuration = fireResistanceDuration;
  }

  public PrefabElementPerformanceFireResistance reactionToFireClassification(ReactionToFireClassificationEnum reactionToFireClassification) {
    this.reactionToFireClassification = reactionToFireClassification;
    return this;
  }

  /**
   * Fire resistance classification based on Euroclass standards (EN 13501-1).
   * @return reactionToFireClassification
   */
  @NotNull 
  @Schema(name = "reactionToFireClassification", example = "A1", description = "Fire resistance classification based on Euroclass standards (EN 13501-1).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reactionToFireClassification")
  public ReactionToFireClassificationEnum getReactionToFireClassification() {
    return reactionToFireClassification;
  }

  public void setReactionToFireClassification(ReactionToFireClassificationEnum reactionToFireClassification) {
    this.reactionToFireClassification = reactionToFireClassification;
  }

  public PrefabElementPerformanceFireResistance fireResistanceDuration(FireResistanceDurationEnum fireResistanceDuration) {
    this.fireResistanceDuration = fireResistanceDuration;
    return this;
  }

  /**
   * Fire resistance duration in minutes (EN 1363-1 / ASTM E119).
   * @return fireResistanceDuration
   */
  @NotNull 
  @Schema(name = "fireResistanceDuration", example = "30min", description = "Fire resistance duration in minutes (EN 1363-1 / ASTM E119).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fireResistanceDuration")
  public FireResistanceDurationEnum getFireResistanceDuration() {
    return fireResistanceDuration;
  }

  public void setFireResistanceDuration(FireResistanceDurationEnum fireResistanceDuration) {
    this.fireResistanceDuration = fireResistanceDuration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementPerformanceFireResistance prefabElementPerformanceFireResistance = (PrefabElementPerformanceFireResistance) o;
    return Objects.equals(this.reactionToFireClassification, prefabElementPerformanceFireResistance.reactionToFireClassification) &&
        Objects.equals(this.fireResistanceDuration, prefabElementPerformanceFireResistance.fireResistanceDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reactionToFireClassification, fireResistanceDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementPerformanceFireResistance {\n");
    sb.append("    reactionToFireClassification: ").append(toIndentedString(reactionToFireClassification)).append("\n");
    sb.append("    fireResistanceDuration: ").append(toIndentedString(fireResistanceDuration)).append("\n");
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

