package p418pa;

import com.etsy.android.lib.session.SessionSettings;
import com.etsy.android.p327ui.navigation.bottom.C10690g;
import com.etsy.android.p327ui.shop.ShopSectionListingsFragment;
import com.etsy.android.p327ui.singleactivity.C11316a;
import com.etsy.android.p327ui.singleactivity.C11317b;
import com.etsy.android.p327ui.singleactivity.StackType;
import com.etsy.android.p327ui.user.ReceiptFragment;
import com.etsy.android.util.C12069z;
import com.zhuinden.simplestack.C17518a;
import com.zhuinden.simplestack.C17527e;
import com.zhuinden.simplestack.C17532i;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.functions.Consumer;
import p310ae.C8510a;
import p395ma.C13029b;
import p418pa.C13198d;

/* renamed from: pa.c */
public final /* synthetic */ class C13197c implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f29027b;

    /* renamed from: c */
    public final /* synthetic */ Object f29028c;

    public /* synthetic */ C13197c(Object obj, int i) {
        this.f29027b = i;
        this.f29028c = obj;
    }

    public final void accept(Object obj) {
        StackType stackType;
        switch (this.f29027b) {
            case 0:
                C13198d dVar = (C13198d) this.f29028c;
                C19383o.m32797g(dVar, "this$0");
                dVar.mo45910d(((SessionSettings) obj).f19542a);
                dVar.f29035e.onNext(C13198d.C13199a.C13202c.f29038a);
                return;
            case 1:
                ShopSectionListingsFragment.m35053onViewCreated$lambda1((ShopSectionListingsFragment) this.f29028c, (List) obj);
                return;
            case 2:
                C11316a aVar = (C11316a) this.f29028c;
                C10690g gVar = (C10690g) obj;
                C19383o.m32797g(aVar, "this$0");
                StackType.C11315a aVar2 = StackType.Companion;
                int i = gVar.f23571a;
                aVar2.getClass();
                StackType[] values = StackType.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        stackType = values[i2];
                        if (stackType.getBottomNavItemId() != i) {
                            i2++;
                        }
                    } else {
                        stackType = StackType.HOME;
                    }
                }
                C11317b d = aVar.mo37051d();
                String name = stackType.name();
                C19383o.m32797g(name, "identifier");
                if (d.f24974a.containsKey(name)) {
                    if (!C19383o.m32792b(d.f24975b, name)) {
                        d.f24975b = name;
                        d.mo37059e(d.f24976c);
                    }
                    if (!gVar.f23575e) {
                        C8510a aVar3 = (C8510a) aVar.f24967e;
                        aVar3.getClass();
                        List<StackType> list = aVar3.f18527a;
                        list.remove(stackType);
                        list.add(stackType);
                    }
                    if (gVar.f23574d) {
                        C17518a d2 = aVar.mo37051d().mo37058d();
                        d2.mo68699d("A backstack must be set up before navigation.");
                        C17532i iVar = d2.f38326h;
                        iVar.mo68747a();
                        C17527e a = C17527e.m29386a(iVar.mo68751e()).mo68743a();
                        Object[] objArr = new Object[1];
                        objArr[0] = a.isEmpty() ? null : a.get(0);
                        iVar.mo68750d(C17527e.m29387e(objArr), -1, true, false);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(C0048b.m163a("You cannot specify a stack [", name, "] that does not exist!"));
            case 3:
                ((ReceiptFragment) this.f29028c).handlePaymentResult((C13029b) obj);
                return;
            default:
                Disposable disposable = (Disposable) obj;
                ((C12069z) this.f29028c).f26921h.mo21310e("Subscribing to network changes to register for pushes if necessary");
                return;
        }
    }
}
