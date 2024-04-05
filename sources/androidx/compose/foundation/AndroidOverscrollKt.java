package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.p015ui.C1436d;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import p174m0.C7294l;
import p288y.C8343c;

public final class AndroidOverscrollKt {

    /* renamed from: a */
    public static final C0491a f1255a = new C0491a();

    /* renamed from: b */
    public static final C1436d f1256b;

    /* renamed from: androidx.compose.foundation.AndroidOverscrollKt$a */
    public static final class C0491a implements C1030w {

        /* renamed from: a */
        public boolean f1257a;

        /* renamed from: a */
        public final C7294l mo3577a(long j) {
            return new C7294l(C7294l.f16176b);
        }

        /* renamed from: b */
        public final boolean mo3578b() {
            return false;
        }

        /* renamed from: c */
        public final C19394m mo3579c(long j) {
            return C19394m.f43287a;
        }

        /* renamed from: d */
        public final long mo3580d(long j, C8343c cVar) {
            return C8343c.f18295b;
        }

        /* renamed from: e */
        public final C1436d mo3581e() {
            int i = C1436d.f3124a0;
            return C1436d.C1437a.f3125b;
        }

        /* renamed from: f */
        public final void mo3582f(long j, long j2, C8343c cVar, int i) {
        }

        public final boolean isEnabled() {
            return this.f1257a;
        }

        public final void setEnabled(boolean z) {
            this.f1257a = z;
        }
    }

    static {
        C1436d dVar;
        if (Build.VERSION.SDK_INT >= 31) {
            int i = C1436d.f3124a0;
            dVar = C15588c1.m25352v0(C15588c1.m25352v0(C1436d.C1437a.f3125b, AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1.INSTANCE), AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2.INSTANCE);
        } else {
            int i2 = C1436d.f3124a0;
            dVar = C1436d.C1437a.f3125b;
        }
        f1256b = dVar;
    }
}
