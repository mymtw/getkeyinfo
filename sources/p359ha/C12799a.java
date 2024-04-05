package p359ha;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.jakewharton.rxrelay2.C17038b;
import kotlin.jvm.internal.C19383o;
import p277w8.C8264b;
import p486y9.C13891g;

/* renamed from: ha.a */
public final class C12799a {

    /* renamed from: a */
    public final FirebaseAnalytics f28272a;

    public C12799a(FirebaseAnalytics firebaseAnalytics, String str, C13891g gVar) {
        C19383o.m32797g(firebaseAnalytics, "firebaseAnalytics");
        C19383o.m32797g(str, "uuid");
        C19383o.m32797g(gVar, "localeUpdateStream");
        this.f28272a = firebaseAnalytics;
        firebaseAnalytics.mo58990a("uaid", str);
        C17038b<String> bVar = gVar.f30560a;
        C19383o.m32795e(bVar, "null cannot be cast to non-null type io.reactivex.Observable<kotlin.String>");
        bVar.mo20637g(new C8264b(this, 3));
    }
}
