package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import construction.mod.dlm.model.InstallationAndConnectivity;
import construction.mod.dlm.model.PrefabElementAestheticAndCustomizationOptions;
import construction.mod.dlm.model.PrefabElementBoundingBox;
import construction.mod.dlm.model.PrefabElementDimensional;
import construction.mod.dlm.model.PrefabElementDocumentationAndCompliance;
import construction.mod.dlm.model.PrefabElementEconomicFactors;
import construction.mod.dlm.model.PrefabElementLifecycleAndMaintenance;
import construction.mod.dlm.model.PrefabElementMaterial;
import construction.mod.dlm.model.PrefabElementPerformance;
import construction.mod.dlm.model.PrefabElementProductCategory;
import construction.mod.dlm.model.PrefabElementStructuralProperties;
import construction.mod.dlm.model.PrefabElementVersionMetadata;
import construction.mod.dlm.model.Sustainability;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Prefab Element
 */

@Schema(name = "PrefabElement", description = "Prefab Element")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-04T08:15:16.967754158Z[Etc/UTC]", comments = "Generator version: 7.14.0-SNAPSHOT")
public class PrefabElement {

  private UUID id;

  private PrefabElementVersionMetadata versionMetadata;

  private String name;

  private String description;

  private PrefabElementBoundingBox boundingBox;

  @Valid
  private List<String> images = new ArrayList<>();

  private PrefabElementProductCategory productCategory;

  private PrefabElementMaterial material;

  private PrefabElementDimensional dimensional;

  private @Nullable PrefabElementStructuralProperties structuralProperties;

  private @Nullable PrefabElementPerformance performance;

  private @Nullable Sustainability sustainability;

  private @Nullable PrefabElementDocumentationAndCompliance documentationAndCompliance;

  private @Nullable InstallationAndConnectivity installationAndConnectivity;

  private @Nullable PrefabElementLifecycleAndMaintenance lifecycleAndMaintenance;

  private @Nullable PrefabElementAestheticAndCustomizationOptions aestheticAndCustomizationOptions;

  private @Nullable PrefabElementEconomicFactors economicFactors;

  /**
   * IFC Building Element types based on IFC 4.3 used in BIM tools for semantic classification. (e.g., IfcWall, IfcSlab).
   */
  public enum IfcTypeEnum {
    IFC_BEAM("IfcBeam"),
    
    IFC_CHIMNEY("IfcChimney"),
    
    IFC_COLUMN("IfcColumn"),
    
    IFC_COVERING("IfcCovering"),
    
    IFC_CURTAIN_WALL("IfcCurtainWall"),
    
    IFC_DOOR("IfcDoor"),
    
    IFC_FOOTING("IfcFooting"),
    
    IFC_MEMBER("IfcMember"),
    
    IFC_PILE("IfcPile"),
    
    IFC_PLATE("IfcPlate"),
    
    IFC_RAILING("IfcRailing"),
    
    IFC_RAMP("IfcRamp"),
    
    IFC_RAMP_FLIGHT("IfcRampFlight"),
    
    IFC_ROOF("IfcRoof"),
    
    IFC_SHADING_DEVICE("IfcShadingDevice"),
    
    IFC_SLAB("IfcSlab"),
    
    IFC_STAIR("IfcStair"),
    
    IFC_STAIR_FLIGHT("IfcStairFlight"),
    
    IFC_WALL("IfcWall"),
    
    IFC_WALL_STANDARD_CASE("IfcWallStandardCase"),
    
    IFC_WINDOW("IfcWindow"),
    
    IFC_BUILDING_ELEMENT_PROXY("IfcBuildingElementProxy");

    private final String value;

    IfcTypeEnum(String value) {
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
    public static IfcTypeEnum fromValue(String value) {
      for (IfcTypeEnum b : IfcTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable IfcTypeEnum ifcType;

  private @Nullable URI bimModelUrl;

  public PrefabElement() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PrefabElement(UUID id, PrefabElementVersionMetadata versionMetadata, String name, String description, PrefabElementBoundingBox boundingBox, List<String> images, PrefabElementProductCategory productCategory, PrefabElementMaterial material, PrefabElementDimensional dimensional) {
    this.id = id;
    this.versionMetadata = versionMetadata;
    this.name = name;
    this.description = description;
    this.boundingBox = boundingBox;
    this.images = images;
    this.productCategory = productCategory;
    this.material = material;
    this.dimensional = dimensional;
  }

  public PrefabElement id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier for the prefab element (UUID).
   * @return id
   */
  @NotNull @Valid 
  @Schema(name = "id", example = "4dd643ff-7ec7-4666-9c88-50b7d3da34e4", description = "A unique identifier for the prefab element (UUID).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public PrefabElement versionMetadata(PrefabElementVersionMetadata versionMetadata) {
    this.versionMetadata = versionMetadata;
    return this;
  }

  /**
   * Get versionMetadata
   * @return versionMetadata
   */
  @NotNull @Valid 
  @Schema(name = "versionMetadata", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("versionMetadata")
  public PrefabElementVersionMetadata getVersionMetadata() {
    return versionMetadata;
  }

  public void setVersionMetadata(PrefabElementVersionMetadata versionMetadata) {
    this.versionMetadata = versionMetadata;
  }

  public PrefabElement name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name of the prefab element.
   * @return name
   */
  @NotNull @Size(min = 1) 
  @Schema(name = "name", example = "Cross-Laminated Timber Wall Panel", description = "Human-readable name of the prefab element.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PrefabElement description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Detailed description of the prefab element, including its intended use or application.
   * @return description
   */
  @NotNull @Size(min = 1) 
  @Schema(name = "description", example = "This CLT wall panel is suitable for multi-story residential buildings and meets fire resistance standards.", description = "Detailed description of the prefab element, including its intended use or application.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PrefabElement boundingBox(PrefabElementBoundingBox boundingBox) {
    this.boundingBox = boundingBox;
    return this;
  }

  /**
   * Get boundingBox
   * @return boundingBox
   */
  @NotNull @Valid 
  @Schema(name = "boundingBox", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("boundingBox")
  public PrefabElementBoundingBox getBoundingBox() {
    return boundingBox;
  }

  public void setBoundingBox(PrefabElementBoundingBox boundingBox) {
    this.boundingBox = boundingBox;
  }

  public PrefabElement images(List<String> images) {
    this.images = images;
    return this;
  }

  public PrefabElement addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * List of image URLs showing the prefab element from various angles.
   * @return images
   */
  @NotNull @Size(min = 1) 
  @Schema(name = "images", example = "[https://example.com/images/clt-wall-front.png]", description = "List of image URLs showing the prefab element from various angles.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("images")
  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public PrefabElement productCategory(PrefabElementProductCategory productCategory) {
    this.productCategory = productCategory;
    return this;
  }

  /**
   * Get productCategory
   * @return productCategory
   */
  @NotNull @Valid 
  @Schema(name = "productCategory", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("productCategory")
  public PrefabElementProductCategory getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(PrefabElementProductCategory productCategory) {
    this.productCategory = productCategory;
  }

  public PrefabElement material(PrefabElementMaterial material) {
    this.material = material;
    return this;
  }

  /**
   * Get material
   * @return material
   */
  @NotNull @Valid 
  @Schema(name = "material", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("material")
  public PrefabElementMaterial getMaterial() {
    return material;
  }

  public void setMaterial(PrefabElementMaterial material) {
    this.material = material;
  }

  public PrefabElement dimensional(PrefabElementDimensional dimensional) {
    this.dimensional = dimensional;
    return this;
  }

  /**
   * Get dimensional
   * @return dimensional
   */
  @NotNull @Valid 
  @Schema(name = "dimensional", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dimensional")
  public PrefabElementDimensional getDimensional() {
    return dimensional;
  }

  public void setDimensional(PrefabElementDimensional dimensional) {
    this.dimensional = dimensional;
  }

  public PrefabElement structuralProperties(PrefabElementStructuralProperties structuralProperties) {
    this.structuralProperties = structuralProperties;
    return this;
  }

  /**
   * Get structuralProperties
   * @return structuralProperties
   */
  @Valid 
  @Schema(name = "structuralProperties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("structuralProperties")
  public PrefabElementStructuralProperties getStructuralProperties() {
    return structuralProperties;
  }

  public void setStructuralProperties(PrefabElementStructuralProperties structuralProperties) {
    this.structuralProperties = structuralProperties;
  }

  public PrefabElement performance(PrefabElementPerformance performance) {
    this.performance = performance;
    return this;
  }

  /**
   * Get performance
   * @return performance
   */
  @Valid 
  @Schema(name = "performance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("performance")
  public PrefabElementPerformance getPerformance() {
    return performance;
  }

  public void setPerformance(PrefabElementPerformance performance) {
    this.performance = performance;
  }

  public PrefabElement sustainability(Sustainability sustainability) {
    this.sustainability = sustainability;
    return this;
  }

  /**
   * Environmental and sustainability performance such as EPDs or recyclability.
   * @return sustainability
   */
  @Valid 
  @Schema(name = "sustainability", description = "Environmental and sustainability performance such as EPDs or recyclability.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sustainability")
  public Sustainability getSustainability() {
    return sustainability;
  }

  public void setSustainability(Sustainability sustainability) {
    this.sustainability = sustainability;
  }

  public PrefabElement documentationAndCompliance(PrefabElementDocumentationAndCompliance documentationAndCompliance) {
    this.documentationAndCompliance = documentationAndCompliance;
    return this;
  }

  /**
   * Get documentationAndCompliance
   * @return documentationAndCompliance
   */
  @Valid 
  @Schema(name = "documentationAndCompliance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("documentationAndCompliance")
  public PrefabElementDocumentationAndCompliance getDocumentationAndCompliance() {
    return documentationAndCompliance;
  }

  public void setDocumentationAndCompliance(PrefabElementDocumentationAndCompliance documentationAndCompliance) {
    this.documentationAndCompliance = documentationAndCompliance;
  }

  public PrefabElement installationAndConnectivity(InstallationAndConnectivity installationAndConnectivity) {
    this.installationAndConnectivity = installationAndConnectivity;
    return this;
  }

  /**
   * Optional installation guidelines and connectivity interface descriptions.
   * @return installationAndConnectivity
   */
  @Valid 
  @Schema(name = "installationAndConnectivity", description = "Optional installation guidelines and connectivity interface descriptions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("installationAndConnectivity")
  public InstallationAndConnectivity getInstallationAndConnectivity() {
    return installationAndConnectivity;
  }

  public void setInstallationAndConnectivity(InstallationAndConnectivity installationAndConnectivity) {
    this.installationAndConnectivity = installationAndConnectivity;
  }

  public PrefabElement lifecycleAndMaintenance(PrefabElementLifecycleAndMaintenance lifecycleAndMaintenance) {
    this.lifecycleAndMaintenance = lifecycleAndMaintenance;
    return this;
  }

  /**
   * Get lifecycleAndMaintenance
   * @return lifecycleAndMaintenance
   */
  @Valid 
  @Schema(name = "lifecycleAndMaintenance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifecycleAndMaintenance")
  public PrefabElementLifecycleAndMaintenance getLifecycleAndMaintenance() {
    return lifecycleAndMaintenance;
  }

  public void setLifecycleAndMaintenance(PrefabElementLifecycleAndMaintenance lifecycleAndMaintenance) {
    this.lifecycleAndMaintenance = lifecycleAndMaintenance;
  }

  public PrefabElement aestheticAndCustomizationOptions(PrefabElementAestheticAndCustomizationOptions aestheticAndCustomizationOptions) {
    this.aestheticAndCustomizationOptions = aestheticAndCustomizationOptions;
    return this;
  }

  /**
   * Get aestheticAndCustomizationOptions
   * @return aestheticAndCustomizationOptions
   */
  @Valid 
  @Schema(name = "aestheticAndCustomizationOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aestheticAndCustomizationOptions")
  public PrefabElementAestheticAndCustomizationOptions getAestheticAndCustomizationOptions() {
    return aestheticAndCustomizationOptions;
  }

  public void setAestheticAndCustomizationOptions(PrefabElementAestheticAndCustomizationOptions aestheticAndCustomizationOptions) {
    this.aestheticAndCustomizationOptions = aestheticAndCustomizationOptions;
  }

  public PrefabElement economicFactors(PrefabElementEconomicFactors economicFactors) {
    this.economicFactors = economicFactors;
    return this;
  }

  /**
   * Get economicFactors
   * @return economicFactors
   */
  @Valid 
  @Schema(name = "economicFactors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("economicFactors")
  public PrefabElementEconomicFactors getEconomicFactors() {
    return economicFactors;
  }

  public void setEconomicFactors(PrefabElementEconomicFactors economicFactors) {
    this.economicFactors = economicFactors;
  }

  public PrefabElement ifcType(IfcTypeEnum ifcType) {
    this.ifcType = ifcType;
    return this;
  }

  /**
   * IFC Building Element types based on IFC 4.3 used in BIM tools for semantic classification. (e.g., IfcWall, IfcSlab).
   * @return ifcType
   */
  
  @Schema(name = "ifcType", example = "IfcWallStandardCase", description = "IFC Building Element types based on IFC 4.3 used in BIM tools for semantic classification. (e.g., IfcWall, IfcSlab).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ifcType")
  public IfcTypeEnum getIfcType() {
    return ifcType;
  }

  public void setIfcType(IfcTypeEnum ifcType) {
    this.ifcType = ifcType;
  }

  public PrefabElement bimModelUrl(URI bimModelUrl) {
    this.bimModelUrl = bimModelUrl;
    return this;
  }

  /**
   * Optional URL pointing to a downloadable BIM model or online viewer for the element.
   * @return bimModelUrl
   */
  @Valid 
  @Schema(name = "bimModelUrl", example = "https://example.com/models/clt-wall.ifc", description = "Optional URL pointing to a downloadable BIM model or online viewer for the element.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bimModelUrl")
  public URI getBimModelUrl() {
    return bimModelUrl;
  }

  public void setBimModelUrl(URI bimModelUrl) {
    this.bimModelUrl = bimModelUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElement prefabElement = (PrefabElement) o;
    return Objects.equals(this.id, prefabElement.id) &&
        Objects.equals(this.versionMetadata, prefabElement.versionMetadata) &&
        Objects.equals(this.name, prefabElement.name) &&
        Objects.equals(this.description, prefabElement.description) &&
        Objects.equals(this.boundingBox, prefabElement.boundingBox) &&
        Objects.equals(this.images, prefabElement.images) &&
        Objects.equals(this.productCategory, prefabElement.productCategory) &&
        Objects.equals(this.material, prefabElement.material) &&
        Objects.equals(this.dimensional, prefabElement.dimensional) &&
        Objects.equals(this.structuralProperties, prefabElement.structuralProperties) &&
        Objects.equals(this.performance, prefabElement.performance) &&
        Objects.equals(this.sustainability, prefabElement.sustainability) &&
        Objects.equals(this.documentationAndCompliance, prefabElement.documentationAndCompliance) &&
        Objects.equals(this.installationAndConnectivity, prefabElement.installationAndConnectivity) &&
        Objects.equals(this.lifecycleAndMaintenance, prefabElement.lifecycleAndMaintenance) &&
        Objects.equals(this.aestheticAndCustomizationOptions, prefabElement.aestheticAndCustomizationOptions) &&
        Objects.equals(this.economicFactors, prefabElement.economicFactors) &&
        Objects.equals(this.ifcType, prefabElement.ifcType) &&
        Objects.equals(this.bimModelUrl, prefabElement.bimModelUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, versionMetadata, name, description, boundingBox, images, productCategory, material, dimensional, structuralProperties, performance, sustainability, documentationAndCompliance, installationAndConnectivity, lifecycleAndMaintenance, aestheticAndCustomizationOptions, economicFactors, ifcType, bimModelUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElement {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    versionMetadata: ").append(toIndentedString(versionMetadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    boundingBox: ").append(toIndentedString(boundingBox)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    material: ").append(toIndentedString(material)).append("\n");
    sb.append("    dimensional: ").append(toIndentedString(dimensional)).append("\n");
    sb.append("    structuralProperties: ").append(toIndentedString(structuralProperties)).append("\n");
    sb.append("    performance: ").append(toIndentedString(performance)).append("\n");
    sb.append("    sustainability: ").append(toIndentedString(sustainability)).append("\n");
    sb.append("    documentationAndCompliance: ").append(toIndentedString(documentationAndCompliance)).append("\n");
    sb.append("    installationAndConnectivity: ").append(toIndentedString(installationAndConnectivity)).append("\n");
    sb.append("    lifecycleAndMaintenance: ").append(toIndentedString(lifecycleAndMaintenance)).append("\n");
    sb.append("    aestheticAndCustomizationOptions: ").append(toIndentedString(aestheticAndCustomizationOptions)).append("\n");
    sb.append("    economicFactors: ").append(toIndentedString(economicFactors)).append("\n");
    sb.append("    ifcType: ").append(toIndentedString(ifcType)).append("\n");
    sb.append("    bimModelUrl: ").append(toIndentedString(bimModelUrl)).append("\n");
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

