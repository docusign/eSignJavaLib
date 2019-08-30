package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.BccEmailArchive;
import com.docusign.esign.model.BccEmailArchiveHistoryList;
import com.docusign.esign.model.BccEmailArchiveList;
import com.docusign.esign.model.ErrorDetails;




  public class EmailArchiveApi {
  private ApiClient apiClient;

  public EmailArchiveApi() {
  this(Configuration.getDefaultApiClient());
  }

  public EmailArchiveApi(ApiClient apiClient) {
  this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
  return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
  this.apiClient = apiClient;
  }


  /**
   * Creates a blind carbon copy email archive entry
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bccEmailArchive  (optional)
   * @return BccEmailArchive
   * @throws ApiException if fails to make API call
   */
  public BccEmailArchive createBCCEmailArchive(String accountId, BccEmailArchive bccEmailArchive) throws ApiException {
    Object localVarPostBody = bccEmailArchive;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createBCCEmailArchive");
      }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/bcc_email_archives".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<BccEmailArchive> localVarReturnType = new GenericType<BccEmailArchive>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Delete a blind carbon copy email archive for an account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bccEmailArchiveId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteBCCEmailArchive(String accountId, String bccEmailArchiveId) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteBCCEmailArchive");
      }
    
      // verify the required parameter 'bccEmailArchiveId' is set
      if (bccEmailArchiveId == null) {
      throw new ApiException(400, "Missing the required parameter 'bccEmailArchiveId' when calling deleteBCCEmailArchive");
      }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/bcc_email_archives/{bccEmailArchiveId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "bccEmailArchiveId" + "\\}", apiClient.escapeString(bccEmailArchiveId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };


      apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
      }
  /// <summary>
  /// Get the blind carbon copy email archive history entries for the specified archive 
  /// </summary>
  public class GetBCCEmailArchiveHistoryListOptions
  {
  private String count = null;
  private String startPosition = null;
  /*
   * 
   */
  public void setCount(String count) {
    this.count = count;
  }
  
  public String getCount() {
    return this.count;
  }
  /*
   * 
   */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }
  
  public String getStartPosition() {
    return this.startPosition;
  }
  }

   /**
   * Get the blind carbon copy email archive history entries for the specified archive
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bccEmailArchiveId  (required)
   * @return BccEmailArchiveHistoryList
   */ 
  public BccEmailArchiveHistoryList getBCCEmailArchiveHistoryList(String accountId, String bccEmailArchiveId) throws ApiException {
    return getBCCEmailArchiveHistoryList(accountId, bccEmailArchiveId, null);
  }

  /**
   * Get the blind carbon copy email archive history entries for the specified archive
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bccEmailArchiveId  (required)
   * @param options for modifying the method behavior.
   * @return BccEmailArchiveHistoryList
   * @throws ApiException if fails to make API call
   */
  public BccEmailArchiveHistoryList getBCCEmailArchiveHistoryList(String accountId, String bccEmailArchiveId, EmailArchiveApi.GetBCCEmailArchiveHistoryListOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBCCEmailArchiveHistoryList");
      }
    
      // verify the required parameter 'bccEmailArchiveId' is set
      if (bccEmailArchiveId == null) {
      throw new ApiException(400, "Missing the required parameter 'bccEmailArchiveId' when calling getBCCEmailArchiveHistoryList");
      }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/bcc_email_archives/{bccEmailArchiveId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "bccEmailArchiveId" + "\\}", apiClient.escapeString(bccEmailArchiveId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<BccEmailArchiveHistoryList> localVarReturnType = new GenericType<BccEmailArchiveHistoryList>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Get the blind carbon copy email archive entries owned by the specified account 
  /// </summary>
  public class GetBCCEmailArchiveListOptions
  {
  private String count = null;
  private String startPosition = null;
  /*
   * 
   */
  public void setCount(String count) {
    this.count = count;
  }
  
  public String getCount() {
    return this.count;
  }
  /*
   * 
   */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }
  
  public String getStartPosition() {
    return this.startPosition;
  }
  }

   /**
   * Get the blind carbon copy email archive entries owned by the specified account
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return BccEmailArchiveList
   */ 
  public BccEmailArchiveList getBCCEmailArchiveList(String accountId) throws ApiException {
    return getBCCEmailArchiveList(accountId, null);
  }

  /**
   * Get the blind carbon copy email archive entries owned by the specified account
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return BccEmailArchiveList
   * @throws ApiException if fails to make API call
   */
  public BccEmailArchiveList getBCCEmailArchiveList(String accountId, EmailArchiveApi.GetBCCEmailArchiveListOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBCCEmailArchiveList");
      }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/bcc_email_archives".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<BccEmailArchiveList> localVarReturnType = new GenericType<BccEmailArchiveList>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
    }
