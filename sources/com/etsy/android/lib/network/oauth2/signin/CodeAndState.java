package com.etsy.android.lib.network.oauth2.signin;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class CodeAndState {

    /* renamed from: a */
    public final String f19297a;

    /* renamed from: b */
    public final String f19298b;

    public CodeAndState(@C17402n(name = "code") String str, @C17402n(name = "state") String str2) {
        C19383o.m32797g(str, ResponseConstants.CODE);
        C19383o.m32797g(str2, "state");
        this.f19297a = str;
        this.f19298b = str2;
    }

    public final CodeAndState copy(@C17402n(name = "code") String str, @C17402n(name = "state") String str2) {
        C19383o.m32797g(str, ResponseConstants.CODE);
        C19383o.m32797g(str2, "state");
        return new CodeAndState(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CodeAndState)) {
            return false;
        }
        CodeAndState codeAndState = (CodeAndState) obj;
        return C19383o.m32792b(this.f19297a, codeAndState.f19297a) && C19383o.m32792b(this.f19298b, codeAndState.f19298b);
    }

    public final int hashCode() {
        return this.f19298b.hashCode() + (this.f19297a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CodeAndState(code=");
        h.append(this.f19297a);
        h.append(", state=");
        return C0391c.m1057c(h, this.f19298b, ')');
    }
}
