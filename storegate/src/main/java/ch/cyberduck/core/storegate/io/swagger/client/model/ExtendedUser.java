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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T11:22:03.779+03:00")
public class ExtendedUser {
  /**
   * Permission for common root
   */
  public enum CommonRootPermissionEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_4(4),
    
    NUMBER_99(99),
    
    NUMBER_MINUS_1(-1);

    private Integer value;

    CommonRootPermissionEnum(Integer value) {
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
    public static CommonRootPermissionEnum fromValue(String text) {
      for (CommonRootPermissionEnum b : CommonRootPermissionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("commonRootPermission")
  private CommonRootPermissionEnum commonRootPermission = null;

  @JsonProperty("reservedSpaceSize")
  private Long reservedSpaceSize = null;

  @JsonProperty("friendlyUsername")
  private String friendlyUsername = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isAdmin")
  private Boolean isAdmin = null;

  /**
   * Account status
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

  @JsonProperty("created")
  private LocalDateTime created = null;

  @JsonProperty("lastLogin")
  private LocalDateTime lastLogin = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("company")
  private String company = null;

  public ExtendedUser commonRootPermission(CommonRootPermissionEnum commonRootPermission) {
    this.commonRootPermission = commonRootPermission;
    return this;
  }

   /**
   * Permission for common root
   * @return commonRootPermission
  **/
  @ApiModelProperty(value = "Permission for common root")
  public CommonRootPermissionEnum getCommonRootPermission() {
    return commonRootPermission;
  }

  public void setCommonRootPermission(CommonRootPermissionEnum commonRootPermission) {
    this.commonRootPermission = commonRootPermission;
  }

  public ExtendedUser reservedSpaceSize(Long reservedSpaceSize) {
    this.reservedSpaceSize = reservedSpaceSize;
    return this;
  }

   /**
   * The ReservedSpaceSize
   * @return reservedSpaceSize
  **/
  @ApiModelProperty(value = "The ReservedSpaceSize")
  public Long getReservedSpaceSize() {
    return reservedSpaceSize;
  }

  public void setReservedSpaceSize(Long reservedSpaceSize) {
    this.reservedSpaceSize = reservedSpaceSize;
  }

  public ExtendedUser friendlyUsername(String friendlyUsername) {
    this.friendlyUsername = friendlyUsername;
    return this;
  }

   /**
   * The friendly username
   * @return friendlyUsername
  **/
  @ApiModelProperty(value = "The friendly username")
  public String getFriendlyUsername() {
    return friendlyUsername;
  }

  public void setFriendlyUsername(String friendlyUsername) {
    this.friendlyUsername = friendlyUsername;
  }

  public ExtendedUser id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The user id.
   * @return id
  **/
  @ApiModelProperty(value = "The user id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ExtendedUser isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

   /**
   * Is the user Admin
   * @return isAdmin
  **/
  @ApiModelProperty(value = "Is the user Admin")
  public Boolean isIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  public ExtendedUser flags(FlagsEnum flags) {
    this.flags = flags;
    return this;
  }

   /**
   * Account status
   * @return flags
  **/
  @ApiModelProperty(value = "Account status")
  public FlagsEnum getFlags() {
    return flags;
  }

  public void setFlags(FlagsEnum flags) {
    this.flags = flags;
  }

  public ExtendedUser created(LocalDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * When the account was created.
   * @return created
  **/
  @ApiModelProperty(value = "When the account was created.")
  public LocalDateTime getCreated() {
    return created;
  }

  public void setCreated(LocalDateTime created) {
    this.created = created;
  }

  public ExtendedUser lastLogin(LocalDateTime lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * When the user last was logged in.
   * @return lastLogin
  **/
  @ApiModelProperty(value = "When the user last was logged in.")
  public LocalDateTime getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(LocalDateTime lastLogin) {
    this.lastLogin = lastLogin;
  }

  public ExtendedUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The accounts e-mail address.
   * @return email
  **/
  @ApiModelProperty(value = "The accounts e-mail address.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ExtendedUser username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The account username.
   * @return username
  **/
  @ApiModelProperty(value = "The account username.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public ExtendedUser firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The users name.
   * @return firstName
  **/
  @ApiModelProperty(value = "The users name.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ExtendedUser lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The users surname.
   * @return lastName
  **/
  @ApiModelProperty(value = "The users surname.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ExtendedUser company(String company) {
    this.company = company;
    return this;
  }

   /**
   * The users company.
   * @return company
  **/
  @ApiModelProperty(value = "The users company.")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedUser extendedUser = (ExtendedUser) o;
    return Objects.equals(this.commonRootPermission, extendedUser.commonRootPermission) &&
        Objects.equals(this.reservedSpaceSize, extendedUser.reservedSpaceSize) &&
        Objects.equals(this.friendlyUsername, extendedUser.friendlyUsername) &&
        Objects.equals(this.id, extendedUser.id) &&
        Objects.equals(this.isAdmin, extendedUser.isAdmin) &&
        Objects.equals(this.flags, extendedUser.flags) &&
        Objects.equals(this.created, extendedUser.created) &&
        Objects.equals(this.lastLogin, extendedUser.lastLogin) &&
        Objects.equals(this.email, extendedUser.email) &&
        Objects.equals(this.username, extendedUser.username) &&
        Objects.equals(this.firstName, extendedUser.firstName) &&
        Objects.equals(this.lastName, extendedUser.lastName) &&
        Objects.equals(this.company, extendedUser.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonRootPermission, reservedSpaceSize, friendlyUsername, id, isAdmin, flags, created, lastLogin, email, username, firstName, lastName, company);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedUser {\n");
    
    sb.append("    commonRootPermission: ").append(toIndentedString(commonRootPermission)).append("\n");
    sb.append("    reservedSpaceSize: ").append(toIndentedString(reservedSpaceSize)).append("\n");
    sb.append("    friendlyUsername: ").append(toIndentedString(friendlyUsername)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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

