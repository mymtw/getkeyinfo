package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C3382f;
import androidx.work.C3422l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p034c3.C4391o;
import p079d3.C6640l;
import p090e3.C6712a;
import p090e3.C6713b;
import p252u2.C8119a;
import p252u2.C8129j;
import p290y2.C8368c;
import p290y2.C8369d;

/* renamed from: androidx.work.impl.foreground.a */
public final class C3409a implements C8368c, C8119a {

    /* renamed from: l */
    public static final String f7972l = C3422l.m8214e("SystemFgDispatcher");

    /* renamed from: b */
    public Context f7973b;

    /* renamed from: c */
    public C8129j f7974c;

    /* renamed from: d */
    public final C6712a f7975d;

    /* renamed from: e */
    public final Object f7976e = new Object();

    /* renamed from: f */
    public String f7977f;

    /* renamed from: g */
    public final LinkedHashMap f7978g;

    /* renamed from: h */
    public final HashMap f7979h;

    /* renamed from: i */
    public final HashSet f7980i;

    /* renamed from: j */
    public final C8369d f7981j;

    /* renamed from: k */
    public C3410a f7982k;

    /* renamed from: androidx.work.impl.foreground.a$a */
    public interface C3410a {
        void cancelNotification(int i);

        void notify(int i, Notification notification);

        void startForeground(int i, int i2, Notification notification);

        void stop();
    }

    public C3409a(Context context) {
        this.f7973b = context;
        C8129j e = C8129j.m16345e(context);
        this.f7974c = e;
        C6712a aVar = e.f17764d;
        this.f7975d = aVar;
        this.f7977f = null;
        this.f7978g = new LinkedHashMap();
        this.f7980i = new HashSet();
        this.f7979h = new HashMap();
        this.f7981j = new C8369d(this.f7973b, aVar, this);
        this.f7974c.f17766f.mo20714a(this);
    }

    /* renamed from: a */
    public static Intent m8170a(Context context, String str, C3382f fVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", fVar.f7901a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", fVar.f7902b);
        intent.putExtra("KEY_NOTIFICATION", fVar.f7903c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: c */
    public static Intent m8171c(Context context, String str, C3382f fVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", fVar.f7901a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", fVar.f7902b);
        intent.putExtra("KEY_NOTIFICATION", fVar.f7903c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: b */
    public final void mo12868b(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C3422l.m8213c().mo12926a(f7972l, String.format("Constraints unmet for WorkSpec %s", new Object[]{str}), new Throwable[0]);
                C8129j jVar = this.f7974c;
                ((C6713b) jVar.f17764d).mo18901a(new C6640l(jVar, str, true));
            }
        }
    }

    /* renamed from: d */
    public final void mo12893d(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C3422l.m8213c().mo12926a(f7972l, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", new Object[]{Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)}), new Throwable[0]);
        if (notification != null && this.f7982k != null) {
            this.f7978g.put(stringExtra, new C3382f(intExtra, intExtra2, notification));
            if (TextUtils.isEmpty(this.f7977f)) {
                this.f7977f = stringExtra;
                this.f7982k.startForeground(intExtra, intExtra2, notification);
                return;
            }
            this.f7982k.notify(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry value : this.f7978g.entrySet()) {
                    i |= ((C3382f) value.getValue()).f7902b;
                }
                C3382f fVar = (C3382f) this.f7978g.get(this.f7977f);
                if (fVar != null) {
                    this.f7982k.startForeground(fVar.f7901a, i, fVar.f7903c);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo12871e(List<String> list) {
    }

    public final void onExecuted(String str, boolean z) {
        Map.Entry entry;
        synchronized (this.f7976e) {
            try {
                C4391o oVar = (C4391o) this.f7979h.remove(str);
                if (oVar != null ? this.f7980i.remove(oVar) : false) {
                    this.f7981j.mo20960b(this.f7980i);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        C3382f fVar = (C3382f) this.f7978g.remove(str);
        if (str.equals(this.f7977f) && this.f7978g.size() > 0) {
            Iterator it = this.f7978g.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f7977f = (String) entry.getKey();
            if (this.f7982k != null) {
                C3382f fVar2 = (C3382f) entry.getValue();
                this.f7982k.startForeground(fVar2.f7901a, fVar2.f7902b, fVar2.f7903c);
                this.f7982k.cancelNotification(fVar2.f7901a);
            }
        }
        C3410a aVar = this.f7982k;
        if (fVar != null && aVar != null) {
            C3422l.m8213c().mo12926a(f7972l, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", new Object[]{Integer.valueOf(fVar.f7901a), str, Integer.valueOf(fVar.f7902b)}), new Throwable[0]);
            aVar.cancelNotification(fVar.f7901a);
        }
    }
}
