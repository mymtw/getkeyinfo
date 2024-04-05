package com.google.android.gms.measurement.internal;

import android.accounts.AccountManager;
import android.support.p013v4.media.C0070b;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: com.google.android.gms.measurement.internal.l */
public final class C15019l extends C15042n4 {

    /* renamed from: d */
    public long f33641d;

    /* renamed from: e */
    public String f33642e;

    /* renamed from: f */
    public AccountManager f33643f;

    /* renamed from: g */
    public Boolean f33644g;

    /* renamed from: h */
    public long f33645h;

    public C15019l(C15103u3 u3Var) {
        super(u3Var);
    }

    /* renamed from: h */
    public final boolean mo51952h() {
        Calendar instance = Calendar.getInstance();
        this.f33641d = TimeUnit.MINUTES.convert((long) (instance.get(16) + instance.get(15)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f33642e = C0070b.m184f(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, HelpFormatter.DEFAULT_OPT_PREFIX, lowerCase2);
        return false;
    }

    /* renamed from: k */
    public final long mo52227k() {
        mo51995g();
        return this.f33645h;
    }

    /* renamed from: l */
    public final long mo52228l() {
        mo52264i();
        return this.f33641d;
    }

    /* renamed from: m */
    public final String mo52229m() {
        mo52264i();
        return this.f33642e;
    }
}
