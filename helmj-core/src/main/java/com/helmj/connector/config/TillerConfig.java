package com.helmj.connector.config;

import com.helmj.ConfigAware;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Builder
@Getter
@Setter
public class TillerConfig implements ConfigAware {

	private String namespace;

	private Map<String, String> labels;

	private String clientVersion;

	private int port;

}