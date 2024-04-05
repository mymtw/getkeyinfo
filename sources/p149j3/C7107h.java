package p149j3;

import android.content.Intent;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import com.bugsnag.android.repackaged.dslplatform.json.C5846d;
import com.bugsnag.android.repackaged.dslplatform.json.C5847e;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.play.core.appupdate.C15562d;
import com.google.android.play.core.assetpacks.C15584b1;
import com.google.android.play.core.assetpacks.C15592d1;
import com.google.android.play.core.assetpacks.C15596e1;
import com.google.android.play.core.assetpacks.C15600f1;
import com.google.android.play.core.assetpacks.C15604g1;
import com.google.android.play.core.assetpacks.C15608h1;
import com.google.android.play.core.assetpacks.C15677y2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19543e0;
import p077d1.C6619c;
import p604kj.C18096a;
import p604kj.C18115t;
import p605kk.C18116a;
import p605kk.C18123g;

/* renamed from: j3.h */
public final class C7107h implements C18116a, C15604g1 {

    /* renamed from: b */
    public final /* synthetic */ int f15810b;

    /* renamed from: c */
    public Object f15811c;

    /* renamed from: d */
    public Object f15812d;

    public /* synthetic */ C7107h(int i, Object obj, Object obj2) {
        this.f15810b = i;
        this.f15811c = obj;
        this.f15812d = obj2;
    }

    /* renamed from: a */
    public static String[] m13773a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return new String[]{String.format("_%s_DslJsonConverter", new Object[]{str})};
        }
        String substring = str.substring(0, lastIndexOf);
        String substring2 = str.substring(lastIndexOf + 1);
        return new String[]{String.format("%s._%s_DslJsonConverter", new Object[]{substring, substring2}), String.format("dsl_json.%s._%s_DslJsonConverter", new Object[]{substring, substring2}), String.format("dsl_json.%s.%sDslJsonConverter", new Object[]{substring, substring2})};
    }

    /* renamed from: b */
    public final synchronized void mo19436b(Class cls, C5847e eVar) {
        String name = cls.getName();
        if (((Set) this.f15811c).add(name)) {
            String[] a = m13773a(name);
            for (ClassLoader classLoader : (ClassLoader[]) this.f15812d) {
                int length = a.length;
                int i = 0;
                while (i < length) {
                    try {
                        Class<?> loadClass = classLoader.loadClass(a[i]);
                        if (!C5846d.class.isAssignableFrom(loadClass)) {
                            i++;
                        } else {
                            ((C5846d) loadClass.newInstance()).mo16652a();
                            return;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f15810b) {
            case 0:
                if (obj instanceof C6619c) {
                    C6619c cVar = (C6619c) obj;
                    F f = cVar.f14606a;
                    F f2 = this.f15811c;
                    if (f == f2 || (f != null && f.equals(f2))) {
                        S s = cVar.f14607b;
                        S s2 = this.f15812d;
                        if (s == s2 || (s != null && s.equals(s2))) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    public final int hashCode() {
        switch (this.f15810b) {
            case 0:
                Object obj = this.f15811c;
                int i = 0;
                int hashCode = obj == null ? 0 : obj.hashCode();
                Object obj2 = this.f15812d;
                if (obj2 != null) {
                    i = obj2.hashCode();
                }
                return hashCode ^ i;
            default:
                return super.hashCode();
        }
    }

    public final Object then(C18123g gVar) {
        C18096a aVar = (C18096a) this.f15811c;
        Bundle bundle = (Bundle) this.f15812d;
        aVar.getClass();
        if (!gVar.mo69668o()) {
            return gVar;
        }
        Bundle bundle2 = (Bundle) gVar.mo69664k();
        return !(bundle2 != null && bundle2.containsKey("google.messenger")) ? gVar : aVar.mo69627a(bundle).mo69669p(C18115t.f39559b, C19388s.f43278i);
    }

    public final String toString() {
        switch (this.f15810b) {
            case 0:
                StringBuilder h = C0072d.m201h("Pair{");
                h.append(String.valueOf(this.f15811c));
                h.append(" ");
                h.append(String.valueOf(this.f15812d));
                h.append("}");
                return h.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: finally extract failed */
    public final Object zza() {
        C15600f1 f1Var;
        C15608h1 h1Var = (C15608h1) this.f15811c;
        Bundle bundle = (Bundle) this.f15812d;
        h1Var.getClass();
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.FALSE;
        }
        HashMap hashMap = h1Var.f35174e;
        Integer valueOf = Integer.valueOf(i);
        boolean z = false;
        if (hashMap.containsKey(valueOf)) {
            C15596e1 c = h1Var.mo55411c(i);
            int i2 = bundle.getInt(C15562d.m25188Z(ResponseConstants.STATUS, c.f35123c.f35103a));
            C15592d1 d1Var = c.f35123c;
            int i3 = d1Var.f35106d;
            if (C19543e0.m33343x0(i3, i2)) {
                C15608h1.f35169g.mo52242b("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(i3));
                C15592d1 d1Var2 = c.f35123c;
                String str = d1Var2.f35103a;
                int i4 = d1Var2.f35106d;
                if (i4 == 4) {
                    ((C15677y2) h1Var.f35171b.zza()).mo55464a(i, str);
                } else if (i4 == 5) {
                    ((C15677y2) h1Var.f35171b.zza()).mo55465b(i);
                } else if (i4 == 6) {
                    ((C15677y2) h1Var.f35171b.zza()).mo55468e(Arrays.asList(new String[]{str}));
                }
            } else {
                d1Var.f35106d = i2;
                if (i2 == 5 || i2 == 6 || i2 == 4) {
                    try {
                        h1Var.f35175f.lock();
                        h1Var.mo55409a(i);
                        h1Var.f35175f.unlock();
                        h1Var.f35172c.mo55504a(c.f35123c.f35103a);
                    } catch (Throwable th) {
                        h1Var.f35175f.unlock();
                        throw th;
                    }
                } else {
                    for (C15600f1 f1Var2 : d1Var.f35108f) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C15562d.m25190a0("chunk_intents", c.f35123c.f35103a, f1Var2.f35133a));
                        if (parcelableArrayList != null) {
                            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                if (!(parcelableArrayList.get(i5) == null || ((Intent) parcelableArrayList.get(i5)).getData() == null)) {
                                    ((C15584b1) f1Var2.f35136d.get(i5)).f35069a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String e = C15608h1.m25395e(bundle);
            long j = bundle.getLong(C15562d.m25188Z("pack_version", e));
            String string = bundle.getString(C15562d.m25188Z("pack_version_tag", e), "");
            int i6 = bundle.getInt(C15562d.m25188Z(ResponseConstants.STATUS, e));
            long j2 = bundle.getLong(C15562d.m25188Z("total_bytes_to_download", e));
            List<String> stringArrayList = bundle.getStringArrayList(C15562d.m25188Z("slice_ids", e));
            ArrayList arrayList = new ArrayList();
            if (stringArrayList == null) {
                stringArrayList = Collections.emptyList();
            }
            for (String str2 : stringArrayList) {
                List<Intent> parcelableArrayList2 = bundle.getParcelableArrayList(C15562d.m25190a0("chunk_intents", e, str2));
                ArrayList arrayList2 = new ArrayList();
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = Collections.emptyList();
                }
                for (Intent intent : parcelableArrayList2) {
                    if (intent != null) {
                        z = true;
                    }
                    arrayList2.add(new C15584b1(z));
                    z = false;
                }
                String string2 = bundle.getString(C15562d.m25190a0("uncompressed_hash_sha256", e, str2));
                long j3 = bundle.getLong(C15562d.m25190a0("uncompressed_size", e, str2));
                int i7 = bundle.getInt(C15562d.m25190a0("patch_format", e, str2), 0);
                if (i7 != 0) {
                    f1Var = new C15600f1(str2, string2, j3, arrayList2, 0, i7);
                    z = false;
                } else {
                    z = false;
                    f1Var = new C15600f1(str2, string2, j3, arrayList2, bundle.getInt(C15562d.m25190a0("compression_format", e, str2), 0), 0);
                }
                arrayList.add(f1Var);
            }
            h1Var.f35174e.put(Integer.valueOf(i), new C15596e1(i, bundle.getInt("app_version_code"), new C15592d1(e, j, i6, j2, arrayList, string)));
        }
        return Boolean.TRUE;
    }

    public C7107h(HashSet hashSet) {
        this.f15810b = 1;
        this.f15811c = new HashSet();
        this.f15812d = (ClassLoader[]) hashSet.toArray(new ClassLoader[0]);
    }

    public C7107h() {
        this.f15810b = 0;
    }
}
