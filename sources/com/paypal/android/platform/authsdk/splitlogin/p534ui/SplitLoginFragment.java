package com.paypal.android.platform.authsdk.splitlogin.p534ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p013v4.media.C0070b;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2895z;
import com.etsy.android.feedback.view.C6486a;
import com.etsy.android.stylekit.views.C9053d;
import com.etsy.android.stylekit.views.C9054e;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.play.core.assetpacks.C15588c1;
import com.google.gson.C16708i;
import com.paypal.android.platform.authsdk.C17049R;
import com.paypal.android.platform.authsdk.authcommon.AuthCoreComponent;
import com.paypal.android.platform.authsdk.authcommon.Challenge;
import com.paypal.android.platform.authsdk.authcommon.ChallengeError;
import com.paypal.android.platform.authsdk.authcommon.ChallengeKt;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.authcommon.ChallengeType;
import com.paypal.android.platform.authsdk.authcommon.CleanUp;
import com.paypal.android.platform.authsdk.authcommon.GRCWebViewLoader;
import com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder;
import com.paypal.android.platform.authsdk.authcommon.model.ClientConfig;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.SecureKeyWrapper;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.android.platform.authsdk.authcommon.utils.PKCEParamHelper;
import com.paypal.android.platform.authsdk.authcommon.utils.WebViewUtils;
import com.paypal.android.platform.authsdk.authcommon.views.ProgressSpinnerView;
import com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData;
import com.paypal.android.platform.authsdk.otplogin.p533ui.error.OtpErrorFragment;
import com.paypal.android.platform.authsdk.splitlogin.data.SplitLoginRepositoryImpl;
import com.paypal.android.platform.authsdk.splitlogin.domain.AuthOptionChallengeData;
import com.paypal.android.platform.authsdk.splitlogin.p534ui.SplitLoginViewModel;
import com.paypal.android.platform.authsdk.splitlogin.tracking.ISplitLoginTracker;
import com.paypal.android.platform.authsdk.splitlogin.tracking.SplitLoginAnalyticsManager;
import com.paypal.android.platform.authsdk.splitlogin.tracking.SplitLoginAnalyticsViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19285c;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C20018z;
import p251u1.C8115a;
import p260v0.C8184a;
import p628nj.C18263b;
import p716xo.C18829b;
import p753kq.C19857l;

/* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginFragment */
public final class SplitLoginFragment extends Fragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String TAG;
    private SplitLoginAnalyticsViewModel analyticsViewModel;
    private AuthCoreComponent authCoreComponent;
    private C18829b authHandlerProviders;
    /* access modifiers changed from: private */
    public Challenge challenge;
    /* access modifiers changed from: private */
    public C2895z<ChallengeResult> challengeResultLiveData;
    private LinearLayoutCompat emailErrorView;
    private TextInputLayout emailTextInputLayout;
    private ProgressSpinnerView loadingView;
    private final C19285c viewModel$delegate;

    /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginFragment$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SplitLoginFragment getFragment(C18829b bVar, Challenge challenge, C2895z<ChallengeResult> zVar, SplitLoginRepositoryImpl splitLoginRepositoryImpl, CleanUp cleanUp) {
            C19383o.m32797g(bVar, "authHandlerProviders");
            C19383o.m32797g(challenge, "challenge");
            C19383o.m32797g(zVar, "challengeResultLiveData");
            C19383o.m32797g(splitLoginRepositoryImpl, "repositoryImpl");
            C19383o.m32797g(cleanUp, "cleanUp");
            SplitLoginFragment splitLoginFragment = new SplitLoginFragment((DefaultConstructorMarker) null);
            Bundle bundle = new Bundle();
            bundle.putBinder(ConstantsKt.AUTH_HANDLER, new ObjectWrapperForBinder(bVar));
            bundle.putBinder("challenge", new ObjectWrapperForBinder(challenge));
            bundle.putBinder(ConstantsKt.CLEANUP_HANDER_ARG, new ObjectWrapperForBinder(cleanUp));
            bundle.putBinder(SplitLoginHandlerKt.SPLIT_LOGIN_REPOSITORY_KEY, new ObjectWrapperForBinder(splitLoginRepositoryImpl));
            bundle.putBinder(ConstantsKt.CHALLENGE_RESULT_LIVE_DATA_ARG, new ObjectWrapperForBinder(zVar));
            splitLoginFragment.setArguments(bundle);
            return splitLoginFragment;
        }
    }

    private SplitLoginFragment() {
        this.TAG = "SplitLoginFragment";
        this.viewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(SplitLoginViewModel.class), new SplitLoginFragment$special$$inlined$viewModels$default$2(new SplitLoginFragment$special$$inlined$viewModels$default$1(this)), new SplitLoginFragment$viewModel$2(this));
        this.challengeResultLiveData = new C2895z<>();
    }

    public /* synthetic */ SplitLoginFragment(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void addUriChallengeEvents() {
        C15588c1.m25329i0(this).mo10834c(new SplitLoginFragment$addUriChallengeEvents$1(this, (C19340c<? super SplitLoginFragment$addUriChallengeEvents$1>) null));
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

    private final ISplitLoginTracker getEventTracker(Bundle bundle) {
        IBinder binder = bundle == null ? null : bundle.getBinder("tracker_object");
        if (binder != null) {
            Object data = ((ObjectWrapperForBinder) binder).getData();
            if (data != null) {
                return (ISplitLoginTracker) data;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.splitlogin.tracking.ISplitLoginTracker");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder");
    }

    /* access modifiers changed from: private */
    public final SplitLoginRepositoryImpl getRepositoryFromIntent() {
        IBinder binder;
        Bundle arguments = getArguments();
        if (arguments == null || (binder = arguments.getBinder(SplitLoginHandlerKt.SPLIT_LOGIN_REPOSITORY_KEY)) == null) {
            return null;
        }
        Object data = ((ObjectWrapperForBinder) binder).getData();
        if (data != null) {
            return (SplitLoginRepositoryImpl) data;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.splitlogin.data.SplitLoginRepositoryImpl");
    }

    /* access modifiers changed from: private */
    public final void hideLoadingView() {
        ProgressSpinnerView progressSpinnerView = this.loadingView;
        if (progressSpinnerView != null) {
            progressSpinnerView.hideProgressSpinner();
            C18829b bVar = this.authHandlerProviders;
            if (bVar != null) {
                bVar.getAuthProviders().getAuthPresenter().onLoaderStatusChanged(false, this);
            } else {
                C19383o.m32805o("authHandlerProviders");
                throw null;
            }
        } else {
            C19383o.m32805o("loadingView");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public final void launchGenericErrorFragment() {
        OtpErrorFragment.Companion companion = OtpErrorFragment.Companion;
        C18829b bVar = this.authHandlerProviders;
        if (bVar != null) {
            Challenge challenge2 = this.challenge;
            if (challenge2 != null) {
                OtpErrorFragment fragment = companion.getFragment(bVar, challenge2, this.challengeResultLiveData);
                C18829b bVar2 = this.authHandlerProviders;
                if (bVar2 != null) {
                    bVar2.getAuthProviders().getAuthPresenter().onViewPresentRequested(fragment, false);
                } else {
                    C19383o.m32805o("authHandlerProviders");
                    throw null;
                }
            } else {
                C19383o.m32805o("challenge");
                throw null;
            }
        } else {
            C19383o.m32805o("authHandlerProviders");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public final void onCancelled(SplitLoginViewModel.Event.CANCELLED cancelled) {
        String str = this.TAG;
        Error error = cancelled.getError();
        Log.d(str, "onCancelled " + error);
        Log.d(this.TAG, "handlers live data update with onCancelled challenge");
        C2895z<ChallengeResult> zVar = this.challengeResultLiveData;
        Challenge challenge2 = this.challenge;
        if (challenge2 != null) {
            zVar.postValue(new ChallengeResult.Failed(challenge2.getRequestId(), new ChallengeError.Cancelled(cancelled.getError())));
        } else {
            C19383o.m32805o("challenge");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public final void onFailure(Exception exc) {
        C0070b.m187j("onFailure ", exc.getMessage(), this.TAG);
        Log.d(this.TAG, "handlers live data update with failure");
        String message = exc.getMessage();
        IBinder iBinder = null;
        if (C19383o.m32792b(message, "triggeredWebAuth")) {
            C2895z<ChallengeResult> zVar = this.challengeResultLiveData;
            Challenge challenge2 = this.challenge;
            if (challenge2 != null) {
                zVar.postValue(new ChallengeResult.Failed(challenge2.getRequestId(), new ChallengeError.Failure(new Error(exc.getMessage()))));
            } else {
                C19383o.m32805o("challenge");
                throw null;
            }
        } else if (C19383o.m32792b(message, "forgetUserError")) {
            C8115a.m16322a(requireContext()).mo20709c(new Intent("forgotUserNameReceiver"));
        } else {
            C2895z<ChallengeResult> zVar2 = this.challengeResultLiveData;
            Bundle arguments = getArguments();
            if (arguments != null) {
                iBinder = arguments.getBinder("challenge");
            }
            if (iBinder != null) {
                Object data = ((ObjectWrapperForBinder) iBinder).getData();
                if (data != null) {
                    zVar2.postValue(new ChallengeResult.Failed(((Challenge) data).getRequestId(), new ChallengeError.Failure(new Error(exc.getMessage(), exc.getCause()))));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.authcommon.Challenge");
            }
            throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder");
        }
    }

    /* access modifiers changed from: private */
    public final void onSuccess(List<AuthOptionChallengeData> list) {
        Log.d(this.TAG, "handlers live data update with success");
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (C19383o.m32792b(((AuthOptionChallengeData) next).getAuthOption(), ConstantsKt.OTP)) {
                arrayList.add(next);
            }
        }
        AuthOptionChallengeData authOptionChallengeData = (AuthOptionChallengeData) arrayList.get(0);
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        PKCEParamHelper pKCEParamHelper = new PKCEParamHelper((SecureKeyWrapper) null, requireContext, 1, (DefaultConstructorMarker) null);
        String valueOf = String.valueOf(getViewModel().getEmailEditText().get());
        AuthCoreComponent authCoreComponent2 = this.authCoreComponent;
        if (authCoreComponent2 != null) {
            ClientConfig clientConfig = authCoreComponent2.getClientConfig();
            String nonce = authOptionChallengeData.getNonce();
            SplitLoginRepositoryImpl repositoryFromIntent = getRepositoryFromIntent();
            if (repositoryFromIntent != null) {
                String thirdPartyClientID = repositoryFromIntent.getData().getThirdPartyClientID();
                String authNonce = pKCEParamHelper.getAuthNonce();
                String authCodeChallenge = pKCEParamHelper.getAuthCodeChallenge();
                String codeVerifier = pKCEParamHelper.getCodeVerifier();
                SplitLoginRepositoryImpl repositoryFromIntent2 = getRepositoryFromIntent();
                if (repositoryFromIntent2 != null) {
                    OTPLoginData oTPLoginData = r2;
                    OTPLoginData oTPLoginData2 = new OTPLoginData(clientConfig, valueOf, (String) null, nonce, authOptionChallengeData, thirdPartyClientID, (String) null, (String) null, authNonce, codeVerifier, authCodeChallenge, false, repositoryFromIntent2.getData().getRiskVisitorId(), 2244, (DefaultConstructorMarker) null);
                    C2895z<ChallengeResult> zVar = this.challengeResultLiveData;
                    Challenge challenge2 = this.challenge;
                    if (challenge2 != null) {
                        Challenge.OTPLogin oTPLogin = new Challenge.OTPLogin(challenge2.getRequestId(), new C16708i().mo59463j(oTPLoginData));
                        String j = new C16708i().mo59463j(authOptionChallengeData);
                        String challengeType = authOptionChallengeData.getChallengeType();
                        zVar.postValue(new ChallengeResult.UnHandled(oTPLogin, j, challengeType == null ? null : ChallengeKt.toChallengeType(challengeType), (String) null, (C20018z) null, (Object) null, (Error) null, (C19857l) null, 248, (DefaultConstructorMarker) null));
                        return;
                    }
                    C19383o.m32805o("challenge");
                    throw null;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.splitlogin.data.SplitLoginRepositoryImpl");
            }
            throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.splitlogin.data.SplitLoginRepositoryImpl");
        }
        C19383o.m32805o(ConstantsKt.AUTH_CORE_COMPONENT);
        throw null;
    }

    /* access modifiers changed from: private */
    public final void onUnHandled(SplitLoginViewModel.Event.UNHANDLED unhandled) {
        C0070b.m187j("onUnHandled ", unhandled.getRawJSONResponse(), this.TAG);
        Log.d(this.TAG, "handlers live data update with unhandled challenge");
        C2895z<ChallengeResult> zVar = this.challengeResultLiveData;
        Challenge challenge2 = this.challenge;
        if (challenge2 != null) {
            zVar.postValue(new ChallengeResult.UnHandled(challenge2, unhandled.getRawJSONResponse(), (ChallengeType) null, (String) null, (C20018z) null, (Object) null, (Error) null, (C19857l) null, 248, (DefaultConstructorMarker) null));
        } else {
            C19383o.m32805o("challenge");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public final void setEmailEntryState(View view) {
        hideLoadingView();
    }

    /* access modifiers changed from: private */
    public final void setEmailErrorState(View view) {
        hideLoadingView();
    }

    /* access modifiers changed from: private */
    public final Boolean setLoadingState(View view) {
        InputMethodManager inputMethodManager;
        ProgressSpinnerView progressSpinnerView = this.loadingView;
        if (progressSpinnerView != null) {
            progressSpinnerView.showProgressSpinner();
            C18829b bVar = this.authHandlerProviders;
            if (bVar != null) {
                bVar.getAuthProviders().getAuthPresenter().onLoaderStatusChanged(true, this);
                View currentFocus = requireActivity().getCurrentFocus();
                if (currentFocus == null || (inputMethodManager = (InputMethodManager) requireContext().getSystemService("input_method")) == null) {
                    return null;
                }
                return Boolean.valueOf(inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0));
            }
            C19383o.m32805o("authHandlerProviders");
            throw null;
        }
        C19383o.m32805o("loadingView");
        throw null;
    }

    private final void setUpViewsAction(View view) {
        View findViewById = view.findViewById(C17049R.C17051id.emailTextInputLayout);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.emailTextInputLayout)");
        this.emailTextInputLayout = (TextInputLayout) findViewById;
        View findViewById2 = view.findViewById(C17049R.C17051id.emailErrorView);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.emailErrorView)");
        this.emailErrorView = (LinearLayoutCompat) findViewById2;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) view.findViewById(C17049R.C17051id.closeButton);
        if (appCompatImageButton != null) {
            if (C19383o.m32792b("thirdParty", "thirdParty")) {
                appCompatImageButton.setVisibility(8);
            }
            appCompatImageButton.setOnClickListener(new C6486a(this, 5));
        }
        MaterialButton materialButton = (MaterialButton) view.findViewById(C17049R.C17051id.forgotLoginButton);
        if (materialButton != null) {
            materialButton.setOnClickListener(new C9053d(this, 6));
        }
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C17049R.C17051id.nextButton);
        if (materialButton2 != null) {
            materialButton2.setOnClickListener(new C9054e(this, 5));
        }
        TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(C17049R.C17051id.emailTextInputEditText);
        if (textInputEditText != null) {
            textInputEditText.addTextChangedListener(new C17107x67207e08(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpViewsAction$lambda-4  reason: not valid java name */
    public static final void m35140setUpViewsAction$lambda4(SplitLoginFragment splitLoginFragment, View view) {
        C19383o.m32797g(splitLoginFragment, "this$0");
        splitLoginFragment.getViewModel().onCloseButtonClicked();
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpViewsAction$lambda-5  reason: not valid java name */
    public static final void m35141setUpViewsAction$lambda5(SplitLoginFragment splitLoginFragment, View view) {
        C19383o.m32797g(splitLoginFragment, "this$0");
        splitLoginFragment.getViewModel().onForgotUsernameClicked();
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpViewsAction$lambda-6  reason: not valid java name */
    public static final void m35142setUpViewsAction$lambda6(SplitLoginFragment splitLoginFragment, View view) {
        C19383o.m32797g(splitLoginFragment, "this$0");
        splitLoginFragment.getViewModel().onNextClicked();
        splitLoginFragment.updateErrorView();
    }

    private final void setup() {
        C15588c1.m25329i0(this).mo10834c(new SplitLoginFragment$setup$1(this, (C19340c<? super SplitLoginFragment$setup$1>) null));
        C15588c1.m25329i0(this).mo10834c(new SplitLoginFragment$setup$2(this, (C19340c<? super SplitLoginFragment$setup$2>) null));
    }

    /* access modifiers changed from: private */
    public final void updateErrorView() {
        if (getViewModel().isEmailInErrorState().get()) {
            TextInputLayout textInputLayout = this.emailTextInputLayout;
            if (textInputLayout != null) {
                Context requireContext = requireContext();
                int i = C17049R.color.paypal_auth_error;
                Object obj = C8184a.f17966a;
                textInputLayout.setBoxStrokeColor(C8184a.C8188d.m16468a(requireContext, i));
                LinearLayoutCompat linearLayoutCompat = this.emailErrorView;
                if (linearLayoutCompat != null) {
                    linearLayoutCompat.setVisibility(0);
                } else {
                    C19383o.m32805o("emailErrorView");
                    throw null;
                }
            } else {
                C19383o.m32805o("emailTextInputLayout");
                throw null;
            }
        } else {
            TextInputLayout textInputLayout2 = this.emailTextInputLayout;
            if (textInputLayout2 != null) {
                Context requireContext2 = requireContext();
                int i2 = C17049R.color.paypal_auth_edit_text_focus;
                Object obj2 = C8184a.f17966a;
                textInputLayout2.setBoxStrokeColor(C8184a.C8188d.m16468a(requireContext2, i2));
                LinearLayoutCompat linearLayoutCompat2 = this.emailErrorView;
                if (linearLayoutCompat2 != null) {
                    linearLayoutCompat2.setVisibility(8);
                } else {
                    C19383o.m32805o("emailErrorView");
                    throw null;
                }
            } else {
                C19383o.m32805o("emailTextInputLayout");
                throw null;
            }
        }
    }

    public final String getTAG() {
        return this.TAG;
    }

    public final SplitLoginViewModel getViewModel() {
        return (SplitLoginViewModel) this.viewModel$delegate.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addUriChallengeEvents();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C17049R.C17053layout.fragment_split_login, viewGroup, false);
        C19383o.m32796f(inflate, "inflater.inflate(R.layou…_login, container, false)");
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        hideLoadingView();
        C2895z<ChallengeResult> zVar = this.challengeResultLiveData;
        Challenge challenge2 = this.challenge;
        if (challenge2 != null) {
            zVar.postValue(new ChallengeResult.Failed(challenge2.getRequestId(), new ChallengeError.Cancelled(new Error("User Cancelled"))));
        } else {
            C19383o.m32805o("challenge");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        getViewModel().fragmentLoadedEvent();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
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
            IBinder binder2 = arguments.getBinder("challenge");
            if (binder2 != null) {
                Object data2 = ((ObjectWrapperForBinder) binder2).getData();
                if (data2 != null) {
                    this.challenge = (Challenge) data2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.authcommon.Challenge");
                }
            }
            C18829b authHandlerProvidersFromIntent = getAuthHandlerProvidersFromIntent();
            this.authHandlerProviders = authHandlerProvidersFromIntent;
            if (authHandlerProvidersFromIntent != null) {
                this.authCoreComponent = authHandlerProvidersFromIntent.getAuthCoreComponent();
                this.analyticsViewModel = new SplitLoginAnalyticsViewModel(getViewModel().getAnalyticsEventsFlow(), this, getEventTracker(getArguments()), (SplitLoginAnalyticsManager) null, 8, (DefaultConstructorMarker) null);
            } else {
                C19383o.m32805o("authHandlerProviders");
                throw null;
            }
        }
        setUpViewsAction(view);
        setup();
        View findViewById = view.findViewById(C17049R.C17051id.loadingView);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.loadingView)");
        this.loadingView = (ProgressSpinnerView) findViewById;
        hideLoadingView();
        if (this.authHandlerProviders != null) {
            WebViewUtils.Companion companion = WebViewUtils.Companion;
            FragmentActivity requireActivity = requireActivity();
            C19383o.m32796f(requireActivity, "requireActivity()");
            if (companion.isWebViewAvailable$auth_sdk_thirdPartyRelease(requireActivity)) {
                FragmentActivity requireActivity2 = requireActivity();
                C19383o.m32796f(requireActivity2, "requireActivity()");
                C18829b bVar = this.authHandlerProviders;
                if (bVar != null) {
                    String baseUrl = bVar.getAuthCoreComponent().getClientConfig().getBaseUrl();
                    C18829b bVar2 = this.authHandlerProviders;
                    if (bVar2 != null) {
                        GRCWebViewLoader gRCWebViewLoader = new GRCWebViewLoader(requireActivity2, baseUrl, bVar2.getAuthCoreComponent().getClientConfig().getAppInfo().getName());
                        C18829b bVar3 = this.authHandlerProviders;
                        if (bVar3 != null) {
                            gRCWebViewLoader.loadAdsWithChallengeId(bVar3.getAuthCoreComponent().getClientConfig().getGuid());
                        } else {
                            C19383o.m32805o("authHandlerProviders");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("authHandlerProviders");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("authHandlerProviders");
                    throw null;
                }
            }
        }
        C15588c1.m25329i0(this).mo10834c(new SplitLoginFragment$onViewCreated$3(this, view, (C19340c<? super SplitLoginFragment$onViewCreated$3>) null));
    }
}
