package p145io.reactivex.rxkotlin;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.observers.CallbackCompletableObserver;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.observers.EmptyCompletableObserver;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax;
import p145io.reactivex.internal.subscribers.LambdaSubscriber;
import p248tp.C8048a;
import p248tp.C8054g;
import p248tp.C8061n;
import p248tp.C8071s;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: io.reactivex.rxkotlin.SubscribersKt */
public final class SubscribersKt {

    /* renamed from: a */
    public static final C19857l<Object, C19394m> f43062a = SubscribersKt$onNextStub$1.INSTANCE;

    /* renamed from: b */
    public static final C19857l<Throwable, C19394m> f43063b = SubscribersKt$onErrorStub$1.INSTANCE;

    /* renamed from: c */
    public static final C19846a<C19394m> f43064c = SubscribersKt$onCompleteStub$1.INSTANCE;

    /* JADX WARNING: type inference failed for: r0v1, types: [io.reactivex.rxkotlin.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> p145io.reactivex.functions.Consumer<T> m32496a(p753kq.C19857l<? super T, kotlin.C19394m> r1) {
        /*
            kq.l<java.lang.Object, kotlin.m> r0 = f43062a
            if (r1 != r0) goto L_0x0007
            io.reactivex.internal.functions.Functions$d r1 = p145io.reactivex.internal.functions.Functions.f28540d
            goto L_0x0011
        L_0x0007:
            if (r1 == 0) goto L_0x000f
            io.reactivex.rxkotlin.b r0 = new io.reactivex.rxkotlin.b
            r0.<init>(r1)
            r1 = r0
        L_0x000f:
            io.reactivex.functions.Consumer r1 = (p145io.reactivex.functions.Consumer) r1
        L_0x0011:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.rxkotlin.SubscribersKt.m32496a(kq.l):io.reactivex.functions.Consumer");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [io.reactivex.rxkotlin.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p287xp.C8333a m32497b(p753kq.C19846a<kotlin.C19394m> r1) {
        /*
            kq.a<kotlin.m> r0 = f43064c
            if (r1 != r0) goto L_0x0007
            io.reactivex.internal.functions.Functions$c r1 = p145io.reactivex.internal.functions.Functions.f28539c
            goto L_0x0011
        L_0x0007:
            if (r1 == 0) goto L_0x000f
            io.reactivex.rxkotlin.a r0 = new io.reactivex.rxkotlin.a
            r0.<init>(r1)
            r1 = r0
        L_0x000f:
            xp.a r1 = (p287xp.C8333a) r1
        L_0x0011:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.rxkotlin.SubscribersKt.m32497b(kq.a):xp.a");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [io.reactivex.rxkotlin.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p145io.reactivex.functions.Consumer<java.lang.Throwable> m32498c(p753kq.C19857l<? super java.lang.Throwable, kotlin.C19394m> r1) {
        /*
            kq.l<java.lang.Throwable, kotlin.m> r0 = f43063b
            if (r1 != r0) goto L_0x0007
            io.reactivex.internal.functions.Functions$h r1 = p145io.reactivex.internal.functions.Functions.f28541e
            goto L_0x0011
        L_0x0007:
            if (r1 == 0) goto L_0x000f
            io.reactivex.rxkotlin.b r0 = new io.reactivex.rxkotlin.b
            r0.<init>(r1)
            r1 = r0
        L_0x000f:
            io.reactivex.functions.Consumer r1 = (p145io.reactivex.functions.Consumer) r1
        L_0x0011:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.rxkotlin.SubscribersKt.m32498c(kq.l):io.reactivex.functions.Consumer");
    }

    /* renamed from: d */
    public static final Disposable m32499d(C8048a aVar, C19857l<? super Throwable, C19394m> lVar, C19846a<C19394m> aVar2) {
        C19383o.m32798h(aVar2, "onComplete");
        C19857l<Throwable, C19394m> lVar2 = f43063b;
        if (lVar == lVar2 && aVar2 == f43064c) {
            EmptyCompletableObserver emptyCompletableObserver = new EmptyCompletableObserver();
            aVar.mo20607a(emptyCompletableObserver);
            return emptyCompletableObserver;
        } else if (lVar == lVar2) {
            CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(new C19252a(aVar2));
            aVar.mo20607a(callbackCompletableObserver);
            return callbackCompletableObserver;
        } else {
            return aVar.mo20608c(new C19253b(lVar), m32497b(aVar2));
        }
    }

    /* renamed from: e */
    public static final ConsumerSingleObserver m32500e(C8071s sVar, C19857l lVar, C19857l lVar2) {
        C19383o.m32798h(lVar, "onError");
        C19383o.m32798h(lVar2, "onSuccess");
        return sVar.mo20658g(m32496a(lVar2), m32498c(lVar));
    }

    /* renamed from: f */
    public static LambdaObserver m32501f(C8061n nVar, C19857l<Throwable, C19394m> lVar, C19857l<Object, C19394m> lVar2, int i) {
        if ((i & 1) != 0) {
            lVar = f43063b;
        }
        C19846a<C19394m> aVar = (i & 2) != 0 ? f43064c : null;
        if ((i & 4) != 0) {
            lVar2 = f43062a;
        }
        C19383o.m32798h(nVar, "$this$subscribeBy");
        C19383o.m32798h(lVar, "onError");
        C19383o.m32798h(aVar, "onComplete");
        C19383o.m32798h(lVar2, "onNext");
        return (LambdaObserver) nVar.mo20636f(m32496a(lVar2), m32498c(lVar), m32497b(aVar), Functions.f28540d);
    }

    /* renamed from: g */
    public static LambdaSubscriber m32502g(C8054g gVar, C19857l lVar, C19857l lVar2) {
        C19846a<C19394m> aVar = f43064c;
        C19383o.m32798h(lVar, "onError");
        C19383o.m32798h(aVar, "onComplete");
        return (LambdaSubscriber) gVar.mo20618b(m32496a(lVar2), m32498c(lVar), m32497b(aVar), FlowableInternalHelper$RequestMax.INSTANCE);
    }
}
