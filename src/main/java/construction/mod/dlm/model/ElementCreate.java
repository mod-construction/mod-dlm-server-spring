package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import construction.mod.dlm.model.PrefabElementAestheticAndCustomizationOptions;
import construction.mod.dlm.model.PrefabElementBoundingBox;
import construction.mod.dlm.model.PrefabElementDimensional;
import construction.mod.dlm.model.PrefabElementDocumentationAndCompliance;
import construction.mod.dlm.model.PrefabElementEconomicFactors;
import construction.mod.dlm.model.PrefabElementInstallationAndConnectivity;
import construction.mod.dlm.model.PrefabElementLifecycleAndMaintenance;
import construction.mod.dlm.model.PrefabElementMaterial;
import construction.mod.dlm.model.PrefabElementPerformance;
import construction.mod.dlm.model.PrefabElementStructuralProperties;
import construction.mod.dlm.model.PrefabElementSustainability;
import construction.mod.dlm.model.ProductCategory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An element to create.
 */

@Schema(name = "ElementCreate", description = "An element to create.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-13T10:18:54.063896910Z[Etc/UTC]", comments = "Generator version: 7.14.0-SNAPSHOT")
public class ElementCreate {

  private String name;

  private String description;

  private PrefabElementBoundingBox boundingBox;

  @Valid
  private List<String> images = new ArrayList<>();

  private ProductCategory productCategory;

  private PrefabElementMaterial material;

  private PrefabElementDimensional dimensional;

  private @Nullable PrefabElementStructuralProperties structuralProperties;

  private @Nullable PrefabElementPerformance performance;

  private @Nullable PrefabElementSustainability sustainability;

  private @Nullable PrefabElementDocumentationAndCompliance documentationAndCompliance;

  private @Nullable PrefabElementInstallationAndConnectivity installationAndConnectivity;

  private @Nullable PrefabElementLifecycleAndMaintenance lifecycleAndMaintenance;

  private @Nullable PrefabElementAestheticAndCustomizationOptions aestheticAndCustomizationOptions;

  private @Nullable PrefabElementEconomicFactors economicFactors;

  public ElementCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ElementCreate(String name, String description, PrefabElementBoundingBox boundingBox, List<String> images, ProductCategory productCategory, PrefabElementMaterial material, PrefabElementDimensional dimensional) {
    this.name = name;
    this.description = description;
    this.boundingBox = boundingBox;
    this.images = images;
    this.productCategory = productCategory;
    this.material = material;
    this.dimensional = dimensional;
  }

  public ElementCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ElementCreate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @NotNull 
  @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ElementCreate boundingBox(PrefabElementBoundingBox boundingBox) {
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

  public ElementCreate images(List<String> images) {
    this.images = images;
    return this;
  }

  public ElementCreate addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
   */
  @NotNull 
  @Schema(name = "images", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("images")
  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public ElementCreate productCategory(ProductCategory productCategory) {
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
  public ProductCategory getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(ProductCategory productCategory) {
    this.productCategory = productCategory;
  }

  public ElementCreate material(PrefabElementMaterial material) {
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

  public ElementCreate dimensional(PrefabElementDimensional dimensional) {
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

  public ElementCreate structuralProperties(PrefabElementStructuralProperties structuralProperties) {
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

  public ElementCreate performance(PrefabElementPerformance performance) {
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

  public ElementCreate sustainability(PrefabElementSustainability sustainability) {
    this.sustainability = sustainability;
    return this;
  }

  /**
   * Get sustainability
   * @return sustainability
   */
  @Valid 
  @Schema(name = "sustainability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sustainability")
  public PrefabElementSustainability getSustainability() {
    return sustainability;
  }

  public void setSustainability(PrefabElementSustainability sustainability) {
    this.sustainability = sustainability;
  }

  public ElementCreate documentationAndCompliance(PrefabElementDocumentationAndCompliance documentationAndCompliance) {
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

  public ElementCreate installationAndConnectivity(PrefabElementInstallationAndConnectivity installationAndConnectivity) {
    this.installationAndConnectivity = installationAndConnectivity;
    return this;
  }

  /**
   * Get installationAndConnectivity
   * @return installationAndConnectivity
   */
  @Valid 
  @Schema(name = "installationAndConnectivity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("installationAndConnectivity")
  public PrefabElementInstallationAndConnectivity getInstallationAndConnectivity() {
    return installationAndConnectivity;
  }

  public void setInstallationAndConnectivity(PrefabElementInstallationAndConnectivity installationAndConnectivity) {
    this.installationAndConnectivity = installationAndConnectivity;
  }

  public ElementCreate lifecycleAndMaintenance(PrefabElementLifecycleAndMaintenance lifecycleAndMaintenance) {
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

  public ElementCreate aestheticAndCustomizationOptions(PrefabElementAestheticAndCustomizationOptions aestheticAndCustomizationOptions) {
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

  public ElementCreate economicFactors(PrefabElementEconomicFactors economicFactors) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElementCreate elementCreate = (ElementCreate) o;
    return Objects.equals(this.name, elementCreate.name) &&
        Objects.equals(this.description, elementCreate.description) &&
        Objects.equals(this.boundingBox, elementCreate.boundingBox) &&
        Objects.equals(this.images, elementCreate.images) &&
        Objects.equals(this.productCategory, elementCreate.productCategory) &&
        Objects.equals(this.material, elementCreate.material) &&
        Objects.equals(this.dimensional, elementCreate.dimensional) &&
        Objects.equals(this.structuralProperties, elementCreate.structuralProperties) &&
        Objects.equals(this.performance, elementCreate.performance) &&
        Objects.equals(this.sustainability, elementCreate.sustainability) &&
        Objects.equals(this.documentationAndCompliance, elementCreate.documentationAndCompliance) &&
        Objects.equals(this.installationAndConnectivity, elementCreate.installationAndConnectivity) &&
        Objects.equals(this.lifecycleAndMaintenance, elementCreate.lifecycleAndMaintenance) &&
        Objects.equals(this.aestheticAndCustomizationOptions, elementCreate.aestheticAndCustomizationOptions) &&
        Objects.equals(this.economicFactors, elementCreate.economicFactors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, boundingBox, images, productCategory, material, dimensional, structuralProperties, performance, sustainability, documentationAndCompliance, installationAndConnectivity, lifecycleAndMaintenance, aestheticAndCustomizationOptions, economicFactors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElementCreate {\n");
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

