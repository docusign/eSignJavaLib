package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.SettingsMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserAccountManagementGranularInformation.
 *
 */

public class UserAccountManagementGranularInformation {
  @JsonProperty("canManageAccountSecuritySettings")
  private String canManageAccountSecuritySettings = null;

  @JsonProperty("canManageAccountSecuritySettingsMetadata")
  private SettingsMetadata canManageAccountSecuritySettingsMetadata = null;

  @JsonProperty("canManageAccountSettings")
  private String canManageAccountSettings = null;

  @JsonProperty("canManageAccountSettingsMetadata")
  private SettingsMetadata canManageAccountSettingsMetadata = null;

  @JsonProperty("canManageAdmins")
  private String canManageAdmins = null;

  @JsonProperty("canManageAdminsMetadata")
  private SettingsMetadata canManageAdminsMetadata = null;

  @JsonProperty("canManageDocumentRetention")
  private String canManageDocumentRetention = null;

  @JsonProperty("canManageDocumentRetentionMetadata")
  private SettingsMetadata canManageDocumentRetentionMetadata = null;

  @JsonProperty("canManageEnvelopeTransfer")
  private String canManageEnvelopeTransfer = null;

  @JsonProperty("canManageEnvelopeTransferMetadata")
  private SettingsMetadata canManageEnvelopeTransferMetadata = null;

  @JsonProperty("canManageGroups")
  private String canManageGroups = null;

  @JsonProperty("canManageGroupsMetadata")
  private SettingsMetadata canManageGroupsMetadata = null;

  @JsonProperty("canManageReporting")
  private String canManageReporting = null;

  @JsonProperty("canManageReportingMetadata")
  private SettingsMetadata canManageReportingMetadata = null;

  @JsonProperty("canManageSharing")
  private String canManageSharing = null;

  @JsonProperty("canManageSharingMetadata")
  private SettingsMetadata canManageSharingMetadata = null;

  @JsonProperty("canManageSigningGroups")
  private String canManageSigningGroups = null;

  @JsonProperty("canManageSigningGroupsMetadata")
  private SettingsMetadata canManageSigningGroupsMetadata = null;

  @JsonProperty("canManageUsers")
  private String canManageUsers = null;

  @JsonProperty("canManageUsersMetadata")
  private SettingsMetadata canManageUsersMetadata = null;

  @JsonProperty("canViewUsers")
  private String canViewUsers = null;

  @JsonProperty("canViewUsersMetadata")
  private SettingsMetadata canViewUsersMetadata = null;


  /**
   * canManageAccountSecuritySettings.
   *
   * @return UserAccountManagementGranularInformation
   **/
  public UserAccountManagementGranularInformation canManageAccountSecuritySettings(String canManageAccountSecuritySettings) {
    this.canManageAccountSecuritySettings = canManageAccountSecuritySettings;
    return this;
  }

  /**
   * .
   * @return canManageAccountSecuritySettings
   **/
  @ApiModelProperty(value = "")
  public String getCanManageAccountSecuritySettings() {
    return canManageAccountSecuritySettings;
  }

  /**
   * setCanManageAccountSecuritySettings.
   **/
  public void setCanManageAccountSecuritySettings(String canManageAccountSecuritySettings) {
    this.canManageAccountSecuritySettings = canManageAccountSecuritySettings;
  }


  /**
   * canManageAccountSecuritySettingsMetadata.
   *
   * @return UserAccountManagementGranularInformation
   **/
  public UserAccountManagementGranularInformation canManageAccountSecuritySettingsMetadata(SettingsMetadata canManageAccountSecuritySettingsMetadata) {
    this.canManageAccountSecuritySettingsMetadata = canManageAccountSecuritySettingsMetadata;
    return this;
  }

  /**
   * Get canManageAccountSecuritySettingsMetadata.
   * @return canManageAccountSecuritySettingsMetadata
   **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanManageAccountSecuritySettingsMetadata() {
    return canManageAccountSecuritySettingsMetadata;
  }

  /**
   * setCanManageAccountSecuritySettingsMetadata.
   **/
  public void setCanManageAccountSecuritySettingsMetadata(SettingsMetadata canManageAccountSecuritySettingsMetadata) {
    this.canManageAccountSecuritySettingsMetadata = canManageAccountSecuritySettingsMetadata;
  }


  /**
   * canManageAccountSettings.
   *
   * @return UserAccountManagementGranularInformation
   **/
  public UserAccountManagementGranularInformation canManageAccountSettings(String canManageAccountSettings) {
    this.canManageAccountSettings = canManageAccountSettings;
    return this;
  }

  /**
   * .
   * @return canManageAccountSettings
   **/
  @ApiModelProperty(value = "")
  public String getCanManageAccountSettings() {
    return canManageAccountSettings;
  }

  /**
   * setCanManageAccountSettings.
   **/
  public void setCanManageAccountSettings(String canManageAccountSettings) {
    this.canManageAccountSettings = canManageAccountSettings;
  }


  /**
   * canManageAccountSettingsMetadata.
   *
   * @return UserAccountManagementGranularInformation
   **/
  public UserAccountManagementGranularInformation canManageAccountSettingsMetadata(SettingsMetadata canManageAccountSettingsMetadata) {
    this.canManageAccountSettingsMetadata = canManageAccountSettingsMetadata;
    return this;
  }

  /**
   * Get canManageAccountSettingsMetadata.
   * @return canManageAccountSettingsMetadata
   **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanManageAccountSettingsMetadata() {
    return canManageAccountSettingsMetadata;
  }

  /**
   * setCanManageAccountSettingsMetadata.
   **/
  public void setCanManageAccountSettingsMetadata(SettingsMetadata canManageAccountSettingsMetadata) {
    this.canManageAccountSettingsMetadata = canManageAccountSettingsMetadata;
  }


  /**
   * canManageAdmins.
   *
   * @return UserAccountManagementGranularInformation
   **/
  public UserAccountManagementGranularInformation canManageAdmins(String canManageAdmins) {
    this.canManageAdmins = canManageAdmins;
    return this;
  }

  /**
   * .
   * @return canManageAdmins
   **/
  @ApiModelProperty(value = "")
  public String getCanManageAdmins() {
    return canManageAdmins;
  }

  /**
   * setCanManageAdmins.
   **/
  public void setCanManageAdmins(String canManageAdmins) {
    this.canManageAdmins = canManageAdmins;
  }


  /**
   * canManageAdminsMetadata.
   *
   * @return UserAccountManagementGranularInformation
   **/
  public UserAccountManagementGranularInformation canManageAdminsMetadata(SettingsMetadata canManageAdminsMetadata) {
    this.canManageAdminsMetadata = canManageAdminsMetadata;
    return this;
  }

  /**
   * Get canManageAdminsMetadata.
   * @return canManageAdminsMetadata
   **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanManageAdminsMetadata() {
    return canManageAdminsMetadata;
  }

  /**
   * setCanManageAdminsMetadata.
   **/
  public void setCanManageAdminsMetadata(SettingsMetadata canManageAdminsMetadata) {
    this.canManageAdminsMetadata = canManageAdminsMetadata;
  }


  /**
   * canManageDocumentRetention.
   *
   * @return UserAccountManagementGranularInformation
   **/
  public UserAccountManagementGranularInformation canManageDocumentRetention(String canManageDocumentRetention) {
    this.canManageDocumentRetention = canManageDocumentRetention;
    return this;
  }

  /**
   * .
   * @return canManageDocumentRetention
   **/
  @ApiModelProperty(value = "")
  public String getCanManageDocumentRetention() {
    return canManageDocumentRetention;
  }

  /**
   * setCanManageDocumentRetention.
   **/
  public void setCanManageDocumentRetention(String canManageDocumentRetention) {
    this.canManageDocumentRetention = canManageDocumentRetention;
  }


  /**
   * canManageDocumentRetentionMetadata.
   *
   * @return UserAccountManagementGranularInformation
   **/
  public UserAccountManagementGranularInformation canManageDocumentRetentionMetadata(SettingsMetadata canManageDocumentRetentionMetadata) {
    this.canManageDocumentRetentionMetadata = canManageDocumentRetentionMetadata;
    return this;
  }

  /**
   * Get canManageDocumentRetentionMetadata.
   * @return canManageDocumentRetentionMetadata
   **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanManageDocumentRetentionMetadata() {
    return canManageDocumentRetentionMetadata;
  }

  /**
   * setCanManageDocumentRetentionMetadata.
   **/
  public void setCanManageDocumentRetentionMetadata(SettingsMetadata canManageDocumentRetentionMetadata) {
    this.canManageDocumentRetentionMetadata = canManageDocumentRetentionMetadata;
  }


  /**
   * canManageEnvelopeTransfer.
   *
   * @return UserAccountManagementGranularInformation
   **/
  public UserAccountManagementGranularInformation canManageEnvelopeTransfer(String canManageEnvelopeTransfer) {
    this.canManageEnvelopeTransfer = canManageEnvelopeTransfer;
    return this;
  }

  /**
   * .
   * @return canManageEnvelopeTransfer
   **/
  @ApiModelProperty(value = "")
  public String getCanManageEnvelopeTransfer() {
    return canManageEnvelopeTransfer;
  }

  /**
   * setCanManageEnvelopeTransfer.
   **/
  public void setCanManageEnvelopeTransfer(String canManageEnvelopeTransfer) {
    this.canManageEnvelopeTransfer = canManageEnvelopeTransfer;
  }


  /**
   * canManageEnvelopeTransferMetadata.
   *
   * @return UserAccountManagementGranularInformation
   **/
  public UserAccountManagementGranularInformation canManageEnvelopeTransferMetadata(SettingsMetadata canManageEnvelopeTransferMetadata) {
    this.canManageEnvelopeTransferMetadata = canManageEnvelopeTransferMetadata;
    return this;
  }

  /**
   * Get canManageEnvelopeTransferMetadata.
   * @return canManageEnvelopeTransferMetadata
   **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanManageEnvelopeTransferMetadata() {
    return canManageEnvelopeTransferMetadata;
  }

  /**
   * setCanManageEnvelopeTransferMetadata.
   **/
  public void setCanManageEnvelopeTransferMetadata(SettingsMetadata canManageEnvelopeTransferMetadata) {
    this.canManageEnvelopeTransferMetadata = canManageEnvelopeTransferMetadata;
  }


  /**
   * canManageGroups.
   *
   * @return UserAccountManagementGranularInformation
   **/
  public UserAccountManagementGranularInformation canManageGroups(String canManageGroups) {
    this.canManageGroups = canManageGroups;
    return this;
  }

  /**
   * .
   * @return canManageGroups
   **/
  @ApiModelProperty(value = "")
  public String getCanManageGroups() {
    return canManageGroups;
  }

  /**
   * setCanManageGroups.
   **/
  public void setCanManageGroups(String canManageGroups) {
    this.canManageGroups = canManageGroups;
  }


  /**
   * canManageGroupsMetadata.
   *
   * @return UserAccountManagementGranularInformation
   **/
  public UserAccountManagementGranularInformation canManageGroupsMetadata(SettingsMetadata canManageGroupsMetadata) {
    this.canManageGroupsMetadata = canManageGroupsMetadata;
    return this;
  }

  /**
   * Get canManageGroupsMetadata.
   * @return canManageGroupsMetadata
   **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanManageGroupsMetadata() {
    return canManageGroupsMetadata;
  }

  /**
   * setCanManageGroupsMetadata.
   **/
  public void setCanManageGroupsMetadata(SettingsMetadata canManageGroupsMetadata) {
    this.canManageGroupsMetadata = canManageGroupsMetadata;
  }


  /**
   * canManageReporting.
   *
   * @return UserAccountManagementGranularInformation
   **/
  public UserAccountManagementGranularInformation canManageReporting(String canManageReporting) {
    this.canManageReporting = canManageReporting;
    return this;
  }

  /**
   * .
   * @return canManageReporting
   **/
  @ApiModelProperty(value = "")
  public String getCanManageReporting() {
    return canManageReporting;
  }

  /**
   * setCanManageReporting.
   **/
  public void setCanManageReporting(String canManageReporting) {
    this.canManageReporting = canManageReporting;
  }


  /**
   * canManageReportingMetadata.
   *
   * @return UserAccountManagementGranularInformation
   **/
  public UserAccountManagementGranularInformation canManageReportingMetadata(SettingsMetadata canManageReportingMetadata) {
    this.canManageReportingMetadata = canManageReportingMetadata;
    return this;
  }

  /**
   * Get canManageReportingMetadata.
   * @return canManageReportingMetadata
   **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanManageReportingMetadata() {
    return canManageReportingMetadata;
  }

  /**
   * setCanManageReportingMetadata.
   **/
  public void setCanManageReportingMetadata(SettingsMetadata canManageReportingMetadata) {
    this.canManageReportingMetadata = canManageReportingMetadata;
  }


  /**
   * canManageSharing.
   *
   * @return UserAccountManagementGranularInformation
   **/
  public UserAccountManagementGranularInformation canManageSharing(String canManageSharing) {
    this.canManageSharing = canManageSharing;
    return this;
  }

  /**
   * .
   * @return canManageSharing
   **/
  @ApiModelProperty(value = "")
  public String getCanManageSharing() {
    return canManageSharing;
  }

  /**
   * setCanManageSharing.
   **/
  public void setCanManageSharing(String canManageSharing) {
    this.canManageSharing = canManageSharing;
  }


  /**
   * canManageSharingMetadata.
   *
   * @return UserAccountManagementGranularInformation
   **/
  public UserAccountManagementGranularInformation canManageSharingMetadata(SettingsMetadata canManageSharingMetadata) {
    this.canManageSharingMetadata = canManageSharingMetadata;
    return this;
  }

  /**
   * Get canManageSharingMetadata.
   * @return canManageSharingMetadata
   **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanManageSharingMetadata() {
    return canManageSharingMetadata;
  }

  /**
   * setCanManageSharingMetadata.
   **/
  public void setCanManageSharingMetadata(SettingsMetadata canManageSharingMetadata) {
    this.canManageSharingMetadata = canManageSharingMetadata;
  }


  /**
   * canManageSigningGroups.
   *
   * @return UserAccountManagementGranularInformation
   **/
  public UserAccountManagementGranularInformation canManageSigningGroups(String canManageSigningGroups) {
    this.canManageSigningGroups = canManageSigningGroups;
    return this;
  }

  /**
   * .
   * @return canManageSigningGroups
   **/
  @ApiModelProperty(value = "")
  public String getCanManageSigningGroups() {
    return canManageSigningGroups;
  }

  /**
   * setCanManageSigningGroups.
   **/
  public void setCanManageSigningGroups(String canManageSigningGroups) {
    this.canManageSigningGroups = canManageSigningGroups;
  }


  /**
   * canManageSigningGroupsMetadata.
   *
   * @return UserAccountManagementGranularInformation
   **/
  public UserAccountManagementGranularInformation canManageSigningGroupsMetadata(SettingsMetadata canManageSigningGroupsMetadata) {
    this.canManageSigningGroupsMetadata = canManageSigningGroupsMetadata;
    return this;
  }

  /**
   * Get canManageSigningGroupsMetadata.
   * @return canManageSigningGroupsMetadata
   **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanManageSigningGroupsMetadata() {
    return canManageSigningGroupsMetadata;
  }

  /**
   * setCanManageSigningGroupsMetadata.
   **/
  public void setCanManageSigningGroupsMetadata(SettingsMetadata canManageSigningGroupsMetadata) {
    this.canManageSigningGroupsMetadata = canManageSigningGroupsMetadata;
  }


  /**
   * canManageUsers.
   *
   * @return UserAccountManagementGranularInformation
   **/
  public UserAccountManagementGranularInformation canManageUsers(String canManageUsers) {
    this.canManageUsers = canManageUsers;
    return this;
  }

  /**
   * .
   * @return canManageUsers
   **/
  @ApiModelProperty(value = "")
  public String getCanManageUsers() {
    return canManageUsers;
  }

  /**
   * setCanManageUsers.
   **/
  public void setCanManageUsers(String canManageUsers) {
    this.canManageUsers = canManageUsers;
  }


  /**
   * canManageUsersMetadata.
   *
   * @return UserAccountManagementGranularInformation
   **/
  public UserAccountManagementGranularInformation canManageUsersMetadata(SettingsMetadata canManageUsersMetadata) {
    this.canManageUsersMetadata = canManageUsersMetadata;
    return this;
  }

  /**
   * Get canManageUsersMetadata.
   * @return canManageUsersMetadata
   **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanManageUsersMetadata() {
    return canManageUsersMetadata;
  }

  /**
   * setCanManageUsersMetadata.
   **/
  public void setCanManageUsersMetadata(SettingsMetadata canManageUsersMetadata) {
    this.canManageUsersMetadata = canManageUsersMetadata;
  }


  /**
   * canViewUsers.
   *
   * @return UserAccountManagementGranularInformation
   **/
  public UserAccountManagementGranularInformation canViewUsers(String canViewUsers) {
    this.canViewUsers = canViewUsers;
    return this;
  }

  /**
   * .
   * @return canViewUsers
   **/
  @ApiModelProperty(value = "")
  public String getCanViewUsers() {
    return canViewUsers;
  }

  /**
   * setCanViewUsers.
   **/
  public void setCanViewUsers(String canViewUsers) {
    this.canViewUsers = canViewUsers;
  }


  /**
   * canViewUsersMetadata.
   *
   * @return UserAccountManagementGranularInformation
   **/
  public UserAccountManagementGranularInformation canViewUsersMetadata(SettingsMetadata canViewUsersMetadata) {
    this.canViewUsersMetadata = canViewUsersMetadata;
    return this;
  }

  /**
   * Get canViewUsersMetadata.
   * @return canViewUsersMetadata
   **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanViewUsersMetadata() {
    return canViewUsersMetadata;
  }

  /**
   * setCanViewUsersMetadata.
   **/
  public void setCanViewUsersMetadata(SettingsMetadata canViewUsersMetadata) {
    this.canViewUsersMetadata = canViewUsersMetadata;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAccountManagementGranularInformation userAccountManagementGranularInformation = (UserAccountManagementGranularInformation) o;
    return Objects.equals(this.canManageAccountSecuritySettings, userAccountManagementGranularInformation.canManageAccountSecuritySettings) &&
        Objects.equals(this.canManageAccountSecuritySettingsMetadata, userAccountManagementGranularInformation.canManageAccountSecuritySettingsMetadata) &&
        Objects.equals(this.canManageAccountSettings, userAccountManagementGranularInformation.canManageAccountSettings) &&
        Objects.equals(this.canManageAccountSettingsMetadata, userAccountManagementGranularInformation.canManageAccountSettingsMetadata) &&
        Objects.equals(this.canManageAdmins, userAccountManagementGranularInformation.canManageAdmins) &&
        Objects.equals(this.canManageAdminsMetadata, userAccountManagementGranularInformation.canManageAdminsMetadata) &&
        Objects.equals(this.canManageDocumentRetention, userAccountManagementGranularInformation.canManageDocumentRetention) &&
        Objects.equals(this.canManageDocumentRetentionMetadata, userAccountManagementGranularInformation.canManageDocumentRetentionMetadata) &&
        Objects.equals(this.canManageEnvelopeTransfer, userAccountManagementGranularInformation.canManageEnvelopeTransfer) &&
        Objects.equals(this.canManageEnvelopeTransferMetadata, userAccountManagementGranularInformation.canManageEnvelopeTransferMetadata) &&
        Objects.equals(this.canManageGroups, userAccountManagementGranularInformation.canManageGroups) &&
        Objects.equals(this.canManageGroupsMetadata, userAccountManagementGranularInformation.canManageGroupsMetadata) &&
        Objects.equals(this.canManageReporting, userAccountManagementGranularInformation.canManageReporting) &&
        Objects.equals(this.canManageReportingMetadata, userAccountManagementGranularInformation.canManageReportingMetadata) &&
        Objects.equals(this.canManageSharing, userAccountManagementGranularInformation.canManageSharing) &&
        Objects.equals(this.canManageSharingMetadata, userAccountManagementGranularInformation.canManageSharingMetadata) &&
        Objects.equals(this.canManageSigningGroups, userAccountManagementGranularInformation.canManageSigningGroups) &&
        Objects.equals(this.canManageSigningGroupsMetadata, userAccountManagementGranularInformation.canManageSigningGroupsMetadata) &&
        Objects.equals(this.canManageUsers, userAccountManagementGranularInformation.canManageUsers) &&
        Objects.equals(this.canManageUsersMetadata, userAccountManagementGranularInformation.canManageUsersMetadata) &&
        Objects.equals(this.canViewUsers, userAccountManagementGranularInformation.canViewUsers) &&
        Objects.equals(this.canViewUsersMetadata, userAccountManagementGranularInformation.canViewUsersMetadata);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(canManageAccountSecuritySettings, canManageAccountSecuritySettingsMetadata, canManageAccountSettings, canManageAccountSettingsMetadata, canManageAdmins, canManageAdminsMetadata, canManageDocumentRetention, canManageDocumentRetentionMetadata, canManageEnvelopeTransfer, canManageEnvelopeTransferMetadata, canManageGroups, canManageGroupsMetadata, canManageReporting, canManageReportingMetadata, canManageSharing, canManageSharingMetadata, canManageSigningGroups, canManageSigningGroupsMetadata, canManageUsers, canManageUsersMetadata, canViewUsers, canViewUsersMetadata);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccountManagementGranularInformation {\n");
    
    sb.append("    canManageAccountSecuritySettings: ").append(toIndentedString(canManageAccountSecuritySettings)).append("\n");
    sb.append("    canManageAccountSecuritySettingsMetadata: ").append(toIndentedString(canManageAccountSecuritySettingsMetadata)).append("\n");
    sb.append("    canManageAccountSettings: ").append(toIndentedString(canManageAccountSettings)).append("\n");
    sb.append("    canManageAccountSettingsMetadata: ").append(toIndentedString(canManageAccountSettingsMetadata)).append("\n");
    sb.append("    canManageAdmins: ").append(toIndentedString(canManageAdmins)).append("\n");
    sb.append("    canManageAdminsMetadata: ").append(toIndentedString(canManageAdminsMetadata)).append("\n");
    sb.append("    canManageDocumentRetention: ").append(toIndentedString(canManageDocumentRetention)).append("\n");
    sb.append("    canManageDocumentRetentionMetadata: ").append(toIndentedString(canManageDocumentRetentionMetadata)).append("\n");
    sb.append("    canManageEnvelopeTransfer: ").append(toIndentedString(canManageEnvelopeTransfer)).append("\n");
    sb.append("    canManageEnvelopeTransferMetadata: ").append(toIndentedString(canManageEnvelopeTransferMetadata)).append("\n");
    sb.append("    canManageGroups: ").append(toIndentedString(canManageGroups)).append("\n");
    sb.append("    canManageGroupsMetadata: ").append(toIndentedString(canManageGroupsMetadata)).append("\n");
    sb.append("    canManageReporting: ").append(toIndentedString(canManageReporting)).append("\n");
    sb.append("    canManageReportingMetadata: ").append(toIndentedString(canManageReportingMetadata)).append("\n");
    sb.append("    canManageSharing: ").append(toIndentedString(canManageSharing)).append("\n");
    sb.append("    canManageSharingMetadata: ").append(toIndentedString(canManageSharingMetadata)).append("\n");
    sb.append("    canManageSigningGroups: ").append(toIndentedString(canManageSigningGroups)).append("\n");
    sb.append("    canManageSigningGroupsMetadata: ").append(toIndentedString(canManageSigningGroupsMetadata)).append("\n");
    sb.append("    canManageUsers: ").append(toIndentedString(canManageUsers)).append("\n");
    sb.append("    canManageUsersMetadata: ").append(toIndentedString(canManageUsersMetadata)).append("\n");
    sb.append("    canViewUsers: ").append(toIndentedString(canViewUsers)).append("\n");
    sb.append("    canViewUsersMetadata: ").append(toIndentedString(canViewUsersMetadata)).append("\n");
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

