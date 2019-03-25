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
import ch.cyberduck.core.storegate.io.swagger.client.model.SyncClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T11:22:03.779+03:00")
public class SyncClients {
  @JsonProperty("clients")
  private List<SyncClient> clients = null;

  @JsonProperty("numberOfLicenses")
  private Integer numberOfLicenses = null;

  @JsonProperty("availableLicenses")
  private Integer availableLicenses = null;

  public SyncClients clients(List<SyncClient> clients) {
    this.clients = clients;
    return this;
  }

  public SyncClients addClientsItem(SyncClient clientsItem) {
    if (this.clients == null) {
      this.clients = new ArrayList<>();
    }
    this.clients.add(clientsItem);
    return this;
  }

   /**
   * List of used clients
   * @return clients
  **/
  @ApiModelProperty(value = "List of used clients")
  public List<SyncClient> getClients() {
    return clients;
  }

  public void setClients(List<SyncClient> clients) {
    this.clients = clients;
  }

  public SyncClients numberOfLicenses(Integer numberOfLicenses) {
    this.numberOfLicenses = numberOfLicenses;
    return this;
  }

   /**
   * Number of licenses
   * @return numberOfLicenses
  **/
  @ApiModelProperty(value = "Number of licenses")
  public Integer getNumberOfLicenses() {
    return numberOfLicenses;
  }

  public void setNumberOfLicenses(Integer numberOfLicenses) {
    this.numberOfLicenses = numberOfLicenses;
  }

  public SyncClients availableLicenses(Integer availableLicenses) {
    this.availableLicenses = availableLicenses;
    return this;
  }

   /**
   * Number of available licenses
   * @return availableLicenses
  **/
  @ApiModelProperty(value = "Number of available licenses")
  public Integer getAvailableLicenses() {
    return availableLicenses;
  }

  public void setAvailableLicenses(Integer availableLicenses) {
    this.availableLicenses = availableLicenses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncClients syncClients = (SyncClients) o;
    return Objects.equals(this.clients, syncClients.clients) &&
        Objects.equals(this.numberOfLicenses, syncClients.numberOfLicenses) &&
        Objects.equals(this.availableLicenses, syncClients.availableLicenses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clients, numberOfLicenses, availableLicenses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncClients {\n");
    
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
    sb.append("    numberOfLicenses: ").append(toIndentedString(numberOfLicenses)).append("\n");
    sb.append("    availableLicenses: ").append(toIndentedString(availableLicenses)).append("\n");
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

