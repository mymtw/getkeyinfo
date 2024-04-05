package com.paypal.pyplcheckout.events.model;

import kotlin.jvm.internal.C19383o;

public final class LifecycleName {
    private State lifeCycle;

    public enum State {
        ON_ATTACH,
        ON_CREATE,
        ON_CREATE_VIEW,
        ON_ACTIVITY_CREATED,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY_VIEW,
        ON_DESTROY,
        ON_DETACH
    }

    public LifecycleName(State state) {
        C19383o.m32797g(state, "lifeCycle");
        this.lifeCycle = state;
    }

    public final State getLifeCycle() {
        return this.lifeCycle;
    }

    public final void setLifeCycle(State state) {
        C19383o.m32797g(state, "<set-?>");
        this.lifeCycle = state;
    }
}
