package androidx.slice;

import p205p2.C7654d;

public final class SliceSpec implements C7654d {

    /* renamed from: a */
    public String f7618a;

    /* renamed from: b */
    public int f7619b;

    public SliceSpec() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SliceSpec)) {
            return false;
        }
        SliceSpec sliceSpec = (SliceSpec) obj;
        return this.f7618a.equals(sliceSpec.f7618a) && this.f7619b == sliceSpec.f7619b;
    }

    public final int hashCode() {
        return this.f7618a.hashCode() + this.f7619b;
    }

    public final String toString() {
        return String.format("SliceSpec{%s,%d}", new Object[]{this.f7618a, Integer.valueOf(this.f7619b)});
    }

    public SliceSpec(String str, int i) {
        this.f7618a = str;
        this.f7619b = i;
    }
}
