package com.google.android.play.core.ktx;

import androidx.compose.foundation.layout.C0761x;
import com.google.android.play.core.appupdate.C15559a;
import com.google.android.play.core.appupdate.C15560b;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.ktx.C15729b;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.channels.C19513o;
import kotlinx.coroutines.channels.ProduceKt;
import p622ml.C18244a;
import p689ul.C18604b;
import p689ul.C18605c;
import p689ul.C18607e;
import p689ul.C18617o;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

@C19060c(mo70540c = "com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1", mo70541f = "AppUpdateManagerKtx.kt", mo70542l = {75}, mo70543m = "invokeSuspend")
final class AppUpdateManagerKtxKt$requestUpdateFlow$1 extends SuspendLambda implements C19861p<C19513o<? super C15729b>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C15560b $this_requestUpdateFlow;
    public Object L$0;
    public Object L$1;
    public int label;

    /* renamed from: p$ */
    private C19513o f35492p$;

    /* renamed from: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1$a */
    public static final class C15716a<ResultT> implements C18605c<C15559a> {

        /* renamed from: b */
        public final /* synthetic */ AppUpdateManagerKtxKt$requestUpdateFlow$1 f35493b;

        /* renamed from: c */
        public final /* synthetic */ C19513o f35494c;

        /* renamed from: d */
        public final /* synthetic */ C15728a f35495d;

        public C15716a(AppUpdateManagerKtxKt$requestUpdateFlow$1 appUpdateManagerKtxKt$requestUpdateFlow$1, C19513o oVar, C15728a aVar) {
            this.f35493b = appUpdateManagerKtxKt$requestUpdateFlow$1;
            this.f35494c = oVar;
            this.f35495d = aVar;
        }

        public final void onSuccess(Object obj) {
            C15559a aVar = (C15559a) obj;
            int i = aVar.f35007a;
            if (i == 0) {
                this.f35494c.mo72187C(new InstallException(-2));
            } else if (i == 1) {
                C19421p.m32942j0(this.f35494c, C15729b.C15733d.f35516a);
                this.f35494c.mo72187C((Throwable) null);
            } else if (i != 2 && i != 3) {
            } else {
                if (aVar.f35008b == 11) {
                    C19421p.m32942j0(this.f35494c, new C15729b.C15731b(this.f35493b.$this_requestUpdateFlow));
                    this.f35494c.mo72187C((Throwable) null);
                    return;
                }
                this.f35493b.$this_requestUpdateFlow.mo55335b(this.f35495d);
                C19421p.m32942j0(this.f35494c, new C15729b.C15730a(this.f35493b.$this_requestUpdateFlow, aVar));
            }
        }
    }

    /* renamed from: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1$b */
    public static final class C15717b implements C18604b {

        /* renamed from: b */
        public final /* synthetic */ C19513o f35496b;

        public C15717b(C19513o oVar) {
            this.f35496b = oVar;
        }

        /* renamed from: a */
        public final void mo46667a(Exception exc) {
            this.f35496b.mo72187C(exc);
        }
    }

    /* renamed from: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1$c */
    public static final class C15718c implements C18244a {

        /* renamed from: a */
        public final /* synthetic */ AppUpdateManagerKtxKt$requestUpdateFlow$1 f35497a;

        /* renamed from: b */
        public final /* synthetic */ C19513o f35498b;

        public C15718c(AppUpdateManagerKtxKt$requestUpdateFlow$1 appUpdateManagerKtxKt$requestUpdateFlow$1, C19513o oVar) {
            this.f35497a = appUpdateManagerKtxKt$requestUpdateFlow$1;
            this.f35498b = oVar;
        }

        /* renamed from: a */
        public final void mo31232a(Object obj) {
            InstallState installState = (InstallState) obj;
            C19383o.m32798h(installState, "installState");
            if (installState.mo55513c() == 11) {
                C19421p.m32942j0(this.f35498b, new C15729b.C15731b(this.f35497a.$this_requestUpdateFlow));
            } else {
                C19421p.m32942j0(this.f35498b, new C15729b.C15732c(installState));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppUpdateManagerKtxKt$requestUpdateFlow$1(C15560b bVar, C19340c cVar) {
        super(2, cVar);
        this.$this_requestUpdateFlow = bVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        C19383o.m32798h(cVar, "completion");
        AppUpdateManagerKtxKt$requestUpdateFlow$1 appUpdateManagerKtxKt$requestUpdateFlow$1 = new AppUpdateManagerKtxKt$requestUpdateFlow$1(this.$this_requestUpdateFlow, cVar);
        appUpdateManagerKtxKt$requestUpdateFlow$1.f35492p$ = (C19513o) obj;
        return appUpdateManagerKtxKt$requestUpdateFlow$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((AppUpdateManagerKtxKt$requestUpdateFlow$1) create(obj, (C19340c) obj2)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19513o oVar = this.f35492p$;
            final C15728a aVar = new C15728a(new C15718c(this, oVar), new AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$2(oVar));
            C18617o e = this.$this_requestUpdateFlow.mo55338e();
            C15716a aVar2 = new C15716a(this, oVar, aVar);
            e.getClass();
            e.mo70116c(C18607e.f41090a, aVar2);
            e.mo70115b(new C15717b(oVar));
            C157153 r3 = new C19846a<C19394m>(this) {
                public final /* synthetic */ AppUpdateManagerKtxKt$requestUpdateFlow$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    this.this$0.$this_requestUpdateFlow.mo55334a(aVar);
                }
            };
            this.L$0 = oVar;
            this.L$1 = aVar;
            this.label = 1;
            if (ProduceKt.m33138a(oVar, r3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C15728a aVar3 = (C15728a) this.L$1;
            C19513o oVar2 = (C19513o) this.L$0;
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
