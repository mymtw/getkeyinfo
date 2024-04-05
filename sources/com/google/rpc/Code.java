package com.google.rpc;

import com.google.protobuf.C16935v;

public enum Code implements C16935v.C16936a {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    UNAUTHENTICATED(16),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNRECOGNIZED(-1);
    
    public static final int ABORTED_VALUE = 10;
    public static final int ALREADY_EXISTS_VALUE = 6;
    public static final int CANCELLED_VALUE = 1;
    public static final int DATA_LOSS_VALUE = 15;
    public static final int DEADLINE_EXCEEDED_VALUE = 4;
    public static final int FAILED_PRECONDITION_VALUE = 9;
    public static final int INTERNAL_VALUE = 13;
    public static final int INVALID_ARGUMENT_VALUE = 3;
    public static final int NOT_FOUND_VALUE = 5;
    public static final int OK_VALUE = 0;
    public static final int OUT_OF_RANGE_VALUE = 11;
    public static final int PERMISSION_DENIED_VALUE = 7;
    public static final int RESOURCE_EXHAUSTED_VALUE = 8;
    public static final int UNAUTHENTICATED_VALUE = 16;
    public static final int UNAVAILABLE_VALUE = 14;
    public static final int UNIMPLEMENTED_VALUE = 12;
    public static final int UNKNOWN_VALUE = 2;
    private static final C16935v.C16937b<Code> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.rpc.Code$a */
    public class C16962a implements C16935v.C16937b<Code> {
    }

    /* renamed from: com.google.rpc.Code$b */
    public static final class C16963b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C16963b f37341a = null;

        static {
            f37341a = new C16963b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return Code.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16962a();
    }

    private Code(int i) {
        this.value = i;
    }

    public static Code forNumber(int i) {
        switch (i) {
            case 0:
                return OK;
            case 1:
                return CANCELLED;
            case 2:
                return UNKNOWN;
            case 3:
                return INVALID_ARGUMENT;
            case 4:
                return DEADLINE_EXCEEDED;
            case 5:
                return NOT_FOUND;
            case 6:
                return ALREADY_EXISTS;
            case 7:
                return PERMISSION_DENIED;
            case 8:
                return RESOURCE_EXHAUSTED;
            case 9:
                return FAILED_PRECONDITION;
            case 10:
                return ABORTED;
            case 11:
                return OUT_OF_RANGE;
            case 12:
                return UNIMPLEMENTED;
            case 13:
                return INTERNAL;
            case 14:
                return UNAVAILABLE;
            case 15:
                return DATA_LOSS;
            case 16:
                return UNAUTHENTICATED;
            default:
                return null;
        }
    }

    public static C16935v.C16937b<Code> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C16963b.f37341a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Code valueOf(int i) {
        return forNumber(i);
    }
}
