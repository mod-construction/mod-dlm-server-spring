package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * Environmental and sustainability performance such as EPDs or recyclability.
 */

@Schema(name = "PrefabElement_sustainability", description = "Environmental and sustainability performance such as EPDs or recyclability.")
@JsonTypeName("PrefabElement_sustainability")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-03T12:37:58.764795587Z[Etc/UTC]", comments = "Generator version: 7.14.0-SNAPSHOT")
public class PrefabElementSustainability {

  private String countryOfManufacturing;

  /**
   * Simplified sustainability score, where A+ indicates highest performance. Define based on EPD or lifecycle impact benchmarks.
   */
  public enum ClassificationEnum {
    A_("A+"),
    
    A("A"),
    
    B("B"),
    
    C("C"),
    
    D("D");

    private final String value;

    ClassificationEnum(String value) {
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
    public static ClassificationEnum fromValue(String value) {
      for (ClassificationEnum b : ClassificationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ClassificationEnum classification;

  /**
   * Volatile Organic Compounds emissions level (None, Low, Medium, High)
   */
  public enum VoCEmissionsEnum {
    NONE_0_01_MG_M_("None (<0.01 mg/m³)"),
    
    VERY_LOW_0_1_MG_M_("Very Low (<0.1 mg/m³)"),
    
    LOW_0_3_MG_M_("Low (<0.3 mg/m³)"),
    
    MODERATE_0_3_1_0_MG_M_("Moderate (0.3–1.0 mg/m³)"),
    
    HIGH_1_0_MG_M_("High (>1.0 mg/m³)");

    private final String value;

    VoCEmissionsEnum(String value) {
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
    public static VoCEmissionsEnum fromValue(String value) {
      for (VoCEmissionsEnum b : VoCEmissionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable VoCEmissionsEnum voCEmissions;

  private @Nullable BigDecimal recyclability;

  /**
   * Energy performance classification, combining insulation tiers and certifications (LEED, BREEAM, etc.).
   */
  public enum EnergyEfficiencyEnum {
    R_1("R-1"),
    
    R_2("R-2"),
    
    R_5("R-5"),
    
    ENERGY_STAR("Energy Star"),
    
    LEED_CERTIFIED("LEED Certified"),
    
    LEED_SILVER("LEED Silver"),
    
    LEED_GOLD("LEED Gold"),
    
    LEED_PLATINUM("LEED Platinum"),
    
    BREEAM_GOOD("BREEAM Good"),
    
    BREEAM_VERY_GOOD("BREEAM Very Good"),
    
    BREEAM_EXCELLENT("BREEAM Excellent"),
    
    BREEAM_OUTSTANDING("BREEAM Outstanding"),
    
    PASSIVE_HOUSE("Passive House"),
    
    DGNB_GOLD("DGNB Gold");

    private final String value;

    EnergyEfficiencyEnum(String value) {
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
    public static EnergyEfficiencyEnum fromValue(String value) {
      for (EnergyEfficiencyEnum b : EnergyEfficiencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private EnergyEfficiencyEnum energyEfficiency;

  public PrefabElementSustainability() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PrefabElementSustainability(String countryOfManufacturing, ClassificationEnum classification, EnergyEfficiencyEnum energyEfficiency) {
    this.countryOfManufacturing = countryOfManufacturing;
    this.classification = classification;
    this.energyEfficiency = energyEfficiency;
  }

  public PrefabElementSustainability countryOfManufacturing(String countryOfManufacturing) {
    this.countryOfManufacturing = countryOfManufacturing;
    return this;
  }

  /**
   * Country where the element is manufactured
   * @return countryOfManufacturing
   */
  @NotNull 
  @Schema(name = "countryOfManufacturing", description = "Country where the element is manufactured", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("countryOfManufacturing")
  public String getCountryOfManufacturing() {
    return countryOfManufacturing;
  }

  public void setCountryOfManufacturing(String countryOfManufacturing) {
    this.countryOfManufacturing = countryOfManufacturing;
  }

  public PrefabElementSustainability classification(ClassificationEnum classification) {
    this.classification = classification;
    return this;
  }

  /**
   * Simplified sustainability score, where A+ indicates highest performance. Define based on EPD or lifecycle impact benchmarks.
   * @return classification
   */
  @NotNull 
  @Schema(name = "classification", example = "A", description = "Simplified sustainability score, where A+ indicates highest performance. Define based on EPD or lifecycle impact benchmarks.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("classification")
  public ClassificationEnum getClassification() {
    return classification;
  }

  public void setClassification(ClassificationEnum classification) {
    this.classification = classification;
  }

  public PrefabElementSustainability voCEmissions(VoCEmissionsEnum voCEmissions) {
    this.voCEmissions = voCEmissions;
    return this;
  }

  /**
   * Volatile Organic Compounds emissions level (None, Low, Medium, High)
   * @return voCEmissions
   */
  
  @Schema(name = "VOCEmissions", example = "Low (<0.3 mg/m³)", description = "Volatile Organic Compounds emissions level (None, Low, Medium, High)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VOCEmissions")
  public VoCEmissionsEnum getVoCEmissions() {
    return voCEmissions;
  }

  public void setVoCEmissions(VoCEmissionsEnum voCEmissions) {
    this.voCEmissions = voCEmissions;
  }

  public PrefabElementSustainability recyclability(BigDecimal recyclability) {
    this.recyclability = recyclability;
    return this;
  }

  /**
   * Percentage of the element that is recyclable, from 0 to 100%
   * minimum: 0
   * maximum: 100
   * @return recyclability
   */
  @Valid @DecimalMin("0") @DecimalMax("100") 
  @Schema(name = "recyclability", description = "Percentage of the element that is recyclable, from 0 to 100%", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recyclability")
  public BigDecimal getRecyclability() {
    return recyclability;
  }

  public void setRecyclability(BigDecimal recyclability) {
    this.recyclability = recyclability;
  }

  public PrefabElementSustainability energyEfficiency(EnergyEfficiencyEnum energyEfficiency) {
    this.energyEfficiency = energyEfficiency;
    return this;
  }

  /**
   * Energy performance classification, combining insulation tiers and certifications (LEED, BREEAM, etc.).
   * @return energyEfficiency
   */
  @NotNull 
  @Schema(name = "energyEfficiency", example = "LEED Gold", description = "Energy performance classification, combining insulation tiers and certifications (LEED, BREEAM, etc.).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("energyEfficiency")
  public EnergyEfficiencyEnum getEnergyEfficiency() {
    return energyEfficiency;
  }

  public void setEnergyEfficiency(EnergyEfficiencyEnum energyEfficiency) {
    this.energyEfficiency = energyEfficiency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementSustainability prefabElementSustainability = (PrefabElementSustainability) o;
    return Objects.equals(this.countryOfManufacturing, prefabElementSustainability.countryOfManufacturing) &&
        Objects.equals(this.classification, prefabElementSustainability.classification) &&
        Objects.equals(this.voCEmissions, prefabElementSustainability.voCEmissions) &&
        Objects.equals(this.recyclability, prefabElementSustainability.recyclability) &&
        Objects.equals(this.energyEfficiency, prefabElementSustainability.energyEfficiency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryOfManufacturing, classification, voCEmissions, recyclability, energyEfficiency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementSustainability {\n");
    sb.append("    countryOfManufacturing: ").append(toIndentedString(countryOfManufacturing)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    voCEmissions: ").append(toIndentedString(voCEmissions)).append("\n");
    sb.append("    recyclability: ").append(toIndentedString(recyclability)).append("\n");
    sb.append("    energyEfficiency: ").append(toIndentedString(energyEfficiency)).append("\n");
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

