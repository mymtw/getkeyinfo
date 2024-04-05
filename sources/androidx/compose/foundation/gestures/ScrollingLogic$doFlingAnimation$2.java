package androidx.compose.foundation.gestures;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p174m0.C7294l;
import p288y.C8343c;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", mo70541f = "Scrollable.kt", mo70542l = {412}, mo70543m = "invokeSuspend")
public final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements C19861p<C0614l, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ long $available;
    public final /* synthetic */ Ref$LongRef $result;
    public long J$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ ScrollingLogic this$0;

    /* renamed from: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$a */
    public static final class C0583a implements C0614l {

        /* renamed from: a */
        public final /* synthetic */ ScrollingLogic f1350a;

        /* renamed from: b */
        public final /* synthetic */ C19857l<C8343c, C8343c> f1351b;

        public C0583a(ScrollingLogic scrollingLogic, C19857l<? super C8343c, C8343c> lVar) {
            this.f1350a = scrollingLogic;
            this.f1351b = lVar;
        }

        /* renamed from: a */
        public final float mo3737a(float f) {
            ScrollingLogic scrollingLogic = this.f1350a;
            return scrollingLogic.mo3820d(this.f1351b.invoke(new C8343c(scrollingLogic.mo3821e(f))).f18299a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, Ref$LongRef ref$LongRef, long j, C19340c<? super ScrollingLogic$doFlingAnimation$2> cVar) {
        super(2, cVar);
        this.this$0 = scrollingLogic;
        this.$result = ref$LongRef;
        this.$available = j;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, cVar);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    public final Object invoke(C0614l lVar, C19340c<? super C19394m> cVar) {
        return ((ScrollingLogic$doFlingAnimation$2) create(lVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        ScrollingLogic scrollingLogic2;
        Ref$LongRef ref$LongRef;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            C0761x.m1684O0(obj);
            ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1 scrollingLogic$doFlingAnimation$2$outerScopeScroll$1 = new ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1(this.this$0, (C0614l) this.L$0);
            scrollingLogic2 = this.this$0;
            C0583a aVar = new C0583a(scrollingLogic2, scrollingLogic$doFlingAnimation$2$outerScopeScroll$1);
            ref$LongRef = this.$result;
            long j2 = this.$available;
            C0608f fVar = scrollingLogic2.f1348e;
            long j3 = ref$LongRef.element;
            float b = scrollingLogic2.f1344a == Orientation.Horizontal ? C7294l.m14004b(j2) : C7294l.m14005c(j2);
            if (scrollingLogic2.f1345b) {
                b *= (float) -1;
            }
            this.L$0 = scrollingLogic2;
            this.L$1 = scrollingLogic2;
            this.L$2 = ref$LongRef;
            this.J$0 = j3;
            this.label = 1;
            obj = fVar.mo3858a(aVar, b, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            scrollingLogic = scrollingLogic2;
            j = j3;
        } else if (i == 1) {
            j = this.J$0;
            ref$LongRef = (Ref$LongRef) this.L$2;
            scrollingLogic2 = (ScrollingLogic) this.L$1;
            scrollingLogic = (ScrollingLogic) this.L$0;
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        float floatValue = ((Number) obj).floatValue();
        if (scrollingLogic.f1345b) {
            floatValue *= (float) -1;
        }
        float f = 0.0f;
        if (scrollingLogic2.f1344a == Orientation.Horizontal) {
            i2 = 2;
        } else {
            f = floatValue;
            floatValue = 0.0f;
        }
        ref$LongRef.element = C7294l.m14003a(j, floatValue, f, i2);
        return C19394m.f43287a;
    }
}
