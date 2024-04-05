package p089e2;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p010a9.C0048b;
import p193o.C7496d;
import p193o.C7500h;

/* renamed from: e2.a */
public final class C6706a {

    /* renamed from: a */
    public final Context f14786a;

    /* renamed from: b */
    public final String f14787b;

    /* renamed from: c */
    public final int f14788c;

    /* renamed from: d */
    public final String[] f14789d;

    /* renamed from: e2.a$a */
    public static class C6707a {

        /* renamed from: a */
        public final C7496d<String[]> f14790a;

        /* renamed from: b */
        public final String f14791b;

        public C6707a(String str, Set set, boolean z) {
            C7496d<String[]> dVar = new C7496d<>();
            this.f14790a = dVar;
            if (z) {
                dVar.add(new String[0]);
            } else {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    C7496d<String[]> dVar2 = this.f14790a;
                    String[] split = ((String) it.next()).split("/", -1);
                    for (int i = 0; i < split.length; i++) {
                        split[i] = Uri.decode(split[i]);
                    }
                    dVar2.add(split);
                }
            }
            this.f14791b = str;
        }

        /* renamed from: b */
        public static boolean m13091b(String[] strArr, String[] strArr2) {
            int length = strArr.length;
            if (strArr2.length < length) {
                return false;
            }
            for (int i = 0; i < length; i++) {
                if (!Objects.equals(strArr2[i], strArr[i])) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        public final boolean mo18891a(List<String> list) {
            C7500h.C7501a aVar;
            String[] strArr = (String[]) list.toArray(new String[list.size()]);
            Iterator<String[]> it = this.f14790a.iterator();
            do {
                aVar = (C7500h.C7501a) it;
                if (!aVar.hasNext()) {
                    return false;
                }
            } while (!m13091b((String[]) aVar.next(), strArr));
            return true;
        }

        /* renamed from: c */
        public final C7496d mo18892c() {
            C7496d dVar = new C7496d();
            Iterator<String[]> it = this.f14790a.iterator();
            while (true) {
                C7500h.C7501a aVar = (C7500h.C7501a) it;
                if (!aVar.hasNext()) {
                    return dVar;
                }
                String[] strArr = (String[]) aVar.next();
                String[] strArr2 = new String[strArr.length];
                for (int i = 0; i < strArr.length; i++) {
                    strArr2[i] = Uri.encode(strArr[i]);
                }
                dVar.add(TextUtils.join("/", strArr2));
            }
        }
    }

    public C6706a(Context context, String str, int i, String[] strArr) {
        this.f14786a = context;
        this.f14787b = str;
        this.f14788c = i;
        this.f14789d = strArr;
    }

    /* renamed from: a */
    public final int mo18887a(Uri uri, int i, int i2) {
        if (i2 == this.f14788c) {
            return 0;
        }
        String[] packagesForUid = this.f14786a.getPackageManager().getPackagesForUid(i2);
        int length = packagesForUid.length;
        for (int i3 = 0; i3 < length; i3++) {
            if ((mo18888b(packagesForUid[i3], uri.getAuthority()).mo18891a(uri.getPathSegments()) ? (char) 0 : 65535) == 0) {
                return 0;
            }
        }
        for (String checkPermission : this.f14789d) {
            if (this.f14786a.checkPermission(checkPermission, i, i2) == 0) {
                for (String c : packagesForUid) {
                    mo18889c(uri, c);
                }
                return 0;
            }
        }
        return this.f14786a.checkUriPermission(uri, i, i2, 2);
    }

    /* renamed from: b */
    public final C6707a mo18888b(String str, String str2) {
        String a = C0048b.m163a(str, "_", str2);
        Set<String> stringSet = this.f14786a.getSharedPreferences(this.f14787b, 0).getStringSet(a, Collections.emptySet());
        SharedPreferences sharedPreferences = this.f14786a.getSharedPreferences(this.f14787b, 0);
        return new C6707a(a, stringSet, sharedPreferences.getBoolean(a + "_all", false));
    }

    /* renamed from: c */
    public final void mo18889c(Uri uri, String str) {
        C6707a b = mo18888b(str, uri.getAuthority());
        List<String> pathSegments = uri.getPathSegments();
        String[] strArr = (String[]) pathSegments.toArray(new String[pathSegments.size()]);
        boolean z = true;
        int i = b.f14790a.f16715d - 1;
        while (true) {
            if (i < 0) {
                b.f14790a.add(strArr);
                break;
            }
            String[] strArr2 = (String[]) b.f14790a.f16714c[i];
            if (C6707a.m13091b(strArr2, strArr)) {
                z = false;
                break;
            }
            if (C6707a.m13091b(strArr, strArr2)) {
                b.f14790a.mo19876l(i);
            }
            i--;
        }
        if (z) {
            mo18890d(b);
        }
    }

    /* renamed from: d */
    public final synchronized void mo18890d(C6707a aVar) {
        SharedPreferences.Editor putStringSet = this.f14786a.getSharedPreferences(this.f14787b, 0).edit().putStringSet(aVar.f14791b, aVar.mo18892c());
        putStringSet.putBoolean(aVar.f14791b + "_all", aVar.mo18891a(Collections.emptyList())).apply();
    }
}
