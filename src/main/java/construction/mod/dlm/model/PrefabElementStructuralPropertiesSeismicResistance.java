package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PrefabElementStructuralPropertiesSeismicResistance
 */

@JsonTypeName("PrefabElement_structuralProperties_seismicResistance")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-03T14:27:51.113774521Z[Etc/UTC]", comments = "Generator version: 7.14.0-SNAPSHOT")
public class PrefabElementStructuralPropertiesSeismicResistance {

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementStructuralPropertiesSeismicResistance {\n");
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

