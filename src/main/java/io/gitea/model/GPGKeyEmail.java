/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.17.0-SNAPSHOT
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
 * GPGKeyEmail an email attached to a GPGKey
 */
@ApiModel(description = "GPGKeyEmail an email attached to a GPGKey")

public class GPGKeyEmail {
  @SerializedName("email")
  private String email = null;

  @SerializedName("verified")
  private Boolean verified = null;

  public GPGKeyEmail email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public GPGKeyEmail verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

   /**
   * Get verified
   * @return verified
  **/
  @ApiModelProperty(value = "")
  public Boolean isVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GPGKeyEmail gpGKeyEmail = (GPGKeyEmail) o;
    return Objects.equals(this.email, gpGKeyEmail.email) &&
        Objects.equals(this.verified, gpGKeyEmail.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, verified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GPGKeyEmail {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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

