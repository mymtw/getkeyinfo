package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.login.LoginFragment;
import com.facebook.referrals.ReferralFragment;
import com.facebook.share.internal.DeviceShareDialogFragment;
import com.facebook.share.model.ShareContent;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.C19383o;
import p365hg.C12851e0;
import p365hg.C12869i0;
import p401mg.C13080a;
import p424pg.C13241a;
import p453tf.C13418j;

public class FacebookActivity extends FragmentActivity {
    public static final C12181a Companion = new C12181a();
    private static final String FRAGMENT_TAG = "SingleFragment";
    public static final String PASS_THROUGH_CANCEL_ACTION = "PassThrough";
    private static final String TAG = "com.facebook.FacebookActivity";
    private Fragment currentFragment;

    /* renamed from: com.facebook.FacebookActivity$a */
    public static final class C12181a {
    }

    private final void handlePassThroughError() {
        Intent intent = getIntent();
        C19383o.m32796f(intent, "requestIntent");
        FacebookException h = C12851e0.m20508h(C12851e0.m20509j(intent));
        Intent intent2 = getIntent();
        C19383o.m32796f(intent2, "intent");
        setResult(0, C12851e0.m20506e(intent2, (Bundle) null, h));
        finish();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (!C13080a.m20762b(this)) {
            try {
                C19383o.m32797g(str, "prefix");
                C19383o.m32797g(printWriter, "writer");
                C13241a.f29089f.getClass();
                if (!C13241a.C13243b.m20903c(str, printWriter, strArr)) {
                    super.dump(str, fileDescriptor, printWriter, strArr);
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public final Fragment getCurrentFragment() {
        return this.currentFragment;
    }

    public Fragment getFragment() {
        Fragment fragment;
        Intent intent = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C19383o.m32796f(supportFragmentManager, "supportFragmentManager");
        Fragment C = supportFragmentManager.mo10353C(FRAGMENT_TAG);
        if (C != null) {
            return C;
        }
        C19383o.m32796f(intent, "intent");
        if (C19383o.m32792b(FacebookDialogFragment.TAG, intent.getAction())) {
            FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
            facebookDialogFragment.setRetainInstance(true);
            facebookDialogFragment.show(supportFragmentManager, FRAGMENT_TAG);
            return facebookDialogFragment;
        } else if (C19383o.m32792b(DeviceShareDialogFragment.TAG, intent.getAction())) {
            Log.w(TAG, "Please stop use Device Share Dialog, this feature has been disabled and all related classes in Facebook Android SDK will be removed from v13.0.0 release.");
            DeviceShareDialogFragment deviceShareDialogFragment = new DeviceShareDialogFragment();
            deviceShareDialogFragment.setRetainInstance(true);
            Parcelable parcelableExtra = intent.getParcelableExtra(ResponseConstants.CONTENT);
            if (parcelableExtra != null) {
                deviceShareDialogFragment.setShareContent((ShareContent) parcelableExtra);
                deviceShareDialogFragment.show(supportFragmentManager, FRAGMENT_TAG);
                return deviceShareDialogFragment;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.share.model.ShareContent<*, *>");
        } else {
            if (C19383o.m32792b(ReferralFragment.TAG, intent.getAction())) {
                fragment = new ReferralFragment();
                fragment.setRetainInstance(true);
                C2740a aVar = new C2740a(supportFragmentManager);
                aVar.mo10485g(R.id.com_facebook_fragment_container, fragment, FRAGMENT_TAG, 1);
                aVar.mo10483d();
            } else {
                fragment = new LoginFragment();
                fragment.setRetainInstance(true);
                C2740a aVar2 = new C2740a(supportFragmentManager);
                aVar2.mo10485g(R.id.com_facebook_fragment_container, fragment, FRAGMENT_TAG, 1);
                aVar2.mo10483d();
            }
            return fragment;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C19383o.m32797g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.currentFragment;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!C13418j.m21113i()) {
            C12869i0.m20551G(TAG, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            C19383o.m32796f(applicationContext, "applicationContext");
            synchronized (C13418j.class) {
                C13418j.m21117m(applicationContext);
            }
        }
        setContentView((int) R.layout.com_facebook_activity_layout);
        C19383o.m32796f(intent, "intent");
        if (C19383o.m32792b(PASS_THROUGH_CANCEL_ACTION, intent.getAction())) {
            handlePassThroughError();
        } else {
            this.currentFragment = getFragment();
        }
    }
}
