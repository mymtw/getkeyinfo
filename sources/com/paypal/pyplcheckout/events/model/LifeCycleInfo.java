package com.paypal.pyplcheckout.events.model;

import kotlin.jvm.internal.C19383o;

public final class LifeCycleInfo {
    private final LifecycleName lifecycleName;
    private final String viewId;

    public LifeCycleInfo(String str, LifecycleName lifecycleName2) {
        C19383o.m32797g(str, "viewId");
        C19383o.m32797g(lifecycleName2, "lifecycleName");
        this.viewId = str;
        this.lifecycleName = lifecycleName2;
    }

    public final LifecycleName getLifecycleName() {
        return this.lifecycleName;
    }

    public final String getViewId() {
        return this.viewId;
    }
}
