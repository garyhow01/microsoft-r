/*
 * DeployRClient
 * Integration technology for deploying R and Python analytics inside web, desktop, mobile, and dashboard applications as well as backend systems. Turn your R or Python scripts into analytics web services, so code can be easily executed by applications running on a secure server.  The core APIs can be grouped into several categories, including: [Authentication](#authentication-apis), [Web Services](#services-management-apis), [Sessions](#session-apis), [Snapshots](#snapshot-apis), [Status](#status-apis), and [Centralized Configuration](#centralized-configuration-apis). 
 *
 * OpenAPI spec version: 9.2.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateSessionResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-28T05:42:17.706Z")
public class CreateSessionResponse {
  @SerializedName("sessionId")
  private String sessionId = null;

  public CreateSessionResponse sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Id of the newly created session.
   * @return sessionId
  **/
  @ApiModelProperty(value = "Id of the newly created session.")
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSessionResponse createSessionResponse = (CreateSessionResponse) o;
    return Objects.equals(this.sessionId, createSessionResponse.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSessionResponse {\n");
    
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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

