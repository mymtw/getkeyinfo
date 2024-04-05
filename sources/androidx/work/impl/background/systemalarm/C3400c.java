package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.C3422l;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.C3401d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p034c3.C4391o;
import p034c3.C4394q;
import p079d3.C6641m;
import p079d3.C6648r;
import p252u2.C8119a;
import p290y2.C8368c;
import p290y2.C8369d;

/* renamed from: androidx.work.impl.background.systemalarm.c */
public final class C3400c implements C8368c, C8119a, C6648r.C6650b {

    /* renamed from: k */
    public static final String f7937k = C3422l.m8214e("DelayMetCommandHandler");

    /* renamed from: b */
    public final Context f7938b;

    /* renamed from: c */
    public final int f7939c;

    /* renamed from: d */
    public final String f7940d;

    /* renamed from: e */
    public final C3401d f7941e;

    /* renamed from: f */
    public final C8369d f7942f;

    /* renamed from: g */
    public final Object f7943g = new Object();

    /* renamed from: h */
    public int f7944h = 0;

    /* renamed from: i */
    public PowerManager.WakeLock f7945i;

    /* renamed from: j */
    public boolean f7946j = false;

    public C3400c(Context context, int i, String str, C3401d dVar) {
        this.f7938b = context;
        this.f7939c = i;
        this.f7941e = dVar;
        this.f7940d = str;
        this.f7942f = new C8369d(context, dVar.f7949c, this);
    }

    /* renamed from: a */
    public final void mo12867a(String str) {
        C3422l.m8213c().mo12926a(f7937k, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        mo12872f();
    }

    /* renamed from: b */
    public final void mo12868b(ArrayList arrayList) {
        mo12872f();
    }

    /* renamed from: c */
    public final void mo12869c() {
        synchronized (this.f7943g) {
            this.f7942f.mo20961c();
            this.f7941e.f7950d.mo18827b(this.f7940d);
            PowerManager.WakeLock wakeLock = this.f7945i;
            if (wakeLock != null && wakeLock.isHeld()) {
                C3422l.m8213c().mo12926a(f7937k, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f7945i, this.f7940d}), new Throwable[0]);
                this.f7945i.release();
            }
        }
    }

    /* renamed from: d */
    public final void mo12870d() {
        this.f7945i = C6641m.m13020a(this.f7938b, String.format("%s (%s)", new Object[]{this.f7940d, Integer.valueOf(this.f7939c)}));
        C3422l c = C3422l.m8213c();
        String str = f7937k;
        c.mo12926a(str, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.f7945i, this.f7940d}), new Throwable[0]);
        this.f7945i.acquire();
        C4391o i = ((C4394q) this.f7941e.f7952f.f17763c.mo12857t()).mo14333i(this.f7940d);
        if (i == null) {
            mo12872f();
            return;
        }
        boolean b = i.mo14318b();
        this.f7946j = b;
        if (!b) {
            C3422l.m8213c().mo12926a(str, String.format("No constraints for %s", new Object[]{this.f7940d}), new Throwable[0]);
            mo12871e(Collections.singletonList(this.f7940d));
            return;
        }
        this.f7942f.mo20960b(Collections.singletonList(i));
    }

    /* renamed from: e */
    public final void mo12871e(List<String> list) {
        if (list.contains(this.f7940d)) {
            synchronized (this.f7943g) {
                if (this.f7944h == 0) {
                    this.f7944h = 1;
                    C3422l.m8213c().mo12926a(f7937k, String.format("onAllConstraintsMet for %s", new Object[]{this.f7940d}), new Throwable[0]);
                    if (this.f7941e.f7951e.mo20717e(this.f7940d, (WorkerParameters.C3371a) null)) {
                        this.f7941e.f7950d.mo18826a(this.f7940d, this);
                    } else {
                        mo12869c();
                    }
                } else {
                    C3422l.m8213c().mo12926a(f7937k, String.format("Already started work for %s", new Object[]{this.f7940d}), new Throwable[0]);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo12872f() {
        synchronized (this.f7943g) {
            if (this.f7944h < 2) {
                this.f7944h = 2;
                C3422l c = C3422l.m8213c();
                String str = f7937k;
                c.mo12926a(str, String.format("Stopping work for WorkSpec %s", new Object[]{this.f7940d}), new Throwable[0]);
                Context context = this.f7938b;
                String str2 = this.f7940d;
                Intent intent = new Intent(context, SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                C3401d dVar = this.f7941e;
                dVar.mo12876d(new C3401d.C3403b(this.f7939c, intent, dVar));
                if (this.f7941e.f7951e.mo20715c(this.f7940d)) {
                    C3422l.m8213c().mo12926a(str, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.f7940d}), new Throwable[0]);
                    Intent b = C3398a.m8157b(this.f7938b, this.f7940d);
                    C3401d dVar2 = this.f7941e;
                    dVar2.mo12876d(new C3401d.C3403b(this.f7939c, b, dVar2));
                } else {
                    C3422l.m8213c().mo12926a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f7940d}), new Throwable[0]);
                }
            } else {
                C3422l.m8213c().mo12926a(f7937k, String.format("Already stopped work for %s", new Object[]{this.f7940d}), new Throwable[0]);
            }
        }
    }

    public final void onExecuted(String str, boolean z) {
        C3422l.m8213c().mo12926a(f7937k, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)}), new Throwable[0]);
        mo12869c();
        if (z) {
            Intent b = C3398a.m8157b(this.f7938b, this.f7940d);
            C3401d dVar = this.f7941e;
            dVar.mo12876d(new C3401d.C3403b(this.f7939c, b, dVar));
        }
        if (this.f7946j) {
            Intent intent = new Intent(this.f7938b, SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            C3401d dVar2 = this.f7941e;
            dVar2.mo12876d(new C3401d.C3403b(this.f7939c, intent, dVar2));
        }
    }
}
