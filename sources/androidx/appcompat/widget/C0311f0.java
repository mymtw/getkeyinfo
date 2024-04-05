package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.core.widget.C2402f;
import androidx.core.widget.C2403g;
import com.etsy.android.R;
import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p109g.C6826c;
import p628nj.C18263b;

/* renamed from: androidx.appcompat.widget.f0 */
public class C0311f0 implements C6826c {

    /* renamed from: A */
    public static Method f769A;

    /* renamed from: B */
    public static Method f770B;

    /* renamed from: b */
    public Context f771b;

    /* renamed from: c */
    public ListAdapter f772c;

    /* renamed from: d */
    public C0299a0 f773d;

    /* renamed from: e */
    public int f774e;

    /* renamed from: f */
    public int f775f;

    /* renamed from: g */
    public int f776g;

    /* renamed from: h */
    public int f777h;

    /* renamed from: i */
    public int f778i;

    /* renamed from: j */
    public boolean f779j;

    /* renamed from: k */
    public boolean f780k;

    /* renamed from: l */
    public boolean f781l;

    /* renamed from: m */
    public int f782m;

    /* renamed from: n */
    public int f783n;

    /* renamed from: o */
    public C0313b f784o;

    /* renamed from: p */
    public View f785p;

    /* renamed from: q */
    public AdapterView.OnItemClickListener f786q;

    /* renamed from: r */
    public final C0316e f787r;

    /* renamed from: s */
    public final C0315d f788s;

    /* renamed from: t */
    public final C0314c f789t;

    /* renamed from: u */
    public final C0312a f790u;

    /* renamed from: v */
    public final Handler f791v;

    /* renamed from: w */
    public final Rect f792w;

    /* renamed from: x */
    public Rect f793x;

    /* renamed from: y */
    public boolean f794y;

    /* renamed from: z */
    public C0330l f795z;

    /* renamed from: androidx.appcompat.widget.f0$a */
    public class C0312a implements Runnable {
        public C0312a() {
        }

        public final void run() {
            C0299a0 a0Var = C0311f0.this.f773d;
            if (a0Var != null) {
                a0Var.setListSelectionHidden(true);
                a0Var.requestLayout();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$b */
    public class C0313b extends DataSetObserver {
        public C0313b() {
        }

        public final void onChanged() {
            if (C0311f0.this.mo2004b()) {
                C0311f0.this.mo2003a();
            }
        }

        public final void onInvalidated() {
            C0311f0.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$c */
    public class C0314c implements AbsListView.OnScrollListener {
        public C0314c() {
        }

        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public final void onScrollStateChanged(AbsListView absListView, int i) {
            boolean z = true;
            if (i == 1) {
                if (C0311f0.this.f795z.getInputMethodMode() != 2) {
                    z = false;
                }
                if (!z && C0311f0.this.f795z.getContentView() != null) {
                    C0311f0 f0Var = C0311f0.this;
                    f0Var.f791v.removeCallbacks(f0Var.f787r);
                    C0311f0.this.f787r.run();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$d */
    public class C0315d implements View.OnTouchListener {
        public C0315d() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C0330l lVar;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (lVar = C0311f0.this.f795z) != null && lVar.isShowing() && x >= 0 && x < C0311f0.this.f795z.getWidth() && y >= 0 && y < C0311f0.this.f795z.getHeight()) {
                C0311f0 f0Var = C0311f0.this;
                f0Var.f791v.postDelayed(f0Var.f787r, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C0311f0 f0Var2 = C0311f0.this;
                f0Var2.f791v.removeCallbacks(f0Var2.f787r);
                return false;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$e */
    public class C0316e implements Runnable {
        public C0316e() {
        }

        public final void run() {
            C0299a0 a0Var = C0311f0.this.f773d;
            if (a0Var != null) {
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                if (C2364y.C2371g.m5245b(a0Var) && C0311f0.this.f773d.getCount() > C0311f0.this.f773d.getChildCount()) {
                    int childCount = C0311f0.this.f773d.getChildCount();
                    C0311f0 f0Var = C0311f0.this;
                    if (childCount <= f0Var.f783n) {
                        f0Var.f795z.setInputMethodMode(2);
                        C0311f0.this.mo2003a();
                    }
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                f769A = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f770B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public C0311f0(Context context) {
        this(context, (AttributeSet) null, R.attr.listPopupWindowStyle, 0);
    }

    /* renamed from: a */
    public final void mo2003a() {
        int i;
        int i2;
        C0299a0 a0Var;
        int i3;
        if (this.f773d == null) {
            C0299a0 q = mo2637q(this.f771b, !this.f794y);
            this.f773d = q;
            q.setAdapter(this.f772c);
            this.f773d.setOnItemClickListener(this.f786q);
            this.f773d.setFocusable(true);
            this.f773d.setFocusableInTouchMode(true);
            this.f773d.setOnItemSelectedListener(new C0309e0(this));
            this.f773d.setOnScrollListener(this.f789t);
            this.f795z.setContentView(this.f773d);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f795z.getContentView();
        }
        Drawable background = this.f795z.getBackground();
        int i4 = 0;
        if (background != null) {
            background.getPadding(this.f792w);
            Rect rect = this.f792w;
            int i5 = rect.top;
            i = rect.bottom + i5;
            if (!this.f779j) {
                this.f777h = -i5;
            }
        } else {
            this.f792w.setEmpty();
            i = 0;
        }
        int maxAvailableHeight = this.f795z.getMaxAvailableHeight(this.f785p, this.f777h, this.f795z.getInputMethodMode() == 2);
        if (this.f774e == -1) {
            i2 = maxAvailableHeight + i;
        } else {
            int i6 = this.f775f;
            if (i6 == -2) {
                int i7 = this.f771b.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.f792w;
                i3 = View.MeasureSpec.makeMeasureSpec(i7 - (rect2.left + rect2.right), Integer.MIN_VALUE);
            } else if (i6 != -1) {
                i3 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            } else {
                int i8 = this.f771b.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f792w;
                i3 = View.MeasureSpec.makeMeasureSpec(i8 - (rect3.left + rect3.right), 1073741824);
            }
            int measureHeightOfChildrenCompat = this.f773d.measureHeightOfChildrenCompat(i3, 0, -1, maxAvailableHeight + 0, -1);
            i2 = measureHeightOfChildrenCompat + (measureHeightOfChildrenCompat > 0 ? this.f773d.getPaddingBottom() + this.f773d.getPaddingTop() + i + 0 : 0);
        }
        boolean z = this.f795z.getInputMethodMode() == 2;
        C2403g.m5358d(this.f795z, this.f778i);
        if (this.f795z.isShowing()) {
            View view = this.f785p;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (C2364y.C2371g.m5245b(view)) {
                int i9 = this.f775f;
                if (i9 == -1) {
                    i9 = -1;
                } else if (i9 == -2) {
                    i9 = this.f785p.getWidth();
                }
                int i10 = this.f774e;
                if (i10 == -1) {
                    if (!z) {
                        i2 = -1;
                    }
                    if (z) {
                        this.f795z.setWidth(this.f775f == -1 ? -1 : 0);
                        this.f795z.setHeight(0);
                    } else {
                        C0330l lVar = this.f795z;
                        if (this.f775f == -1) {
                            i4 = -1;
                        }
                        lVar.setWidth(i4);
                        this.f795z.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    i2 = i10;
                }
                this.f795z.setOutsideTouchable(true);
                this.f795z.update(this.f785p, this.f776g, this.f777h, i9 < 0 ? -1 : i9, i2 < 0 ? -1 : i2);
                return;
            }
            return;
        }
        int i11 = this.f775f;
        if (i11 == -1) {
            i11 = -1;
        } else if (i11 == -2) {
            i11 = this.f785p.getWidth();
        }
        int i12 = this.f774e;
        if (i12 == -1) {
            i2 = -1;
        } else if (i12 != -2) {
            i2 = i12;
        }
        this.f795z.setWidth(i11);
        this.f795z.setHeight(i2);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f769A;
            if (method != null) {
                try {
                    method.invoke(this.f795z, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f795z.setIsClippedToScreen(true);
        }
        this.f795z.setOutsideTouchable(true);
        this.f795z.setTouchInterceptor(this.f788s);
        if (this.f781l) {
            C2403g.m5357c(this.f795z, this.f780k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f770B;
            if (method2 != null) {
                try {
                    method2.invoke(this.f795z, new Object[]{this.f793x});
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            this.f795z.setEpicenterBounds(this.f793x);
        }
        C2402f.m5354a(this.f795z, this.f785p, this.f776g, this.f777h, this.f782m);
        this.f773d.setSelection(-1);
        if ((!this.f794y || this.f773d.isInTouchMode()) && (a0Var = this.f773d) != null) {
            a0Var.setListSelectionHidden(true);
            a0Var.requestLayout();
        }
        if (!this.f794y) {
            this.f791v.post(this.f790u);
        }
    }

    /* renamed from: b */
    public final boolean mo2004b() {
        return this.f795z.isShowing();
    }

    /* renamed from: c */
    public final int mo3037c() {
        return this.f776g;
    }

    public final void dismiss() {
        this.f795z.dismiss();
        this.f795z.setContentView((View) null);
        this.f773d = null;
        this.f791v.removeCallbacks(this.f787r);
    }

    /* renamed from: e */
    public final void mo3038e(int i) {
        this.f776g = i;
    }

    /* renamed from: g */
    public final Drawable mo3039g() {
        return this.f795z.getBackground();
    }

    /* renamed from: i */
    public final void mo3040i(int i) {
        this.f777h = i;
        this.f779j = true;
    }

    /* renamed from: l */
    public final int mo3041l() {
        if (!this.f779j) {
            return 0;
        }
        return this.f777h;
    }

    /* renamed from: m */
    public void mo2479m(ListAdapter listAdapter) {
        C0313b bVar = this.f784o;
        if (bVar == null) {
            this.f784o = new C0313b();
        } else {
            ListAdapter listAdapter2 = this.f772c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f772c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f784o);
        }
        C0299a0 a0Var = this.f773d;
        if (a0Var != null) {
            a0Var.setAdapter(this.f772c);
        }
    }

    /* renamed from: o */
    public final C0299a0 mo2015o() {
        return this.f773d;
    }

    /* renamed from: p */
    public final void mo3042p(Drawable drawable) {
        this.f795z.setBackgroundDrawable(drawable);
    }

    /* renamed from: q */
    public C0299a0 mo2637q(Context context, boolean z) {
        return new C0299a0(context, z);
    }

    /* renamed from: r */
    public final void mo3043r(int i) {
        Drawable background = this.f795z.getBackground();
        if (background != null) {
            background.getPadding(this.f792w);
            Rect rect = this.f792w;
            this.f775f = rect.left + rect.right + i;
            return;
        }
        this.f775f = i;
    }

    public C0311f0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f774e = -2;
        this.f775f = -2;
        this.f778i = CloseCodes.PROTOCOL_ERROR;
        this.f782m = 0;
        this.f783n = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f787r = new C0316e();
        this.f788s = new C0315d();
        this.f789t = new C0314c();
        this.f790u = new C0312a();
        this.f792w = new Rect();
        this.f771b = context;
        this.f791v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C18263b.f40086w, i, i2);
        this.f776g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f777h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f779j = true;
        }
        obtainStyledAttributes.recycle();
        C0330l lVar = new C0330l(context, attributeSet, i, i2);
        this.f795z = lVar;
        lVar.setInputMethodMode(1);
    }
}
