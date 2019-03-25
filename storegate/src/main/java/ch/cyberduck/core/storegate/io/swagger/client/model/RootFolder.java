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
 * A rootfolder is folder that contains part of the account. An account usally have multiple root folders, like \&quot;home\&quot; and \&quot;backup\&quot;.
 */
@ApiModel(description = "A rootfolder is folder that contains part of the account. An account usally have multiple root folders, like \"home\" and \"backup\".")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T11:22:03.779+03:00")
public class RootFolder {
  @JsonProperty("path")
  private String path = null;

  /**
   * The rootfolder type.
   */
  public enum RootFolderTypeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    RootFolderTypeEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RootFolderTypeEnum fromValue(String text) {
      for (RootFolderTypeEnum b : RootFolderTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("rootFolderType")
  private RootFolderTypeEnum rootFolderType = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("created")
  private LocalDateTime created = null;

  @JsonProperty("modified")
  private LocalDateTime modified = null;

  @JsonProperty("uploaded")
  private LocalDateTime uploaded = null;

  /**
   * Indicates the item type.
   */
  public enum FlagsEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_4(4),
    
    NUMBER_8(8),
    
    NUMBER_16(16),
    
    NUMBER_32(32),
    
    NUMBER_64(64),
    
    NUMBER_128(128);

    private Integer value;

    FlagsEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FlagsEnum fromValue(String text) {
      for (FlagsEnum b : FlagsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("flags")
  private FlagsEnum flags = null;

  @JsonProperty("ownerId")
  private String ownerId = null;

  public RootFolder path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The path to the rootfolder.
   * @return path
  **/
  @ApiModelProperty(value = "The path to the rootfolder.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public RootFolder rootFolderType(RootFolderTypeEnum rootFolderType) {
    this.rootFolderType = rootFolderType;
    return this;
  }

   /**
   * The rootfolder type.
   * @return rootFolderType
  **/
  @ApiModelProperty(value = "The rootfolder type.")
  public RootFolderTypeEnum getRootFolderType() {
    return rootFolderType;
  }

  public void setRootFolderType(RootFolderTypeEnum rootFolderType) {
    this.rootFolderType = rootFolderType;
  }

  public RootFolder id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The item id.
   * @return id
  **/
  @ApiModelProperty(value = "The item id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RootFolder name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The item name.
   * @return name
  **/
  @ApiModelProperty(value = "The item name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RootFolder size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * The item size.
   * @return size
  **/
  @ApiModelProperty(value = "The item size.")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public RootFolder created(LocalDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * The date and time the item was created.
   * @return created
  **/
  @ApiModelProperty(value = "The date and time the item was created.")
  public LocalDateTime getCreated() {
    return created;
  }

  public void setCreated(LocalDateTime created) {
    this.created = created;
  }

  public RootFolder modified(LocalDateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * The date and time the item was last modified.
   * @return modified
  **/
  @ApiModelProperty(value = "The date and time the item was last modified.")
  public LocalDateTime getModified() {
    return modified;
  }

  public void setModified(LocalDateTime modified) {
    this.modified = modified;
  }

  public RootFolder uploaded(LocalDateTime uploaded) {
    this.uploaded = uploaded;
    return this;
  }

   /**
   * The date and time the item was uploaded.
   * @return uploaded
  **/
  @ApiModelProperty(value = "The date and time the item was uploaded.")
  public LocalDateTime getUploaded() {
    return uploaded;
  }

  public void setUploaded(LocalDateTime uploaded) {
    this.uploaded = uploaded;
  }

  public RootFolder flags(FlagsEnum flags) {
    this.flags = flags;
    return this;
  }

   /**
   * Indicates the item type.
   * @return flags
  **/
  @ApiModelProperty(value = "Indicates the item type.")
  public FlagsEnum getFlags() {
    return flags;
  }

  public void setFlags(FlagsEnum flags) {
    this.flags = flags;
  }

  public RootFolder ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * The owner.
   * @return ownerId
  **/
  @ApiModelProperty(value = "The owner.")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RootFolder rootFolder = (RootFolder) o;
    return Objects.equals(this.path, rootFolder.path) &&
        Objects.equals(this.rootFolderType, rootFolder.rootFolderType) &&
        Objects.equals(this.id, rootFolder.id) &&
        Objects.equals(this.name, rootFolder.name) &&
        Objects.equals(this.size, rootFolder.size) &&
        Objects.equals(this.created, rootFolder.created) &&
        Objects.equals(this.modified, rootFolder.modified) &&
        Objects.equals(this.uploaded, rootFolder.uploaded) &&
        Objects.equals(this.flags, rootFolder.flags) &&
        Objects.equals(this.ownerId, rootFolder.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, rootFolderType, id, name, size, created, modified, uploaded, flags, ownerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RootFolder {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    rootFolderType: ").append(toIndentedString(rootFolderType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    uploaded: ").append(toIndentedString(uploaded)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

