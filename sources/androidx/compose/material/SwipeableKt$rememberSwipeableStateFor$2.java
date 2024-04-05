package androidx.compose.material;

import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class SwipeableKt$rememberSwipeableStateFor$2 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ C1338j0<Boolean> $forceAnimationCheck;
    public final /* synthetic */ C19857l<Object, C19394m> $onValueChange;
    public final /* synthetic */ SwipeableState<Object> $swipeableState;
    public final /* synthetic */ Object $value;

    /* renamed from: androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$2$a */
    public static final class C1142a implements C1358r {
        public final void dispose() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableKt$rememberSwipeableStateFor$2(Object obj, SwipeableState<Object> swipeableState, C19857l<Object, C19394m> lVar, C1338j0<Boolean> j0Var) {
        super(1);
        this.$value = obj;
        this.$swipeableState = swipeableState;
        this.$onValueChange = lVar;
        this.$forceAnimationCheck = j0Var;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        if (!C19383o.m32792b(this.$value, this.$swipeableState.mo5116d())) {
            this.$onValueChange.invoke(this.$swipeableState.mo5116d());
            C1338j0<Boolean> j0Var = this.$forceAnimationCheck;
            j0Var.setValue(Boolean.valueOf(!j0Var.getValue().booleanValue()));
        }
        return new C1142a();
    }
}
