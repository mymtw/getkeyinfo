package p404nb;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C2273a;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p088e1.C6689b;
import p088e1.C6697d;
import p396mb.C13035a;
import p396mb.C13036b;
import p396mb.C13037c;
import p396mb.C13038d;
import p396mb.C13039e;
import p396mb.C13040f;
import p396mb.C13041g;
import p396mb.C13042h;
import p396mb.C13044i;
import p396mb.C13045j;
import p396mb.C13046k;

/* renamed from: nb.a */
public final class C13100a {

    /* renamed from: nb.a$a */
    public static final class C13101a extends C2273a {

        /* renamed from: a */
        public final /* synthetic */ C2273a f28806a;

        /* renamed from: b */
        public final /* synthetic */ C13035a[] f28807b;

        public C13101a(C2273a aVar, C13035a[] aVarArr) {
            this.f28806a = aVar;
            this.f28807b = aVarArr;
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            C19394m mVar;
            C2273a aVar = this.f28806a;
            if (aVar != null) {
                aVar.onInitializeAccessibilityNodeInfo(view, bVar);
                mVar = C19394m.f43287a;
            } else {
                mVar = null;
            }
            if (mVar == null) {
                super.onInitializeAccessibilityNodeInfo(view, bVar);
            }
            if (bVar != null) {
                for (C13035a aVar2 : this.f28807b) {
                    aVar2.getClass();
                    bVar.mo18851b(new C6689b.C6690a(aVar2.f28693a, aVar2.f28694b));
                }
            }
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            boolean z;
            C13035a[] aVarArr = this.f28807b;
            ArrayList arrayList = new ArrayList();
            int length = aVarArr.length;
            int i2 = 0;
            while (true) {
                z = true;
                if (i2 >= length) {
                    break;
                }
                C13035a aVar = aVarArr[i2];
                if (aVar.f28693a != i) {
                    z = false;
                }
                if (z) {
                    arrayList.add(aVar);
                }
                i2++;
            }
            if (arrayList.size() != 1) {
                z = false;
            }
            C13035a aVar2 = null;
            if (!z) {
                arrayList = null;
            }
            if (arrayList != null) {
                aVar2 = (C13035a) arrayList.get(0);
            }
            if (aVar2 instanceof C13042h) {
                return ((C13042h) aVar2).f28695c.mo30839a(bundle);
            }
            C2273a aVar3 = this.f28806a;
            return aVar3 != null ? aVar3.performAccessibilityAction(view, i, bundle) : super.performAccessibilityAction(view, i, bundle);
        }
    }

    /* renamed from: nb.a$b */
    public static final class C13102b extends C2273a {

        /* renamed from: a */
        public final /* synthetic */ C2273a f28808a;

        /* renamed from: b */
        public final /* synthetic */ C13035a[] f28809b;

        public C13102b(C2273a aVar, C13035a[] aVarArr) {
            this.f28808a = aVar;
            this.f28809b = aVarArr;
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            C19394m mVar;
            C2273a aVar = this.f28808a;
            if (aVar != null) {
                aVar.onInitializeAccessibilityNodeInfo(view, bVar);
                mVar = C19394m.f43287a;
            } else {
                mVar = null;
            }
            if (mVar == null) {
                super.onInitializeAccessibilityNodeInfo(view, bVar);
            }
            if (bVar != null) {
                for (C13035a aVar2 : this.f28809b) {
                    List<C6689b.C6690a> d = bVar.mo18853d();
                    C19383o.m32796f(d, "actionList");
                    ArrayList arrayList = new ArrayList();
                    for (C6689b.C6690a a : d) {
                        arrayList.add(Integer.valueOf(a.mo18875a()));
                    }
                    if (arrayList.contains(Integer.valueOf(aVar2.f28693a))) {
                        bVar.mo18862l(new C6689b.C6690a(aVar2.f28693a, aVar2.f28694b));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m20770a(View view, C13035a... aVarArr) {
        C19383o.m32797g(view, "<this>");
        C2364y.m5201p(view, new C13101a(C2364y.m5189d(view), aVarArr));
    }

    /* renamed from: b */
    public static final ArrayList m20771b(View view) {
        List<C6689b.C6690a> list;
        C19383o.m32797g(view, "<this>");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = view.createAccessibilityNodeInfo().getActionList();
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new C6689b.C6690a(actionList.get(i), 0, (CharSequence) null, (C6697d) null, (Class<? extends C6697d.C6698a>) null));
            }
            list = arrayList;
        } else {
            list = Collections.emptyList();
        }
        C19383o.m32796f(list, "wrap(createAccessibilityNodeInfo()).actionList");
        ArrayList arrayList2 = new ArrayList();
        for (C6689b.C6690a aVar : list) {
            CharSequence b = aVar.mo18876b();
            Object obj = null;
            if (!(b == null || b.length() == 0)) {
                int a = aVar.mo18875a();
                if (a == C6689b.C6690a.f14764g.mo18875a()) {
                    CharSequence b2 = aVar.mo18876b();
                    C19383o.m32796f(b2, "it.label");
                    obj = new C13046k(b2);
                } else if (a == C6689b.C6690a.f14765h.mo18875a()) {
                    CharSequence b3 = aVar.mo18876b();
                    C19383o.m32796f(b3, "it.label");
                    obj = new C13038d(b3);
                } else if (a == C6689b.C6690a.f14771n.mo18875a()) {
                    obj = new C13036b(new C13103b(view, aVar));
                } else if (a == C6689b.C6690a.f14770m.mo18875a()) {
                    obj = new C13037c(new C13104c(view, aVar));
                } else if (a == R.id.action_cart_save_for_later) {
                    CharSequence b4 = aVar.mo18876b();
                    C19383o.m32796f(b4, "it.label");
                    obj = new C13045j(b4, new C13105d(view, aVar));
                } else if (a == R.id.action_cart_remove) {
                    CharSequence b5 = aVar.mo18876b();
                    C19383o.m32796f(b5, "it.label");
                    obj = new C13044i(b5, new C13106e(view, aVar));
                } else if (a == R.id.action_cart_move_to_cart) {
                    CharSequence b6 = aVar.mo18876b();
                    C19383o.m32796f(b6, "it.label");
                    obj = new C13039e(b6, new C13107f(view, aVar));
                } else if (a == R.id.action_cart_move_to_favorites) {
                    CharSequence b7 = aVar.mo18876b();
                    C19383o.m32796f(b7, "it.label");
                    obj = new C13040f(b7, new C13108g(view, aVar));
                } else if (a == R.id.action_cart_open_listing) {
                    CharSequence b8 = aVar.mo18876b();
                    C19383o.m32796f(b8, "it.label");
                    obj = new C13041g(b8, new C13109h(view, aVar));
                }
            }
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* renamed from: c */
    public static final void m20772c(View view, C13035a... aVarArr) {
        C19383o.m32797g(view, "<this>");
        C2364y.m5201p(view, new C13102b(C2364y.m5189d(view), aVarArr));
    }

    /* renamed from: d */
    public static final void m20773d(View view, C13042h hVar, C13042h hVar2) {
        C19383o.m32797g(view, "<this>");
        C19383o.m32797g(hVar, "actionToReplace");
        C19383o.m32797g(hVar2, "replaceWith");
        m20772c(view, hVar);
        m20770a(view, hVar2);
    }
}
