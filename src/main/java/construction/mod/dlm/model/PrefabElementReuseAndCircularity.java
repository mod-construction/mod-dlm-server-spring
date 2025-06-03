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
 * Optional data describing how reusable or refurbishable the product is.
 */

@Schema(name = "PrefabElement_reuseAndCircularity", description = "Optional data describing how reusable or refurbishable the product is.")
@JsonTypeName("PrefabElement_reuseAndCircularity")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-03T12:37:58.764795587Z[Etc/UTC]", comments = "Generator version: 7.14.0-SNAPSHOT")
public class PrefabElementReuseAndCircularity {

  /**
   * Ease of disassembly rated from 1 (not possible) to 5 (tool-free), based on ISO 20887:2020.
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
   * End-of-life potential of the element, such as single-use, recyclable, or remanufacturable.
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
   * Extent of refurbishment: none, surface-only, partial, or full reuse of functional components.
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
   * Circularity certification level (e.g., C2C_gold, C2C_platinum).
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

  public PrefabElementReuseAndCircularity() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PrefabElementReuseAndCircularity(DisassemblyRatingEnum disassemblyRating, ReusePotentialEnum reusePotential, RefurbishmentScopeEnum refurbishmentScope, CircularityCertificationEnum circularityCertification) {
    this.disassemblyRating = disassemblyRating;
    this.reusePotential = reusePotential;
    this.refurbishmentScope = refurbishmentScope;
    this.circularityCertification = circularityCertification;
  }

  public PrefabElementReuseAndCircularity disassemblyRating(DisassemblyRatingEnum disassemblyRating) {
    this.disassemblyRating = disassemblyRating;
    return this;
  }

  /**
   * Ease of disassembly rated from 1 (not possible) to 5 (tool-free), based on ISO 20887:2020.
   * @return disassemblyRating
   */
  @NotNull 
  @Schema(name = "disassemblyRating", example = "3", description = "Ease of disassembly rated from 1 (not possible) to 5 (tool-free), based on ISO 20887:2020.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("disassemblyRating")
  public DisassemblyRatingEnum getDisassemblyRating() {
    return disassemblyRating;
  }

  public void setDisassemblyRating(DisassemblyRatingEnum disassemblyRating) {
    this.disassemblyRating = disassemblyRating;
  }

  public PrefabElementReuseAndCircularity reusePotential(ReusePotentialEnum reusePotential) {
    this.reusePotential = reusePotential;
    return this;
  }

  /**
   * End-of-life potential of the element, such as single-use, recyclable, or remanufacturable.
   * @return reusePotential
   */
  @NotNull 
  @Schema(name = "reusePotential", example = "recyclable", description = "End-of-life potential of the element, such as single-use, recyclable, or remanufacturable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reusePotential")
  public ReusePotentialEnum getReusePotential() {
    return reusePotential;
  }

  public void setReusePotential(ReusePotentialEnum reusePotential) {
    this.reusePotential = reusePotential;
  }

  public PrefabElementReuseAndCircularity refurbishmentScope(RefurbishmentScopeEnum refurbishmentScope) {
    this.refurbishmentScope = refurbishmentScope;
    return this;
  }

  /**
   * Extent of refurbishment: none, surface-only, partial, or full reuse of functional components.
   * @return refurbishmentScope
   */
  @NotNull 
  @Schema(name = "refurbishmentScope", example = "partial", description = "Extent of refurbishment: none, surface-only, partial, or full reuse of functional components.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("refurbishmentScope")
  public RefurbishmentScopeEnum getRefurbishmentScope() {
    return refurbishmentScope;
  }

  public void setRefurbishmentScope(RefurbishmentScopeEnum refurbishmentScope) {
    this.refurbishmentScope = refurbishmentScope;
  }

  public PrefabElementReuseAndCircularity circularityCertification(CircularityCertificationEnum circularityCertification) {
    this.circularityCertification = circularityCertification;
    return this;
  }

  /**
   * Circularity certification level (e.g., C2C_gold, C2C_platinum).
   * @return circularityCertification
   */
  @NotNull 
  @Schema(name = "circularityCertification", example = "C2C_gold", description = "Circularity certification level (e.g., C2C_gold, C2C_platinum).", requiredMode = Schema.RequiredMode.REQUIRED)
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
    PrefabElementReuseAndCircularity prefabElementReuseAndCircularity = (PrefabElementReuseAndCircularity) o;
    return Objects.equals(this.disassemblyRating, prefabElementReuseAndCircularity.disassemblyRating) &&
        Objects.equals(this.reusePotential, prefabElementReuseAndCircularity.reusePotential) &&
        Objects.equals(this.refurbishmentScope, prefabElementReuseAndCircularity.refurbishmentScope) &&
        Objects.equals(this.circularityCertification, prefabElementReuseAndCircularity.circularityCertification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disassemblyRating, reusePotential, refurbishmentScope, circularityCertification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementReuseAndCircularity {\n");
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

