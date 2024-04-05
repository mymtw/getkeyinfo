package com.cardinalcommerce.shared.p065cs.userinterfaces;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.C3039b;
import com.cardinalcommerce.cardinalmobilesdk.p045a.p047c.C6139d;
import com.cardinalcommerce.emvco.p063a.p064e.C6260c;
import com.cardinalcommerce.shared.models.enums.ButtonType;
import com.cardinalcommerce.shared.p065cs.p069e.C6272b;
import com.cardinalcommerce.shared.p065cs.p069e.C6273f;
import com.cardinalcommerce.shared.p065cs.p069e.C6275h;
import com.cardinalcommerce.shared.p065cs.p070f.C6297o;
import com.cardinalcommerce.shared.p065cs.p071g.C6298a;
import com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.C6319a;
import com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.C6322b;
import com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.C6323c;
import com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCAButton;
import com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCAEditText;
import com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCAImageView;
import com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCARadioGroup;
import com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCATextView;
import com.cardinalcommerce.shared.userinterfaces.LabelCustomization;
import com.cardinalcommerce.shared.userinterfaces.TextBoxCustomization;
import com.cardinalcommerce.shared.userinterfaces.UiCustomization;
import com.etsy.android.R;
import java.util.ArrayList;
import java.util.List;
import p237s8.C7906b;
import p247t8.C8045c;
import p247t8.C8046d;
import p257u8.C8171a;
import p257u8.C8172b;
import p257u8.C8178g;

/* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView */
public class ChallengeNativeView extends AppCompatActivity implements C7906b {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public String f14017A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public Context f14018B;

    /* renamed from: a */
    public BroadcastReceiver f14019a = new C6308c();

    /* renamed from: b */
    private Toolbar f14020b;

    /* renamed from: c */
    private CCAImageView f14021c;

    /* renamed from: d */
    private CCAImageView f14022d;

    /* renamed from: e */
    private CCAImageView f14023e;

    /* renamed from: f */
    private CCATextView f14024f;

    /* renamed from: g */
    private CCATextView f14025g;

    /* renamed from: h */
    private CCATextView f14026h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public CCAEditText f14027i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public CCAButton f14028j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public CCAButton f14029k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public CCATextView f14030l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public CCATextView f14031m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public CCATextView f14032n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public CCATextView f14033o;

    /* renamed from: p */
    private CCATextView f14034p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C6319a f14035q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ProgressBar f14036r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C8045c f14037s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C6272b f14038t;

    /* renamed from: u */
    private UiCustomization f14039u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public String f14040v = "";
    /* access modifiers changed from: private */

    /* renamed from: w */
    public ArrayList<C6275h> f14041w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public CCARadioGroup f14042x;

    /* renamed from: y */
    private List<C6319a> f14043y;

    /* renamed from: z */
    private boolean f14044z = false;

    /* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView$a */
    public class C6306a implements Runnable {
        public C6306a() {
        }

        public final void run() {
            if (ChallengeNativeView.this.f14029k != null && ChallengeNativeView.this.m12740j()) {
                ChallengeNativeView.this.f14029k.setEnabled(true);
            }
            if (ChallengeNativeView.this.f14017A.equals("01")) {
                ChallengeNativeView.this.f14027i.setFocusable(true);
            }
            ChallengeNativeView.this.f14036r.setVisibility(8);
            ChallengeNativeView.this.f14028j.setEnabled(true);
        }
    }

    /* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView$b */
    public class C6307b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C6272b f14046b;

        public C6307b(C6272b bVar) {
            this.f14046b = bVar;
        }

        public final void run() {
            ChallengeNativeView.this.m12721b(this.f14046b);
            ChallengeNativeView.this.m12738i();
        }
    }

    /* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView$c */
    public class C6308c extends BroadcastReceiver {
        public C6308c() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("finish_activity")) {
                C6297o b = C6297o.m12685b(ChallengeNativeView.this.getApplicationContext());
                C6260c cVar = b.f13997k;
                if (cVar != null) {
                    cVar.cancel(true);
                }
                C6139d dVar = b.f13998l;
                if (dVar != null) {
                    dVar.cancel(true);
                }
                ChallengeNativeView.this.finish();
            }
        }
    }

    /* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView$d */
    public class C6309d implements C6323c.C6324a {
        public C6309d() {
        }

        public final void onClick(View view) {
            CCATextView cCATextView;
            int i;
            if (ChallengeNativeView.this.f14031m.getVisibility() == 0) {
                ChallengeNativeView.this.f14031m.setVisibility(8);
                cCATextView = ChallengeNativeView.this.f14030l;
                i = R.drawable.plus;
            } else {
                ChallengeNativeView.this.f14031m.setVisibility(0);
                cCATextView = ChallengeNativeView.this.f14030l;
                i = R.drawable.minus;
            }
            cCATextView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, i, 0);
        }
    }

    /* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView$e */
    public class C6310e implements C6323c.C6324a {
        public C6310e() {
        }

        public final void onClick(View view) {
            CCATextView cCATextView;
            int i;
            if (ChallengeNativeView.this.f14033o.getVisibility() == 0) {
                ChallengeNativeView.this.f14033o.setVisibility(8);
                cCATextView = ChallengeNativeView.this.f14032n;
                i = R.drawable.plus;
            } else {
                ChallengeNativeView.this.f14033o.setVisibility(0);
                cCATextView = ChallengeNativeView.this.f14032n;
                i = R.drawable.minus;
            }
            cCATextView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, i, 0);
        }
    }

    /* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView$f */
    public class C6311f implements C6323c.C6325b {

        /* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView$f$a */
        public class C6312a implements Runnable {
            public C6312a() {
            }

            public final void run() {
                InputMethodManager inputMethodManager = (InputMethodManager) ChallengeNativeView.this.f14018B.getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(ChallengeNativeView.this.f14027i, 1);
                }
            }
        }

        public C6311f() {
        }

        public final void onFocusChange(View view, boolean z) {
            if (z && ChallengeNativeView.this.f14027i.isEnabled() && ChallengeNativeView.this.f14027i.isFocusable()) {
                ChallengeNativeView.this.f14027i.post(new C6312a());
            }
        }
    }

    /* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView$g */
    public class C6313g implements C6323c.C6324a {
        public final void onClick(View view) {
        }
    }

    /* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView$h */
    public class C6314h implements C6323c.C6324a {
        public C6314h() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r5) {
            /*
                r4 = this;
                t8.d r5 = new t8.d
                r5.<init>()
                com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.this
                java.lang.String r0 = r0.f14017A
                r0.getClass()
                int r1 = r0.hashCode()
                r2 = 1
                r3 = -1
                switch(r1) {
                    case 1537: goto L_0x003a;
                    case 1538: goto L_0x002f;
                    case 1539: goto L_0x0024;
                    case 1540: goto L_0x0019;
                    default: goto L_0x0017;
                }
            L_0x0017:
                r0 = r3
                goto L_0x0044
            L_0x0019:
                java.lang.String r1 = "04"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0022
                goto L_0x0017
            L_0x0022:
                r0 = 3
                goto L_0x0044
            L_0x0024:
                java.lang.String r1 = "03"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x002d
                goto L_0x0017
            L_0x002d:
                r0 = 2
                goto L_0x0044
            L_0x002f:
                java.lang.String r1 = "02"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0038
                goto L_0x0017
            L_0x0038:
                r0 = r2
                goto L_0x0044
            L_0x003a:
                java.lang.String r1 = "01"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0043
                goto L_0x0017
            L_0x0043:
                r0 = 0
            L_0x0044:
                java.lang.String r1 = ""
                switch(r0) {
                    case 0: goto L_0x00d2;
                    case 1: goto L_0x0079;
                    case 2: goto L_0x004f;
                    case 3: goto L_0x004b;
                    default: goto L_0x0049;
                }
            L_0x0049:
                goto L_0x0111
            L_0x004b:
                r5.f17562d = r2
                goto L_0x0111
            L_0x004f:
                com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.this
                java.lang.String r0 = r0.m12731f()
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x0069
                com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.this
                java.lang.String r0 = r0.m12731f()
                char[] r0 = androidx.preference.C3039b.m7190y(r0)
                r5.f17560b = r0
                goto L_0x0111
            L_0x0069:
                com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.this
                boolean r0 = r0.m12742k()
                if (r0 == 0) goto L_0x0111
                char[] r0 = androidx.preference.C3039b.m7190y(r1)
                r5.f17560b = r0
                goto L_0x0111
            L_0x0079:
                com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.this
                com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCARadioGroup r0 = r0.f14042x
                if (r0 == 0) goto L_0x00c3
                com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.this
                com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCARadioGroup r0 = r0.f14042x
                int r0 = r0.getCheckedCCARadioButtonId()
                if (r0 == r3) goto L_0x00c3
                com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.this
                java.util.ArrayList r1 = r0.f14041w
                com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r2 = com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.this
                com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCARadioGroup r2 = r2.f14042x
                int r2 = r2.getCheckedCCARadioButtonId()
                java.lang.Object r1 = r1.get(r2)
                com.cardinalcommerce.shared.cs.e.h r1 = (com.cardinalcommerce.shared.p065cs.p069e.C6275h) r1
                java.lang.String r1 = r1.mo17800a()
                java.lang.String unused = r0.f14040v = r1
                com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.this
                java.lang.String r0 = r0.f14040v
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x0111
                com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.this
                java.lang.String r0 = r0.f14040v
                char[] r0 = androidx.preference.C3039b.m7190y(r0)
                r5.f17560b = r0
                goto L_0x0111
            L_0x00c3:
                com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.this
                boolean r0 = r0.m12742k()
                if (r0 == 0) goto L_0x0111
                char[] r0 = androidx.preference.C3039b.m7190y(r1)
                r5.f17560b = r0
                goto L_0x0111
            L_0x00d2:
                com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.this
                com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAEditText r0 = r0.f14027i
                java.lang.CharSequence r0 = r0.getCCAText()
                if (r0 == 0) goto L_0x0103
                com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.this
                com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAEditText r0 = r0.f14027i
                java.lang.CharSequence r0 = r0.getCCAText()
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0103
                com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.this
                com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAEditText r0 = r0.f14027i
                java.lang.CharSequence r0 = r0.getCCAText()
                java.lang.String r0 = r0.toString()
                char[] r0 = androidx.preference.C3039b.m7190y(r0)
                r5.f17560b = r0
                goto L_0x0111
            L_0x0103:
                com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.this
                boolean r0 = r0.m12742k()
                if (r0 == 0) goto L_0x0111
                char[] r0 = androidx.preference.C3039b.m7190y(r1)
                r5.f17560b = r0
            L_0x0111:
                com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.this
                com.cardinalcommerce.shared.cs.e.b r0 = r0.f14038t
                java.lang.String r0 = r0.mo17769A()
                if (r0 == 0) goto L_0x014a
                com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.this
                com.cardinalcommerce.shared.cs.e.b r0 = r0.f14038t
                java.lang.String r0 = r0.mo17769A()
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x014a
                com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.this
                com.cardinalcommerce.shared.cs.userinterfaces.uielements.a r0 = r0.f14035q
                if (r0 == 0) goto L_0x0146
                com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.this
                com.cardinalcommerce.shared.cs.userinterfaces.uielements.a r0 = r0.f14035q
                int r0 = r0.getCheckState()
                if (r0 == 0) goto L_0x0146
                char[] r0 = p257u8.C8171a.f17931d
                r5.f17564f = r0
                goto L_0x014a
            L_0x0146:
                char[] r0 = p257u8.C8171a.f17932e
                r5.f17564f = r0
            L_0x014a:
                com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.this
                t8.c r1 = new t8.c
                com.cardinalcommerce.shared.cs.e.b r2 = r0.f14038t
                r1.<init>(r2, r5)
                p247t8.C8045c unused = r0.f14037s = r1
                com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r5 = com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.this
                t8.c r0 = r5.f14037s
                r5.m12719a((p247t8.C8045c) r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.C6314h.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView$i */
    public class C6315i implements C6323c.C6324a {
        public C6315i() {
        }

        public final void onClick(View view) {
            C8046d dVar = new C8046d();
            dVar.f17563e = C3039b.m7190y("Y");
            ChallengeNativeView challengeNativeView = ChallengeNativeView.this;
            C8045c unused = challengeNativeView.f14037s = new C8045c(challengeNativeView.f14038t, dVar);
            ChallengeNativeView challengeNativeView2 = ChallengeNativeView.this;
            challengeNativeView2.m12719a(challengeNativeView2.f14037s);
        }
    }

    /* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView$j */
    public class C6316j implements C6323c.C6324a {
        public C6316j() {
        }

        public final void onClick(View view) {
            ChallengeNativeView.this.m12730e();
        }
    }

    /* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView$k */
    public class C6317k implements Runnable {
        public C6317k() {
        }

        public final void run() {
            if (ChallengeNativeView.this.f14029k != null && ChallengeNativeView.this.m12740j()) {
                ChallengeNativeView.this.f14029k.setEnabled(false);
            }
            if (ChallengeNativeView.this.f14017A.equals("01")) {
                ChallengeNativeView.this.f14027i.setFocusable(false);
            }
            ChallengeNativeView.this.f14028j.setEnabled(false);
            ChallengeNativeView.this.f14036r.setVisibility(0);
        }
    }

    /* renamed from: a */
    private void m12714a(C6273f fVar, CCAImageView cCAImageView) {
        if (fVar != null) {
            String a = fVar.mo17796a(this);
            if (a != null && a.trim().length() > 0) {
                new C6298a(cCAImageView, a).execute(new String[0]);
                return;
            }
            return;
        }
        cCAImageView.setVisibility(4);
    }

    /* renamed from: a */
    private void m12716a(C6319a aVar) {
        aVar.setCCAOnClickListener(new C6313g());
    }

    /* renamed from: a */
    private void m12717a(UiCustomization uiCustomization) {
        Typeface a;
        Typeface a2;
        if (uiCustomization != null) {
            if (!this.f14017A.equals("04")) {
                C8178g.m16454f(this.f14026h, uiCustomization, this);
                if (m12740j()) {
                    m12723b(uiCustomization);
                }
                if (this.f14017A.equals("01")) {
                    CCAEditText cCAEditText = this.f14027i;
                    if (uiCustomization.getTextBoxCustomization() != null) {
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        int i = 1;
                        int color = getResources().getColor(R.color.edit_text_border_unselected);
                        int i2 = 2;
                        TextBoxCustomization textBoxCustomization = uiCustomization.getTextBoxCustomization();
                        if (textBoxCustomization != null) {
                            if (textBoxCustomization.getBorderWidth() > 0) {
                                i = textBoxCustomization.getBorderWidth();
                            }
                            if (textBoxCustomization.getBorderColor() != null && !textBoxCustomization.getBorderColor().isEmpty()) {
                                color = Color.parseColor(textBoxCustomization.getBorderColor());
                            }
                            if (textBoxCustomization.getCornerRadius() > 0) {
                                i2 = textBoxCustomization.getCornerRadius();
                            }
                            gradientDrawable.setStroke(i, color);
                            gradientDrawable.setCornerRadius((float) i2);
                            cCAEditText.setBackground(gradientDrawable);
                            if (textBoxCustomization.getTextColor() != null) {
                                cCAEditText.setTextColor(Color.parseColor(textBoxCustomization.getTextColor()));
                            }
                            if (textBoxCustomization.getTextFontSize() > 0) {
                                cCAEditText.setTextSize((float) textBoxCustomization.getTextFontSize());
                            }
                            if (!(textBoxCustomization.getTextFontName() == null || (a2 = C8178g.m16449a(this, textBoxCustomization.getTextFontName())) == null)) {
                                cCAEditText.setTypeface(a2);
                            }
                        }
                    } else {
                        cCAEditText.setBackgroundResource(R.drawable.edit_text_border);
                        cCAEditText.setTextColor(getResources().getColor(R.color.edit_text_default_color));
                    }
                }
            }
            C8178g.m16452d(this.f14034p, uiCustomization, this);
            if (m12740j()) {
                m12723b(uiCustomization);
            }
            CCATextView cCATextView = this.f14024f;
            if (uiCustomization.getLabelCustomization() != null) {
                LabelCustomization labelCustomization = uiCustomization.getLabelCustomization();
                if (labelCustomization.getHeadingTextFontSize() > 0) {
                    cCATextView.setTextSize((float) labelCustomization.getHeadingTextFontSize());
                }
                if (labelCustomization.getHeadingTextColor() != null) {
                    cCATextView.setTextColor(Color.parseColor(labelCustomization.getHeadingTextColor()));
                }
                if (!(labelCustomization.getHeadingTextFontName() == null || (a = C8178g.m16449a(this, labelCustomization.getHeadingTextFontName())) == null)) {
                    cCATextView.setTypeface(a);
                }
            }
            C8178g.m16454f(this.f14025g, uiCustomization, this);
            C8178g.m16454f(this.f14030l, uiCustomization, this);
            C8178g.m16454f(this.f14031m, uiCustomization, this);
            C8178g.m16454f(this.f14032n, uiCustomization, this);
            C8178g.m16454f(this.f14033o, uiCustomization, this);
            m12726c(uiCustomization);
            C8178g.m16450b(this.f14020b, uiCustomization, this);
        }
    }

    /* renamed from: a */
    private void m12718a(ArrayList<C6275h> arrayList) {
        this.f14041w = arrayList;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.multiSelectgroup);
        linearLayout.removeAllViews();
        this.f14043y = new ArrayList();
        for (int i = 0; i < 1; i++) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                C6319a aVar = new C6319a(this);
                aVar.setCCAText(this.f14041w.get(i2).mo17801b());
                aVar.setCCAId(i2);
                UiCustomization uiCustomization = this.f14039u;
                if (uiCustomization != null) {
                    C8178g.m16453e(aVar, uiCustomization, this);
                }
                this.f14043y.add(aVar);
                m12716a(aVar);
                linearLayout.addView(aVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12719a(C8045c cVar) {
        m12736h();
        C6297o.m12685b(getApplicationContext()).mo17852e(cVar, this, this.f14017A);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01de  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m12721b(com.cardinalcommerce.shared.p065cs.p069e.C6272b r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.mo17774e()
            int r1 = r0.hashCode()
            r2 = 2
            java.lang.String r3 = "04"
            r4 = 1
            r5 = 0
            switch(r1) {
                case 1537: goto L_0x002d;
                case 1538: goto L_0x0023;
                case 1539: goto L_0x0019;
                case 1540: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0037
        L_0x0011:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0037
            r0 = 3
            goto L_0x0038
        L_0x0019:
            java.lang.String r1 = "03"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0037
            r0 = r2
            goto L_0x0038
        L_0x0023:
            java.lang.String r1 = "02"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0037
            r0 = r4
            goto L_0x0038
        L_0x002d:
            java.lang.String r1 = "01"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0037
            r0 = r5
            goto L_0x0038
        L_0x0037:
            r0 = -1
        L_0x0038:
            if (r0 == 0) goto L_0x004f
            if (r0 == r4) goto L_0x0047
            if (r0 == r2) goto L_0x003f
            goto L_0x0065
        L_0x003f:
            java.util.ArrayList r0 = r7.mo17781l()
            r6.m12718a((java.util.ArrayList<com.cardinalcommerce.shared.p065cs.p069e.C6275h>) r0)
            goto L_0x0065
        L_0x0047:
            java.util.ArrayList r0 = r7.mo17781l()
            r6.m12724b((java.util.ArrayList<com.cardinalcommerce.shared.p065cs.p069e.C6275h>) r0)
            goto L_0x0065
        L_0x004f:
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAEditText r0 = r6.f14027i
            java.lang.String r1 = ""
            r0.setCCAText(r1)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAEditText r0 = r6.f14027i
            r0.setCCAFocusableInTouchMode(r4)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAEditText r0 = r6.f14027i
            com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView$f r1 = new com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView$f
            r1.<init>()
            r0.setCCAOnFocusChangeListener(r1)
        L_0x0065:
            com.cardinalcommerce.shared.cs.e.f r0 = r7.mo17784o()
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAImageView r1 = r6.f14021c
            r6.m12714a((com.cardinalcommerce.shared.p065cs.p069e.C6273f) r0, (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCAImageView) r1)
            com.cardinalcommerce.shared.cs.e.f r0 = r7.mo17788s()
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAImageView r1 = r6.f14022d
            r6.m12714a((com.cardinalcommerce.shared.p065cs.p069e.C6273f) r0, (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCAImageView) r1)
            java.lang.String r0 = r7.mo17769A()
            r1 = 2131430643(0x7f0b0cf3, float:1.8482993E38)
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = r7.mo17769A()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b5
            android.view.View r0 = r6.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.removeAllViews()
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.a r1 = new com.cardinalcommerce.shared.cs.userinterfaces.uielements.a
            r1.<init>(r6)
            r6.f14035q = r1
            com.cardinalcommerce.shared.userinterfaces.UiCustomization r2 = r6.f14039u
            if (r2 == 0) goto L_0x00a1
            p257u8.C8178g.m16453e(r1, r2, r6)
        L_0x00a1:
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.a r1 = r6.f14035q
            java.lang.String r2 = r7.mo17769A()
            r1.setCCAText(r2)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.a r1 = r6.f14035q
            r6.m12716a((com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.C6319a) r1)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.a r1 = r6.f14035q
            r0.addView(r1)
            goto L_0x00c1
        L_0x00b5:
            android.view.View r0 = r6.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.removeAllViews()
            r0.setPadding(r5, r5, r5, r5)
        L_0x00c1:
            java.lang.String r0 = r6.f14017A
            boolean r0 = r0.equals(r3)
            r1 = 8
            if (r0 != 0) goto L_0x010d
            java.lang.String r0 = r7.mo17778i()
            if (r0 == 0) goto L_0x00e5
            java.lang.String r0 = r7.mo17778i()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00e5
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r0 = r6.f14026h
            java.lang.String r2 = r7.mo17778i()
            r0.setCCAText(r2)
            goto L_0x00ea
        L_0x00e5:
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r0 = r6.f14026h
            r0.setVisibility(r1)
        L_0x00ea:
            boolean r0 = r6.m12740j()
            if (r0 == 0) goto L_0x00fe
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAButton r0 = r6.f14029k
            r0.setCCAVisibility(r5)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAButton r0 = r6.f14029k
            java.lang.String r2 = r7.mo17789t()
            r0.setCCAText(r2)
        L_0x00fe:
            java.lang.String r0 = r7.mo17791v()
            if (r0 == 0) goto L_0x010d
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAButton r0 = r6.f14028j
            java.lang.String r2 = r7.mo17791v()
            r0.setCCAText(r2)
        L_0x010d:
            java.lang.String r0 = r7.mo17787r()
            if (r0 == 0) goto L_0x0124
            java.lang.String r0 = r6.f14017A
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0124
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAButton r0 = r6.f14028j
            java.lang.String r2 = r7.mo17787r()
            r0.setCCAText(r2)
        L_0x0124:
            java.lang.String r0 = r7.mo17777h()
            if (r0 == 0) goto L_0x0134
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r0 = r6.f14024f
            java.lang.String r2 = r7.mo17777h()
            r0.setCCAText(r2)
            goto L_0x0139
        L_0x0134:
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r0 = r6.f14024f
            r0.setVisibility(r1)
        L_0x0139:
            java.lang.String r0 = r7.mo17779j()
            r2 = 4
            if (r0 == 0) goto L_0x014a
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r0 = r6.f14025g
            java.lang.String r3 = r7.mo17779j()
            r0.setCCAText(r3)
            goto L_0x014f
        L_0x014a:
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r0 = r6.f14025g
            r0.setVisibility(r2)
        L_0x014f:
            java.lang.String r0 = r7.mo17780k()
            if (r0 == 0) goto L_0x016f
            java.lang.String r0 = r7.mo17780k()
            java.lang.String r3 = "Y"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x016f
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAImageView r0 = r6.f14023e
            r1 = 2131232361(0x7f080669, float:1.808083E38)
            r0.setCCAImageResource(r1)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAImageView r0 = r6.f14023e
            r0.setVisibility(r5)
            goto L_0x0174
        L_0x016f:
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAImageView r0 = r6.f14023e
            r0.setVisibility(r1)
        L_0x0174:
            java.lang.String r0 = r7.mo17793x()
            r1 = 2131232211(0x7f0805d3, float:1.8080525E38)
            if (r0 == 0) goto L_0x01a8
            java.lang.String r0 = r7.mo17793x()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01a8
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r0 = r6.f14030l
            java.lang.String r3 = r7.mo17793x()
            r0.setCCAText(r3)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r0 = r6.f14030l
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r5, r5, r1, r5)
            java.lang.String r0 = r7.mo17794y()
            if (r0 == 0) goto L_0x01a5
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r0 = r6.f14031m
            java.lang.String r3 = r7.mo17794y()
            r0.setCCAText(r3)
            goto L_0x01ad
        L_0x01a5:
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r0 = r6.f14031m
            goto L_0x01aa
        L_0x01a8:
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r0 = r6.f14030l
        L_0x01aa:
            r0.setVisibility(r2)
        L_0x01ad:
            java.lang.String r0 = r7.mo17782m()
            if (r0 == 0) goto L_0x01de
            java.lang.String r0 = r7.mo17782m()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01de
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r0 = r6.f14032n
            java.lang.String r3 = r7.mo17782m()
            r0.setCCAText(r3)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r0 = r6.f14032n
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r5, r5, r1, r5)
            java.lang.String r0 = r7.mo17794y()
            if (r0 == 0) goto L_0x01db
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r0 = r6.f14033o
            java.lang.String r7 = r7.mo17783n()
            r0.setCCAText(r7)
            goto L_0x01e3
        L_0x01db:
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r7 = r6.f14033o
            goto L_0x01e0
        L_0x01de:
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r7 = r6.f14032n
        L_0x01e0:
            r7.setVisibility(r2)
        L_0x01e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.m12721b(com.cardinalcommerce.shared.cs.e.b):void");
    }

    /* renamed from: b */
    private void m12723b(UiCustomization uiCustomization) {
        if (this.f14029k != null) {
            ButtonType buttonType = ButtonType.RESEND;
            if (uiCustomization.getButtonCustomization(buttonType) == null) {
                this.f14029k.setTextColor(getResources().getColor(R.color.blue));
            } else {
                C8178g.m16451c(this.f14029k, uiCustomization.getButtonCustomization(buttonType), this);
            }
        }
    }

    /* renamed from: b */
    private void m12724b(ArrayList<C6275h> arrayList) {
        Typeface a;
        CCARadioGroup cCARadioGroup = (CCARadioGroup) findViewById(R.id.selectradiogroup);
        this.f14042x = cCARadioGroup;
        cCARadioGroup.removeAllViews();
        this.f14042x.setOrientation(1);
        this.f14041w = arrayList;
        for (int i = 0; i < this.f14041w.size(); i++) {
            C6322b bVar = new C6322b(this);
            bVar.setId(i);
            bVar.setCCAText(this.f14041w.get(i).mo17801b());
            UiCustomization uiCustomization = this.f14039u;
            C8172b bVar2 = C8178g.f17954a;
            if (uiCustomization.getLabelCustomization() != null) {
                LabelCustomization labelCustomization = uiCustomization.getLabelCustomization();
                if (labelCustomization.getTextFontSize() > 0) {
                    bVar.setTextSize((float) labelCustomization.getTextFontSize());
                }
                if (labelCustomization.getTextColor() != null) {
                    bVar.setTextColor(Color.parseColor(labelCustomization.getTextColor()));
                }
                if (!(labelCustomization.getTextFontName() == null || (a = C8178g.m16449a(this, labelCustomization.getTextFontName())) == null)) {
                    bVar.setTypeface(a);
                }
            }
            int[][] iArr = {new int[]{-16842912}, new int[]{16842912}};
            int[] iArr2 = new int[2];
            ButtonType buttonType = ButtonType.VERIFY;
            iArr2[0] = uiCustomization.getButtonCustomization(buttonType) != null ? Color.parseColor(uiCustomization.getButtonCustomization(buttonType).getBackgroundColor()) : getResources().getColor(R.color.blue);
            iArr2[1] = uiCustomization.getButtonCustomization(buttonType) != null ? Color.parseColor(uiCustomization.getButtonCustomization(buttonType).getBackgroundColor()) : getResources().getColor(R.color.blue);
            bVar.setButtonTintList(new ColorStateList(iArr, iArr2));
            this.f14042x.mo17921a((View) bVar);
        }
    }

    /* renamed from: c */
    private void m12726c(UiCustomization uiCustomization) {
        ButtonType buttonType = ButtonType.VERIFY;
        if (uiCustomization.getButtonCustomization(buttonType) == null) {
            this.f14028j.setBackgroundColor(getResources().getColor(R.color.blue));
            this.f14028j.setTextColor(getResources().getColor(R.color.colorWhite));
            return;
        }
        C8178g.m16451c(this.f14028j, uiCustomization.getButtonCustomization(buttonType), this);
    }

    /* renamed from: d */
    private void m12727d() {
        this.f14028j.setCCAOnClickListener(new C6314h());
        if (m12740j()) {
            this.f14029k.setCCAOnClickListener(new C6315i());
        }
        this.f14034p.setCCAOnClickListener(new C6316j());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m12730e() {
        C8046d dVar = new C8046d();
        dVar.f17559a = C8171a.f17933f;
        C8045c cVar = new C8045c(this.f14038t, dVar);
        this.f14037s = cVar;
        m12719a(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public String m12731f() {
        StringBuilder sb = new StringBuilder();
        for (C6319a next : this.f14043y) {
            if (next.getCheckState() == 1) {
                if (!sb.toString().isEmpty()) {
                    sb.append(",");
                    sb.append(this.f14041w.get(next.getCCAId()).mo17800a());
                } else {
                    sb = new StringBuilder(this.f14041w.get(next.getCCAId()).mo17800a());
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: g */
    private void m12734g() {
        if (!this.f14038t.mo17775f().isEmpty() && this.f14038t.mo17775f() != null && !m12742k()) {
            this.f14025g.setCCAText(this.f14038t.mo17775f());
        }
        if (this.f14038t.mo17780k() != null) {
            this.f14023e.setVisibility(8);
        }
        if (!m12744l()) {
            this.f14028j.performClick();
        }
    }

    /* renamed from: h */
    private void m12736h() {
        runOnUiThread(new C6317k());
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m12738i() {
        runOnUiThread(new C6306a());
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public boolean m12740j() {
        return this.f14017A.equals("01") && !this.f14038t.mo17789t().equals("");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public boolean m12742k() {
        return this.f14038t.mo17786q().equalsIgnoreCase("2.2.0");
    }

    /* renamed from: l */
    private boolean m12744l() {
        return this.f14038t.mo17786q().equalsIgnoreCase("2.1.0");
    }

    /* renamed from: a */
    public void mo17857a() {
        m12738i();
        finish();
    }

    /* renamed from: a */
    public void mo17858a(C6272b bVar) {
        runOnUiThread(new C6307b(bVar));
    }

    /* renamed from: b */
    public void mo17866b() {
        this.f14030l.setCCAOnClickListener(new C6309d());
        C8178g.m16454f(this.f14030l, this.f14039u, this);
    }

    /* renamed from: c */
    public void mo17867c() {
        this.f14032n.setCCAOnClickListener(new C6310e());
        C8178g.m16454f(this.f14032n, this.f14039u, this);
    }

    public void onBackPressed() {
        super.onBackPressed();
        C8046d dVar = new C8046d();
        dVar.f17559a = C8171a.f17933f;
        C8045c cVar = new C8045c(this.f14038t, dVar);
        this.f14037s = cVar;
        m12719a(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009a, code lost:
        setContentView(r0);
        r5.f14026h = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCATextView) findViewById(com.etsy.android.R.id.challengeInfoLabelTextView);
        r5.f14029k = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCAButton) findViewById(com.etsy.android.R.id.resendInfoButton);
        r6 = findViewById(com.etsy.android.R.id.ss_submitAuthenticationButton);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b1, code lost:
        r5.f14028j = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCAButton) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00df, code lost:
        r5.f14025g = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCATextView) findViewById(com.etsy.android.R.id.challengeInfoTextView);
        r6 = (androidx.appcompat.widget.Toolbar) findViewById(com.etsy.android.R.id.toolbar);
        r5.f14020b = r6;
        setSupportActionBar(r6);
        r6 = getSupportActionBar();
        java.util.Objects.requireNonNull(r6);
        r6.mo1193v(false);
        r5.f14034p = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCATextView) findViewById(com.etsy.android.R.id.toolbarButton);
        r5.f14036r = (android.widget.ProgressBar) findViewById(com.etsy.android.R.id.pbHeaderProgress);
        r5.f14021c = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCAImageView) findViewById(com.etsy.android.R.id.issuerImageView);
        r5.f14022d = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCAImageView) findViewById(com.etsy.android.R.id.psImageView);
        r5.f14023e = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCAImageView) findViewById(com.etsy.android.R.id.warningIndicator);
        r5.f14024f = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCATextView) findViewById(com.etsy.android.R.id.challengeInfoHeaderTextView);
        r5.f14030l = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCATextView) findViewById(com.etsy.android.R.id.whyInfoLableTextview);
        r5.f14031m = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCATextView) findViewById(com.etsy.android.R.id.whyInfoDecTextview);
        r5.f14032n = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCATextView) findViewById(com.etsy.android.R.id.helpLableTextView);
        r5.f14033o = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCATextView) findViewById(com.etsy.android.R.id.helpDecTextview);
        r5.f14039u = (com.cardinalcommerce.shared.userinterfaces.UiCustomization) getIntent().getExtras().getSerializable("UiCustomization");
        m12721b(r5.f14038t);
        m12717a(r5.f14039u);
        m12727d();
        mo17866b();
        mo17867c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0195, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            android.content.BroadcastReceiver r6 = r5.f14019a
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "finish_activity"
            r0.<init>(r1)
            r5.registerReceiver(r6, r0)
            char[] r6 = p257u8.C8171a.f17928a
            android.view.Window r6 = r5.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r6.setFlags(r0, r0)
            android.content.Intent r6 = r5.getIntent()
            android.os.Bundle r6 = r6.getExtras()
            java.util.Objects.requireNonNull(r6)
            r0 = r6
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.String r0 = "StepUpData"
            java.io.Serializable r6 = r6.getSerializable(r0)
            com.cardinalcommerce.shared.cs.e.b r6 = (com.cardinalcommerce.shared.p065cs.p069e.C6272b) r6
            r5.f14038t = r6
            java.lang.String r6 = r6.mo17774e()
            r5.f14017A = r6
            android.content.Context r6 = r5.getApplicationContext()
            r5.f14018B = r6
            java.lang.String r6 = r5.f14017A
            r6.getClass()
            r0 = -1
            int r1 = r6.hashCode()
            r2 = 0
            switch(r1) {
                case 1537: goto L_0x006e;
                case 1538: goto L_0x0063;
                case 1539: goto L_0x0058;
                case 1540: goto L_0x004d;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x0078
        L_0x004d:
            java.lang.String r1 = "04"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0056
            goto L_0x0078
        L_0x0056:
            r0 = 3
            goto L_0x0078
        L_0x0058:
            java.lang.String r1 = "03"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0061
            goto L_0x0078
        L_0x0061:
            r0 = 2
            goto L_0x0078
        L_0x0063:
            java.lang.String r1 = "02"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x006c
            goto L_0x0078
        L_0x006c:
            r0 = 1
            goto L_0x0078
        L_0x006e:
            java.lang.String r1 = "01"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r0 = r2
        L_0x0078:
            r6 = 2131429882(0x7f0b09fa, float:1.848145E38)
            r1 = 2131429925(0x7f0b0a25, float:1.8481536E38)
            r3 = 2131429471(0x7f0b085f, float:1.8480616E38)
            r4 = 2131427726(0x7f0b018e, float:1.8477076E38)
            switch(r0) {
                case 0: goto L_0x00b6;
                case 1: goto L_0x0097;
                case 2: goto L_0x0093;
                case 3: goto L_0x0088;
                default: goto L_0x0087;
            }
        L_0x0087:
            goto L_0x00df
        L_0x0088:
            r6 = 2131623976(0x7f0e0028, float:1.8875119E38)
            r5.setContentView((int) r6)
            android.view.View r6 = r5.findViewById(r1)
            goto L_0x00b1
        L_0x0093:
            r0 = 2131623973(0x7f0e0025, float:1.8875113E38)
            goto L_0x009a
        L_0x0097:
            r0 = 2131623979(0x7f0e002b, float:1.8875125E38)
        L_0x009a:
            r5.setContentView((int) r0)
            android.view.View r0 = r5.findViewById(r4)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r0 = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCATextView) r0
            r5.f14026h = r0
            android.view.View r0 = r5.findViewById(r3)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAButton r0 = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCAButton) r0
            r5.f14029k = r0
            android.view.View r6 = r5.findViewById(r6)
        L_0x00b1:
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAButton r6 = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCAButton) r6
            r5.f14028j = r6
            goto L_0x00df
        L_0x00b6:
            r6 = 2131623977(0x7f0e0029, float:1.887512E38)
            r5.setContentView((int) r6)
            android.view.View r6 = r5.findViewById(r4)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r6 = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCATextView) r6
            r5.f14026h = r6
            r6 = 2131427874(0x7f0b0222, float:1.8477377E38)
            android.view.View r6 = r5.findViewById(r6)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAEditText r6 = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCAEditText) r6
            r5.f14027i = r6
            android.view.View r6 = r5.findViewById(r1)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAButton r6 = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCAButton) r6
            r5.f14028j = r6
            android.view.View r6 = r5.findViewById(r3)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAButton r6 = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCAButton) r6
            r5.f14029k = r6
        L_0x00df:
            r6 = 2131427727(0x7f0b018f, float:1.8477078E38)
            android.view.View r6 = r5.findViewById(r6)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r6 = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCATextView) r6
            r5.f14025g = r6
            r6 = 2131430180(0x7f0b0b24, float:1.8482054E38)
            android.view.View r6 = r5.findViewById(r6)
            androidx.appcompat.widget.Toolbar r6 = (androidx.appcompat.widget.Toolbar) r6
            r5.f14020b = r6
            r5.setSupportActionBar(r6)
            androidx.appcompat.app.ActionBar r6 = r5.getSupportActionBar()
            java.util.Objects.requireNonNull(r6)
            r6.mo1193v(r2)
            r6 = 2131430181(0x7f0b0b25, float:1.8482056E38)
            android.view.View r6 = r5.findViewById(r6)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r6 = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCATextView) r6
            r5.f14034p = r6
            r6 = 2131429249(0x7f0b0781, float:1.8480165E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.ProgressBar r6 = (android.widget.ProgressBar) r6
            r5.f14036r = r6
            r6 = 2131428725(0x7f0b0575, float:1.8479103E38)
            android.view.View r6 = r5.findViewById(r6)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAImageView r6 = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCAImageView) r6
            r5.f14021c = r6
            r6 = 2131429325(0x7f0b07cd, float:1.848032E38)
            android.view.View r6 = r5.findViewById(r6)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAImageView r6 = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCAImageView) r6
            r5.f14022d = r6
            r6 = 2131430635(0x7f0b0ceb, float:1.8482977E38)
            android.view.View r6 = r5.findViewById(r6)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAImageView r6 = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCAImageView) r6
            r5.f14023e = r6
            r6 = 2131427725(0x7f0b018d, float:1.8477074E38)
            android.view.View r6 = r5.findViewById(r6)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r6 = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCATextView) r6
            r5.f14024f = r6
            r6 = 2131430645(0x7f0b0cf5, float:1.8482997E38)
            android.view.View r6 = r5.findViewById(r6)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r6 = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCATextView) r6
            r5.f14030l = r6
            r6 = 2131430644(0x7f0b0cf4, float:1.8482995E38)
            android.view.View r6 = r5.findViewById(r6)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r6 = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCATextView) r6
            r5.f14031m = r6
            r6 = 2131428550(0x7f0b04c6, float:1.8478748E38)
            android.view.View r6 = r5.findViewById(r6)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r6 = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCATextView) r6
            r5.f14032n = r6
            r6 = 2131428548(0x7f0b04c4, float:1.8478744E38)
            android.view.View r6 = r5.findViewById(r6)
            com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView r6 = (com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCATextView) r6
            r5.f14033o = r6
            android.content.Intent r6 = r5.getIntent()
            android.os.Bundle r6 = r6.getExtras()
            java.lang.String r0 = "UiCustomization"
            java.io.Serializable r6 = r6.getSerializable(r0)
            com.cardinalcommerce.shared.userinterfaces.UiCustomization r6 = (com.cardinalcommerce.shared.userinterfaces.UiCustomization) r6
            r5.f14039u = r6
            com.cardinalcommerce.shared.cs.e.b r6 = r5.f14038t
            r5.m12721b((com.cardinalcommerce.shared.p065cs.p069e.C6272b) r6)
            com.cardinalcommerce.shared.userinterfaces.UiCustomization r6 = r5.f14039u
            r5.m12717a((com.cardinalcommerce.shared.userinterfaces.UiCustomization) r6)
            r5.m12727d()
            r5.mo17866b()
            r5.mo17867c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.shared.p065cs.userinterfaces.ChallengeNativeView.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        unregisterReceiver(this.f14019a);
        super.onDestroy();
    }

    public void onPause() {
        this.f14044z = true;
        super.onPause();
    }

    public void onResume() {
        if (this.f14044z && this.f14017A.equals("04")) {
            m12734g();
        }
        super.onResume();
    }
}
