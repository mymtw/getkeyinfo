package com.etsy.android.config.flags.p073ui.textconfigflag;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.config.flags.p073ui.C6403c;
import com.etsy.android.config.flags.p073ui.ConfigFlagOrigin;
import com.etsy.android.config.flags.p073ui.ConfigFlagStatus;
import com.etsy.android.config.flags.p073ui.ConfigFlagViewTypes;
import com.etsy.android.push.CartRefreshDelegate;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.config.flags.ui.textconfigflag.a */
public final class C6421a extends C6403c {

    /* renamed from: a */
    public final String f14235a;

    /* renamed from: b */
    public final String f14236b;

    /* renamed from: c */
    public final String f14237c;

    /* renamed from: d */
    public final String f14238d;

    /* renamed from: e */
    public final ConfigFlagStatus f14239e;

    /* renamed from: f */
    public final ConfigFlagOrigin f14240f;

    /* renamed from: g */
    public final boolean f14241g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6421a(String str, String str2, String str3, String str4, ConfigFlagStatus configFlagStatus, ConfigFlagOrigin configFlagOrigin, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : configFlagStatus, (i & 32) != 0 ? ConfigFlagOrigin.SERVER : configFlagOrigin, (i & 64) != 0);
    }

    /* renamed from: h */
    public static C6421a m12845h(C6421a aVar, String str, ConfigFlagOrigin configFlagOrigin, boolean z, int i) {
        ConfigFlagStatus configFlagStatus = null;
        String str2 = (i & 1) != 0 ? aVar.f14235a : null;
        String str3 = (i & 2) != 0 ? aVar.f14236b : null;
        String str4 = (i & 4) != 0 ? aVar.f14237c : null;
        if ((i & 8) != 0) {
            str = aVar.f14238d;
        }
        String str5 = str;
        if ((i & 16) != 0) {
            configFlagStatus = aVar.f14239e;
        }
        ConfigFlagStatus configFlagStatus2 = configFlagStatus;
        if ((i & 32) != 0) {
            configFlagOrigin = aVar.f14240f;
        }
        ConfigFlagOrigin configFlagOrigin2 = configFlagOrigin;
        if ((i & 64) != 0) {
            z = aVar.f14241g;
        }
        C19383o.m32797g(str2, "name");
        C19383o.m32797g(configFlagOrigin2, CartRefreshDelegate.ARG_ORIGIN);
        return new C6421a(str2, str3, str4, str5, configFlagStatus2, configFlagOrigin2, z);
    }

    /* renamed from: a */
    public final ConfigFlagStatus mo18191a() {
        return this.f14239e;
    }

    /* renamed from: b */
    public final String mo18192b() {
        return this.f14235a;
    }

    /* renamed from: c */
    public final ConfigFlagOrigin mo18193c() {
        return this.f14240f;
    }

    /* renamed from: d */
    public final String mo18194d() {
        return this.f14236b;
    }

    /* renamed from: e */
    public final String mo18195e() {
        return this.f14237c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6421a)) {
            return false;
        }
        C6421a aVar = (C6421a) obj;
        return C19383o.m32792b(this.f14235a, aVar.f14235a) && C19383o.m32792b(this.f14236b, aVar.f14236b) && C19383o.m32792b(this.f14237c, aVar.f14237c) && C19383o.m32792b(this.f14238d, aVar.f14238d) && this.f14239e == aVar.f14239e && this.f14240f == aVar.f14240f && this.f14241g == aVar.f14241g;
    }

    /* renamed from: f */
    public final boolean mo18196f() {
        return this.f14241g;
    }

    /* renamed from: g */
    public final ConfigFlagViewTypes mo18197g() {
        return ConfigFlagViewTypes.TEXT;
    }

    public final int hashCode() {
        int hashCode = this.f14235a.hashCode() * 31;
        String str = this.f14236b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14237c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14238d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ConfigFlagStatus configFlagStatus = this.f14239e;
        if (configFlagStatus != null) {
            i = configFlagStatus.hashCode();
        }
        int hashCode5 = (this.f14240f.hashCode() + ((hashCode4 + i) * 31)) * 31;
        boolean z = this.f14241g;
        if (z) {
            z = true;
        }
        return hashCode5 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TextConfigFlag(name=");
        h.append(this.f14235a);
        h.append(", owner=");
        h.append(this.f14236b);
        h.append(", team=");
        h.append(this.f14237c);
        h.append(", flagValue=");
        h.append(this.f14238d);
        h.append(", configFlagStatus=");
        h.append(this.f14239e);
        h.append(", origin=");
        h.append(this.f14240f);
        h.append(", isVisible=");
        return C0391c.m1058d(h, this.f14241g, ')');
    }

    public C6421a(String str, String str2, String str3, String str4, ConfigFlagStatus configFlagStatus, ConfigFlagOrigin configFlagOrigin, boolean z) {
        C19383o.m32797g(str, "name");
        C19383o.m32797g(configFlagOrigin, CartRefreshDelegate.ARG_ORIGIN);
        this.f14235a = str;
        this.f14236b = str2;
        this.f14237c = str3;
        this.f14238d = str4;
        this.f14239e = configFlagStatus;
        this.f14240f = configFlagOrigin;
        this.f14241g = z;
    }
}
