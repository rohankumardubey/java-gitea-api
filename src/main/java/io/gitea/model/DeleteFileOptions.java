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
import io.gitea.model.CommitDateOptions;
import io.gitea.model.Identity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeleteFileOptions options for deleting files (used for other File structs below) Note: &#x60;author&#x60; and &#x60;committer&#x60; are optional (if only one is given, it will be used for the other, otherwise the authenticated user will be used)
 */
@ApiModel(description = "DeleteFileOptions options for deleting files (used for other File structs below) Note: `author` and `committer` are optional (if only one is given, it will be used for the other, otherwise the authenticated user will be used)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-09T09:42:23.110Z")
public class DeleteFileOptions {
  @SerializedName("author")
  private Identity author = null;

  @SerializedName("branch")
  private String branch = null;

  @SerializedName("committer")
  private Identity committer = null;

  @SerializedName("dates")
  private CommitDateOptions dates = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("new_branch")
  private String newBranch = null;

  @SerializedName("sha")
  private String sha = null;

  public DeleteFileOptions author(Identity author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(value = "")
  public Identity getAuthor() {
    return author;
  }

  public void setAuthor(Identity author) {
    this.author = author;
  }

  public DeleteFileOptions branch(String branch) {
    this.branch = branch;
    return this;
  }

   /**
   * branch (optional) to base this file from. if not given, the default branch is used
   * @return branch
  **/
  @ApiModelProperty(value = "branch (optional) to base this file from. if not given, the default branch is used")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public DeleteFileOptions committer(Identity committer) {
    this.committer = committer;
    return this;
  }

   /**
   * Get committer
   * @return committer
  **/
  @ApiModelProperty(value = "")
  public Identity getCommitter() {
    return committer;
  }

  public void setCommitter(Identity committer) {
    this.committer = committer;
  }

  public DeleteFileOptions dates(CommitDateOptions dates) {
    this.dates = dates;
    return this;
  }

   /**
   * Get dates
   * @return dates
  **/
  @ApiModelProperty(value = "")
  public CommitDateOptions getDates() {
    return dates;
  }

  public void setDates(CommitDateOptions dates) {
    this.dates = dates;
  }

  public DeleteFileOptions message(String message) {
    this.message = message;
    return this;
  }

   /**
   * message (optional) for the commit of this file. if not supplied, a default message will be used
   * @return message
  **/
  @ApiModelProperty(value = "message (optional) for the commit of this file. if not supplied, a default message will be used")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public DeleteFileOptions newBranch(String newBranch) {
    this.newBranch = newBranch;
    return this;
  }

   /**
   * new_branch (optional) will make a new branch from &#x60;branch&#x60; before creating the file
   * @return newBranch
  **/
  @ApiModelProperty(value = "new_branch (optional) will make a new branch from `branch` before creating the file")
  public String getNewBranch() {
    return newBranch;
  }

  public void setNewBranch(String newBranch) {
    this.newBranch = newBranch;
  }

  public DeleteFileOptions sha(String sha) {
    this.sha = sha;
    return this;
  }

   /**
   * sha is the SHA for the file that already exists
   * @return sha
  **/
  @ApiModelProperty(required = true, value = "sha is the SHA for the file that already exists")
  public String getSha() {
    return sha;
  }

  public void setSha(String sha) {
    this.sha = sha;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteFileOptions deleteFileOptions = (DeleteFileOptions) o;
    return Objects.equals(this.author, deleteFileOptions.author) &&
        Objects.equals(this.branch, deleteFileOptions.branch) &&
        Objects.equals(this.committer, deleteFileOptions.committer) &&
        Objects.equals(this.dates, deleteFileOptions.dates) &&
        Objects.equals(this.message, deleteFileOptions.message) &&
        Objects.equals(this.newBranch, deleteFileOptions.newBranch) &&
        Objects.equals(this.sha, deleteFileOptions.sha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, branch, committer, dates, message, newBranch, sha);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteFileOptions {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    newBranch: ").append(toIndentedString(newBranch)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
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
