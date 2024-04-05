package com.facebook.internal.logging.dumpsys;

import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.animation.C0388a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;

public final class AndroidRootResolver {

    /* renamed from: a */
    public boolean f27381a;

    /* renamed from: b */
    public Object f27382b;

    /* renamed from: c */
    public Field f27383c;

    /* renamed from: d */
    public Field f27384d;

    public static final class ListenableArrayList extends ArrayList<View> {
        private C12274a listener;

        public /* bridge */ boolean contains(View view) {
            return super.contains(view);
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ int indexOf(View view) {
            return super.indexOf(view);
        }

        public /* bridge */ int lastIndexOf(View view) {
            return super.lastIndexOf(view);
        }

        public final /* bridge */ View remove(int i) {
            return remove(i);
        }

        /* renamed from: removeAt */
        public View remove(int i) {
            View view = (View) super.remove(i);
            C12274a aVar = this.listener;
            if (aVar != null) {
                aVar.mo39464c();
                C12274a aVar2 = this.listener;
                if (aVar2 != null) {
                    aVar2.mo39462a();
                }
            }
            return view;
        }

        public final void setListener(C12274a aVar) {
            this.listener = aVar;
        }

        public final /* bridge */ int size() {
            return getSize();
        }

        public boolean add(View view) {
            C12274a aVar;
            boolean add = super.add(view);
            if (add && (aVar = this.listener) != null) {
                aVar.mo39463b();
                C12274a aVar2 = this.listener;
                if (aVar2 != null) {
                    aVar2.mo39462a();
                }
            }
            return add;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj != null ? obj instanceof View : true) {
                return contains((View) obj);
            }
            return false;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (obj != null ? obj instanceof View : true) {
                return indexOf((View) obj);
            }
            return -1;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj != null ? obj instanceof View : true) {
                return lastIndexOf((View) obj);
            }
            return -1;
        }

        public final /* bridge */ boolean remove(Object obj) {
            if (obj != null ? obj instanceof View : true) {
                return remove((View) obj);
            }
            return false;
        }

        public boolean remove(View view) {
            C12274a aVar;
            boolean remove = super.remove(view);
            if (remove && (aVar = this.listener) != null && (view instanceof View)) {
                aVar.mo39464c();
                C12274a aVar2 = this.listener;
                if (aVar2 != null) {
                    aVar2.mo39462a();
                }
            }
            return remove;
        }
    }

    /* renamed from: com.facebook.internal.logging.dumpsys.AndroidRootResolver$a */
    public interface C12274a {
        /* renamed from: a */
        void mo39462a();

        /* renamed from: b */
        void mo39463b();

        /* renamed from: c */
        void mo39464c();
    }

    /* renamed from: com.facebook.internal.logging.dumpsys.AndroidRootResolver$b */
    public static final class C12275b {

        /* renamed from: a */
        public final View f27385a;

        /* renamed from: b */
        public final WindowManager.LayoutParams f27386b;

        public C12275b(View view, WindowManager.LayoutParams layoutParams) {
            C19383o.m32797g(view, "view");
            C19383o.m32797g(layoutParams, "param");
            this.f27385a = view;
            this.f27386b = layoutParams;
        }
    }

    /* renamed from: a */
    public final ArrayList mo39446a() {
        if (!this.f27381a) {
            this.f27381a = true;
            try {
                Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
                Method method = cls.getMethod("getInstance", new Class[0]);
                C19383o.m32796f(method, "clazz.getMethod(instanceMethod)");
                this.f27382b = method.invoke((Object) null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mViews");
                this.f27383c = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
                Field declaredField2 = cls.getDeclaredField("mParams");
                this.f27384d = declaredField2;
                if (declaredField2 != null) {
                    declaredField2.setAccessible(true);
                }
            } catch (InvocationTargetException e) {
                Log.d("AndroidRootResolver", C0388a.m1049e(new Object[]{"getInstance", "android.view.WindowManagerGlobal"}, 2, "could not invoke: %s on %s", "java.lang.String.format(format, *args)"), e.getCause());
            } catch (ClassNotFoundException e2) {
                String format = String.format("could not find class: %s", Arrays.copyOf(new Object[]{"android.view.WindowManagerGlobal"}, 1));
                C19383o.m32796f(format, "java.lang.String.format(format, *args)");
                Log.d("AndroidRootResolver", format, e2);
            } catch (NoSuchFieldException e3) {
                String format2 = String.format("could not find field: %s or %s on %s", Arrays.copyOf(new Object[]{"mParams", "mViews", "android.view.WindowManagerGlobal"}, 3));
                C19383o.m32796f(format2, "java.lang.String.format(format, *args)");
                Log.d("AndroidRootResolver", format2, e3);
            } catch (NoSuchMethodException e4) {
                String format3 = String.format("could not find method: %s on %s", Arrays.copyOf(new Object[]{"getInstance", "android.view.WindowManagerGlobal"}, 2));
                C19383o.m32796f(format3, "java.lang.String.format(format, *args)");
                Log.d("AndroidRootResolver", format3, e4);
            } catch (RuntimeException e5) {
                String format4 = String.format("reflective setup failed using obj: %s method: %s field: %s", Arrays.copyOf(new Object[]{"android.view.WindowManagerGlobal", "getInstance", "mViews"}, 3));
                C19383o.m32796f(format4, "java.lang.String.format(format, *args)");
                Log.d("AndroidRootResolver", format4, e5);
            } catch (IllegalAccessException e6) {
                String format5 = String.format("reflective setup failed using obj: %s method: %s field: %s", Arrays.copyOf(new Object[]{"android.view.WindowManagerGlobal", "getInstance", "mViews"}, 3));
                C19383o.m32796f(format5, "java.lang.String.format(format, *args)");
                Log.d("AndroidRootResolver", format5, e6);
            }
        }
        Object obj = this.f27382b;
        if (obj == null) {
            Log.d("AndroidRootResolver", "No reflective access to windowmanager object.");
            return null;
        }
        Field field = this.f27383c;
        if (field == null) {
            Log.d("AndroidRootResolver", "No reflective access to mViews");
            return null;
        } else if (this.f27384d == null) {
            Log.d("AndroidRootResolver", "No reflective access to mPArams");
            return null;
        } else {
            try {
                List list = (List) field.get(obj);
                Field field2 = this.f27384d;
                List list2 = (List) (field2 != null ? field2.get(this.f27382b) : null);
                ArrayList arrayList = new ArrayList();
                if (list == null) {
                    list = EmptyList.INSTANCE;
                }
                if (list2 == null) {
                    list2 = EmptyList.INSTANCE;
                }
                Iterator it = C19327t.m32667w1(list, list2).iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    arrayList.add(new C12275b((View) pair.component1(), (WindowManager.LayoutParams) pair.component2()));
                }
                return arrayList;
            } catch (RuntimeException e7) {
                String format6 = String.format("Reflective access to %s or %s on %s failed.", Arrays.copyOf(new Object[]{this.f27383c, this.f27384d, this.f27382b}, 3));
                C19383o.m32796f(format6, "java.lang.String.format(format, *args)");
                Log.d("AndroidRootResolver", format6, e7);
                return null;
            } catch (IllegalAccessException e8) {
                String format7 = String.format("Reflective access to %s or %s on %s failed.", Arrays.copyOf(new Object[]{this.f27383c, this.f27384d, this.f27382b}, 3));
                C19383o.m32796f(format7, "java.lang.String.format(format, *args)");
                Log.d("AndroidRootResolver", format7, e8);
                return null;
            }
        }
    }
}
