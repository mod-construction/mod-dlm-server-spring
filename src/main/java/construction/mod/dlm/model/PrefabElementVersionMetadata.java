package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Versioning and publishing status metadata of the element.
 */

@Schema(name = "PrefabElement_versionMetadata", description = "Versioning and publishing status metadata of the element.")
@JsonTypeName("PrefabElement_versionMetadata")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-03T12:37:58.764795587Z[Etc/UTC]", comments = "Generator version: 7.14.0-SNAPSHOT")
public class PrefabElementVersionMetadata {

  private String version;

  /**
   * Publishing status of the element
   */
  public enum StatusEnum {
    DRAFT("draft"),
    
    PUBLISHED("published"),
    
    DEPRECATED("deprecated");

    private final String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastUpdated;

  public PrefabElementVersionMetadata() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PrefabElementVersionMetadata(String version, StatusEnum status, OffsetDateTime lastUpdated) {
    this.version = version;
    this.status = status;
    this.lastUpdated = lastUpdated;
  }

  public PrefabElementVersionMetadata version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Semantic version of the prefab element, e.g., '1.0.0'
   * @return version
   */
  @NotNull @Pattern(regexp = "^\\d+\\.\\d+\\.\\d+$") 
  @Schema(name = "version", description = "Semantic version of the prefab element, e.g., '1.0.0'", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public PrefabElementVersionMetadata status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Publishing status of the element
   * @return status
   */
  @NotNull 
  @Schema(name = "status", description = "Publishing status of the element", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public PrefabElementVersionMetadata lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * ISO 8601 timestamp of the last update
   * @return lastUpdated
   */
  @NotNull @Valid 
  @Schema(name = "lastUpdated", description = "ISO 8601 timestamp of the last update", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lastUpdated")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementVersionMetadata prefabElementVersionMetadata = (PrefabElementVersionMetadata) o;
    return Objects.equals(this.version, prefabElementVersionMetadata.version) &&
        Objects.equals(this.status, prefabElementVersionMetadata.status) &&
        Objects.equals(this.lastUpdated, prefabElementVersionMetadata.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, status, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementVersionMetadata {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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

