package com.etsy.android.lib.network.oauth2.signin;

import androidx.fragment.app.FragmentActivity;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.login.C12311e;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.network.oauth2.signin.i */
public final class C8781i {

    /* renamed from: a */
    public final FragmentActivity f19325a;

    /* renamed from: b */
    public final CallbackManagerImpl f19326b = new CallbackManagerImpl();

    /* renamed from: c */
    public final C12311e f19327c = C12311e.m20139b();

    public C8781i(FragmentActivity fragmentActivity) {
        C19383o.m32797g(fragmentActivity, "activity");
        this.f19325a = fragmentActivity;
    }
}
