package com.etsy.android.config.flags;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.config.EtsyConfigKey;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.config.flags.a */
public final class C6343a {

    /* renamed from: a */
    public final List<EtsyConfigKey> f14135a;

    public C6343a(List<? extends EtsyConfigKey> list) {
        C19383o.m32797g(list, "keys");
        this.f14135a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6343a) && C19383o.m32792b(this.f14135a, ((C6343a) obj).f14135a);
    }

    public final int hashCode() {
        return this.f14135a.hashCode();
    }

    public final String toString() {
        return C0070b.m186i(C0072d.m201h("CompiledConfigKeysForMenu(keys="), this.f14135a, ')');
    }
}
