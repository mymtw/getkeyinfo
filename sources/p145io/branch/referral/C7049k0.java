package p145io.branch.referral;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import p504ai.C13983i;

/* renamed from: io.branch.referral.k0 */
public final class C7049k0 implements InvocationHandler {

    /* renamed from: a */
    public final /* synthetic */ Class f15679a;

    /* renamed from: b */
    public final /* synthetic */ Object f15680b;

    public C7049k0(Class cls, Object obj, Context context) {
        this.f15679a = cls;
        this.f15680b = obj;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) throws Exception {
        if (method.getName().equals("onInstallReferrerSetupFinished")) {
            Integer num = objArr[0];
            C7077r.m13675a("Samsung Galaxy Store onInstallReferrerSetupFinished, responseCode = " + num);
            if (num.intValue() == Class.forName("com.sec.android.app.samsungapps.installreferrer.api.InstallReferrerClient$InstallReferrerResponse").getField("OK").getInt((Object) null)) {
                Method method2 = this.f15679a.getMethod("getInstallReferrer", new Class[0]);
                Class<?> cls = Class.forName("com.sec.android.app.samsungapps.installreferrer.api.ReferrerDetails");
                Method method3 = cls.getMethod("getInstallReferrer", new Class[0]);
                Method method4 = cls.getMethod("getReferrerClickTimestampSeconds", new Class[0]);
                Method method5 = cls.getMethod("getInstallBeginTimestampSeconds", new Class[0]);
                Object invoke = method2.invoke(this.f15680b, new Object[0]);
                C7056m0.f15708h = (String) method3.invoke(invoke, new Object[0]);
                C7056m0.f15706f = (Long) method4.invoke(invoke, new Object[0]);
                C7056m0.f15707g = (Long) method5.invoke(invoke, new Object[0]);
                if (C7056m0.f15706f == null) {
                    C7056m0.f15706f = Long.MIN_VALUE;
                }
                if (C7056m0.f15707g == null) {
                    C7056m0.f15707g = Long.MIN_VALUE;
                }
                this.f15679a.getMethod("endConnection", new Class[0]).invoke(this.f15680b, new Object[0]);
                String str = C7056m0.f15708h;
                long longValue = C7056m0.f15706f.longValue();
                long longValue2 = C7056m0.f15707g.longValue();
                StringBuilder n = C13983i.m21495n(this.f15679a.getName(), " onReferrerClientFinished() Referrer: ", str, " Click Timestamp: ");
                n.append(longValue);
                n.append(" Install Timestamp: ");
                n.append(longValue2);
                C7077r.m13675a(n.toString());
                C7056m0.m13646u0();
            } else {
                C7056m0.f15705e = true;
                C7056m0.m13646u0();
            }
        } else if (method.getName().equals("onInstallReferrerServiceDisconnected")) {
            C7077r.m13675a("onInstallReferrerServiceDisconnected");
        }
        return null;
    }
}
