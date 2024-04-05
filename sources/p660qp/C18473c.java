package p660qp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.icing.C14517k2;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.appindexing.internal.zzac;
import com.google.firebase.appindexing.internal.zzb;
import com.google.firebase.appindexing.internal.zzc;
import java.lang.reflect.Method;
import p145io.branch.indexing.BranchUniversalObject;
import p145io.branch.referral.util.LinkProperties;
import p556ej.C17704a;
import p556ej.C17706b;
import p556ej.C17707c;
import p556ej.C17709d;
import p623mm.C18248b;
import p623mm.C18250d;
import p623mm.C18251e;
import p623mm.C18252f;
import p631nm.C18274b;

/* renamed from: qp.c */
public final class C18473c {

    /* renamed from: a */
    public static C18251e f40678a;

    /* renamed from: b */
    public static final LinkProperties f40679b = new LinkProperties().setChannel("google_search");

    /* renamed from: a */
    public static void m31174a(String str, Context context, BranchUniversalObject branchUniversalObject) throws Exception {
        Class<String> cls = String.class;
        Class<C17709d.C17710a> cls2 = C17709d.C17710a.class;
        C17709d.C17710a newInstance = cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
        Method method = cls2.getMethod("setName", new Class[]{cls});
        Method method2 = cls2.getMethod("setDescription", new Class[]{cls});
        Method method3 = cls2.getMethod("setUrl", new Class[]{Uri.class});
        Method method4 = cls2.getMethod(JsonPOJOBuilder.DEFAULT_BUILD_METHOD, new Class[0]);
        method.invoke(newInstance, new Object[]{branchUniversalObject.getTitle()});
        method2.invoke(newInstance, new Object[]{branchUniversalObject.getDescription()});
        method3.invoke(newInstance, new Object[]{Uri.parse(str)});
        Object invoke = method4.invoke(newInstance, new Object[0]);
        Class<C17704a> cls3 = C17704a.class;
        Class<C17704a.C17705a> cls4 = C17704a.C17705a.class;
        C17704a.C17705a newInstance2 = cls4.getConstructor(new Class[]{cls}).newInstance(new Object[]{(String) cls3.getDeclaredField("TYPE_VIEW").get((Object) null)});
        Method method5 = cls4.getMethod("setObject", new Class[]{C17709d.class});
        Method method6 = cls4.getMethod("setActionStatus", new Class[]{cls});
        Method method7 = cls4.getMethod(JsonPOJOBuilder.DEFAULT_BUILD_METHOD, new Class[0]);
        method5.invoke(newInstance2, new Object[]{invoke});
        method6.invoke(newInstance2, new Object[]{(String) cls3.getDeclaredField("STATUS_TYPE_COMPLETED").get((Object) null)});
        Object invoke2 = method7.invoke(newInstance2, new Object[0]);
        Class<C17706b> cls5 = C17706b.class;
        int i = C17706b.f38513c;
        Class<Api> cls6 = Api.class;
        Class<GoogleApiClient> cls7 = GoogleApiClient.class;
        String str2 = GoogleApiClient.DEFAULT_ACCOUNT;
        Class<GoogleApiClient.Builder> cls8 = GoogleApiClient.Builder.class;
        GoogleApiClient.Builder newInstance3 = cls8.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
        Method method8 = cls8.getMethod("addApi", new Class[]{cls6});
        Method method9 = cls8.getMethod(JsonPOJOBuilder.DEFAULT_BUILD_METHOD, new Class[0]);
        Method method10 = cls7.getMethod("connect", new Class[0]);
        Method method11 = cls7.getMethod("disconnect", new Class[0]);
        method8.invoke(newInstance3, new Object[]{cls6.cast(cls5.getDeclaredField("API").get((Object) null))});
        Object invoke3 = method9.invoke(newInstance3, new Object[0]);
        method10.invoke(invoke3, new Object[0]);
        Object obj = cls5.getDeclaredField("AppIndexApi").get((Object) null);
        C17707c.class.getMethod("start", new Class[]{cls7, cls3}).invoke(obj, new Object[]{invoke3, invoke2});
        method11.invoke(invoke3, new Object[0]);
    }

    /* renamed from: b */
    public static void m31175b(String str, BranchUniversalObject branchUniversalObject) {
        String str2 = branchUniversalObject.getTitle() + "\n" + branchUniversalObject.getDescription();
        if (!branchUniversalObject.isLocallyIndexable()) {
            Bundle bundle = new Bundle();
            Preconditions.checkNotNull(str2);
            Preconditions.checkNotNull(str);
            C18248b bVar = new C18248b();
            bVar.f40006a = branchUniversalObject.isPublicallyIndexable();
            Preconditions.checkNotNull(bVar);
            zzb zzb = new zzb(bVar.f40006a, (String) null, (String) null, (byte[]) null, false);
            Preconditions.checkNotNull(str2, "setObject is required before calling build().");
            Preconditions.checkNotNull(str, "setObject is required before calling build().");
            f40678a.mo69797a(new zzc("ViewAction", str2, str, (String) null, zzb, (String) null, bundle));
            return;
        }
        Preconditions.checkNotNull(str2);
        Preconditions.checkNotNull(str);
        C18252f fVar = new C18252f();
        Preconditions.checkNotNull(str);
        fVar.f40108c = str;
        Preconditions.checkNotNull(str2);
        C18274b.m30896a(fVar.f40106a, "name", str2);
        new Thing(new Bundle(fVar.f40106a), new zzac(C14517k2.m23058l().mo49827i(), C14517k2.m23058l().mo49828j(), C14517k2.m23058l().mo49829k(), new Bundle(), (Bundle) null), fVar.f40108c, fVar.f40107b);
        C18250d.getInstance();
        throw null;
    }
}
