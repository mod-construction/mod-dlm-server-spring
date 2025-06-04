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
 * Optional cost estimation, lead time, and supply constraints.
 */

@Schema(name = "PrefabElement_economicFactors", description = "Optional cost estimation, lead time, and supply constraints.")
@JsonTypeName("PrefabElement_economicFactors")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-04T08:15:16.967754158Z[Etc/UTC]", comments = "Generator version: 7.14.0-SNAPSHOT")
public class PrefabElementEconomicFactors {

  private @Nullable BigDecimal costPerUnit;

  /**
   * Currency used for the cost estimate (e.g., EUR, USD).
   */
  public enum CurrencyEnum {
    EUR("EUR"),
    
    USD("USD"),
    
    GBP("GBP"),
    
    CHF("CHF"),
    
    JPY("JPY"),
    
    CNY("CNY");

    private final String value;

    CurrencyEnum(String value) {
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
    public static CurrencyEnum fromValue(String value) {
      for (CurrencyEnum b : CurrencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable CurrencyEnum currency;

  private @Nullable BigDecimal manufacturingLeadTime;

  public PrefabElementEconomicFactors costPerUnit(BigDecimal costPerUnit) {
    this.costPerUnit = costPerUnit;
    return this;
  }

  /**
   * Estimated cost per unit of the prefab element.
   * @return costPerUnit
   */
  @Valid 
  @Schema(name = "costPerUnit", example = "180.5", description = "Estimated cost per unit of the prefab element.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("costPerUnit")
  public BigDecimal getCostPerUnit() {
    return costPerUnit;
  }

  public void setCostPerUnit(BigDecimal costPerUnit) {
    this.costPerUnit = costPerUnit;
  }

  public PrefabElementEconomicFactors currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency used for the cost estimate (e.g., EUR, USD).
   * @return currency
   */
  
  @Schema(name = "currency", example = "EUR", description = "Currency used for the cost estimate (e.g., EUR, USD).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }

  public PrefabElementEconomicFactors manufacturingLeadTime(BigDecimal manufacturingLeadTime) {
    this.manufacturingLeadTime = manufacturingLeadTime;
    return this;
  }

  /**
   * Estimated manufacturing lead time in days.
   * @return manufacturingLeadTime
   */
  @Valid 
  @Schema(name = "manufacturingLeadTime", example = "21", description = "Estimated manufacturing lead time in days.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("manufacturingLeadTime")
  public BigDecimal getManufacturingLeadTime() {
    return manufacturingLeadTime;
  }

  public void setManufacturingLeadTime(BigDecimal manufacturingLeadTime) {
    this.manufacturingLeadTime = manufacturingLeadTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementEconomicFactors prefabElementEconomicFactors = (PrefabElementEconomicFactors) o;
    return Objects.equals(this.costPerUnit, prefabElementEconomicFactors.costPerUnit) &&
        Objects.equals(this.currency, prefabElementEconomicFactors.currency) &&
        Objects.equals(this.manufacturingLeadTime, prefabElementEconomicFactors.manufacturingLeadTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costPerUnit, currency, manufacturingLeadTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementEconomicFactors {\n");
    sb.append("    costPerUnit: ").append(toIndentedString(costPerUnit)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    manufacturingLeadTime: ").append(toIndentedString(manufacturingLeadTime)).append("\n");
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

