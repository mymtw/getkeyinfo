package com.etsy.android.p327ui.cart.clicklisteners;

import android.content.DialogInterface;
import android.support.p013v4.media.C0072d;
import android.view.View;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.C6331b;
import com.etsy.android.C6332c;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.EtsyAssociativeArray;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.CartPage;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cart.C9334s;
import com.etsy.android.p327ui.cart.C9420x;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import com.etsy.android.stylekit.views.CollageTextInput;
import com.etsy.android.stylekit.views.ProgressButton;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p456ua.C13461f;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.clicklisteners.e */
public final class C9274e {

    /* renamed from: a */
    public final C9420x f20484a;

    /* renamed from: b */
    public final C13461f f20485b;

    /* renamed from: c */
    public final C7091a f20486c = new C7091a();

    /* renamed from: d */
    public CollageBottomSheet f20487d;

    /* renamed from: e */
    public C9276b f20488e = C9276b.C9279c.f20495a;

    /* renamed from: f */
    public C19857l<? super CartPage, C19394m> f20489f;

    /* renamed from: com.etsy.android.ui.cart.clicklisteners.e$a */
    public static final class C9275a {

        /* renamed from: a */
        public final C9334s f20490a;

        /* renamed from: b */
        public final ServerDrivenAction f20491b;

        public C9275a(ServerDrivenAction serverDrivenAction, C9334s sVar) {
            C19383o.m32797g(serverDrivenAction, ResponseConstants.ACTION);
            this.f20490a = sVar;
            this.f20491b = serverDrivenAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9275a)) {
                return false;
            }
            C9275a aVar = (C9275a) obj;
            return C19383o.m32792b(this.f20490a, aVar.f20490a) && C19383o.m32792b(this.f20491b, aVar.f20491b);
        }

        public final int hashCode() {
            return this.f20491b.hashCode() + (this.f20490a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Specs(requestSpecs=");
            h.append(this.f20490a);
            h.append(", action=");
            h.append(this.f20491b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.cart.clicklisteners.e$b */
    public static abstract class C9276b {

        /* renamed from: com.etsy.android.ui.cart.clicklisteners.e$b$a */
        public static final class C9277a extends C9276b {

            /* renamed from: a */
            public final C9275a f20492a;

            public C9277a(C9275a aVar) {
                this.f20492a = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9277a) && C19383o.m32792b(this.f20492a, ((C9277a) obj).f20492a);
            }

            public final int hashCode() {
                return this.f20492a.hashCode();
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("EnteringCoupon(specs=");
                h.append(this.f20492a);
                h.append(')');
                return h.toString();
            }
        }

        /* renamed from: com.etsy.android.ui.cart.clicklisteners.e$b$b */
        public static final class C9278b extends C9276b {

            /* renamed from: a */
            public final C9275a f20493a;

            /* renamed from: b */
            public final String f20494b;

            public C9278b(C9275a aVar, String str) {
                C19383o.m32797g(aVar, "specs");
                this.f20493a = aVar;
                this.f20494b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9278b)) {
                    return false;
                }
                C9278b bVar = (C9278b) obj;
                return C19383o.m32792b(this.f20493a, bVar.f20493a) && C19383o.m32792b(this.f20494b, bVar.f20494b);
            }

            public final int hashCode() {
                int hashCode = this.f20493a.hashCode() * 31;
                String str = this.f20494b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Error(specs=");
                h.append(this.f20493a);
                h.append(", error=");
                return C0391c.m1057c(h, this.f20494b, ')');
            }
        }

        /* renamed from: com.etsy.android.ui.cart.clicklisteners.e$b$c */
        public static final class C9279c extends C9276b {

            /* renamed from: a */
            public static final C9279c f20495a = new C9279c();
        }

        /* renamed from: com.etsy.android.ui.cart.clicklisteners.e$b$d */
        public static final class C9280d extends C9276b {

            /* renamed from: a */
            public final C9275a f20496a;

            /* renamed from: b */
            public final String f20497b;

            public C9280d(C9275a aVar, String str) {
                C19383o.m32797g(aVar, "specs");
                C19383o.m32797g(str, "coupon");
                this.f20496a = aVar;
                this.f20497b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9280d)) {
                    return false;
                }
                C9280d dVar = (C9280d) obj;
                return C19383o.m32792b(this.f20496a, dVar.f20496a) && C19383o.m32792b(this.f20497b, dVar.f20497b);
            }

            public final int hashCode() {
                return this.f20497b.hashCode() + (this.f20496a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Submitting(specs=");
                h.append(this.f20496a);
                h.append(", coupon=");
                return C0391c.m1057c(h, this.f20497b, ')');
            }
        }
    }

    public C9274e(C9420x xVar, C13461f fVar) {
        this.f20484a = xVar;
        this.f20485b = fVar;
    }

    /* renamed from: a */
    public final void mo31606a() {
        this.f20486c.mo19405d();
        CollageBottomSheet collageBottomSheet = this.f20487d;
        if (collageBottomSheet != null) {
            collageBottomSheet.setOnDismissListener((DialogInterface.OnDismissListener) null);
            if (collageBottomSheet.isShowing()) {
                collageBottomSheet.dismiss();
            }
        }
        this.f20487d = null;
        this.f20489f = null;
    }

    /* renamed from: b */
    public final void mo31607b(String str) {
        C9276b bVar = this.f20488e;
        if (bVar instanceof C9276b.C9280d) {
            mo31609d(new C9276b.C9278b(((C9276b.C9280d) bVar).f20496a, str));
        }
    }

    /* renamed from: c */
    public final void mo31608c(String str) {
        C9276b bVar = this.f20488e;
        if (bVar instanceof C9276b.C9277a) {
            mo31609d(new C9276b.C9280d(((C9276b.C9277a) bVar).f20492a, str));
        } else if (bVar instanceof C9276b.C9278b) {
            mo31609d(new C9276b.C9280d(((C9276b.C9278b) bVar).f20493a, str));
        }
    }

    /* renamed from: d */
    public final void mo31609d(C9276b bVar) {
        CollageTextInput collageTextInput;
        ProgressButton progressButton;
        CollageTextInput collageTextInput2;
        ProgressButton progressButton2;
        ProgressButton progressButton3;
        CollageTextInput collageTextInput3;
        this.f20488e = bVar;
        this.f20486c.mo19405d();
        C9276b bVar2 = this.f20488e;
        if (bVar2 instanceof C9276b.C9277a) {
            CollageBottomSheet collageBottomSheet = this.f20487d;
            if (!(collageBottomSheet == null || (collageTextInput3 = (CollageTextInput) collageBottomSheet.findViewById(R.id.coupon_input)) == null)) {
                collageTextInput3.setEnabled(true);
                collageTextInput3.setText((String) null);
                collageTextInput3.setErrorText((String) null);
                collageTextInput3.requestFocus();
            }
            CollageBottomSheet collageBottomSheet2 = this.f20487d;
            if (collageBottomSheet2 != null && (progressButton3 = (ProgressButton) collageBottomSheet2.findViewById(R.id.btn_apply)) != null) {
                progressButton3.hideLoading();
                progressButton3.setEnabled(false);
            }
        } else if (bVar2 instanceof C9276b.C9280d) {
            CollageBottomSheet collageBottomSheet3 = this.f20487d;
            if (!(collageBottomSheet3 == null || (progressButton2 = (ProgressButton) collageBottomSheet3.findViewById(R.id.btn_apply)) == null)) {
                progressButton2.showLoading();
            }
            CollageBottomSheet collageBottomSheet4 = this.f20487d;
            if (!(collageBottomSheet4 == null || (collageTextInput2 = (CollageTextInput) collageBottomSheet4.findViewById(R.id.coupon_input)) == null)) {
                collageTextInput2.setEnabled(true);
                collageTextInput2.setErrorText((String) null);
                collageTextInput2.clearFocus();
            }
            C9276b.C9280d dVar = (C9276b.C9280d) bVar2;
            C9275a aVar = dVar.f20496a;
            C9334s sVar = aVar.f20490a;
            ServerDrivenAction serverDrivenAction = aVar.f20491b;
            serverDrivenAction.addParam("coupon_code", dVar.f20497b);
            String path = serverDrivenAction.getPath();
            C19383o.m32796f(path, "action.path");
            boolean z = sVar.f20608b;
            boolean z2 = sVar.f20609c;
            EtsyAssociativeArray etsyAssociativeArray = sVar.f20610d;
            String str = sVar.f20611e;
            C19383o.m32797g(str, "requestMethod");
            ConsumerSingleObserver g = C0391c.m1056b(this.f20485b, C0326j.m860e(this.f20485b, this.f20484a.mo31850b(new C9334s(path, z, z2, etsyAssociativeArray, str)))).mo20658g(new C6331b(this, 2), new C6332c(this, 4));
            C7091a aVar2 = this.f20486c;
            C19383o.m32798h(aVar2, "compositeDisposable");
            aVar2.mo19403b(g);
        } else if (bVar2 instanceof C9276b.C9278b) {
            String str2 = ((C9276b.C9278b) bVar2).f20494b;
            CollageBottomSheet collageBottomSheet5 = this.f20487d;
            if (!(collageBottomSheet5 == null || (progressButton = (ProgressButton) collageBottomSheet5.findViewById(R.id.btn_apply)) == null)) {
                progressButton.hideLoading();
            }
            CollageBottomSheet collageBottomSheet6 = this.f20487d;
            if (collageBottomSheet6 != null && (collageTextInput = (CollageTextInput) collageBottomSheet6.findViewById(R.id.coupon_input)) != null) {
                collageTextInput.setEnabled(true);
                if (str2 == null) {
                    collageTextInput.setErrorText(collageTextInput.getContext().getString(R.string.whoops_somethings_wrong));
                } else {
                    collageTextInput.setErrorText(str2);
                }
                collageTextInput.requestFocus();
            }
        }
    }

    /* renamed from: e */
    public final void mo31610e(FragmentActivity fragmentActivity, C9275a aVar, C19857l lVar) {
        this.f20489f = lVar;
        CollageBottomSheet collageBottomSheet = new CollageBottomSheet(fragmentActivity, R.style.BottomSheetNoFloating);
        collageBottomSheet.setContentView((int) R.layout.view_cart_add_shop_coupon_bottom_sheet);
        collageBottomSheet.setPopover(true);
        View findViewById = collageBottomSheet.findViewById(R.id.btn_apply);
        C19383o.m32794d(findViewById);
        ProgressButton progressButton = (ProgressButton) findViewById;
        progressButton.setEnabled(false);
        View findViewById2 = collageBottomSheet.findViewById(R.id.coupon_input);
        C19383o.m32794d(findViewById2);
        CollageTextInput collageTextInput = (CollageTextInput) findViewById2;
        collageTextInput.setTextChangeListener(new AddShopCouponWorkflow$start$1$textInput$1$1(progressButton));
        collageTextInput.setInputType(RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT);
        collageTextInput.setImeOptions(6);
        collageTextInput.setOnEditorActionListener(new C9270a(this, collageTextInput));
        ViewExtensions.m12866j(progressButton, new AddShopCouponWorkflow$start$1$2(this, collageTextInput));
        collageBottomSheet.setOnShowListener(new C9271b(collageBottomSheet, collageTextInput));
        this.f20487d = collageBottomSheet;
        mo31609d(new C9276b.C9277a(aVar));
        CollageBottomSheet collageBottomSheet2 = this.f20487d;
        if (collageBottomSheet2 != null) {
            collageBottomSheet2.setOnDismissListener((DialogInterface.OnDismissListener) null);
            collageBottomSheet2.dismiss();
            collageBottomSheet2.show();
            collageBottomSheet2.setOnDismissListener(new C9273d(this));
        }
    }
}
