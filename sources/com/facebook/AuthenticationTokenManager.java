package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p251u1.C8115a;
import p453tf.C13414f;
import p453tf.C13418j;

public final class AuthenticationTokenManager {

    /* renamed from: d */
    public static AuthenticationTokenManager f27213d;

    /* renamed from: e */
    public static final C12178a f27214e = new C12178a();

    /* renamed from: a */
    public AuthenticationToken f27215a;

    /* renamed from: b */
    public final C8115a f27216b;

    /* renamed from: c */
    public final C13414f f27217c;

    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            C19383o.m32797g(intent, "intent");
        }
    }

    /* renamed from: com.facebook.AuthenticationTokenManager$a */
    public static final class C12178a {
        /* renamed from: a */
        public final AuthenticationTokenManager mo39154a() {
            AuthenticationTokenManager authenticationTokenManager;
            AuthenticationTokenManager authenticationTokenManager2 = AuthenticationTokenManager.f27213d;
            if (authenticationTokenManager2 != null) {
                return authenticationTokenManager2;
            }
            synchronized (this) {
                authenticationTokenManager = AuthenticationTokenManager.f27213d;
                if (authenticationTokenManager == null) {
                    C8115a a = C8115a.m16322a(C13418j.m21106b());
                    C19383o.m32796f(a, "LocalBroadcastManager.ge…tance(applicationContext)");
                    AuthenticationTokenManager authenticationTokenManager3 = new AuthenticationTokenManager(a, new C13414f());
                    AuthenticationTokenManager.f27213d = authenticationTokenManager3;
                    authenticationTokenManager = authenticationTokenManager3;
                }
            }
            return authenticationTokenManager;
        }
    }

    public AuthenticationTokenManager(C8115a aVar, C13414f fVar) {
        this.f27216b = aVar;
        this.f27217c = fVar;
    }
}
