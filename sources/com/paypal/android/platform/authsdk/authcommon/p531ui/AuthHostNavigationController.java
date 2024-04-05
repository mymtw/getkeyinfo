package com.paypal.android.platform.authsdk.authcommon.p531ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder;
import java.lang.ref.WeakReference;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19400c;
import kotlin.reflect.C19402e;

/* renamed from: com.paypal.android.platform.authsdk.authcommon.ui.AuthHostNavigationController */
public final class AuthHostNavigationController implements HostNavigationController, PartnerHostNavigationController {
    private WeakReference<AuthUIActivity> activity;
    private final AuthPresenter authPresenter;
    private final Context context;
    private String currentTopFragmentTag;

    public AuthHostNavigationController(Context context2, AuthPresenter authPresenter2) {
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this.context = context2;
        this.authPresenter = authPresenter2;
        this.currentTopFragmentTag = "";
    }

    private final Fragment createFragment(C19400c<? extends Fragment> cVar, Bundle bundle) {
        Fragment fragment;
        C19402e eVar = (C19402e) C19327t.m32639U0(cVar.mo71920d());
        if (eVar == null || (fragment = (Fragment) eVar.call(new Object[0])) == null) {
            return null;
        }
        fragment.setArguments(bundle);
        return fragment;
    }

    private final boolean isWebScreen(Bundle bundle) {
        return bundle.getBoolean(HostNavigationController.Companion.getWEB_SCREEN_PRESENT(), false);
    }

    public void dismiss() {
        AuthUIActivity authUIActivity;
        WeakReference<AuthUIActivity> weakReference = this.activity;
        if (weakReference != null && (authUIActivity = weakReference.get()) != null) {
            authUIActivity.dismiss();
        }
    }

    public final WeakReference<AuthUIActivity> getActivity() {
        return this.activity;
    }

    public String getCurrentFragmentTag() {
        return this.currentTopFragmentTag;
    }

    public final String getCurrentTopFragmentTag() {
        return this.currentTopFragmentTag;
    }

    public void navigate(C19400c<? extends Fragment> cVar, Bundle bundle) {
        AuthUIActivity authUIActivity;
        Fragment createFragment;
        C19383o.m32797g(cVar, "fragmentClass");
        C19383o.m32797g(bundle, "input");
        if (this.authPresenter == null || (createFragment = createFragment(cVar, bundle)) == null) {
            WeakReference<AuthUIActivity> weakReference = this.activity;
            if ((weakReference == null ? null : weakReference.get()) != null) {
                WeakReference<AuthUIActivity> weakReference2 = this.activity;
                if (!(weakReference2 == null || (authUIActivity = weakReference2.get()) == null)) {
                    authUIActivity.pushFragment(cVar, bundle);
                }
            } else if (!(this.context instanceof Activity)) {
                Intent intent = new Intent(this.context, AuthUIActivity.class);
                Bundle bundle2 = new Bundle();
                bundle2.putBundle(AuthHostNavigationControllerKt.ARG_INPUT_DATA, bundle);
                bundle2.putBinder(AuthHostNavigationControllerKt.ARG_AUTH_HOST_NAVIGATOR, new ObjectWrapperForBinder(this));
                bundle2.putBinder(AuthHostNavigationControllerKt.ARG_FRAGMENT_CLASS, new ObjectWrapperForBinder(cVar));
                intent.setFlags(268435456);
                intent.putExtras(bundle2);
                this.context.startActivity(intent);
            }
            this.currentTopFragmentTag = cVar.toString();
            return;
        }
        this.authPresenter.onViewPresentRequested(createFragment, isWebScreen(bundle));
        setCurrentTopFragmentTag(cVar.toString());
    }

    public void popBackStack() {
        AuthUIActivity authUIActivity;
        WeakReference<AuthUIActivity> weakReference = this.activity;
        if (weakReference != null && (authUIActivity = weakReference.get()) != null) {
            authUIActivity.popBackStack();
        }
    }

    public void popBackStackByTag(String str) {
        AuthUIActivity authUIActivity;
        C19383o.m32797g(str, "tag");
        WeakReference<AuthUIActivity> weakReference = this.activity;
        if (weakReference != null && (authUIActivity = weakReference.get()) != null) {
            authUIActivity.popBackStackToFragmentTag(str);
        }
    }

    public final void setActivity(WeakReference<AuthUIActivity> weakReference) {
        this.activity = weakReference;
    }

    public final void setCurrentTopFragmentTag(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.currentTopFragmentTag = str;
    }

    public void dismiss(Fragment fragment, boolean z) {
        C19383o.m32797g(fragment, "fragment");
        AuthPresenter authPresenter2 = this.authPresenter;
        if (authPresenter2 != null) {
            authPresenter2.onViewDismissRequested(fragment, z);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AuthHostNavigationController(Context context2, AuthPresenter authPresenter2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context2, (i & 2) != 0 ? null : authPresenter2);
    }

    public void navigate(Fragment fragment, boolean z) {
        C19383o.m32797g(fragment, "fragment");
        AuthPresenter authPresenter2 = this.authPresenter;
        if (authPresenter2 != null) {
            authPresenter2.onViewPresentRequested(fragment, z);
        }
    }
}
