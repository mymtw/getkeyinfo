package com.etsy.android.p327ui.listing.p329ui.buybox.quantity;

import com.etsy.android.p327ui.listing.p329ui.C10195b;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import java.util.NoSuchElementException;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.quantity.QuantityChangedHandler$handle$1 */
public final class QuantityChangedHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13755w2 $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QuantityChangedHandler$handle$1(C13597g.C13755w2 w2Var) {
        super(1);
        this.$event = w2Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C13597g.C13755w2 w2Var = this.$event;
        gVar.mo33962b(new C19857l<C10195b, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10195b) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10195b bVar) {
                C10299a aVar;
                C19383o.m32797g(bVar, "$this$buyBox");
                C10299a aVar2 = bVar.f22387m;
                if (aVar2 != null) {
                    int i = w2Var.f30283a;
                    boolean z = true;
                    if (i < 1) {
                        i = 1;
                    } else {
                        int[] iArr = aVar2.f22610b;
                        C19383o.m32797g(iArr, "<this>");
                        int length = iArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                i2 = -1;
                                break;
                            } else if (i == iArr[i2]) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (!(i2 >= 0)) {
                            int[] iArr2 = aVar2.f22610b;
                            C19383o.m32797g(iArr2, "<this>");
                            if (iArr2.length != 0) {
                                z = false;
                            }
                            if (!z) {
                                i = iArr2[iArr2.length - 1];
                            } else {
                                throw new NoSuchElementException("Array is empty.");
                            }
                        }
                    }
                    int[] iArr3 = aVar2.f22610b;
                    boolean z2 = aVar2.f22611c;
                    C19383o.m32797g(iArr3, "range");
                    aVar = new C10299a(i, z2, iArr3);
                } else {
                    aVar = null;
                }
                bVar.f22387m = aVar;
            }
        });
    }
}
