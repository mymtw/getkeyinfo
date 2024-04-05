package com.qualtrics.qsiframework;

import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.etsy.android.lib.requests.EtsyRequest;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import p610kp.C18159a;
import p610kp.C18161c;

@Deprecated
public class QSIEngine extends WebView {
    /* access modifiers changed from: private */
    public static String LOG_TAG = "QSI";
    /* access modifiers changed from: private */
    public String mBrandId;
    private C17324b mCallbackInterface;
    /* access modifiers changed from: private */
    public String mInterceptId;
    /* access modifiers changed from: private */
    public boolean mPageLoaded = false;
    private boolean mPageLoading = false;
    /* access modifiers changed from: private */
    public boolean mPageReady = false;
    /* access modifiers changed from: private */
    public boolean mQSIReady = false;
    /* access modifiers changed from: private */
    public boolean mShouldDisplay = true;
    private boolean mVerboseLogging = false;
    /* access modifiers changed from: private */
    public String mZoneId;
    /* access modifiers changed from: private */
    public ArrayList<C17328c> queuedVariables;
    /* access modifiers changed from: private */
    public Handler uiHandler = new Handler();

    /* renamed from: com.qualtrics.qsiframework.QSIEngine$b */
    public class C17324b {

        /* renamed from: com.qualtrics.qsiframework.QSIEngine$b$a */
        public class C17325a implements Runnable {
            public C17325a() {
            }

            public final void run() {
                QSIEngine.this.loadQueuedVariables();
                if (QSIEngine.this.mShouldDisplay) {
                    QSIEngine.this.setClickable(true);
                    QSIEngine.this.setVisibility(0);
                }
            }
        }

        /* renamed from: com.qualtrics.qsiframework.QSIEngine$b$b */
        public class C17326b implements Runnable {
            public C17326b() {
            }

            public final void run() {
                QSIEngine.this.setVisibility(8);
                QSIEngine.this.detachWebView();
            }
        }

        /* renamed from: com.qualtrics.qsiframework.QSIEngine$b$c */
        public class C17327c implements Runnable {
            public C17327c() {
            }

            public final void run() {
                boolean unused = QSIEngine.this.mQSIReady = true;
                if (QSIEngine.this.queuedVariables.size() > 0) {
                    Iterator it = QSIEngine.this.queuedVariables.iterator();
                    while (it.hasNext()) {
                        C17328c cVar = (C17328c) it.next();
                        QSIEngine qSIEngine = QSIEngine.this;
                        StringBuilder h = C0072d.m201h("Setting queued variable: ");
                        h.append(cVar.f37856a.toString());
                        h.append(" value: ");
                        h.append(cVar.f37857b.toString());
                        qSIEngine.logMessage(h.toString());
                        QSIEngine.this.put(cVar.f37856a, cVar.f37857b, cVar.f37858c);
                    }
                    QSIEngine.this.queuedVariables.clear();
                }
            }
        }

        public C17324b() {
        }

        @JavascriptInterface
        public void onClose() {
            QSIEngine.this.uiHandler.post(new C17326b());
        }

        @JavascriptInterface
        public void onError(String str) {
            String access$800 = QSIEngine.LOG_TAG;
            Log.e(access$800, "ERROR: " + str);
        }

        @JavascriptInterface
        public void onMessage(String str) {
            QSIEngine qSIEngine = QSIEngine.this;
            qSIEngine.logMessage("Message: " + str);
        }

        @JavascriptInterface
        public void onOpen(String str) {
            QSIEngine.this.uiHandler.post(new C17325a());
            try {
                new JSONObject(str);
            } catch (Exception e) {
                QSIEngine.this.logMessage(e.toString());
            }
        }

        @JavascriptInterface
        public void onReady() {
            QSIEngine.this.logMessage("QUALTRICS INTERCEPT READY");
            QSIEngine.this.uiHandler.post(new C17327c());
        }

        @JavascriptInterface
        public void onResolved() {
            boolean unused = QSIEngine.this.mPageReady = true;
        }
    }

    /* renamed from: com.qualtrics.qsiframework.QSIEngine$c */
    public class C17328c {

        /* renamed from: a */
        public String f37856a;

        /* renamed from: b */
        public String f37857b;

        /* renamed from: c */
        public boolean f37858c;

        public C17328c(String str, String str2, boolean z) {
            this.f37856a = str;
            this.f37857b = str2;
            this.f37858c = z;
        }
    }

    public QSIEngine(Context context, String str, String str2, String str3, boolean z) {
        super(context);
        this.mInterceptId = str;
        this.mZoneId = str2;
        this.mBrandId = str3;
        this.mShouldDisplay = z;
        if (!isInEditMode()) {
            init((AttributeSet) null, 0);
        } else {
            setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public void detachWebView() {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    /* access modifiers changed from: private */
    public void executeJSExpression(String str) {
        loadUrl(String.format("javascript:try{%s}catch(error){native.onError(error.message)}", new Object[]{str}));
    }

    private String getHTML() {
        return "<!doctype html><html><head> <meta name='viewport' content='initial-scale=1, user-scalable=no'/> <style>html, body{background-color: transparent;}.QSIPopOver{background-color: transparent !important;}.QSIEmbeddedTarget>div{border: none !important; border-radius: 3px !important; background-color: rgba(0, 0, 0, .5) !important; -webkit-animation: target-anim .6s;}@-webkit-keyframes target-anim{from{opacity: 0; -webkit-transform: scale(.7);}to{opacity: 1; -webkit-transform: scale(1);}}</style></head><body> <script type='text/javascript'> function loadInterceptCode(e, t, n){try{window.interceptId=e; window.zoneId=t; window.brandId=n; var o=document.createElement('SCRIPT'), d=document.createElement('DIV'); window.focus(); o.onload=function(){onInterceptLoaded(); return window.focus();}; o.setAttribute('id', 'script_' + interceptId); o.src='https://' + zoneId + '-' + brandId + '.siteintercept.qualtrics.com/WRSiteInterceptEngine/?Q_SIID=' + interceptId; d.setAttribute('id', interceptId); document.body.appendChild(o); document.body.appendChild(d); resetCookies(); logMessage('Intercept ' + window.interceptId + ' is loading');}catch (e){logError(e.message);}}function logError(message){native.onError(message);}function logMessage(message){native.onMessage(message);}function getInterceptProperties(){return{'fullTargetUrl': QSI.util.tryGetTarget(), 'targetUrl': QSI.reg[interceptId].options.targetURL, 'type': QSI.reg[interceptId].type, 'actionOptions': QSI.reg[interceptId].actionOptions};}function clearTemporaryVariables(){window.AppSI={}; logMessage('Temporary variables have been cleared');}function clearPersistentVariables(){localStorage.clear(); logMessage('Persistent variables have been cleared');}function putVar(name, value, isPersistent){if(isPersistent){localStorage[name]=value;}else{window.AppSI[name]=value;}logMessage('Variable: ' + name + ' set to ' + value + ', persistent: ' + isPersistent);}function getVar(e){if(localStorage.hasOwnProperty(e)){return localStorage[e];}else if (window.AppSI.hasOwnProperty(e)){return window.AppSI[e];}else{return '';}}function close(){try{document.querySelector('.QSIEmbeddedTarget').parentNode.removeChild(document.querySelector('.QSIEmbeddedTarget'));}catch(e){logMessage('Intercept ' + window.interceptId + ' has been closed');}}function unload(){try{if(typeof QSI !=='undefined' && QSI.API){QSI.API.unload(); close(); logMessage('Intercept ' + window.interceptId + ' unloaded');}else{logMessage('Did not unload intercept ' + window.interceptId + ', could not access the API');}}catch(e){logError(e.message);}}function onInterceptLoaded(){logMessage('QSI Resolved'); setCookieHandler(); native.onResolved(); _handleIntercept();}function load(){try{if(typeof QSI !=='undefined' && QSI.API){resetCookies(); unload(); QSI.API.load().then(onInterceptLoaded); logMessage('Intercept ' + window.interceptId + ' loaded');}else{logMessage('QSI: ' + typeof QSI + ' QSI API: ' + QSI.API); logMessage('Did not load intercept ' + window.interceptId + ', could not access API');}}catch(e){logError(e.message);}}function isJson(str){try{JSON.parse(str);}catch (e){return false;}return true;}function resetCookies(){for(var i=localStorage.length - 1; i >=0; i--){var key=localStorage.key(i); var str=localStorage.getItem(key); if(isJson(str)){var object=JSON.parse(str); if(object.hasOwnProperty('cookie')){if(parseInt(object.expireTime) > new Date().getTime()){document.cookie=object.cookieString;}else{localStorage.removeItem(key);}}}}}function setCookieHandler(){if(typeof QSI !=='undefined' && QSI.cookie){QSI.cookie.set=function(name, value, daysToExpire, domain, options){options=options ||{}; var currentSize=this.getCookieSize(); var curVal=this.get(name); var maxSize=QSI.global.maxCookieSize; var expireTime=-1; if (curVal){currentSize -=(name + '=' + curVal).length;}var expiresString=''; if (daysToExpire){var f=new Date(); f.setTime(f.getTime() + (daysToExpire * 86400000)); expireTime=f.getTime(); expiresString='; expires=' + f.toGMTString();}var dmn=''; if (domain){dmn='domain=' + domain;}else if (QSI.CookieDomain){dmn='domain=' + QSI.CookieDomain;}var cookieVal=name + '=' + value; var newSize=(currentSize + cookieVal.length); if (options.force || (maxSize !==null && newSize <=maxSize) || maxSize===null){if (!options.erase){this.cookieSize=newSize;}else{this.cookieSize=currentSize;}var cookieString=cookieVal + expiresString + '; path=/; ' + dmn; localStorage[cookieVal]=JSON.stringify({cookie: true, expireTime: expireTime, cookieString: cookieString}); document.cookie=cookieString;}else{native.onMessage('Cannot exceed the specified maximum cookie size');}};}}function _handleIntercept(){if (typeof QSI !='undefined' && QSI.reg && QSI.reg[interceptId] && (QSI.reg[interceptId].willShow || QSI.reg[interceptId].displayed)){try{var showEvent=QSI.reg[interceptId].willShow || QSI.reg[interceptId].displayed; showEvent.then(function(){native.onOpen(JSON.stringify(getInterceptProperties())); logMessage('On Open'); if(QSI.reg[interceptId].container){QSI.reg[interceptId].container.addEventListener('DOMNodeRemoved', function(){if (QSI.reg[interceptId].actionOptions && QSI.reg[interceptId].actionOptions.targetEmbedded){var target=document.querySelector('.QSIEmbeddedTarget'); if(target){document.querySelector('iframe').addEventListener('load', function(){native.onMessage('iframe loaded');}); target.addEventListener('DOMNodeRemoved', function(){native.onClose();});}else{native.onClose();}}else{native.onClose();}});}});}catch (error){logError(error.message || 'Error handling intercept');}}else{logMessage('No intercept triggered');}}window.AppSI={}, window.interceptId=null, window.zoneId=null, window.brandId=null; </script> </body></html>";
    }

    private void init(AttributeSet attributeSet, int i) {
        int i2 = Build.VERSION.SDK_INT;
        Log.i("QSI", "" + i2);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C18161c.f39683b, i, 0);
            this.mInterceptId = obtainStyledAttributes.getString(1);
            this.mZoneId = obtainStyledAttributes.getString(2);
            this.mBrandId = obtainStyledAttributes.getString(0);
            obtainStyledAttributes.recycle();
        }
        this.queuedVariables = new ArrayList<>();
        setBackgroundColor(0);
        setPadding(0, 0, 0, 0);
        setZ(Float.MAX_VALUE);
        setVisibility(8);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        C17324b bVar = new C17324b();
        this.mCallbackInterface = bVar;
        addJavascriptInterface(bVar, "native");
        setWebViewClient(new C17323a());
    }

    /* access modifiers changed from: private */
    public void loadQueuedVariables() {
        if (this.queuedVariables.size() > 0) {
            unload();
            Iterator<C17328c> it = this.queuedVariables.iterator();
            while (it.hasNext()) {
                C17328c next = it.next();
                put(next.f37856a, next.f37857b, next.f37858c);
            }
            this.queuedVariables.clear();
            load();
        }
    }

    /* access modifiers changed from: private */
    public void logMessage(String str) {
        if (this.mVerboseLogging) {
            Log.i(LOG_TAG, str);
        }
    }

    public void clearPersistentVariables() {
        executeJSExpression("clearPersistentVariables();");
    }

    public void clearTemporaryVariables() {
        executeJSExpression("clearTemporaryVariables();");
    }

    public Fragment getFragment() {
        QSIFragment qSIFragment = new QSIFragment();
        qSIFragment.init(getWebView());
        return qSIFragment;
    }

    public String getInterceptId() {
        return this.mInterceptId;
    }

    public boolean getShouldDisplay() {
        return this.mShouldDisplay;
    }

    public androidx.fragment.app.Fragment getSupportFragment() {
        QSISupportFragment qSISupportFragment = new QSISupportFragment();
        qSISupportFragment.init(getWebView());
        return qSISupportFragment;
    }

    public boolean getVerboseLogging() {
        return this.mVerboseLogging;
    }

    public QSIEngine getWebView() {
        detachWebView();
        return this;
    }

    public String getZoneId() {
        return this.mZoneId;
    }

    public void load() {
        logMessage("Loading...");
        if (this.mPageReady) {
            executeJSExpression("load()");
            this.mPageReady = false;
        } else if (!this.mPageLoading && !this.mQSIReady) {
            logMessage("Page loaded, but QSI has not yet loaded");
            this.mPageLoading = true;
        }
    }

    public void loadWithViewGroup(ViewGroup viewGroup) {
        if (this.mShouldDisplay) {
            viewGroup.addView(getWebView());
        }
        load();
    }

    public void put(String str, String str2, boolean z) {
        if (this.mPageReady) {
            executeJSExpression(String.format("putVar('%s', '%s', %s)", new Object[]{str, str2, Boolean.valueOf(z)}));
            return;
        }
        logMessage("Queueing variable");
        this.queuedVariables.add(new C17328c(str, str2, z));
    }

    public void removeOnCloseCallback() {
        this.mCallbackInterface.getClass();
    }

    public void removeOnOpenCallback() {
        this.mCallbackInterface.getClass();
    }

    public void setInterceptId(String str) {
        this.mInterceptId = str;
    }

    public void setOnCloseCallback(C18159a aVar) {
        this.mCallbackInterface.getClass();
    }

    public void setOnOpenCallback(C18159a aVar) {
        this.mCallbackInterface.getClass();
    }

    public void setShouldDisplay(boolean z) {
        this.mShouldDisplay = z;
    }

    public void setVerboseLogging(boolean z) {
        this.mVerboseLogging = z;
    }

    public void setZoneId(String str) {
        this.mZoneId = str;
    }

    public void start() {
        this.mPageLoaded = false;
        logMessage("Starting...");
        loadDataWithBaseURL("https://qualtrics.com", getHTML(), "text/html", EtsyRequest.CONTENT_ENCODING, (String) null);
    }

    public void unload() {
        detachWebView();
        if (this.mPageReady) {
            executeJSExpression("unload()");
            executeJSExpression("close()");
        }
    }

    /* renamed from: com.qualtrics.qsiframework.QSIEngine$a */
    public class C17323a extends WebViewClient {
        public C17323a() {
        }

        public final void onPageFinished(WebView webView, String str) {
            if (!QSIEngine.this.mPageLoaded) {
                QSIEngine.this.logMessage("onPageFinished");
                QSIEngine qSIEngine = QSIEngine.this;
                qSIEngine.executeJSExpression(String.format("loadInterceptCode('%s', '%s', '%s')", new Object[]{qSIEngine.mInterceptId, QSIEngine.this.mZoneId, QSIEngine.this.mBrandId}));
                boolean unused = QSIEngine.this.mPageReady = true;
                CookieManager.getInstance().setAcceptCookie(true);
                QSIEngine.this.loadQueuedVariables();
                boolean unused2 = QSIEngine.this.mPageLoaded = true;
            }
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            StringBuilder h = C0072d.m201h("ERROR LOADING VIEW: ");
            h.append(webResourceError.toString());
            Log.e("QUALTRICS INTERCEPT", h.toString());
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            Log.e("QUALTRICS INTERCEPT", "ERROR LOADING VIEW: " + str);
        }
    }

    public QSIEngine(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            init(attributeSet, 0);
        } else {
            setVisibility(8);
        }
    }

    public QSIEngine(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode()) {
            init(attributeSet, i);
        } else {
            setVisibility(8);
        }
    }
}
