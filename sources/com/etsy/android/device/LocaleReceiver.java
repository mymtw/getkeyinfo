package com.etsy.android.device;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.C0761x;
import kotlin.jvm.internal.C19383o;
import p486y9.C13891g;
import p486y9.C13894i;

public final class LocaleReceiver extends BroadcastReceiver {
    public static final int $stable = 8;
    public C13891g localeSubject;
    public C13894i systemProvider;

    public final C13891g getLocaleSubject() {
        C13891g gVar = this.localeSubject;
        if (gVar != null) {
            return gVar;
        }
        C19383o.m32805o("localeSubject");
        throw null;
    }

    public final C13894i getSystemProvider() {
        C13894i iVar = this.systemProvider;
        if (iVar != null) {
            return iVar;
        }
        C19383o.m32805o("systemProvider");
        throw null;
    }

    public void onReceive(Context context, Intent intent) {
        C0761x.m1734m0(this, context);
        if (intent != null && C19383o.m32792b(intent.getAction(), "android.intent.action.LOCALE_CHANGED")) {
            String languageTag = getSystemProvider().mo46712a().toLanguageTag();
            C13891g localeSubject2 = getLocaleSubject();
            C19383o.m32796f(languageTag, "localeString");
            localeSubject2.getClass();
            localeSubject2.f30560a.accept(languageTag);
        }
    }

    public final void setLocaleSubject(C13891g gVar) {
        C19383o.m32797g(gVar, "<set-?>");
        this.localeSubject = gVar;
    }

    public final void setSystemProvider(C13894i iVar) {
        C19383o.m32797g(iVar, "<set-?>");
        this.systemProvider = iVar;
    }
}
