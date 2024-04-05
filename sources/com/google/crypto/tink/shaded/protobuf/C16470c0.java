package com.google.crypto.tink.shaded.protobuf;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import java.nio.charset.Charset;

/* renamed from: com.google.crypto.tink.shaded.protobuf.c0 */
public final class C16470c0 {

    /* renamed from: b */
    public static final C16471a f36584b = new C16471a();

    /* renamed from: a */
    public final C16501i0 f36585a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.c0$a */
    public class C16471a implements C16501i0 {
        /* renamed from: a */
        public final C16495h0 mo58677a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        /* renamed from: b */
        public final boolean mo58678b(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.c0$b */
    public static class C16472b implements C16501i0 {

        /* renamed from: a */
        public C16501i0[] f36586a;

        public C16472b(C16501i0... i0VarArr) {
            this.f36586a = i0VarArr;
        }

        /* renamed from: a */
        public final C16495h0 mo58677a(Class<?> cls) {
            for (C16501i0 i0Var : this.f36586a) {
                if (i0Var.mo58678b(cls)) {
                    return i0Var.mo58677a(cls);
                }
            }
            throw new UnsupportedOperationException(C0326j.m862g(cls, C0072d.m201h("No factory is available for message type: ")));
        }

        /* renamed from: b */
        public final boolean mo58678b(Class<?> cls) {
            for (C16501i0 b : this.f36586a) {
                if (b.mo58678b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C16470c0() {
        C16501i0 i0Var;
        C16501i0[] i0VarArr = new C16501i0[2];
        i0VarArr[0] = C16527t.f36695a;
        try {
            i0Var = (C16501i0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            i0Var = f36584b;
        }
        i0VarArr[1] = i0Var;
        C16472b bVar = new C16472b(i0VarArr);
        Charset charset = C16531v.f36704a;
        this.f36585a = bVar;
    }
}
