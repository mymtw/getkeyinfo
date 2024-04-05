package dagger.internal;

import p634np.C18290b;

enum MembersInjectors$NoOpMembersInjector implements C18290b<Object> {
    INSTANCE;

    public void injectMembers(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
    }
}
