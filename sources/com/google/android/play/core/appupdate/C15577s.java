package com.google.android.play.core.appupdate;

/* renamed from: com.google.android.play.core.appupdate.s */
public final class C15577s extends C15561c {

    /* renamed from: a */
    public final int f35058a;

    /* renamed from: b */
    public final boolean f35059b;

    public /* synthetic */ C15577s(int i, boolean z) {
        this.f35058a = i;
        this.f35059b = z;
    }

    /* renamed from: a */
    public final boolean mo55339a() {
        return this.f35059b;
    }

    /* renamed from: b */
    public final int mo55340b() {
        return this.f35058a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15561c) {
            C15561c cVar = (C15561c) obj;
            return this.f35058a == cVar.mo55340b() && this.f35059b == cVar.mo55339a();
        }
    }

    public final int hashCode() {
        return ((this.f35058a ^ 1000003) * 1000003) ^ (true != this.f35059b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f35058a;
        boolean z = this.f35059b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("AppUpdateOptions{appUpdateType=");
        sb.append(i);
        sb.append(", allowAssetPackDeletion=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
