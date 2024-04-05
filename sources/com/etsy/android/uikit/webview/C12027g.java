package com.etsy.android.uikit.webview;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.uikit.webview.g */
public final class C12027g {

    /* renamed from: a */
    public final Activity f26804a;

    /* renamed from: b */
    public final Context f26805b;

    public C12027g(FragmentActivity fragmentActivity) {
        C19383o.m32797g(fragmentActivity, "activity");
        this.f26804a = fragmentActivity;
        Context createConfigurationContext = fragmentActivity.getBaseContext().createConfigurationContext(fragmentActivity.getBaseContext().getResources().getConfiguration());
        C19383o.m32796f(createConfigurationContext, "activity.baseContext.cre…urces.configuration\n    )");
        this.f26805b = createConfigurationContext;
    }

    /* renamed from: a */
    public final void mo38911a() {
        Resources resources = this.f26804a.getBaseContext().getResources();
        Resources resources2 = this.f26805b.getResources();
        DisplayMetrics displayMetrics = null;
        Configuration configuration = resources2 != null ? resources2.getConfiguration() : null;
        Resources resources3 = this.f26805b.getResources();
        if (resources3 != null) {
            displayMetrics = resources3.getDisplayMetrics();
        }
        resources.updateConfiguration(configuration, displayMetrics);
    }
}
