package p665rl;

import androidx.compose.animation.C0391c;
import java.io.File;

/* renamed from: rl.c */
public final class C18485c extends C18497o {

    /* renamed from: a */
    public final File f40718a;

    /* renamed from: b */
    public final String f40719b;

    public C18485c(File file, String str) {
        this.f40718a = file;
        if (str != null) {
            this.f40719b = str;
            return;
        }
        throw new NullPointerException("Null splitId");
    }

    /* renamed from: a */
    public final File mo69993a() {
        return this.f40718a;
    }

    /* renamed from: b */
    public final String mo69994b() {
        return this.f40719b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18497o) {
            C18497o oVar = (C18497o) obj;
            return this.f40718a.equals(oVar.mo69993a()) && this.f40719b.equals(oVar.mo69994b());
        }
    }

    public final int hashCode() {
        return ((this.f40718a.hashCode() ^ 1000003) * 1000003) ^ this.f40719b.hashCode();
    }

    public final String toString() {
        String obj = this.f40718a.toString();
        String str = this.f40719b;
        StringBuilder sb = new StringBuilder(str.length() + obj.length() + 35);
        C0391c.m1061h(sb, "SplitFileInfo{splitFile=", obj, ", splitId=", str);
        sb.append("}");
        return sb.toString();
    }
}
