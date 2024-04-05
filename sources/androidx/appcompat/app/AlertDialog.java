package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.core.widget.NestedScrollView;
import androidx.preference.ListPreferenceDialogFragmentCompat;
import com.etsy.android.R;
import java.util.WeakHashMap;

public class AlertDialog extends AppCompatDialog {
    public static final int LAYOUT_HINT_NONE = 0;
    public static final int LAYOUT_HINT_SIDE = 1;
    public final AlertController mAlert;

    /* renamed from: androidx.appcompat.app.AlertDialog$a */
    public static class C0133a {

        /* renamed from: a */
        public final AlertController.C0130b f286a;

        /* renamed from: b */
        public final int f287b;

        public C0133a(Context context) {
            this(context, AlertDialog.resolveDialogTheme(context, 0));
        }

        /* renamed from: a */
        public C0133a mo1228a(BitmapDrawable bitmapDrawable) {
            this.f286a.f261c = bitmapDrawable;
            return this;
        }

        /* renamed from: b */
        public C0133a mo1229b(int i) {
            AlertController.C0130b bVar = this.f286a;
            bVar.f264f = bVar.f259a.getText(i);
            return this;
        }

        /* renamed from: c */
        public void mo1230c(CharSequence charSequence) {
            this.f286a.f264f = charSequence;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: android.widget.ListAdapter} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: androidx.appcompat.app.AlertController$d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: androidx.appcompat.app.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: androidx.appcompat.app.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: androidx.appcompat.app.b} */
        /* JADX WARNING: type inference failed for: r13v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.appcompat.app.AlertDialog create() {
            /*
                r14 = this;
                androidx.appcompat.app.AlertDialog r0 = new androidx.appcompat.app.AlertDialog
                androidx.appcompat.app.AlertController$b r1 = r14.f286a
                android.content.Context r1 = r1.f259a
                int r2 = r14.f287b
                r0.<init>(r1, r2)
                androidx.appcompat.app.AlertController$b r1 = r14.f286a
                androidx.appcompat.app.AlertController r9 = r0.mAlert
                android.view.View r2 = r1.f263e
                r10 = 0
                if (r2 == 0) goto L_0x0017
                r9.f219G = r2
                goto L_0x0038
            L_0x0017:
                java.lang.CharSequence r2 = r1.f262d
                if (r2 == 0) goto L_0x0024
                r9.f236e = r2
                android.widget.TextView r3 = r9.f217E
                if (r3 == 0) goto L_0x0024
                r3.setText(r2)
            L_0x0024:
                android.graphics.drawable.Drawable r2 = r1.f261c
                if (r2 == 0) goto L_0x0038
                r9.f215C = r2
                r9.f214B = r10
                android.widget.ImageView r3 = r9.f216D
                if (r3 == 0) goto L_0x0038
                r3.setVisibility(r10)
                android.widget.ImageView r3 = r9.f216D
                r3.setImageDrawable(r2)
            L_0x0038:
                java.lang.CharSequence r2 = r1.f264f
                if (r2 == 0) goto L_0x0045
                r9.f237f = r2
                android.widget.TextView r3 = r9.f218F
                if (r3 == 0) goto L_0x0045
                r3.setText(r2)
            L_0x0045:
                java.lang.CharSequence r4 = r1.f265g
                if (r4 != 0) goto L_0x004a
                goto L_0x0053
            L_0x004a:
                r3 = -1
                android.content.DialogInterface$OnClickListener r5 = r1.f266h
                r6 = 0
                r7 = 0
                r2 = r9
                r2.mo1204d(r3, r4, r5, r6, r7)
            L_0x0053:
                java.lang.CharSequence r4 = r1.f267i
                if (r4 != 0) goto L_0x0058
                goto L_0x0061
            L_0x0058:
                r3 = -2
                android.content.DialogInterface$OnClickListener r5 = r1.f268j
                r6 = 0
                r7 = 0
                r2 = r9
                r2.mo1204d(r3, r4, r5, r6, r7)
            L_0x0061:
                java.lang.CharSequence r4 = r1.f269k
                if (r4 != 0) goto L_0x0066
                goto L_0x006f
            L_0x0066:
                r3 = -3
                android.content.DialogInterface$OnClickListener r5 = r1.f270l
                r6 = 0
                r7 = 0
                r2 = r9
                r2.mo1204d(r3, r4, r5, r6, r7)
            L_0x006f:
                java.lang.CharSequence[] r2 = r1.f275q
                r11 = 0
                r12 = 1
                if (r2 != 0) goto L_0x0079
                android.widget.ListAdapter r2 = r1.f276r
                if (r2 == 0) goto L_0x00de
            L_0x0079:
                android.view.LayoutInflater r2 = r1.f260b
                int r3 = r9.f224L
                android.view.View r2 = r2.inflate(r3, r11)
                androidx.appcompat.app.AlertController$RecycleListView r2 = (androidx.appcompat.app.AlertController.RecycleListView) r2
                boolean r3 = r1.f281w
                if (r3 == 0) goto L_0x0096
                androidx.appcompat.app.b r13 = new androidx.appcompat.app.b
                android.content.Context r5 = r1.f259a
                int r6 = r9.f225M
                java.lang.CharSequence[] r7 = r1.f275q
                r3 = r13
                r4 = r1
                r8 = r2
                r3.<init>(r4, r5, r6, r7, r8)
                goto L_0x00ad
            L_0x0096:
                boolean r3 = r1.f282x
                if (r3 == 0) goto L_0x009d
                int r3 = r9.f226N
                goto L_0x009f
            L_0x009d:
                int r3 = r9.f227O
            L_0x009f:
                android.widget.ListAdapter r13 = r1.f276r
                if (r13 == 0) goto L_0x00a4
                goto L_0x00ad
            L_0x00a4:
                androidx.appcompat.app.AlertController$d r13 = new androidx.appcompat.app.AlertController$d
                android.content.Context r4 = r1.f259a
                java.lang.CharSequence[] r5 = r1.f275q
                r13.<init>(r4, r3, r5)
            L_0x00ad:
                r9.f220H = r13
                int r3 = r1.f283y
                r9.f221I = r3
                android.content.DialogInterface$OnClickListener r3 = r1.f277s
                if (r3 == 0) goto L_0x00c0
                androidx.appcompat.app.c r3 = new androidx.appcompat.app.c
                r3.<init>(r1, r9)
                r2.setOnItemClickListener(r3)
                goto L_0x00cc
            L_0x00c0:
                android.content.DialogInterface$OnMultiChoiceClickListener r3 = r1.f284z
                if (r3 == 0) goto L_0x00cc
                androidx.appcompat.app.d r3 = new androidx.appcompat.app.d
                r3.<init>(r1, r2, r9)
                r2.setOnItemClickListener(r3)
            L_0x00cc:
                boolean r3 = r1.f282x
                if (r3 == 0) goto L_0x00d4
                r2.setChoiceMode(r12)
                goto L_0x00dc
            L_0x00d4:
                boolean r3 = r1.f281w
                if (r3 == 0) goto L_0x00dc
                r3 = 2
                r2.setChoiceMode(r3)
            L_0x00dc:
                r9.f238g = r2
            L_0x00de:
                android.view.View r2 = r1.f279u
                if (r2 == 0) goto L_0x00e9
                r9.f239h = r2
                r9.f240i = r10
                r9.f245n = r10
                goto L_0x00f3
            L_0x00e9:
                int r1 = r1.f278t
                if (r1 == 0) goto L_0x00f3
                r9.f239h = r11
                r9.f240i = r1
                r9.f245n = r10
            L_0x00f3:
                androidx.appcompat.app.AlertController$b r1 = r14.f286a
                boolean r1 = r1.f271m
                r0.setCancelable(r1)
                androidx.appcompat.app.AlertController$b r1 = r14.f286a
                boolean r1 = r1.f271m
                if (r1 == 0) goto L_0x0103
                r0.setCanceledOnTouchOutside(r12)
            L_0x0103:
                androidx.appcompat.app.AlertController$b r1 = r14.f286a
                android.content.DialogInterface$OnCancelListener r1 = r1.f272n
                r0.setOnCancelListener(r1)
                androidx.appcompat.app.AlertController$b r1 = r14.f286a
                android.content.DialogInterface$OnDismissListener r1 = r1.f273o
                r0.setOnDismissListener(r1)
                androidx.appcompat.app.AlertController$b r1 = r14.f286a
                android.content.DialogInterface$OnKeyListener r1 = r1.f274p
                if (r1 == 0) goto L_0x011a
                r0.setOnKeyListener(r1)
            L_0x011a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertDialog.C0133a.create():androidx.appcompat.app.AlertDialog");
        }

        /* renamed from: d */
        public void mo1232d(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0130b bVar = this.f286a;
            bVar.f275q = charSequenceArr;
            bVar.f284z = onMultiChoiceClickListener;
            bVar.f280v = zArr;
            bVar.f281w = true;
        }

        /* renamed from: e */
        public C0133a mo1233e(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0130b bVar = this.f286a;
            bVar.f267i = charSequence;
            bVar.f268j = onClickListener;
            return this;
        }

        /* renamed from: f */
        public C0133a mo1234f(DialogInterface.OnDismissListener onDismissListener) {
            this.f286a.f273o = onDismissListener;
            return this;
        }

        /* renamed from: g */
        public C0133a mo1235g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0130b bVar = this.f286a;
            bVar.f265g = charSequence;
            bVar.f266h = onClickListener;
            return this;
        }

        public Context getContext() {
            return this.f286a.f259a;
        }

        /* renamed from: h */
        public void mo1237h(CharSequence[] charSequenceArr, int i, ListPreferenceDialogFragmentCompat.C3002a aVar) {
            AlertController.C0130b bVar = this.f286a;
            bVar.f275q = charSequenceArr;
            bVar.f277s = aVar;
            bVar.f283y = i;
            bVar.f282x = true;
        }

        /* renamed from: i */
        public C0133a mo1238i(int i) {
            AlertController.C0130b bVar = this.f286a;
            bVar.f262d = bVar.f259a.getText(i);
            return this;
        }

        /* renamed from: j */
        public C0133a mo1239j() {
            AlertController.C0130b bVar = this.f286a;
            bVar.f279u = null;
            bVar.f278t = R.layout.abc_slice_permission_request;
            return this;
        }

        /* renamed from: k */
        public final AlertDialog mo1240k() {
            AlertDialog create = create();
            create.show();
            return create;
        }

        public C0133a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0130b bVar = this.f286a;
            bVar.f267i = bVar.f259a.getText(i);
            this.f286a.f268j = onClickListener;
            return this;
        }

        public C0133a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0130b bVar = this.f286a;
            bVar.f265g = bVar.f259a.getText(i);
            this.f286a.f266h = onClickListener;
            return this;
        }

        public C0133a setTitle(CharSequence charSequence) {
            this.f286a.f262d = charSequence;
            return this;
        }

        public C0133a setView(View view) {
            AlertController.C0130b bVar = this.f286a;
            bVar.f279u = view;
            bVar.f278t = 0;
            return this;
        }

        public C0133a(Context context, int i) {
            this.f286a = new AlertController.C0130b(new ContextThemeWrapper(context, AlertDialog.resolveDialogTheme(context, i)));
            this.f287b = i;
        }
    }

    public AlertDialog(Context context) {
        this(context, 0);
    }

    public static int resolveDialogTheme(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button getButton(int i) {
        AlertController alertController = this.mAlert;
        if (i == -3) {
            return alertController.f254w;
        }
        if (i == -2) {
            return alertController.f250s;
        }
        if (i == -1) {
            return alertController.f246o;
        }
        alertController.getClass();
        return null;
    }

    public ListView getListView() {
        return this.mAlert.f238g;
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        View view;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        AlertController alertController = this.mAlert;
        int i = alertController.f223K;
        if (i == 0) {
            i = alertController.f222J;
        } else if (alertController.f229Q != 1) {
            i = alertController.f222J;
        }
        alertController.f233b.setContentView(i);
        View findViewById2 = alertController.f234c.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view2 = alertController.f239h;
        boolean z2 = false;
        if (view2 == null) {
            view2 = alertController.f240i != 0 ? LayoutInflater.from(alertController.f232a).inflate(alertController.f240i, viewGroup, false) : null;
        }
        boolean z3 = view2 != null;
        if (!z3 || !AlertController.m406a(view2)) {
            alertController.f234c.setFlags(131072, 131072);
        }
        if (z3) {
            FrameLayout frameLayout = (FrameLayout) alertController.f234c.findViewById(R.id.custom);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f245n) {
                frameLayout.setPadding(alertController.f241j, alertController.f242k, alertController.f243l, alertController.f244m);
            }
            if (alertController.f238g != null) {
                ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams()).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup c = AlertController.m408c(findViewById6, findViewById3);
        ViewGroup c2 = AlertController.m408c(findViewById7, findViewById4);
        ViewGroup c3 = AlertController.m408c(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.f234c.findViewById(R.id.scrollView);
        alertController.f213A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f213A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c2.findViewById(16908299);
        alertController.f218F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f237f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.f213A.removeView(alertController.f218F);
                if (alertController.f238g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.f213A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.f213A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.f238g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    c2.setVisibility(8);
                }
            }
        }
        Button button = (Button) c3.findViewById(16908313);
        alertController.f246o = button;
        button.setOnClickListener(alertController.f231S);
        if (!TextUtils.isEmpty(alertController.f247p) || alertController.f249r != null) {
            alertController.f246o.setText(alertController.f247p);
            Drawable drawable = alertController.f249r;
            if (drawable != null) {
                int i2 = alertController.f235d;
                drawable.setBounds(0, 0, i2, i2);
                alertController.f246o.setCompoundDrawables(alertController.f249r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.f246o.setVisibility(0);
            z = true;
        } else {
            alertController.f246o.setVisibility(8);
            z = false;
        }
        Button button2 = (Button) c3.findViewById(16908314);
        alertController.f250s = button2;
        button2.setOnClickListener(alertController.f231S);
        if (!TextUtils.isEmpty(alertController.f251t) || alertController.f253v != null) {
            alertController.f250s.setText(alertController.f251t);
            Drawable drawable2 = alertController.f253v;
            if (drawable2 != null) {
                int i3 = alertController.f235d;
                drawable2.setBounds(0, 0, i3, i3);
                alertController.f250s.setCompoundDrawables(alertController.f253v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.f250s.setVisibility(0);
            z |= true;
        } else {
            alertController.f250s.setVisibility(8);
        }
        Button button3 = (Button) c3.findViewById(16908315);
        alertController.f254w = button3;
        button3.setOnClickListener(alertController.f231S);
        if (!TextUtils.isEmpty(alertController.f255x) || alertController.f257z != null) {
            alertController.f254w.setText(alertController.f255x);
            Drawable drawable3 = alertController.f257z;
            if (drawable3 != null) {
                int i4 = alertController.f235d;
                drawable3.setBounds(0, 0, i4, i4);
                view = null;
                alertController.f254w.setCompoundDrawables(alertController.f257z, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                view = null;
            }
            alertController.f254w.setVisibility(0);
            z |= true;
        } else {
            alertController.f254w.setVisibility(8);
            view = null;
        }
        Context context = alertController.f232a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z) {
                AlertController.m407b(alertController.f246o);
            } else if (z) {
                AlertController.m407b(alertController.f250s);
            } else if (z) {
                AlertController.m407b(alertController.f254w);
            }
        }
        if (!(z)) {
            c3.setVisibility(8);
        }
        if (alertController.f219G != null) {
            c.addView(alertController.f219G, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.f234c.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.f216D = (ImageView) alertController.f234c.findViewById(16908294);
            if (!(!TextUtils.isEmpty(alertController.f236e)) || !alertController.f228P) {
                alertController.f234c.findViewById(R.id.title_template).setVisibility(8);
                alertController.f216D.setVisibility(8);
                c.setVisibility(8);
            } else {
                TextView textView2 = (TextView) alertController.f234c.findViewById(R.id.alertTitle);
                alertController.f217E = textView2;
                textView2.setText(alertController.f236e);
                int i5 = alertController.f214B;
                if (i5 != 0) {
                    alertController.f216D.setImageResource(i5);
                } else {
                    Drawable drawable4 = alertController.f215C;
                    if (drawable4 != null) {
                        alertController.f216D.setImageDrawable(drawable4);
                    } else {
                        alertController.f217E.setPadding(alertController.f216D.getPaddingLeft(), alertController.f216D.getPaddingTop(), alertController.f216D.getPaddingRight(), alertController.f216D.getPaddingBottom());
                        alertController.f216D.setVisibility(8);
                    }
                }
            }
        }
        boolean z4 = viewGroup.getVisibility() != 8;
        boolean z5 = (c == null || c.getVisibility() == 8) ? false : true;
        boolean z6 = c3.getVisibility() != 8;
        if (!z6 && (findViewById = c2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (z5) {
            NestedScrollView nestedScrollView2 = alertController.f213A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (alertController.f237f == null && alertController.f238g == null) ? view : c.findViewById(R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = c2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f238g;
        if (recycleListView instanceof AlertController.RecycleListView) {
            recycleListView.setHasDecor(z5, z6);
        }
        if (!z4) {
            View view3 = alertController.f238g;
            if (view3 == null) {
                view3 = alertController.f213A;
            }
            if (view3 != null) {
                if (z6) {
                    z2 = true;
                }
                View findViewById11 = alertController.f234c.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = alertController.f234c.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2364y.C2375j.m5283d(view3, z5 | z2 ? 1 : 0, 3);
                if (findViewById11 != null) {
                    c2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    c2.removeView(findViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.f238g;
        if (recycleListView2 != null && (listAdapter = alertController.f220H) != null) {
            recycleListView2.setAdapter(listAdapter);
            int i6 = alertController.f221I;
            if (i6 > -1) {
                recycleListView2.setItemChecked(i6, true);
                recycleListView2.setSelection(i6);
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.mAlert.f213A;
        if (nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.mAlert.f213A;
        if (nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setButton(int i, CharSequence charSequence, Message message) {
        this.mAlert.mo1204d(i, charSequence, (DialogInterface.OnClickListener) null, message, (Drawable) null);
    }

    public void setButtonPanelLayoutHint(int i) {
        this.mAlert.f229Q = i;
    }

    public void setCustomTitle(View view) {
        this.mAlert.f219G = view;
    }

    public void setIcon(int i) {
        this.mAlert.mo1205e(i);
    }

    public void setIconAttribute(int i) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        this.mAlert.mo1205e(typedValue.resourceId);
    }

    public void setMessage(CharSequence charSequence) {
        AlertController alertController = this.mAlert;
        alertController.f237f = charSequence;
        TextView textView = alertController.f218F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.mAlert;
        alertController.f236e = charSequence;
        TextView textView = alertController.f217E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setView(View view) {
        AlertController alertController = this.mAlert;
        alertController.f239h = view;
        alertController.f240i = 0;
        alertController.f245n = false;
    }

    public AlertDialog(Context context, int i) {
        super(context, resolveDialogTheme(context, i));
        this.mAlert = new AlertController(getContext(), this, getWindow());
    }

    public void setButton(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.mAlert.mo1204d(i, charSequence, onClickListener, (Message) null, (Drawable) null);
    }

    public void setIcon(Drawable drawable) {
        AlertController alertController = this.mAlert;
        alertController.f215C = drawable;
        alertController.f214B = 0;
        ImageView imageView = alertController.f216D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            alertController.f216D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    public void setButton(int i, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.mAlert.mo1204d(i, charSequence, onClickListener, (Message) null, drawable);
    }

    public AlertDialog(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    public void setView(View view, int i, int i2, int i3, int i4) {
        AlertController alertController = this.mAlert;
        alertController.f239h = view;
        alertController.f240i = 0;
        alertController.f245n = true;
        alertController.f241j = i;
        alertController.f242k = i2;
        alertController.f243l = i3;
        alertController.f244m = i4;
    }
}
