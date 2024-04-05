package com.paypal.pyplcheckout.exception;

import kotlin.jvm.internal.C19383o;

public final class ExceptionTypeDescriptor {
    private final Type exceptionType;

    public enum Type {
        UNKNOWN_EXCEPTION,
        NETWORK_EXCEPTION,
        JSON_PARSING_EXCEPTION,
        WEB_PARAM_EXCEPTION,
        WEB_SERVER_EXCEPTION,
        OBJECT_INSTANTIATION_EXCEPTION,
        DATE_PARSING_EXCEPTION,
        NO_DATA_EXCEPTION,
        UPDATE_STATUS_FORCE_EXCEPTION
    }

    public ExceptionTypeDescriptor(Type type) {
        C19383o.m32797g(type, "exceptionType");
        this.exceptionType = type;
    }

    public final Type getExceptionType() {
        return this.exceptionType;
    }
}
