package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Describes how the prefab element is installed and what structural systems it is compatible with.
 */

@Schema(name = "InstallationAndConnectivity", description = "Describes how the prefab element is installed and what structural systems it is compatible with.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-03T12:37:58.764795587Z[Etc/UTC]", comments = "Generator version: 7.14.0-SNAPSHOT")
public class InstallationAndConnectivity {

  /**
   * Type of connection used for assembly, including mechanical, chemical, and modular methods.
   */
  public enum ConnectionTypeEnum {
    BOLT_ON("Bolt-on"),
    
    WELDED("Welded"),
    
    CLIP_ON("Clip-on"),
    
    ADHESIVE("Adhesive"),
    
    MORTAR("Mortar"),
    
    SNAP_FIT("Snap-fit"),
    
    PLUG_AND_PLAY("Plug-and-Play"),
    
    DRY_JOINT("Dry Joint");

    private final String value;

    ConnectionTypeEnum(String value) {
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
    public static ConnectionTypeEnum fromValue(String value) {
      for (ConnectionTypeEnum b : ConnectionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ConnectionTypeEnum connectionType;

  private BigDecimal installationTime;

  /**
   * Structural systems compatible with the prefab element, supporting integration into various construction assemblies.
   */
  public enum CompatibilityEnum {
    STEEL_FRAME("Steel Frame"),
    
    WOOD_FRAME("Wood Frame"),
    
    CONCRETE_STRUCTURE("Concrete Structure"),
    
    BRICKWORK("Brickwork"),
    
    MODULAR_SYSTEMS("Modular Systems"),
    
    GLASS_FACADES("Glass Facades"),
    
    COMPOSITE_MATERIALS("Composite Materials"),
    
    CLT("CLT"),
    
    LIGHT_GAUGE_STEEL("Light Gauge Steel"),
    
    MASONRY_INFILL("Masonry Infill");

    private final String value;

    CompatibilityEnum(String value) {
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
    public static CompatibilityEnum fromValue(String value) {
      for (CompatibilityEnum b : CompatibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable CompatibilityEnum compatibility;

  public InstallationAndConnectivity() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InstallationAndConnectivity(BigDecimal installationTime) {
    this.installationTime = installationTime;
  }

  public InstallationAndConnectivity connectionType(ConnectionTypeEnum connectionType) {
    this.connectionType = connectionType;
    return this;
  }

  /**
   * Type of connection used for assembly, including mechanical, chemical, and modular methods.
   * @return connectionType
   */
  
  @Schema(name = "connectionType", example = "Bolt-on", description = "Type of connection used for assembly, including mechanical, chemical, and modular methods.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionType")
  public ConnectionTypeEnum getConnectionType() {
    return connectionType;
  }

  public void setConnectionType(ConnectionTypeEnum connectionType) {
    this.connectionType = connectionType;
  }

  public InstallationAndConnectivity installationTime(BigDecimal installationTime) {
    this.installationTime = installationTime;
    return this;
  }

  /**
   * Estimated installation time in minutes
   * minimum: 0
   * @return installationTime
   */
  @NotNull @Valid @DecimalMin("0") 
  @Schema(name = "installationTime", description = "Estimated installation time in minutes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("installationTime")
  public BigDecimal getInstallationTime() {
    return installationTime;
  }

  public void setInstallationTime(BigDecimal installationTime) {
    this.installationTime = installationTime;
  }

  public InstallationAndConnectivity compatibility(CompatibilityEnum compatibility) {
    this.compatibility = compatibility;
    return this;
  }

  /**
   * Structural systems compatible with the prefab element, supporting integration into various construction assemblies.
   * @return compatibility
   */
  
  @Schema(name = "compatibility", example = "Concrete Structure", description = "Structural systems compatible with the prefab element, supporting integration into various construction assemblies.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compatibility")
  public CompatibilityEnum getCompatibility() {
    return compatibility;
  }

  public void setCompatibility(CompatibilityEnum compatibility) {
    this.compatibility = compatibility;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallationAndConnectivity installationAndConnectivity = (InstallationAndConnectivity) o;
    return Objects.equals(this.connectionType, installationAndConnectivity.connectionType) &&
        Objects.equals(this.installationTime, installationAndConnectivity.installationTime) &&
        Objects.equals(this.compatibility, installationAndConnectivity.compatibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionType, installationTime, compatibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallationAndConnectivity {\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
    sb.append("    installationTime: ").append(toIndentedString(installationTime)).append("\n");
    sb.append("    compatibility: ").append(toIndentedString(compatibility)).append("\n");
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

