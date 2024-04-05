package com.qualtrics.digital;

import android.content.Context;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.qualtrics.digital.u */
public final class C17315u {

    /* renamed from: c */
    public static C17315u f37841c;

    /* renamed from: a */
    public C17314t f37842a;

    /* renamed from: b */
    public C17304k f37843b = null;

    public C17315u() {
        if (C17314t.f37839b == null) {
            C17314t.f37839b = new C17314t((Context) null);
        }
        this.f37842a = C17314t.f37839b;
    }

    /* renamed from: a */
    public static C17315u m29063a() {
        if (f37841c == null) {
            f37841c = new C17315u();
        }
        return f37841c;
    }

    /* renamed from: b */
    public static boolean m29064b(String str, String str2) {
        return Pattern.compile(String.format(Locale.US, "%s_[0-9a-zA-Z]{11,15}", new Object[]{str})).matcher(str2).matches();
    }
}
