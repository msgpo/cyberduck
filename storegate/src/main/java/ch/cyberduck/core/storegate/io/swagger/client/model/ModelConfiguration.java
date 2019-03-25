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

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T11:22:03.779+03:00")
public class ModelConfiguration {
  @JsonProperty("hasMulti")
  private Boolean hasMulti = null;

  @JsonProperty("hasCommon")
  private Boolean hasCommon = null;

  @JsonProperty("hasPermissions")
  private Boolean hasPermissions = null;

  @JsonProperty("hasExtendedPermissions")
  private Boolean hasExtendedPermissions = null;

  @JsonProperty("hasTeamSync")
  private Boolean hasTeamSync = null;

  @JsonProperty("hasGroups")
  private Boolean hasGroups = null;

  @JsonProperty("hasQuota")
  private Boolean hasQuota = null;

  @JsonProperty("hasInspection")
  private Boolean hasInspection = null;

  @JsonProperty("hasBackup")
  private Boolean hasBackup = null;

  @JsonProperty("hasUnlimitedBackup")
  private Boolean hasUnlimitedBackup = null;

  @JsonProperty("hasKlsBackup")
  private Boolean hasKlsBackup = null;

  @JsonProperty("hasMedia")
  private Boolean hasMedia = null;

  @JsonProperty("hasSync")
  private Boolean hasSync = null;

  @JsonProperty("hasAutostore")
  private Boolean hasAutostore = null;

  @JsonProperty("hasOfficeOnline")
  private Boolean hasOfficeOnline = null;

  @JsonProperty("hasRecycleBin")
  private Boolean hasRecycleBin = null;

  @JsonProperty("showHiddenFiles")
  private Boolean showHiddenFiles = null;

  @JsonProperty("showUsername")
  private Boolean showUsername = null;

  @JsonProperty("startPage")
  private String startPage = null;

  @JsonProperty("locale")
  private String locale = null;

  @JsonProperty("theme")
  private String theme = null;

  @JsonProperty("hideSplash")
  private Boolean hideSplash = null;

  /**
   * 
   */
  public enum UserAccountModeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6);

    private Integer value;

    UserAccountModeEnum(Integer value) {
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
    public static UserAccountModeEnum fromValue(String text) {
      for (UserAccountModeEnum b : UserAccountModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("userAccountMode")
  private UserAccountModeEnum userAccountMode = null;

  @JsonProperty("allowShare")
  private Boolean allowShare = null;

  @JsonProperty("hasEvents")
  private Boolean hasEvents = null;

  @JsonProperty("hasVersioning")
  private Boolean hasVersioning = null;

  @JsonProperty("hasWebDav")
  private Boolean hasWebDav = null;

  @JsonProperty("hasWebDavPasswords")
  private Boolean hasWebDavPasswords = null;

  public ModelConfiguration hasMulti(Boolean hasMulti) {
    this.hasMulti = hasMulti;
    return this;
  }

   /**
   * 
   * @return hasMulti
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasMulti() {
    return hasMulti;
  }

  public void setHasMulti(Boolean hasMulti) {
    this.hasMulti = hasMulti;
  }

  public ModelConfiguration hasCommon(Boolean hasCommon) {
    this.hasCommon = hasCommon;
    return this;
  }

   /**
   * 
   * @return hasCommon
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasCommon() {
    return hasCommon;
  }

  public void setHasCommon(Boolean hasCommon) {
    this.hasCommon = hasCommon;
  }

  public ModelConfiguration hasPermissions(Boolean hasPermissions) {
    this.hasPermissions = hasPermissions;
    return this;
  }

   /**
   * 
   * @return hasPermissions
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasPermissions() {
    return hasPermissions;
  }

  public void setHasPermissions(Boolean hasPermissions) {
    this.hasPermissions = hasPermissions;
  }

  public ModelConfiguration hasExtendedPermissions(Boolean hasExtendedPermissions) {
    this.hasExtendedPermissions = hasExtendedPermissions;
    return this;
  }

   /**
   * 
   * @return hasExtendedPermissions
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasExtendedPermissions() {
    return hasExtendedPermissions;
  }

  public void setHasExtendedPermissions(Boolean hasExtendedPermissions) {
    this.hasExtendedPermissions = hasExtendedPermissions;
  }

  public ModelConfiguration hasTeamSync(Boolean hasTeamSync) {
    this.hasTeamSync = hasTeamSync;
    return this;
  }

   /**
   * 
   * @return hasTeamSync
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasTeamSync() {
    return hasTeamSync;
  }

  public void setHasTeamSync(Boolean hasTeamSync) {
    this.hasTeamSync = hasTeamSync;
  }

  public ModelConfiguration hasGroups(Boolean hasGroups) {
    this.hasGroups = hasGroups;
    return this;
  }

   /**
   * 
   * @return hasGroups
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasGroups() {
    return hasGroups;
  }

  public void setHasGroups(Boolean hasGroups) {
    this.hasGroups = hasGroups;
  }

  public ModelConfiguration hasQuota(Boolean hasQuota) {
    this.hasQuota = hasQuota;
    return this;
  }

   /**
   * 
   * @return hasQuota
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasQuota() {
    return hasQuota;
  }

  public void setHasQuota(Boolean hasQuota) {
    this.hasQuota = hasQuota;
  }

  public ModelConfiguration hasInspection(Boolean hasInspection) {
    this.hasInspection = hasInspection;
    return this;
  }

   /**
   * 
   * @return hasInspection
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasInspection() {
    return hasInspection;
  }

  public void setHasInspection(Boolean hasInspection) {
    this.hasInspection = hasInspection;
  }

  public ModelConfiguration hasBackup(Boolean hasBackup) {
    this.hasBackup = hasBackup;
    return this;
  }

   /**
   * 
   * @return hasBackup
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasBackup() {
    return hasBackup;
  }

  public void setHasBackup(Boolean hasBackup) {
    this.hasBackup = hasBackup;
  }

  public ModelConfiguration hasUnlimitedBackup(Boolean hasUnlimitedBackup) {
    this.hasUnlimitedBackup = hasUnlimitedBackup;
    return this;
  }

   /**
   * 
   * @return hasUnlimitedBackup
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasUnlimitedBackup() {
    return hasUnlimitedBackup;
  }

  public void setHasUnlimitedBackup(Boolean hasUnlimitedBackup) {
    this.hasUnlimitedBackup = hasUnlimitedBackup;
  }

  public ModelConfiguration hasKlsBackup(Boolean hasKlsBackup) {
    this.hasKlsBackup = hasKlsBackup;
    return this;
  }

   /**
   * 
   * @return hasKlsBackup
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasKlsBackup() {
    return hasKlsBackup;
  }

  public void setHasKlsBackup(Boolean hasKlsBackup) {
    this.hasKlsBackup = hasKlsBackup;
  }

  public ModelConfiguration hasMedia(Boolean hasMedia) {
    this.hasMedia = hasMedia;
    return this;
  }

   /**
   * 
   * @return hasMedia
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasMedia() {
    return hasMedia;
  }

  public void setHasMedia(Boolean hasMedia) {
    this.hasMedia = hasMedia;
  }

  public ModelConfiguration hasSync(Boolean hasSync) {
    this.hasSync = hasSync;
    return this;
  }

   /**
   * 
   * @return hasSync
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasSync() {
    return hasSync;
  }

  public void setHasSync(Boolean hasSync) {
    this.hasSync = hasSync;
  }

  public ModelConfiguration hasAutostore(Boolean hasAutostore) {
    this.hasAutostore = hasAutostore;
    return this;
  }

   /**
   * 
   * @return hasAutostore
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasAutostore() {
    return hasAutostore;
  }

  public void setHasAutostore(Boolean hasAutostore) {
    this.hasAutostore = hasAutostore;
  }

  public ModelConfiguration hasOfficeOnline(Boolean hasOfficeOnline) {
    this.hasOfficeOnline = hasOfficeOnline;
    return this;
  }

   /**
   * 
   * @return hasOfficeOnline
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasOfficeOnline() {
    return hasOfficeOnline;
  }

  public void setHasOfficeOnline(Boolean hasOfficeOnline) {
    this.hasOfficeOnline = hasOfficeOnline;
  }

  public ModelConfiguration hasRecycleBin(Boolean hasRecycleBin) {
    this.hasRecycleBin = hasRecycleBin;
    return this;
  }

   /**
   * 
   * @return hasRecycleBin
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasRecycleBin() {
    return hasRecycleBin;
  }

  public void setHasRecycleBin(Boolean hasRecycleBin) {
    this.hasRecycleBin = hasRecycleBin;
  }

  public ModelConfiguration showHiddenFiles(Boolean showHiddenFiles) {
    this.showHiddenFiles = showHiddenFiles;
    return this;
  }

   /**
   * 
   * @return showHiddenFiles
  **/
  @ApiModelProperty(value = "")
  public Boolean isShowHiddenFiles() {
    return showHiddenFiles;
  }

  public void setShowHiddenFiles(Boolean showHiddenFiles) {
    this.showHiddenFiles = showHiddenFiles;
  }

  public ModelConfiguration showUsername(Boolean showUsername) {
    this.showUsername = showUsername;
    return this;
  }

   /**
   * 
   * @return showUsername
  **/
  @ApiModelProperty(value = "")
  public Boolean isShowUsername() {
    return showUsername;
  }

  public void setShowUsername(Boolean showUsername) {
    this.showUsername = showUsername;
  }

  public ModelConfiguration startPage(String startPage) {
    this.startPage = startPage;
    return this;
  }

   /**
   * 
   * @return startPage
  **/
  @ApiModelProperty(value = "")
  public String getStartPage() {
    return startPage;
  }

  public void setStartPage(String startPage) {
    this.startPage = startPage;
  }

  public ModelConfiguration locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * 
   * @return locale
  **/
  @ApiModelProperty(value = "")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public ModelConfiguration theme(String theme) {
    this.theme = theme;
    return this;
  }

   /**
   * 
   * @return theme
  **/
  @ApiModelProperty(value = "")
  public String getTheme() {
    return theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }

  public ModelConfiguration hideSplash(Boolean hideSplash) {
    this.hideSplash = hideSplash;
    return this;
  }

   /**
   * 
   * @return hideSplash
  **/
  @ApiModelProperty(value = "")
  public Boolean isHideSplash() {
    return hideSplash;
  }

  public void setHideSplash(Boolean hideSplash) {
    this.hideSplash = hideSplash;
  }

  public ModelConfiguration userAccountMode(UserAccountModeEnum userAccountMode) {
    this.userAccountMode = userAccountMode;
    return this;
  }

   /**
   * 
   * @return userAccountMode
  **/
  @ApiModelProperty(value = "")
  public UserAccountModeEnum getUserAccountMode() {
    return userAccountMode;
  }

  public void setUserAccountMode(UserAccountModeEnum userAccountMode) {
    this.userAccountMode = userAccountMode;
  }

  public ModelConfiguration allowShare(Boolean allowShare) {
    this.allowShare = allowShare;
    return this;
  }

   /**
   * Share allowed for all users
   * @return allowShare
  **/
  @ApiModelProperty(value = "Share allowed for all users")
  public Boolean isAllowShare() {
    return allowShare;
  }

  public void setAllowShare(Boolean allowShare) {
    this.allowShare = allowShare;
  }

  public ModelConfiguration hasEvents(Boolean hasEvents) {
    this.hasEvents = hasEvents;
    return this;
  }

   /**
   * 
   * @return hasEvents
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasEvents() {
    return hasEvents;
  }

  public void setHasEvents(Boolean hasEvents) {
    this.hasEvents = hasEvents;
  }

  public ModelConfiguration hasVersioning(Boolean hasVersioning) {
    this.hasVersioning = hasVersioning;
    return this;
  }

   /**
   * 
   * @return hasVersioning
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasVersioning() {
    return hasVersioning;
  }

  public void setHasVersioning(Boolean hasVersioning) {
    this.hasVersioning = hasVersioning;
  }

  public ModelConfiguration hasWebDav(Boolean hasWebDav) {
    this.hasWebDav = hasWebDav;
    return this;
  }

   /**
   * 
   * @return hasWebDav
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasWebDav() {
    return hasWebDav;
  }

  public void setHasWebDav(Boolean hasWebDav) {
    this.hasWebDav = hasWebDav;
  }

  public ModelConfiguration hasWebDavPasswords(Boolean hasWebDavPasswords) {
    this.hasWebDavPasswords = hasWebDavPasswords;
    return this;
  }

   /**
   * 
   * @return hasWebDavPasswords
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasWebDavPasswords() {
    return hasWebDavPasswords;
  }

  public void setHasWebDavPasswords(Boolean hasWebDavPasswords) {
    this.hasWebDavPasswords = hasWebDavPasswords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelConfiguration _configuration = (ModelConfiguration) o;
    return Objects.equals(this.hasMulti, _configuration.hasMulti) &&
        Objects.equals(this.hasCommon, _configuration.hasCommon) &&
        Objects.equals(this.hasPermissions, _configuration.hasPermissions) &&
        Objects.equals(this.hasExtendedPermissions, _configuration.hasExtendedPermissions) &&
        Objects.equals(this.hasTeamSync, _configuration.hasTeamSync) &&
        Objects.equals(this.hasGroups, _configuration.hasGroups) &&
        Objects.equals(this.hasQuota, _configuration.hasQuota) &&
        Objects.equals(this.hasInspection, _configuration.hasInspection) &&
        Objects.equals(this.hasBackup, _configuration.hasBackup) &&
        Objects.equals(this.hasUnlimitedBackup, _configuration.hasUnlimitedBackup) &&
        Objects.equals(this.hasKlsBackup, _configuration.hasKlsBackup) &&
        Objects.equals(this.hasMedia, _configuration.hasMedia) &&
        Objects.equals(this.hasSync, _configuration.hasSync) &&
        Objects.equals(this.hasAutostore, _configuration.hasAutostore) &&
        Objects.equals(this.hasOfficeOnline, _configuration.hasOfficeOnline) &&
        Objects.equals(this.hasRecycleBin, _configuration.hasRecycleBin) &&
        Objects.equals(this.showHiddenFiles, _configuration.showHiddenFiles) &&
        Objects.equals(this.showUsername, _configuration.showUsername) &&
        Objects.equals(this.startPage, _configuration.startPage) &&
        Objects.equals(this.locale, _configuration.locale) &&
        Objects.equals(this.theme, _configuration.theme) &&
        Objects.equals(this.hideSplash, _configuration.hideSplash) &&
        Objects.equals(this.userAccountMode, _configuration.userAccountMode) &&
        Objects.equals(this.allowShare, _configuration.allowShare) &&
        Objects.equals(this.hasEvents, _configuration.hasEvents) &&
        Objects.equals(this.hasVersioning, _configuration.hasVersioning) &&
        Objects.equals(this.hasWebDav, _configuration.hasWebDav) &&
        Objects.equals(this.hasWebDavPasswords, _configuration.hasWebDavPasswords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMulti, hasCommon, hasPermissions, hasExtendedPermissions, hasTeamSync, hasGroups, hasQuota, hasInspection, hasBackup, hasUnlimitedBackup, hasKlsBackup, hasMedia, hasSync, hasAutostore, hasOfficeOnline, hasRecycleBin, showHiddenFiles, showUsername, startPage, locale, theme, hideSplash, userAccountMode, allowShare, hasEvents, hasVersioning, hasWebDav, hasWebDavPasswords);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelConfiguration {\n");
    
    sb.append("    hasMulti: ").append(toIndentedString(hasMulti)).append("\n");
    sb.append("    hasCommon: ").append(toIndentedString(hasCommon)).append("\n");
    sb.append("    hasPermissions: ").append(toIndentedString(hasPermissions)).append("\n");
    sb.append("    hasExtendedPermissions: ").append(toIndentedString(hasExtendedPermissions)).append("\n");
    sb.append("    hasTeamSync: ").append(toIndentedString(hasTeamSync)).append("\n");
    sb.append("    hasGroups: ").append(toIndentedString(hasGroups)).append("\n");
    sb.append("    hasQuota: ").append(toIndentedString(hasQuota)).append("\n");
    sb.append("    hasInspection: ").append(toIndentedString(hasInspection)).append("\n");
    sb.append("    hasBackup: ").append(toIndentedString(hasBackup)).append("\n");
    sb.append("    hasUnlimitedBackup: ").append(toIndentedString(hasUnlimitedBackup)).append("\n");
    sb.append("    hasKlsBackup: ").append(toIndentedString(hasKlsBackup)).append("\n");
    sb.append("    hasMedia: ").append(toIndentedString(hasMedia)).append("\n");
    sb.append("    hasSync: ").append(toIndentedString(hasSync)).append("\n");
    sb.append("    hasAutostore: ").append(toIndentedString(hasAutostore)).append("\n");
    sb.append("    hasOfficeOnline: ").append(toIndentedString(hasOfficeOnline)).append("\n");
    sb.append("    hasRecycleBin: ").append(toIndentedString(hasRecycleBin)).append("\n");
    sb.append("    showHiddenFiles: ").append(toIndentedString(showHiddenFiles)).append("\n");
    sb.append("    showUsername: ").append(toIndentedString(showUsername)).append("\n");
    sb.append("    startPage: ").append(toIndentedString(startPage)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    hideSplash: ").append(toIndentedString(hideSplash)).append("\n");
    sb.append("    userAccountMode: ").append(toIndentedString(userAccountMode)).append("\n");
    sb.append("    allowShare: ").append(toIndentedString(allowShare)).append("\n");
    sb.append("    hasEvents: ").append(toIndentedString(hasEvents)).append("\n");
    sb.append("    hasVersioning: ").append(toIndentedString(hasVersioning)).append("\n");
    sb.append("    hasWebDav: ").append(toIndentedString(hasWebDav)).append("\n");
    sb.append("    hasWebDavPasswords: ").append(toIndentedString(hasWebDavPasswords)).append("\n");
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

