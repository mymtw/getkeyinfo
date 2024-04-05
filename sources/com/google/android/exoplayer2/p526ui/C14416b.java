package com.google.android.exoplayer2.p526ui;

import android.text.Html;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;
import p030bo.app.C3607c7;
import p035c4.C4409a;

/* renamed from: com.google.android.exoplayer2.ui.b */
public final class C14416b {

    /* renamed from: a */
    public static final Pattern f32454a = Pattern.compile("(&#13;)?&#10;");

    /* renamed from: com.google.android.exoplayer2.ui.b$a */
    public static class C14417a {

        /* renamed from: a */
        public final String f32455a;

        /* renamed from: b */
        public final Map<String, String> f32456b;

        public C14417a(String str, Map map) {
            this.f32455a = str;
            this.f32456b = map;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.b$b */
    public static final class C14418b {

        /* renamed from: e */
        public static final C4409a f32457e = new C4409a(1);

        /* renamed from: f */
        public static final C3607c7 f32458f = new C3607c7(1);

        /* renamed from: a */
        public final int f32459a;

        /* renamed from: b */
        public final int f32460b;

        /* renamed from: c */
        public final String f32461c;

        /* renamed from: d */
        public final String f32462d;

        public C14418b(int i, int i2, String str, String str2) {
            this.f32459a = i;
            this.f32460b = i2;
            this.f32461c = str;
            this.f32462d = str2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.b$c */
    public static final class C14419c {

        /* renamed from: a */
        public final ArrayList f32463a = new ArrayList();

        /* renamed from: b */
        public final ArrayList f32464b = new ArrayList();
    }

    /* renamed from: a */
    public static String m22835a(CharSequence charSequence) {
        return f32454a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
