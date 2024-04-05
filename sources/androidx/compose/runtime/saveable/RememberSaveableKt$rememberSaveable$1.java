package androidx.compose.runtime.saveable;

import android.support.p013v4.media.C0072d;
import androidx.compose.runtime.C1341k0;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import androidx.compose.runtime.C1422x0;
import androidx.compose.runtime.saveable.C1369e;
import androidx.compose.runtime.snapshots.C1395m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class RememberSaveableKt$rememberSaveable$1 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ String $finalKey;
    public final /* synthetic */ C1369e $registry;
    public final /* synthetic */ C1342k1<C1373g<Object, Object>> $saverState;
    public final /* synthetic */ C1342k1<Object> $valueState;

    /* renamed from: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$a */
    public static final class C1362a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ C1369e.C1370a f2958a;

        public C1362a(C1369e.C1370a aVar) {
            this.f2958a = aVar;
        }

        public final void dispose() {
            this.f2958a.mo5927a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$rememberSaveable$1(C1369e eVar, String str, C1342k1<? extends C1373g<Object, Object>> k1Var, C1342k1<Object> k1Var2) {
        super(1);
        this.$registry = eVar;
        this.$finalKey = str;
        this.$saverState = k1Var;
        this.$valueState = k1Var2;
    }

    public final C1358r invoke(C1360s sVar) {
        String str;
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        RememberSaveableKt$rememberSaveable$1$valueProvider$1 rememberSaveableKt$rememberSaveable$1$valueProvider$1 = new RememberSaveableKt$rememberSaveable$1$valueProvider$1(this.$saverState, this.$valueState, this.$registry);
        C1369e eVar = this.$registry;
        Object invoke = rememberSaveableKt$rememberSaveable$1$valueProvider$1.invoke();
        if (invoke == null || eVar.mo5923a(invoke)) {
            return new C1362a(this.$registry.mo5924b(this.$finalKey, rememberSaveableKt$rememberSaveable$1$valueProvider$1));
        }
        if (invoke instanceof C1395m) {
            C1395m mVar = (C1395m) invoke;
            if (mVar.getPolicy() == C1341k0.f2935a || mVar.getPolicy() == C1351n1.f2948a || mVar.getPolicy() == C1422x0.f3093a) {
                StringBuilder h = C0072d.m201h("MutableState containing ");
                h.append(mVar.getValue());
                h.append(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().");
                str = h.toString();
            } else {
                str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            str = invoke + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
        }
        throw new IllegalArgumentException(str);
    }
}
