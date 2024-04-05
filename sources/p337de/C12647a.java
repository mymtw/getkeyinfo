package p337de;

import android.content.Intent;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: de.a */
public final class C12647a {

    /* renamed from: a */
    public final int f27895a;

    /* renamed from: b */
    public final Intent f27896b;

    public C12647a(int i, Intent intent) {
        this.f27895a = i;
        this.f27896b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12647a)) {
            return false;
        }
        C12647a aVar = (C12647a) obj;
        return this.f27895a == aVar.f27895a && C19383o.m32792b(this.f27896b, aVar.f27896b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f27895a) * 31;
        Intent intent = this.f27896b;
        return hashCode + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ActivityResultInfo(resultCode=");
        h.append(this.f27895a);
        h.append(", intent=");
        h.append(this.f27896b);
        h.append(')');
        return h.toString();
    }
}
