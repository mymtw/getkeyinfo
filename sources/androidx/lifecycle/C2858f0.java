package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.C3265b;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.lifecycle.f0 */
public final class C2858f0 {

    /* renamed from: e */
    public static final Class[] f6481e = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a */
    public final HashMap f6482a;

    /* renamed from: b */
    public final HashMap f6483b;

    /* renamed from: c */
    public final HashMap f6484c;

    /* renamed from: d */
    public final C2859a f6485d;

    /* renamed from: androidx.lifecycle.f0$a */
    public class C2859a implements C3265b.C3267b {
        public C2859a() {
        }

        /* renamed from: a */
        public final Bundle mo1115a() {
            for (Map.Entry entry : new HashMap(C2858f0.this.f6483b).entrySet()) {
                Bundle a = ((C3265b.C3267b) entry.getValue()).mo1115a();
                C2858f0 f0Var = C2858f0.this;
                String str = (String) entry.getKey();
                if (a != null) {
                    f0Var.getClass();
                    Class[] clsArr = C2858f0.f6481e;
                    int i = 0;
                    while (i < 29) {
                        if (!clsArr[i].isInstance(a)) {
                            i++;
                        }
                    }
                    StringBuilder h = C0072d.m201h("Can't put value with type ");
                    h.append(a.getClass());
                    h.append(" into saved state");
                    throw new IllegalArgumentException(h.toString());
                }
                C2895z zVar = (C2895z) f0Var.f6484c.get(str);
                if (zVar != null) {
                    zVar.setValue(a);
                } else {
                    f0Var.f6482a.put(str, a);
                }
            }
            Set<String> keySet = C2858f0.this.f6482a.keySet();
            ArrayList arrayList = new ArrayList(keySet.size());
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (String str2 : keySet) {
                arrayList.add(str2);
                arrayList2.add(C2858f0.this.f6482a.get(str2));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("keys", arrayList);
            bundle.putParcelableArrayList(ResponseConstants.VALUES, arrayList2);
            return bundle;
        }
    }

    public C2858f0(HashMap hashMap) {
        this.f6483b = new HashMap();
        this.f6484c = new HashMap();
        this.f6485d = new C2859a();
        this.f6482a = new HashMap(hashMap);
    }

    public C2858f0() {
        this.f6483b = new HashMap();
        this.f6484c = new HashMap();
        this.f6485d = new C2859a();
        this.f6482a = new HashMap();
    }
}
