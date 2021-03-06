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
 * RADIUS challenge reply
 */
@ApiModel(description = "RADIUS challenge reply")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-08T17:57:49.759+02:00")
public class RadiusChallengeResponse {
  @JsonProperty("code")
  private Integer code = null;

  @JsonProperty("replyState")
  private String replyState = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("replyMessage")
  private String replyMessage = null;

  @JsonProperty("debugInfo")
  private String debugInfo = null;

  @JsonProperty("errorCode")
  private Integer errorCode = null;

  public RadiusChallengeResponse code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * HTTP status code
   * @return code
  **/
  @ApiModelProperty(value = "HTTP status code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public RadiusChallengeResponse replyState(String replyState) {
    this.replyState = replyState;
    return this;
  }

   /**
   * For RADIUS Access-Challenge If a &#x60;replyState&#x60; is returned, it must be included as &#x60;state&#x60; in the following request.
   * @return replyState
  **/
  @ApiModelProperty(value = "For RADIUS Access-Challenge If a `replyState` is returned, it must be included as `state` in the following request.")
  public String getReplyState() {
    return replyState;
  }

  public void setReplyState(String replyState) {
    this.replyState = replyState;
  }

  public RadiusChallengeResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * HTTP status code description
   * @return message
  **/
  @ApiModelProperty(value = "HTTP status code description")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RadiusChallengeResponse replyMessage(String replyMessage) {
    this.replyMessage = replyMessage;
    return this;
  }

   /**
   * RADIUS Reply-Message Instruction how to handle the situation.
   * @return replyMessage
  **/
  @ApiModelProperty(value = "RADIUS Reply-Message Instruction how to handle the situation.")
  public String getReplyMessage() {
    return replyMessage;
  }

  public void setReplyMessage(String replyMessage) {
    this.replyMessage = replyMessage;
  }

  public RadiusChallengeResponse debugInfo(String debugInfo) {
    this.debugInfo = debugInfo;
    return this;
  }

   /**
   * Debug information
   * @return debugInfo
  **/
  @ApiModelProperty(value = "Debug information")
  public String getDebugInfo() {
    return debugInfo;
  }

  public void setDebugInfo(String debugInfo) {
    this.debugInfo = debugInfo;
  }

  public RadiusChallengeResponse errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Error code
   * @return errorCode
  **/
  @ApiModelProperty(value = "Error code")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadiusChallengeResponse radiusChallengeResponse = (RadiusChallengeResponse) o;
    return Objects.equals(this.code, radiusChallengeResponse.code) &&
        Objects.equals(this.replyState, radiusChallengeResponse.replyState) &&
        Objects.equals(this.message, radiusChallengeResponse.message) &&
        Objects.equals(this.replyMessage, radiusChallengeResponse.replyMessage) &&
        Objects.equals(this.debugInfo, radiusChallengeResponse.debugInfo) &&
        Objects.equals(this.errorCode, radiusChallengeResponse.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, replyState, message, replyMessage, debugInfo, errorCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadiusChallengeResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    replyState: ").append(toIndentedString(replyState)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    replyMessage: ").append(toIndentedString(replyMessage)).append("\n");
    sb.append("    debugInfo: ").append(toIndentedString(debugInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

