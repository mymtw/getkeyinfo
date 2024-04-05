package androidx.compose.p015ui.text.android;

import androidx.compose.p015ui.text.platform.AndroidTextPaint;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.android.c */
public final class C1920c {

    /* renamed from: a */
    public final C19285c f4324a;

    /* renamed from: b */
    public final C19285c f4325b;

    /* renamed from: c */
    public final C19285c f4326c;

    public C1920c(int i, CharSequence charSequence, AndroidTextPaint androidTextPaint) {
        C19383o.m32797g(charSequence, "charSequence");
        C19383o.m32797g(androidTextPaint, "textPaint");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f4324a = C19350d.m32676a(lazyThreadSafetyMode, new LayoutIntrinsics$boringMetrics$2(i, charSequence, androidTextPaint));
        this.f4325b = C19350d.m32676a(lazyThreadSafetyMode, new LayoutIntrinsics$minIntrinsicWidth$2(charSequence, androidTextPaint));
        this.f4326c = C19350d.m32676a(lazyThreadSafetyMode, new LayoutIntrinsics$maxIntrinsicWidth$2(this, charSequence, androidTextPaint));
    }
}
