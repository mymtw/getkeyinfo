package androidx.compose.p015ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.p015ui.text.platform.AndroidTextPaint;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.android.k */
public final class C1928k {

    /* renamed from: a */
    public final CharSequence f4330a;

    /* renamed from: b */
    public final int f4331b = 0;

    /* renamed from: c */
    public final int f4332c;

    /* renamed from: d */
    public final TextPaint f4333d;

    /* renamed from: e */
    public final int f4334e;

    /* renamed from: f */
    public final TextDirectionHeuristic f4335f;

    /* renamed from: g */
    public final Layout.Alignment f4336g;

    /* renamed from: h */
    public final int f4337h;

    /* renamed from: i */
    public final TextUtils.TruncateAt f4338i;

    /* renamed from: j */
    public final int f4339j;

    /* renamed from: k */
    public final float f4340k;

    /* renamed from: l */
    public final float f4341l;

    /* renamed from: m */
    public final int f4342m;

    /* renamed from: n */
    public final boolean f4343n;

    /* renamed from: o */
    public final boolean f4344o;

    /* renamed from: p */
    public final int f4345p;

    /* renamed from: q */
    public final int f4346q;

    /* renamed from: r */
    public final int[] f4347r;

    /* renamed from: s */
    public final int[] f4348s;

    public C1928k(CharSequence charSequence, int i, AndroidTextPaint androidTextPaint, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, float f, float f2, int i5, boolean z, boolean z2, int i6, int i7, int[] iArr, int[] iArr2) {
        int i8 = i;
        int i9 = i2;
        int i10 = i3;
        int i11 = i4;
        float f3 = f;
        C19383o.m32797g(charSequence, "text");
        C19383o.m32797g(androidTextPaint, "paint");
        this.f4330a = charSequence;
        boolean z3 = false;
        this.f4332c = i8;
        this.f4333d = androidTextPaint;
        this.f4334e = i9;
        this.f4335f = textDirectionHeuristic;
        this.f4336g = alignment;
        this.f4337h = i10;
        this.f4338i = truncateAt;
        this.f4339j = i11;
        this.f4340k = f3;
        this.f4341l = f2;
        this.f4342m = i5;
        this.f4343n = z;
        this.f4344o = z2;
        this.f4345p = i6;
        this.f4346q = i7;
        this.f4347r = iArr;
        this.f4348s = iArr2;
        if (i8 >= 0) {
            if (i8 >= 0 && i8 <= charSequence.length()) {
                if (i10 >= 0) {
                    if (i9 >= 0) {
                        if (i11 >= 0) {
                            if (!(f3 >= 0.0f ? true : z3)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
