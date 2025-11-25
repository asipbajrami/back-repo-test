package org.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Version implements Serializable {
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5600506177203665562L;

    @JsonProperty("version")
    private String version;
}
