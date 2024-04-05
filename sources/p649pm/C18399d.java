package p649pm;

import android.util.Log;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import p722ym.C18895a;

/* renamed from: pm.d */
public final /* synthetic */ class C18399d implements C18895a {

    /* renamed from: a */
    public final /* synthetic */ String f40472a;

    public /* synthetic */ C18399d(String str) {
        this.f40472a = str;
    }

    public final Object get() {
        String str = this.f40472a;
        try {
            Class<?> cls = Class.forName(str);
            if (C18401f.class.isAssignableFrom(cls)) {
                return (C18401f) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{str}));
            return null;
        } catch (IllegalAccessException e) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", new Object[]{str}), e);
        } catch (InstantiationException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", new Object[]{str}), e2);
        } catch (NoSuchMethodException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", new Object[]{str}), e3);
        } catch (InvocationTargetException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", new Object[]{str}), e4);
        }
    }
}
