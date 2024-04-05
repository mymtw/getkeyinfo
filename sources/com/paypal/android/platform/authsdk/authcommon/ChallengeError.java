package com.paypal.android.platform.authsdk.authcommon;

import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class ChallengeError {
    private final Error reason;

    public static final class Cancelled extends ChallengeError {
        public Cancelled() {
            this((Error) null, 1, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Cancelled(Error error, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : error);
        }

        public Cancelled(Error error) {
            super(error, (DefaultConstructorMarker) null);
        }
    }

    public static final class Failure extends ChallengeError {
        public Failure() {
            this((Error) null, 1, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Failure(Error error, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : error);
        }

        public Failure(Error error) {
            super(error, (DefaultConstructorMarker) null);
        }
    }

    public static final class Unsupported extends ChallengeError {
        public Unsupported() {
            this((Error) null, 1, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Unsupported(Error error, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : error);
        }

        public Unsupported(Error error) {
            super(error, (DefaultConstructorMarker) null);
        }
    }

    private ChallengeError(Error error) {
        this.reason = error;
    }

    public /* synthetic */ ChallengeError(Error error, DefaultConstructorMarker defaultConstructorMarker) {
        this(error);
    }

    public final Error getReason() {
        return this.reason;
    }
}
