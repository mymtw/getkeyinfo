package p424pg;

import android.annotation.SuppressLint;
import android.support.p013v4.media.C0072d;
import android.view.View;
import android.view.WindowManager;
import com.facebook.internal.logging.dumpsys.AndroidRootResolver;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;

@SuppressLint({"HexColorValueUsage", "CatchGeneralException", "BadMethodUse-java.lang.String.length"})
/* renamed from: pg.a */
public final class C13241a {

    /* renamed from: d */
    public static C13241a f29087d;

    /* renamed from: e */
    public static Method f29088e;

    /* renamed from: f */
    public static final C13243b f29089f = new C13243b();

    /* renamed from: a */
    public final AndroidRootResolver f29090a = new AndroidRootResolver();

    /* renamed from: b */
    public final C13245c f29091b = new C13245c();

    /* renamed from: c */
    public Method f29092c;

    /* renamed from: pg.a$a */
    public static final class C13242a {

        /* renamed from: a */
        public static Field f29093a;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mKeyedTags");
                f29093a = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
            } catch (NoSuchFieldException unused) {
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            r4 = "#" + java.lang.Integer.toHexString(r5);
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0042 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static org.json.JSONObject m20900a(android.view.View r7) {
            /*
                r0 = 0
                java.lang.reflect.Field r1 = f29093a     // Catch:{ Exception -> 0x006b }
                if (r1 != 0) goto L_0x0015
                java.lang.Class<android.view.View> r1 = android.view.View.class
                java.lang.String r2 = "mKeyedTags"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x006b }
                f29093a = r1     // Catch:{ Exception -> 0x006b }
                if (r1 == 0) goto L_0x0015
                r2 = 1
                r1.setAccessible(r2)     // Catch:{ Exception -> 0x006b }
            L_0x0015:
                java.lang.reflect.Field r1 = f29093a     // Catch:{ Exception -> 0x006b }
                if (r1 == 0) goto L_0x001e
                java.lang.Object r1 = r1.get(r7)     // Catch:{ Exception -> 0x006b }
                goto L_0x001f
            L_0x001e:
                r1 = r0
            L_0x001f:
                if (r1 == 0) goto L_0x0063
                android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ Exception -> 0x006b }
                int r2 = r1.size()     // Catch:{ Exception -> 0x006b }
                if (r2 <= 0) goto L_0x006b
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x006b }
                r2.<init>()     // Catch:{ Exception -> 0x006b }
                r0 = 0
                int r3 = r1.size()     // Catch:{ Exception -> 0x0061 }
            L_0x0033:
                if (r0 >= r3) goto L_0x0061
                android.content.res.Resources r4 = r7.getResources()     // Catch:{ Exception -> 0x0061 }
                int r5 = r1.keyAt(r0)     // Catch:{ Exception -> 0x0061 }
                java.lang.String r4 = p424pg.C13244b.m20905a(r4, r5)     // Catch:{ NotFoundException -> 0x0042 }
                goto L_0x0057
            L_0x0042:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0061 }
                r4.<init>()     // Catch:{ Exception -> 0x0061 }
                java.lang.String r6 = "#"
                r4.append(r6)     // Catch:{ Exception -> 0x0061 }
                java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch:{ Exception -> 0x0061 }
                r4.append(r5)     // Catch:{ Exception -> 0x0061 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0061 }
            L_0x0057:
                java.lang.Object r5 = r1.valueAt(r0)     // Catch:{ JSONException -> 0x005e }
                r2.put(r4, r5)     // Catch:{ JSONException -> 0x005e }
            L_0x005e:
                int r0 = r0 + 1
                goto L_0x0033
            L_0x0061:
                r0 = r2
                goto L_0x006b
            L_0x0063:
                java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x006b }
                java.lang.String r1 = "null cannot be cast to non-null type android.util.SparseArray<*>"
                r7.<init>(r1)     // Catch:{ Exception -> 0x006b }
                throw r7     // Catch:{ Exception -> 0x006b }
            L_0x006b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p424pg.C13241a.C13242a.m20900a(android.view.View):org.json.JSONObject");
        }
    }

    /* renamed from: pg.a$b */
    public static final class C13243b {
        /* renamed from: a */
        public static final boolean m20901a(C13243b bVar, String[] strArr, String str) {
            bVar.getClass();
            if (strArr != null) {
                for (String W0 : strArr) {
                    if (C19457k.m33019W0(str, W0, true)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: b */
        public static String m20902b(int i, CharSequence charSequence) {
            if (charSequence == null) {
                return "";
            }
            if (charSequence.length() == 0) {
                return "";
            }
            String a1 = C19457k.m33023a1(C19457k.m33023a1(C19457k.m33023a1(charSequence.toString(), " \n", " ", false), "\n", " ", false), "\"", "", false);
            if (charSequence.length() <= i) {
                return a1;
            }
            StringBuilder sb = new StringBuilder();
            String substring = a1.substring(0, i);
            C19383o.m32796f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append("...");
            return sb.toString();
        }

        /* renamed from: c */
        public static boolean m20903c(String str, PrintWriter printWriter, String[] strArr) {
            View view;
            String str2 = str;
            PrintWriter printWriter2 = printWriter;
            String[] strArr2 = strArr;
            C19383o.m32797g(str2, "prefix");
            C19383o.m32797g(printWriter2, "writer");
            if (strArr2 != null) {
                int i = 1;
                if ((!(strArr2.length == 0)) && C19383o.m32792b("e2e", strArr2[0])) {
                    if (C13241a.f29087d == null) {
                        C13241a.f29087d = new C13241a();
                    }
                    C13241a aVar = C13241a.f29087d;
                    if (aVar == null) {
                        return true;
                    }
                    printWriter2.print(str2);
                    printWriter2.println("Top Level Window View Hierarchy:");
                    C13243b bVar = C13241a.f29089f;
                    boolean a = m20901a(bVar, strArr2, "all-roots");
                    boolean a2 = m20901a(bVar, strArr2, "top-root");
                    boolean a3 = m20901a(bVar, strArr2, "webview");
                    boolean a4 = m20901a(bVar, strArr2, "props");
                    try {
                        ArrayList a5 = aVar.f29090a.mo39446a();
                        if (a5 != null) {
                            if (!a5.isEmpty()) {
                                Collections.reverse(a5);
                                WindowManager.LayoutParams layoutParams = null;
                                Iterator it = a5.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    AndroidRootResolver.C12275b bVar2 = (AndroidRootResolver.C12275b) it.next();
                                    if (!(bVar2 == null || (view = bVar2.f27385a) == null)) {
                                        if (view.getVisibility() == 0) {
                                            if (!a && layoutParams != null && Math.abs(bVar2.f27386b.type - layoutParams.type) != i) {
                                                break;
                                            }
                                            aVar.mo45941a(str2 + "  ", printWriter, bVar2.f27385a, 0, 0, a3, a4);
                                            WindowManager.LayoutParams layoutParams2 = bVar2.f27386b;
                                            if (a2) {
                                                break;
                                            }
                                            layoutParams = layoutParams2;
                                        }
                                    }
                                    i = 1;
                                    str2 = str;
                                }
                                aVar.f29091b.mo45942a(printWriter2);
                            }
                        }
                    } catch (Exception e) {
                        StringBuilder h = C0072d.m201h("Failure in view hierarchy dump: ");
                        h.append(e.getMessage());
                        printWriter2.println(h.toString());
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public static void m20904d(PrintWriter printWriter, View view) {
            Object tag = view.getTag();
            if (!(tag instanceof String)) {
                tag = null;
            }
            String str = (String) tag;
            if (str != null) {
                if (!(str.length() == 0)) {
                    printWriter.print(" app:tag/");
                    printWriter.print(m20902b(60, str));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f1, code lost:
        if ((r0.length() == 0) != false) goto L_0x01f3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45941a(java.lang.String r18, java.io.PrintWriter r19, android.view.View r20, int r21, int r22, boolean r23, boolean r24) {
        /*
            r17 = this;
            r9 = r17
            r1 = r18
            r10 = r19
            r2 = r20
            java.lang.String r3 = "\""
            r10.print(r1)
            if (r2 != 0) goto L_0x0015
            java.lang.String r0 = "null"
            r10.println(r0)
            return
        L_0x0015:
            java.lang.Class r0 = r20.getClass()
            java.lang.String r0 = r0.getName()
            r10.print(r0)
            java.lang.String r0 = "{"
            r10.print(r0)
            int r0 = r20.hashCode()
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r10.print(r0)
            pg.a$b r0 = f29089f
            r0.getClass()
            java.lang.String r0 = " "
            r10.print(r0)
            int r4 = r20.getVisibility()
            java.lang.String r5 = "V"
            java.lang.String r6 = "."
            if (r4 == 0) goto L_0x005b
            r7 = 4
            if (r4 == r7) goto L_0x0055
            r7 = 8
            if (r4 == r7) goto L_0x004f
            r10.print(r6)
            goto L_0x005e
        L_0x004f:
            java.lang.String r4 = "G"
            r10.print(r4)
            goto L_0x005e
        L_0x0055:
            java.lang.String r4 = "I"
            r10.print(r4)
            goto L_0x005e
        L_0x005b:
            r10.print(r5)
        L_0x005e:
            boolean r4 = r20.isFocusable()
            java.lang.String r7 = "F"
            if (r4 == 0) goto L_0x0068
            r4 = r7
            goto L_0x0069
        L_0x0068:
            r4 = r6
        L_0x0069:
            r10.print(r4)
            boolean r4 = r20.isEnabled()
            if (r4 == 0) goto L_0x0075
            java.lang.String r4 = "E"
            goto L_0x0076
        L_0x0075:
            r4 = r6
        L_0x0076:
            r10.print(r4)
            r10.print(r6)
            boolean r4 = r20.isHorizontalScrollBarEnabled()
            java.lang.String r8 = "H"
            if (r4 == 0) goto L_0x0086
            r4 = r8
            goto L_0x0087
        L_0x0086:
            r4 = r6
        L_0x0087:
            r10.print(r4)
            boolean r4 = r20.isVerticalScrollBarEnabled()
            if (r4 == 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r5 = r6
        L_0x0092:
            r10.print(r5)
            boolean r4 = r20.isClickable()
            if (r4 == 0) goto L_0x009e
            java.lang.String r4 = "C"
            goto L_0x009f
        L_0x009e:
            r4 = r6
        L_0x009f:
            r10.print(r4)
            boolean r4 = r20.isLongClickable()
            if (r4 == 0) goto L_0x00ab
            java.lang.String r4 = "L"
            goto L_0x00ac
        L_0x00ab:
            r4 = r6
        L_0x00ac:
            r10.print(r4)
            r10.print(r0)
            boolean r4 = r20.isFocused()
            if (r4 == 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r7 = r6
        L_0x00ba:
            r10.print(r7)
            boolean r4 = r20.isSelected()
            if (r4 == 0) goto L_0x00c6
            java.lang.String r4 = "S"
            goto L_0x00c7
        L_0x00c6:
            r4 = r6
        L_0x00c7:
            r10.print(r4)
            boolean r4 = r20.isHovered()
            if (r4 == 0) goto L_0x00d1
            goto L_0x00d2
        L_0x00d1:
            r8 = r6
        L_0x00d2:
            r10.print(r8)
            boolean r4 = r20.isActivated()
            if (r4 == 0) goto L_0x00de
            java.lang.String r4 = "A"
            goto L_0x00df
        L_0x00de:
            r4 = r6
        L_0x00df:
            r10.print(r4)
            boolean r4 = r20.isDirty()
            if (r4 == 0) goto L_0x00ea
            java.lang.String r6 = "D"
        L_0x00ea:
            r10.print(r6)
            r4 = 2
            int[] r5 = new int[r4]
            r2.getLocationOnScreen(r5)
            r10.print(r0)
            r11 = 0
            r6 = r5[r11]
            int r6 = r6 - r21
            r10.print(r6)
            java.lang.String r6 = ","
            r10.print(r6)
            r12 = 1
            r7 = r5[r12]
            int r7 = r7 - r22
            r10.print(r7)
            java.lang.String r7 = "-"
            r10.print(r7)
            r7 = r5[r11]
            int r8 = r20.getWidth()
            int r8 = r8 + r7
            int r8 = r8 - r21
            r10.print(r8)
            r10.print(r6)
            r5 = r5[r12]
            int r6 = r20.getHeight()
            int r6 = r6 + r5
            int r6 = r6 - r22
            r10.print(r6)
            int r5 = r20.getId()     // Catch:{ Exception -> 0x0188 }
            r6 = -1
            if (r5 != r6) goto L_0x0136
            p424pg.C13241a.C13243b.m20904d(r19, r20)     // Catch:{ Exception -> 0x0188 }
            goto L_0x018b
        L_0x0136:
            java.lang.String r6 = " #"
            r10.append(r6)     // Catch:{ Exception -> 0x0188 }
            java.lang.String r6 = java.lang.Integer.toHexString(r5)     // Catch:{ Exception -> 0x0188 }
            r10.append(r6)     // Catch:{ Exception -> 0x0188 }
            android.content.res.Resources r6 = r20.getResources()     // Catch:{ Exception -> 0x0188 }
            if (r5 <= 0) goto L_0x0184
            if (r6 != 0) goto L_0x014b
            goto L_0x0184
        L_0x014b:
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r7 = r7 & r5
            r8 = 16777216(0x1000000, float:2.3509887E-38)
            if (r7 == r8) goto L_0x0163
            r8 = 2130706432(0x7f000000, float:1.7014118E38)
            if (r7 == r8) goto L_0x0160
            java.lang.String r7 = r6.getResourcePackageName(r5)     // Catch:{ Exception -> 0x0188 }
            java.lang.String r8 = "resources.getResourcePackageName(id)"
            kotlin.jvm.internal.C19383o.m32796f(r7, r8)     // Catch:{ Exception -> 0x0188 }
            goto L_0x0165
        L_0x0160:
            java.lang.String r7 = "app"
            goto L_0x0165
        L_0x0163:
            java.lang.String r7 = "android"
        L_0x0165:
            r10.print(r0)     // Catch:{ Exception -> 0x0188 }
            r10.print(r7)     // Catch:{ Exception -> 0x0188 }
            java.lang.String r0 = ":"
            r10.print(r0)     // Catch:{ Exception -> 0x0188 }
            java.lang.String r0 = r6.getResourceTypeName(r5)     // Catch:{ Exception -> 0x0188 }
            r10.print(r0)     // Catch:{ Exception -> 0x0188 }
            java.lang.String r0 = "/"
            r10.print(r0)     // Catch:{ Exception -> 0x0188 }
            java.lang.String r0 = r6.getResourceEntryName(r5)     // Catch:{ Exception -> 0x0188 }
            r10.print(r0)     // Catch:{ Exception -> 0x0188 }
            goto L_0x018b
        L_0x0184:
            p424pg.C13241a.C13243b.m20904d(r19, r20)     // Catch:{ Exception -> 0x0188 }
            goto L_0x018b
        L_0x0188:
            p424pg.C13241a.C13243b.m20904d(r19, r20)
        L_0x018b:
            pg.a$b r0 = f29089f
            r0.getClass()
            boolean r0 = r2 instanceof android.widget.TextView     // Catch:{ Exception -> 0x0251 }
            if (r0 == 0) goto L_0x01a1
            r0 = r2
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x0251 }
            java.lang.CharSequence r0 = r0.getText()     // Catch:{ Exception -> 0x0251 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0251 }
            goto L_0x0232
        L_0x01a1:
            java.lang.Class r0 = r20.getClass()     // Catch:{ Exception -> 0x0251 }
            java.lang.String r0 = r0.getSimpleName()     // Catch:{ Exception -> 0x0251 }
            java.lang.String r5 = "RCTextView"
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r5)     // Catch:{ Exception -> 0x0251 }
            if (r0 == 0) goto L_0x01da
            java.lang.reflect.Method r0 = f29088e     // Catch:{ Exception -> 0x0251 }
            if (r0 != 0) goto L_0x01c3
            java.lang.Class r0 = r20.getClass()     // Catch:{ Exception -> 0x0251 }
            java.lang.Class[] r5 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x0251 }
            java.lang.String r6 = "getText"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r6, r5)     // Catch:{ Exception -> 0x0251 }
            f29088e = r0     // Catch:{ Exception -> 0x0251 }
        L_0x01c3:
            java.lang.reflect.Method r0 = f29088e     // Catch:{ Exception -> 0x0251 }
            if (r0 == 0) goto L_0x01ce
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0251 }
            java.lang.Object r0 = r0.invoke(r2, r5)     // Catch:{ Exception -> 0x0251 }
            goto L_0x01cf
        L_0x01ce:
            r0 = 0
        L_0x01cf:
            if (r0 == 0) goto L_0x01d7
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0251 }
            goto L_0x0232
        L_0x01d7:
            r0 = 0
            goto L_0x0232
        L_0x01da:
            java.lang.CharSequence r0 = r20.getContentDescription()     // Catch:{ Exception -> 0x0251 }
            if (r0 == 0) goto L_0x01e5
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0251 }
            goto L_0x01e6
        L_0x01e5:
            r0 = 0
        L_0x01e6:
            if (r0 == 0) goto L_0x01f3
            int r5 = r0.length()     // Catch:{ Exception -> 0x0251 }
            if (r5 != 0) goto L_0x01f0
            r5 = r12
            goto L_0x01f1
        L_0x01f0:
            r5 = r11
        L_0x01f1:
            if (r5 == 0) goto L_0x0232
        L_0x01f3:
            java.lang.Object r5 = r20.getTag()     // Catch:{ Exception -> 0x0251 }
            if (r5 == 0) goto L_0x0232
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x0251 }
            int r5 = r0.length()     // Catch:{ Exception -> 0x0251 }
            int r5 = r5 - r12
            r6 = r11
            r7 = r6
        L_0x0204:
            if (r6 > r5) goto L_0x0229
            if (r7 != 0) goto L_0x020a
            r8 = r6
            goto L_0x020b
        L_0x020a:
            r8 = r5
        L_0x020b:
            char r8 = r0.charAt(r8)     // Catch:{ Exception -> 0x0251 }
            r13 = 32
            int r8 = kotlin.jvm.internal.C19383o.m32799i(r8, r13)     // Catch:{ Exception -> 0x0251 }
            if (r8 > 0) goto L_0x0219
            r8 = r12
            goto L_0x021a
        L_0x0219:
            r8 = r11
        L_0x021a:
            if (r7 != 0) goto L_0x0223
            if (r8 != 0) goto L_0x0220
            r7 = r12
            goto L_0x0204
        L_0x0220:
            int r6 = r6 + 1
            goto L_0x0204
        L_0x0223:
            if (r8 != 0) goto L_0x0226
            goto L_0x0229
        L_0x0226:
            int r5 = r5 + -1
            goto L_0x0204
        L_0x0229:
            int r5 = r5 + r12
            java.lang.CharSequence r0 = r0.subSequence(r6, r5)     // Catch:{ Exception -> 0x0251 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0251 }
        L_0x0232:
            if (r0 == 0) goto L_0x0251
            int r5 = r0.length()     // Catch:{ Exception -> 0x0251 }
            if (r5 != 0) goto L_0x023c
            r5 = r12
            goto L_0x023d
        L_0x023c:
            r5 = r11
        L_0x023d:
            if (r5 == 0) goto L_0x0240
            goto L_0x0251
        L_0x0240:
            java.lang.String r5 = " text=\""
            r10.print(r5)     // Catch:{ Exception -> 0x0251 }
            r5 = 600(0x258, float:8.41E-43)
            java.lang.String r0 = p424pg.C13241a.C13243b.m20902b(r5, r0)     // Catch:{ Exception -> 0x0251 }
            r10.print(r0)     // Catch:{ Exception -> 0x0251 }
            r10.print(r3)     // Catch:{ Exception -> 0x0251 }
        L_0x0251:
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
            r0 = 100
            if (r24 == 0) goto L_0x040d
            java.lang.reflect.Field r6 = p424pg.C13241a.C13242a.f29093a
            pg.a$b r6 = f29089f
            r6.getClass()
            android.view.accessibility.AccessibilityNodeInfo r6 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            r2.onInitializeAccessibilityNodeInfo(r6)     // Catch:{ NullPointerException -> 0x0266 }
            goto L_0x026c
        L_0x0266:
            if (r6 == 0) goto L_0x026b
            r6.recycle()
        L_0x026b:
            r6 = 0
        L_0x026c:
            if (r6 == 0) goto L_0x040d
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            r8 = 50
            boolean r13 = r2 instanceof android.widget.TextView     // Catch:{ Exception -> 0x03e9 }
            if (r13 == 0) goto L_0x02b0
            java.lang.String r13 = "textColor"
            r14 = r2
            android.widget.TextView r14 = (android.widget.TextView) r14     // Catch:{ Exception -> 0x03e9 }
            android.content.res.ColorStateList r14 = r14.getTextColors()     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r15 = "view.textColors"
            kotlin.jvm.internal.C19383o.m32796f(r14, r15)     // Catch:{ Exception -> 0x03e9 }
            int r14 = r14.getDefaultColor()     // Catch:{ Exception -> 0x03e9 }
            r7.put(r13, r14)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r13 = "textSize"
            r14 = r2
            android.widget.TextView r14 = (android.widget.TextView) r14     // Catch:{ Exception -> 0x03e9 }
            float r14 = r14.getTextSize()     // Catch:{ Exception -> 0x03e9 }
            double r14 = (double) r14     // Catch:{ Exception -> 0x03e9 }
            r7.put(r13, r14)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r13 = "hint"
            pg.a$b r14 = f29089f     // Catch:{ Exception -> 0x03e9 }
            r15 = r2
            android.widget.TextView r15 = (android.widget.TextView) r15     // Catch:{ Exception -> 0x03e9 }
            java.lang.CharSequence r15 = r15.getHint()     // Catch:{ Exception -> 0x03e9 }
            r14.getClass()     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r0 = p424pg.C13241a.C13243b.m20902b(r0, r15)     // Catch:{ Exception -> 0x03e9 }
            r7.put(r13, r0)     // Catch:{ Exception -> 0x03e9 }
        L_0x02b0:
            org.json.JSONObject r0 = p424pg.C13241a.C13242a.m20900a(r20)     // Catch:{ Exception -> 0x03e9 }
            if (r0 == 0) goto L_0x02bb
            java.lang.String r13 = "keyedTags"
            r7.put(r13, r0)     // Catch:{ Exception -> 0x03e9 }
        L_0x02bb:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x03e9 }
            r0.<init>()     // Catch:{ Exception -> 0x03e9 }
            java.util.List r13 = r6.getActionList()     // Catch:{ Exception -> 0x03e9 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ Exception -> 0x03e9 }
        L_0x02c8:
            boolean r14 = r13.hasNext()     // Catch:{ Exception -> 0x03e9 }
            if (r14 == 0) goto L_0x02f4
            java.lang.Object r14 = r13.next()     // Catch:{ Exception -> 0x03e9 }
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r14 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r14     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r15 = "action"
            kotlin.jvm.internal.C19383o.m32796f(r14, r15)     // Catch:{ Exception -> 0x03e9 }
            java.lang.CharSequence r14 = r14.getLabel()     // Catch:{ Exception -> 0x03e9 }
            if (r14 == 0) goto L_0x02ee
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x03e9 }
            pg.a$b r15 = f29089f     // Catch:{ Exception -> 0x03e9 }
            r15.getClass()     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r14 = p424pg.C13241a.C13243b.m20902b(r8, r14)     // Catch:{ Exception -> 0x03e9 }
            r0.put(r14)     // Catch:{ Exception -> 0x03e9 }
            goto L_0x02c8
        L_0x02ee:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x03e9 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x03e9 }
            throw r0     // Catch:{ Exception -> 0x03e9 }
        L_0x02f4:
            int r13 = r0.length()     // Catch:{ Exception -> 0x03e9 }
            if (r13 <= 0) goto L_0x02ff
            java.lang.String r13 = "actions"
            r7.put(r13, r0)     // Catch:{ Exception -> 0x03e9 }
        L_0x02ff:
            pg.a$b r0 = f29089f     // Catch:{ Exception -> 0x03e9 }
            java.lang.CharSequence r13 = r6.getContentDescription()     // Catch:{ Exception -> 0x03e9 }
            r0.getClass()     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r0 = p424pg.C13241a.C13243b.m20902b(r8, r13)     // Catch:{ Exception -> 0x03e9 }
            if (r0 == 0) goto L_0x031e
            int r13 = r0.length()     // Catch:{ Exception -> 0x03e9 }
            if (r13 <= 0) goto L_0x0316
            r13 = r12
            goto L_0x0317
        L_0x0316:
            r13 = r11
        L_0x0317:
            if (r13 == 0) goto L_0x031e
            java.lang.String r13 = "content-description"
            r7.put(r13, r0)     // Catch:{ Exception -> 0x03e9 }
        L_0x031e:
            java.lang.String r0 = "accessibility-focused"
            boolean r13 = r6.isAccessibilityFocused()     // Catch:{ Exception -> 0x03e9 }
            org.json.JSONObject r0 = r7.put(r0, r13)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r13 = "checkable"
            boolean r14 = r6.isCheckable()     // Catch:{ Exception -> 0x03e9 }
            org.json.JSONObject r0 = r0.put(r13, r14)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r13 = "checked"
            boolean r14 = r6.isChecked()     // Catch:{ Exception -> 0x03e9 }
            org.json.JSONObject r0 = r0.put(r13, r14)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r13 = "class-name"
            java.lang.CharSequence r14 = r6.getClassName()     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r14 = p424pg.C13241a.C13243b.m20902b(r8, r14)     // Catch:{ Exception -> 0x03e9 }
            org.json.JSONObject r0 = r0.put(r13, r14)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r13 = "clickable"
            boolean r14 = r6.isClickable()     // Catch:{ Exception -> 0x03e9 }
            org.json.JSONObject r0 = r0.put(r13, r14)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r13 = "content-invalid"
            boolean r14 = r6.isContentInvalid()     // Catch:{ Exception -> 0x03e9 }
            org.json.JSONObject r0 = r0.put(r13, r14)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r13 = "dismissable"
            boolean r14 = r6.isDismissable()     // Catch:{ Exception -> 0x03e9 }
            org.json.JSONObject r0 = r0.put(r13, r14)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r13 = "editable"
            boolean r14 = r6.isEditable()     // Catch:{ Exception -> 0x03e9 }
            org.json.JSONObject r0 = r0.put(r13, r14)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r13 = "enabled"
            boolean r14 = r6.isEnabled()     // Catch:{ Exception -> 0x03e9 }
            org.json.JSONObject r0 = r0.put(r13, r14)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r13 = "focusable"
            boolean r14 = r6.isFocusable()     // Catch:{ Exception -> 0x03e9 }
            org.json.JSONObject r0 = r0.put(r13, r14)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r13 = "focused"
            boolean r14 = r6.isFocused()     // Catch:{ Exception -> 0x03e9 }
            org.json.JSONObject r0 = r0.put(r13, r14)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r13 = "long-clickable"
            boolean r14 = r6.isLongClickable()     // Catch:{ Exception -> 0x03e9 }
            org.json.JSONObject r0 = r0.put(r13, r14)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r13 = "multiline"
            boolean r14 = r6.isMultiLine()     // Catch:{ Exception -> 0x03e9 }
            org.json.JSONObject r0 = r0.put(r13, r14)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r13 = "password"
            boolean r14 = r6.isPassword()     // Catch:{ Exception -> 0x03e9 }
            org.json.JSONObject r0 = r0.put(r13, r14)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r13 = "scrollable"
            boolean r14 = r6.isScrollable()     // Catch:{ Exception -> 0x03e9 }
            org.json.JSONObject r0 = r0.put(r13, r14)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r13 = "selected"
            boolean r14 = r6.isSelected()     // Catch:{ Exception -> 0x03e9 }
            org.json.JSONObject r0 = r0.put(r13, r14)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r13 = "visible-to-user"
            boolean r14 = r6.isVisibleToUser()     // Catch:{ Exception -> 0x03e9 }
            r0.put(r13, r14)     // Catch:{ Exception -> 0x03e9 }
            boolean r0 = r6.isContextClickable()     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r13 = "context-clickable"
            org.json.JSONObject r0 = r7.put(r13, r0)     // Catch:{ Exception -> 0x03e9 }
            int r13 = r6.getDrawingOrder()     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r14 = "drawing-order"
            org.json.JSONObject r0 = r0.put(r14, r13)     // Catch:{ Exception -> 0x03e9 }
            boolean r6 = r6.isImportantForAccessibility()     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r13 = "important-for-accessibility"
            r0.put(r13, r6)     // Catch:{ Exception -> 0x03e9 }
            goto L_0x03fc
        L_0x03e9:
            r0 = move-exception
            java.lang.String r6 = "DUMP-ERROR"
            pg.a$b r13 = f29089f     // Catch:{ JSONException -> 0x03fc }
            java.lang.String r0 = r0.getMessage()     // Catch:{ JSONException -> 0x03fc }
            r13.getClass()     // Catch:{ JSONException -> 0x03fc }
            java.lang.String r0 = p424pg.C13241a.C13243b.m20902b(r8, r0)     // Catch:{ JSONException -> 0x03fc }
            r7.put(r6, r0)     // Catch:{ JSONException -> 0x03fc }
        L_0x03fc:
            java.lang.String r0 = " props=\""
            java.io.PrintWriter r0 = r10.append(r0)
            java.lang.String r6 = r7.toString()
            java.io.PrintWriter r0 = r0.append(r6)
            r0.append(r3)
        L_0x040d:
            java.lang.String r0 = "}"
            r10.println(r0)
            pg.a$b r0 = f29089f
            r0.getClass()
            java.lang.Class r0 = r20.getClass()
        L_0x041b:
            if (r0 == 0) goto L_0x0430
            java.lang.String r3 = r0.getName()
            java.lang.String r6 = "com.facebook.litho.LithoView"
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r6)
            if (r3 == 0) goto L_0x042b
            r0 = r12
            goto L_0x0431
        L_0x042b:
            java.lang.Class r0 = r0.getSuperclass()
            goto L_0x041b
        L_0x0430:
            r0 = r11
        L_0x0431:
            r3 = 3
            if (r0 == 0) goto L_0x04aa
            java.lang.reflect.Method r0 = r9.f29092c     // Catch:{ Exception -> 0x0489 }
            if (r0 != 0) goto L_0x0454
            java.lang.String r0 = "com.facebook.litho.LithoViewTestHelper"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0489 }
            java.lang.String r6 = "viewToStringForE2E"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0489 }
            java.lang.Class<android.view.View> r8 = android.view.View.class
            r7[r11] = r8     // Catch:{ Exception -> 0x0489 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0489 }
            r7[r12] = r8     // Catch:{ Exception -> 0x0489 }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0489 }
            r7[r4] = r8     // Catch:{ Exception -> 0x0489 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r6, r7)     // Catch:{ Exception -> 0x0489 }
            r9.f29092c = r0     // Catch:{ Exception -> 0x0489 }
        L_0x0454:
            java.lang.reflect.Method r0 = r9.f29092c     // Catch:{ Exception -> 0x0489 }
            if (r0 == 0) goto L_0x0474
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0489 }
            r6[r11] = r2     // Catch:{ Exception -> 0x0489 }
            int r7 = r18.length()     // Catch:{ Exception -> 0x0489 }
            int r7 = r7 / r4
            int r7 = r7 + r12
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0489 }
            r6[r12] = r7     // Catch:{ Exception -> 0x0489 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r24)     // Catch:{ Exception -> 0x0489 }
            r6[r4] = r7     // Catch:{ Exception -> 0x0489 }
            r7 = 0
            java.lang.Object r0 = r0.invoke(r7, r6)     // Catch:{ Exception -> 0x0489 }
            goto L_0x0475
        L_0x0474:
            r0 = 0
        L_0x0475:
            if (r0 == 0) goto L_0x0483
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0489 }
            java.io.PrintWriter r0 = r10.append(r0)     // Catch:{ Exception -> 0x0489 }
            java.lang.String r5 = "writer.append(lithoViewDump)"
            kotlin.jvm.internal.C19383o.m32796f(r0, r5)     // Catch:{ Exception -> 0x0489 }
            goto L_0x04aa
        L_0x0483:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0489 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x0489 }
            throw r0     // Catch:{ Exception -> 0x0489 }
        L_0x0489:
            r0 = move-exception
            java.io.PrintWriter r5 = r10.append(r1)
            java.lang.String r6 = "Failed litho view sub hierarch dump: "
            java.io.PrintWriter r5 = r5.append(r6)
            pg.a$b r6 = f29089f
            java.lang.String r0 = r0.getMessage()
            r6.getClass()
            r6 = 100
            java.lang.String r0 = p424pg.C13241a.C13243b.m20902b(r6, r0)
            java.io.PrintWriter r0 = r5.append(r0)
            r0.println()
        L_0x04aa:
            if (r23 == 0) goto L_0x04f9
            boolean r0 = r2 instanceof android.webkit.WebView
            if (r0 == 0) goto L_0x04f9
            pg.c r0 = r9.f29091b
            r5 = r2
            android.webkit.WebView r5 = (android.webkit.WebView) r5
            r0.getClass()
            pg.c$b r6 = new pg.c$b
            r6.<init>(r5)
            java.util.LinkedHashSet r7 = r0.f29094a
            r7.add(r6)
            android.content.res.Resources r7 = r5.getResources()
            java.lang.String r8 = "view.resources"
            kotlin.jvm.internal.C19383o.m32796f(r7, r8)
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            int r13 = r6.f29098b
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r8[r11] = r13
            int r13 = r6.f29099c
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r8[r12] = r13
            float r7 = r7.scaledDensity
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r8[r4] = r7
            java.lang.String r7 = "(function() {  try {    const leftOf = %d;    const topOf = %d;    const density = %f;    const elements = Array.from(document.querySelectorAll('body, body *'));    for (const el of elements) {      const rect = el.getBoundingClientRect();      const left = Math.round(leftOf + rect.left * density);      const top = Math.round(topOf + rect.top * density);      const width = Math.round(rect.width * density);      const height = Math.round(rect.height * density);      el.setAttribute('data-rect', `${left},${top},${width},${height}`);      const style = window.getComputedStyle(el);      const hidden = style.display === 'none' || style.visibility !== 'visible' || el.getAttribute('hidden') === 'true';      const disabled = el.disabled || el.getAttribute('aria-disabled') === 'true';      const focused = el === document.activeElement;      if (hidden || disabled || focused) {        el.setAttribute('data-flag', `${hidden ? 'H' : ''}${disabled ? 'D' : ''}${focused ? 'F' : ''}`);      } else {        el.removeAttribute('data-flag');      }    }    document.activeElement.setAttribute('focused', 'true');    const doc = document.cloneNode(true);    for (const el of Array.from(doc.querySelectorAll('script, link'))) {      el.remove();    }    for (const el of Array.from(doc.querySelectorAll('*'))) {      el.removeAttribute('class');    }    return doc.getElementsByTagName('body')[0].outerHTML.trim();  } catch (e) {    return 'Failed: ' + e;  }})();"
            java.lang.String r13 = "java.lang.String.format(format, *args)"
            java.lang.String r3 = androidx.compose.animation.C0388a.m1049e(r8, r3, r7, r13)
            pg.d r7 = new pg.d
            r7.<init>(r0, r6)
            r5.evaluateJavascript(r3, r7)
        L_0x04f9:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 != 0) goto L_0x04fe
            return
        L_0x04fe:
            r0 = r2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r13 = r0.getChildCount()
            if (r13 > 0) goto L_0x0508
            return
        L_0x0508:
            java.lang.String r3 = "  "
            java.lang.String r14 = androidx.appcompat.widget.C0326j.m864i(r1, r3)
            int[] r15 = new int[r4]
            r2.getLocationOnScreen(r15)
            r8 = r11
        L_0x0514:
            if (r8 >= r13) goto L_0x052f
            android.view.View r4 = r0.getChildAt(r8)
            r5 = r15[r11]
            r6 = r15[r12]
            r1 = r17
            r2 = r14
            r3 = r19
            r7 = r23
            r16 = r8
            r8 = r24
            r1.mo45941a(r2, r3, r4, r5, r6, r7, r8)
            int r8 = r16 + 1
            goto L_0x0514
        L_0x052f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p424pg.C13241a.mo45941a(java.lang.String, java.io.PrintWriter, android.view.View, int, int, boolean, boolean):void");
    }
}
