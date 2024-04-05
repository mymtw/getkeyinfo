package com.etsy.android.p327ui.home.tabs;

import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.deeplinks.EtsyAction;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.tabs.l */
public abstract class C10065l {

    /* renamed from: com.etsy.android.ui.home.tabs.l$a */
    public static final class C10066a extends C10065l {

        /* renamed from: a */
        public final EtsyAction f22182a;

        /* renamed from: b */
        public final String f22183b;

        /* renamed from: c */
        public final Bundle f22184c;

        public C10066a(EtsyAction etsyAction, Bundle bundle, int i) {
            bundle = (i & 4) != 0 ? null : bundle;
            C19383o.m32797g(etsyAction, "signInAction");
            this.f22182a = etsyAction;
            this.f22183b = null;
            this.f22184c = bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10066a)) {
                return false;
            }
            C10066a aVar = (C10066a) obj;
            return this.f22182a == aVar.f22182a && C19383o.m32792b(this.f22183b, aVar.f22183b) && C19383o.m32792b(this.f22184c, aVar.f22184c);
        }

        public final int hashCode() {
            int hashCode = this.f22182a.hashCode() * 31;
            String str = this.f22183b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Bundle bundle = this.f22184c;
            if (bundle != null) {
                i = bundle.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("GoToSignInForResult(signInAction=");
            h.append(this.f22182a);
            h.append(", actionData=");
            h.append(this.f22183b);
            h.append(", actionBundle=");
            h.append(this.f22184c);
            h.append(')');
            return h.toString();
        }
    }
}
