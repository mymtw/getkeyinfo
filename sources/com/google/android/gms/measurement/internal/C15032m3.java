package com.google.android.gms.measurement.internal;

import android.os.Process;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0073e;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.play.core.assetpacks.C15619k0;
import com.google.android.play.core.internal.C15684b0;
import com.google.android.play.core.internal.C15686c0;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.measurement.internal.m3 */
public final class C15032m3 implements C15686c0 {

    /* renamed from: b */
    public Object f33680b;

    public /* synthetic */ C15032m3() {
    }

    public /* synthetic */ C15032m3(Object obj) {
        this.f33680b = obj;
    }

    /* renamed from: g */
    public static String m24534g(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                String valueOf = String.valueOf(str2);
                Log.e("PlayCore", valueOf.length() != 0 ? "Unable to format ".concat(valueOf) : new String("Unable to format "), e);
                String join = TextUtils.join(", ", objArr);
                str2 = C0073e.m210j(new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length()), str2, " [", join, "]");
            }
        }
        return C0070b.m184f(new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length()), str, " : ", str2);
    }

    /* renamed from: a */
    public final void mo52241a(int i, String str, List list, boolean z, boolean z2) {
        int i2 = i - 1;
        C15031m2 m2Var = i2 != 0 ? i2 != 1 ? i2 != 3 ? i2 != 4 ? ((C15103u3) ((C15041n3) this.f33680b).f33681b).mo52016b().f33730m : z ? ((C15103u3) ((C15041n3) this.f33680b).f33681b).mo52016b().f33728k : !z2 ? ((C15103u3) ((C15041n3) this.f33680b).f33681b).mo52016b().f33729l : ((C15103u3) ((C15041n3) this.f33680b).f33681b).mo52016b().f33727j : ((C15103u3) ((C15041n3) this.f33680b).f33681b).mo52016b().f33732o : z ? ((C15103u3) ((C15041n3) this.f33680b).f33681b).mo52016b().f33725h : !z2 ? ((C15103u3) ((C15041n3) this.f33680b).f33681b).mo52016b().f33726i : ((C15103u3) ((C15041n3) this.f33680b).f33681b).mo52016b().f33724g : ((C15103u3) ((C15041n3) this.f33680b).f33681b).mo52016b().f33731n;
        int size = list.size();
        if (size == 1) {
            m2Var.mo52238b(list.get(0), str);
        } else if (size == 2) {
            m2Var.mo52239c(list.get(0), str, list.get(1));
        } else if (size != 3) {
            m2Var.mo52237a(str);
        } else {
            m2Var.mo52240d(list.get(0), list.get(1), list.get(2), str);
        }
    }

    /* renamed from: b */
    public final void mo52242b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", m24534g((String) this.f33680b, str, objArr));
        }
    }

    /* renamed from: c */
    public final void mo52243c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m24534g((String) this.f33680b, str, objArr));
        }
    }

    /* renamed from: d */
    public final void mo52244d(Exception exc, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m24534g((String) this.f33680b, str, objArr), exc);
        }
    }

    /* renamed from: e */
    public final void mo52245e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", m24534g((String) this.f33680b, str, objArr));
        }
    }

    /* renamed from: f */
    public final void mo52246f(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", m24534g((String) this.f33680b, str, objArr));
        }
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        return new C15619k0(C15684b0.m25502a((C15686c0) this.f33680b));
    }

    public /* synthetic */ C15032m3(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String sb2 = sb.toString();
        this.f33680b = str.length() != 0 ? sb2.concat(str) : new String(sb2);
    }
}
