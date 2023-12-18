# memas-sdk

MeMaS APIs
- API version: 0.1.1
  - Build date: 2023-12-17T15:47:50.270747166-08:00[America/Los_Angeles]

This is the Control Plane and Data Plane APIs for MeMaS (Memory Management Service).
See https://github.com/memas-ai/MeMaS for more details.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>ai.memas</groupId>
  <artifactId>memas-sdk</artifactId>
  <version>0.1.3</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'memas-sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'memas-sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "ai.memas:memas-sdk:0.1.3"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/memas-sdk-0.1.3.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CpApi* | [**createCorpus**](docs/CpApi.md#createCorpus) | **POST** /cp/corpus | Create corpus
*CpApi* | [**createUser**](docs/CpApi.md#createUser) | **POST** /cp/user | Create user
*CpApi* | [**deleteCorpus**](docs/CpApi.md#deleteCorpus) | **DELETE** /cp/corpus | Delete corpus
*CpApi* | [**deleteUser**](docs/CpApi.md#deleteUser) | **DELETE** /cp/user | Delete user
*DpApi* | [**memorize**](docs/DpApi.md#memorize) | **POST** /dp/memorize | Memorize information
*DpApi* | [**recall**](docs/DpApi.md#recall) | **GET** /dp/recall | Recalls information


## Documentation for Models

 - [Citation](docs/Citation.md)
 - [CitedDocument](docs/CitedDocument.md)
 - [CorpusType](docs/CorpusType.md)
 - [CreateCorpusRequest](docs/CreateCorpusRequest.md)
 - [CreateUser400Response](docs/CreateUser400Response.md)
 - [CreateUserRequest](docs/CreateUserRequest.md)
 - [DeleteCorpusRequest](docs/DeleteCorpusRequest.md)
 - [Memorize200Response](docs/Memorize200Response.md)
 - [Memorize400Response](docs/Memorize400Response.md)
 - [MemorizeRequest](docs/MemorizeRequest.md)
 - [MemorizeRequestAllOf](docs/MemorizeRequestAllOf.md)
 - [NamespaceDoesNotExistError](docs/NamespaceDoesNotExistError.md)
 - [NamespaceExistError](docs/NamespaceExistError.md)
 - [NamespaceIllegalNameError](docs/NamespaceIllegalNameError.md)
 - [RecallRequest](docs/RecallRequest.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

max.yu@memas.ai

