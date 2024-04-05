package com.bugsnag.android;

import android.support.p013v4.media.C0072d;
import com.bugsnag.android.C5780k2;
import com.bugsnag.android.internal.C5771f;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.s1 */
public final class C5909s1 extends C5756i {

    /* renamed from: b */
    public final C5829r1 f12604b;

    public C5909s1() {
        this(0);
    }

    public /* synthetic */ C5909s1(int i) {
        this(new C5829r1(0));
    }

    /* renamed from: a */
    public final void mo16670a(String str, String str2) {
        if (str2 == null) {
            if (!getObservers$bugsnag_android_core_release().isEmpty()) {
                C5780k2.C5785e eVar = new C5780k2.C5785e(str);
                for (C5771f onStateChange : getObservers$bugsnag_android_core_release()) {
                    onStateChange.onStateChange(eVar);
                }
            }
        } else if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            C5780k2.C5786f fVar = new C5780k2.C5786f(str, str2);
            for (C5771f onStateChange2 : getObservers$bugsnag_android_core_release()) {
                onStateChange2.onStateChange(fVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo16671b(Object obj, String str, String str2) {
        if (obj == null) {
            mo16670a(str, str2);
        } else if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            C5829r1 r1Var = this.f12604b;
            r1Var.getClass();
            C19383o.m32798h(str, "section");
            C19383o.m32798h(str2, "key");
            Map map = r1Var.f12468c.get(str);
            C5780k2.C5783c cVar = new C5780k2.C5783c(str, str2, map != null ? map.get(str2) : null);
            for (C5771f onStateChange : getObservers$bugsnag_android_core_release()) {
                onStateChange.onStateChange(cVar);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C5909s1) && C19383o.m32792b(this.f12604b, ((C5909s1) obj).f12604b);
        }
        return true;
    }

    public final int hashCode() {
        C5829r1 r1Var = this.f12604b;
        if (r1Var != null) {
            return r1Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("MetadataState(metadata=");
        h.append(this.f12604b);
        h.append(")");
        return h.toString();
    }

    public C5909s1(C5829r1 r1Var) {
        C19383o.m32798h(r1Var, ResponseConstants.METADATA);
        this.f12604b = r1Var;
    }
}
