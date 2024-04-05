package p250u0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import p260v0.C8184a;

/* renamed from: u0.x */
public final class C8113x implements Iterable<Intent> {

    /* renamed from: b */
    public final ArrayList<Intent> f17711b = new ArrayList<>();

    /* renamed from: c */
    public final Context f17712c;

    /* renamed from: u0.x$a */
    public interface C8114a {
        Intent getSupportParentActivityIntent();
    }

    public C8113x(Context context) {
        this.f17712c = context;
    }

    /* renamed from: a */
    public final void mo20705a(ComponentName componentName) {
        int size = this.f17711b.size();
        try {
            Intent b = C8090f.m16271b(this.f17712c, componentName);
            while (b != null) {
                this.f17711b.add(size, b);
                b = C8090f.m16271b(this.f17712c, b.getComponent());
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: c */
    public final void mo20706c() {
        if (!this.f17711b.isEmpty()) {
            ArrayList<Intent> arrayList = this.f17711b;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            Context context = this.f17712c;
            Object obj = C8184a.f17966a;
            C8184a.C8185a.m16460a(context, intentArr, (Bundle) null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f17711b.iterator();
    }
}
