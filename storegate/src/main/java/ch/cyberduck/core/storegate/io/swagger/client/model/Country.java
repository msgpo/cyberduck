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
public class Country {
  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("vatNumberValidation")
  private String vatNumberValidation = null;

  public Country countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * 
   * @return countryCode
  **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Country name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Country vatNumberValidation(String vatNumberValidation) {
    this.vatNumberValidation = vatNumberValidation;
    return this;
  }

   /**
   * 
   * @return vatNumberValidation
  **/
  @ApiModelProperty(value = "")
  public String getVatNumberValidation() {
    return vatNumberValidation;
  }

  public void setVatNumberValidation(String vatNumberValidation) {
    this.vatNumberValidation = vatNumberValidation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Country country = (Country) o;
    return Objects.equals(this.countryCode, country.countryCode) &&
        Objects.equals(this.name, country.name) &&
        Objects.equals(this.vatNumberValidation, country.vatNumberValidation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, name, vatNumberValidation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Country {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vatNumberValidation: ").append(toIndentedString(vatNumberValidation)).append("\n");
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

