package com.qualtrics.qsiframework;

import android.content.Context;
import android.content.res.TypedArray;
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
import p610kp.C18160b;
import p610kp.C18161c;

public class QualtricsIntercept extends WebView {
    /* access modifiers changed from: private */
    public static String LOG_TAG = "QUALTRICS INTERCEPT";
    /* access modifiers changed from: private */
    public String mBrandId;
    private C17337b mCallbackInterface;
    /* access modifiers changed from: private */
    public String mInterceptId;
    /* access modifiers changed from: private */
    public boolean mInterceptReady = false;
    /* access modifiers changed from: private */
    public boolean mLoadOnReady = false;
    /* access modifiers changed from: private */
    public boolean mPageLoaded = false;
    /* access modifiers changed from: private */
    public boolean mPageReady = false;
    /* access modifiers changed from: private */
    public boolean mShouldDisplay = true;
    private boolean mStarted = false;
    private boolean mVerboseLogging = false;
    /* access modifiers changed from: private */
    public String mZoneId;
    private ArrayList<C17341c> queuedVariables;
    /* access modifiers changed from: private */
    public Handler uiHandler = new Handler();

    /* renamed from: com.qualtrics.qsiframework.QualtricsIntercept$b */
    public class C17337b {

        /* renamed from: com.qualtrics.qsiframework.QualtricsIntercept$b$a */
        public class C17338a implements Runnable {
            public C17338a() {
            }

            public final void run() {
                QualtricsIntercept.this.loadQueuedVariables();
                if (QualtricsIntercept.this.mShouldDisplay) {
                    QualtricsIntercept.this.setClickable(true);
                    QualtricsIntercept.this.setVisibility(0);
                }
            }
        }

        /* renamed from: com.qualtrics.qsiframework.QualtricsIntercept$b$b */
        public class C17339b implements Runnable {
            public C17339b() {
            }

            public final void run() {
                QualtricsIntercept.this.setVisibility(8);
                QualtricsIntercept.this.detachWebView();
            }
        }

        /* renamed from: com.qualtrics.qsiframework.QualtricsIntercept$b$c */
        public class C17340c implements Runnable {
            public C17340c() {
            }

            public final void run() {
                QualtricsIntercept.this.loadWithoutViewGroup();
            }
        }

        public C17337b() {
        }

        @JavascriptInterface
        public String getVar(String str) {
            return str;
        }

        @JavascriptInterface
        public void onClose() {
            QualtricsIntercept.this.uiHandler.post(new C17339b());
        }

        @JavascriptInterface
        public void onError(String str) {
            String access$800 = QualtricsIntercept.LOG_TAG;
            Log.e(access$800, "ERROR: " + str);
            boolean unused = QualtricsIntercept.this.mPageReady = true;
        }

        @JavascriptInterface
        public void onMessage(String str) {
            QualtricsIntercept qualtricsIntercept = QualtricsIntercept.this;
            qualtricsIntercept.logMessage("Message: " + str);
        }

        @JavascriptInterface
        public void onOpen(String str) {
            QualtricsIntercept.this.uiHandler.post(new C17338a());
            try {
                new JSONObject(str);
            } catch (Exception e) {
                QualtricsIntercept.this.logMessage(e.toString());
            }
        }

        @JavascriptInterface
        public void onReady() {
            QualtricsIntercept.this.logMessage("QUALTRICS INTERCEPT READY");
            boolean unused = QualtricsIntercept.this.mInterceptReady = true;
            if (QualtricsIntercept.this.mLoadOnReady) {
                QualtricsIntercept.this.uiHandler.postDelayed(new C17340c(), 1000);
            }
        }

        @JavascriptInterface
        public void onResolved() {
            QualtricsIntercept.this.logMessage("ON RESOLVED");
            boolean unused = QualtricsIntercept.this.mPageReady = true;
        }
    }

    /* renamed from: com.qualtrics.qsiframework.QualtricsIntercept$c */
    public class C17341c {

        /* renamed from: a */
        public String f37872a;

        /* renamed from: b */
        public String f37873b;

        /* renamed from: c */
        public boolean f37874c;

        public C17341c(String str, String str2, boolean z) {
            this.f37872a = str;
            this.f37873b = str2;
            this.f37874c = z;
        }
    }

    public QualtricsIntercept(Context context, String str, String str2, String str3, boolean z) {
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
        return "<!doctype html><html><head> <meta name='viewport' content='initial-scale=1, user-scalable=no'/> <style>html, body{background-color: transparent;}.QSIPopOver{background-color: transparent !important;}.QSIEmbeddedTarget>div{border: none !important; border-radius: 3px !important; background-color: rgba(0, 0, 0, .5) !important; -webkit-animation: target-anim .6s;}@-webkit-keyframes target-anim{from{opacity: 0; -webkit-transform: scale(.7);}to{opacity: 1; -webkit-transform: scale(1);}}</style></head><body> <script type='text/javascript'> function loadInterceptCode(e, t, n){try{window.interceptId=e; window.zoneId=t; window.brandId=n; var o=document.createElement('SCRIPT'), d=document.createElement('DIV'); window.focus(); o.onload=function(){onInterceptLoaded(); native.onReady(); return window.focus();}; o.setAttribute('id', 'script_' + interceptId); o.src='https://' + zoneId + '-' + brandId + '.siteintercept.qualtrics.com/WRSiteInterceptEngine/?Q_SIID=' + interceptId; d.setAttribute('id', interceptId); document.body.appendChild(o); document.body.appendChild(d); resetCookies(); logMessage('Intercept ' + window.interceptId + ' is loading');}catch (e){logError(e.message);}}function logError(message){native.onError(message);}function logMessage(message){native.onMessage(message);}function getInterceptProperties(){return{'fullTargetUrl': QSI.util.tryGetTarget(), 'targetUrl': QSI.reg[interceptId].options.targetURL, 'type': QSI.reg[interceptId].type, 'actionOptions': QSI.reg[interceptId].actionOptions};}function clearTemporaryVariables(){window.AppSI={}; logMessage('Temporary variables have been cleared');}function clearPersistentVariables(){localStorage.clear(); logMessage('Persistent variables have been cleared');}function putVar(name, value, isPersistent){if(isPersistent){localStorage[name]=value;}else{window.AppSI[name]=value;}logMessage('Variable: ' + name + ' set to ' + value + ', persistent: ' + isPersistent);}function getVar(e){if(localStorage.hasOwnProperty(e)){return localStorage[e];}else if (window.AppSI.hasOwnProperty(e)){return window.AppSI[e];}else{return '';}}function close(){try{document.querySelector('.QSIEmbeddedTarget').parentNode.removeChild(document.querySelector('.QSIEmbeddedTarget'));}catch(e){logMessage('Intercept ' + window.interceptId + ' has been closed');}}function unload(){try{if(typeof QSI !=='undefined' && QSI.API){QSI.API.unload(); close(); logMessage('Intercept ' + window.interceptId + ' unloaded');}else{logMessage('Did not unload intercept ' + window.interceptId + ', could not access the API');}}catch(e){logError(e.message);}}function onInterceptLoaded(){logMessage('QSI Resolved'); setCookieHandler(); native.onResolved(); _handleIntercept();}function load(){try{if(typeof QSI !=='undefined' && QSI.API){resetCookies(); unload(); QSI.API.load().then(onInterceptLoaded); logMessage('Intercept ' + window.interceptId + ' loaded');}else{logMessage('QSI: ' + typeof QSI + ' QSI API: ' + QSI.API); logMessage('Did not load intercept ' + window.interceptId + ', could not access API');}}catch(e){logError(e.message);}}function isJson(str){try{JSON.parse(str);}catch (e){return false;}return true;}function resetCookies(){for(var i=localStorage.length - 1; i >=0; i--){var key=localStorage.key(i); var str=localStorage.getItem(key); if(isJson(str)){var object=JSON.parse(str); if(object.hasOwnProperty('cookie')){if(parseInt(object.expireTime) > new Date().getTime()){document.cookie=object.cookieString;}else{localStorage.removeItem(key);}}}}}function setCookieHandler(){if(typeof QSI !=='undefined' && QSI.cookie){QSI.cookie.set=function(name, value, daysToExpire, domain, options){options=options ||{}; var currentSize=this.getCookieSize(); var curVal=this.get(name); var maxSize=QSI.global.maxCookieSize; var expireTime=-1; if (curVal){currentSize -=(name + '=' + curVal).length;}var expiresString=''; if (daysToExpire){var f=new Date(); f.setTime(f.getTime() + (daysToExpire * 86400000)); expireTime=f.getTime(); expiresString='; expires=' + f.toGMTString();}var dmn=''; if (domain){dmn='domain=' + domain;}else if (QSI.CookieDomain){dmn='domain=' + QSI.CookieDomain;}var cookieVal=name + '=' + value; var newSize=(currentSize + cookieVal.length); if (options.force || (maxSize !==null && newSize <=maxSize) || maxSize===null){if (!options.erase){this.cookieSize=newSize;}else{this.cookieSize=currentSize;}var cookieString=cookieVal + expiresString + '; path=/; ' + dmn; localStorage[cookieVal]=JSON.stringify({cookie: true, expireTime: expireTime, cookieString: cookieString}); document.cookie=cookieString;}else{native.onMessage('Cannot exceed the specified maximum cookie size');}};}}function _handleIntercept(){if (typeof QSI !='undefined' && QSI.reg && QSI.reg[interceptId] && (QSI.reg[interceptId].willShow || QSI.reg[interceptId].displayed)){try{var showEvent=QSI.reg[interceptId].willShow || QSI.reg[interceptId].displayed; showEvent.then(function(){native.onOpen(JSON.stringify(getInterceptProperties())); logMessage('On Open'); if(QSI.reg[interceptId].container){QSI.reg[interceptId].container.addEventListener('DOMNodeRemoved', function(){if (QSI.reg[interceptId].actionOptions && QSI.reg[interceptId].actionOptions.targetEmbedded){var target=document.querySelector('.QSIEmbeddedTarget'); if(target){document.querySelector('iframe').addEventListener('load', function(){native.onMessage('iframe loaded');}); target.addEventListener('DOMNodeRemoved', function(){native.onClose();});}else{native.onClose();}}else{native.onClose();}});}});}catch (error){logError(error.message || 'Error handling intercept');}}else{logMessage('No intercept triggered');}}window.AppSI={}, window.interceptId=null, window.zoneId=null, window.brandId=null; </script> </body></html>";
    }

    private void init(AttributeSet attributeSet, int i) {
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
        C17337b bVar = new C17337b();
        this.mCallbackInterface = bVar;
        addJavascriptInterface(bVar, "native");
        setWebViewClient(new C17336a());
    }

    /* access modifiers changed from: private */
    public void loadQueuedVariables() {
        if (this.queuedVariables.size() > 0) {
            Iterator<C17341c> it = this.queuedVariables.iterator();
            while (it.hasNext()) {
                C17341c next = it.next();
                StringBuilder h = C0072d.m201h("Setting queued variable: ");
                h.append(next.f37872a.toString());
                h.append(" value: ");
                h.append(next.f37873b.toString());
                logMessage(h.toString());
                put(next.f37872a, next.f37873b, next.f37874c);
            }
            this.queuedVariables.clear();
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

    public String getBrandId() {
        return this.mBrandId;
    }

    public String getInterceptId() {
        return this.mInterceptId;
    }

    public boolean getShouldDisplay() {
        return this.mShouldDisplay;
    }

    public boolean getVerboseLogging() {
        return this.mVerboseLogging;
    }

    public QualtricsIntercept getWebView() {
        detachWebView();
        return this;
    }

    public String getZoneId() {
        return this.mZoneId;
    }

    public void loadWithViewGroup(ViewGroup viewGroup) {
        if (this.mShouldDisplay) {
            viewGroup.addView(getWebView());
        }
        loadWithoutViewGroup();
    }

    public void loadWithoutViewGroup() {
        logMessage("Loading...");
        if (this.mPageReady) {
            executeJSExpression("load()");
            this.mPageReady = false;
        } else if (!this.mInterceptReady) {
            logMessage("Page loaded, but QSI has not yet loaded");
            this.mLoadOnReady = true;
        } else {
            logMessage("Page is not ready, but the intercept has loaded");
            this.mLoadOnReady = true;
        }
    }

    public void put(String str, String str2, boolean z) {
        if (this.mPageReady) {
            executeJSExpression(String.format("putVar('%s', '%s', %s)", new Object[]{str, str2, Boolean.valueOf(z)}));
            return;
        }
        logMessage("Queueing variable");
        this.queuedVariables.add(new C17341c(str, str2, z));
    }

    public void removeOnCloseCallback() {
        this.mCallbackInterface.getClass();
    }

    public void removeOnOpenCallback() {
        this.mCallbackInterface.getClass();
    }

    public void setBrandId(String str) {
    }

    public void setInterceptId(String str) {
        this.mInterceptId = str;
    }

    public void setOnCloseCallback(C18160b bVar) {
        this.mCallbackInterface.getClass();
    }

    public void setOnOpenCallback(C18160b bVar) {
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
        if (!this.mStarted) {
            this.mPageLoaded = false;
            logMessage("Starting...");
            loadDataWithBaseURL("https://qualtrics.com", getHTML(), "text/html", EtsyRequest.CONTENT_ENCODING, (String) null);
            this.mStarted = true;
        }
    }

    public void unload() {
        detachWebView();
        if (this.mPageReady) {
            executeJSExpression("unload()");
        }
    }

    /* renamed from: com.qualtrics.qsiframework.QualtricsIntercept$a */
    public class C17336a extends WebViewClient {
        public C17336a() {
        }

        public final void onPageFinished(WebView webView, String str) {
            if (!QualtricsIntercept.this.mPageLoaded) {
                QualtricsIntercept.this.logMessage("onPageFinished");
                QualtricsIntercept qualtricsIntercept = QualtricsIntercept.this;
                qualtricsIntercept.executeJSExpression(String.format("loadInterceptCode('%s', '%s', '%s')", new Object[]{qualtricsIntercept.mInterceptId, QualtricsIntercept.this.mZoneId, QualtricsIntercept.this.mBrandId}));
                boolean unused = QualtricsIntercept.this.mPageReady = true;
                QualtricsIntercept.this.loadQueuedVariables();
                CookieManager.getInstance().setAcceptCookie(true);
                boolean unused2 = QualtricsIntercept.this.mPageLoaded = true;
            }
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            String access$800 = QualtricsIntercept.LOG_TAG;
            StringBuilder h = C0072d.m201h("ERROR LOADING VIEW: ");
            h.append(webResourceError.toString());
            Log.e(access$800, h.toString());
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            String access$800 = QualtricsIntercept.LOG_TAG;
            Log.e(access$800, "ERROR LOADING VIEW: " + str);
        }
    }
}
