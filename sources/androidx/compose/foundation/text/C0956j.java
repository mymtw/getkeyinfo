package androidx.compose.foundation.text;

import com.google.android.play.core.assetpacks.C15627m0;
import com.google.android.play.core.internal.C15686c0;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.foundation.text.j */
public final class C0956j implements C15686c0 {
    /* renamed from: a */
    public static final int m1992a(int i, CharSequence charSequence) {
        C19383o.m32797g(charSequence, "<this>");
        int length = charSequence.length();
        for (int i2 = i + 1; i2 < length; i2++) {
            if (charSequence.charAt(i2) == 10) {
                return i2;
            }
        }
        return charSequence.length();
    }

    public final /* synthetic */ Object zza() {
        return new C15627m0();
    }
}
