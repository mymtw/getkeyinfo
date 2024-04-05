package com.etsy.android.p327ui.cart.bottomsheets;

import android.content.DialogInterface;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.view.View;
import android.widget.TextView;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.C3229f;
import com.etsy.android.R;
import com.etsy.android.lib.core.HttpMethod;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.EtsyAssociativeArray;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.OfferingOption;
import com.etsy.android.lib.models.apiv3.OfferingSelect;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cart.C9420x;
import com.etsy.android.p327ui.cart.C9421y;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import okhttp3.C20002r;
import okhttp3.C20016y;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.SingleTimer;
import p145io.reactivex.internal.operators.single.SingleZipArray;
import p248tp.C8071s;
import p277w8.C8264b;
import p340ea.C12673n;
import p402n9.C13083c;
import p456ua.C13458c;
import p456ua.C13461f;
import p504ai.C13983i;
import p753kq.C19857l;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.cart.bottomsheets.SelectVariationWorkflow */
public final class SelectVariationWorkflow {

    /* renamed from: a */
    public final C9420x f20419a;

    /* renamed from: b */
    public final C13461f f20420b;

    /* renamed from: c */
    public final C8703p f20421c;

    /* renamed from: d */
    public final C12673n f20422d;

    /* renamed from: e */
    public final C7091a f20423e = new C7091a();

    /* renamed from: f */
    public CollageBottomSheet f20424f;

    /* renamed from: g */
    public C9248b f20425g = C9248b.C9250b.f20433a;

    /* renamed from: h */
    public final C9254a f20426h = new C9254a(new SelectVariationWorkflow$adapter$1(this));

    /* renamed from: i */
    public C19857l<? super C9245a, C19394m> f20427i;

    /* renamed from: com.etsy.android.ui.cart.bottomsheets.SelectVariationWorkflow$a */
    public static abstract class C9245a {

        /* renamed from: com.etsy.android.ui.cart.bottomsheets.SelectVariationWorkflow$a$a */
        public static final class C9246a extends C9245a {

            /* renamed from: a */
            public final int f20428a;

            public C9246a(int i) {
                this.f20428a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9246a) && this.f20428a == ((C9246a) obj).f20428a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f20428a);
            }

            public final String toString() {
                return C0073e.m208h(C0072d.m201h("Error(stringResId="), this.f20428a, ')');
            }
        }

        /* renamed from: com.etsy.android.ui.cart.bottomsheets.SelectVariationWorkflow$a$b */
        public static final class C9247b extends C9245a {

            /* renamed from: a */
            public final ServerDrivenAction f20429a;

            public C9247b(ServerDrivenAction serverDrivenAction) {
                this.f20429a = serverDrivenAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9247b) && C19383o.m32792b(this.f20429a, ((C9247b) obj).f20429a);
            }

            public final int hashCode() {
                return this.f20429a.hashCode();
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Success(action=");
                h.append(this.f20429a);
                h.append(')');
                return h.toString();
            }
        }
    }

    /* renamed from: com.etsy.android.ui.cart.bottomsheets.SelectVariationWorkflow$b */
    public static abstract class C9248b {

        /* renamed from: com.etsy.android.ui.cart.bottomsheets.SelectVariationWorkflow$b$a */
        public static final class C9249a extends C9248b {

            /* renamed from: a */
            public final String f20430a;

            /* renamed from: b */
            public final List<OfferingOption> f20431b;

            /* renamed from: c */
            public final CartGroupItem f20432c;

            public C9249a(String str, List<? extends OfferingOption> list, CartGroupItem cartGroupItem) {
                this.f20430a = str;
                this.f20431b = list;
                this.f20432c = cartGroupItem;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9249a)) {
                    return false;
                }
                C9249a aVar = (C9249a) obj;
                return C19383o.m32792b(this.f20430a, aVar.f20430a) && C19383o.m32792b(this.f20431b, aVar.f20431b) && C19383o.m32792b(this.f20432c, aVar.f20432c);
            }

            public final int hashCode() {
                return this.f20432c.hashCode() + C13983i.m21488g(this.f20431b, this.f20430a.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("FirstVariationSelection(_prompt=");
                h.append(this.f20430a);
                h.append(", _options=");
                h.append(this.f20431b);
                h.append(", cartGroupItem=");
                h.append(this.f20432c);
                h.append(')');
                return h.toString();
            }
        }

        /* renamed from: com.etsy.android.ui.cart.bottomsheets.SelectVariationWorkflow$b$b */
        public static final class C9250b extends C9248b {

            /* renamed from: a */
            public static final C9250b f20433a = new C9250b();
        }

        /* renamed from: com.etsy.android.ui.cart.bottomsheets.SelectVariationWorkflow$b$c */
        public static final class C9251c extends C9248b {

            /* renamed from: a */
            public static final C9251c f20434a = new C9251c();
        }

        /* renamed from: com.etsy.android.ui.cart.bottomsheets.SelectVariationWorkflow$b$d */
        public static final class C9252d extends C9248b {

            /* renamed from: a */
            public static final C9252d f20435a = new C9252d();
        }

        /* renamed from: com.etsy.android.ui.cart.bottomsheets.SelectVariationWorkflow$b$e */
        public static final class C9253e extends C9248b {

            /* renamed from: a */
            public final String f20436a;

            /* renamed from: b */
            public final List<OfferingOption> f20437b;

            /* renamed from: c */
            public final CartGroupItem f20438c;

            public C9253e(String str, List<? extends OfferingOption> list, CartGroupItem cartGroupItem) {
                this.f20436a = str;
                this.f20437b = list;
                this.f20438c = cartGroupItem;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9253e)) {
                    return false;
                }
                C9253e eVar = (C9253e) obj;
                return C19383o.m32792b(this.f20436a, eVar.f20436a) && C19383o.m32792b(this.f20437b, eVar.f20437b) && C19383o.m32792b(this.f20438c, eVar.f20438c);
            }

            public final int hashCode() {
                return this.f20438c.hashCode() + C13983i.m21488g(this.f20437b, this.f20436a.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("SecondVariationSelection(_prompt=");
                h.append(this.f20436a);
                h.append(", _options=");
                h.append(this.f20437b);
                h.append(", cartGroupItem=");
                h.append(this.f20438c);
                h.append(')');
                return h.toString();
            }
        }
    }

    public SelectVariationWorkflow(C9420x xVar, C13461f fVar, C8703p pVar, C12673n nVar) {
        C19383o.m32797g(nVar, "elkLogger");
        this.f20419a = xVar;
        this.f20420b = fVar;
        this.f20421c = pVar;
        this.f20422d = nVar;
    }

    /* renamed from: a */
    public final void mo31553a() {
        this.f20423e.mo19405d();
        CollageBottomSheet collageBottomSheet = this.f20424f;
        if (collageBottomSheet != null) {
            collageBottomSheet.setOnCancelListener((DialogInterface.OnCancelListener) null);
            collageBottomSheet.setOnDismissListener((DialogInterface.OnDismissListener) null);
            if (collageBottomSheet.isShowing()) {
                collageBottomSheet.dismiss();
            }
        }
        this.f20424f = null;
        this.f20427i = null;
    }

    /* renamed from: b */
    public final void mo31554b(ServerDrivenAction serverDrivenAction) {
        C8071s<C20145v<C19928a0>> sVar;
        CollageBottomSheet collageBottomSheet = this.f20424f;
        if (collageBottomSheet != null) {
            collageBottomSheet.setContentView((int) R.layout.view_loading_indicator);
        }
        CollageBottomSheet collageBottomSheet2 = this.f20424f;
        String str = null;
        if (collageBottomSheet2 != null) {
            collageBottomSheet2.setOnDismissListener((DialogInterface.OnDismissListener) null);
            collageBottomSheet2.dismiss();
            collageBottomSheet2.show();
            collageBottomSheet2.setOnDismissListener(new C9264b(this, 0));
        }
        SingleTimer j = C8071s.m16252j(500, TimeUnit.MILLISECONDS);
        C9420x xVar = this.f20419a;
        String path = serverDrivenAction.getPath();
        C19383o.m32796f(path, "action.path");
        EtsyAssociativeArray params = serverDrivenAction.getParams();
        String requestMethod = serverDrivenAction.getRequestMethod();
        C19383o.m32796f(requestMethod, "action.requestMethod");
        xVar.getClass();
        if (C19383o.m32792b(requestMethod, HttpMethod.POST.name())) {
            C9421y yVar = xVar.f20898b;
            Map p0 = C19294b0.m32559p0();
            C20016y.C20017a aVar = C20016y.f44360a;
            C20002r.f44260f.getClass();
            C20002r b = C20002r.C20003a.m34244b("application/json");
            if (params != null) {
                str = params.toJSON();
            }
            if (str == null) {
                str = "{}";
            }
            aVar.getClass();
            sVar = yVar.mo31851a(path, p0, C20016y.C20017a.m34281b(str, b));
        } else {
            LinkedHashMap a = C9420x.m17774a(params);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : a.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            sVar = xVar.f20898b.mo31853c(path, linkedHashMap);
        }
        C13458c cVar = new C13458c(xVar, 2);
        sVar.getClass();
        SingleZipArray l = C8071s.m16253l(j, new C19208j(sVar, cVar), new C3229f());
        this.f20420b.getClass();
        ConsumerSingleObserver g = C0391c.m1056b(this.f20420b, l.mo20660i(C13461f.m21235b())).mo20658g(new C13083c(this, 3), new C8264b(this, 6));
        C7091a aVar2 = this.f20423e;
        C19383o.m32798h(aVar2, "compositeDisposable");
        aVar2.mo19403b(g);
    }

    /* renamed from: c */
    public final void mo31555c(CartGroupItem cartGroupItem, OfferingOption offeringOption) {
        this.f20421c.mo21333d("cart_variation_changed", (Map<? extends AnalyticsProperty, Object>) null);
        ServerDrivenAction action = cartGroupItem.getAction(ServerDrivenAction.TYPE_RESOLVE_CUSTOMIZATION);
        ServerDrivenAction action2 = cartGroupItem.getAction(ServerDrivenAction.TYPE_UPDATE_CUSTOMIZATION);
        OfferingSelect offeringSelect = (OfferingSelect) cartGroupItem.getData();
        if (action != null && offeringSelect != null) {
            String id = offeringSelect.getPropertyId().getId();
            String id2 = offeringOption.getValue().getId();
            EtsyAssociativeArray hashMapOrDefault = action.getParams().getHashMapOrDefault(ResponseConstants.VARIATIONS, new EtsyAssociativeArray());
            hashMapOrDefault.put(id, id2);
            action.getParams().put(ResponseConstants.VARIATIONS, hashMapOrDefault);
            this.f20425g = C9248b.C9252d.f20435a;
            mo31554b(action);
        } else if (action2 == null || offeringSelect == null) {
            mo31556d(R.string.whoops_somethings_wrong);
        } else {
            String id3 = offeringSelect.getPropertyId().getId();
            String id4 = offeringOption.getValue().getId();
            EtsyAssociativeArray hashMapOrDefault2 = action2.getParams().getHashMapOrDefault(ResponseConstants.VARIATIONS, new EtsyAssociativeArray());
            hashMapOrDefault2.put(id3, id4);
            action2.getParams().put(ResponseConstants.VARIATIONS, hashMapOrDefault2);
            C19857l<? super C9245a, C19394m> lVar = this.f20427i;
            if (lVar != null) {
                lVar.invoke(new C9245a.C9247b(action2));
            }
            mo31553a();
        }
    }

    /* renamed from: d */
    public final void mo31556d(int i) {
        C19857l<? super C9245a, C19394m> lVar = this.f20427i;
        if (lVar != null) {
            lVar.invoke(new C9245a.C9246a(i));
        }
        mo31553a();
    }

    /* renamed from: e */
    public final void mo31557e(String str, List<? extends OfferingOption> list) {
        C9254a aVar = this.f20426h;
        aVar.f20440c.clear();
        aVar.notifyDataSetChanged();
        C9254a aVar2 = this.f20426h;
        aVar2.getClass();
        aVar2.f20440c.clear();
        aVar2.f20440c.addAll(list);
        aVar2.notifyDataSetChanged();
        CollageBottomSheet collageBottomSheet = this.f20424f;
        if (collageBottomSheet != null) {
            collageBottomSheet.setContentView((int) R.layout.view_cart_variation_select_bottom_sheet);
            View findViewById = collageBottomSheet.findViewById(R.id.recycler_view);
            C19383o.m32794d(findViewById);
            ((RecyclerView) findViewById).setAdapter(this.f20426h);
            TextView textView = (TextView) collageBottomSheet.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(str);
            }
        }
        CollageBottomSheet collageBottomSheet2 = this.f20424f;
        if (collageBottomSheet2 != null) {
            collageBottomSheet2.setOnDismissListener((DialogInterface.OnDismissListener) null);
            collageBottomSheet2.dismiss();
            collageBottomSheet2.show();
            collageBottomSheet2.setOnDismissListener(new C9264b(this, 0));
        }
    }
}
