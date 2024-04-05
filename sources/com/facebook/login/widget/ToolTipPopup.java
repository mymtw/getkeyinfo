package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.etsy.android.R;
import java.lang.ref.WeakReference;
import p401mg.C13080a;

public final class ToolTipPopup {

    /* renamed from: a */
    public final String f27480a;

    /* renamed from: b */
    public final WeakReference<View> f27481b;

    /* renamed from: c */
    public final Context f27482c;

    /* renamed from: d */
    public C12336d f27483d;

    /* renamed from: e */
    public PopupWindow f27484e;

    /* renamed from: f */
    public Style f27485f = Style.BLUE;

    /* renamed from: g */
    public long f27486g = 6000;

    /* renamed from: h */
    public final C12333a f27487h = new C12333a();

    public enum Style {
        BLUE,
        BLACK
    }

    /* renamed from: com.facebook.login.widget.ToolTipPopup$a */
    public class C12333a implements ViewTreeObserver.OnScrollChangedListener {
        public C12333a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
        /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onScrollChanged() {
            /*
                r6 = this;
                java.lang.Class<com.facebook.login.widget.ToolTipPopup> r0 = com.facebook.login.widget.ToolTipPopup.class
                com.facebook.login.widget.ToolTipPopup r1 = com.facebook.login.widget.ToolTipPopup.this
                boolean r2 = p401mg.C13080a.m20762b(r0)
                r3 = 0
                if (r2 == 0) goto L_0x000c
                goto L_0x0013
            L_0x000c:
                java.lang.ref.WeakReference<android.view.View> r1 = r1.f27481b     // Catch:{ all -> 0x000f }
                goto L_0x0014
            L_0x000f:
                r1 = move-exception
                p401mg.C13080a.m20761a(r0, r1)
            L_0x0013:
                r1 = r3
            L_0x0014:
                java.lang.Object r1 = r1.get()
                if (r1 == 0) goto L_0x0071
                com.facebook.login.widget.ToolTipPopup r1 = com.facebook.login.widget.ToolTipPopup.this
                android.widget.PopupWindow r1 = com.facebook.login.widget.ToolTipPopup.m20159a(r1)
                if (r1 == 0) goto L_0x0071
                com.facebook.login.widget.ToolTipPopup r1 = com.facebook.login.widget.ToolTipPopup.this
                android.widget.PopupWindow r1 = com.facebook.login.widget.ToolTipPopup.m20159a(r1)
                boolean r1 = r1.isShowing()
                if (r1 == 0) goto L_0x0071
                com.facebook.login.widget.ToolTipPopup r1 = com.facebook.login.widget.ToolTipPopup.this
                android.widget.PopupWindow r1 = com.facebook.login.widget.ToolTipPopup.m20159a(r1)
                boolean r1 = r1.isAboveAnchor()
                r2 = 4
                r4 = 0
                if (r1 == 0) goto L_0x0057
                com.facebook.login.widget.ToolTipPopup r1 = com.facebook.login.widget.ToolTipPopup.this
                boolean r5 = p401mg.C13080a.m20762b(r0)
                if (r5 == 0) goto L_0x0045
                goto L_0x004c
            L_0x0045:
                com.facebook.login.widget.ToolTipPopup$d r3 = r1.f27483d     // Catch:{ all -> 0x0048 }
                goto L_0x004c
            L_0x0048:
                r1 = move-exception
                p401mg.C13080a.m20761a(r0, r1)
            L_0x004c:
                android.widget.ImageView r0 = r3.f27491b
                r0.setVisibility(r2)
                android.widget.ImageView r0 = r3.f27492c
                r0.setVisibility(r4)
                goto L_0x0071
            L_0x0057:
                com.facebook.login.widget.ToolTipPopup r1 = com.facebook.login.widget.ToolTipPopup.this
                boolean r5 = p401mg.C13080a.m20762b(r0)
                if (r5 == 0) goto L_0x0060
                goto L_0x0067
            L_0x0060:
                com.facebook.login.widget.ToolTipPopup$d r3 = r1.f27483d     // Catch:{ all -> 0x0063 }
                goto L_0x0067
            L_0x0063:
                r1 = move-exception
                p401mg.C13080a.m20761a(r0, r1)
            L_0x0067:
                android.widget.ImageView r0 = r3.f27491b
                r0.setVisibility(r4)
                android.widget.ImageView r0 = r3.f27492c
                r0.setVisibility(r2)
            L_0x0071:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.widget.ToolTipPopup.C12333a.onScrollChanged():void");
        }
    }

    /* renamed from: com.facebook.login.widget.ToolTipPopup$b */
    public class C12334b implements Runnable {
        public C12334b() {
        }

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    ToolTipPopup.this.mo39703b();
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    /* renamed from: com.facebook.login.widget.ToolTipPopup$c */
    public class C12335c implements View.OnClickListener {
        public C12335c() {
        }

        public final void onClick(View view) {
            if (!C13080a.m20762b(this)) {
                try {
                    ToolTipPopup.this.mo39703b();
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    /* renamed from: com.facebook.login.widget.ToolTipPopup$d */
    public class C12336d extends FrameLayout {

        /* renamed from: b */
        public ImageView f27491b = ((ImageView) findViewById(R.id.com_facebook_tooltip_bubble_view_top_pointer));

        /* renamed from: c */
        public ImageView f27492c = ((ImageView) findViewById(R.id.com_facebook_tooltip_bubble_view_bottom_pointer));

        /* renamed from: d */
        public View f27493d = findViewById(R.id.com_facebook_body_frame);

        /* renamed from: e */
        public ImageView f27494e = ((ImageView) findViewById(R.id.com_facebook_button_xout));

        public C12336d(Context context) {
            super(context);
            LayoutInflater.from(getContext()).inflate(R.layout.com_facebook_tooltip_bubble, this);
        }
    }

    public ToolTipPopup(View view, String str) {
        this.f27480a = str;
        this.f27481b = new WeakReference<>(view);
        this.f27482c = view.getContext();
    }

    /* renamed from: a */
    public static /* synthetic */ PopupWindow m20159a(ToolTipPopup toolTipPopup) {
        Class<ToolTipPopup> cls = ToolTipPopup.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            return toolTipPopup.f27484e;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo39703b() {
        if (!C13080a.m20762b(this)) {
            try {
                mo39705d();
                PopupWindow popupWindow = this.f27484e;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* renamed from: c */
    public final void mo39704c() {
        if (!C13080a.m20762b(this)) {
            try {
                if (this.f27481b.get() != null) {
                    C12336d dVar = new C12336d(this.f27482c);
                    this.f27483d = dVar;
                    ((TextView) dVar.findViewById(R.id.com_facebook_tooltip_bubble_view_text_body)).setText(this.f27480a);
                    if (this.f27485f == Style.BLUE) {
                        this.f27483d.f27493d.setBackgroundResource(R.drawable.com_facebook_tooltip_blue_background);
                        this.f27483d.f27492c.setImageResource(R.drawable.com_facebook_tooltip_blue_bottomnub);
                        this.f27483d.f27491b.setImageResource(R.drawable.com_facebook_tooltip_blue_topnub);
                        this.f27483d.f27494e.setImageResource(R.drawable.com_facebook_tooltip_blue_xout);
                    } else {
                        this.f27483d.f27493d.setBackgroundResource(R.drawable.com_facebook_tooltip_black_background);
                        this.f27483d.f27492c.setImageResource(R.drawable.com_facebook_tooltip_black_bottomnub);
                        this.f27483d.f27491b.setImageResource(R.drawable.com_facebook_tooltip_black_topnub);
                        this.f27483d.f27494e.setImageResource(R.drawable.com_facebook_tooltip_black_xout);
                    }
                    View decorView = ((Activity) this.f27482c).getWindow().getDecorView();
                    int width = decorView.getWidth();
                    int height = decorView.getHeight();
                    if (!C13080a.m20762b(this)) {
                        mo39705d();
                        if (this.f27481b.get() != null) {
                            this.f27481b.get().getViewTreeObserver().addOnScrollChangedListener(this.f27487h);
                        }
                    }
                    this.f27483d.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                    C12336d dVar2 = this.f27483d;
                    PopupWindow popupWindow = new PopupWindow(dVar2, dVar2.getMeasuredWidth(), this.f27483d.getMeasuredHeight());
                    this.f27484e = popupWindow;
                    popupWindow.showAsDropDown(this.f27481b.get());
                    if (!C13080a.m20762b(this)) {
                        try {
                            PopupWindow popupWindow2 = this.f27484e;
                            if (popupWindow2 != null && popupWindow2.isShowing()) {
                                if (this.f27484e.isAboveAnchor()) {
                                    C12336d dVar3 = this.f27483d;
                                    dVar3.f27491b.setVisibility(4);
                                    dVar3.f27492c.setVisibility(0);
                                } else {
                                    C12336d dVar4 = this.f27483d;
                                    dVar4.f27491b.setVisibility(0);
                                    dVar4.f27492c.setVisibility(4);
                                }
                            }
                        } catch (Throwable th) {
                            C13080a.m20761a(this, th);
                        }
                    }
                    long j = this.f27486g;
                    if (j > 0) {
                        this.f27483d.postDelayed(new C12334b(), j);
                    }
                    this.f27484e.setTouchable(true);
                    this.f27483d.setOnClickListener(new C12335c());
                }
            } catch (Throwable th2) {
                C13080a.m20761a(this, th2);
            }
        }
    }

    /* renamed from: d */
    public final void mo39705d() {
        if (!C13080a.m20762b(this)) {
            try {
                if (this.f27481b.get() != null) {
                    this.f27481b.get().getViewTreeObserver().removeOnScrollChangedListener(this.f27487h);
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
