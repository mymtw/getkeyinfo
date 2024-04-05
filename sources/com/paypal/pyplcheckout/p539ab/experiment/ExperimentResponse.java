package com.paypal.pyplcheckout.p539ab.experiment;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.paypal.pyplcheckout.ab.experiment.ExperimentResponse */
public abstract class ExperimentResponse {

    /* renamed from: com.paypal.pyplcheckout.ab.experiment.ExperimentResponse$Disable */
    public static final class Disable extends ExperimentResponse {
        public static final Disable INSTANCE = new Disable();

        private Disable() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.pyplcheckout.ab.experiment.ExperimentResponse$Failure */
    public static final class Failure extends ExperimentResponse {
        private final Exception error;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Failure(Exception exc) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(exc, "error");
            this.error = exc;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = failure.error;
            }
            return failure.copy(exc);
        }

        public final Exception component1() {
            return this.error;
        }

        public final Failure copy(Exception exc) {
            C19383o.m32797g(exc, "error");
            return new Failure(exc);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && C19383o.m32792b(this.error, ((Failure) obj).error);
        }

        public final Exception getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            Exception exc = this.error;
            return "Failure(error=" + exc + ")";
        }
    }

    /* renamed from: com.paypal.pyplcheckout.ab.experiment.ExperimentResponse$Success */
    public static final class Success extends ExperimentResponse {
        private final DataResponse response;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Success(DataResponse dataResponse) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(dataResponse, ResponseConstants.RESPONSE);
            this.response = dataResponse;
        }

        public static /* synthetic */ Success copy$default(Success success, DataResponse dataResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                dataResponse = success.response;
            }
            return success.copy(dataResponse);
        }

        public final DataResponse component1() {
            return this.response;
        }

        public final Success copy(DataResponse dataResponse) {
            C19383o.m32797g(dataResponse, ResponseConstants.RESPONSE);
            return new Success(dataResponse);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && C19383o.m32792b(this.response, ((Success) obj).response);
        }

        public final DataResponse getResponse() {
            return this.response;
        }

        public int hashCode() {
            return this.response.hashCode();
        }

        public String toString() {
            DataResponse dataResponse = this.response;
            return "Success(response=" + dataResponse + ")";
        }
    }

    private ExperimentResponse() {
    }

    public /* synthetic */ ExperimentResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
