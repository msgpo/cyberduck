/*
 * Storegate.Web
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.storegate.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;

/**
 * A CreateFolderRequest object
 */
@ApiModel(description = "A CreateFolderRequest object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T11:22:03.779+03:00")
public class CreateFolderRequest {
  @JsonProperty("parentID")
  private String parentID = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("modified")
  private LocalDateTime modified = null;

  @JsonProperty("created")
  private LocalDateTime created = null;

  @JsonProperty("accessed")
  private LocalDateTime accessed = null;

  @JsonProperty("attributes")
  private Integer attributes = null;

  @JsonProperty("lockId")
  private String lockId = null;

  public CreateFolderRequest parentID(String parentID) {
    this.parentID = parentID;
    return this;
  }

   /**
   * The id of the folder to create the folder in
   * @return parentID
  **/
  @ApiModelProperty(value = "The id of the folder to create the folder in")
  public String getParentID() {
    return parentID;
  }

  public void setParentID(String parentID) {
    this.parentID = parentID;
  }

  public CreateFolderRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The new folder name
   * @return name
  **/
  @ApiModelProperty(value = "The new folder name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateFolderRequest modified(LocalDateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Thefolder&#39;s modified datetime in UTC
   * @return modified
  **/
  @ApiModelProperty(value = "Thefolder's modified datetime in UTC")
  public LocalDateTime getModified() {
    return modified;
  }

  public void setModified(LocalDateTime modified) {
    this.modified = modified;
  }

  public CreateFolderRequest created(LocalDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * The folder&#39;s created datetime in UTC
   * @return created
  **/
  @ApiModelProperty(value = "The folder's created datetime in UTC")
  public LocalDateTime getCreated() {
    return created;
  }

  public void setCreated(LocalDateTime created) {
    this.created = created;
  }

  public CreateFolderRequest accessed(LocalDateTime accessed) {
    this.accessed = accessed;
    return this;
  }

   /**
   * The folder&#39;s last access datetime in UTC
   * @return accessed
  **/
  @ApiModelProperty(value = "The folder's last access datetime in UTC")
  public LocalDateTime getAccessed() {
    return accessed;
  }

  public void setAccessed(LocalDateTime accessed) {
    this.accessed = accessed;
  }

  public CreateFolderRequest attributes(Integer attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * The folder atributes
   * @return attributes
  **/
  @ApiModelProperty(value = "The folder atributes")
  public Integer getAttributes() {
    return attributes;
  }

  public void setAttributes(Integer attributes) {
    this.attributes = attributes;
  }

  public CreateFolderRequest lockId(String lockId) {
    this.lockId = lockId;
    return this;
  }

   /**
   * The lock id, if available
   * @return lockId
  **/
  @ApiModelProperty(value = "The lock id, if available")
  public String getLockId() {
    return lockId;
  }

  public void setLockId(String lockId) {
    this.lockId = lockId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFolderRequest createFolderRequest = (CreateFolderRequest) o;
    return Objects.equals(this.parentID, createFolderRequest.parentID) &&
        Objects.equals(this.name, createFolderRequest.name) &&
        Objects.equals(this.modified, createFolderRequest.modified) &&
        Objects.equals(this.created, createFolderRequest.created) &&
        Objects.equals(this.accessed, createFolderRequest.accessed) &&
        Objects.equals(this.attributes, createFolderRequest.attributes) &&
        Objects.equals(this.lockId, createFolderRequest.lockId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentID, name, modified, created, accessed, attributes, lockId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFolderRequest {\n");
    
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    accessed: ").append(toIndentedString(accessed)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    lockId: ").append(toIndentedString(lockId)).append("\n");
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

