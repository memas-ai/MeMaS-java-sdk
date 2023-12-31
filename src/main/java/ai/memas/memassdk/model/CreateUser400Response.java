/*
 * MeMaS APIs
 * This is the Control Plane and Data Plane APIs for MeMaS (Memory Management Service). See https://github.com/memas-ai/MeMaS for more details.
 *
 * The version of the OpenAPI document: 0.1.1
 * Contact: max.yu@memas.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ai.memas.memassdk.model;

import java.util.Objects;
import java.util.Arrays;
import ai.memas.memassdk.model.NamespaceExistError;
import ai.memas.memassdk.model.NamespaceIllegalNameError;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import ai.memas.memassdk.invoker.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-17T15:47:50.270747166-08:00[America/Los_Angeles]")
public class CreateUser400Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateUser400Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateUser400Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateUser400Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<NamespaceExistError> adapterNamespaceExistError = gson.getDelegateAdapter(this, TypeToken.get(NamespaceExistError.class));
            final TypeAdapter<NamespaceIllegalNameError> adapterNamespaceIllegalNameError = gson.getDelegateAdapter(this, TypeToken.get(NamespaceIllegalNameError.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateUser400Response>() {
                @Override
                public void write(JsonWriter out, CreateUser400Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `NamespaceExistError`
                    if (value.getActualInstance() instanceof NamespaceExistError) {
                        JsonObject obj = adapterNamespaceExistError.toJsonTree((NamespaceExistError)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `NamespaceIllegalNameError`
                    if (value.getActualInstance() instanceof NamespaceIllegalNameError) {
                        JsonObject obj = adapterNamespaceIllegalNameError.toJsonTree((NamespaceIllegalNameError)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: NamespaceExistError, NamespaceIllegalNameError");
                }

                @Override
                public CreateUser400Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize NamespaceExistError
                    try {
                        // validate the JSON object to see if any exception is thrown
                        NamespaceExistError.validateJsonObject(jsonObject);
                        actualAdapter = adapterNamespaceExistError;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'NamespaceExistError'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for NamespaceExistError failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'NamespaceExistError'", e);
                    }

                    // deserialize NamespaceIllegalNameError
                    try {
                        // validate the JSON object to see if any exception is thrown
                        NamespaceIllegalNameError.validateJsonObject(jsonObject);
                        actualAdapter = adapterNamespaceIllegalNameError;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'NamespaceIllegalNameError'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for NamespaceIllegalNameError failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'NamespaceIllegalNameError'", e);
                    }

                    if (match == 1) {
                        CreateUser400Response ret = new CreateUser400Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreateUser400Response: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public CreateUser400Response() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateUser400Response(NamespaceExistError o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateUser400Response(NamespaceIllegalNameError o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("NamespaceExistError", new GenericType<NamespaceExistError>() {
        });
        schemas.put("NamespaceIllegalNameError", new GenericType<NamespaceIllegalNameError>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return CreateUser400Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * NamespaceExistError, NamespaceIllegalNameError
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof NamespaceExistError) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof NamespaceIllegalNameError) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be NamespaceExistError, NamespaceIllegalNameError");
    }

    /**
     * Get the actual instance, which can be the following:
     * NamespaceExistError, NamespaceIllegalNameError
     *
     * @return The actual instance (NamespaceExistError, NamespaceIllegalNameError)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `NamespaceExistError`. If the actual instance is not `NamespaceExistError`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `NamespaceExistError`
     * @throws ClassCastException if the instance is not `NamespaceExistError`
     */
    public NamespaceExistError getNamespaceExistError() throws ClassCastException {
        return (NamespaceExistError)super.getActualInstance();
    }

    /**
     * Get the actual instance of `NamespaceIllegalNameError`. If the actual instance is not `NamespaceIllegalNameError`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `NamespaceIllegalNameError`
     * @throws ClassCastException if the instance is not `NamespaceIllegalNameError`
     */
    public NamespaceIllegalNameError getNamespaceIllegalNameError() throws ClassCastException {
        return (NamespaceIllegalNameError)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateUser400Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with NamespaceExistError
    try {
      NamespaceExistError.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for NamespaceExistError failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with NamespaceIllegalNameError
    try {
      NamespaceIllegalNameError.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for NamespaceIllegalNameError failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for CreateUser400Response with oneOf schemas: NamespaceExistError, NamespaceIllegalNameError. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of CreateUser400Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateUser400Response
  * @throws IOException if the JSON string is invalid with respect to CreateUser400Response
  */
  public static CreateUser400Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateUser400Response.class);
  }

 /**
  * Convert an instance of CreateUser400Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

