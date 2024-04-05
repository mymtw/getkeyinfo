package com.paypal.pyplcheckout.userprofile.model;

import com.paypal.pyplcheckout.pojo.User;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class UserState {

    public static final class Empty extends UserState {
        public static final Empty INSTANCE = new Empty();

        private Empty() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class Error extends UserState {
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

        public final Error copy(Exception exc) {
            C19383o.m32797g(exc, "exception");
            return new Error(exc);
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

    public static final class Success extends UserState {
        private final User user;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Success(User user2) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(user2, "user");
            this.user = user2;
        }

        public static /* synthetic */ Success copy$default(Success success, User user2, int i, Object obj) {
            if ((i & 1) != 0) {
                user2 = success.user;
            }
            return success.copy(user2);
        }

        public final User component1() {
            return this.user;
        }

        public final Success copy(User user2) {
            C19383o.m32797g(user2, "user");
            return new Success(user2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && C19383o.m32792b(this.user, ((Success) obj).user);
        }

        public final User getUser() {
            return this.user;
        }

        public int hashCode() {
            return this.user.hashCode();
        }

        public String toString() {
            User user2 = this.user;
            return "Success(user=" + user2 + ")";
        }
    }

    private UserState() {
    }

    public /* synthetic */ UserState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
