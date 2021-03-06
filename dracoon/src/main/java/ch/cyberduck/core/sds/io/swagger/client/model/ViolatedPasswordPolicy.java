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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Violated password policy information
 */
@ApiModel(description = "Violated password policy information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-08T17:57:49.759+02:00")
public class ViolatedPasswordPolicy {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("message")
  private String message = null;

  public ViolatedPasswordPolicy name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the violated password policy
   * @return name
  **/
  @ApiModelProperty(value = "Name of the violated password policy")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ViolatedPasswordPolicy message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Message from password validator
   * @return message
  **/
  @ApiModelProperty(value = "Message from password validator")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViolatedPasswordPolicy violatedPasswordPolicy = (ViolatedPasswordPolicy) o;
    return Objects.equals(this.name, violatedPasswordPolicy.name) &&
        Objects.equals(this.message, violatedPasswordPolicy.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViolatedPasswordPolicy {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

