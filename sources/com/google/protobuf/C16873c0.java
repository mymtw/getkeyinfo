package com.google.protobuf;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import java.nio.charset.Charset;

/* renamed from: com.google.protobuf.c0 */
public final class C16873c0 {

    /* renamed from: b */
    public static final C16874a f37183b = new C16874a();

    /* renamed from: a */
    public final C16904i0 f37184a;

    /* renamed from: com.google.protobuf.c0$a */
    public static class C16874a implements C16904i0 {
        /* renamed from: a */
        public final C16899h0 mo59869a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        /* renamed from: b */
        public final boolean mo59870b(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: com.google.protobuf.c0$b */
    public static class C16875b implements C16904i0 {

        /* renamed from: a */
        public C16904i0[] f37185a;

        public C16875b(C16904i0... i0VarArr) {
            this.f37185a = i0VarArr;
        }

        /* renamed from: a */
        public final C16899h0 mo59869a(Class<?> cls) {
            for (C16904i0 i0Var : this.f37185a) {
                if (i0Var.mo59870b(cls)) {
                    return i0Var.mo59869a(cls);
                }
            }
            throw new UnsupportedOperationException(C0326j.m862g(cls, C0072d.m201h("No factory is available for message type: ")));
        }

        /* renamed from: b */
        public final boolean mo59870b(Class<?> cls) {
            for (C16904i0 b : this.f37185a) {
                if (b.mo59870b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C16873c0() {
        C16904i0 i0Var;
        C16904i0[] i0VarArr = new C16904i0[2];
        i0VarArr[0] = C16931t.f37291a;
        try {
            i0Var = (C16904i0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            i0Var = f37183b;
        }
        i0VarArr[1] = i0Var;
        C16875b bVar = new C16875b(i0VarArr);
        Charset charset = C16935v.f37301a;
        this.f37184a = bVar;
    }
}
