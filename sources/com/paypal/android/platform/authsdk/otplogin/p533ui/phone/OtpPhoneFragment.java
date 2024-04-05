package com.paypal.android.platform.authsdk.otplogin.p533ui.phone;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p013v4.media.C0070b;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableField;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2895z;
import com.braze.p044ui.inappmessage.factories.C5651e;
import com.etsy.android.p327ui.cart.bottomsheets.applycoupon.C9258c;
import com.etsy.android.stylekit.views.C9050a;
import com.etsy.android.stylekit.views.C9052c;
import com.etsy.android.stylekit.views.C9064o;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.play.core.assetpacks.C15588c1;
import com.paypal.android.platform.authsdk.C17049R;
import com.paypal.android.platform.authsdk.authcommon.AuthCoreComponent;
import com.paypal.android.platform.authsdk.authcommon.Challenge;
import com.paypal.android.platform.authsdk.authcommon.ChallengeError;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResultData;
import com.paypal.android.platform.authsdk.authcommon.ChallengeType;
import com.paypal.android.platform.authsdk.authcommon.CleanUp;
import com.paypal.android.platform.authsdk.authcommon.GRCWebViewLoader;
import com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.android.platform.authsdk.authcommon.utils.WebViewUtils;
import com.paypal.android.platform.authsdk.authcommon.views.ProgressSpinnerView;
import com.paypal.android.platform.authsdk.otplogin.data.OtpLoginRepositoryImpl;
import com.paypal.android.platform.authsdk.otplogin.domain.OtpLoginResultData;
import com.paypal.android.platform.authsdk.otplogin.domain.Token;
import com.paypal.android.platform.authsdk.otplogin.domain.UserAccessToken;
import com.paypal.android.platform.authsdk.otplogin.p533ui.OTPLoginHandlerKt;
import com.paypal.android.platform.authsdk.otplogin.p533ui.error.OtpErrorFragment;
import com.paypal.android.platform.authsdk.otplogin.p533ui.phone.OtpPhoneViewModel;
import com.paypal.android.platform.authsdk.otplogin.p533ui.phone.OtpPhoneViewState;
import com.paypal.android.platform.authsdk.otplogin.tracking.IOTPLoginTracker;
import com.paypal.android.platform.authsdk.otplogin.tracking.OTPLoginAnalyticsManager;
import com.paypal.android.platform.authsdk.otplogin.tracking.OTPLoginAnalyticsViewModel;
import java.util.List;
import kotlin.C19285c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C20018z;
import p568fn.C17782b;
import p628nj.C18263b;
import p716xo.C18829b;
import p732zo.C18973a;
import p753kq.C19857l;

/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneFragment */
public final class OtpPhoneFragment extends Fragment {
    private static final String AUTH_HANDLER = "AUTH_HANDLER";
    private static final String CHALLENGE = "CHALLENGE";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String FORMATTED_PHONE_NUMBER = "FORMATTED_PHONE_NUMBER";
    private final String TAG = "OtpPhoneFragment";
    private AuthCoreComponent authCoreComponent;
    /* access modifiers changed from: private */
    public C18829b authHandlerProviders;
    /* access modifiers changed from: private */
    public Challenge challenge;
    /* access modifiers changed from: private */
    public C2895z<ChallengeResult> challengeResultLiveData = new C2895z<>();
    private LinearLayoutCompat emailErrorView;
    private ProgressSpinnerView loadingView;
    private TextInputEditText otpEntry1;
    private TextInputEditText otpEntry2;
    private TextInputEditText otpEntry3;
    private TextInputEditText otpEntry4;
    private TextInputEditText otpEntry5;
    private TextInputEditText otpEntry6;
    private final C19285c viewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(OtpPhoneViewModel.class), new OtpPhoneFragment$special$$inlined$viewModels$default$2(new OtpPhoneFragment$special$$inlined$viewModels$default$1(this)), new OtpPhoneFragment$viewModel$2(this));

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneFragment$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OtpPhoneFragment getFragment(String str, C18829b bVar, Challenge challenge, C2895z<ChallengeResult> zVar, OtpLoginRepositoryImpl otpLoginRepositoryImpl, CleanUp cleanUp) {
            C19383o.m32797g(str, "selectedPhoneNumber");
            C19383o.m32797g(bVar, "authHandlerProviders");
            C19383o.m32797g(challenge, "challenge");
            C19383o.m32797g(zVar, "challengeResultLiveData");
            C19383o.m32797g(otpLoginRepositoryImpl, "repositoryImpl");
            C19383o.m32797g(cleanUp, "cleanUp");
            OtpPhoneFragment otpPhoneFragment = new OtpPhoneFragment();
            Bundle bundle = new Bundle();
            bundle.putString(OtpPhoneFragment.FORMATTED_PHONE_NUMBER, str);
            bundle.putBinder(OtpPhoneFragment.AUTH_HANDLER, new ObjectWrapperForBinder(bVar));
            bundle.putBinder(OtpPhoneFragment.CHALLENGE, new ObjectWrapperForBinder(challenge));
            bundle.putBinder(ConstantsKt.CLEANUP_HANDER_ARG, new ObjectWrapperForBinder(cleanUp));
            bundle.putBinder(OTPLoginHandlerKt.OTP_LOGIN_REPOSITORY_KEY, new ObjectWrapperForBinder(otpLoginRepositoryImpl));
            bundle.putBinder(ConstantsKt.CHALLENGE_RESULT_LIVE_DATA_ARG, new ObjectWrapperForBinder(zVar));
            otpPhoneFragment.setArguments(bundle);
            return otpPhoneFragment;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneFragment$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OtpError.values().length];
            iArr[OtpError.CheckCode.ordinal()] = 1;
            iArr[OtpError.CodeExpired.ordinal()] = 2;
            iArr[OtpError.AttemptThreshold.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void addUriChallengeEvents() {
        C15588c1.m25329i0(this).mo10834c(new OtpPhoneFragment$addUriChallengeEvents$1(this, (C19340c<? super OtpPhoneFragment$addUriChallengeEvents$1>) null));
    }

    private final void bindOtpEntryEditText() {
        View requireView = requireView();
        C19383o.m32796f(requireView, "requireView()");
        View findViewById = requireView.findViewById(C17049R.C17051id.otp_entry_1);
        C19383o.m32796f(findViewById, "viewData.findViewById(R.id.otp_entry_1)");
        this.otpEntry1 = (TextInputEditText) findViewById;
        View findViewById2 = requireView.findViewById(C17049R.C17051id.otp_entry_2);
        C19383o.m32796f(findViewById2, "viewData.findViewById(R.id.otp_entry_2)");
        this.otpEntry2 = (TextInputEditText) findViewById2;
        View findViewById3 = requireView.findViewById(C17049R.C17051id.otp_entry_3);
        C19383o.m32796f(findViewById3, "viewData.findViewById(R.id.otp_entry_3)");
        this.otpEntry3 = (TextInputEditText) findViewById3;
        View findViewById4 = requireView.findViewById(C17049R.C17051id.otp_entry_4);
        C19383o.m32796f(findViewById4, "viewData.findViewById(R.id.otp_entry_4)");
        this.otpEntry4 = (TextInputEditText) findViewById4;
        View findViewById5 = requireView.findViewById(C17049R.C17051id.otp_entry_5);
        C19383o.m32796f(findViewById5, "viewData.findViewById(R.id.otp_entry_5)");
        this.otpEntry5 = (TextInputEditText) findViewById5;
        View findViewById6 = requireView.findViewById(C17049R.C17051id.otp_entry_6);
        C19383o.m32796f(findViewById6, "viewData.findViewById(R.id.otp_entry_6)");
        TextInputEditText textInputEditText = (TextInputEditText) findViewById6;
        this.otpEntry6 = textInputEditText;
        TextInputEditText[] textInputEditTextArr = new TextInputEditText[6];
        TextInputEditText textInputEditText2 = this.otpEntry1;
        if (textInputEditText2 != null) {
            textInputEditTextArr[0] = textInputEditText2;
            TextInputEditText textInputEditText3 = this.otpEntry2;
            if (textInputEditText3 != null) {
                textInputEditTextArr[1] = textInputEditText3;
                TextInputEditText textInputEditText4 = this.otpEntry3;
                if (textInputEditText4 != null) {
                    textInputEditTextArr[2] = textInputEditText4;
                    TextInputEditText textInputEditText5 = this.otpEntry4;
                    if (textInputEditText5 != null) {
                        textInputEditTextArr[3] = textInputEditText5;
                        TextInputEditText textInputEditText6 = this.otpEntry5;
                        if (textInputEditText6 != null) {
                            textInputEditTextArr[4] = textInputEditText6;
                            textInputEditTextArr[5] = textInputEditText;
                            List e0 = C17782b.m29865e0(textInputEditTextArr);
                            TextInputEditText textInputEditText7 = this.otpEntry1;
                            if (textInputEditText7 == null) {
                                C19383o.m32805o("otpEntry1");
                                throw null;
                            } else if (textInputEditText7 != null) {
                                TextInputEditText textInputEditText8 = this.otpEntry2;
                                if (textInputEditText8 != null) {
                                    textInputEditText7.addTextChangedListener(new OtpTextWatcher(textInputEditText7, textInputEditText8, e0));
                                    TextInputEditText textInputEditText9 = this.otpEntry2;
                                    if (textInputEditText9 == null) {
                                        C19383o.m32805o("otpEntry2");
                                        throw null;
                                    } else if (textInputEditText9 != null) {
                                        TextInputEditText textInputEditText10 = this.otpEntry3;
                                        if (textInputEditText10 != null) {
                                            textInputEditText9.addTextChangedListener(new OtpTextWatcher(textInputEditText9, textInputEditText10, e0));
                                            TextInputEditText textInputEditText11 = this.otpEntry3;
                                            if (textInputEditText11 == null) {
                                                C19383o.m32805o("otpEntry3");
                                                throw null;
                                            } else if (textInputEditText11 != null) {
                                                TextInputEditText textInputEditText12 = this.otpEntry4;
                                                if (textInputEditText12 != null) {
                                                    textInputEditText11.addTextChangedListener(new OtpTextWatcher(textInputEditText11, textInputEditText12, e0));
                                                    TextInputEditText textInputEditText13 = this.otpEntry4;
                                                    if (textInputEditText13 == null) {
                                                        C19383o.m32805o("otpEntry4");
                                                        throw null;
                                                    } else if (textInputEditText13 != null) {
                                                        TextInputEditText textInputEditText14 = this.otpEntry5;
                                                        if (textInputEditText14 != null) {
                                                            textInputEditText13.addTextChangedListener(new OtpTextWatcher(textInputEditText13, textInputEditText14, e0));
                                                            TextInputEditText textInputEditText15 = this.otpEntry5;
                                                            if (textInputEditText15 == null) {
                                                                C19383o.m32805o("otpEntry5");
                                                                throw null;
                                                            } else if (textInputEditText15 != null) {
                                                                TextInputEditText textInputEditText16 = this.otpEntry6;
                                                                if (textInputEditText16 != null) {
                                                                    textInputEditText15.addTextChangedListener(new OtpTextWatcher(textInputEditText15, textInputEditText16, e0));
                                                                    TextInputEditText textInputEditText17 = this.otpEntry6;
                                                                    if (textInputEditText17 == null) {
                                                                        C19383o.m32805o("otpEntry6");
                                                                        throw null;
                                                                    } else if (textInputEditText17 != null) {
                                                                        textInputEditText17.addTextChangedListener(new OtpTextWatcher(textInputEditText17, (EditText) null, e0));
                                                                        TextInputEditText textInputEditText18 = this.otpEntry1;
                                                                        if (textInputEditText18 == null) {
                                                                            C19383o.m32805o("otpEntry1");
                                                                            throw null;
                                                                        } else if (textInputEditText18 != null) {
                                                                            textInputEditText18.setOnKeyListener(new OtpOnKeyListener(textInputEditText18, (EditText) null));
                                                                            TextInputEditText textInputEditText19 = this.otpEntry2;
                                                                            if (textInputEditText19 == null) {
                                                                                C19383o.m32805o("otpEntry2");
                                                                                throw null;
                                                                            } else if (textInputEditText19 != null) {
                                                                                TextInputEditText textInputEditText20 = this.otpEntry1;
                                                                                if (textInputEditText20 != null) {
                                                                                    textInputEditText19.setOnKeyListener(new OtpOnKeyListener(textInputEditText19, textInputEditText20));
                                                                                    TextInputEditText textInputEditText21 = this.otpEntry3;
                                                                                    if (textInputEditText21 == null) {
                                                                                        C19383o.m32805o("otpEntry3");
                                                                                        throw null;
                                                                                    } else if (textInputEditText21 != null) {
                                                                                        TextInputEditText textInputEditText22 = this.otpEntry2;
                                                                                        if (textInputEditText22 != null) {
                                                                                            textInputEditText21.setOnKeyListener(new OtpOnKeyListener(textInputEditText21, textInputEditText22));
                                                                                            TextInputEditText textInputEditText23 = this.otpEntry4;
                                                                                            if (textInputEditText23 == null) {
                                                                                                C19383o.m32805o("otpEntry4");
                                                                                                throw null;
                                                                                            } else if (textInputEditText23 != null) {
                                                                                                TextInputEditText textInputEditText24 = this.otpEntry3;
                                                                                                if (textInputEditText24 != null) {
                                                                                                    textInputEditText23.setOnKeyListener(new OtpOnKeyListener(textInputEditText23, textInputEditText24));
                                                                                                    TextInputEditText textInputEditText25 = this.otpEntry5;
                                                                                                    if (textInputEditText25 == null) {
                                                                                                        C19383o.m32805o("otpEntry5");
                                                                                                        throw null;
                                                                                                    } else if (textInputEditText25 != null) {
                                                                                                        TextInputEditText textInputEditText26 = this.otpEntry4;
                                                                                                        if (textInputEditText26 != null) {
                                                                                                            textInputEditText25.setOnKeyListener(new OtpOnKeyListener(textInputEditText25, textInputEditText26));
                                                                                                            TextInputEditText textInputEditText27 = this.otpEntry6;
                                                                                                            if (textInputEditText27 == null) {
                                                                                                                C19383o.m32805o("otpEntry6");
                                                                                                                throw null;
                                                                                                            } else if (textInputEditText27 != null) {
                                                                                                                TextInputEditText textInputEditText28 = this.otpEntry5;
                                                                                                                if (textInputEditText28 != null) {
                                                                                                                    textInputEditText27.setOnKeyListener(new OtpOnKeyListener(textInputEditText27, textInputEditText28));
                                                                                                                } else {
                                                                                                                    C19383o.m32805o("otpEntry5");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                            } else {
                                                                                                                C19383o.m32805o("otpEntry6");
                                                                                                                throw null;
                                                                                                            }
                                                                                                        } else {
                                                                                                            C19383o.m32805o("otpEntry4");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    } else {
                                                                                                        C19383o.m32805o("otpEntry5");
                                                                                                        throw null;
                                                                                                    }
                                                                                                } else {
                                                                                                    C19383o.m32805o("otpEntry3");
                                                                                                    throw null;
                                                                                                }
                                                                                            } else {
                                                                                                C19383o.m32805o("otpEntry4");
                                                                                                throw null;
                                                                                            }
                                                                                        } else {
                                                                                            C19383o.m32805o("otpEntry2");
                                                                                            throw null;
                                                                                        }
                                                                                    } else {
                                                                                        C19383o.m32805o("otpEntry3");
                                                                                        throw null;
                                                                                    }
                                                                                } else {
                                                                                    C19383o.m32805o("otpEntry1");
                                                                                    throw null;
                                                                                }
                                                                            } else {
                                                                                C19383o.m32805o("otpEntry2");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            C19383o.m32805o("otpEntry1");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        C19383o.m32805o("otpEntry6");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    C19383o.m32805o("otpEntry6");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                C19383o.m32805o("otpEntry5");
                                                                throw null;
                                                            }
                                                        } else {
                                                            C19383o.m32805o("otpEntry5");
                                                            throw null;
                                                        }
                                                    } else {
                                                        C19383o.m32805o("otpEntry4");
                                                        throw null;
                                                    }
                                                } else {
                                                    C19383o.m32805o("otpEntry4");
                                                    throw null;
                                                }
                                            } else {
                                                C19383o.m32805o("otpEntry3");
                                                throw null;
                                            }
                                        } else {
                                            C19383o.m32805o("otpEntry3");
                                            throw null;
                                        }
                                    } else {
                                        C19383o.m32805o("otpEntry2");
                                        throw null;
                                    }
                                } else {
                                    C19383o.m32805o("otpEntry2");
                                    throw null;
                                }
                            } else {
                                C19383o.m32805o("otpEntry1");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("otpEntry5");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("otpEntry4");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("otpEntry3");
                    throw null;
                }
            } else {
                C19383o.m32805o("otpEntry2");
                throw null;
            }
        } else {
            C19383o.m32805o("otpEntry1");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public final C18829b getAuthHandlerProvidersFromIntent() {
        IBinder binder;
        Bundle arguments = getArguments();
        if (arguments == null || (binder = arguments.getBinder(AUTH_HANDLER)) == null) {
            throw new IllegalStateException("AuthHandlerProviders is needed for the OtpPhoneFragment");
        }
        Object data = ((ObjectWrapperForBinder) binder).getData();
        if (data != null) {
            return (C18829b) data;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.platform.authsdk.AuthHandlerProviders");
    }

    private final String getErrorString(OtpError otpError, String str) {
        int i = WhenMappings.$EnumSwitchMapping$0[otpError.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                } else if (str != null) {
                    return str;
                } else {
                    String string = getString(C17049R.string.paypal_auth_otp_login_code_expired);
                    C19383o.m32796f(string, "getString(R.string.paypa…h_otp_login_code_expired)");
                    return string;
                }
            } else if (str != null) {
                return str;
            } else {
                String string2 = getString(C17049R.string.paypal_auth_otp_login_code_expired);
                C19383o.m32796f(string2, "getString(R.string.paypa…h_otp_login_code_expired)");
                return string2;
            }
        } else if (str != null) {
            return str;
        } else {
            String string3 = getString(C17049R.string.paypal_auth_otp_login_check_code);
            C19383o.m32796f(string3, "getString(R.string.paypa…uth_otp_login_check_code)");
            return string3;
        }
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
    public final OtpPhoneViewModel getViewModel() {
        return (OtpPhoneViewModel) this.viewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void handleError(OtpPhoneViewState.Error error) {
        if (error.getError() == OtpError.AttemptThreshold) {
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
        } else {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) requireView().findViewById(C17049R.C17051id.emailErrorView);
            ((TextView) requireView().findViewById(C17049R.C17051id.errorTextView)).setText(getErrorString(error.getError(), error.getMessage()));
            if (linearLayoutCompat != null) {
                linearLayoutCompat.setVisibility(0);
            }
            ProgressSpinnerView progressSpinnerView = this.loadingView;
            if (progressSpinnerView != null) {
                hideLoadingView(progressSpinnerView);
            } else {
                C19383o.m32805o("loadingView");
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void handleLoading(OtpPhoneViewState.Loading loading) {
        InputMethodManager inputMethodManager;
        View view = getView();
        if (view != null) {
            ((LinearLayoutCompat) view.findViewById(C17049R.C17051id.emailErrorView)).setVisibility(8);
            ((ProgressSpinnerView) view.findViewById(C17049R.C17051id.loadingView)).setVisibility(0);
            C18829b bVar = this.authHandlerProviders;
            if (bVar != null) {
                bVar.getAuthProviders().getAuthPresenter().onLoaderStatusChanged(true, this);
                View currentFocus = requireActivity().getCurrentFocus();
                if (currentFocus != null && (inputMethodManager = (InputMethodManager) requireContext().getSystemService("input_method")) != null) {
                    inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                    return;
                }
                return;
            }
            C19383o.m32805o("authHandlerProviders");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public final void handleReady(OtpPhoneViewState.Ready ready) {
        View view = getView();
        if (view != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view.findViewById(C17049R.C17051id.emailErrorView);
            C19383o.m32796f(linearLayoutCompat, "emailErrorView");
            linearLayoutCompat.setVisibility(8);
            ProgressSpinnerView progressSpinnerView = (ProgressSpinnerView) view.findViewById(C17049R.C17051id.loadingView);
            C19383o.m32796f(progressSpinnerView, "loadingView");
            hideLoadingView(progressSpinnerView);
        }
    }

    private final void hideLoadingView(ProgressSpinnerView progressSpinnerView) {
        progressSpinnerView.setVisibility(8);
        C18829b bVar = this.authHandlerProviders;
        if (bVar != null) {
            bVar.getAuthProviders().getAuthPresenter().onLoaderStatusChanged(false, this);
        } else {
            C19383o.m32805o("authHandlerProviders");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public final void onCancelled(OtpPhoneViewModel.Event.CANCELLED cancelled) {
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
        C2895z<ChallengeResult> zVar = this.challengeResultLiveData;
        Challenge challenge2 = this.challenge;
        if (challenge2 != null) {
            zVar.postValue(new ChallengeResult.Failed(challenge2.getRequestId(), new ChallengeError.Failure(new Error(exc.getMessage(), exc.getCause()))));
        } else {
            C19383o.m32805o("challenge");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public final void onSuccess(Object obj) {
        String tokenValue;
        Log.d(this.TAG, "handlers live data update with success");
        if (obj instanceof OtpLoginResultData) {
            OtpLoginResultData otpLoginResultData = (OtpLoginResultData) obj;
            Token thirdPartyRefreshToken = otpLoginResultData.getThirdPartyRefreshToken();
            if (!(thirdPartyRefreshToken == null || (tokenValue = thirdPartyRefreshToken.getTokenValue()) == null)) {
                Context requireContext = requireContext();
                C19383o.m32796f(requireContext, "requireContext()");
                new C18973a(requireContext).encryptAndAddToPreference("refreshToken", tokenValue);
            }
            C2895z<ChallengeResult> zVar = this.challengeResultLiveData;
            UserAccessToken thirdPartyAccessToken = otpLoginResultData.getThirdPartyAccessToken();
            ChallengeResultData challengeResultData = new ChallengeResultData(thirdPartyAccessToken == null ? null : thirdPartyAccessToken.getTokenValue(), (String) null, (String) null, otpLoginResultData.getRiskVisitorId(), 6, (DefaultConstructorMarker) null);
            Challenge challenge2 = this.challenge;
            if (challenge2 != null) {
                zVar.postValue(new ChallengeResult.Completed(challenge2.getRequestId(), challengeResultData));
            } else {
                C19383o.m32805o("challenge");
                throw null;
            }
        } else if (obj instanceof String) {
            Toast.makeText(requireContext(), getString(C17049R.string.new_code_message), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public final void onUnHandled(OtpPhoneViewModel.Event.UNHANDLED unhandled) {
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
    /* renamed from: onViewCreated$lambda-10  reason: not valid java name */
    public static final void m35135onViewCreated$lambda10(OtpPhoneFragment otpPhoneFragment, View view) {
        C19383o.m32797g(otpPhoneFragment, "this$0");
        ObservableField<String> otpEntry12 = otpPhoneFragment.getViewModel().getOtpEntry1();
        TextInputEditText textInputEditText = otpPhoneFragment.otpEntry1;
        if (textInputEditText != null) {
            otpEntry12.set(String.valueOf(textInputEditText.getText()));
            ObservableField<String> otpEntry22 = otpPhoneFragment.getViewModel().getOtpEntry2();
            TextInputEditText textInputEditText2 = otpPhoneFragment.otpEntry2;
            if (textInputEditText2 != null) {
                otpEntry22.set(String.valueOf(textInputEditText2.getText()));
                ObservableField<String> otpEntry32 = otpPhoneFragment.getViewModel().getOtpEntry3();
                TextInputEditText textInputEditText3 = otpPhoneFragment.otpEntry3;
                if (textInputEditText3 != null) {
                    otpEntry32.set(String.valueOf(textInputEditText3.getText()));
                    ObservableField<String> otpEntry42 = otpPhoneFragment.getViewModel().getOtpEntry4();
                    TextInputEditText textInputEditText4 = otpPhoneFragment.otpEntry4;
                    if (textInputEditText4 != null) {
                        otpEntry42.set(String.valueOf(textInputEditText4.getText()));
                        ObservableField<String> otpEntry52 = otpPhoneFragment.getViewModel().getOtpEntry5();
                        TextInputEditText textInputEditText5 = otpPhoneFragment.otpEntry5;
                        if (textInputEditText5 != null) {
                            otpEntry52.set(String.valueOf(textInputEditText5.getText()));
                            ObservableField<String> otpEntry62 = otpPhoneFragment.getViewModel().getOtpEntry6();
                            TextInputEditText textInputEditText6 = otpPhoneFragment.otpEntry6;
                            if (textInputEditText6 != null) {
                                otpEntry62.set(String.valueOf(textInputEditText6.getText()));
                                otpPhoneFragment.getViewModel().primaryButtonClicked();
                                return;
                            }
                            C19383o.m32805o("otpEntry6");
                            throw null;
                        }
                        C19383o.m32805o("otpEntry5");
                        throw null;
                    }
                    C19383o.m32805o("otpEntry4");
                    throw null;
                }
                C19383o.m32805o("otpEntry3");
                throw null;
            }
            C19383o.m32805o("otpEntry2");
            throw null;
        }
        C19383o.m32805o("otpEntry1");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-6  reason: not valid java name */
    public static final void m35136onViewCreated$lambda6(OtpPhoneFragment otpPhoneFragment, View view) {
        C19383o.m32797g(otpPhoneFragment, "this$0");
        otpPhoneFragment.getViewModel().onBackpress();
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-7  reason: not valid java name */
    public static final void m35137onViewCreated$lambda7(OtpPhoneFragment otpPhoneFragment, View view) {
        C19383o.m32797g(otpPhoneFragment, "this$0");
        otpPhoneFragment.getViewModel().onBackpress();
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-8  reason: not valid java name */
    public static final void m35138onViewCreated$lambda8(OtpPhoneFragment otpPhoneFragment, View view) {
        C19383o.m32797g(otpPhoneFragment, "this$0");
        otpPhoneFragment.getViewModel().getCodeButtonPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-9  reason: not valid java name */
    public static final void m35139onViewCreated$lambda9(OtpPhoneFragment otpPhoneFragment, View view) {
        C19383o.m32797g(otpPhoneFragment, "this$0");
        otpPhoneFragment.getViewModel().secondaryButtonClicked();
    }

    private final void setup() {
        C15588c1.m25329i0(this).mo10834c(new OtpPhoneFragment$setup$1(this, (C19340c<? super OtpPhoneFragment$setup$1>) null));
        C15588c1.m25329i0(this).mo10834c(new OtpPhoneFragment$setup$2(this, (C19340c<? super OtpPhoneFragment$setup$2>) null));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addUriChallengeEvents();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C17049R.C17053layout.fragment_otp_phone, viewGroup, false);
        this.authHandlerProviders = getAuthHandlerProvidersFromIntent();
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
            TextView textView = (TextView) inflate.findViewById(C17049R.C17051id.text_send_code);
            String string = arguments.getString(FORMATTED_PHONE_NUMBER);
            if (string != null) {
                textView.setText(getString(C17049R.string.paypal_auth_otp_login_code_sent_to, string));
            }
            new OTPLoginAnalyticsViewModel(getViewModel().getAnalyticsEventsFlow(), this, getEventTracker(getArguments()), (OTPLoginAnalyticsManager) null, 8, (DefaultConstructorMarker) null);
        }
        if (this.authHandlerProviders != null) {
            WebViewUtils.Companion companion = WebViewUtils.Companion;
            FragmentActivity requireActivity = requireActivity();
            C19383o.m32796f(requireActivity, "requireActivity()");
            if (companion.isWebViewAvailable$auth_sdk_thirdPartyRelease(requireActivity)) {
                FragmentActivity requireActivity2 = requireActivity();
                C19383o.m32796f(requireActivity2, "requireActivity()");
                C18829b bVar2 = this.authHandlerProviders;
                if (bVar2 != null) {
                    String baseUrl = bVar2.getAuthCoreComponent().getClientConfig().getBaseUrl();
                    C18829b bVar3 = this.authHandlerProviders;
                    if (bVar3 != null) {
                        GRCWebViewLoader gRCWebViewLoader = new GRCWebViewLoader(requireActivity2, baseUrl, bVar3.getAuthCoreComponent().getClientConfig().getAppInfo().getName());
                        C18829b bVar4 = this.authHandlerProviders;
                        if (bVar4 != null) {
                            gRCWebViewLoader.loadAdsWithChallengeId(bVar4.getAuthCoreComponent().getClientConfig().getGuid());
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
        C15588c1.m25329i0(this).mo10834c(new OtpPhoneFragment$onCreateView$3(this, (C19340c<? super OtpPhoneFragment$onCreateView$3>) null));
        setup();
        C19383o.m32796f(inflate, "view");
        return inflate;
    }

    public void onDestroy() {
        ProgressSpinnerView progressSpinnerView = this.loadingView;
        if (progressSpinnerView != null) {
            hideLoadingView(progressSpinnerView);
            if (!getViewModel().getCompletionState()) {
                C2895z<ChallengeResult> zVar = this.challengeResultLiveData;
                Challenge challenge2 = this.challenge;
                if (challenge2 != null) {
                    zVar.postValue(new ChallengeResult.Failed(challenge2.getRequestId(), new ChallengeError.Cancelled(new Error(ConstantsKt.BACK_PRESS))));
                } else {
                    C19383o.m32805o("challenge");
                    throw null;
                }
            }
            super.onDestroy();
            return;
        }
        C19383o.m32805o("loadingView");
        throw null;
    }

    public void onResume() {
        super.onResume();
        getViewModel().fragmentLoadedEvent();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C17049R.C17051id.emailErrorView);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.emailErrorView)");
        this.emailErrorView = (LinearLayoutCompat) findViewById;
        View findViewById2 = view.findViewById(C17049R.C17051id.loadingView);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.loadingView)");
        ProgressSpinnerView progressSpinnerView = (ProgressSpinnerView) findViewById2;
        this.loadingView = progressSpinnerView;
        hideLoadingView(progressSpinnerView);
        ((TextView) view.findViewById(C17049R.C17051id.text_otp_login_title)).setText(getString(C17049R.string.paypal_auth_otp_login_otp_phone_header));
        Button button = (Button) view.findViewById(C17049R.C17051id.continueButton);
        button.setText(getString(C17049R.string.paypal_auth_otp_login_log_in));
        ImageView imageView = (ImageView) view.findViewById(C17049R.C17051id.imageViewBackButton);
        imageView.setOnClickListener(new C9258c(this, 1));
        ImageView imageView2 = (ImageView) view.findViewById(C17049R.C17051id.imageClose);
        imageView2.setOnClickListener(new C9050a(this, 2));
        ImageView imageView3 = (ImageView) view.findViewById(C17049R.C17051id.imageView);
        ((Button) view.findViewById(C17049R.C17051id.get_new_code)).setOnClickListener(new C9064o(this, 4));
        ((Button) view.findViewById(C17049R.C17051id.button_alternate_login)).setOnClickListener(new C5651e(this, 2));
        button.setOnClickListener(new C9052c(this, 3));
        if (C19383o.m32792b("thirdParty", "thirdParty")) {
            getViewModel().displayBackButton$auth_sdk_thirdPartyRelease(false);
            getViewModel().displayCloseButton$auth_sdk_thirdPartyRelease(false);
            ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = 0;
                imageView3.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        if (C19383o.m32792b(getViewModel().getDisplayBackButtonEvent().getValue(), Boolean.TRUE)) {
            imageView.setVisibility(0);
            imageView2.setVisibility(0);
        } else {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
        }
        bindOtpEntryEditText();
    }
}
