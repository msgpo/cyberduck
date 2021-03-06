/*
 * DRACOON
 * REST Web Services for DRACOON<br>Version: 4.20.1  - built at: 2020-04-05 23:00:17<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a>
 *
 * OpenAPI spec version: 4.20.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import ch.cyberduck.core.sds.io.swagger.client.model.AuthMethod;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * System information (default language and authentication methods)
 */
@ApiModel(description = "System information (default language and authentication methods)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-08T17:57:49.759+02:00")
public class SystemInfo {
  @JsonProperty("languageDefault")
  private String languageDefault = null;

  @JsonProperty("hideLoginInputFields")
  private Boolean hideLoginInputFields = null;

  @JsonProperty("s3Hosts")
  private List<String> s3Hosts = new ArrayList<>();

  @JsonProperty("s3EnforceDirectUpload")
  private Boolean s3EnforceDirectUpload = null;

  @JsonProperty("authMethods")
  private List<AuthMethod> authMethods = new ArrayList<>();

  public SystemInfo languageDefault(String languageDefault) {
    this.languageDefault = languageDefault;
    return this;
  }

   /**
   * System default language cf. [RFC 5646](https://tools.ietf.org/html/rfc5646)
   * @return languageDefault
  **/
  @ApiModelProperty(example = "de", required = true, value = "System default language cf. [RFC 5646](https://tools.ietf.org/html/rfc5646)")
  public String getLanguageDefault() {
    return languageDefault;
  }

  public void setLanguageDefault(String languageDefault) {
    this.languageDefault = languageDefault;
  }

  public SystemInfo hideLoginInputFields(Boolean hideLoginInputFields) {
    this.hideLoginInputFields = hideLoginInputFields;
    return this;
  }

   /**
   * Defines if login fields should be hidden  [Since version 4.13.0]
   * @return hideLoginInputFields
  **/
  @ApiModelProperty(required = true, value = "Defines if login fields should be hidden  [Since version 4.13.0]")
  public Boolean isHideLoginInputFields() {
    return hideLoginInputFields;
  }

  public void setHideLoginInputFields(Boolean hideLoginInputFields) {
    this.hideLoginInputFields = hideLoginInputFields;
  }

  public SystemInfo s3Hosts(List<String> s3Hosts) {
    this.s3Hosts = s3Hosts;
    return this;
  }

  public SystemInfo addS3HostsItem(String s3HostsItem) {
    this.s3Hosts.add(s3HostsItem);
    return this;
  }

   /**
   * List of S3 Hosts  [Since version 4.14.4]
   * @return s3Hosts
  **/
  @ApiModelProperty(required = true, value = "List of S3 Hosts  [Since version 4.14.4]")
  public List<String> getS3Hosts() {
    return s3Hosts;
  }

  public void setS3Hosts(List<String> s3Hosts) {
    this.s3Hosts = s3Hosts;
  }

  public SystemInfo s3EnforceDirectUpload(Boolean s3EnforceDirectUpload) {
    this.s3EnforceDirectUpload = s3EnforceDirectUpload;
    return this;
  }

   /**
   * Determines whether S3 direct upload is enforced or not  [Since version 4.15.0]
   * @return s3EnforceDirectUpload
  **/
  @ApiModelProperty(required = true, value = "Determines whether S3 direct upload is enforced or not  [Since version 4.15.0]")
  public Boolean isS3EnforceDirectUpload() {
    return s3EnforceDirectUpload;
  }

  public void setS3EnforceDirectUpload(Boolean s3EnforceDirectUpload) {
    this.s3EnforceDirectUpload = s3EnforceDirectUpload;
  }

  public SystemInfo authMethods(List<AuthMethod> authMethods) {
    this.authMethods = authMethods;
    return this;
  }

  public SystemInfo addAuthMethodsItem(AuthMethod authMethodsItem) {
    this.authMethods.add(authMethodsItem);
    return this;
  }

   /**
   * &#x60;DEPRECATED&#x60;: Authentication methods: * &#x60;sql&#x60; * &#x60;active_directory&#x60; * &#x60;radius&#x60; * &#x60;openid&#x60; use &#x60;authData&#x60; instead  [Deprecated since version 4.13.0]
   * @return authMethods
  **/
  @ApiModelProperty(required = true, value = "`DEPRECATED`: Authentication methods: * `sql` * `active_directory` * `radius` * `openid` use `authData` instead  [Deprecated since version 4.13.0]")
  public List<AuthMethod> getAuthMethods() {
    return authMethods;
  }

  public void setAuthMethods(List<AuthMethod> authMethods) {
    this.authMethods = authMethods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemInfo systemInfo = (SystemInfo) o;
    return Objects.equals(this.languageDefault, systemInfo.languageDefault) &&
        Objects.equals(this.hideLoginInputFields, systemInfo.hideLoginInputFields) &&
        Objects.equals(this.s3Hosts, systemInfo.s3Hosts) &&
        Objects.equals(this.s3EnforceDirectUpload, systemInfo.s3EnforceDirectUpload) &&
        Objects.equals(this.authMethods, systemInfo.authMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageDefault, hideLoginInputFields, s3Hosts, s3EnforceDirectUpload, authMethods);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemInfo {\n");
    
    sb.append("    languageDefault: ").append(toIndentedString(languageDefault)).append("\n");
    sb.append("    hideLoginInputFields: ").append(toIndentedString(hideLoginInputFields)).append("\n");
    sb.append("    s3Hosts: ").append(toIndentedString(s3Hosts)).append("\n");
    sb.append("    s3EnforceDirectUpload: ").append(toIndentedString(s3EnforceDirectUpload)).append("\n");
    sb.append("    authMethods: ").append(toIndentedString(authMethods)).append("\n");
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

