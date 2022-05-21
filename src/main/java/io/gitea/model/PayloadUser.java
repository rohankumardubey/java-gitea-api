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
 * PayloadUser represents the author or committer of a commit
 */
@ApiModel(description = "PayloadUser represents the author or committer of a commit")

public class PayloadUser {
  @SerializedName("email")
  private String email = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("username")
  private String username = null;

  public PayloadUser email(String email) {
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

  public PayloadUser name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Full name of the commit author
   * @return name
  **/
  @ApiModelProperty(value = "Full name of the commit author")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PayloadUser username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadUser payloadUser = (PayloadUser) o;
    return Objects.equals(this.email, payloadUser.email) &&
        Objects.equals(this.name, payloadUser.name) &&
        Objects.equals(this.username, payloadUser.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadUser {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

