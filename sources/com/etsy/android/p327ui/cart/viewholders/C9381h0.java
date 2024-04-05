package com.etsy.android.p327ui.cart.viewholders;

import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.Country;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.PaymentUpdateShippingCountry;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.lib.util.C8902h;
import com.etsy.android.p327ui.cart.clicklisteners.C9282g;
import com.etsy.android.p327ui.listing.shipping.PostalCodeTextWatcher;
import com.etsy.android.stylekit.views.CollageHeadingTextView;
import com.etsy.android.uikit.EtsySpinnerArrayAdapterWithClickListener;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p309ad.C8504a;
import p309ad.C8505b;
import p309ad.C8508d;
import p309ad.C8509e;

/* renamed from: com.etsy.android.ui.cart.viewholders.h0 */
public final class C9381h0 extends C9370c {

    /* renamed from: c */
    public final Spinner f20769c;

    /* renamed from: d */
    public final Button f20770d = ((Button) mo38986f(R.id.btn_calc_shipping));

    /* renamed from: e */
    public final CollageHeadingTextView f20771e = ((CollageHeadingTextView) mo38986f(R.id.ship_to_label));

    /* renamed from: f */
    public EditText f20772f = ((EditText) mo38986f(R.id.txt_postal_code));

    /* renamed from: g */
    public C9282g f20773g;

    /* renamed from: h */
    public C9379g0 f20774h;

    /* renamed from: i */
    public C8509e f20775i;

    /* renamed from: j */
    public C8508d f20776j;

    /* renamed from: k */
    public PostalCodeTextWatcher f20777k;

    /* renamed from: l */
    public C8672b f20778l;

    /* renamed from: com.etsy.android.ui.cart.viewholders.h0$a */
    public class C9382a implements View.OnClickListener {
        public C9382a() {
        }

        public final void onClick(View view) {
            C9381h0.this.f20770d.setVisibility(8);
            C9381h0.this.f20771e.setVisibility(0);
            C9381h0.this.f20769c.setVisibility(0);
            Country country = (Country) C9381h0.this.f20769c.getSelectedItem();
            if (country != null) {
                C9381h0.this.mo31833i(country.getIsoCountryCode());
            }
        }
    }

    /* renamed from: com.etsy.android.ui.cart.viewholders.h0$b */
    public class C9383b implements View.OnFocusChangeListener {
        public C9383b() {
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                EditText editText = C9381h0.this.f20772f;
                editText.setSelection(editText.getText().length());
            }
        }
    }

    /* renamed from: com.etsy.android.ui.cart.viewholders.h0$c */
    public class C9384c implements TextView.OnEditorActionListener {

        /* renamed from: b */
        public final /* synthetic */ CartGroupItem f20781b;

        public C9384c(CartGroupItem cartGroupItem) {
            this.f20781b = cartGroupItem;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 0) {
                return false;
            }
            ServerDrivenAction action = this.f20781b.getAction(ServerDrivenAction.TYPE_UPDATE_SHIPPING_DESTINATION);
            if (action != null) {
                C9381h0 h0Var = C9381h0.this;
                if (h0Var.f20773g != null) {
                    action.addParam(ResponseConstants.COUNTRY_ID, String.valueOf(((Country) h0Var.f20769c.getSelectedItem()).getCountryId()));
                    action.addParam(ResponseConstants.ZIP, textView.getText().toString());
                    C9381h0 h0Var2 = C9381h0.this;
                    h0Var2.f20773g.mo45936d(h0Var2.itemView, action);
                    C8672b bVar = C9381h0.this.f20778l;
                    if (bVar != null) {
                        bVar.mo21333d("cart_shipping_estimate_updated", (Map<? extends AnalyticsProperty, Object>) null);
                    }
                }
            }
            textView.clearFocus();
            C15588c1.m25340p0(textView);
            return true;
        }
    }

    /* renamed from: com.etsy.android.ui.cart.viewholders.h0$d */
    public class C9385d implements EtsySpinnerArrayAdapterWithClickListener.C11828b<Country> {

        /* renamed from: a */
        public final /* synthetic */ CartGroupItem f20783a;

        /* renamed from: b */
        public final /* synthetic */ int f20784b;

        public C9385d(CartGroupItem cartGroupItem, int i) {
            this.f20783a = cartGroupItem;
            this.f20784b = i;
        }
    }

    public C9381h0(ViewGroup viewGroup, C9282g gVar, C8703p pVar) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_msco_update_shipping_country, viewGroup, false));
        this.f20773g = gVar;
        this.f20778l = pVar;
        Spinner spinner = (Spinner) mo38986f(R.id.countries);
        this.f20769c = spinner;
        this.f20774h = new C9379g0(this.itemView.getContext(), spinner);
    }

    /* renamed from: g */
    public final void mo31413g(CartGroupItem cartGroupItem) {
        Country country;
        this.f20770d.setOnClickListener(new C9382a());
        PaymentUpdateShippingCountry paymentUpdateShippingCountry = (PaymentUpdateShippingCountry) cartGroupItem.getData();
        this.f20772f.setOnFocusChangeListener(new C9383b());
        this.f20772f.setOnEditorActionListener(new C9384c(cartGroupItem));
        ArrayList arrayList = new ArrayList();
        List<Integer> preferredCountries = paymentUpdateShippingCountry.getPreferredCountries();
        List<Integer> allCountryIds = paymentUpdateShippingCountry.getAllCountryIds();
        int destinationCountryId = paymentUpdateShippingCountry.getDestinationCountryId();
        Object obj = C8902h.f19658a;
        int i = 0;
        for (Integer next : preferredCountries) {
            Country b = C8902h.m17340b(next);
            if (b != null) {
                if (next.intValue() == destinationCountryId) {
                    i = arrayList.size();
                }
                arrayList.add(b);
            }
        }
        for (Integer next2 : allCountryIds) {
            Country b2 = C8902h.m17340b(next2);
            if (b2 != null) {
                if (i == 0 && next2.intValue() == destinationCountryId) {
                    i = arrayList.size();
                }
                arrayList.add(b2);
            }
        }
        int destinationCountryId2 = paymentUpdateShippingCountry.getDestinationCountryId();
        try {
            country = (Country) arrayList.get(i);
        } catch (IndexOutOfBoundsException unused) {
            country = null;
        }
        if (country != null) {
            this.f20770d.setVisibility(8);
            this.f20771e.setVisibility(0);
            this.f20769c.setVisibility(0);
            mo31833i(country.getIsoCountryCode());
        }
        this.f20772f.setText(paymentUpdateShippingCountry.getPostalCode());
        this.f20774h.clear();
        this.f20774h.addAll(arrayList);
        this.f20774h.setOnItemClickListener(new C9385d(cartGroupItem, destinationCountryId2));
        this.f20769c.setSelection(i);
    }

    /* renamed from: i */
    public final void mo31833i(String str) {
        PostalCodeTextWatcher postalCodeTextWatcher;
        new C8505b();
        this.f20775i = C8505b.m16924b(str);
        C8508d a = C8505b.m16923a(str);
        this.f20776j = a;
        if (a != null) {
            this.f20772f.setInputType(a.mo21048l());
            this.f20772f.setHint(this.f20776j.mo21047j());
        }
        boolean z = true;
        int i = 0;
        if (this.f20775i != null) {
            this.f20772f.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f20775i.mo16e()), new InputFilter.AllCaps()});
        }
        EditText editText = this.f20772f;
        if (this.f20775i == null || this.f20776j == null) {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        editText.setVisibility(i);
        EditText editText2 = this.f20772f;
        C8504a aVar = null;
        if (!(editText2 == null || (postalCodeTextWatcher = this.f20777k) == null)) {
            editText2.removeTextChangedListener(postalCodeTextWatcher);
            this.f20777k = null;
        }
        PostalCodeTextWatcher postalCodeTextWatcher2 = new PostalCodeTextWatcher(this.f20772f);
        this.f20777k = postalCodeTextWatcher2;
        if (C19383o.m32792b(str, "CA")) {
            new C0114h
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007e: CONSTRUCTOR  (r1v4 ? I:androidx.activity.h) =  call: androidx.activity.h.<init>():void type: CONSTRUCTOR in method: com.etsy.android.ui.cart.viewholders.h0.i(java.lang.String):void, dex: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v4 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                this = this;
                ad.b r0 = new ad.b
                r0.<init>()
                ad.e r0 = p309ad.C8505b.m16924b(r7)
                r6.f20775i = r0
                ad.d r0 = p309ad.C8505b.m16923a(r7)
                r6.f20776j = r0
                if (r0 == 0) goto L_0x0027
                android.widget.EditText r1 = r6.f20772f
                int r0 = r0.mo21048l()
                r1.setInputType(r0)
                android.widget.EditText r0 = r6.f20772f
                ad.d r1 = r6.f20776j
                int r1 = r1.mo21047j()
                r0.setHint(r1)
            L_0x0027:
                ad.e r0 = r6.f20775i
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0049
                android.widget.EditText r0 = r6.f20772f
                r3 = 2
                android.text.InputFilter[] r3 = new android.text.InputFilter[r3]
                android.text.InputFilter$LengthFilter r4 = new android.text.InputFilter$LengthFilter
                ad.e r5 = r6.f20775i
                int r5 = r5.mo16e()
                r4.<init>(r5)
                r3[r2] = r4
                android.text.InputFilter$AllCaps r4 = new android.text.InputFilter$AllCaps
                r4.<init>()
                r3[r1] = r4
                r0.setFilters(r3)
            L_0x0049:
                android.widget.EditText r0 = r6.f20772f
                ad.e r3 = r6.f20775i
                if (r3 == 0) goto L_0x0054
                ad.d r3 = r6.f20776j
                if (r3 == 0) goto L_0x0054
                goto L_0x0055
            L_0x0054:
                r1 = r2
            L_0x0055:
                if (r1 == 0) goto L_0x0058
                goto L_0x005a
            L_0x0058:
                r2 = 8
            L_0x005a:
                r0.setVisibility(r2)
                android.widget.EditText r0 = r6.f20772f
                r1 = 0
                if (r0 == 0) goto L_0x006b
                com.etsy.android.ui.listing.shipping.PostalCodeTextWatcher r2 = r6.f20777k
                if (r2 == 0) goto L_0x006b
                r0.removeTextChangedListener(r2)
                r6.f20777k = r1
            L_0x006b:
                com.etsy.android.ui.listing.shipping.PostalCodeTextWatcher r0 = new com.etsy.android.ui.listing.shipping.PostalCodeTextWatcher
                android.widget.EditText r2 = r6.f20772f
                r0.<init>(r2)
                r6.f20777k = r0
                java.lang.String r2 = "CA"
                boolean r7 = kotlin.jvm.internal.C19383o.m32792b(r7, r2)
                if (r7 == 0) goto L_0x0081
                androidx.activity.h r1 = new androidx.activity.h
                r1.<init>()
            L_0x0081:
                r0.setPostalCodeFormatter(r1)
                android.widget.EditText r7 = r6.f20772f
                com.etsy.android.ui.listing.shipping.PostalCodeTextWatcher r0 = r6.f20777k
                r7.addTextChangedListener(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.cart.viewholders.C9381h0.mo31833i(java.lang.String):void");
        }
    }
