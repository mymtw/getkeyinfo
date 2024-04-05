package com.paypal.android.platform.authsdk.authcommon.p531ui;

import android.os.Bundle;
import android.os.IBinder;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.C0761x;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.paypal.android.platform.authsdk.C17049R;
import com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19400c;

/* renamed from: com.paypal.android.platform.authsdk.authcommon.ui.AuthUIActivity */
public final class AuthUIActivity extends AppCompatActivity {
    public AuthHostNavigationController authHostNavigationController;

    public static /* synthetic */ void pushFragment$default(AuthUIActivity authUIActivity, C19400c cVar, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        authUIActivity.pushFragment(cVar, bundle);
    }

    public final void dismiss() {
        finish();
    }

    public final AuthHostNavigationController getAuthHostNavigationController() {
        AuthHostNavigationController authHostNavigationController2 = this.authHostNavigationController;
        if (authHostNavigationController2 != null) {
            return authHostNavigationController2;
        }
        C19383o.m32805o("authHostNavigationController");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        IBinder binder;
        IBinder binder2;
        super.onCreate(bundle);
        setContentView(C17049R.C17053layout.activity_auth_ui_layout);
        Bundle extras = getIntent().getExtras();
        C19400c cVar = null;
        if (!(extras == null || (binder2 = extras.getBinder(AuthHostNavigationControllerKt.ARG_FRAGMENT_CLASS)) == null)) {
            Object data = ((ObjectWrapperForBinder) binder2).getData();
            if (data != null) {
                cVar = (C19400c) data;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.reflect.KClass<out androidx.fragment.app.Fragment>");
            }
        }
        if (cVar != null) {
            pushFragment(cVar, extras.getBundle(AuthHostNavigationControllerKt.ARG_INPUT_DATA));
        }
        if (!(extras == null || (binder = extras.getBinder(AuthHostNavigationControllerKt.ARG_AUTH_HOST_NAVIGATOR)) == null)) {
            Object data2 = ((ObjectWrapperForBinder) binder).getData();
            if (data2 != null) {
                setAuthHostNavigationController((AuthHostNavigationController) data2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.authcommon.ui.AuthHostNavigationController");
            }
        }
        getAuthHostNavigationController().setActivity(new WeakReference(this));
    }

    public void onDestroy() {
        super.onDestroy();
        WeakReference<AuthUIActivity> activity = getAuthHostNavigationController().getActivity();
        if (activity != null) {
            activity.clear();
        }
    }

    public final void popBackStack() {
        getSupportFragmentManager().mo10363P();
    }

    public final void popBackStackToFragmentTag(String str) {
        C19383o.m32797g(str, "fragmentTag");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        supportFragmentManager.mo10402v(new FragmentManager.C2727o(str, -1, 0), false);
    }

    public final void pushFragment(C19400c<? extends Fragment> cVar, Bundle bundle) {
        C19383o.m32797g(cVar, "fragmentClass");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C2740a aVar = new C2740a(supportFragmentManager);
        aVar.mo10485g(C17049R.C17051id.auth_fragment_host, aVar.mo10530e(bundle, C0761x.m1713c0(cVar)), (String) null, 1);
        aVar.mo10529c(cVar.toString());
        aVar.mo10483d();
    }

    public final void setAuthHostNavigationController(AuthHostNavigationController authHostNavigationController2) {
        C19383o.m32797g(authHostNavigationController2, "<set-?>");
        this.authHostNavigationController = authHostNavigationController2;
    }
}
