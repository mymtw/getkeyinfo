package org.apache.commons.lang3.event;

import android.support.p013v4.media.C0072d;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.reflect.MethodUtils;

public class EventUtils {

    public static class EventBindingInvocationHandler implements InvocationHandler {
        private final Set<String> eventTypes;
        private final String methodName;
        private final Object target;

        public EventBindingInvocationHandler(Object obj, String str, String[] strArr) {
            this.target = obj;
            this.methodName = str;
            this.eventTypes = new HashSet(Arrays.asList(strArr));
        }

        private boolean hasMatchingParametersMethod(Method method) {
            return MethodUtils.getAccessibleMethod(this.target.getClass(), this.methodName, method.getParameterTypes()) != null;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (this.eventTypes.isEmpty() || this.eventTypes.contains(method.getName())) {
                return hasMatchingParametersMethod(method) ? MethodUtils.invokeMethod(this.target, this.methodName, objArr) : MethodUtils.invokeMethod(this.target, this.methodName, new Object[0]);
            }
            return null;
        }
    }

    public static <L> void addEventListener(Object obj, Class<L> cls, L l) {
        try {
            MethodUtils.invokeMethod(obj, "add" + cls.getSimpleName(), l);
        } catch (NoSuchMethodException unused) {
            StringBuilder h = C0072d.m201h("Class ");
            h.append(obj.getClass().getName());
            h.append(" does not have a public add");
            h.append(cls.getSimpleName());
            h.append(" method which takes a parameter of type ");
            h.append(cls.getName());
            h.append(".");
            throw new IllegalArgumentException(h.toString());
        } catch (IllegalAccessException unused2) {
            StringBuilder h2 = C0072d.m201h("Class ");
            h2.append(obj.getClass().getName());
            h2.append(" does not have an accessible add");
            h2.append(cls.getSimpleName());
            h2.append(" method which takes a parameter of type ");
            h2.append(cls.getName());
            h2.append(".");
            throw new IllegalArgumentException(h2.toString());
        } catch (InvocationTargetException e) {
            throw new RuntimeException("Unable to add listener.", e.getCause());
        }
    }

    public static <L> void bindEventsToMethod(Object obj, String str, Object obj2, Class<L> cls, String... strArr) {
        addEventListener(obj2, cls, cls.cast(Proxy.newProxyInstance(obj.getClass().getClassLoader(), new Class[]{cls}, new EventBindingInvocationHandler(obj, str, strArr))));
    }
}
