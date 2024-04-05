package com.paypal.android.platform.authsdk.otplogin.p533ui.error;

import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2895z;
import com.etsy.android.p327ui.C10077j;
import com.etsy.android.stylekit.views.C9058i;
import com.google.android.material.button.MaterialButton;
import com.paypal.android.platform.authsdk.C17049R;
import com.paypal.android.platform.authsdk.authcommon.Challenge;
import com.paypal.android.platform.authsdk.authcommon.ChallengeError;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.android.platform.authsdk.otplogin.p533ui.error.OtpErrorViewModel;
import com.paypal.android.platform.authsdk.otplogin.tracking.ErrorAnalyticsManager;
import com.paypal.android.platform.authsdk.otplogin.tracking.ErrorScreenAnalyticsViewModel;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p628nj.C18263b;
import p716xo.C18829b;

/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.error.OtpErrorFragment */
public final class OtpErrorFragment extends Fragment {
    private static final String CHALLENGE = "CHALLENGE";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public C18829b authHandlerProviders;
    private Challenge challenge;
    private C2895z<ChallengeResult> challengeResultLiveData = new C2895z<>();
    private final C19285c viewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(OtpErrorViewModel.class), new OtpErrorFragment$special$$inlined$viewModels$default$2(new OtpErrorFragment$special$$inlined$viewModels$default$1(this)), new OtpErrorFragment$viewModel$2(this));

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.error.OtpErrorFragment$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OtpErrorFragment getFragment(C18829b bVar, Challenge challenge, C2895z<ChallengeResult> zVar) {
            C19383o.m32797g(bVar, "authHandlerProviders");
            C19383o.m32797g(challenge, "challenge");
            C19383o.m32797g(zVar, "challengeResultLiveData");
            OtpErrorFragment otpErrorFragment = new OtpErrorFragment();
            Bundle bundle = new Bundle();
            bundle.putBinder(ConstantsKt.AUTH_HANDLER, new ObjectWrapperForBinder(bVar));
            bundle.putBinder(ConstantsKt.CHALLENGE_RESULT_LIVE_DATA_ARG, new ObjectWrapperForBinder(zVar));
            bundle.putBinder(OtpErrorFragment.CHALLENGE, new ObjectWrapperForBinder(challenge));
            otpErrorFragment.setArguments(bundle);
            return otpErrorFragment;
        }
    }

    /* access modifiers changed from: private */
    public final C18829b getAuthHandlerProvidersFromIntent() {
        IBinder binder;
        Bundle arguments = getArguments();
        if (arguments == null || (binder = arguments.getBinder(ConstantsKt.AUTH_HANDLER)) == null) {
            throw new IllegalStateException("AuthHandlerProviders is needed for the SplitLoginFragment");
        }
        Object data = ((ObjectWrapperForBinder) binder).getData();
        if (data != null) {
            return (C18829b) data;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.platform.authsdk.AuthHandlerProviders");
    }

    private final OtpErrorViewModel getViewModel() {
        return (OtpErrorViewModel) this.viewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-4  reason: not valid java name */
    public static final void m35128onCreateView$lambda4(OtpErrorFragment otpErrorFragment, OtpErrorViewModel.OtpErrorViewState otpErrorViewState) {
        C19383o.m32797g(otpErrorFragment, "this$0");
        if (!(otpErrorViewState instanceof OtpErrorViewModel.OtpErrorViewState.Ready)) {
            if (otpErrorViewState instanceof OtpErrorViewModel.OtpErrorViewState.Close) {
                C2895z<ChallengeResult> zVar = otpErrorFragment.challengeResultLiveData;
                Challenge challenge2 = otpErrorFragment.challenge;
                if (challenge2 != null) {
                    zVar.postValue(new ChallengeResult.Failed(challenge2.getRequestId(), new ChallengeError.Cancelled(new Error("User Cancelled"))));
                    C18829b bVar = otpErrorFragment.authHandlerProviders;
                    if (bVar != null) {
                        bVar.getAuthProviders().getAuthPresenter().onViewDismissRequested(otpErrorFragment, true);
                    } else {
                        C19383o.m32805o("authHandlerProviders");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("challenge");
                    throw null;
                }
            } else if (otpErrorViewState instanceof OtpErrorViewModel.OtpErrorViewState.AlternateLogin) {
                C2895z<ChallengeResult> zVar2 = otpErrorFragment.challengeResultLiveData;
                Challenge challenge3 = otpErrorFragment.challenge;
                if (challenge3 != null) {
                    zVar2.postValue(new ChallengeResult.Failed(challenge3.getRequestId(), new ChallengeError.Failure(new Error("triggeredWebAuth"))));
                    C18829b bVar2 = otpErrorFragment.authHandlerProviders;
                    if (bVar2 != null) {
                        bVar2.getAuthProviders().getAuthPresenter().onViewDismissRequested(otpErrorFragment, true);
                    } else {
                        C19383o.m32805o("authHandlerProviders");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("challenge");
                    throw null;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-5  reason: not valid java name */
    public static final void m35129onViewCreated$lambda5(OtpErrorFragment otpErrorFragment, View view) {
        C19383o.m32797g(otpErrorFragment, "this$0");
        otpErrorFragment.getViewModel().secondaryLogin();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C17049R.C17053layout.fragment_otp_error, viewGroup, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            IBinder binder = arguments.getBinder(ConstantsKt.CHALLENGE_RESULT_LIVE_DATA_ARG);
            if (binder != null) {
                Object data = ((ObjectWrapperForBinder) binder).getData();
                if (data != null) {
                    this.challengeResultLiveData = (C2895z) data;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.paypal.android.platform.authsdk.authcommon.ChallengeResult>");
                }
            }
            IBinder binder2 = arguments.getBinder(ConstantsKt.AUTH_HANDLER);
            if (binder2 != null) {
                Object data2 = ((ObjectWrapperForBinder) binder2).getData();
                if (data2 != null) {
                    this.authHandlerProviders = (C18829b) data2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.paypal.platform.authsdk.AuthHandlerProviders");
                }
            }
            IBinder binder3 = arguments.getBinder(CHALLENGE);
            if (binder3 != null) {
                Object data3 = ((ObjectWrapperForBinder) binder3).getData();
                if (data3 != null) {
                    this.challenge = (Challenge) data3;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.authcommon.Challenge");
                }
            }
        }
        getViewModel().getViewState().observe(getViewLifecycleOwner(), new C10077j(this, 3));
        new ErrorScreenAnalyticsViewModel(getViewModel().getAnalyticsEventsFlow(), this, new OtpErrorFragment$onCreateView$3(this), (ErrorAnalyticsManager) null, 8, (DefaultConstructorMarker) null);
        C19383o.m32796f(inflate, "root");
        return inflate;
    }

    public void onDestroy() {
        if (!getViewModel().getCompletionState()) {
            C2895z<ChallengeResult> zVar = this.challengeResultLiveData;
            Challenge challenge2 = this.challenge;
            if (challenge2 != null) {
                zVar.postValue(new ChallengeResult.Failed(challenge2.getRequestId(), new ChallengeError.Cancelled(new Error("User Cancelled"))));
            } else {
                C19383o.m32805o("challenge");
                throw null;
            }
        }
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        getViewModel().fragmentLoadedEvent();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        MaterialButton materialButton = (MaterialButton) view.findViewById(C17049R.C17051id.usePasswordButton);
        if (materialButton != null) {
            materialButton.setOnClickListener(new C9058i(this, 4));
        }
    }
}
