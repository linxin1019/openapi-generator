/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * ShapeInterface
 */
@JsonPropertyOrder({
  ShapeInterface.JSON_PROPERTY_SHAPE_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0-SNAPSHOT")
public class ShapeInterface {
  public static final String JSON_PROPERTY_SHAPE_TYPE = "shapeType";
  private String shapeType;

  public ShapeInterface() { 
  }

  public ShapeInterface shapeType(String shapeType) {
    this.shapeType = shapeType;
    return this;
  }

   /**
   * Get shapeType
   * @return shapeType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SHAPE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getShapeType() {
    return shapeType;
  }


  @JsonProperty(JSON_PROPERTY_SHAPE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShapeType(String shapeType) {
    this.shapeType = shapeType;
  }


  /**
   * Return true if this ShapeInterface object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShapeInterface shapeInterface = (ShapeInterface) o;
    return Objects.equals(this.shapeType, shapeInterface.shapeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shapeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShapeInterface {\n");
    sb.append("    shapeType: ").append(toIndentedString(shapeType)).append("\n");
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

