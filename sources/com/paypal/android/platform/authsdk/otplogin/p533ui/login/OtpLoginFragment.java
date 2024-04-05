package com.paypal.android.platform.authsdk.otplogin.p533ui.login;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p013v4.media.C0070b;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.C2895z;
import com.braze.p044ui.inappmessage.views.C5701g;
import com.etsy.android.stylekit.views.C9060k;
import com.etsy.android.stylekit.views.ratings.C9072a;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.play.core.assetpacks.C15588c1;
import com.google.gson.C16708i;
import com.paypal.android.platform.authsdk.C17049R;
import com.paypal.android.platform.authsdk.authcommon.AuthCoreComponent;
import com.paypal.android.platform.authsdk.authcommon.Challenge;
import com.paypal.android.platform.authsdk.authcommon.ChallengeError;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.authcommon.ChallengeType;
import com.paypal.android.platform.authsdk.authcommon.CleanUp;
import com.paypal.android.platform.authsdk.authcommon.GRCWebViewLoader;
import com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.SecureKeyWrapper;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.android.platform.authsdk.authcommon.utils.PKCEParamHelper;
import com.paypal.android.platform.authsdk.authcommon.utils.WebViewUtils;
import com.paypal.android.platform.authsdk.authcommon.views.ProgressSpinnerView;
import com.paypal.android.platform.authsdk.otplogin.data.OtpLoginRepositoryImpl;
import com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData;
import com.paypal.android.platform.authsdk.otplogin.p533ui.OTPLoginHandlerKt;
import com.paypal.android.platform.authsdk.otplogin.p533ui.error.OtpErrorFragment;
import com.paypal.android.platform.authsdk.otplogin.p533ui.login.OtpLoginViewModel;
import com.paypal.android.platform.authsdk.otplogin.p533ui.login.PhoneNumberViewState;
import com.paypal.android.platform.authsdk.otplogin.tracking.IOTPLoginTracker;
import com.paypal.android.platform.authsdk.otplogin.tracking.OTPLoginAnalyticsManager;
import com.paypal.android.platform.authsdk.otplogin.tracking.OTPLoginAnalyticsViewModel;
import kotlin.C19285c;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C20018z;
import p114g4.C6865e;
import p628nj.C18263b;
import p716xo.C18829b;
import p753kq.C19857l;

/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginFragment */
public final class OtpLoginFragment extends Fragment {
    private static final String AUTH_HANDLER = "AUTH_HANDLER";
    private static final String CHALLENGE = "CHALLENGE";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String TAG = "OtpLoginFragment";
    private AuthCoreComponent authCoreComponent;
    private C18829b authHandlerProviders;
    /* access modifiers changed from: private */
    public Challenge challenge;
    /* access modifiers changed from: private */
    public C2895z<ChallengeResult> challengeResultLiveData = new C2895z<>();
    private ProgressSpinnerView loadingView;
    private final C19285c viewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(OtpLoginViewModel.class), new OtpLoginFragment$special$$inlined$viewModels$default$2(new OtpLoginFragment$special$$inlined$viewModels$default$1(this)), new OtpLoginFragment$viewModel$2(this));

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginFragment$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OtpLoginFragment getFragment(C18829b bVar, Challenge challenge, C2895z<ChallengeResult> zVar, OtpLoginRepositoryImpl otpLoginRepositoryImpl, CleanUp cleanUp) {
            C19383o.m32797g(bVar, "authHandlerProviders");
            C19383o.m32797g(challenge, "challenge");
            C19383o.m32797g(zVar, "challengeResultLiveData");
            C19383o.m32797g(otpLoginRepositoryImpl, "repositoryImpl");
            C19383o.m32797g(cleanUp, "cleanUp");
            OtpLoginFragment otpLoginFragment = new OtpLoginFragment();
            Bundle bundle = new Bundle();
            bundle.putBinder(OtpLoginFragment.AUTH_HANDLER, new ObjectWrapperForBinder(bVar));
            bundle.putBinder(OtpLoginFragment.CHALLENGE, new ObjectWrapperForBinder(challenge));
            bundle.putBinder(ConstantsKt.CLEANUP_HANDER_ARG, new ObjectWrapperForBinder(cleanUp));
            bundle.putBinder(OTPLoginHandlerKt.OTP_LOGIN_REPOSITORY_KEY, new ObjectWrapperForBinder(otpLoginRepositoryImpl));
            bundle.putBinder(ConstantsKt.CHALLENGE_RESULT_LIVE_DATA_ARG, new ObjectWrapperForBinder(zVar));
            otpLoginFragment.setArguments(bundle);
            return otpLoginFragment;
        }
    }

    private final void addUriChallengeEvents() {
        C15588c1.m25329i0(this).mo10834c(new OtpLoginFragment$addUriChallengeEvents$1(this, (C19340c<? super OtpLoginFragment$addUriChallengeEvents$1>) null));
    }

    /* access modifiers changed from: private */
    public final void bindLoadingView() {
        ProgressSpinnerView progressSpinnerView = this.loadingView;
        if (progressSpinnerView != null) {
            progressSpinnerView.showProgressSpinner();
            C18829b bVar = this.authHandlerProviders;
            if (bVar != null) {
                bVar.getAuthProviders().getAuthPresenter().onLoaderStatusChanged(true, this);
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
    public final void bindMultiplePhoneNumbersText(PhoneNumberViewState.MultiplePhoneNumbers multiplePhoneNumbers) {
        View view = getView();
        if (view != null) {
            ((TextInputLayout) view.findViewById(C17049R.C17051id.text_otp_phone_number_drop_down)).setVisibility(0);
            ((TextView) view.findViewById(C17049R.C17051id.text_otp_phone_number)).setVisibility(8);
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) view.findViewById(C17049R.C17051id.autoCompleteTextView);
            ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), C17049R.C17053layout.drop_down_phone_number, multiplePhoneNumbers.getPhoneNumbers());
            autoCompleteTextView.setAdapter(arrayAdapter);
            CharSequence charSequence = getViewModel().getSelectedPhoneNumber().get();
            if (charSequence == null || charSequence.length() == 0) {
                autoCompleteTextView.setText(String.valueOf(arrayAdapter.getItem(0)), false);
                getViewModel().getSelectedPhoneNumber().set(autoCompleteTextView.getText().toString());
            } else {
                autoCompleteTextView.setText(String.valueOf(getViewModel().getSelectedPhoneNumber().get()), false);
            }
            autoCompleteTextView.setOnItemClickListener(new C17088a(autoCompleteTextView, multiplePhoneNumbers, this, arrayAdapter));
            hideLoadingView();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: bindMultiplePhoneNumbersText$lambda-14$lambda-13  reason: not valid java name */
    public static final void m35130bindMultiplePhoneNumbersText$lambda14$lambda13(AutoCompleteTextView autoCompleteTextView, PhoneNumberViewState.MultiplePhoneNumbers multiplePhoneNumbers, OtpLoginFragment otpLoginFragment, ArrayAdapter arrayAdapter, AdapterView adapterView, View view, int i, long j) {
        C19383o.m32797g(multiplePhoneNumbers, "$state");
        C19383o.m32797g(otpLoginFragment, "this$0");
        C19383o.m32797g(arrayAdapter, "$arrayAdapter");
        autoCompleteTextView.setText(multiplePhoneNumbers.getPhoneNumbers().get(i));
        otpLoginFragment.getViewModel().getSelectedPhoneNumber().set(multiplePhoneNumbers.getPhoneNumbers().get(i));
        otpLoginFragment.getViewModel().phoneNumberSelectionChanges();
        otpLoginFragment.showDropdown(autoCompleteTextView, arrayAdapter);
    }

    /* access modifiers changed from: private */
    public final void bindPhoneNumberText(PhoneNumberViewState.SinglePhoneNumber singlePhoneNumber) {
        View view = getView();
        if (view != null) {
            ((TextInputLayout) view.findViewById(C17049R.C17051id.text_otp_phone_number_drop_down)).setVisibility(8);
            TextView textView = (TextView) view.findViewById(C17049R.C17051id.text_otp_phone_number);
            textView.setVisibility(0);
            textView.setText(singlePhoneNumber.getPhoneNumber());
            getViewModel().getSelectedPhoneNumber().set(singlePhoneNumber.getPhoneNumber());
            hideLoadingView();
        }
    }

    /* access modifiers changed from: private */
    public final C18829b getAuthHandlerProvidersFromIntent() {
        IBinder binder;
        Bundle arguments = getArguments();
        if (arguments == null || (binder = arguments.getBinder(AUTH_HANDLER)) == null) {
            throw new IllegalStateException("AuthHandlerProviders is needed for the OtpLoginFragment");
        }
        Object data = ((ObjectWrapperForBinder) binder).getData();
        if (data != null) {
            return (C18829b) data;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.platform.authsdk.AuthHandlerProviders");
    }

    private final IOTPLoginTracker getEventTracker(Bundle bundle) {
        IBinder binder = bundle == null ? null : bundle.getBinder("tracker_object");
        if (binder != null) {
            Object data = ((ObjectWrapperForBinder) binder).getData();
            if (data != null) {
                return (IOTPLoginTracker) data;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.otplogin.tracking.IOTPLoginTracker");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder");
    }

    /* access modifiers changed from: private */
    public final OtpLoginRepositoryImpl getRepositoryFromArguments() {
        IBinder binder;
        Bundle arguments = getArguments();
        if (arguments == null || (binder = arguments.getBinder(OTPLoginHandlerKt.OTP_LOGIN_REPOSITORY_KEY)) == null) {
            return null;
        }
        Object data = ((ObjectWrapperForBinder) binder).getData();
        if (data != null) {
            return (OtpLoginRepositoryImpl) data;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.otplogin.data.OtpLoginRepositoryImpl");
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

    private final void initGRCWebViewLoader() {
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
    public final void onCancelled(OtpLoginViewModel.Event.CANCELLED cancelled) {
        String str = this.TAG;
        Error error = cancelled.getError();
        Log.d(str, "onCancelled " + error);
        Log.d(this.TAG, "handlers live data update with onCancelled challenge");
        if (cancelled.getEndFlow()) {
            C18829b bVar = this.authHandlerProviders;
            if (bVar != null) {
                bVar.getAuthProviders().getAuthPresenter().onViewDismissRequested(this, true);
                C2895z<ChallengeResult> zVar = this.challengeResultLiveData;
                Challenge challenge2 = this.challenge;
                if (challenge2 != null) {
                    zVar.postValue(new ChallengeResult.Failed(challenge2.getRequestId(), new ChallengeError.Cancelled(cancelled.getError())));
                } else {
                    C19383o.m32805o("challenge");
                    throw null;
                }
            } else {
                C19383o.m32805o("authHandlerProviders");
                throw null;
            }
        } else {
            C18829b bVar2 = this.authHandlerProviders;
            if (bVar2 != null) {
                bVar2.getAuthProviders().getAuthPresenter().onViewDismissRequested(this, false);
            } else {
                C19383o.m32805o("authHandlerProviders");
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void onFailure(Exception exc) {
        C0070b.m187j("onFailure ", exc.getMessage(), this.TAG);
        Log.d(this.TAG, "handlers live data update with failure");
        if (C19383o.m32792b(exc.getMessage(), "triggeredWebAuth")) {
            C2895z<ChallengeResult> zVar = this.challengeResultLiveData;
            Challenge challenge2 = this.challenge;
            if (challenge2 != null) {
                zVar.postValue(new ChallengeResult.Failed(challenge2.getRequestId(), new ChallengeError.Failure(new Error(exc.getMessage()))));
            } else {
                C19383o.m32805o("challenge");
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void onSuccess(String str) {
        Log.d(this.TAG, "handlers live data update with success");
        OtpLoginRepositoryImpl repositoryFromArguments = getRepositoryFromArguments();
        if (repositoryFromArguments != null) {
            OTPLoginData data = repositoryFromArguments.getData();
            data.setNonce(str);
            data.setOtpSent(true);
            Context requireContext = requireContext();
            C19383o.m32796f(requireContext, "requireContext()");
            PKCEParamHelper pKCEParamHelper = new PKCEParamHelper((SecureKeyWrapper) null, requireContext, 1, (DefaultConstructorMarker) null);
            data.setCodeNonce(pKCEParamHelper.getAuthNonce());
            data.setCodeChallenge(pKCEParamHelper.getAuthCodeChallenge());
            data.setCodeVerifier(pKCEParamHelper.getCodeVerifier());
            C2895z<ChallengeResult> zVar = this.challengeResultLiveData;
            Challenge challenge2 = this.challenge;
            if (challenge2 != null) {
                zVar.postValue(new ChallengeResult.UnHandled(new Challenge.OTPLogin(challenge2.getRequestId(), new C16708i().mo59463j(data)), new C16708i().mo59463j(data), (ChallengeType) null, (String) null, (C20018z) null, (Object) null, (Error) null, (C19857l) null, 252, (DefaultConstructorMarker) null));
            } else {
                C19383o.m32805o("challenge");
                throw null;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.otplogin.data.OtpLoginRepositoryImpl");
        }
    }

    /* access modifiers changed from: private */
    public final void onUnHandled(OtpLoginViewModel.Event.UNHANDLED unhandled) {
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
    /* renamed from: onViewCreated$lambda-5  reason: not valid java name */
    public static final void m35131onViewCreated$lambda5(OtpLoginFragment otpLoginFragment, View view) {
        C19383o.m32797g(otpLoginFragment, "this$0");
        otpLoginFragment.getViewModel().onBackpress();
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-6  reason: not valid java name */
    public static final void m35132onViewCreated$lambda6(OtpLoginFragment otpLoginFragment, View view) {
        C19383o.m32797g(otpLoginFragment, "this$0");
        otpLoginFragment.getViewModel().onBackpress();
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-7  reason: not valid java name */
    public static final void m35133onViewCreated$lambda7(OtpLoginFragment otpLoginFragment, View view) {
        C19383o.m32797g(otpLoginFragment, "this$0");
        otpLoginFragment.getViewModel().secondaryButtonClicked();
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-8  reason: not valid java name */
    public static final void m35134onViewCreated$lambda8(OtpLoginFragment otpLoginFragment, View view) {
        C19383o.m32797g(otpLoginFragment, "this$0");
        otpLoginFragment.getViewModel().primaryButtonClicked();
    }

    private final void setup() {
        C15588c1.m25329i0(this).mo10834c(new OtpLoginFragment$setup$1(this, (C19340c<? super OtpLoginFragment$setup$1>) null));
        C15588c1.m25329i0(this).mo10834c(new OtpLoginFragment$setup$2(this, (C19340c<? super OtpLoginFragment$setup$2>) null));
        C2887s viewLifecycleOwner = getViewLifecycleOwner();
        C19383o.m32796f(viewLifecycleOwner, "viewLifecycleOwner");
        C15588c1.m25329i0(viewLifecycleOwner).mo10834c(new OtpLoginFragment$setup$3(this, (C19340c<? super OtpLoginFragment$setup$3>) null));
    }

    private final void showDropdown(AutoCompleteTextView autoCompleteTextView, ArrayAdapter<String> arrayAdapter) {
        Filter filter;
        if ((autoCompleteTextView.getText().toString().length() > 0) && arrayAdapter != null && (filter = arrayAdapter.getFilter()) != null) {
            filter.filter((CharSequence) null);
        }
    }

    public final OtpLoginViewModel getViewModel() {
        return (OtpLoginViewModel) this.viewModel$delegate.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addUriChallengeEvents();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C17049R.C17053layout.fragment_otp_login, viewGroup, false);
        this.authHandlerProviders = getAuthHandlerProvidersFromIntent();
        if (getArguments() != null) {
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
                IBinder binder2 = arguments.getBinder(AUTH_HANDLER);
                if (binder2 != null) {
                    Object data2 = ((ObjectWrapperForBinder) binder2).getData();
                    if (data2 != null) {
                        C18829b bVar = (C18829b) data2;
                        this.authHandlerProviders = bVar;
                        this.authCoreComponent = bVar.getAuthCoreComponent();
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
            initGRCWebViewLoader();
            setup();
            getViewModel().initOtpPhoneLayout();
            new OTPLoginAnalyticsViewModel(getViewModel().getAnalyticsEventsFlow(), this, getEventTracker(getArguments()), (OTPLoginAnalyticsManager) null, 8, (DefaultConstructorMarker) null);
        }
        C19383o.m32796f(inflate, "view");
        return inflate;
    }

    public void onDestroy() {
        hideLoadingView();
        C2895z<ChallengeResult> zVar = this.challengeResultLiveData;
        Challenge challenge2 = this.challenge;
        if (challenge2 != null) {
            zVar.postValue(new ChallengeResult.Failed(challenge2.getRequestId(), new ChallengeError.Cancelled(new Error(ConstantsKt.BACK_PRESS))));
            super.onDestroy();
            return;
        }
        C19383o.m32805o("challenge");
        throw null;
    }

    public void onResume() {
        super.onResume();
        getViewModel().fragmentLoadedEvent();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        ImageView imageView = (ImageView) view.findViewById(C17049R.C17051id.imageViewBackButton);
        imageView.setOnClickListener(new C5701g(this, 5));
        ImageView imageView2 = (ImageView) view.findViewById(C17049R.C17051id.imageView);
        ImageView imageView3 = (ImageView) view.findViewById(C17049R.C17051id.imageClose);
        imageView3.setOnClickListener(new C9060k(this, 5));
        ((Button) view.findViewById(C17049R.C17051id.button_alternate_login)).setOnClickListener(new C6865e(this, 6));
        ((Button) view.findViewById(C17049R.C17051id.continueButton)).setOnClickListener(new C9072a(this, 3));
        if (C19383o.m32792b("thirdParty", "thirdParty")) {
            getViewModel().displayBackButton$auth_sdk_thirdPartyRelease(false);
            getViewModel().displayCloseButton$auth_sdk_thirdPartyRelease(false);
            ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = 0;
                imageView2.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        if (C19383o.m32792b(getViewModel().getDisplayBackButtonEvent().getValue(), Boolean.TRUE)) {
            imageView.setVisibility(0);
            imageView3.setVisibility(0);
        } else {
            imageView.setVisibility(8);
            imageView3.setVisibility(8);
        }
        View findViewById = view.findViewById(C17049R.C17051id.loadingView);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.loadingView)");
        this.loadingView = (ProgressSpinnerView) findViewById;
        hideLoadingView();
    }
}
