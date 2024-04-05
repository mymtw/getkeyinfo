package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0218f;
import androidx.appcompat.widget.C0299a0;
import androidx.appcompat.widget.C0319g0;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p109g.C6825b;

/* renamed from: androidx.appcompat.view.menu.b */
public final class C0209b extends C6825b implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A */
    public PopupWindow.OnDismissListener f573A;

    /* renamed from: B */
    public boolean f574B;

    /* renamed from: c */
    public final Context f575c;

    /* renamed from: d */
    public final int f576d;

    /* renamed from: e */
    public final int f577e;

    /* renamed from: f */
    public final int f578f;

    /* renamed from: g */
    public final boolean f579g;

    /* renamed from: h */
    public final Handler f580h;

    /* renamed from: i */
    public final ArrayList f581i = new ArrayList();

    /* renamed from: j */
    public final ArrayList f582j = new ArrayList();

    /* renamed from: k */
    public final C0210a f583k = new C0210a();

    /* renamed from: l */
    public final C0211b f584l = new C0211b();

    /* renamed from: m */
    public final C0212c f585m = new C0212c();

    /* renamed from: n */
    public int f586n;

    /* renamed from: o */
    public int f587o;

    /* renamed from: p */
    public View f588p;

    /* renamed from: q */
    public View f589q;

    /* renamed from: r */
    public int f590r;

    /* renamed from: s */
    public boolean f591s;

    /* renamed from: t */
    public boolean f592t;

    /* renamed from: u */
    public int f593u;

    /* renamed from: v */
    public int f594v;

    /* renamed from: w */
    public boolean f595w;

    /* renamed from: x */
    public boolean f596x;

    /* renamed from: y */
    public C0218f.C0219a f597y;

    /* renamed from: z */
    public ViewTreeObserver f598z;

    /* renamed from: androidx.appcompat.view.menu.b$a */
    public class C0210a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0210a() {
        }

        public final void onGlobalLayout() {
            if (C0209b.this.mo2004b() && C0209b.this.f582j.size() > 0 && !((C0213d) C0209b.this.f582j.get(0)).f602a.f794y) {
                View view = C0209b.this.f589q;
                if (view == null || !view.isShown()) {
                    C0209b.this.dismiss();
                    return;
                }
                Iterator it = C0209b.this.f582j.iterator();
                while (it.hasNext()) {
                    ((C0213d) it.next()).f602a.mo2003a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b */
    public class C0211b implements View.OnAttachStateChangeListener {
        public C0211b() {
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0209b.this.f598z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0209b.this.f598z = view.getViewTreeObserver();
                }
                C0209b bVar = C0209b.this;
                bVar.f598z.removeGlobalOnLayoutListener(bVar.f583k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$c */
    public class C0212c implements C0319g0 {
        public C0212c() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: androidx.appcompat.view.menu.b$d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo2021d(androidx.appcompat.view.menu.MenuBuilder r6, androidx.appcompat.view.menu.MenuItemImpl r7) {
            /*
                r5 = this;
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.C0209b.this
                android.os.Handler r0 = r0.f580h
                r1 = 0
                r0.removeCallbacksAndMessages(r1)
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.C0209b.this
                java.util.ArrayList r0 = r0.f582j
                int r0 = r0.size()
                r2 = 0
            L_0x0011:
                r3 = -1
                if (r2 >= r0) goto L_0x0026
                androidx.appcompat.view.menu.b r4 = androidx.appcompat.view.menu.C0209b.this
                java.util.ArrayList r4 = r4.f582j
                java.lang.Object r4 = r4.get(r2)
                androidx.appcompat.view.menu.b$d r4 = (androidx.appcompat.view.menu.C0209b.C0213d) r4
                androidx.appcompat.view.menu.MenuBuilder r4 = r4.f603b
                if (r6 != r4) goto L_0x0023
                goto L_0x0027
            L_0x0023:
                int r2 = r2 + 1
                goto L_0x0011
            L_0x0026:
                r2 = r3
            L_0x0027:
                if (r2 != r3) goto L_0x002a
                return
            L_0x002a:
                int r2 = r2 + 1
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.C0209b.this
                java.util.ArrayList r0 = r0.f582j
                int r0 = r0.size()
                if (r2 >= r0) goto L_0x0041
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.C0209b.this
                java.util.ArrayList r0 = r0.f582j
                java.lang.Object r0 = r0.get(r2)
                r1 = r0
                androidx.appcompat.view.menu.b$d r1 = (androidx.appcompat.view.menu.C0209b.C0213d) r1
            L_0x0041:
                androidx.appcompat.view.menu.c r0 = new androidx.appcompat.view.menu.c
                r0.<init>(r5, r1, r7, r6)
                long r1 = android.os.SystemClock.uptimeMillis()
                r3 = 200(0xc8, double:9.9E-322)
                long r1 = r1 + r3
                androidx.appcompat.view.menu.b r7 = androidx.appcompat.view.menu.C0209b.this
                android.os.Handler r7 = r7.f580h
                r7.postAtTime(r0, r6, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0209b.C0212c.mo2021d(androidx.appcompat.view.menu.MenuBuilder, androidx.appcompat.view.menu.MenuItemImpl):void");
        }

        /* renamed from: n */
        public final void mo2022n(MenuBuilder menuBuilder, MenuItem menuItem) {
            C0209b.this.f580h.removeCallbacksAndMessages(menuBuilder);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$d */
    public static class C0213d {

        /* renamed from: a */
        public final MenuPopupWindow f602a;

        /* renamed from: b */
        public final MenuBuilder f603b;

        /* renamed from: c */
        public final int f604c;

        public C0213d(MenuPopupWindow menuPopupWindow, MenuBuilder menuBuilder, int i) {
            this.f602a = menuPopupWindow;
            this.f603b = menuBuilder;
            this.f604c = i;
        }
    }

    public C0209b(Context context, View view, int i, int i2, boolean z) {
        int i3 = 0;
        this.f586n = 0;
        this.f587o = 0;
        this.f575c = context;
        this.f588p = view;
        this.f577e = i;
        this.f578f = i2;
        this.f579g = z;
        this.f595w = false;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        this.f590r = C2364y.C2369e.m5233d(view) != 1 ? 1 : i3;
        Resources resources = context.getResources();
        this.f576d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f580h = new Handler();
    }

    /* renamed from: a */
    public final void mo2003a() {
        if (!mo2004b()) {
            Iterator it = this.f581i.iterator();
            while (it.hasNext()) {
                mo2014m((MenuBuilder) it.next());
            }
            this.f581i.clear();
            View view = this.f588p;
            this.f589q = view;
            if (view != null) {
                boolean z = this.f598z == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f598z = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f583k);
                }
                this.f589q.addOnAttachStateChangeListener(this.f584l);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo2004b() {
        return this.f582j.size() > 0 && ((C0213d) this.f582j.get(0)).f602a.mo2004b();
    }

    /* renamed from: c */
    public final void mo2005c(MenuBuilder menuBuilder) {
        menuBuilder.addMenuPresenter(this, this.f575c);
        if (mo2004b()) {
            mo2014m(menuBuilder);
        } else {
            this.f581i.add(menuBuilder);
        }
    }

    public final void dismiss() {
        int size = this.f582j.size();
        if (size > 0) {
            C0213d[] dVarArr = (C0213d[]) this.f582j.toArray(new C0213d[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    C0213d dVar = dVarArr[size];
                    if (dVar.f602a.mo2004b()) {
                        dVar.f602a.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo2007e(View view) {
        if (this.f588p != view) {
            this.f588p = view;
            int i = this.f586n;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            this.f587o = Gravity.getAbsoluteGravity(i, C2364y.C2369e.m5233d(view));
        }
    }

    /* renamed from: f */
    public final void mo2008f(boolean z) {
        this.f595w = z;
    }

    public final boolean flagActionItems() {
        return false;
    }

    /* renamed from: g */
    public final void mo2009g(int i) {
        if (this.f586n != i) {
            this.f586n = i;
            View view = this.f588p;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            this.f587o = Gravity.getAbsoluteGravity(i, C2364y.C2369e.m5233d(view));
        }
    }

    /* renamed from: h */
    public final void mo2010h(int i) {
        this.f591s = true;
        this.f593u = i;
    }

    /* renamed from: i */
    public final void mo2011i(PopupWindow.OnDismissListener onDismissListener) {
        this.f573A = onDismissListener;
    }

    /* renamed from: j */
    public final void mo2012j(boolean z) {
        this.f596x = z;
    }

    /* renamed from: k */
    public final void mo2013k(int i) {
        this.f592t = true;
        this.f594v = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0146, code lost:
        if (((r9.getWidth() + r10[0]) + r4) > r11.right) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014c, code lost:
        if ((r10[0] - r4) < 0) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0150, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2014m(androidx.appcompat.view.menu.MenuBuilder r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.content.Context r2 = r0.f575c
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            androidx.appcompat.view.menu.MenuAdapter r3 = new androidx.appcompat.view.menu.MenuAdapter
            boolean r4 = r0.f579g
            r5 = 2131623947(0x7f0e000b, float:1.887506E38)
            r3.<init>(r1, r2, r4, r5)
            boolean r4 = r16.mo2004b()
            r5 = 1
            if (r4 != 0) goto L_0x0023
            boolean r4 = r0.f595w
            if (r4 == 0) goto L_0x0023
            r3.setForceShowIcon(r5)
            goto L_0x0030
        L_0x0023:
            boolean r4 = r16.mo2004b()
            if (r4 == 0) goto L_0x0030
            boolean r4 = p109g.C6825b.m13209l(r17)
            r3.setForceShowIcon(r4)
        L_0x0030:
            android.content.Context r4 = r0.f575c
            int r6 = r0.f576d
            int r4 = p109g.C6825b.m13208d(r3, r4, r6)
            androidx.appcompat.widget.MenuPopupWindow r6 = new androidx.appcompat.widget.MenuPopupWindow
            android.content.Context r7 = r0.f575c
            int r8 = r0.f577e
            int r9 = r0.f578f
            r6.<init>(r7, r8, r9)
            androidx.appcompat.view.menu.b$c r7 = r0.f585m
            r6.f705C = r7
            r6.f786q = r0
            androidx.appcompat.widget.l r7 = r6.f795z
            r7.setOnDismissListener(r0)
            android.view.View r7 = r0.f588p
            r6.f785p = r7
            int r7 = r0.f587o
            r6.f782m = r7
            r6.f794y = r5
            androidx.appcompat.widget.l r7 = r6.f795z
            r7.setFocusable(r5)
            androidx.appcompat.widget.l r7 = r6.f795z
            r8 = 2
            r7.setInputMethodMode(r8)
            r6.mo2479m(r3)
            r6.mo3043r(r4)
            int r3 = r0.f587o
            r6.f782m = r3
            java.util.ArrayList r3 = r0.f582j
            int r3 = r3.size()
            r7 = 0
            if (r3 <= 0) goto L_0x00ea
            java.util.ArrayList r3 = r0.f582j
            int r10 = r3.size()
            int r10 = r10 - r5
            java.lang.Object r3 = r3.get(r10)
            androidx.appcompat.view.menu.b$d r3 = (androidx.appcompat.view.menu.C0209b.C0213d) r3
            androidx.appcompat.view.menu.MenuBuilder r10 = r3.f603b
            int r11 = r10.size()
            r12 = r7
        L_0x008a:
            if (r12 >= r11) goto L_0x00a0
            android.view.MenuItem r13 = r10.getItem(r12)
            boolean r14 = r13.hasSubMenu()
            if (r14 == 0) goto L_0x009d
            android.view.SubMenu r14 = r13.getSubMenu()
            if (r1 != r14) goto L_0x009d
            goto L_0x00a1
        L_0x009d:
            int r12 = r12 + 1
            goto L_0x008a
        L_0x00a0:
            r13 = 0
        L_0x00a1:
            if (r13 != 0) goto L_0x00a4
            goto L_0x00eb
        L_0x00a4:
            androidx.appcompat.widget.MenuPopupWindow r10 = r3.f602a
            androidx.appcompat.widget.a0 r10 = r10.f773d
            android.widget.ListAdapter r11 = r10.getAdapter()
            boolean r12 = r11 instanceof android.widget.HeaderViewListAdapter
            if (r12 == 0) goto L_0x00bd
            android.widget.HeaderViewListAdapter r11 = (android.widget.HeaderViewListAdapter) r11
            int r12 = r11.getHeadersCount()
            android.widget.ListAdapter r11 = r11.getWrappedAdapter()
            androidx.appcompat.view.menu.MenuAdapter r11 = (androidx.appcompat.view.menu.MenuAdapter) r11
            goto L_0x00c0
        L_0x00bd:
            androidx.appcompat.view.menu.MenuAdapter r11 = (androidx.appcompat.view.menu.MenuAdapter) r11
            r12 = r7
        L_0x00c0:
            int r14 = r11.getCount()
            r15 = r7
        L_0x00c5:
            r8 = -1
            if (r15 >= r14) goto L_0x00d2
            androidx.appcompat.view.menu.MenuItemImpl r9 = r11.getItem((int) r15)
            if (r13 != r9) goto L_0x00cf
            goto L_0x00d3
        L_0x00cf:
            int r15 = r15 + 1
            goto L_0x00c5
        L_0x00d2:
            r15 = r8
        L_0x00d3:
            if (r15 != r8) goto L_0x00d6
            goto L_0x00eb
        L_0x00d6:
            int r15 = r15 + r12
            int r8 = r10.getFirstVisiblePosition()
            int r15 = r15 - r8
            if (r15 < 0) goto L_0x00eb
            int r8 = r10.getChildCount()
            if (r15 < r8) goto L_0x00e5
            goto L_0x00eb
        L_0x00e5:
            android.view.View r8 = r10.getChildAt(r15)
            goto L_0x00ec
        L_0x00ea:
            r3 = 0
        L_0x00eb:
            r8 = 0
        L_0x00ec:
            if (r8 == 0) goto L_0x017c
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r9 > r10) goto L_0x010c
            java.lang.reflect.Method r9 = androidx.appcompat.widget.MenuPopupWindow.f704D
            if (r9 == 0) goto L_0x0111
            androidx.appcompat.widget.l r10 = r6.f795z     // Catch:{ Exception -> 0x0104 }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0104 }
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0104 }
            r11[r7] = r12     // Catch:{ Exception -> 0x0104 }
            r9.invoke(r10, r11)     // Catch:{ Exception -> 0x0104 }
            goto L_0x0111
        L_0x0104:
            java.lang.String r9 = "MenuPopupWindow"
            java.lang.String r10 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r9, r10)
            goto L_0x0111
        L_0x010c:
            androidx.appcompat.widget.l r9 = r6.f795z
            r9.setTouchModal(false)
        L_0x0111:
            androidx.appcompat.widget.l r9 = r6.f795z
            r10 = 0
            r9.setEnterTransition(r10)
            java.util.ArrayList r9 = r0.f582j
            int r10 = r9.size()
            int r10 = r10 - r5
            java.lang.Object r9 = r9.get(r10)
            androidx.appcompat.view.menu.b$d r9 = (androidx.appcompat.view.menu.C0209b.C0213d) r9
            androidx.appcompat.widget.MenuPopupWindow r9 = r9.f602a
            androidx.appcompat.widget.a0 r9 = r9.f773d
            r10 = 2
            int[] r10 = new int[r10]
            r9.getLocationOnScreen(r10)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            android.view.View r12 = r0.f589q
            r12.getWindowVisibleDisplayFrame(r11)
            int r12 = r0.f590r
            if (r12 != r5) goto L_0x0149
            r10 = r10[r7]
            int r9 = r9.getWidth()
            int r9 = r9 + r10
            int r9 = r9 + r4
            int r10 = r11.right
            if (r9 <= r10) goto L_0x014e
            goto L_0x0150
        L_0x0149:
            r9 = r10[r7]
            int r9 = r9 - r4
            if (r9 >= 0) goto L_0x0150
        L_0x014e:
            r9 = r5
            goto L_0x0151
        L_0x0150:
            r9 = r7
        L_0x0151:
            if (r9 != r5) goto L_0x0155
            r10 = r5
            goto L_0x0156
        L_0x0155:
            r10 = r7
        L_0x0156:
            r0.f590r = r9
            r6.f785p = r8
            int r9 = r0.f587o
            r11 = 5
            r9 = r9 & r11
            if (r9 != r11) goto L_0x0168
            if (r10 == 0) goto L_0x0163
            goto L_0x016e
        L_0x0163:
            int r4 = r8.getWidth()
            goto L_0x0170
        L_0x0168:
            if (r10 == 0) goto L_0x0170
            int r4 = r8.getWidth()
        L_0x016e:
            int r4 = r4 + r7
            goto L_0x0172
        L_0x0170:
            int r4 = 0 - r4
        L_0x0172:
            r6.f776g = r4
            r6.f781l = r5
            r6.f780k = r5
            r6.mo3040i(r7)
            goto L_0x019a
        L_0x017c:
            boolean r4 = r0.f591s
            if (r4 == 0) goto L_0x0184
            int r4 = r0.f593u
            r6.f776g = r4
        L_0x0184:
            boolean r4 = r0.f592t
            if (r4 == 0) goto L_0x018d
            int r4 = r0.f594v
            r6.mo3040i(r4)
        L_0x018d:
            android.graphics.Rect r4 = r0.f15026b
            if (r4 == 0) goto L_0x0197
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r4)
            goto L_0x0198
        L_0x0197:
            r10 = 0
        L_0x0198:
            r6.f793x = r10
        L_0x019a:
            androidx.appcompat.view.menu.b$d r4 = new androidx.appcompat.view.menu.b$d
            int r5 = r0.f590r
            r4.<init>(r6, r1, r5)
            java.util.ArrayList r5 = r0.f582j
            r5.add(r4)
            r6.mo2003a()
            androidx.appcompat.widget.a0 r4 = r6.f773d
            r4.setOnKeyListener(r0)
            if (r3 != 0) goto L_0x01dd
            boolean r3 = r0.f596x
            if (r3 == 0) goto L_0x01dd
            java.lang.CharSequence r3 = r17.getHeaderTitle()
            if (r3 == 0) goto L_0x01dd
            r3 = 2131623954(0x7f0e0012, float:1.8875074E38)
            android.view.View r2 = r2.inflate(r3, r4, r7)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.setEnabled(r7)
            java.lang.CharSequence r1 = r17.getHeaderTitle()
            r3.setText(r1)
            r1 = 0
            r4.addHeaderView(r2, r1, r7)
            r6.mo2003a()
        L_0x01dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0209b.mo2014m(androidx.appcompat.view.menu.MenuBuilder):void");
    }

    /* renamed from: o */
    public final C0299a0 mo2015o() {
        if (this.f582j.isEmpty()) {
            return null;
        }
        ArrayList arrayList = this.f582j;
        return ((C0213d) arrayList.get(arrayList.size() - 1)).f602a.f773d;
    }

    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        int size = this.f582j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuBuilder == ((C0213d) this.f582j.get(i)).f603b) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < this.f582j.size()) {
                ((C0213d) this.f582j.get(i2)).f603b.close(false);
            }
            C0213d dVar = (C0213d) this.f582j.remove(i);
            dVar.f603b.removeMenuPresenter(this);
            if (this.f574B) {
                dVar.f602a.f795z.setExitTransition((Transition) null);
                dVar.f602a.f795z.setAnimationStyle(0);
            }
            dVar.f602a.dismiss();
            int size2 = this.f582j.size();
            if (size2 > 0) {
                this.f590r = ((C0213d) this.f582j.get(size2 - 1)).f604c;
            } else {
                View view = this.f588p;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                this.f590r = C2364y.C2369e.m5233d(view) == 1 ? 0 : 1;
            }
            if (size2 == 0) {
                dismiss();
                C0218f.C0219a aVar = this.f597y;
                if (aVar != null) {
                    aVar.onCloseMenu(menuBuilder, true);
                }
                ViewTreeObserver viewTreeObserver = this.f598z;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f598z.removeGlobalOnLayoutListener(this.f583k);
                    }
                    this.f598z = null;
                }
                this.f589q.removeOnAttachStateChangeListener(this.f584l);
                this.f573A.onDismiss();
            } else if (z) {
                ((C0213d) this.f582j.get(0)).f603b.close(false);
            }
        }
    }

    public final void onDismiss() {
        C0213d dVar;
        int size = this.f582j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (C0213d) this.f582j.get(i);
            if (!dVar.f602a.mo2004b()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f603b.close(false);
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    public final Parcelable onSaveInstanceState() {
        return null;
    }

    public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        Iterator it = this.f582j.iterator();
        while (it.hasNext()) {
            C0213d dVar = (C0213d) it.next();
            if (subMenuBuilder == dVar.f603b) {
                dVar.f602a.f773d.requestFocus();
                return true;
            }
        }
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        mo2005c(subMenuBuilder);
        C0218f.C0219a aVar = this.f597y;
        if (aVar != null) {
            aVar.mo1342a(subMenuBuilder);
        }
        return true;
    }

    public final void setCallback(C0218f.C0219a aVar) {
        this.f597y = aVar;
    }

    public final void updateMenuView(boolean z) {
        Iterator it = this.f582j.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0213d) it.next()).f602a.f773d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((MenuAdapter) adapter).notifyDataSetChanged();
        }
    }
}
