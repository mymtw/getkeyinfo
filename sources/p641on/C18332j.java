package p641on;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import p632nn.C18277c;

/* renamed from: on.j */
public final class C18332j implements C18277c {

    /* renamed from: a */
    public final String f40252a;

    /* renamed from: b */
    public final int f40253b;

    public C18332j(String str, int i) {
        this.f40252a = str;
        this.f40253b = i;
    }

    /* renamed from: a */
    public final int mo69824a() {
        return this.f40253b;
    }

    /* renamed from: b */
    public final String mo69825b() {
        if (this.f40253b == 0) {
            return "";
        }
        String str = this.f40252a;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }

    /* renamed from: c */
    public final long mo69826c() {
        if (this.f40253b == 0) {
            return 0;
        }
        String trim = mo69825b().trim();
        try {
            return Long.valueOf(trim).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{trim, "long"}), e);
        }
    }

    /* renamed from: d */
    public final double mo69827d() {
        if (this.f40253b == 0) {
            return ShadowDrawableWrapper.COS_45;
        }
        String trim = mo69825b().trim();
        try {
            return Double.valueOf(trim).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{trim, "double"}), e);
        }
    }

    /* renamed from: e */
    public final boolean mo69828e() throws IllegalArgumentException {
        if (this.f40253b == 0) {
            return false;
        }
        String trim = mo69825b().trim();
        if (C18330h.f40243e.matcher(trim).matches()) {
            return true;
        }
        if (C18330h.f40244f.matcher(trim).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{trim, "boolean"}));
    }
}
