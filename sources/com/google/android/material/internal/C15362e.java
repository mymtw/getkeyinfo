package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p507al.C14026d;
import p507al.C14029f;

/* renamed from: com.google.android.material.internal.e */
public final class C15362e {

    /* renamed from: a */
    public final TextPaint f34505a = new TextPaint(1);

    /* renamed from: b */
    public final C15363a f34506b = new C15363a();

    /* renamed from: c */
    public float f34507c;

    /* renamed from: d */
    public boolean f34508d = true;

    /* renamed from: e */
    public WeakReference<C15364b> f34509e = new WeakReference<>((Object) null);

    /* renamed from: f */
    public C14026d f34510f;

    /* renamed from: com.google.android.material.internal.e$a */
    public class C15363a extends C14029f {
        public C15363a() {
        }

        /* renamed from: a */
        public final void mo46840a(int i) {
            C15362e eVar = C15362e.this;
            eVar.f34508d = true;
            C15364b bVar = eVar.f34509e.get();
            if (bVar != null) {
                bVar.onTextSizeChange();
            }
        }

        /* renamed from: b */
        public final void mo46841b(Typeface typeface, boolean z) {
            if (!z) {
                C15362e eVar = C15362e.this;
                eVar.f34508d = true;
                C15364b bVar = eVar.f34509e.get();
                if (bVar != null) {
                    bVar.onTextSizeChange();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.internal.e$b */
    public interface C15364b {
        int[] getState();

        boolean onStateChange(int[] iArr);

        void onTextSizeChange();
    }

    public C15362e(C15364b bVar) {
        this.f34509e = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public final float mo54198a(String str) {
        if (!this.f34508d) {
            return this.f34507c;
        }
        float measureText = str == null ? 0.0f : this.f34505a.measureText(str, 0, str.length());
        this.f34507c = measureText;
        this.f34508d = false;
        return measureText;
    }

    /* renamed from: b */
    public final void mo54199b(C14026d dVar, Context context) {
        if (this.f34510f != dVar) {
            this.f34510f = dVar;
            if (dVar != null) {
                dVar.mo46848f(context, this.f34505a, this.f34506b);
                C15364b bVar = this.f34509e.get();
                if (bVar != null) {
                    this.f34505a.drawableState = bVar.getState();
                }
                dVar.mo46847e(context, this.f34505a, this.f34506b);
                this.f34508d = true;
            }
            C15364b bVar2 = this.f34509e.get();
            if (bVar2 != null) {
                bVar2.onTextSizeChange();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
