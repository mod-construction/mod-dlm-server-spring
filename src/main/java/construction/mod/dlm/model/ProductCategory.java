package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Product Category
 */

@Schema(name = "ProductCategory", description = "Product Category")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-19T08:58:57.598441451Z[Etc/UTC]", comments = "Generator version: 7.14.0-SNAPSHOT")
public class ProductCategory {

  /**
   * Gets or Sets category
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
   * Gets or Sets buildingSystem
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

  public ProductCategory() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProductCategory(CategoryEnum category, BuildingSystemEnum buildingSystem) {
    this.category = category;
    this.buildingSystem = buildingSystem;
  }

  public ProductCategory category(CategoryEnum category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   */
  @NotNull 
  @Schema(name = "category", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public ProductCategory buildingSystem(BuildingSystemEnum buildingSystem) {
    this.buildingSystem = buildingSystem;
    return this;
  }

  /**
   * Get buildingSystem
   * @return buildingSystem
   */
  @NotNull 
  @Schema(name = "buildingSystem", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ProductCategory productCategory = (ProductCategory) o;
    return Objects.equals(this.category, productCategory.category) &&
        Objects.equals(this.buildingSystem, productCategory.buildingSystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, buildingSystem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCategory {\n");
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

