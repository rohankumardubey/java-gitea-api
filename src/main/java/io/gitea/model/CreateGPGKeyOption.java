/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.gitea.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateGPGKeyOption options create user GPG key
 */
@ApiModel(description = "CreateGPGKeyOption options create user GPG key")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-09T09:42:23.110Z")
public class CreateGPGKeyOption {
  @SerializedName("armored_public_key")
  private String armoredPublicKey = null;

  public CreateGPGKeyOption armoredPublicKey(String armoredPublicKey) {
    this.armoredPublicKey = armoredPublicKey;
    return this;
  }

   /**
   * An armored GPG key to add
   * @return armoredPublicKey
  **/
  @ApiModelProperty(required = true, value = "An armored GPG key to add")
  public String getArmoredPublicKey() {
    return armoredPublicKey;
  }

  public void setArmoredPublicKey(String armoredPublicKey) {
    this.armoredPublicKey = armoredPublicKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGPGKeyOption createGPGKeyOption = (CreateGPGKeyOption) o;
    return Objects.equals(this.armoredPublicKey, createGPGKeyOption.armoredPublicKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(armoredPublicKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGPGKeyOption {\n");
    
    sb.append("    armoredPublicKey: ").append(toIndentedString(armoredPublicKey)).append("\n");
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

