/*
 * rxLogitService
 * Test rxLogit web service
 *
 * OpenAPI spec version: 1.0
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
 * StartBatchExecutionResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-04T00:23:21.050Z")
public class StartBatchExecutionResponse {
  @SerializedName("batchExecutionId")
  private String batchExecutionId = null;

  public StartBatchExecutionResponse batchExecutionId(String batchExecutionId) {
    this.batchExecutionId = batchExecutionId;
    return this;
  }

   /**
   * Id of the asynchronous execution.
   * @return batchExecutionId
  **/
  @ApiModelProperty(value = "Id of the asynchronous execution.")
  public String getBatchExecutionId() {
    return batchExecutionId;
  }

  public void setBatchExecutionId(String batchExecutionId) {
    this.batchExecutionId = batchExecutionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartBatchExecutionResponse startBatchExecutionResponse = (StartBatchExecutionResponse) o;
    return Objects.equals(this.batchExecutionId, startBatchExecutionResponse.batchExecutionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchExecutionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartBatchExecutionResponse {\n");
    
    sb.append("    batchExecutionId: ").append(toIndentedString(batchExecutionId)).append("\n");
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

