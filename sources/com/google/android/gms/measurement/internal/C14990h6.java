package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Iterator;
import p517bn.C14134y;
import p596jk.C18005a;

/* renamed from: com.google.android.gms.measurement.internal.h6 */
public final class C14990h6 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33557b;

    /* renamed from: c */
    public /* synthetic */ Object f33558c;

    public /* synthetic */ C14990h6(Object obj, int i) {
        this.f33557b = i;
        this.f33558c = obj;
    }

    public final void run() {
        switch (this.f33557b) {
            case 0:
                C14999i6 i6Var = ((zzjn) this.f33558c).zza;
                Context context = ((C15103u3) i6Var.f33681b).f33872b;
                ((C15103u3) ((zzjn) this.f33558c).zza.f33681b).getClass();
                C14999i6.m24411u(i6Var, new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case 1:
                C18005a aVar = (C18005a) this.f33558c;
                synchronized (aVar.f39392a) {
                    if (aVar.mo69577b()) {
                        Log.e("WakeLock", String.valueOf(aVar.f39401j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                        aVar.mo69579d();
                        if (aVar.mo69577b()) {
                            aVar.f39394c = 1;
                            aVar.mo69580e();
                            return;
                        }
                        return;
                    }
                    return;
                }
            default:
                C14134y yVar = (C14134y) this.f33558c;
                synchronized (yVar.f31141d) {
                    SharedPreferences.Editor edit = yVar.f31138a.edit();
                    String str = yVar.f31139b;
                    StringBuilder sb = new StringBuilder();
                    Iterator<String> it = yVar.f31141d.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next());
                        sb.append(yVar.f31140c);
                    }
                    edit.putString(str, sb.toString()).commit();
                }
                return;
        }
    }
}
