package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.NewUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-02T23:49:11.300-08:00")
public class NewUsersSummary   {
  
  private java.util.List<NewUser> newUsers = new java.util.ArrayList<NewUser>();

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("newUsers")
  public java.util.List<NewUser> getNewUsers() {
    return newUsers;
  }
  public void setNewUsers(java.util.List<NewUser> newUsers) {
    this.newUsers = newUsers;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewUsersSummary newUsersSummary = (NewUsersSummary) o;

    return true && Objects.equals(newUsers, newUsersSummary.newUsers)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(newUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUsersSummary {\n");
    
    sb.append("    newUsers: ").append(toIndentedString(newUsers)).append("\n");
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

