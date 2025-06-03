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
 * Product category classification (e.g., Wall Panels, Stairs, Facade Elements).
 */

@Schema(name = "PrefabElement_productCategory", description = "Product category classification (e.g., Wall Panels, Stairs, Facade Elements).")
@JsonTypeName("PrefabElement_productCategory")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-03T12:37:58.764795587Z[Etc/UTC]", comments = "Generator version: 7.14.0-SNAPSHOT")
public class PrefabElementProductCategory {

  /**
   * Specific product category within building systems.
   */
  public enum CategoryEnum {
    BOARDING("Boarding"),
    
    SOLID_WALL_PANELS("Solid Wall Panels"),
    
    CLOSED_WALL_PANELS("Closed Wall Panels"),
    
    TWINWALL("Twinwall"),
    
    OPEN_WALL_PANELS("Open Wall Panels"),
    
    STRUCTURAL_INSULATED_PANELS_SIPS_("Structural Insulated Panels (SIPs)"),
    
    INSULATED_CONCRETE_PANELS("Insulated Concrete Panels"),
    
    PREFABRICATED_BALCONY("Prefabricated Balcony"),
    
    POD("Pod"),
    
    WHOLE_BUILDING_SYSTEM("Whole Building System"),
    
    STRUCTURAL_FRAME("Structural Frame"),
    
    FACADE_SYSTEM("Facade System"),
    
    HOLLOWCORE_FLOOR("Hollowcore Floor"),
    
    CONCRETE_LATTICE_FLOOR("Concrete Lattice Floor"),
    
    FLOOR_CASSETTES("Floor Cassettes"),
    
    SOLID_FLOOR_PANELS("Solid Floor Panels"),
    
    VOLUMETRIC_MODULE("Volumetric module"),
    
    PREFABRICATED_PLANT("Prefabricated Plant"),
    
    ROOF_PANEL("Roof Panel"),
    
    ROOF_TRUSS("Roof Truss"),
    
    PREFABRICATED_STAIRS("Prefabricated Stairs");

    private final String value;

    CategoryEnum(String value) {
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
    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CategoryEnum category;

  /**
   * Building system category to which the product element belongs.
   */
  public enum BuildingSystemEnum {
    WALL("Wall"),
    
    BALCONY("Balcony"),
    
    POD("Pod"),
    
    FRAME("Frame"),
    
    FACADE("Facade"),
    
    FLOORS("Floors"),
    
    MODULES("Modules"),
    
    PLANTS("Plants"),
    
    ROOFS("Roofs"),
    
    STAIRS("Stairs");

    private final String value;

    BuildingSystemEnum(String value) {
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
    public static BuildingSystemEnum fromValue(String value) {
      for (BuildingSystemEnum b : BuildingSystemEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private BuildingSystemEnum buildingSystem;

  public PrefabElementProductCategory() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PrefabElementProductCategory(CategoryEnum category, BuildingSystemEnum buildingSystem) {
    this.category = category;
    this.buildingSystem = buildingSystem;
  }

  public PrefabElementProductCategory category(CategoryEnum category) {
    this.category = category;
    return this;
  }

  /**
   * Specific product category within building systems.
   * @return category
   */
  @NotNull 
  @Schema(name = "category", example = "Structural Insulated Panels (SIPs)", description = "Specific product category within building systems.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public PrefabElementProductCategory buildingSystem(BuildingSystemEnum buildingSystem) {
    this.buildingSystem = buildingSystem;
    return this;
  }

  /**
   * Building system category to which the product element belongs.
   * @return buildingSystem
   */
  @NotNull 
  @Schema(name = "buildingSystem", example = "Facade", description = "Building system category to which the product element belongs.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("buildingSystem")
  public BuildingSystemEnum getBuildingSystem() {
    return buildingSystem;
  }

  public void setBuildingSystem(BuildingSystemEnum buildingSystem) {
    this.buildingSystem = buildingSystem;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementProductCategory prefabElementProductCategory = (PrefabElementProductCategory) o;
    return Objects.equals(this.category, prefabElementProductCategory.category) &&
        Objects.equals(this.buildingSystem, prefabElementProductCategory.buildingSystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, buildingSystem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementProductCategory {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    buildingSystem: ").append(toIndentedString(buildingSystem)).append("\n");
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

