package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.C1302d;
import java.util.Map;
import kotlin.collections.C19294b0;

/* renamed from: androidx.compose.foundation.lazy.layout.d */
public interface C0841d {
    /* renamed from: a */
    Object mo4197a(int i) {
        return null;
    }

    /* renamed from: c */
    void mo4199c(int i, C1302d dVar, int i2);

    /* renamed from: d */
    Map<Object, Integer> mo4200d() {
        return C19294b0.m32559p0();
    }

    /* renamed from: e */
    Object mo4201e(int i) {
        return new DefaultLazyKey(i);
    }

    int getItemCount();
}
