package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.C2885q;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import p003a2.C0023f;
import p019b.C3443a;

/* renamed from: androidx.activity.result.f */
public abstract class C0123f {

    /* renamed from: a */
    public Random f201a = new Random();

    /* renamed from: b */
    public final HashMap f202b = new HashMap();

    /* renamed from: c */
    public final HashMap f203c = new HashMap();

    /* renamed from: d */
    public final HashMap f204d = new HashMap();

    /* renamed from: e */
    public ArrayList<String> f205e = new ArrayList<>();

    /* renamed from: f */
    public final transient HashMap f206f = new HashMap();

    /* renamed from: g */
    public final HashMap f207g = new HashMap();

    /* renamed from: h */
    public final Bundle f208h = new Bundle();

    /* renamed from: androidx.activity.result.f$a */
    public static class C0124a<O> {

        /* renamed from: a */
        public final C0118a<O> f209a;

        /* renamed from: b */
        public final C3443a<?, O> f210b;

        public C0124a(C3443a aVar, C0118a aVar2) {
            this.f209a = aVar2;
            this.f210b = aVar;
        }
    }

    /* renamed from: androidx.activity.result.f$b */
    public static class C0125b {

        /* renamed from: a */
        public final Lifecycle f211a;

        /* renamed from: b */
        public final ArrayList<C2885q> f212b = new ArrayList<>();

        public C0125b(Lifecycle lifecycle) {
            this.f211a = lifecycle;
        }
    }

    /* renamed from: a */
    public final boolean mo1159a(int i, int i2, Intent intent) {
        C0118a<O> aVar;
        String str = (String) this.f202b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.f205e.remove(str);
        C0124a aVar2 = (C0124a) this.f206f.get(str);
        if (aVar2 == null || (aVar = aVar2.f209a) == null) {
            this.f207g.remove(str);
            this.f208h.putParcelable(str, new ActivityResult(i2, intent));
            return true;
        }
        aVar.mo413a(aVar2.f210b.mo1147c(i2, intent));
        return true;
    }

    /* renamed from: b */
    public abstract void mo1103b(int i, C3443a aVar, @SuppressLint({"UnknownNullness"}) Object obj);

    /* renamed from: c */
    public final C0121d mo1160c(String str, C2887s sVar, C3443a aVar, C0118a aVar2) {
        Lifecycle lifecycle = sVar.getLifecycle();
        if (!lifecycle.mo10734b().isAtLeast(Lifecycle.State.STARTED)) {
            int e = mo1162e(str);
            C0125b bVar = (C0125b) this.f204d.get(str);
            if (bVar == null) {
                bVar = new C0125b(lifecycle);
            }
            ActivityResultRegistry$1 activityResultRegistry$1 = new ActivityResultRegistry$1(this, str, aVar2, aVar);
            bVar.f211a.mo10733a(activityResultRegistry$1);
            bVar.f212b.add(activityResultRegistry$1);
            this.f204d.put(str, bVar);
            return new C0121d(this, str, e, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + sVar + " is attempting to register while current state is " + lifecycle.mo10734b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* renamed from: d */
    public final C0122e mo1161d(String str, C3443a aVar, C0118a aVar2) {
        int e = mo1162e(str);
        this.f206f.put(str, new C0124a(aVar, aVar2));
        if (this.f207g.containsKey(str)) {
            Object obj = this.f207g.get(str);
            this.f207g.remove(str);
            aVar2.mo413a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f208h.getParcelable(str);
        if (activityResult != null) {
            this.f208h.remove(str);
            aVar2.mo413a(aVar.mo1147c(activityResult.getResultCode(), activityResult.getData()));
        }
        return new C0122e(this, str, e, aVar);
    }

    /* renamed from: e */
    public final int mo1162e(String str) {
        Integer num = (Integer) this.f203c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int nextInt = this.f201a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (this.f202b.containsKey(Integer.valueOf(i))) {
                nextInt = this.f201a.nextInt(2147418112);
            } else {
                this.f202b.put(Integer.valueOf(i), str);
                this.f203c.put(str, Integer.valueOf(i));
                return i;
            }
        }
    }

    /* renamed from: f */
    public final void mo1163f(String str) {
        Integer num;
        if (!this.f205e.contains(str) && (num = (Integer) this.f203c.remove(str)) != null) {
            this.f202b.remove(num);
        }
        this.f206f.remove(str);
        if (this.f207g.containsKey(str)) {
            StringBuilder l = C0023f.m111l("Dropping pending result for request ", str, ": ");
            l.append(this.f207g.get(str));
            Log.w("ActivityResultRegistry", l.toString());
            this.f207g.remove(str);
        }
        if (this.f208h.containsKey(str)) {
            StringBuilder l2 = C0023f.m111l("Dropping pending result for request ", str, ": ");
            l2.append(this.f208h.getParcelable(str));
            Log.w("ActivityResultRegistry", l2.toString());
            this.f208h.remove(str);
        }
        C0125b bVar = (C0125b) this.f204d.get(str);
        if (bVar != null) {
            Iterator<C2885q> it = bVar.f212b.iterator();
            while (it.hasNext()) {
                bVar.f211a.mo10735c(it.next());
            }
            bVar.f212b.clear();
            this.f204d.remove(str);
        }
    }
}
