package net.bs23.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sabbir.
 * @since 5/14/17
 */


public class Response {


    public Response() {
    }


    public Loc getLoc() {
        return loc;
    }

    public void setLoc(Loc loc) {
        this.loc = loc;
    }

    @JsonProperty
    private Loc loc;
}
