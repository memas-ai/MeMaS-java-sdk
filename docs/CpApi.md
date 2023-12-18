# CpApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCorpus**](CpApi.md#createCorpus) | **POST** /cp/corpus | Create corpus |
| [**createUser**](CpApi.md#createUser) | **POST** /cp/user | Create user |
| [**deleteCorpus**](CpApi.md#deleteCorpus) | **DELETE** /cp/corpus | Delete corpus |
| [**deleteUser**](CpApi.md#deleteUser) | **DELETE** /cp/user | Delete user |


<a id="createCorpus"></a>
# **createCorpus**
> Memorize200Response createCorpus(createCorpusRequest)

Create corpus

Create a corpus under a namespace

### Example
```java
// Import classes:
import ai.memas.memassdk.invoker.ApiClient;
import ai.memas.memassdk.invoker.ApiException;
import ai.memas.memassdk.invoker.Configuration;
import ai.memas.memassdk.invoker.models.*;
import ai.memas.memassdk.api.CpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CpApi apiInstance = new CpApi(defaultClient);
    CreateCorpusRequest createCorpusRequest = new CreateCorpusRequest(); // CreateCorpusRequest | 
    try {
      Memorize200Response result = apiInstance.createCorpus(createCorpusRequest);
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

[**Memorize200Response**](Memorize200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Operation |  -  |
| **400** | Failed operation |  -  |

<a id="createUser"></a>
# **createUser**
> Memorize200Response createUser(createUserRequest)

Create user

Create a namespace user

### Example
```java
// Import classes:
import ai.memas.memassdk.invoker.ApiClient;
import ai.memas.memassdk.invoker.ApiException;
import ai.memas.memassdk.invoker.Configuration;
import ai.memas.memassdk.invoker.models.*;
import ai.memas.memassdk.api.CpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CpApi apiInstance = new CpApi(defaultClient);
    CreateUserRequest createUserRequest = new CreateUserRequest(); // CreateUserRequest | 
    try {
      Memorize200Response result = apiInstance.createUser(createUserRequest);
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

[**Memorize200Response**](Memorize200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Operation |  -  |
| **400** | Failed operation |  -  |

<a id="deleteCorpus"></a>
# **deleteCorpus**
> Memorize200Response deleteCorpus(deleteCorpusRequest)

Delete corpus

Delete a corpus under a namespace

### Example
```java
// Import classes:
import ai.memas.memassdk.invoker.ApiClient;
import ai.memas.memassdk.invoker.ApiException;
import ai.memas.memassdk.invoker.Configuration;
import ai.memas.memassdk.invoker.models.*;
import ai.memas.memassdk.api.CpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CpApi apiInstance = new CpApi(defaultClient);
    DeleteCorpusRequest deleteCorpusRequest = new DeleteCorpusRequest(); // DeleteCorpusRequest | 
    try {
      Memorize200Response result = apiInstance.deleteCorpus(deleteCorpusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CpApi#deleteCorpus");
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
| **deleteCorpusRequest** | [**DeleteCorpusRequest**](DeleteCorpusRequest.md)|  | |

### Return type

[**Memorize200Response**](Memorize200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Operation |  -  |
| **400** | Failed operation |  -  |

<a id="deleteUser"></a>
# **deleteUser**
> Memorize200Response deleteUser(createUserRequest)

Delete user

Delete a namespace user

### Example
```java
// Import classes:
import ai.memas.memassdk.invoker.ApiClient;
import ai.memas.memassdk.invoker.ApiException;
import ai.memas.memassdk.invoker.Configuration;
import ai.memas.memassdk.invoker.models.*;
import ai.memas.memassdk.api.CpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CpApi apiInstance = new CpApi(defaultClient);
    CreateUserRequest createUserRequest = new CreateUserRequest(); // CreateUserRequest | 
    try {
      Memorize200Response result = apiInstance.deleteUser(createUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CpApi#deleteUser");
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

[**Memorize200Response**](Memorize200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Operation |  -  |
| **400** | Failed operation |  -  |

