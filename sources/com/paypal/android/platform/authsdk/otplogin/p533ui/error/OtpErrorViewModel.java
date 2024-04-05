package com.paypal.android.platform.authsdk.otplogin.p533ui.error;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2895z;
import androidx.lifecycle.LiveData;
import com.paypal.android.platform.authsdk.authcommon.p531ui.header.HeaderViewModel;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C19499d;
import kotlinx.coroutines.flow.C19597d;
import p568fn.C17782b;
import p716xo.C18829b;

/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.error.OtpErrorViewModel */
public final class OtpErrorViewModel extends HeaderViewModel {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String EVENT_NAME = "otp_error_screen_shown";
    private C2895z<OtpErrorViewState> _viewState;
    /* access modifiers changed from: private */
    public final C19499d<ErrorScreenEvent> analyticsEventsChannel;
    private final C19597d<ErrorScreenEvent> analyticsEventsFlow;
    private boolean completionState;
    private final LiveData<OtpErrorViewState> viewState;

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.error.OtpErrorViewModel$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.error.OtpErrorViewModel$OtpErrorViewState */
    public static abstract class OtpErrorViewState {

        /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.error.OtpErrorViewModel$OtpErrorViewState$AlternateLogin */
        public static final class AlternateLogin extends OtpErrorViewState {
            public static final AlternateLogin INSTANCE = new AlternateLogin();

            private AlternateLogin() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.error.OtpErrorViewModel$OtpErrorViewState$Close */
        public static final class Close extends OtpErrorViewState {
            public static final Close INSTANCE = new Close();

            private Close() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.error.OtpErrorViewModel$OtpErrorViewState$Ready */
        public static final class Ready extends OtpErrorViewState {
            public static final Ready INSTANCE = new Ready();

            private Ready() {
                super((DefaultConstructorMarker) null);
            }
        }

        private OtpErrorViewState() {
        }

        public /* synthetic */ OtpErrorViewState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public OtpErrorViewModel(C18829b bVar) {
        C19383o.m32797g(bVar, "authHandlerProviders");
        C2895z<OtpErrorViewState> zVar = new C2895z<>(OtpErrorViewState.Ready.INSTANCE);
        this._viewState = zVar;
        this.viewState = zVar;
        AbstractChannel l = C17782b.m29872l(0, (BufferOverflow) null, 7);
        this.analyticsEventsChannel = l;
        this.analyticsEventsFlow = C0761x.m1662D0(l);
    }

    public final void fragmentLoadedEvent() {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpErrorViewModel$fragmentLoadedEvent$1(this, (C19340c<? super OtpErrorViewModel$fragmentLoadedEvent$1>) null), 3);
    }

    public final C19597d<ErrorScreenEvent> getAnalyticsEventsFlow() {
        return this.analyticsEventsFlow;
    }

    public final boolean getCompletionState() {
        return this.completionState;
    }

    public final LiveData<OtpErrorViewState> getViewState() {
        return this.viewState;
    }

    public void onBackpress() {
        this._viewState.setValue(OtpErrorViewState.Close.INSTANCE);
    }

    public void onClose() {
        this._viewState.setValue(OtpErrorViewState.Close.INSTANCE);
    }

    public final void secondaryLogin() {
        this.completionState = true;
        this._viewState.setValue(OtpErrorViewState.AlternateLogin.INSTANCE);
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpErrorViewModel$secondaryLogin$1(this, (C19340c<? super OtpErrorViewModel$secondaryLogin$1>) null), 3);
    }

    public final void setCompletionState(boolean z) {
        this.completionState = z;
    }
}
