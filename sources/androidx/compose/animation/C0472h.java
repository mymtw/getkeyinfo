package androidx.compose.animation;

import androidx.compose.runtime.C1295a1;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.etsy.android.lib.logger.LogCatKt;
import com.google.firebase.perf.FirebasePerfRegistrar;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.android.AndroidDispatcherFactory;
import kotlinx.coroutines.internal.C19728l;
import p145io.reactivex.internal.operators.observable.C19172m;
import p145io.reactivex.internal.operators.single.C19211l;
import p145io.reactivex.internal.operators.single.SingleSubscribeOn;
import p145io.reactivex.subjects.C19254a;
import p145io.reactivex.subjects.PublishSubject;
import p456ua.C13461f;
import p644ph.C18349h;
import p644ph.C18353k;
import p649pm.C18400e;
import p649pm.C18415r;
import p661rh.C18476b;
import p753kq.C19861p;

/* renamed from: androidx.compose.animation.h */
public final /* synthetic */ class C0472h implements C18400e, C18353k {
    /* renamed from: b */
    public static C19172m m1241b(C19254a aVar, C19254a aVar2) {
        aVar.getClass();
        return new C19172m(aVar2);
    }

    /* renamed from: c */
    public static C19172m m1242c(PublishSubject publishSubject, PublishSubject publishSubject2) {
        publishSubject.getClass();
        return new C19172m(publishSubject2);
    }

    /* renamed from: e */
    public static SingleSubscribeOn m1243e(C13461f fVar, C19211l lVar) {
        fVar.getClass();
        return lVar.mo20660i(C13461f.m21235b());
    }

    /* renamed from: g */
    public static StringBuilder m1244g(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    /* renamed from: h */
    public static /* synthetic */ Iterator m1245h() {
        try {
            return Arrays.asList(new C19728l[]{new AndroidDispatcherFactory()}).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* renamed from: i */
    public static void m1246i(int i, ComposableLambdaImpl composableLambdaImpl, C1295a1 a1Var, C1302d dVar, int i2, int i3) {
        composableLambdaImpl.invoke(a1Var, dVar, Integer.valueOf(i));
        dVar.mo5465u(i2);
        dVar.mo5465u(i3);
    }

    /* renamed from: j */
    public static void m1247j(int i, C19861p pVar, ComposerImpl composerImpl, boolean z, boolean z2, boolean z3) {
        pVar.invoke(composerImpl, Integer.valueOf(i));
        composerImpl.mo5418R(z);
        composerImpl.mo5418R(z2);
        composerImpl.mo5418R(z3);
    }

    /* renamed from: k */
    public static void m1248k(Throwable th, String str, Throwable th2) {
        C19383o.m32797g(th, str);
        LogCatKt.m17045a().error(th2);
    }

    /* renamed from: d */
    public C18349h[] mo38d() {
        return new C18349h[]{new C18476b()};
    }

    /* renamed from: f */
    public Object mo56f(C18415r rVar) {
        return FirebasePerfRegistrar.providesFirebasePerformance(rVar);
    }
}
