package p261v1;

import android.text.TextUtils;
import java.util.Objects;

/* renamed from: v1.c */
public class C8194c {

    /* renamed from: a */
    public String f17970a;

    /* renamed from: b */
    public int f17971b;

    /* renamed from: c */
    public int f17972c;

    public C8194c(String str, int i, int i2) {
        this.f17970a = str;
        this.f17971b = i;
        this.f17972c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8194c)) {
            return false;
        }
        C8194c cVar = (C8194c) obj;
        return (this.f17971b < 0 || cVar.f17971b < 0) ? TextUtils.equals(this.f17970a, cVar.f17970a) && this.f17972c == cVar.f17972c : TextUtils.equals(this.f17970a, cVar.f17970a) && this.f17971b == cVar.f17971b && this.f17972c == cVar.f17972c;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f17970a, Integer.valueOf(this.f17972c)});
    }
}
