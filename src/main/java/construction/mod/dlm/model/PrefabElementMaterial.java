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
 * Material and physical properties of the prefab element.
 */

@Schema(name = "PrefabElement_material", description = "Material and physical properties of the prefab element.")
@JsonTypeName("PrefabElement_material")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-04T08:15:16.967754158Z[Etc/UTC]", comments = "Generator version: 7.14.0-SNAPSHOT")
public class PrefabElementMaterial {

  /**
   * Primary material of the product element.
   */
  public enum FinishMaterialEnum {
    TIMBER("Timber"),
    
    STEEL("Steel"),
    
    CONCRETE("Concrete"),
    
    HYBRID("Hybrid"),
    
    OTHER("Other");

    private final String value;

    FinishMaterialEnum(String value) {
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
    public static FinishMaterialEnum fromValue(String value) {
      for (FinishMaterialEnum b : FinishMaterialEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FinishMaterialEnum finishMaterial;

  /**
   * Primary material of the product element.
   */
  public enum StructuralMaterialEnum {
    TIMBER("Timber"),
    
    STEEL("Steel"),
    
    CONCRETE("Concrete"),
    
    HYBRID("Hybrid"),
    
    OTHER("Other");

    private final String value;

    StructuralMaterialEnum(String value) {
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
    public static StructuralMaterialEnum fromValue(String value) {
      for (StructuralMaterialEnum b : StructuralMaterialEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StructuralMaterialEnum structuralMaterial;

  public PrefabElementMaterial() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PrefabElementMaterial(FinishMaterialEnum finishMaterial, StructuralMaterialEnum structuralMaterial) {
    this.finishMaterial = finishMaterial;
    this.structuralMaterial = structuralMaterial;
  }

  public PrefabElementMaterial finishMaterial(FinishMaterialEnum finishMaterial) {
    this.finishMaterial = finishMaterial;
    return this;
  }

  /**
   * Primary material of the product element.
   * @return finishMaterial
   */
  @NotNull 
  @Schema(name = "finishMaterial", example = "Steel", description = "Primary material of the product element.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("finishMaterial")
  public FinishMaterialEnum getFinishMaterial() {
    return finishMaterial;
  }

  public void setFinishMaterial(FinishMaterialEnum finishMaterial) {
    this.finishMaterial = finishMaterial;
  }

  public PrefabElementMaterial structuralMaterial(StructuralMaterialEnum structuralMaterial) {
    this.structuralMaterial = structuralMaterial;
    return this;
  }

  /**
   * Primary material of the product element.
   * @return structuralMaterial
   */
  @NotNull 
  @Schema(name = "structuralMaterial", example = "Steel", description = "Primary material of the product element.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("structuralMaterial")
  public StructuralMaterialEnum getStructuralMaterial() {
    return structuralMaterial;
  }

  public void setStructuralMaterial(StructuralMaterialEnum structuralMaterial) {
    this.structuralMaterial = structuralMaterial;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementMaterial prefabElementMaterial = (PrefabElementMaterial) o;
    return Objects.equals(this.finishMaterial, prefabElementMaterial.finishMaterial) &&
        Objects.equals(this.structuralMaterial, prefabElementMaterial.structuralMaterial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finishMaterial, structuralMaterial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementMaterial {\n");
    sb.append("    finishMaterial: ").append(toIndentedString(finishMaterial)).append("\n");
    sb.append("    structuralMaterial: ").append(toIndentedString(structuralMaterial)).append("\n");
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

