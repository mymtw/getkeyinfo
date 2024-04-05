package com.etsy.android.p327ui.user.auth;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.network.oauth2.signin.C8781i;
import com.etsy.android.p327ui.user.auth.C11481i;
import com.etsy.android.uikit.p331ui.dialog.DialogActivity;
import com.etsy.android.uikit.util.C11912n;
import com.facebook.internal.CallbackManagerImpl;
import java.util.HashMap;
import kotlin.jvm.internal.C19383o;
import p356ge.C12788a;
import p376je.C12977a;
import p394m9.C13026a;
import p440s9.C13366a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.user.auth.SignInActivity */
public class SignInActivity extends DialogActivity implements C13366a, C11477e {
    public static final String EXTRA_MAGIC_LINK = "magic_link";
    public static final String EXTRA_SHOW_SOCIAL_BUTTONS = "show_social_buttons";
    public static final String EXTRA_SIGN_IN = "sign_in_extra";
    public static final String EXTRA_SIGN_IN_AS = "sign_in_as";
    public static final String EXTRA_SIGN_IN_AS_TOKEN = "sign_in_as_token";
    public static final String EXTRA_STICKY_ALERT_DATA = "sticky_alert_data";
    public C8618c configMap;
    public C13026a externalAccountDelegate;
    private C11912n mDialogHelper;
    private DialogInterface.OnDismissListener mDismissListener;
    public C11484j signInEventManager;

    private DialogInterface.OnDismissListener buildDismissListener() {
        if (getIntent().getBooleanExtra(EXTRA_SHOW_SOCIAL_BUTTONS, false)) {
            return this.mDismissListener;
        }
        return null;
    }

    public C11912n getDialogHelper() {
        return this.mDialogHelper;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C13026a aVar = this.externalAccountDelegate;
        aVar.getClass();
        if (i == CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode()) {
            C8781i iVar = aVar.f28681a;
            iVar.getClass();
            LogCatKt.m17045a().mo21310e("Got result from Facebook signin!");
            iVar.f19326b.onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.signInEventManager.f25334a.onNext(C11481i.C11482a.f25332a);
        if (C18263b.f40057V.mo45960e()) {
            finish();
        }
        if (Build.VERSION.SDK_INT == 26) {
            setRequestedOrientation(-1);
        } else {
            setRequestedOrientation(1);
        }
        getAnalyticsContext().mo21333d("login_nag_displayed", new HashMap<AnalyticsProperty, Object>(getIntent().getStringExtra(EtsyAction.ACTION_TYPE_NAME)) {
            public final /* synthetic */ String val$actionName;

            {
                this.val$actionName = r2;
                put(PredefinedAnalyticsProperty.REFERRER, r2);
            }
        });
        this.mDialogHelper = new C11912n(this);
    }

    public void onFetchedUser() {
        setResult(311, getIntent());
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("NAV_ANIM_BOTTOM_ENTER", 0);
        int intExtra2 = intent.getIntExtra("NAV_ANIM_TOP_EXIT", 0);
        finish();
        overridePendingTransition(intExtra, intExtra2);
    }

    public void onResume() {
        super.onResume();
        if (C18263b.f40057V.mo45960e() && !this.configMap.mo21132b(C8592b.C8595c.f18859c)) {
            finish();
        }
    }

    public void onShowDialog(DialogInterface.OnDismissListener onDismissListener) {
        this.mDismissListener = onDismissListener;
        Bundle bundle = (Bundle) getIntent().getParcelableExtra(getIntent().getStringExtra(EtsyAction.ACTION_TYPE_NAME));
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putParcelable(EXTRA_STICKY_ALERT_DATA, bundle.getParcelable(EXTRA_STICKY_ALERT_DATA));
        }
        String string = getResources().getString(R.string.sign_in);
        C19383o.m32797g(string, "title");
        DialogInterface.OnDismissListener onDismissListener2 = this.mDismissListener;
        if (getIntent().getBooleanExtra(EXTRA_SIGN_IN, false)) {
            C12788a.m20424c(this, new C12977a(string, bundle2, true, onDismissListener2));
        } else if (getIntent().getBooleanExtra(EXTRA_SIGN_IN_AS, false)) {
            bundle2.putString(EXTRA_SIGN_IN_AS_TOKEN, getIntent().getStringExtra(EXTRA_SIGN_IN_AS_TOKEN));
            C12788a.m20424c(this, new C12977a(string, bundle2, true, onDismissListener2));
        } else if (getIntent().hasExtra(EXTRA_MAGIC_LINK)) {
            bundle2.putString(EXTRA_MAGIC_LINK, getIntent().getStringExtra(EXTRA_MAGIC_LINK));
            C12788a.m20424c(this, new C12977a(string, bundle2, true, onDismissListener2));
        }
    }

    public void showLinkAccountSignInScreen(Bundle bundle) {
        String string = getResources().getString(R.string.sign_in);
        C19383o.m32797g(string, "title");
        C12788a.m20424c(this, new C12977a(string, bundle, false, buildDismissListener()));
    }
}
