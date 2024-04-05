package com.google.api;

import com.google.protobuf.C16935v;

public enum ChangeType implements C16935v.C16936a {
    CHANGE_TYPE_UNSPECIFIED(0),
    ADDED(1),
    REMOVED(2),
    MODIFIED(3),
    UNRECOGNIZED(-1);
    
    public static final int ADDED_VALUE = 1;
    public static final int CHANGE_TYPE_UNSPECIFIED_VALUE = 0;
    public static final int MODIFIED_VALUE = 3;
    public static final int REMOVED_VALUE = 2;
    private static final C16935v.C16937b<ChangeType> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.api.ChangeType$a */
    public class C15742a implements C16935v.C16937b<ChangeType> {
    }

    /* renamed from: com.google.api.ChangeType$b */
    public static final class C15743b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C15743b f35531a = null;

        static {
            f35531a = new C15743b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return ChangeType.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C15742a();
    }

    private ChangeType(int i) {
        this.value = i;
    }

    public static ChangeType forNumber(int i) {
        if (i == 0) {
            return CHANGE_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return ADDED;
        }
        if (i == 2) {
            return REMOVED;
        }
        if (i != 3) {
            return null;
        }
        return MODIFIED;
    }

    public static C16935v.C16937b<ChangeType> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C15743b.f35531a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ChangeType valueOf(int i) {
        return forNumber(i);
    }
}
