package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;

public final class StaticLayoutBuilderCompat {

    /* renamed from: a */
    public CharSequence f34388a;

    /* renamed from: b */
    public final TextPaint f34389b;

    /* renamed from: c */
    public final int f34390c;

    /* renamed from: d */
    public int f34391d;

    /* renamed from: e */
    public Layout.Alignment f34392e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f */
    public int f34393f = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: g */
    public float f34394g = 0.0f;

    /* renamed from: h */
    public float f34395h = 1.0f;

    /* renamed from: i */
    public int f34396i = 1;

    /* renamed from: j */
    public boolean f34397j = true;

    /* renamed from: k */
    public boolean f34398k;

    /* renamed from: l */
    public TextUtils.TruncateAt f34399l = null;

    public static class StaticLayoutBuilderCompatException extends Exception {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public StaticLayoutBuilderCompatException(java.lang.Throwable r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Error thrown initializing StaticLayout "
                java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException.<init>(java.lang.Throwable):void");
        }
    }

    public StaticLayoutBuilderCompat(int i, CharSequence charSequence, TextPaint textPaint) {
        this.f34388a = charSequence;
        this.f34389b = textPaint;
        this.f34390c = i;
        this.f34391d = charSequence.length();
    }

    /* renamed from: a */
    public final StaticLayout mo54174a() throws StaticLayoutBuilderCompatException {
        if (this.f34388a == null) {
            this.f34388a = "";
        }
        int max = Math.max(0, this.f34390c);
        CharSequence charSequence = this.f34388a;
        if (this.f34393f == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f34389b, (float) max, this.f34399l);
        }
        int min = Math.min(charSequence.length(), this.f34391d);
        this.f34391d = min;
        if (this.f34398k && this.f34393f == 1) {
            this.f34392e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, this.f34389b, max);
        obtain.setAlignment(this.f34392e);
        obtain.setIncludePad(this.f34397j);
        obtain.setTextDirection(this.f34398k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f34399l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f34393f);
        float f = this.f34394g;
        if (!(f == 0.0f && this.f34395h == 1.0f)) {
            obtain.setLineSpacing(f, this.f34395h);
        }
        if (this.f34393f > 1) {
            obtain.setHyphenationFrequency(this.f34396i);
        }
        return obtain.build();
    }
}
