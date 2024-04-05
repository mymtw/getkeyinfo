package com.paypal.android.platform.authsdk.authcommon.network.model;

import kotlin.jvm.internal.C19383o;

public final class ServerResponse<T> {
    private final AuthMetadata metaData;
    private final String objectType;
    private final T result;

    public ServerResponse(T t, AuthMetadata authMetadata, String str) {
        C19383o.m32797g(authMetadata, "metaData");
        C19383o.m32797g(str, "objectType");
        this.result = t;
        this.metaData = authMetadata;
        this.objectType = str;
    }

    public final AuthMetadata getMetaData() {
        return this.metaData;
    }

    public final String getObjectType() {
        return this.objectType;
    }

    public final T getResult() {
        return this.result;
    }
}
