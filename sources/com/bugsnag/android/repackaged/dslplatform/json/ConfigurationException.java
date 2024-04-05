package com.bugsnag.android.repackaged.dslplatform.json;

public class ConfigurationException extends RuntimeException {
    public ConfigurationException(String str) {
        super(str);
    }

    public ConfigurationException(Throwable th) {
        super(th);
    }

    public ConfigurationException(String str, Throwable th) {
        super(str, th);
    }
}
