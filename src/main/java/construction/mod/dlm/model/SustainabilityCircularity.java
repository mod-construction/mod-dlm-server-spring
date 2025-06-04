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
 * SustainabilityCircularity
 */

@JsonTypeName("Sustainability_circularity")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-04T08:15:16.967754158Z[Etc/UTC]", comments = "Generator version: 7.14.0-SNAPSHOT")
public class SustainabilityCircularity {

  /**
   * Rating from 1 (not disassemblable) to 5 (tool-free disassembly).
   */
  public enum DisassemblyRatingEnum {
    _1("1"),
    
    _2("2"),
    
    _3("3"),
    
    _4("4"),
    
    _5("5");

    private final String value;

    DisassemblyRatingEnum(String value) {
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
    public static DisassemblyRatingEnum fromValue(String value) {
      for (DisassemblyRatingEnum b : DisassemblyRatingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DisassemblyRatingEnum disassemblyRating;

  /**
   * Primary reuse potential of the element after its service life.
   */
  public enum ReusePotentialEnum {
    SINGLE_USE("single-use"),
    
    MULTI_USE("multi-use"),
    
    RECYCLABLE("recyclable"),
    
    REMANUFACTURABLE("remanufacturable");

    private final String value;

    ReusePotentialEnum(String value) {
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
    public static ReusePotentialEnum fromValue(String value) {
      for (ReusePotentialEnum b : ReusePotentialEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ReusePotentialEnum reusePotential;

  /**
   * Refurbishment level: none, surface-only, partial, or full.
   */
  public enum RefurbishmentScopeEnum {
    NONE("none"),
    
    SURFACE_ONLY("surface-only"),
    
    PARTIAL("partial"),
    
    FULL("full");

    private final String value;

    RefurbishmentScopeEnum(String value) {
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
    public static RefurbishmentScopeEnum fromValue(String value) {
      for (RefurbishmentScopeEnum b : RefurbishmentScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private RefurbishmentScopeEnum refurbishmentScope;

  /**
   * Level of circularity certification (e.g., C2C_gold).
   */
  public enum CircularityCertificationEnum {
    NONE("none"),
    
    C2_C_BASIC("C2C_basic"),
    
    C2_C_BRONZE("C2C_bronze"),
    
    C2_C_SILVER("C2C_silver"),
    
    C2_C_GOLD("C2C_gold"),
    
    C2_C_PLATINUM("C2C_platinum");

    private final String value;

    CircularityCertificationEnum(String value) {
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
    public static CircularityCertificationEnum fromValue(String value) {
      for (CircularityCertificationEnum b : CircularityCertificationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CircularityCertificationEnum circularityCertification;

  public SustainabilityCircularity() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SustainabilityCircularity(DisassemblyRatingEnum disassemblyRating, ReusePotentialEnum reusePotential, RefurbishmentScopeEnum refurbishmentScope, CircularityCertificationEnum circularityCertification) {
    this.disassemblyRating = disassemblyRating;
    this.reusePotential = reusePotential;
    this.refurbishmentScope = refurbishmentScope;
    this.circularityCertification = circularityCertification;
  }

  public SustainabilityCircularity disassemblyRating(DisassemblyRatingEnum disassemblyRating) {
    this.disassemblyRating = disassemblyRating;
    return this;
  }

  /**
   * Rating from 1 (not disassemblable) to 5 (tool-free disassembly).
   * @return disassemblyRating
   */
  @NotNull 
  @Schema(name = "disassemblyRating", example = "3", description = "Rating from 1 (not disassemblable) to 5 (tool-free disassembly).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("disassemblyRating")
  public DisassemblyRatingEnum getDisassemblyRating() {
    return disassemblyRating;
  }

  public void setDisassemblyRating(DisassemblyRatingEnum disassemblyRating) {
    this.disassemblyRating = disassemblyRating;
  }

  public SustainabilityCircularity reusePotential(ReusePotentialEnum reusePotential) {
    this.reusePotential = reusePotential;
    return this;
  }

  /**
   * Primary reuse potential of the element after its service life.
   * @return reusePotential
   */
  @NotNull 
  @Schema(name = "reusePotential", example = "recyclable", description = "Primary reuse potential of the element after its service life.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reusePotential")
  public ReusePotentialEnum getReusePotential() {
    return reusePotential;
  }

  public void setReusePotential(ReusePotentialEnum reusePotential) {
    this.reusePotential = reusePotential;
  }

  public SustainabilityCircularity refurbishmentScope(RefurbishmentScopeEnum refurbishmentScope) {
    this.refurbishmentScope = refurbishmentScope;
    return this;
  }

  /**
   * Refurbishment level: none, surface-only, partial, or full.
   * @return refurbishmentScope
   */
  @NotNull 
  @Schema(name = "refurbishmentScope", example = "partial", description = "Refurbishment level: none, surface-only, partial, or full.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("refurbishmentScope")
  public RefurbishmentScopeEnum getRefurbishmentScope() {
    return refurbishmentScope;
  }

  public void setRefurbishmentScope(RefurbishmentScopeEnum refurbishmentScope) {
    this.refurbishmentScope = refurbishmentScope;
  }

  public SustainabilityCircularity circularityCertification(CircularityCertificationEnum circularityCertification) {
    this.circularityCertification = circularityCertification;
    return this;
  }

  /**
   * Level of circularity certification (e.g., C2C_gold).
   * @return circularityCertification
   */
  @NotNull 
  @Schema(name = "circularityCertification", example = "C2C_gold", description = "Level of circularity certification (e.g., C2C_gold).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("circularityCertification")
  public CircularityCertificationEnum getCircularityCertification() {
    return circularityCertification;
  }

  public void setCircularityCertification(CircularityCertificationEnum circularityCertification) {
    this.circularityCertification = circularityCertification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SustainabilityCircularity sustainabilityCircularity = (SustainabilityCircularity) o;
    return Objects.equals(this.disassemblyRating, sustainabilityCircularity.disassemblyRating) &&
        Objects.equals(this.reusePotential, sustainabilityCircularity.reusePotential) &&
        Objects.equals(this.refurbishmentScope, sustainabilityCircularity.refurbishmentScope) &&
        Objects.equals(this.circularityCertification, sustainabilityCircularity.circularityCertification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disassemblyRating, reusePotential, refurbishmentScope, circularityCertification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SustainabilityCircularity {\n");
    sb.append("    disassemblyRating: ").append(toIndentedString(disassemblyRating)).append("\n");
    sb.append("    reusePotential: ").append(toIndentedString(reusePotential)).append("\n");
    sb.append("    refurbishmentScope: ").append(toIndentedString(refurbishmentScope)).append("\n");
    sb.append("    circularityCertification: ").append(toIndentedString(circularityCertification)).append("\n");
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

