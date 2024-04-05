package com.google.android.datatransport.runtime.dagger.internal;

enum MembersInjectors$NoOpMembersInjector {
    INSTANCE;

    public void injectMembers(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
    }
}
