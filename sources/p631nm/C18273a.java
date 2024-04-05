package p631nm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.appindexing.internal.zzb;
import com.google.firebase.appindexing.internal.zzc;
import p623mm.C18246a;
import p623mm.C18248b;

/* renamed from: nm.a */
public final class C18273a extends C18246a.C18247a {

    /* renamed from: f */
    public String f40105f;

    /* renamed from: a */
    public final zzc mo69822a() {
        Preconditions.checkNotNull(this.f40105f, "setActionToken is required before calling build().");
        Preconditions.checkNotNull(new String(this.f40004e), "setActionStatus is required before calling build().");
        C18274b.m30896a(this.f40000a, "actionToken", this.f40105f);
        String str = this.f40002c;
        String str2 = null;
        if ((str == null ? null : new String(str)) == null) {
            Preconditions.checkNotNull("AssistAction");
            this.f40002c = "AssistAction";
            C18274b.m30896a(this.f40000a, "name", "AssistAction");
        }
        String str3 = this.f40003d;
        if (str3 != null) {
            str2 = new String(str3);
        }
        if (str2 == null) {
            String valueOf = String.valueOf(this.f40105f);
            String concat = valueOf.length() != 0 ? "https://developers.google.com/actions?invocation=".concat(valueOf) : new String("https://developers.google.com/actions?invocation=");
            Preconditions.checkNotNull(concat);
            this.f40003d = concat;
            C18274b.m30896a(this.f40000a, "url", concat);
        }
        Preconditions.checkNotNull(this.f40002c, "setObject is required before calling build().");
        Preconditions.checkNotNull(this.f40003d, "setObject is required before calling build().");
        return new zzc(this.f40001b, this.f40002c, this.f40003d, (String) null, new zzb(new C18248b().f40006a, (String) null, (String) null, (byte[]) null, false), this.f40004e, this.f40000a);
    }
}
