package com.paypal.pyplcheckout.utils;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;

public abstract class Result<T> {

    public static final class Error<T> extends Result<T> {
        private final Exception exception;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Error(Exception exc) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(exc, "exception");
            this.exception = exc;
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = error.exception;
            }
            return error.copy(exc);
        }

        public final Exception component1() {
            return this.exception;
        }

        public final Error<T> copy(Exception exc) {
            C19383o.m32797g(exc, "exception");
            return new Error<>(exc);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && C19383o.m32792b(this.exception, ((Error) obj).exception);
        }

        public final Exception getException() {
            return this.exception;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            Exception exc = this.exception;
            return "Error(exception=" + exc + ")";
        }
    }

    public static final class Success<T> extends Result<T> {
        private final T value;

        public Success(T t) {
            super((DefaultConstructorMarker) null);
            this.value = t;
        }

        public static /* synthetic */ Success copy$default(Success success, T t, int i, Object obj) {
            if ((i & 1) != 0) {
                t = success.value;
            }
            return success.copy(t);
        }

        public final T component1() {
            return this.value;
        }

        public final Success<T> copy(T t) {
            return new Success<>(t);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && C19383o.m32792b(this.value, ((Success) obj).value);
        }

        public final T getValue() {
            return this.value;
        }

        public int hashCode() {
            T t = this.value;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            return C13983i.m21494m("Success(value=", this.value, ")");
        }
    }

    private Result() {
    }

    public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
