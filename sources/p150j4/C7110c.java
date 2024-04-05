package p150j4;

import com.bumptech.glide.GlideContext;
import com.bumptech.glide.load.engine.C6051s;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;

/* renamed from: j4.c */
public final class C7110c<T> implements C7117h<T> {

    /* renamed from: b */
    public final List f15814b;

    @SafeVarargs
    public C7110c(C7117h<T>... hVarArr) {
        if (hVarArr.length != 0) {
            this.f15814b = Arrays.asList(hVarArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    /* renamed from: a */
    public final C6051s mo17034a(GlideContext glideContext, C6051s sVar, int i, int i2) {
        C6051s sVar2 = sVar;
        for (C7117h a : this.f15814b) {
            C6051s a2 = a.mo17034a(glideContext, sVar2, i, i2);
            if (sVar2 != null && !sVar2.equals(sVar) && !sVar2.equals(a2)) {
                sVar2.mo16990b();
            }
            sVar2 = a2;
        }
        return sVar2;
    }

    /* renamed from: b */
    public final void mo12991b(MessageDigest messageDigest) {
        for (C7117h b : this.f15814b) {
            b.mo12991b(messageDigest);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7110c) {
            return this.f15814b.equals(((C7110c) obj).f15814b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15814b.hashCode();
    }
}
