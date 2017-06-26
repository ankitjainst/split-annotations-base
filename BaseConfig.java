package org.mule.modules.baseannotations;

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Default;

public class BaseConfig {
	/**
     * Base parameter
     */
    @Configurable
    @Default("BaseParam")
    private String baseParameter;
    
    /**
     * Set greeting message
     *
     * @param baseParameter the greeting message
     */
    public void setBaseParameter(String baseParameter) {
        this.baseParameter = baseParameter;
    }

    /**
     * Get greeting message
     */
    public String getBaseParameter() {
        return this.baseParameter;
    }
}
