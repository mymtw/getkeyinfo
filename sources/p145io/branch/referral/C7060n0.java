package p145io.branch.referral;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import p504ai.C13983i;

/* renamed from: io.branch.referral.n0 */
public final class C7060n0 implements InvocationHandler {

    /* renamed from: a */
    public final /* synthetic */ Class f15712a;

    /* renamed from: b */
    public final /* synthetic */ Object f15713b;

    public C7060n0(Class cls, Object obj, Context context) {
        this.f15712a = cls;
        this.f15713b = obj;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) throws Exception {
        if (method.getName().equals("onGetAppsReferrerSetupFinished")) {
            Integer num = objArr[0];
            C7077r.m13675a("Xiaomi GetApps onGetAppsReferrerSetupFinished, responseCode = " + num);
            if (num.intValue() == Class.forName("com.miui.referrer.annotation.GetAppsReferrerResponse$Companion").getField("OK").getInt((Object) null)) {
                Method method2 = this.f15712a.getMethod("getInstallReferrer", new Class[0]);
                Class<?> cls = Class.forName("com.miui.referrer.api.GetAppsReferrerDetails");
                Method method3 = cls.getMethod("getInstallReferrer", new Class[0]);
                Method method4 = cls.getMethod("getReferrerClickTimestampSeconds", new Class[0]);
                Method method5 = cls.getMethod("getInstallBeginTimestampSeconds", new Class[0]);
                Object invoke = method2.invoke(this.f15713b, new Object[0]);
                C7070p0.f15747h = (String) method3.invoke(invoke, new Object[0]);
                C7070p0.f15745f = (Long) method4.invoke(invoke, new Object[0]);
                C7070p0.f15746g = (Long) method5.invoke(invoke, new Object[0]);
                if (C7070p0.f15745f == null) {
                    C7070p0.f15745f = Long.MIN_VALUE;
                }
                if (C7070p0.f15746g == null) {
                    C7070p0.f15746g = Long.MIN_VALUE;
                }
                this.f15712a.getMethod("endConnection", new Class[0]).invoke(this.f15713b, new Object[0]);
                String str = C7070p0.f15747h;
                long longValue = C7070p0.f15745f.longValue();
                long longValue2 = C7070p0.f15746g.longValue();
                StringBuilder n = C13983i.m21495n(this.f15712a.getName(), " onReferrerClientFinished() Referrer: ", str, " Click Timestamp: ");
                n.append(longValue);
                n.append(" Install Timestamp: ");
                n.append(longValue2);
                C7077r.m13675a(n.toString());
                C7070p0.m13662u0();
            } else {
                C7070p0.f15744e = true;
                C7070p0.m13662u0();
            }
        } else if (method.getName().equals("onGetAppsServiceDisconnected")) {
            C7077r.m13675a("Xiaomi GetApps onGetAppsServiceDisconnected");
        }
        return null;
    }
}
