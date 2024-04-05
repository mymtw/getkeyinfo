package p469vf;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.appevents.codeless.internal.C12225d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import p401mg.C13080a;

/* renamed from: vf.c */
public final class C13790c {

    /* renamed from: a */
    public static final C13790c f30350a = new C13790c();

    /* renamed from: a */
    public static final ArrayList m21338a(View view) {
        Class<C13790c> cls = C13790c.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            C19383o.m32797g(view, "view");
            ArrayList arrayList = new ArrayList();
            ViewGroup i = C12225d.m20060i(view);
            if (i != null) {
                Iterator it = C12225d.m20054b(i).iterator();
                while (it.hasNext()) {
                    View view2 = (View) it.next();
                    if (view != view2) {
                        arrayList.addAll(f30350a.mo46653c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:4|5|(1:7)|8|(1:10)|11|12|13|(2:15|(2:17|(1:19))(2:20|21))|22|23|(5:26|(1:28)(1:29)|(2:33|42)|38|24)|39|34) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0076 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085 A[Catch:{ all -> 0x00ac }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList m21339b(android.view.View r8) {
        /*
            java.lang.Class<vf.c> r0 = p469vf.C13790c.class
            boolean r1 = p401mg.C13080a.m20762b(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = "view"
            kotlin.jvm.internal.C19383o.m32797g(r8, r1)     // Catch:{ all -> 0x00ac }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00ac }
            r1.<init>()     // Catch:{ all -> 0x00ac }
            java.lang.String r3 = com.facebook.appevents.codeless.internal.C12225d.m20059h(r8)     // Catch:{ all -> 0x00ac }
            r1.add(r3)     // Catch:{ all -> 0x00ac }
            java.lang.Object r3 = r8.getTag()     // Catch:{ all -> 0x00ac }
            if (r3 == 0) goto L_0x0028
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00ac }
            r1.add(r3)     // Catch:{ all -> 0x00ac }
        L_0x0028:
            java.lang.CharSequence r3 = r8.getContentDescription()     // Catch:{ all -> 0x00ac }
            if (r3 == 0) goto L_0x0035
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00ac }
            r1.add(r3)     // Catch:{ all -> 0x00ac }
        L_0x0035:
            r3 = 1
            r4 = 0
            int r5 = r8.getId()     // Catch:{ NotFoundException -> 0x0076 }
            r6 = -1
            if (r5 == r6) goto L_0x0076
            android.content.res.Resources r5 = r8.getResources()     // Catch:{ NotFoundException -> 0x0076 }
            int r8 = r8.getId()     // Catch:{ NotFoundException -> 0x0076 }
            java.lang.String r8 = r5.getResourceName(r8)     // Catch:{ NotFoundException -> 0x0076 }
            java.lang.String r5 = "resourceName"
            kotlin.jvm.internal.C19383o.m32796f(r8, r5)     // Catch:{ NotFoundException -> 0x0076 }
            java.lang.String r5 = "/"
            kotlin.text.Regex r6 = new kotlin.text.Regex     // Catch:{ NotFoundException -> 0x0076 }
            r6.<init>((java.lang.String) r5)     // Catch:{ NotFoundException -> 0x0076 }
            java.util.List r8 = r6.split(r8, r4)     // Catch:{ NotFoundException -> 0x0076 }
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ NotFoundException -> 0x0076 }
            java.lang.Object[] r8 = r8.toArray(r5)     // Catch:{ NotFoundException -> 0x0076 }
            if (r8 == 0) goto L_0x006e
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ NotFoundException -> 0x0076 }
            int r5 = r8.length     // Catch:{ NotFoundException -> 0x0076 }
            r6 = 2
            if (r5 != r6) goto L_0x0076
            r8 = r8[r3]     // Catch:{ NotFoundException -> 0x0076 }
            r1.add(r8)     // Catch:{ NotFoundException -> 0x0076 }
            goto L_0x0076
        L_0x006e:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch:{ NotFoundException -> 0x0076 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r8.<init>(r5)     // Catch:{ NotFoundException -> 0x0076 }
            throw r8     // Catch:{ NotFoundException -> 0x0076 }
        L_0x0076:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00ac }
            r8.<init>()     // Catch:{ all -> 0x00ac }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00ac }
        L_0x007f:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x00ac }
            if (r5 == 0) goto L_0x00ab
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x00ac }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00ac }
            int r6 = r5.length()     // Catch:{ all -> 0x00ac }
            if (r6 <= 0) goto L_0x0093
            r6 = r3
            goto L_0x0094
        L_0x0093:
            r6 = r4
        L_0x0094:
            if (r6 == 0) goto L_0x007f
            int r6 = r5.length()     // Catch:{ all -> 0x00ac }
            r7 = 100
            if (r6 > r7) goto L_0x007f
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ all -> 0x00ac }
            java.lang.String r6 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.C19383o.m32796f(r5, r6)     // Catch:{ all -> 0x00ac }
            r8.add(r5)     // Catch:{ all -> 0x00ac }
            goto L_0x007f
        L_0x00ab:
            return r8
        L_0x00ac:
            r8 = move-exception
            p401mg.C13080a.m20761a(r0, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p469vf.C13790c.m21339b(android.view.View):java.util.ArrayList");
    }

    /* renamed from: d */
    public static final boolean m21340d(ArrayList arrayList, ArrayList arrayList2) {
        C13790c cVar;
        boolean z;
        Class<C13790c> cls = C13790c.class;
        if (C13080a.m20762b(cls)) {
            return false;
        }
        try {
            C19383o.m32797g(arrayList, "indicators");
            C19383o.m32797g(arrayList2, "keys");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                cVar = f30350a;
                cVar.getClass();
                if (!C13080a.m20762b(cVar)) {
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (C19459m.m33036e1(str, (String) it2.next(), false)) {
                                z = true;
                                continue;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
                continue;
                if (z) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return false;
        }
    }

    /* renamed from: c */
    public final ArrayList mo46653c(View view) {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String obj = ((TextView) view).getText().toString();
                if ((obj.length() > 0) && obj.length() < 100) {
                    String lowerCase = obj.toLowerCase();
                    C19383o.m32796f(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList.add(lowerCase);
                }
                return arrayList;
            }
            Iterator it = C12225d.m20054b(view).iterator();
            while (it.hasNext()) {
                arrayList.addAll(mo46653c((View) it.next()));
            }
            return arrayList;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }
}
