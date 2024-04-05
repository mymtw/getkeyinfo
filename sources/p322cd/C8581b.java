package p322cd;

import com.google.android.gms.internal.measurement.C14720l8;
import com.google.android.gms.measurement.internal.C14941c2;
import com.google.android.gms.measurement.internal.C14950d2;
import com.google.android.gms.measurement.internal.C14959e2;
import java.util.List;
import kotlin.text.Regex;
import p309ad.C8509e;

/* renamed from: cd.b */
public final class C8581b implements C8509e, C14941c2 {

    /* renamed from: b */
    public static final /* synthetic */ C8581b f18676b = new C8581b();

    /* renamed from: c */
    public boolean mo14c(String str) {
        if (str != null) {
            return new Regex("^[1-9][0-9]{5}").matches(str);
        }
        return false;
    }

    /* renamed from: e */
    public int mo16e() {
        return 6;
    }

    public Object zza() {
        List<C14950d2<?>> list = C14959e2.f33393a;
        return Integer.valueOf((int) C14720l8.f32933c.zza().zze());
    }
}
