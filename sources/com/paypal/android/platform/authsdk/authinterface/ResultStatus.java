package com.paypal.android.platform.authsdk.authinterface;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class ResultStatus<T> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> Failure<T> withException(Exception exc) {
            C19383o.m32797g(exc, "error");
            return new Failure<>(exc);
        }

        public final <T> Pending<T> withPending() {
            return new Pending<>();
        }

        public final <T> Success<T> withSuccess(T t) {
            return new Success<>(t);
        }
    }

    public static final class Failure<T> extends ResultStatus<T> {
        private final Exception exception;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Failure(Exception exc) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(exc, "exception");
            this.exception = exc;
        }

        public final Exception getException() {
            return this.exception;
        }
    }

    public static final class Pending<T> extends ResultStatus<T> {
        public Pending() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class Success<T> extends ResultStatus<T> {
        private final T data;

        public Success(T t) {
            super((DefaultConstructorMarker) null);
            this.data = t;
        }

        public final T getData() {
            return this.data;
        }
    }

    private ResultStatus() {
    }

    public /* synthetic */ ResultStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
