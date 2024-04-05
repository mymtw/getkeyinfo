package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.C2964h;
import androidx.navigation.C2990p;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.reflect.C19421p;
import org.apache.commons.cli.HelpFormatter;

@C2990p.C2991a("fragment")
/* renamed from: androidx.navigation.fragment.a */
public final class C2961a extends C2990p<C2962a> {

    /* renamed from: a */
    public final Context f6718a;

    /* renamed from: b */
    public final FragmentManager f6719b;

    /* renamed from: c */
    public final int f6720c;

    /* renamed from: d */
    public ArrayDeque<Integer> f6721d = new ArrayDeque<>();

    /* renamed from: androidx.navigation.fragment.a$a */
    public static class C2962a extends C2964h {

        /* renamed from: j */
        public String f6722j;

        public C2962a(C2990p<? extends C2962a> pVar) {
            super(pVar);
        }

        /* renamed from: g */
        public final void mo10954g(Context context, AttributeSet attributeSet) {
            super.mo10954g(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C19421p.f43313c);
            String string = obtainAttributes.getString(0);
            if (string != null) {
                this.f6722j = string;
            }
            obtainAttributes.recycle();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.f6722j;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            return sb.toString();
        }
    }

    public C2961a(Context context, FragmentManager fragmentManager, int i) {
        this.f6718a = context;
        this.f6719b = fragmentManager;
        this.f6720c = i;
    }

    /* renamed from: f */
    public static String m6903f(int i, int i2) {
        return i + HelpFormatter.DEFAULT_OPT_PREFIX + i2;
    }

    /* renamed from: a */
    public final C2964h mo10951a() {
        return new C2962a(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0101  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.navigation.C2964h mo10952b(androidx.navigation.C2964h r9, android.os.Bundle r10, androidx.navigation.C2971m r11) {
        /*
            r8 = this;
            androidx.navigation.fragment.a$a r9 = (androidx.navigation.fragment.C2961a.C2962a) r9
            androidx.fragment.app.FragmentManager r0 = r8.f6719b
            boolean r0 = r0.mo10360M()
            r1 = 0
            if (r0 == 0) goto L_0x0014
            java.lang.String r9 = "FragmentNavigator"
            java.lang.String r10 = "Ignoring navigate() call: FragmentManager has already saved its state"
            android.util.Log.i(r9, r10)
            goto L_0x010b
        L_0x0014:
            java.lang.String r0 = r9.f6722j
            if (r0 == 0) goto L_0x010d
            r2 = 0
            char r3 = r0.charAt(r2)
            r4 = 46
            if (r3 != r4) goto L_0x0036
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.content.Context r4 = r8.f6718a
            java.lang.String r4 = r4.getPackageName()
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x0036:
            android.content.Context r3 = r8.f6718a
            androidx.fragment.app.FragmentManager r4 = r8.f6719b
            androidx.fragment.app.q r4 = r4.mo10357G()
            java.lang.ClassLoader r3 = r3.getClassLoader()
            androidx.fragment.app.Fragment r0 = r4.mo10411a(r3, r0)
            r0.setArguments(r10)
            androidx.fragment.app.FragmentManager r10 = r8.f6719b
            androidx.fragment.app.a r10 = android.support.p013v4.media.C0070b.m182c(r10, r10)
            r3 = -1
            if (r11 == 0) goto L_0x0055
            int r4 = r11.f6752d
            goto L_0x0056
        L_0x0055:
            r4 = r3
        L_0x0056:
            if (r11 == 0) goto L_0x005b
            int r5 = r11.f6753e
            goto L_0x005c
        L_0x005b:
            r5 = r3
        L_0x005c:
            if (r11 == 0) goto L_0x0061
            int r6 = r11.f6754f
            goto L_0x0062
        L_0x0061:
            r6 = r3
        L_0x0062:
            if (r11 == 0) goto L_0x0067
            int r7 = r11.f6755g
            goto L_0x0068
        L_0x0067:
            r7 = r3
        L_0x0068:
            if (r4 != r3) goto L_0x0070
            if (r5 != r3) goto L_0x0070
            if (r6 != r3) goto L_0x0070
            if (r7 == r3) goto L_0x0083
        L_0x0070:
            if (r4 == r3) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r4 = r2
        L_0x0074:
            if (r5 == r3) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r5 = r2
        L_0x0078:
            if (r6 == r3) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r6 = r2
        L_0x007c:
            if (r7 == r3) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r7 = r2
        L_0x0080:
            r10.mo10532i(r4, r5, r6, r7)
        L_0x0083:
            int r4 = r8.f6720c
            r10.mo10531h(r4, r0, r1)
            r10.mo10492p(r0)
            int r0 = r9.f6728d
            java.util.ArrayDeque<java.lang.Integer> r4 = r8.f6721d
            boolean r4 = r4.isEmpty()
            r5 = 1
            if (r11 == 0) goto L_0x00ac
            if (r4 != 0) goto L_0x00ac
            boolean r11 = r11.f6749a
            if (r11 == 0) goto L_0x00ac
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f6721d
            java.lang.Object r11 = r11.peekLast()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r11 != r0) goto L_0x00ac
            r11 = r5
            goto L_0x00ad
        L_0x00ac:
            r11 = r2
        L_0x00ad:
            if (r4 == 0) goto L_0x00b0
            goto L_0x00f9
        L_0x00b0:
            if (r11 == 0) goto L_0x00eb
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f6721d
            int r11 = r11.size()
            if (r11 <= r5) goto L_0x00fa
            androidx.fragment.app.FragmentManager r11 = r8.f6719b
            java.util.ArrayDeque<java.lang.Integer> r4 = r8.f6721d
            int r4 = r4.size()
            java.util.ArrayDeque<java.lang.Integer> r6 = r8.f6721d
            java.lang.Object r6 = r6.peekLast()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.String r4 = m6903f(r4, r6)
            r11.getClass()
            androidx.fragment.app.FragmentManager$o r6 = new androidx.fragment.app.FragmentManager$o
            r6.<init>(r4, r3, r5)
            r11.mo10402v(r6, r2)
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f6721d
            int r11 = r11.size()
            java.lang.String r11 = m6903f(r11, r0)
            r10.mo10529c(r11)
            goto L_0x00fa
        L_0x00eb:
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f6721d
            int r11 = r11.size()
            int r11 = r11 + r5
            java.lang.String r11 = m6903f(r11, r0)
            r10.mo10529c(r11)
        L_0x00f9:
            r2 = r5
        L_0x00fa:
            r10.f6261r = r5
            r10.mo10483d()
            if (r2 == 0) goto L_0x010b
            java.util.ArrayDeque<java.lang.Integer> r10 = r8.f6721d
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r10.add(r11)
            goto L_0x010c
        L_0x010b:
            r9 = r1
        L_0x010c:
            return r9
        L_0x010d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Fragment class was not set"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.C2961a.mo10952b(androidx.navigation.h, android.os.Bundle, androidx.navigation.m):androidx.navigation.h");
    }

    /* renamed from: c */
    public final void mo10961c(Bundle bundle) {
        int[] intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds");
        if (intArray != null) {
            this.f6721d.clear();
            for (int valueOf : intArray) {
                this.f6721d.add(Integer.valueOf(valueOf));
            }
        }
    }

    /* renamed from: d */
    public final Bundle mo10962d() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.f6721d.size()];
        Iterator<Integer> it = this.f6721d.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    /* renamed from: e */
    public final boolean mo10953e() {
        if (this.f6721d.isEmpty()) {
            return false;
        }
        if (this.f6719b.mo10360M()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        FragmentManager fragmentManager = this.f6719b;
        String f = m6903f(this.f6721d.size(), this.f6721d.peekLast().intValue());
        fragmentManager.getClass();
        fragmentManager.mo10402v(new FragmentManager.C2727o(f, -1, 1), false);
        this.f6721d.removeLast();
        return true;
    }
}
