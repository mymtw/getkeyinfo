package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.conversation.MessageDraft;
import com.google.android.gms.common.util.ProcessUtils;

/* renamed from: com.google.android.gms.measurement.internal.l2 */
public final class C15022l2 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33648b;

    /* renamed from: c */
    public final /* synthetic */ String f33649c;

    /* renamed from: d */
    public final /* synthetic */ Object f33650d;

    /* renamed from: e */
    public final /* synthetic */ Object f33651e;

    /* renamed from: f */
    public final /* synthetic */ Object f33652f;

    /* renamed from: g */
    public final /* synthetic */ C15049o2 f33653g;

    public C15022l2(C15049o2 o2Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f33653g = o2Var;
        this.f33648b = i;
        this.f33649c = str;
        this.f33650d = obj;
        this.f33651e = obj2;
        this.f33652f = obj3;
    }

    public final void run() {
        C14942c3 q = ((C15103u3) this.f33653g.f33681b).mo52330q();
        if (q.f33708c) {
            C15049o2 o2Var = this.f33653g;
            if (o2Var.f33721d == 0) {
                C14947d dVar = ((C15103u3) o2Var.f33681b).f33878h;
                if (dVar.f33335e == null) {
                    synchronized (dVar) {
                        if (dVar.f33335e == null) {
                            ApplicationInfo applicationInfo = ((C15103u3) dVar.f33681b).f33872b.getApplicationInfo();
                            String myProcessName = ProcessUtils.getMyProcessName();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                dVar.f33335e = Boolean.valueOf(str != null && str.equals(myProcessName));
                            }
                            if (dVar.f33335e == null) {
                                dVar.f33335e = Boolean.TRUE;
                                ((C15103u3) dVar.f33681b).mo52016b().f33724g.mo52237a("My process not in the list of running processes");
                            }
                        }
                    }
                }
                if (dVar.f33335e.booleanValue()) {
                    C15049o2 o2Var2 = this.f33653g;
                    ((C15103u3) o2Var2.f33681b).getClass();
                    o2Var2.f33721d = 'C';
                } else {
                    C15049o2 o2Var3 = this.f33653g;
                    ((C15103u3) o2Var3.f33681b).getClass();
                    o2Var3.f33721d = 'c';
                }
            }
            C15049o2 o2Var4 = this.f33653g;
            if (o2Var4.f33722e < 0) {
                ((C15103u3) o2Var4.f33681b).f33878h.mo51969l();
                o2Var4.f33722e = 46000;
            }
            char charAt = "01VDIWEA?".charAt(this.f33648b);
            C15049o2 o2Var5 = this.f33653g;
            char c = o2Var5.f33721d;
            long j = o2Var5.f33722e;
            String q2 = C15049o2.m24576q(true, this.f33649c, this.f33650d, this.f33651e, this.f33652f);
            StringBuilder sb = new StringBuilder(q2.length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(c);
            sb.append(j);
            sb.append(MessageDraft.IMAGE_DELIMITER);
            sb.append(q2);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.f33649c.substring(0, RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE);
            }
            C15142z2 z2Var = q.f33300e;
            if (z2Var != null) {
                z2Var.f34008e.mo51995g();
                if (z2Var.f34008e.mo51953k().getLong(z2Var.f34004a, 0) == 0) {
                    z2Var.mo52372a();
                }
                if (sb2 == null) {
                    sb2 = "";
                }
                long j2 = z2Var.f34008e.mo51953k().getLong(z2Var.f34005b, 0);
                if (j2 <= 0) {
                    SharedPreferences.Editor edit = z2Var.f34008e.mo51953k().edit();
                    edit.putString(z2Var.f34006c, sb2);
                    edit.putLong(z2Var.f34005b, 1);
                    edit.apply();
                    return;
                }
                long nextLong = ((C15103u3) z2Var.f34008e.f33681b).mo52335w().mo52218o().nextLong();
                long j3 = j2 + 1;
                SharedPreferences.Editor edit2 = z2Var.f34008e.mo51953k().edit();
                if ((Long.MAX_VALUE & nextLong) < Long.MAX_VALUE / j3) {
                    edit2.putString(z2Var.f34006c, sb2);
                }
                edit2.putLong(z2Var.f34005b, j3);
                edit2.apply();
                return;
            }
            return;
        }
        Log.println(6, this.f33653g.mo52279s(), "Persisted config not initialized. Not logging error/warn");
    }
}
