package com.etsy.android.p327ui.user.profile;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.UserProfilePage;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.profile.a */
public abstract class C11623a {

    /* renamed from: com.etsy.android.ui.user.profile.a$a */
    public static final class C11624a extends C11623a {

        /* renamed from: a */
        public final String f25730a;

        /* renamed from: b */
        public final int f25731b;

        /* renamed from: c */
        public final Throwable f25732c;

        public C11624a(String str, int i, Throwable th) {
            this.f25730a = str;
            this.f25731b = i;
            this.f25732c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11624a)) {
                return false;
            }
            C11624a aVar = (C11624a) obj;
            return C19383o.m32792b(this.f25730a, aVar.f25730a) && this.f25731b == aVar.f25731b && C19383o.m32792b(this.f25732c, aVar.f25732c);
        }

        public final int hashCode() {
            String str = this.f25730a;
            int i = 0;
            int a = C0069a.m170a(this.f25731b, (str == null ? 0 : str.hashCode()) * 31, 31);
            Throwable th = this.f25732c;
            if (th != null) {
                i = th.hashCode();
            }
            return a + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Error(errorMessage=");
            h.append(this.f25730a);
            h.append(", code=");
            h.append(this.f25731b);
            h.append(", error=");
            return C0070b.m185h(h, this.f25732c, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.profile.a$b */
    public static final class C11625b extends C11623a {

        /* renamed from: a */
        public final UserProfilePage f25733a;

        public C11625b(UserProfilePage userProfilePage) {
            this.f25733a = userProfilePage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11625b) && C19383o.m32792b(this.f25733a, ((C11625b) obj).f25733a);
        }

        public final int hashCode() {
            return this.f25733a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(profile=");
            h.append(this.f25733a);
            h.append(')');
            return h.toString();
        }
    }
}
