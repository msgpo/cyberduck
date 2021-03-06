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
import ch.cyberduck.core.sds.io.swagger.client.model.PresignedUrl;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * List of generated presigned URLs
 */
@ApiModel(description = "List of generated presigned URLs")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-08T17:57:49.759+02:00")
public class PresignedUrlList {
  @JsonProperty("urls")
  private List<PresignedUrl> urls = new ArrayList<>();

  public PresignedUrlList urls(List<PresignedUrl> urls) {
    this.urls = urls;
    return this;
  }

  public PresignedUrlList addUrlsItem(PresignedUrl urlsItem) {
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * List of S3 presigned URLs
   * @return urls
  **/
  @ApiModelProperty(required = true, value = "List of S3 presigned URLs")
  public List<PresignedUrl> getUrls() {
    return urls;
  }

  public void setUrls(List<PresignedUrl> urls) {
    this.urls = urls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresignedUrlList presignedUrlList = (PresignedUrlList) o;
    return Objects.equals(this.urls, presignedUrlList.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresignedUrlList {\n");
    
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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

