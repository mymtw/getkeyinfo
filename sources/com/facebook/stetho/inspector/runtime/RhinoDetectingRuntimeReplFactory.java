package com.facebook.stetho.inspector.runtime;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.inspector.console.RuntimeRepl;
import com.facebook.stetho.inspector.console.RuntimeReplFactory;
import java.lang.reflect.InvocationTargetException;

public class RhinoDetectingRuntimeReplFactory implements RuntimeReplFactory {
    private final Context mContext;
    /* access modifiers changed from: private */
    public RuntimeException mRhinoJsUnexpectedError;
    private RuntimeReplFactory mRhinoReplFactory;
    private boolean mSearchedForRhinoJs;

    public RhinoDetectingRuntimeReplFactory(Context context) {
        this.mContext = context;
    }

    private static RuntimeReplFactory findRhinoReplFactory(Context context) throws RuntimeException {
        try {
            return (RuntimeReplFactory) Class.forName("com.facebook.stetho.rhino.JsRuntimeReplFactoryBuilder").getDeclaredMethod("defaultFactory", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
        } catch (ClassNotFoundException unused) {
            LogUtil.m20241i("Error finding stetho-js-rhino, cannot enable console evaluation!");
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        }
    }

    public RuntimeRepl newInstance() {
        if (!this.mSearchedForRhinoJs) {
            this.mSearchedForRhinoJs = true;
            try {
                this.mRhinoReplFactory = findRhinoReplFactory(this.mContext);
            } catch (RuntimeException e) {
                this.mRhinoJsUnexpectedError = e;
            }
        }
        RuntimeReplFactory runtimeReplFactory = this.mRhinoReplFactory;
        return runtimeReplFactory != null ? runtimeReplFactory.newInstance() : new RuntimeRepl() {
            public Object evaluate(String str) throws Exception {
                if (RhinoDetectingRuntimeReplFactory.this.mRhinoJsUnexpectedError == null) {
                    return "Not supported without stetho-js-rhino dependency";
                }
                StringBuilder h = C0072d.m201h("stetho-js-rhino threw: ");
                h.append(RhinoDetectingRuntimeReplFactory.this.mRhinoJsUnexpectedError.toString());
                return h.toString();
            }
        };
    }
}
