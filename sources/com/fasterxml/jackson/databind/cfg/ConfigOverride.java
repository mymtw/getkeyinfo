package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

public abstract class ConfigOverride {
    public JsonFormat.Value _format;
    public JsonIgnoreProperties.Value _ignorals;
    public JsonInclude.Value _include;
    public JsonInclude.Value _includeAsProperty;
    public Boolean _isIgnoredType;
    public Boolean _mergeable;
    public JsonSetter.Value _setterInfo;
    public JsonAutoDetect.Value _visibility;

    /* renamed from: com.fasterxml.jackson.databind.cfg.ConfigOverride$a */
    public static final class C12517a extends ConfigOverride {

        /* renamed from: b */
        public static final C12517a f27653b = new C12517a();
    }

    public ConfigOverride() {
    }

    public static ConfigOverride empty() {
        return C12517a.f27653b;
    }

    public JsonFormat.Value getFormat() {
        return this._format;
    }

    public JsonIgnoreProperties.Value getIgnorals() {
        return this._ignorals;
    }

    public JsonInclude.Value getInclude() {
        return this._include;
    }

    public JsonInclude.Value getIncludeAsProperty() {
        return this._includeAsProperty;
    }

    public Boolean getIsIgnoredType() {
        return this._isIgnoredType;
    }

    public Boolean getMergeable() {
        return this._mergeable;
    }

    public JsonSetter.Value getSetterInfo() {
        return this._setterInfo;
    }

    public JsonAutoDetect.Value getVisibility() {
        return this._visibility;
    }

    public ConfigOverride(ConfigOverride configOverride) {
        this._format = configOverride._format;
        this._include = configOverride._include;
        this._includeAsProperty = configOverride._includeAsProperty;
        this._ignorals = configOverride._ignorals;
        this._setterInfo = configOverride._setterInfo;
        this._visibility = configOverride._visibility;
        this._isIgnoredType = configOverride._isIgnoredType;
        this._mergeable = configOverride._mergeable;
    }
}
