package org.helmj.connector.config;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.helmj.ConfigAware;

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
