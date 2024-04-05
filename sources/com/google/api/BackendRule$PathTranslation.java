package com.google.api;

import com.google.protobuf.C16935v;

public enum BackendRule$PathTranslation implements C16935v.C16936a {
    PATH_TRANSLATION_UNSPECIFIED(0),
    CONSTANT_ADDRESS(1),
    APPEND_PATH_TO_ADDRESS(2),
    UNRECOGNIZED(-1);
    
    public static final int APPEND_PATH_TO_ADDRESS_VALUE = 2;
    public static final int CONSTANT_ADDRESS_VALUE = 1;
    public static final int PATH_TRANSLATION_UNSPECIFIED_VALUE = 0;
    private static final C16935v.C16937b<BackendRule$PathTranslation> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.api.BackendRule$PathTranslation$a */
    public class C15740a implements C16935v.C16937b<BackendRule$PathTranslation> {
    }

    /* renamed from: com.google.api.BackendRule$PathTranslation$b */
    public static final class C15741b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C15741b f35530a = null;

        static {
            f35530a = new C15741b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return BackendRule$PathTranslation.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C15740a();
    }

    private BackendRule$PathTranslation(int i) {
        this.value = i;
    }

    public static BackendRule$PathTranslation forNumber(int i) {
        if (i == 0) {
            return PATH_TRANSLATION_UNSPECIFIED;
        }
        if (i == 1) {
            return CONSTANT_ADDRESS;
        }
        if (i != 2) {
            return null;
        }
        return APPEND_PATH_TO_ADDRESS;
    }

    public static C16935v.C16937b<BackendRule$PathTranslation> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C15741b.f35530a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static BackendRule$PathTranslation valueOf(int i) {
        return forNumber(i);
    }
}
