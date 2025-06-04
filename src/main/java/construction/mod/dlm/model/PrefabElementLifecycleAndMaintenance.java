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
 * Optional data describing maintenance schedules or expected lifecycle.
 */

@Schema(name = "PrefabElement_lifecycleAndMaintenance", description = "Optional data describing maintenance schedules or expected lifecycle.")
@JsonTypeName("PrefabElement_lifecycleAndMaintenance")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-04T08:15:16.967754158Z[Etc/UTC]", comments = "Generator version: 7.14.0-SNAPSHOT")
public class PrefabElementLifecycleAndMaintenance {

  private @Nullable BigDecimal expectedLifespan;

  private @Nullable String maintenanceRequirements;

  private @Nullable String warranty;

  public PrefabElementLifecycleAndMaintenance expectedLifespan(BigDecimal expectedLifespan) {
    this.expectedLifespan = expectedLifespan;
    return this;
  }

  /**
   * Expected lifespan of the prefab element in years.
   * @return expectedLifespan
   */
  @Valid 
  @Schema(name = "expectedLifespan", example = "50", description = "Expected lifespan of the prefab element in years.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expectedLifespan")
  public BigDecimal getExpectedLifespan() {
    return expectedLifespan;
  }

  public void setExpectedLifespan(BigDecimal expectedLifespan) {
    this.expectedLifespan = expectedLifespan;
  }

  public PrefabElementLifecycleAndMaintenance maintenanceRequirements(String maintenanceRequirements) {
    this.maintenanceRequirements = maintenanceRequirements;
    return this;
  }

  /**
   * Maintenance requirements of the prefab element.
   * @return maintenanceRequirements
   */
  
  @Schema(name = "maintenanceRequirements", example = "Regular cleaning and inspection.", description = "Maintenance requirements of the prefab element.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maintenanceRequirements")
  public String getMaintenanceRequirements() {
    return maintenanceRequirements;
  }

  public void setMaintenanceRequirements(String maintenanceRequirements) {
    this.maintenanceRequirements = maintenanceRequirements;
  }

  public PrefabElementLifecycleAndMaintenance warranty(String warranty) {
    this.warranty = warranty;
    return this;
  }

  /**
   * Warranty information of the prefab element.
   * @return warranty
   */
  
  @Schema(name = "warranty", example = "10 years warranty.", description = "Warranty information of the prefab element.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warranty")
  public String getWarranty() {
    return warranty;
  }

  public void setWarranty(String warranty) {
    this.warranty = warranty;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementLifecycleAndMaintenance prefabElementLifecycleAndMaintenance = (PrefabElementLifecycleAndMaintenance) o;
    return Objects.equals(this.expectedLifespan, prefabElementLifecycleAndMaintenance.expectedLifespan) &&
        Objects.equals(this.maintenanceRequirements, prefabElementLifecycleAndMaintenance.maintenanceRequirements) &&
        Objects.equals(this.warranty, prefabElementLifecycleAndMaintenance.warranty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedLifespan, maintenanceRequirements, warranty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementLifecycleAndMaintenance {\n");
    sb.append("    expectedLifespan: ").append(toIndentedString(expectedLifespan)).append("\n");
    sb.append("    maintenanceRequirements: ").append(toIndentedString(maintenanceRequirements)).append("\n");
    sb.append("    warranty: ").append(toIndentedString(warranty)).append("\n");
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

