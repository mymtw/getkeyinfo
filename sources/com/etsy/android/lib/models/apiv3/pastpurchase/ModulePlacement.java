package com.etsy.android.lib.models.apiv3.pastpurchase;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class ModulePlacement {
    public static final int $stable = 8;
    private final Module module;
    private final int position;

    public ModulePlacement(@C17402n(name = "index_placement") int i, @C17402n(name = "module") Module module2) {
        C19383o.m32797g(module2, "module");
        this.position = i;
        this.module = module2;
    }

    public static /* synthetic */ ModulePlacement copy$default(ModulePlacement modulePlacement, int i, Module module2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = modulePlacement.position;
        }
        if ((i2 & 2) != 0) {
            module2 = modulePlacement.module;
        }
        return modulePlacement.copy(i, module2);
    }

    public final int component1() {
        return this.position;
    }

    public final Module component2() {
        return this.module;
    }

    public final ModulePlacement copy(@C17402n(name = "index_placement") int i, @C17402n(name = "module") Module module2) {
        C19383o.m32797g(module2, "module");
        return new ModulePlacement(i, module2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModulePlacement)) {
            return false;
        }
        ModulePlacement modulePlacement = (ModulePlacement) obj;
        return this.position == modulePlacement.position && C19383o.m32792b(this.module, modulePlacement.module);
    }

    public final Module getModule() {
        return this.module;
    }

    public final int getPosition() {
        return this.position;
    }

    public int hashCode() {
        return this.module.hashCode() + (Integer.hashCode(this.position) * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ModulePlacement(position=");
        h.append(this.position);
        h.append(", module=");
        h.append(this.module);
        h.append(')');
        return h.toString();
    }
}
