package com.qualtrics.qsiframework;

import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.etsy.android.lib.requests.EtsyRequest;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import p003a2.C0023f;
import p610kp.C18159a;
import p610kp.C18161c;

@Deprecated
public class QSIView extends WebView {
    private C17330b _callbackInterface = null;
    private String mBrandId = "ally";
    private String mInterceptId;
    private boolean mPageLoading = false;
    /* access modifiers changed from: private */
    public boolean mPageReady = false;
    /* access modifiers changed from: private */
    public boolean mQSIReady = false;
    private String mZoneId;
    /* access modifiers changed from: private */
    public QSIEventListener qsiEvents;
    /* access modifiers changed from: private */
    public ArrayList<C17334c> queuedVariables;
    /* access modifiers changed from: private */
    public Handler uiHandler = new Handler();

    public interface QSIEventListener {

        public enum Error {
            NETWORK_ERROR,
            UNAVAILABLE_INVALID,
            NO_CREATIVE
        }

        /* renamed from: a */
        void mo68284a();

        void onClose();
    }

    /* renamed from: com.qualtrics.qsiframework.QSIView$a */
    public class C17329a extends WebViewClient {
        public C17329a() {
        }

        public final void onPageFinished(WebView webView, String str) {
            Log.i("QSI", "onPageFinished ");
            boolean unused = QSIView.this.mPageReady = true;
            CookieManager.getInstance().setAcceptCookie(true);
            if (QSIView.this.queuedVariables.size() > 0) {
                QSIView.this.unload();
                Iterator it = QSIView.this.queuedVariables.iterator();
                while (it.hasNext()) {
                    C17334c cVar = (C17334c) it.next();
                    StringBuilder h = C0072d.m201h("putting queued variable: ");
                    h.append(cVar.f37864a.toString());
                    h.append(" value: ");
                    h.append(cVar.f37865b.toString());
                    Log.i("QSI", h.toString());
                    QSIView.this.put(cVar.f37864a, cVar.f37865b, cVar.f37866c);
                }
                QSIView.this.queuedVariables.clear();
                QSIView.this.load();
            }
        }
    }

    /* renamed from: com.qualtrics.qsiframework.QSIView$b */
    public class C17330b {

        /* renamed from: com.qualtrics.qsiframework.QSIView$b$a */
        public class C17331a implements Runnable {
            public C17331a() {
            }

            public final void run() {
                QSIView.this.setClickable(true);
                QSIView.this.setVisibility(0);
                if (QSIView.this.qsiEvents != null) {
                    QSIView.this.qsiEvents.mo68284a();
                }
            }
        }

        /* renamed from: com.qualtrics.qsiframework.QSIView$b$b */
        public class C17332b implements Runnable {
            public C17332b() {
            }

            public final void run() {
                QSIView.this.setVisibility(8);
                if (QSIView.this.qsiEvents != null) {
                    QSIView.this.qsiEvents.onClose();
                }
            }
        }

        /* renamed from: com.qualtrics.qsiframework.QSIView$b$c */
        public class C17333c implements Runnable {
            public C17333c() {
            }

            public final void run() {
                boolean unused = QSIView.this.mQSIReady = true;
                if (QSIView.this.queuedVariables.size() > 0) {
                    QSIView.this.unload();
                    Iterator it = QSIView.this.queuedVariables.iterator();
                    while (it.hasNext()) {
                        C17334c cVar = (C17334c) it.next();
                        StringBuilder h = C0072d.m201h("putting queued variable: ");
                        h.append(cVar.f37864a.toString());
                        h.append(" value: ");
                        h.append(cVar.f37865b.toString());
                        Log.i("QSI", h.toString());
                        QSIView.this.put(cVar.f37864a, cVar.f37865b, cVar.f37866c);
                    }
                    QSIView.this.queuedVariables.clear();
                    QSIView.this.load();
                }
            }
        }

        public C17330b() {
        }

        @JavascriptInterface
        public void onClose() {
            Log.i("QSI", "onClose");
            QSIView.this.uiHandler.post(new C17332b());
        }

        @JavascriptInterface
        public void onError(String str) {
            Log.i("QSI", "onError: " + str);
        }

        @JavascriptInterface
        public void onMessage(String str) {
            Log.i("QSI", "onMessage: " + str);
        }

        @JavascriptInterface
        public void onOpen(String str) {
            Log.i("QSI", "onOpen");
            QSIView.this.uiHandler.post(new C17331a());
            try {
                Log.i("QSI", str);
                new JSONObject(str);
            } catch (Exception e) {
                Log.i("QSI", e.toString());
            }
        }

        @JavascriptInterface
        public void onQSIReady() {
            Log.i("QSI", "--onQSIReady()--");
            QSIView.this.uiHandler.post(new C17333c());
        }
    }

    /* renamed from: com.qualtrics.qsiframework.QSIView$c */
    public class C17334c {

        /* renamed from: a */
        public String f37864a;

        /* renamed from: b */
        public String f37865b;

        /* renamed from: c */
        public boolean f37866c;

        public C17334c(String str, String str2, boolean z) {
            this.f37864a = str;
            this.f37865b = str2;
            this.f37866c = z;
        }
    }

    public QSIView(Context context, String str, String str2, String str3) {
        super(context);
        this.mInterceptId = str;
        this.mZoneId = str2;
        this.mBrandId = str3;
        init((AttributeSet) null, 0);
    }

    private void executeJS(String str, Object... objArr) {
        StringBuilder l = C0023f.m111l("javascript:try{", str, "(");
        int length = objArr.length;
        String str2 = "";
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            l.append(str2);
            boolean z = obj instanceof String;
            if (z) {
                l.append("'");
            }
            l.append(obj);
            if (z) {
                l.append("'");
            }
            i++;
            str2 = ",";
        }
        l.append(")}catch(error){native.onError(error)}");
        try {
            loadUrl(l.toString());
        } catch (Exception e) {
            Log.i("QSI", e.getMessage());
        }
    }

    private void executeJSExpression(String str) {
        loadUrl(String.format("javascript:try{%s}catch(error){native.onError(error.message)}", new Object[]{str}));
    }

    private String getHTML() {
        String str = this.mZoneId;
        String str2 = this.mBrandId;
        String str3 = this.mInterceptId;
        return String.format("<!doctype html><html><head><meta name='viewport' content='initial-scale=1' /><style>html, body {background-color: transparent;}.QSIPopOver {background-color: transparent !important;}.QSIEmbeddedTarget > div {border: none !important;border-radius: 3px !important;background-color: rgba(0,0,0,.5) !important;-webkit-animation: target-anim .6s;}@-webkit-keyframes target-anim {from {opacity: 0;-webkit-transform: scale(.7);}to {opacity: 1;-webkit-transform: scale(1);}}</style></head><body><div id='%s'></div><script src='https://%s-%s.siteintercept.qualtrics.com/WRSiteInterceptEngine/?Q_SIID=%s'></script><script type='text/javascript'>function getInterceptProperties(){return{'fullTargetUrl':QSI.util.tryGetTarget(),'targetUrl':QSI.reg[interceptId].options.targetURL,'type':QSI.reg[interceptId].type,'actionOptions':QSI.reg[interceptId].actionOptions}}function putVar(e,n,t){t?localStorage[e]=n:AppSI[e]=n}function load(){console.log(QSI.API.unloading),QSI?(QSI.API.load(),setInterceptListeners()):console.log(\"no QSI\")}function close(){document.querySelector('.QSIEmbeddedTarget').parentNode.removeChild(document.querySelector('.QSIEmbeddedTarget')),console.log('CLOSE CALLED')}function unload(){QSI?(QSI.API.unload(),console.log('unloaded')):console.log('did not unload')}function setInterceptListeners(){setTimeout(function(){QSI.reg&&QSI.reg[interceptId]&&!QSI.InterceptsRan?(QSI.util.removeObservers(),QSI.API.run()):setInterceptListeners()},100)}function handleIntercept(){if(QSI&&QSI.reg&&QSI.reg[interceptId]&&(QSI.reg[interceptId].willShow||QSI.reg[interceptId].displayed)){native.onQSIReady();try{var e=QSI.reg[interceptId].willShow||QSI.reg[interceptId].displayed;e.then(function(){native.onOpen(JSON.stringify(getInterceptProperties())),QSI.reg[interceptId].container&&QSI.reg[interceptId].container.addEventListener(\"DOMNodeRemoved\",function(){if(QSI.reg[interceptId].actionOptions&&QSI.reg[interceptId].actionOptions.targetEmbedded){var e=document.querySelector(\".QSIEmbeddedTarget\");e?(document.querySelector(\"iframe\").addEventListener(\"load\",function(){native.onMessage(\"frameloaded\")}),e.addEventListener(\"DOMNodeRemoved\",function(){native.onClose()})):native.onClose()}else native.onClose()})})}catch(n){native.onError(n.message||n||\"unknown error\")}}else setTimeout(function(){handleIntercept()},100)}function getVar(e){return localStorage.hasOwnProperty(e)?localStorage[e]:AppSI.hasOwnProperty(e)?AppSI[e]:\"\"}window.AppSI={},window.interceptId=\"%s\",window.zoneId=\"%s\",window.brandId=\"%s\",window.__interval=null,document.body.addEventListener(\"Resolved\",function(){window.depsResolved=!0,window.runningIntercept=!1,console.log(\"--RESOLVED--\"),native.onMessage(\"--resolved--\"),handleIntercept()},!1);</script></body></html>", new Object[]{str, str2, str3, str3, str3, str, str2, str3});
    }

    private void init(AttributeSet attributeSet, int i) {
        Log.i("QSI", "--INIT--");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C18161c.f39683b, i, 0);
            this.mInterceptId = obtainStyledAttributes.getString(1);
            this.mZoneId = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
        }
        this.queuedVariables = new ArrayList<>();
        setBackgroundColor(0);
        setPadding(0, 0, 0, 0);
        setZ(Float.MAX_VALUE);
        setVisibility(8);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setUseWideViewPort(true);
        C17330b bVar = new C17330b();
        this._callbackInterface = bVar;
        addJavascriptInterface(bVar, "native");
        setWebViewClient(new C17329a());
    }

    public void clearPersistentVariables() {
        executeJSExpression("localStorage.clear()");
    }

    public void clearTemporaryVariables() {
        executeJSExpression("AppSI={}");
    }

    public String getBrandId() {
        return this.mBrandId;
    }

    public Fragment getFragment() {
        QSIFragment qSIFragment = new QSIFragment();
        qSIFragment.init(getWebView());
        return qSIFragment;
    }

    public String getInterceptId() {
        return this.mInterceptId;
    }

    public QSIEventListener getQsiEvents() {
        return this.qsiEvents;
    }

    public androidx.fragment.app.Fragment getSupportFragment() {
        QSISupportFragment qSISupportFragment = new QSISupportFragment();
        qSISupportFragment.init(getWebView());
        return qSISupportFragment;
    }

    public QSIView getWebView() {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeAllViews();
        }
        StringBuilder h = C0072d.m201h("WIDTH: ");
        h.append(getWidth());
        Log.i("QSI", h.toString());
        Log.i("QSI", "HEIGHT: " + getHeight());
        return this;
    }

    public String getZoneId() {
        return this.mZoneId;
    }

    public void load() {
        Log.i("QSI", "load");
        if (this.mPageReady) {
            Log.i("QSI", "mPageReady true");
            executeJSExpression("load()");
        } else if (!this.mPageLoading && !this.mQSIReady) {
            Log.i("QSI", "!mPageLoading && !mQSIReady");
            this.mPageLoading = true;
        }
    }

    public void put(String str, String str2, boolean z) {
        Log.i("QSI", String.format("::put %s - %s", new Object[]{str, str2}));
        if (this.mPageReady) {
            executeJS("putVar", str, str2, Boolean.valueOf(z));
            return;
        }
        Log.i("QSI", "queue var");
        this.queuedVariables.add(new C17334c(str, str2, z));
    }

    public void removeOnCloseCallback() {
        this._callbackInterface.getClass();
    }

    public void removeOnOpenCallback() {
        this._callbackInterface.getClass();
    }

    public void setBrandId(String str) {
        this.mBrandId = str;
    }

    public void setInterceptId(String str) {
        this.mInterceptId = str;
    }

    public void setOnCloseCallback(C18159a aVar) {
        this._callbackInterface.getClass();
    }

    public void setOnOpenCallback(C18159a aVar) {
        this._callbackInterface.getClass();
    }

    public void setQsiEvents(QSIEventListener qSIEventListener) {
        this.qsiEvents = qSIEventListener;
    }

    public void setZoneId(String str) {
        this.mZoneId = str;
    }

    public void start() {
        Log.i("QSI", "start");
        loadDataWithBaseURL("https://qualtrics.com", getHTML(), "text/html", EtsyRequest.CONTENT_ENCODING, (String) null);
    }

    public void unload() {
        Log.i("QSI", "UNLOADING OUT");
        if (this.mPageReady) {
            Log.i("QSI", "UNLOADING IN");
            removeOnCloseCallback();
            executeJSExpression("close()");
            executeJSExpression("unload()");
        }
    }

    public QSIView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, 0);
    }

    public QSIView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet, i);
    }
}
