package com.dop.onlinecatering.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "file")
@Setter
@Getter
public class FileStoreProperties {
    private String uploadDir;
}
