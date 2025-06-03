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
 * The maximum load the element can bear, expressed as a positive number (e.g., 5.0)
 */

@Schema(name = "PrefabElement_structuralProperties_loadBearingCapacity", description = "The maximum load the element can bear, expressed as a positive number (e.g., 5.0)")
@JsonTypeName("PrefabElement_structuralProperties_loadBearingCapacity")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-03T12:37:58.764795587Z[Etc/UTC]", comments = "Generator version: 7.14.0-SNAPSHOT")
public class PrefabElementStructuralPropertiesLoadBearingCapacity {

  private BigDecimal maximumLoad;

  /**
   * Unit of force measurement, e.g., 'kN' for kilonewtons or 'N' for newtons
   */
  public enum ForceUnitEnum {
    N("N"),
    
    K_N("kN"),
    
    LBF("lbf"),
    
    KGF("kgf");

    private final String value;

    ForceUnitEnum(String value) {
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
    public static ForceUnitEnum fromValue(String value) {
      for (ForceUnitEnum b : ForceUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ForceUnitEnum forceUnit;

  /**
   * The type of load distribution applied to the element.
   */
  public enum LoadDistributionEnum {
    POINT("point"),
    
    UNIFORM("uniform"),
    
    TRIANGULAR("triangular"),
    
    TRAPEZOIDAL("trapezoidal"),
    
    ECCENTRIC("eccentric"),
    
    CUSTOM("custom");

    private final String value;

    LoadDistributionEnum(String value) {
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
    public static LoadDistributionEnum fromValue(String value) {
      for (LoadDistributionEnum b : LoadDistributionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private LoadDistributionEnum loadDistribution;

  /**
   * Structural load testing standard used to determine maximum load.
   */
  public enum TestStandardEnum {
    EN_1991_1_1("EN 1991-1-1"),
    
    ASTM_E72("ASTM E72"),
    
    ISO_4355("ISO 4355");

    private final String value;

    TestStandardEnum(String value) {
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
    public static TestStandardEnum fromValue(String value) {
      for (TestStandardEnum b : TestStandardEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable TestStandardEnum testStandard;

  public PrefabElementStructuralPropertiesLoadBearingCapacity() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PrefabElementStructuralPropertiesLoadBearingCapacity(BigDecimal maximumLoad, ForceUnitEnum forceUnit, LoadDistributionEnum loadDistribution) {
    this.maximumLoad = maximumLoad;
    this.forceUnit = forceUnit;
    this.loadDistribution = loadDistribution;
  }

  public PrefabElementStructuralPropertiesLoadBearingCapacity maximumLoad(BigDecimal maximumLoad) {
    this.maximumLoad = maximumLoad;
    return this;
  }

  /**
   * The maximum load the element can bear, expressed as a positive number (e.g., 5.0)
   * @return maximumLoad
   */
  @NotNull @Valid 
  @Schema(name = "maximumLoad", description = "The maximum load the element can bear, expressed as a positive number (e.g., 5.0)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("maximumLoad")
  public BigDecimal getMaximumLoad() {
    return maximumLoad;
  }

  public void setMaximumLoad(BigDecimal maximumLoad) {
    this.maximumLoad = maximumLoad;
  }

  public PrefabElementStructuralPropertiesLoadBearingCapacity forceUnit(ForceUnitEnum forceUnit) {
    this.forceUnit = forceUnit;
    return this;
  }

  /**
   * Unit of force measurement, e.g., 'kN' for kilonewtons or 'N' for newtons
   * @return forceUnit
   */
  @NotNull 
  @Schema(name = "forceUnit", description = "Unit of force measurement, e.g., 'kN' for kilonewtons or 'N' for newtons", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("forceUnit")
  public ForceUnitEnum getForceUnit() {
    return forceUnit;
  }

  public void setForceUnit(ForceUnitEnum forceUnit) {
    this.forceUnit = forceUnit;
  }

  public PrefabElementStructuralPropertiesLoadBearingCapacity loadDistribution(LoadDistributionEnum loadDistribution) {
    this.loadDistribution = loadDistribution;
    return this;
  }

  /**
   * The type of load distribution applied to the element.
   * @return loadDistribution
   */
  @NotNull 
  @Schema(name = "loadDistribution", example = "point", description = "The type of load distribution applied to the element.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("loadDistribution")
  public LoadDistributionEnum getLoadDistribution() {
    return loadDistribution;
  }

  public void setLoadDistribution(LoadDistributionEnum loadDistribution) {
    this.loadDistribution = loadDistribution;
  }

  public PrefabElementStructuralPropertiesLoadBearingCapacity testStandard(TestStandardEnum testStandard) {
    this.testStandard = testStandard;
    return this;
  }

  /**
   * Structural load testing standard used to determine maximum load.
   * @return testStandard
   */
  
  @Schema(name = "testStandard", example = "ASTM E72", description = "Structural load testing standard used to determine maximum load.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("testStandard")
  public TestStandardEnum getTestStandard() {
    return testStandard;
  }

  public void setTestStandard(TestStandardEnum testStandard) {
    this.testStandard = testStandard;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementStructuralPropertiesLoadBearingCapacity prefabElementStructuralPropertiesLoadBearingCapacity = (PrefabElementStructuralPropertiesLoadBearingCapacity) o;
    return Objects.equals(this.maximumLoad, prefabElementStructuralPropertiesLoadBearingCapacity.maximumLoad) &&
        Objects.equals(this.forceUnit, prefabElementStructuralPropertiesLoadBearingCapacity.forceUnit) &&
        Objects.equals(this.loadDistribution, prefabElementStructuralPropertiesLoadBearingCapacity.loadDistribution) &&
        Objects.equals(this.testStandard, prefabElementStructuralPropertiesLoadBearingCapacity.testStandard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumLoad, forceUnit, loadDistribution, testStandard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementStructuralPropertiesLoadBearingCapacity {\n");
    sb.append("    maximumLoad: ").append(toIndentedString(maximumLoad)).append("\n");
    sb.append("    forceUnit: ").append(toIndentedString(forceUnit)).append("\n");
    sb.append("    loadDistribution: ").append(toIndentedString(loadDistribution)).append("\n");
    sb.append("    testStandard: ").append(toIndentedString(testStandard)).append("\n");
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

