package com.paypal.platform.authsdk.stepup.p538ui;

import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2895z;
import com.braze.p044ui.inappmessage.factories.C5651e;
import com.etsy.android.stylekit.views.C9052c;
import com.paypal.android.platform.authsdk.C17049R;
import com.paypal.android.platform.authsdk.authcommon.Challenge;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResultData;
import com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder;
import com.paypal.android.platform.authsdk.authcommon.p531ui.HostNavigationController;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.paypal.platform.authsdk.stepup.ui.StepUpFragment */
public final class StepUpFragment extends Fragment {
    public Challenge challenge;
    public C2895z<ChallengeResult> challengeResultLiveData;
    public HostNavigationController uiNavigator;

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-4  reason: not valid java name */
    public static final void m35151onViewCreated$lambda4(StepUpFragment stepUpFragment, View view) {
        C19383o.m32797g(stepUpFragment, "this$0");
        stepUpFragment.getChallengeResultLiveData().postValue(new ChallengeResult.Completed(stepUpFragment.getChallenge().getRequestId(), new ChallengeResultData("accessTokenSuccessFull", (String) null, (String) null, (String) null, 14, (DefaultConstructorMarker) null)));
        stepUpFragment.getUiNavigator().popBackStack();
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-5  reason: not valid java name */
    public static final void m35152onViewCreated$lambda5(StepUpFragment stepUpFragment, View view) {
        C19383o.m32797g(stepUpFragment, "this$0");
        stepUpFragment.getChallenge();
        stepUpFragment.getUiNavigator().popBackStack();
    }

    public final Challenge getChallenge() {
        Challenge challenge2 = this.challenge;
        if (challenge2 != null) {
            return challenge2;
        }
        C19383o.m32805o("challenge");
        throw null;
    }

    public final C2895z<ChallengeResult> getChallengeResultLiveData() {
        C2895z<ChallengeResult> zVar = this.challengeResultLiveData;
        if (zVar != null) {
            return zVar;
        }
        C19383o.m32805o("challengeResultLiveData");
        throw null;
    }

    public final HostNavigationController getUiNavigator() {
        HostNavigationController hostNavigationController = this.uiNavigator;
        if (hostNavigationController != null) {
            return hostNavigationController;
        }
        C19383o.m32805o("uiNavigator");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            IBinder binder = arguments.getBinder("challenge_result");
            if (binder != null) {
                Object data = ((ObjectWrapperForBinder) binder).getData();
                if (data != null) {
                    setChallengeResultLiveData((C2895z) data);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.paypal.android.platform.authsdk.authcommon.ChallengeResult>");
                }
            }
            IBinder binder2 = arguments.getBinder("challenge");
            if (binder2 != null) {
                Object data2 = ((ObjectWrapperForBinder) binder2).getData();
                if (data2 != null) {
                    setChallenge((Challenge) data2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.authcommon.Challenge");
                }
            }
            IBinder binder3 = arguments.getBinder("ui_navigator");
            if (binder3 != null) {
                Object data3 = ((ObjectWrapperForBinder) binder3).getData();
                if (data3 != null) {
                    setUiNavigator((HostNavigationController) data3);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.authcommon.ui.HostNavigationController");
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        return layoutInflater.inflate(C17049R.C17053layout.fragment_step_up, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        ((Button) view.findViewById(C17049R.C17051id.btnOk)).setOnClickListener(new C5651e(this, 4));
        ((Button) view.findViewById(C17049R.C17051id.btnCancel)).setOnClickListener(new C9052c(this, 4));
    }

    public final void setChallenge(Challenge challenge2) {
        C19383o.m32797g(challenge2, "<set-?>");
        this.challenge = challenge2;
    }

    public final void setChallengeResultLiveData(C2895z<ChallengeResult> zVar) {
        C19383o.m32797g(zVar, "<set-?>");
        this.challengeResultLiveData = zVar;
    }

    public final void setUiNavigator(HostNavigationController hostNavigationController) {
        C19383o.m32797g(hostNavigationController, "<set-?>");
        this.uiNavigator = hostNavigationController;
    }
}
