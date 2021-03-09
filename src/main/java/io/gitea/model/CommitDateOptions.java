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
import org.threeten.bp.OffsetDateTime;

/**
 * CommitDateOptions store dates for GIT_AUTHOR_DATE and GIT_COMMITTER_DATE
 */
@ApiModel(description = "CommitDateOptions store dates for GIT_AUTHOR_DATE and GIT_COMMITTER_DATE")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-09T09:42:23.110Z")
public class CommitDateOptions {
  @SerializedName("author")
  private OffsetDateTime author = null;

  @SerializedName("committer")
  private OffsetDateTime committer = null;

  public CommitDateOptions author(OffsetDateTime author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getAuthor() {
    return author;
  }

  public void setAuthor(OffsetDateTime author) {
    this.author = author;
  }

  public CommitDateOptions committer(OffsetDateTime committer) {
    this.committer = committer;
    return this;
  }

   /**
   * Get committer
   * @return committer
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCommitter() {
    return committer;
  }

  public void setCommitter(OffsetDateTime committer) {
    this.committer = committer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitDateOptions commitDateOptions = (CommitDateOptions) o;
    return Objects.equals(this.author, commitDateOptions.author) &&
        Objects.equals(this.committer, commitDateOptions.committer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, committer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitDateOptions {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
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

