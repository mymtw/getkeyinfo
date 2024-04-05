package p492yf;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.etsy.android.lib.models.ResponseConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import org.json.JSONException;
import org.json.JSONObject;
import p401mg.C13080a;
import p453tf.C13418j;

/* renamed from: yf.e */
public final class C13933e {

    /* renamed from: a */
    public static final HashMap<String, Method> f30632a = new HashMap<>();

    /* renamed from: b */
    public static final HashMap<String, Class<?>> f30633b = new HashMap<>();

    /* renamed from: c */
    public static final String f30634c = C13418j.m21106b().getPackageName();

    /* renamed from: d */
    public static final SharedPreferences f30635d = C13418j.m21106b().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: e */
    public static final SharedPreferences f30636e = C13418j.m21106b().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    /* renamed from: f */
    public static final C13933e f30637f = new C13933e();

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r3 = f30637f;
        r4 = r3.mo46746b(r6, "com.android.vending.billing.IInAppBillingService");
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList<java.lang.String> m21443e(android.content.Context r6, java.lang.Object r7) {
        /*
            java.lang.Class<yf.e> r0 = p492yf.C13933e.class
            boolean r1 = p401mg.C13080a.m20762b(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = "context"
            kotlin.jvm.internal.C19383o.m32797g(r6, r1)     // Catch:{ all -> 0x0033 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0033 }
            r1.<init>()     // Catch:{ all -> 0x0033 }
            if (r7 != 0) goto L_0x0017
            return r1
        L_0x0017:
            yf.e r3 = f30637f     // Catch:{ all -> 0x0033 }
            java.lang.String r4 = "com.android.vending.billing.IInAppBillingService"
            java.lang.Class r4 = r3.mo46746b(r6, r4)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x0032
            java.lang.String r5 = "getPurchaseHistory"
            java.lang.reflect.Method r4 = r3.mo46747c(r4, r5)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x0032
            java.util.ArrayList r6 = r3.mo46748d(r6, r7)     // Catch:{ all -> 0x0033 }
            java.util.ArrayList r6 = r3.mo46745a(r6)     // Catch:{ all -> 0x0033 }
            return r6
        L_0x0032:
            return r1
        L_0x0033:
            r6 = move-exception
            p401mg.C13080a.m20761a(r0, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p492yf.C13933e.m21443e(android.content.Context, java.lang.Object):java.util.ArrayList");
    }

    /* renamed from: g */
    public static final ArrayList<String> m21444g(Context context, Object obj) {
        Class<C13933e> cls = C13933e.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            C13933e eVar = f30637f;
            return eVar.mo46745a(eVar.mo46749f(context, obj, "inapp"));
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: a */
    public final ArrayList<String> mo46745a(ArrayList<String> arrayList) {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList2 = new ArrayList<>();
            SharedPreferences.Editor edit = f30636e.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    JSONObject jSONObject = new JSONObject(next);
                    String string = jSONObject.getString("productId");
                    long j = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j / 1000) <= ((long) 86400)) {
                        if (!C19383o.m32792b(f30636e.getString(string, ""), string2)) {
                            edit.putString(string, string2);
                            arrayList2.add(next);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    /* renamed from: b */
    public final Class<?> mo46746b(Context context, String str) {
        Class<?> loadClass;
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            HashMap<String, Class<?>> hashMap = f30633b;
            Class<?> cls = hashMap.get(str);
            if (cls != null) {
                return cls;
            }
            try {
                loadClass = context.getClassLoader().loadClass(str);
                C19383o.m32796f(loadClass, "classObj");
                hashMap.put(str, loadClass);
                return loadClass;
            } catch (ClassNotFoundException unused) {
                return loadClass;
            }
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method mo46747c(java.lang.Class<?> r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r1 = p401mg.C13080a.m20762b(r12)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.HashMap<java.lang.String, java.lang.reflect.Method> r1 = f30632a     // Catch:{ all -> 0x00b5 }
            java.lang.Object r3 = r1.get(r14)     // Catch:{ all -> 0x00b5 }
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch:{ all -> 0x00b5 }
            if (r3 == 0) goto L_0x0015
            return r3
        L_0x0015:
            int r4 = r14.hashCode()     // Catch:{ NoSuchMethodException -> 0x00b4 }
            r5 = 4
            r6 = 2
            java.lang.String r7 = "Integer.TYPE"
            r8 = 3
            r9 = 0
            r10 = 1
            switch(r4) {
                case -1801122596: goto L_0x0081;
                case -1450694211: goto L_0x006b;
                case -1123215065: goto L_0x005c;
                case -594356707: goto L_0x003f;
                case -573310373: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x0099
        L_0x0025:
            java.lang.String r4 = "getSkuDetails"
            boolean r4 = r14.equals(r4)     // Catch:{ NoSuchMethodException -> 0x00b4 }
            if (r4 == 0) goto L_0x0099
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x00b4 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x00b4 }
            kotlin.jvm.internal.C19383o.m32796f(r5, r7)     // Catch:{ NoSuchMethodException -> 0x00b4 }
            r4[r9] = r5     // Catch:{ NoSuchMethodException -> 0x00b4 }
            r4[r10] = r0     // Catch:{ NoSuchMethodException -> 0x00b4 }
            r4[r6] = r0     // Catch:{ NoSuchMethodException -> 0x00b4 }
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r4[r8] = r0     // Catch:{ NoSuchMethodException -> 0x00b4 }
            goto L_0x009a
        L_0x003f:
            java.lang.String r4 = "getPurchaseHistory"
            boolean r4 = r14.equals(r4)     // Catch:{ NoSuchMethodException -> 0x00b4 }
            if (r4 == 0) goto L_0x0099
            r4 = 5
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x00b4 }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x00b4 }
            kotlin.jvm.internal.C19383o.m32796f(r11, r7)     // Catch:{ NoSuchMethodException -> 0x00b4 }
            r4[r9] = r11     // Catch:{ NoSuchMethodException -> 0x00b4 }
            r4[r10] = r0     // Catch:{ NoSuchMethodException -> 0x00b4 }
            r4[r6] = r0     // Catch:{ NoSuchMethodException -> 0x00b4 }
            r4[r8] = r0     // Catch:{ NoSuchMethodException -> 0x00b4 }
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r4[r5] = r0     // Catch:{ NoSuchMethodException -> 0x00b4 }
            goto L_0x009a
        L_0x005c:
            java.lang.String r0 = "asInterface"
            boolean r0 = r14.equals(r0)     // Catch:{ NoSuchMethodException -> 0x00b4 }
            if (r0 == 0) goto L_0x0099
            java.lang.Class[] r4 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x00b4 }
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            r4[r9] = r0     // Catch:{ NoSuchMethodException -> 0x00b4 }
            goto L_0x009a
        L_0x006b:
            java.lang.String r4 = "isBillingSupported"
            boolean r4 = r14.equals(r4)     // Catch:{ NoSuchMethodException -> 0x00b4 }
            if (r4 == 0) goto L_0x0099
            java.lang.Class[] r4 = new java.lang.Class[r8]     // Catch:{ NoSuchMethodException -> 0x00b4 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x00b4 }
            kotlin.jvm.internal.C19383o.m32796f(r5, r7)     // Catch:{ NoSuchMethodException -> 0x00b4 }
            r4[r9] = r5     // Catch:{ NoSuchMethodException -> 0x00b4 }
            r4[r10] = r0     // Catch:{ NoSuchMethodException -> 0x00b4 }
            r4[r6] = r0     // Catch:{ NoSuchMethodException -> 0x00b4 }
            goto L_0x009a
        L_0x0081:
            java.lang.String r4 = "getPurchases"
            boolean r4 = r14.equals(r4)     // Catch:{ NoSuchMethodException -> 0x00b4 }
            if (r4 == 0) goto L_0x0099
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x00b4 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x00b4 }
            kotlin.jvm.internal.C19383o.m32796f(r5, r7)     // Catch:{ NoSuchMethodException -> 0x00b4 }
            r4[r9] = r5     // Catch:{ NoSuchMethodException -> 0x00b4 }
            r4[r10] = r0     // Catch:{ NoSuchMethodException -> 0x00b4 }
            r4[r6] = r0     // Catch:{ NoSuchMethodException -> 0x00b4 }
            r4[r8] = r0     // Catch:{ NoSuchMethodException -> 0x00b4 }
            goto L_0x009a
        L_0x0099:
            r4 = r2
        L_0x009a:
            if (r4 != 0) goto L_0x00a5
            java.lang.Class[] r0 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x00b4 }
            r0[r9] = r2     // Catch:{ NoSuchMethodException -> 0x00b4 }
            java.lang.reflect.Method r13 = r13.getDeclaredMethod(r14, r0)     // Catch:{ NoSuchMethodException -> 0x00b4 }
            goto L_0x00b0
        L_0x00a5:
            int r0 = r4.length     // Catch:{ NoSuchMethodException -> 0x00b4 }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r0)     // Catch:{ NoSuchMethodException -> 0x00b4 }
            java.lang.Class[] r0 = (java.lang.Class[]) r0     // Catch:{ NoSuchMethodException -> 0x00b4 }
            java.lang.reflect.Method r13 = r13.getDeclaredMethod(r14, r0)     // Catch:{ NoSuchMethodException -> 0x00b4 }
        L_0x00b0:
            r3 = r13
            r1.put(r14, r3)     // Catch:{ NoSuchMethodException -> 0x00b4 }
        L_0x00b4:
            return r3
        L_0x00b5:
            r13 = move-exception
            p401mg.C13080a.m20761a(r12, r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p492yf.C13933e.mo46747c(java.lang.Class, java.lang.String):java.lang.reflect.Method");
    }

    /* renamed from: d */
    public final ArrayList mo46748d(Context context, Object obj) {
        ArrayList<String> stringArrayList;
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (mo46752j(context, obj, "inapp")) {
                char c = 0;
                String str = null;
                int i = 0;
                boolean z = false;
                while (true) {
                    Object[] objArr = new Object[5];
                    objArr[c] = 6;
                    objArr[1] = f30634c;
                    objArr[2] = "inapp";
                    objArr[3] = str;
                    objArr[4] = new Bundle();
                    Object i2 = mo46751i(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, objArr);
                    if (i2 != null) {
                        long j = 1000;
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) i2;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                try {
                                    if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / j) > ((long) 1200)) {
                                        z = true;
                                        break;
                                    }
                                    arrayList.add(next);
                                    i++;
                                    j = 1000;
                                } catch (JSONException unused) {
                                }
                            }
                            str = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i >= 30 || str == null || z) {
                                break;
                            }
                            c = 0;
                        }
                    }
                    str = null;
                    c = 0;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062 A[EDGE_INSN: B:27:0x0062->B:21:0x0062 ?: BREAK  , SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<java.lang.String> mo46749f(android.content.Context r13, java.lang.Object r14, java.lang.String r15) {
        /*
            r12 = this;
            boolean r0 = p401mg.C13080a.m20762b(r12)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0063 }
            r0.<init>()     // Catch:{ all -> 0x0063 }
            if (r14 != 0) goto L_0x0010
            return r0
        L_0x0010:
            boolean r2 = r12.mo46752j(r13, r14, r15)     // Catch:{ all -> 0x0063 }
            if (r2 == 0) goto L_0x0062
            r2 = 0
            r3 = r1
            r4 = r2
        L_0x0019:
            r5 = 4
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0063 }
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0063 }
            r11[r2] = r6     // Catch:{ all -> 0x0063 }
            r6 = 1
            java.lang.String r7 = f30634c     // Catch:{ all -> 0x0063 }
            r11[r6] = r7     // Catch:{ all -> 0x0063 }
            r6 = 2
            r11[r6] = r15     // Catch:{ all -> 0x0063 }
            r11[r5] = r3     // Catch:{ all -> 0x0063 }
            java.lang.String r8 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r9 = "getPurchases"
            r6 = r12
            r7 = r13
            r10 = r14
            java.lang.Object r3 = r6.mo46751i(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0063 }
            if (r3 == 0) goto L_0x005b
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "RESPONSE_CODE"
            int r5 = r3.getInt(r5)     // Catch:{ all -> 0x0063 }
            if (r5 != 0) goto L_0x005b
            java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r5 = r3.getStringArrayList(r5)     // Catch:{ all -> 0x0063 }
            if (r5 == 0) goto L_0x0062
            int r6 = r5.size()     // Catch:{ all -> 0x0063 }
            int r4 = r4 + r6
            r0.addAll(r5)     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r5)     // Catch:{ all -> 0x0063 }
            goto L_0x005c
        L_0x005b:
            r3 = r1
        L_0x005c:
            r5 = 30
            if (r4 >= r5) goto L_0x0062
            if (r3 != 0) goto L_0x0019
        L_0x0062:
            return r0
        L_0x0063:
            r13 = move-exception
            p401mg.C13080a.m20761a(r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p492yf.C13933e.mo46749f(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: h */
    public final LinkedHashMap mo46750h(Context context, ArrayList arrayList, Object obj, boolean z) {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null) {
                if (!arrayList.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                    Object[] objArr = new Object[4];
                    objArr[0] = 3;
                    objArr[1] = f30634c;
                    objArr[2] = z ? "subs" : "inapp";
                    objArr[3] = bundle;
                    Object i = mo46751i(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
                    if (i != null) {
                        Bundle bundle2 = (Bundle) i;
                        if (bundle2.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                                int size = arrayList.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    Object obj2 = arrayList.get(i2);
                                    C19383o.m32796f(obj2, "skuList[i]");
                                    String str = stringArrayList.get(i2);
                                    C19383o.m32796f(str, "skuDetailsList[i]");
                                    linkedHashMap.put(obj2, str);
                                }
                            }
                            mo46754l(linkedHashMap);
                        }
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    /* renamed from: i */
    public final Object mo46751i(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method c;
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            Class<?> b = mo46746b(context, str);
            if (!(b == null || (c = mo46747c(b, str2)) == null)) {
                if (obj != null) {
                    obj = b.cast(obj);
                }
                try {
                    return c.invoke(obj, Arrays.copyOf(objArr, objArr.length));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    /* renamed from: j */
    public final boolean mo46752j(Context context, Object obj, String str) {
        if (C13080a.m20762b(this) || obj == null) {
            return false;
        }
        try {
            Object i = mo46751i(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f30634c, str});
            return i != null && ((Integer) i).intValue() == 0;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return false;
        }
    }

    /* renamed from: k */
    public final LinkedHashMap mo46753k(ArrayList arrayList) {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String string = f30635d.getString(str, (String) null);
                if (string != null) {
                    List y1 = C19459m.m33056y1(string, new String[]{";"}, 2, 2);
                    if (currentTimeMillis - Long.parseLong((String) y1.get(0)) < ((long) 43200)) {
                        C19383o.m32796f(str, "sku");
                        linkedHashMap.put(str, y1.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    /* renamed from: l */
    public final void mo46754l(LinkedHashMap linkedHashMap) {
        if (!C13080a.m20762b(this)) {
            try {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                SharedPreferences.Editor edit = f30635d.edit();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    edit.putString((String) entry.getKey(), currentTimeMillis + ';' + ((String) entry.getValue()));
                }
                edit.apply();
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
