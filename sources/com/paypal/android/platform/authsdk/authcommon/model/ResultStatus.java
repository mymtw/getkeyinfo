package com.paypal.android.platform.authsdk.authcommon.model;

import com.paypal.android.platform.authsdk.authcommon.ChallengeRawResponse;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class ResultStatus<T> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

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

    public static final class Unhandled<T> extends ResultStatus<T> {
        private final String challengeData;
        private final ChallengeRawResponse challengeRawResponse;
        private final String challengeType;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Unhandled(String str, String str2, ChallengeRawResponse challengeRawResponse2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : challengeRawResponse2);
        }

        public static /* synthetic */ void getChallengeData$annotations() {
        }

        public static /* synthetic */ void getChallengeType$annotations() {
        }

        public final String getChallengeData() {
            return this.challengeData;
        }

        public final ChallengeRawResponse getChallengeRawResponse() {
            return this.challengeRawResponse;
        }

        public final String getChallengeType() {
            return this.challengeType;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Unhandled(String str, String str2, ChallengeRawResponse challengeRawResponse2) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "challengeData");
            C19383o.m32797g(str2, "challengeType");
            this.challengeData = str;
            this.challengeType = str2;
            this.challengeRawResponse = challengeRawResponse2;
        }
    }

    private ResultStatus() {
    }

    public /* synthetic */ ResultStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

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

        public final <T> Unhandled<T> withUnhandled(ChallengeRawResponse challengeRawResponse) {
            C19383o.m32797g(challengeRawResponse, "challengeRawResponse");
            String jsonResultStr = challengeRawResponse.getJsonResultStr();
            String str = "";
            if (jsonResultStr == null) {
                jsonResultStr = str;
            }
            String challengeType = challengeRawResponse.getChallengeType();
            if (challengeType != null) {
                str = challengeType;
            }
            return new Unhandled<>(jsonResultStr, str, challengeRawResponse);
        }

        public final <T> Unhandled<T> withUnhandled(String str, String str2) {
            C19383o.m32797g(str, "challengeData");
            C19383o.m32797g(str2, "challengeType");
            return new Unhandled(str, str2, (ChallengeRawResponse) null, 4, (DefaultConstructorMarker) null);
        }
    }
}
