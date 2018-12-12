package com.helmj.connector.config;

import com.helmj.HelmJClientException;
import com.helmj.support.config.ClusterWith;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class AbstractConnectorConfig<T> {

	final protected ClusterWith clientWith;
	
	private final Log logger = LogFactory.getLog(getClass());

	AbstractConnectorConfig(ClusterWith clientWith) {
		if (clientWith.withMasterUrl() == null) {
			throw new HelmJClientException("Master url is required.");
		}

		if (clientWith.withUsername() == null) {
			throw new HelmJClientException("Username is required.");
		}

		if (clientWith.withPassword() == null) {
			throw new HelmJClientException("Password is required.");
		}

		logger.info("Helmj will try to connect : [" + clientWith.withMasterUrl() + "]");
		this.clientWith = clientWith;
	}

	public abstract T getConfig();

}