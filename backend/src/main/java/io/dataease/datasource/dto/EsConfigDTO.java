package io.dataease.datasource.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EsConfigDTO {
    private String url;
    private String username;
    private String password;
    private String version;
    private String uri;
    private String dataSourceType = "es";
}
