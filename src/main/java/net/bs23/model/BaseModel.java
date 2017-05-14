package net.bs23.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;

import java.io.Serializable;

/**
 * @author Sabbir.
 * @since 5/14/17
 */
public class BaseModel {

    public BaseModel() {
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
    @JsonProperty
    private Response response;

}
