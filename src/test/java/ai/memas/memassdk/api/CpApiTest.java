/*
 * MeMaS CP APIs
 * This is the Control Plane APIs for MeMaS (Memory Management Service).
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: max.yu@memas.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ai.memas.memassdk.api;

import ai.memas.memassdk.invoker.ApiException;
import ai.memas.memassdk.model.CreateCorpusRequest;
import ai.memas.memassdk.model.CreateUser200Response;
import ai.memas.memassdk.model.CreateUserRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CpApi
 */
@Disabled
public class CpApiTest {

    private final CpApi api = new CpApi();

    /**
     * Create corpus
     *
     * Create a corpus under a namespace
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCorpusTest() throws ApiException {
        CreateCorpusRequest createCorpusRequest = null;
        CreateUser200Response response = api.createCorpus(createCorpusRequest);
        // TODO: test validations
    }

    /**
     * Create user
     *
     * Create a namespace user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        CreateUserRequest createUserRequest = null;
        CreateUser200Response response = api.createUser(createUserRequest);
        // TODO: test validations
    }

}