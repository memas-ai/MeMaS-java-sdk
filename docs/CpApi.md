# CpApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCorpus**](CpApi.md#createCorpus) | **POST** /cp/create_corpus | Create corpus |
| [**createUser**](CpApi.md#createUser) | **POST** /cp/create_user | Create user |


<a id="createCorpus"></a>
# **createCorpus**
> CreateUser200Response createCorpus(createCorpusRequest)

Create corpus

Create a corpus under a namespace

### Example
```java
// Import classes:
import ai.memas.memas_sdk.invoker.ApiClient;
import ai.memas.memas_sdk.invoker.ApiException;
import ai.memas.memas_sdk.invoker.Configuration;
import ai.memas.memas_sdk.invoker.models.*;
import ai.memas.memas_sdk.api.CpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CpApi apiInstance = new CpApi(defaultClient);
    CreateCorpusRequest createCorpusRequest = new CreateCorpusRequest(); // CreateCorpusRequest | 
    try {
      CreateUser200Response result = apiInstance.createCorpus(createCorpusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CpApi#createCorpus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createCorpusRequest** | [**CreateCorpusRequest**](CreateCorpusRequest.md)|  | |

### Return type

[**CreateUser200Response**](CreateUser200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Operation |  -  |

<a id="createUser"></a>
# **createUser**
> CreateUser200Response createUser(createUserRequest)

Create user

Create a namespace user

### Example
```java
// Import classes:
import ai.memas.memas_sdk.invoker.ApiClient;
import ai.memas.memas_sdk.invoker.ApiException;
import ai.memas.memas_sdk.invoker.Configuration;
import ai.memas.memas_sdk.invoker.models.*;
import ai.memas.memas_sdk.api.CpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CpApi apiInstance = new CpApi(defaultClient);
    CreateUserRequest createUserRequest = new CreateUserRequest(); // CreateUserRequest | 
    try {
      CreateUser200Response result = apiInstance.createUser(createUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CpApi#createUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createUserRequest** | [**CreateUserRequest**](CreateUserRequest.md)|  | |

### Return type

[**CreateUser200Response**](CreateUser200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Operation |  -  |

