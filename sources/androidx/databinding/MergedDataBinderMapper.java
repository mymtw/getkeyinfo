package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MergedDataBinderMapper extends C2445e {

    /* renamed from: a */
    public HashSet f5692a = new HashSet();

    /* renamed from: b */
    public CopyOnWriteArrayList f5693b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public CopyOnWriteArrayList f5694c = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final void mo9159a(C2445e eVar) {
        if (this.f5692a.add(eVar.getClass())) {
            this.f5693b.add(eVar);
            for (C2445e a : eVar.collectDependencies()) {
                mo9159a(a);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo9160b() {
        Iterator it = this.f5694c.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Class<?> cls = Class.forName(str);
                if (C2445e.class.isAssignableFrom(cls)) {
                    mo9159a((C2445e) cls.newInstance());
                    this.f5694c.remove(str);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e);
            } catch (InstantiationException e2) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e2);
            }
        }
        return z;
    }

    public final String convertBrIdToString(int i) {
        Iterator it = this.f5693b.iterator();
        while (it.hasNext()) {
            String convertBrIdToString = ((C2445e) it.next()).convertBrIdToString(i);
            if (convertBrIdToString != null) {
                return convertBrIdToString;
            }
        }
        if (mo9160b()) {
            return convertBrIdToString(i);
        }
        return null;
    }

    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        Iterator it = this.f5693b.iterator();
        while (it.hasNext()) {
            ViewDataBinding dataBinder = ((C2445e) it.next()).getDataBinder(dataBindingComponent, view, i);
            if (dataBinder != null) {
                return dataBinder;
            }
        }
        if (mo9160b()) {
            return getDataBinder(dataBindingComponent, view, i);
        }
        return null;
    }

    public final int getLayoutId(String str) {
        Iterator it = this.f5693b.iterator();
        while (it.hasNext()) {
            int layoutId = ((C2445e) it.next()).getLayoutId(str);
            if (layoutId != 0) {
                return layoutId;
            }
        }
        if (mo9160b()) {
            return getLayoutId(str);
        }
        return 0;
    }

    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        Iterator it = this.f5693b.iterator();
        while (it.hasNext()) {
            ViewDataBinding dataBinder = ((C2445e) it.next()).getDataBinder(dataBindingComponent, viewArr, i);
            if (dataBinder != null) {
                return dataBinder;
            }
        }
        if (mo9160b()) {
            return getDataBinder(dataBindingComponent, viewArr, i);
        }
        return null;
    }
}
