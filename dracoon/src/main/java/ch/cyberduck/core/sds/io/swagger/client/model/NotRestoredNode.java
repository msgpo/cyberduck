/*
 * DRACOON
 * Version 4.4.0 - built at: 2017-12-04 04:14:43, API server: https://demo.dracoon.com/api/v4
 *
 * OpenAPI spec version: 4.4.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NotRestoredNode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T10:55:56.129+02:00")
public class NotRestoredNode {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("parentId")
  private Long parentId = null;

  @JsonProperty("parentPath")
  private String parentPath = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Node type
   */
  public enum TypeEnum {
    FOLDER("folder"),
    
    FILE("file");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  public NotRestoredNode id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Not restored node id 
   * @return id
  **/
  @ApiModelProperty(value = "Not restored node id ")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public NotRestoredNode parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Parent Node ID
   * @return parentId
  **/
  @ApiModelProperty(required = true, value = "Parent Node ID")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public NotRestoredNode parentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

   /**
   * Path to parent node
   * @return parentPath
  **/
  @ApiModelProperty(required = true, value = "Path to parent node")
  public String getParentPath() {
    return parentPath;
  }

  public void setParentPath(String parentPath) {
    this.parentPath = parentPath;
  }

  public NotRestoredNode name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Node name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Node name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NotRestoredNode type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Node type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Node type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotRestoredNode notRestoredNode = (NotRestoredNode) o;
    return Objects.equals(this.id, notRestoredNode.id) &&
        Objects.equals(this.parentId, notRestoredNode.parentId) &&
        Objects.equals(this.parentPath, notRestoredNode.parentPath) &&
        Objects.equals(this.name, notRestoredNode.name) &&
        Objects.equals(this.type, notRestoredNode.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, parentPath, name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotRestoredNode {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentPath: ").append(toIndentedString(parentPath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
