package net.bs23.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sabbir.
 * @since 5/14/17
 */

@JsonIgnoreProperties(ignoreUnknown = true)

public class Loc {


    public Loc() {
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    private double lat;

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("long")
    private double longitude;
}
