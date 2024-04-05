package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.widget.C0326j;
import androidx.appcompat.widget.C0340p0;
import androidx.appcompat.widget.C0359y;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.C2277b;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p003a2.C0023f;
import p628nj.C18263b;

public class SupportMenuInflater extends MenuInflater {
    public static final Class<?>[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE;
    public static final Class<?>[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
    public static final String LOG_TAG = "SupportMenuInflater";
    public static final int NO_ID = 0;
    private static final String XML_GROUP = "group";
    private static final String XML_ITEM = "item";
    private static final String XML_MENU = "menu";
    public final Object[] mActionProviderConstructorArguments;
    public final Object[] mActionViewConstructorArguments;
    public Context mContext;
    private Object mRealOwner;

    /* renamed from: androidx.appcompat.view.SupportMenuInflater$a */
    public static class C0192a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public static final Class<?>[] f510d = {MenuItem.class};

        /* renamed from: b */
        public Object f511b;

        /* renamed from: c */
        public Method f512c;

        public C0192a(Object obj, String str) {
            this.f511b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f512c = cls.getMethod(str, f510d);
            } catch (Exception e) {
                InflateException inflateException = new InflateException(C0326j.m862g(cls, C0023f.m111l("Couldn't resolve menu item onClick handler ", str, " in class ")));
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f512c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f512c.invoke(this.f511b, new Object[]{menuItem})).booleanValue();
                }
                this.f512c.invoke(this.f511b, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.SupportMenuInflater$b */
    public class C0193b {

        /* renamed from: A */
        public CharSequence f513A;

        /* renamed from: B */
        public CharSequence f514B;

        /* renamed from: C */
        public ColorStateList f515C = null;

        /* renamed from: D */
        public PorterDuff.Mode f516D = null;

        /* renamed from: a */
        public Menu f518a;

        /* renamed from: b */
        public int f519b;

        /* renamed from: c */
        public int f520c;

        /* renamed from: d */
        public int f521d;

        /* renamed from: e */
        public int f522e;

        /* renamed from: f */
        public boolean f523f;

        /* renamed from: g */
        public boolean f524g;

        /* renamed from: h */
        public boolean f525h;

        /* renamed from: i */
        public int f526i;

        /* renamed from: j */
        public int f527j;

        /* renamed from: k */
        public CharSequence f528k;

        /* renamed from: l */
        public CharSequence f529l;

        /* renamed from: m */
        public int f530m;

        /* renamed from: n */
        public char f531n;

        /* renamed from: o */
        public int f532o;

        /* renamed from: p */
        public char f533p;

        /* renamed from: q */
        public int f534q;

        /* renamed from: r */
        public int f535r;

        /* renamed from: s */
        public boolean f536s;

        /* renamed from: t */
        public boolean f537t;

        /* renamed from: u */
        public boolean f538u;

        /* renamed from: v */
        public int f539v;

        /* renamed from: w */
        public int f540w;

        /* renamed from: x */
        public String f541x;

        /* renamed from: y */
        public String f542y;

        /* renamed from: z */
        public C2277b f543z;

        public C0193b(Menu menu) {
            this.f518a = menu;
            this.f519b = 0;
            this.f520c = 0;
            this.f521d = 0;
            this.f522e = 0;
            this.f523f = true;
            this.f524g = true;
        }

        /* renamed from: a */
        public final <T> T mo1613a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, SupportMenuInflater.this.mContext.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w(SupportMenuInflater.LOG_TAG, "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: b */
        public final void mo1614b(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f536s).setVisible(this.f537t).setEnabled(this.f538u).setCheckable(this.f535r >= 1).setTitleCondensed(this.f529l).setIcon(this.f530m);
            int i = this.f539v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f542y != null) {
                if (!SupportMenuInflater.this.mContext.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C0192a(SupportMenuInflater.this.getRealOwner(), this.f542y));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f535r >= 2) {
                if (menuItem instanceof MenuItemImpl) {
                    ((MenuItemImpl) menuItem).setExclusiveCheckable(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    ((MenuItemWrapperICS) menuItem).setExclusiveCheckable(true);
                }
            }
            String str = this.f541x;
            if (str != null) {
                menuItem.setActionView((View) mo1613a(str, SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE, SupportMenuInflater.this.mActionViewConstructorArguments));
                z = true;
            }
            int i2 = this.f540w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w(SupportMenuInflater.LOG_TAG, "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C2277b bVar = this.f543z;
            if (bVar != null) {
                if (menuItem instanceof SupportMenuItem) {
                    ((SupportMenuItem) menuItem).setSupportActionProvider(bVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.f513A;
            boolean z2 = menuItem instanceof SupportMenuItem;
            if (z2) {
                ((SupportMenuItem) menuItem).setContentDescription(charSequence);
            } else {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.f514B;
            if (z2) {
                ((SupportMenuItem) menuItem).setTooltipText(charSequence2);
            } else {
                menuItem.setTooltipText(charSequence2);
            }
            char c = this.f531n;
            int i3 = this.f532o;
            if (z2) {
                ((SupportMenuItem) menuItem).setAlphabeticShortcut(c, i3);
            } else {
                menuItem.setAlphabeticShortcut(c, i3);
            }
            char c2 = this.f533p;
            int i4 = this.f534q;
            if (z2) {
                ((SupportMenuItem) menuItem).setNumericShortcut(c2, i4);
            } else {
                menuItem.setNumericShortcut(c2, i4);
            }
            PorterDuff.Mode mode = this.f516D;
            if (mode != null) {
                if (z2) {
                    ((SupportMenuItem) menuItem).setIconTintMode(mode);
                } else {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.f515C;
            if (colorStateList == null) {
                return;
            }
            if (z2) {
                ((SupportMenuItem) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            ACTION_VIEW_CONSTRUCTOR_SIGNATURE = r0
            ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.SupportMenuInflater.<clinit>():void");
    }

    public SupportMenuInflater(Context context) {
        super(context);
        this.mContext = context;
        Object[] objArr = {context};
        this.mActionViewConstructorArguments = objArr;
        this.mActionProviderConstructorArguments = objArr;
    }

    private Object findRealOwner(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? findRealOwner(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void parseMenu(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ColorStateList colorStateList;
        AttributeSet attributeSet2 = attributeSet;
        C0193b bVar = new C0193b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals(XML_MENU)) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException(C0326j.m864i("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlPullParser xmlPullParser2 = xmlPullParser;
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            XmlPullParser xmlPullParser3 = xmlPullParser;
                            str = null;
                            z2 = false;
                            eventType = xmlPullParser.next();
                        } else if (name2.equals(XML_GROUP)) {
                            bVar.f519b = 0;
                            bVar.f520c = 0;
                            bVar.f521d = 0;
                            bVar.f522e = 0;
                            bVar.f523f = true;
                            bVar.f524g = true;
                        } else if (name2.equals(XML_ITEM)) {
                            if (!bVar.f525h) {
                                C2277b bVar2 = bVar.f543z;
                                if (bVar2 == null || !bVar2.mo1956a()) {
                                    bVar.f525h = true;
                                    bVar.mo1614b(bVar.f518a.add(bVar.f519b, bVar.f526i, bVar.f527j, bVar.f528k));
                                } else {
                                    bVar.f525h = true;
                                    bVar.mo1614b(bVar.f518a.addSubMenu(bVar.f519b, bVar.f526i, bVar.f527j, bVar.f528k).getItem());
                                }
                            }
                        } else if (name2.equals(XML_MENU)) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals(XML_GROUP)) {
                        TypedArray obtainStyledAttributes = SupportMenuInflater.this.mContext.obtainStyledAttributes(attributeSet2, C18263b.f40087x);
                        bVar.f519b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar.f520c = obtainStyledAttributes.getInt(3, 0);
                        bVar.f521d = obtainStyledAttributes.getInt(4, 0);
                        bVar.f522e = obtainStyledAttributes.getInt(5, 0);
                        bVar.f523f = obtainStyledAttributes.getBoolean(2, true);
                        bVar.f524g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals(XML_ITEM)) {
                        Context context = SupportMenuInflater.this.mContext;
                        C0340p0 p0Var = new C0340p0(context, context.obtainStyledAttributes(attributeSet2, C18263b.f40088y));
                        bVar.f526i = p0Var.mo3105i(2, 0);
                        bVar.f527j = (p0Var.mo3104h(5, bVar.f520c) & SupportMenu.CATEGORY_MASK) | (p0Var.mo3104h(6, bVar.f521d) & SupportMenu.USER_MASK);
                        bVar.f528k = p0Var.mo3107k(7);
                        bVar.f529l = p0Var.mo3107k(8);
                        bVar.f530m = p0Var.mo3105i(0, 0);
                        String j = p0Var.mo3106j(9);
                        bVar.f531n = j == null ? 0 : j.charAt(0);
                        bVar.f532o = p0Var.mo3104h(16, RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT);
                        String j2 = p0Var.mo3106j(10);
                        bVar.f533p = j2 == null ? 0 : j2.charAt(0);
                        bVar.f534q = p0Var.mo3104h(20, RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT);
                        if (p0Var.mo3108l(11)) {
                            bVar.f535r = p0Var.mo3097a(11, false) ? 1 : 0;
                        } else {
                            bVar.f535r = bVar.f522e;
                        }
                        bVar.f536s = p0Var.mo3097a(3, false);
                        bVar.f537t = p0Var.mo3097a(4, bVar.f523f);
                        bVar.f538u = p0Var.mo3097a(1, bVar.f524g);
                        bVar.f539v = p0Var.mo3104h(21, -1);
                        bVar.f542y = p0Var.mo3106j(12);
                        bVar.f540w = p0Var.mo3105i(13, 0);
                        bVar.f541x = p0Var.mo3106j(15);
                        String j3 = p0Var.mo3106j(14);
                        boolean z3 = j3 != null;
                        if (z3 && bVar.f540w == 0 && bVar.f541x == null) {
                            bVar.f543z = (C2277b) bVar.mo1613a(j3, ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE, SupportMenuInflater.this.mActionProviderConstructorArguments);
                        } else {
                            if (z3) {
                                Log.w(LOG_TAG, "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar.f543z = null;
                        }
                        bVar.f513A = p0Var.mo3107k(17);
                        bVar.f514B = p0Var.mo3107k(22);
                        if (p0Var.mo3108l(19)) {
                            bVar.f516D = C0359y.m997d(p0Var.mo3104h(19, -1), bVar.f516D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            bVar.f516D = null;
                        }
                        if (p0Var.mo3108l(18)) {
                            bVar.f515C = p0Var.mo3098b(18);
                        } else {
                            bVar.f515C = colorStateList;
                        }
                        p0Var.mo3109n();
                        bVar.f525h = false;
                    } else {
                        if (name3.equals(XML_MENU)) {
                            bVar.f525h = true;
                            SubMenu addSubMenu = bVar.f518a.addSubMenu(bVar.f519b, bVar.f526i, bVar.f527j, bVar.f528k);
                            bVar.mo1614b(addSubMenu.getItem());
                            parseMenu(xmlPullParser, attributeSet2, addSubMenu);
                        } else {
                            XmlPullParser xmlPullParser4 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser.next();
                    }
                }
                XmlPullParser xmlPullParser5 = xmlPullParser;
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public Object getRealOwner() {
        if (this.mRealOwner == null) {
            this.mRealOwner = findRealOwner(this.mContext);
        }
        return this.mRealOwner;
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.mContext.getResources().getLayout(i);
            parseMenu(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
