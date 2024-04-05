package retrofit2;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19753l;
import okhttp3.C19928a0;
import okhttp3.C19944e;

/* renamed from: retrofit2.i */
public abstract class C20105i<ResponseT, ReturnT> extends C20149x<ReturnT> {

    /* renamed from: a */
    public final C20143u f44488a;

    /* renamed from: b */
    public final C19944e.C19945a f44489b;

    /* renamed from: c */
    public final C20099f<C19928a0, ResponseT> f44490c;

    /* renamed from: retrofit2.i$a */
    public static final class C20106a<ResponseT, ReturnT> extends C20105i<ResponseT, ReturnT> {

        /* renamed from: d */
        public final C20090c<ResponseT, ReturnT> f44491d;

        public C20106a(C20143u uVar, C19944e.C19945a aVar, C20099f<C19928a0, ResponseT> fVar, C20090c<ResponseT, ReturnT> cVar) {
            super(uVar, aVar, fVar);
            this.f44491d = cVar;
        }

        /* renamed from: c */
        public final Object mo74370c(C20113n nVar, Object[] objArr) {
            return this.f44491d.mo74331b(nVar);
        }
    }

    /* renamed from: retrofit2.i$b */
    public static final class C20107b<ResponseT> extends C20105i<ResponseT, Object> {

        /* renamed from: d */
        public final C20090c<ResponseT, C20089b<ResponseT>> f44492d;

        /* renamed from: e */
        public final boolean f44493e = false;

        public C20107b(C20143u uVar, C19944e.C19945a aVar, C20099f fVar, C20090c cVar) {
            super(uVar, aVar, fVar);
            this.f44492d = cVar;
        }

        /* renamed from: c */
        public final Object mo74370c(C20113n nVar, Object[] objArr) {
            C20089b bVar = (C20089b) this.f44492d.mo74331b(nVar);
            C19340c cVar = objArr[objArr.length - 1];
            try {
                if (this.f44493e) {
                    C19753l lVar = new C19753l(1, C19388s.m32873m0(cVar));
                    lVar.mo72497O(new C20076x19835f11(bVar));
                    bVar.mo74362G(new C20111l(lVar));
                    Object l = lVar.mo72547l();
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return l;
                }
                C19753l lVar2 = new C19753l(1, C19388s.m32873m0(cVar));
                lVar2.mo72497O(new C20075x19835f10(bVar));
                bVar.mo74362G(new C20110k(lVar2));
                Object l2 = lVar2.mo72547l();
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return l2;
            } catch (Exception e) {
                return KotlinExtensions.m34335a(e, cVar);
            }
        }
    }

    /* renamed from: retrofit2.i$c */
    public static final class C20108c<ResponseT> extends C20105i<ResponseT, Object> {

        /* renamed from: d */
        public final C20090c<ResponseT, C20089b<ResponseT>> f44494d;

        public C20108c(C20143u uVar, C19944e.C19945a aVar, C20099f<C19928a0, ResponseT> fVar, C20090c<ResponseT, C20089b<ResponseT>> cVar) {
            super(uVar, aVar, fVar);
            this.f44494d = cVar;
        }

        /* renamed from: c */
        public final Object mo74370c(C20113n nVar, Object[] objArr) {
            C20089b bVar = (C20089b) this.f44494d.mo74331b(nVar);
            C19340c cVar = objArr[objArr.length - 1];
            try {
                C19753l lVar = new C19753l(1, C19388s.m32873m0(cVar));
                lVar.mo72497O(new C20077xc95e9eb1(bVar));
                bVar.mo74362G(new C20112m(lVar));
                Object l = lVar.mo72547l();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return l;
            } catch (Exception e) {
                return KotlinExtensions.m34335a(e, cVar);
            }
        }
    }

    public C20105i(C20143u uVar, C19944e.C19945a aVar, C20099f<C19928a0, ResponseT> fVar) {
        this.f44488a = uVar;
        this.f44489b = aVar;
        this.f44490c = fVar;
    }

    /* renamed from: a */
    public final ReturnT mo74369a(Object[] objArr) {
        return mo74370c(new C20113n(this.f44488a, objArr, this.f44489b, this.f44490c), objArr);
    }

    /* renamed from: c */
    public abstract Object mo74370c(C20113n nVar, Object[] objArr);
}
