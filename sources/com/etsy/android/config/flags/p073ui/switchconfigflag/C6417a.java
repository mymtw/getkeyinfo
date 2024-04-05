package com.etsy.android.config.flags.p073ui.switchconfigflag;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.config.flags.p073ui.C6403c;
import com.etsy.android.config.flags.p073ui.ConfigFlagOrigin;
import com.etsy.android.config.flags.p073ui.ConfigFlagStatus;
import com.etsy.android.config.flags.p073ui.ConfigFlagViewTypes;
import com.etsy.android.push.CartRefreshDelegate;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.config.flags.ui.switchconfigflag.a */
public final class C6417a extends C6403c {

    /* renamed from: a */
    public final String f14225a;

    /* renamed from: b */
    public final String f14226b;

    /* renamed from: c */
    public final String f14227c;

    /* renamed from: d */
    public final boolean f14228d;

    /* renamed from: e */
    public final ConfigFlagStatus f14229e;

    /* renamed from: f */
    public final ConfigFlagOrigin f14230f;

    /* renamed from: g */
    public final boolean f14231g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6417a(String str, String str2, String str3, boolean z, ConfigFlagStatus configFlagStatus, ConfigFlagOrigin configFlagOrigin, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : configFlagStatus, (i & 32) != 0 ? ConfigFlagOrigin.SERVER : configFlagOrigin, (i & 64) != 0);
    }

    /* renamed from: h */
    public static C6417a m12836h(C6417a aVar, boolean z, ConfigFlagOrigin configFlagOrigin, boolean z2, int i) {
        ConfigFlagStatus configFlagStatus = null;
        String str = (i & 1) != 0 ? aVar.f14225a : null;
        String str2 = (i & 2) != 0 ? aVar.f14226b : null;
        String str3 = (i & 4) != 0 ? aVar.f14227c : null;
        if ((i & 8) != 0) {
            z = aVar.f14228d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            configFlagStatus = aVar.f14229e;
        }
        ConfigFlagStatus configFlagStatus2 = configFlagStatus;
        if ((i & 32) != 0) {
            configFlagOrigin = aVar.f14230f;
        }
        ConfigFlagOrigin configFlagOrigin2 = configFlagOrigin;
        if ((i & 64) != 0) {
            z2 = aVar.f14231g;
        }
        C19383o.m32797g(str, "name");
        C19383o.m32797g(configFlagOrigin2, CartRefreshDelegate.ARG_ORIGIN);
        return new C6417a(str, str2, str3, z3, configFlagStatus2, configFlagOrigin2, z2);
    }

    /* renamed from: a */
    public final ConfigFlagStatus mo18191a() {
        return this.f14229e;
    }

    /* renamed from: b */
    public final String mo18192b() {
        return this.f14225a;
    }

    /* renamed from: c */
    public final ConfigFlagOrigin mo18193c() {
        return this.f14230f;
    }

    /* renamed from: d */
    public final String mo18194d() {
        return this.f14226b;
    }

    /* renamed from: e */
    public final String mo18195e() {
        return this.f14227c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6417a)) {
            return false;
        }
        C6417a aVar = (C6417a) obj;
        return C19383o.m32792b(this.f14225a, aVar.f14225a) && C19383o.m32792b(this.f14226b, aVar.f14226b) && C19383o.m32792b(this.f14227c, aVar.f14227c) && this.f14228d == aVar.f14228d && this.f14229e == aVar.f14229e && this.f14230f == aVar.f14230f && this.f14231g == aVar.f14231g;
    }

    /* renamed from: f */
    public final boolean mo18196f() {
        return this.f14231g;
    }

    /* renamed from: g */
    public final ConfigFlagViewTypes mo18197g() {
        return ConfigFlagViewTypes.SWITCH;
    }

    public final int hashCode() {
        int hashCode = this.f14225a.hashCode() * 31;
        String str = this.f14226b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14227c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.f14228d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        ConfigFlagStatus configFlagStatus = this.f14229e;
        if (configFlagStatus != null) {
            i = configFlagStatus.hashCode();
        }
        int hashCode4 = (this.f14230f.hashCode() + ((i2 + i) * 31)) * 31;
        boolean z3 = this.f14231g;
        if (!z3) {
            z2 = z3;
        }
        return hashCode4 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SwitchConfigFlag(name=");
        h.append(this.f14225a);
        h.append(", owner=");
        h.append(this.f14226b);
        h.append(", team=");
        h.append(this.f14227c);
        h.append(", isChecked=");
        h.append(this.f14228d);
        h.append(", configFlagStatus=");
        h.append(this.f14229e);
        h.append(", origin=");
        h.append(this.f14230f);
        h.append(", isVisible=");
        return C0391c.m1058d(h, this.f14231g, ')');
    }

    public C6417a(String str, String str2, String str3, boolean z, ConfigFlagStatus configFlagStatus, ConfigFlagOrigin configFlagOrigin, boolean z2) {
        C19383o.m32797g(str, "name");
        C19383o.m32797g(configFlagOrigin, CartRefreshDelegate.ARG_ORIGIN);
        this.f14225a = str;
        this.f14226b = str2;
        this.f14227c = str3;
        this.f14228d = z;
        this.f14229e = configFlagStatus;
        this.f14230f = configFlagOrigin;
        this.f14231g = z2;
    }
}
