package androidx.compose.runtime;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.C14955d7;
import com.google.android.gms.measurement.internal.C14973f7;
import com.google.android.gms.measurement.internal.C15009j7;
import com.google.android.gms.measurement.internal.C15103u3;
import com.google.android.play.core.appupdate.C15568j;
import com.google.android.play.core.appupdate.C15576r;
import com.google.android.play.core.assetpacks.C15588c1;
import com.google.android.play.core.internal.C15686c0;
import com.google.firebase.messaging.C16586b;
import com.google.firebase.messaging.C16588c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.C19327t;
import p605kk.C18119c;
import p605kk.C18123g;

/* renamed from: androidx.compose.runtime.o0 */
public final class C1353o0 implements C15009j7, C15686c0, C18119c {

    /* renamed from: b */
    public Object f2952b;

    public C1353o0(int i) {
        if (i == 3) {
            this.f2952b = new ConcurrentHashMap();
        }
    }

    /* renamed from: a */
    public final void mo5903a(int i) {
        if (!((List) this.f2952b).isEmpty()) {
            if (((Number) ((List) this.f2952b).get(0)).intValue() != i) {
                Object obj = this.f2952b;
                if (((Number) ((List) obj).get(((List) obj).size() - 1)).intValue() == i) {
                    return;
                }
            } else {
                return;
            }
        }
        int size = ((List) this.f2952b).size();
        ((List) this.f2952b).add(Integer.valueOf(i));
        while (size > 0) {
            int i2 = ((size + 1) >>> 1) - 1;
            int intValue = ((Number) ((List) this.f2952b).get(i2)).intValue();
            if (i <= intValue) {
                break;
            }
            ((List) this.f2952b).set(size, Integer.valueOf(intValue));
            size = i2;
        }
        ((List) this.f2952b).set(size, Integer.valueOf(i));
    }

    /* renamed from: b */
    public final int mo5904b() {
        int intValue;
        if (((List) this.f2952b).size() > 0) {
            int intValue2 = ((Number) ((List) this.f2952b).get(0)).intValue();
            while ((!((List) this.f2952b).isEmpty()) && ((Number) ((List) this.f2952b).get(0)).intValue() == intValue2) {
                List list = (List) this.f2952b;
                list.set(0, C19327t.m32645a1(list));
                List list2 = (List) this.f2952b;
                list2.remove(list2.size() - 1);
                int size = ((List) this.f2952b).size();
                int size2 = ((List) this.f2952b).size() >>> 1;
                int i = 0;
                while (i < size2) {
                    int intValue3 = ((Number) ((List) this.f2952b).get(i)).intValue();
                    int i2 = (i + 1) * 2;
                    int i3 = i2 - 1;
                    int intValue4 = ((Number) ((List) this.f2952b).get(i3)).intValue();
                    if (i2 < size && (intValue = ((Number) ((List) this.f2952b).get(i2)).intValue()) > intValue4) {
                        if (intValue <= intValue3) {
                            break;
                        }
                        ((List) this.f2952b).set(i, Integer.valueOf(intValue));
                        ((List) this.f2952b).set(i2, Integer.valueOf(intValue3));
                        i = i2;
                    } else if (intValue4 <= intValue3) {
                        break;
                    } else {
                        ((List) this.f2952b).set(i, Integer.valueOf(intValue4));
                        ((List) this.f2952b).set(i3, Integer.valueOf(intValue3));
                        i = i3;
                    }
                }
            }
            return intValue2;
        }
        ComposerKt.m2526c("Set is empty".toString());
        throw null;
    }

    public final void onComplete(C18123g gVar) {
        int i = C16586b.f36799b;
        ((C16588c.C16589a) this.f2952b).f36808b.mo69680d(null);
    }

    public final Object zza() {
        Context context = (Context) ((C15568j) ((C15686c0) this.f2952b)).f35038b.f35037c;
        C15588c1.m25311V0(context);
        return new C15576r(context);
    }

    public /* synthetic */ C1353o0(Object obj) {
        this.f2952b = obj;
    }

    public /* synthetic */ C1353o0() {
        this.f2952b = new ArrayList();
    }

    public final void zza(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            C15103u3 u3Var = ((C14973f7) this.f2952b).f33497m;
            if (u3Var != null) {
                u3Var.mo52016b().f33724g.mo52238b("_err", "AppId not known when logging event");
                return;
            }
            return;
        }
        ((C14973f7) this.f2952b).mo52015a().mo52308o(new C14955d7(this, str, bundle));
    }
}
