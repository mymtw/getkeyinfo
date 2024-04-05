package androidx.test.runner;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.UserHandle;
import android.util.Log;
import androidx.multidex.C2941a;
import androidx.test.internal.platform.ThreadChecker;
import androidx.test.internal.platform.app.ActivityLifecycleTimeout;
import androidx.test.internal.runner.InstrumentationConnection;
import androidx.test.internal.runner.hidden.ExposedInstrumentationApi;
import androidx.test.internal.runner.intent.IntentMonitorImpl;
import androidx.test.internal.runner.intercepting.DefaultInterceptingActivityFactory;
import androidx.test.internal.runner.lifecycle.ActivityLifecycleMonitorImpl;
import androidx.test.internal.runner.lifecycle.ApplicationLifecycleMonitorImpl;
import androidx.test.internal.util.Checks;
import androidx.test.internal.util.ProcSummary;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.runner.intent.IntentMonitorRegistry;
import androidx.test.runner.intent.IntentStubberRegistry;
import androidx.test.runner.intercepting.InterceptingActivityFactory;
import androidx.test.runner.lifecycle.ActivityLifecycleMonitorRegistry;
import androidx.test.runner.lifecycle.ApplicationLifecycleMonitorRegistry;
import androidx.test.runner.lifecycle.ApplicationStage;
import androidx.test.runner.lifecycle.Stage;
import com.google.android.gms.common.api.Api;
import java.lang.Thread;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class MonitoringInstrumentation extends ExposedInstrumentationApi {
    private static final long MILLIS_TO_POLL_FOR_ACTIVITY_STOP;
    private static final long MILLIS_TO_WAIT_FOR_ACTIVITY_TO_STOP;
    private static final String TAG = "MonitoringInstr";
    private AtomicBoolean anActivityHasBeenLaunched = new AtomicBoolean(false);
    private ApplicationLifecycleMonitorImpl applicationMonitor = new ApplicationLifecycleMonitorImpl();
    private ExecutorService executorService;
    private volatile boolean finished = false;
    private Handler handlerForMainLooper;
    private MessageQueue.IdleHandler idleHandler = new MessageQueue.IdleHandler() {
        public final boolean queueIdle() {
            MonitoringInstrumentation.this.lastIdleTime.set(System.currentTimeMillis());
            return true;
        }
    };
    private IntentMonitorImpl intentMonitor = new IntentMonitorImpl();
    private volatile InterceptingActivityFactory interceptingActivityFactory;
    private ThreadLocal<Boolean> isDexmakerClassLoaderInitialized = new ThreadLocal<>();
    /* access modifiers changed from: private */
    public AtomicBoolean isJsBridgeLoaded = new AtomicBoolean(false);
    private volatile Boolean isOriginalInstr = null;
    private String jsBridgeClassName;
    /* access modifiers changed from: private */
    public AtomicLong lastIdleTime = new AtomicLong(0);
    /* access modifiers changed from: private */
    public ActivityLifecycleMonitorImpl lifecycleMonitor = new ActivityLifecycleMonitorImpl();
    /* access modifiers changed from: private */
    public Thread.UncaughtExceptionHandler standardHandler;
    private AtomicInteger startedActivityCounter = new AtomicInteger(0);

    public class ActivityFinisher implements Runnable {
        public ActivityFinisher() {
        }

        public final void run() {
            ArrayList arrayList = new ArrayList();
            Iterator it = EnumSet.range(Stage.CREATED, Stage.STOPPED).iterator();
            while (it.hasNext()) {
                arrayList.addAll(MonitoringInstrumentation.this.lifecycleMonitor.mo12358a((Stage) it.next()));
            }
            if (arrayList.size() > 0) {
                int size = arrayList.size();
                StringBuilder sb = new StringBuilder(60);
                sb.append("Activities that are still in CREATED to STOPPED: ");
                sb.append(size);
                Log.i(MonitoringInstrumentation.TAG, sb.toString());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Activity activity = (Activity) it2.next();
                if (!activity.isFinishing()) {
                    try {
                        String valueOf = String.valueOf(activity);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 20);
                        sb2.append("Finishing activity: ");
                        sb2.append(valueOf);
                        Log.i(MonitoringInstrumentation.TAG, sb2.toString());
                        activity.finish();
                    } catch (RuntimeException e) {
                        Log.e(MonitoringInstrumentation.TAG, "Failed to finish activity.", e);
                    }
                }
            }
        }
    }

    public static class StubResultCallable implements Callable<Instrumentation.ActivityResult> {
        public StubResultCallable(Intent intent) {
        }

        public final Object call() throws Exception {
            AtomicBoolean atomicBoolean = IntentStubberRegistry.f7712a;
            boolean z = Looper.myLooper() == Looper.getMainLooper();
            ThreadChecker threadChecker = Checks.f7689a;
            if (z) {
                throw new IllegalStateException("No intent monitor registered! Are you running under an Instrumentation which registers intent monitors?");
            }
            throw new IllegalStateException("Must be called on main thread.");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(2);
        MILLIS_TO_WAIT_FOR_ACTIVITY_TO_STOP = millis;
        MILLIS_TO_POLL_FOR_ACTIVITY_STOP = millis / 40;
    }

    private static Class<?> getMultiDexClass() throws ClassNotFoundException {
        Class<C2941a> cls = C2941a.class;
        try {
            HashSet hashSet = C2941a.f6655a;
            return cls;
        } catch (ClassNotFoundException unused) {
            HashSet hashSet2 = C2941a.f6655a;
            return cls;
        }
    }

    private List<String> getTargetProcessValues() {
        try {
            String str = getContext().getPackageManager().getInstrumentationInfo(getComponentName(), 0).targetProcesses;
            if (str == null) {
                str = "";
            }
            String trim = str.trim();
            if (trim.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String trim2 : trim.split(",", -1)) {
                String trim3 = trim2.trim();
                if (trim3.length() > 0) {
                    arrayList.add(trim3);
                }
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(getComponentName());
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("Cannot locate ourselves: ");
            sb.append(valueOf);
            Log.wtf(TAG, sb.toString(), e);
            String valueOf2 = String.valueOf(getComponentName());
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 25);
            sb2.append("Cannot locate ourselves: ");
            sb2.append(valueOf2);
            throw new IllegalStateException(sb2.toString(), e);
        }
    }

    private boolean isHostingProcess(String str, ProcSummary procSummary) {
        int length = str.length();
        int length2 = procSummary.f7694e.length();
        if (length == length2) {
            return str.equals(procSummary.f7694e);
        }
        if (length < length2 || !str.startsWith(procSummary.f7694e) || !str.endsWith(procSummary.f7690a)) {
            return false;
        }
        String valueOf = String.valueOf(procSummary);
        StringBuilder sb = new StringBuilder(str.length() + valueOf.length() + 165);
        sb.append("Use smaller processNames in AndroidManifest.xml. Long names are truncated. This process's cmdline is a prefix of the processName and suffix of comm - assuming: ");
        sb.append(valueOf);
        sb.append(" is: ");
        sb.append(str);
        Log.w(TAG, sb.toString());
        return true;
    }

    private boolean isOriginalInstrumentationProcess() {
        Boolean bool = this.isOriginalInstr;
        if (bool == null) {
            bool = Boolean.valueOf(isOriginalUncached());
            this.isOriginalInstr = bool;
        }
        return bool.booleanValue();
    }

    private boolean isOriginalUncached() {
        List<String> targetProcessValues = getTargetProcessValues();
        if (targetProcessValues.isEmpty()) {
            return true;
        }
        boolean equals = "*".equals(targetProcessValues.get(0));
        if (targetProcessValues.size() == 1 && !equals) {
            return true;
        }
        try {
            ProcSummary b = ProcSummary.m7979b();
            if (!equals) {
                return isHostingProcess(targetProcessValues.get(0), b);
            }
            String str = getTargetContext().getApplicationInfo().processName;
            if (str == null) {
                str = getTargetContext().getPackageName();
            }
            return isHostingProcess(str, b);
        } catch (ProcSummary.SummaryException e) {
            Log.w(TAG, "Could not list apps for this user, running in sandbox? Assuming primary", e);
            return false;
        }
    }

    private void logUncaughtExceptions() {
        this.standardHandler = Thread.currentThread().getUncaughtExceptionHandler();
        Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public final void uncaughtException(Thread thread, Throwable th) {
                MonitoringInstrumentation.this.onException(thread, th);
                if (MonitoringInstrumentation.this.standardHandler != null) {
                    Log.w(MonitoringInstrumentation.TAG, String.format("Invoking uncaught exception handler %s (a %s)", new Object[]{MonitoringInstrumentation.this.standardHandler, MonitoringInstrumentation.this.standardHandler.getClass()}));
                    MonitoringInstrumentation.this.standardHandler.uncaughtException(thread, th);
                } else {
                    String valueOf = String.valueOf(thread.getName());
                    Log.w(MonitoringInstrumentation.TAG, valueOf.length() != 0 ? "Invoking uncaught exception handler for thread: ".concat(valueOf) : new String("Invoking uncaught exception handler for thread: "));
                    thread.getThreadGroup().uncaughtException(thread, th);
                }
                if (!"robolectric".equals(Build.FINGERPRINT) && Looper.getMainLooper().getThread().equals(thread)) {
                    Log.e(MonitoringInstrumentation.TAG, "The main thread has died and the handlers didn't care, exiting");
                    System.exit(-10);
                }
            }
        });
    }

    private void setupDexmakerClassloader() {
        Boolean bool = Boolean.TRUE;
        if (!bool.equals(this.isDexmakerClassLoaderInitialized.get())) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            ClassLoader classLoader = getTargetContext().getClassLoader();
            if (contextClassLoader != classLoader) {
                Log.i(TAG, String.format("Setting context classloader to '%s', Original: '%s'", new Object[]{classLoader, contextClassLoader}));
                Thread.currentThread().setContextClassLoader(classLoader);
            }
            this.isDexmakerClassLoaderInitialized.set(bool);
        }
    }

    private Instrumentation.ActivityResult stubResultFor(Intent intent) {
        if (!IntentStubberRegistry.f7712a.get()) {
            return null;
        }
        boolean z = true;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            FutureTask futureTask = new FutureTask(new StubResultCallable(intent));
            runOnMainSync(futureTask);
            try {
                return (Instrumentation.ActivityResult) futureTask.get();
            } catch (ExecutionException e) {
                throw new RuntimeException(String.format("Could not retrieve stub result for intent %s", new Object[]{intent}), e);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e2);
            }
        } else {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                z = false;
            }
            ThreadChecker threadChecker = Checks.f7689a;
            if (z) {
                throw new IllegalStateException("No intent monitor registered! Are you running under an Instrumentation which registers intent monitors?");
            }
            throw new IllegalStateException("Must be called on main thread.");
        }
    }

    private void tryLoadingJsBridge(final String str) {
        if (str != null) {
            runOnMainSync(new Runnable() {
                public final void run() {
                    try {
                        Class.forName(str).getDeclaredMethod("installBridge", new Class[0]).invoke((Object) null, new Object[0]);
                        MonitoringInstrumentation.this.isJsBridgeLoaded.set(true);
                    } catch (ClassNotFoundException | NoSuchMethodException unused) {
                        Log.i(MonitoringInstrumentation.TAG, "No JSBridge.");
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException("JSbridge is available at runtime, but calling it failed.", e);
                    }
                }
            });
            return;
        }
        throw new NullPointerException("JsBridge class name cannot be null!");
    }

    public void callActivityOnCreate(Activity activity, Bundle bundle) {
        this.lifecycleMonitor.mo12359b(activity, Stage.PRE_ON_CREATE);
        super.callActivityOnCreate(activity, bundle);
        this.lifecycleMonitor.mo12359b(activity, Stage.CREATED);
    }

    public void callActivityOnDestroy(Activity activity) {
        super.callActivityOnDestroy(activity);
        this.lifecycleMonitor.mo12359b(activity, Stage.DESTROYED);
    }

    public void callActivityOnPause(Activity activity) {
        super.callActivityOnPause(activity);
        this.lifecycleMonitor.mo12359b(activity, Stage.PAUSED);
    }

    public void callActivityOnRestart(Activity activity) {
        super.callActivityOnRestart(activity);
        this.lifecycleMonitor.mo12359b(activity, Stage.RESTARTED);
    }

    public void callActivityOnResume(Activity activity) {
        super.callActivityOnResume(activity);
        this.lifecycleMonitor.mo12359b(activity, Stage.RESUMED);
    }

    public void callActivityOnStart(Activity activity) {
        this.startedActivityCounter.incrementAndGet();
        try {
            super.callActivityOnStart(activity);
            this.lifecycleMonitor.mo12359b(activity, Stage.STARTED);
        } catch (RuntimeException e) {
            this.startedActivityCounter.decrementAndGet();
            throw e;
        }
    }

    public void callActivityOnStop(Activity activity) {
        try {
            super.callActivityOnStop(activity);
            this.lifecycleMonitor.mo12359b(activity, Stage.STOPPED);
        } finally {
            this.startedActivityCounter.decrementAndGet();
        }
    }

    public void callApplicationOnCreate(Application application) {
        this.applicationMonitor.mo12360a(application, ApplicationStage.PRE_ON_CREATE);
        super.callApplicationOnCreate(application);
        this.applicationMonitor.mo12360a(application, ApplicationStage.CREATED);
    }

    public void dumpThreadStateToOutputs(String str) {
        Log.e("THREAD_STATE", getThreadState());
    }

    public void execStartActivities(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent[] intentArr, Bundle bundle) {
        Log.d(TAG, "execStartActivities(context, ibinder, ibinder, activity, intent[], bundle)");
        for (Intent execStartActivity : intentArr) {
            execStartActivity(context, iBinder, iBinder2, activity, execStartActivity, -1, bundle);
        }
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i) {
        this.intentMonitor.mo12357a(intent);
        Instrumentation.ActivityResult stubResultFor = stubResultFor(intent);
        if (stubResultFor == null) {
            return super.execStartActivity(context, iBinder, iBinder2, activity, intent, i);
        }
        Log.i(TAG, String.format("Stubbing intent %s", new Object[]{intent}));
        return stubResultFor;
    }

    public void finish(int i, Bundle bundle) {
        if (this.finished) {
            Log.w(TAG, "finish called 2x!");
            return;
        }
        this.finished = true;
        if (shouldWaitForActivitiesToComplete()) {
            this.handlerForMainLooper.post(new ActivityFinisher());
            long currentTimeMillis = System.currentTimeMillis();
            waitForActivitiesToComplete();
            Log.i(TAG, String.format("waitForActivitiesToComplete() took: %sms", new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis)}));
        }
        ActivityLifecycleMonitorRegistry.f7713a.set((Object) null);
        restoreUncaughtExceptionHandler();
        super.finish(i, bundle);
    }

    public String getThreadState() {
        Set<Map.Entry<Thread, StackTraceElement[]>> entrySet = Thread.getAllStackTraces().entrySet();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : entrySet) {
            StringBuilder sb2 = new StringBuilder("  ");
            sb2.append(next.getKey());
            sb2.append("\n");
            for (StackTraceElement stackTraceElement : (StackTraceElement[]) next.getValue()) {
                sb2.append("    ");
                sb2.append(stackTraceElement.toString());
                sb2.append("\n");
            }
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        return sb.toString();
    }

    public void installMultidex() {
    }

    public void installOldMultiDex(Class<?> cls) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        cls.getDeclaredMethod("install", new Class[]{Context.class}).invoke((Object) null, new Object[]{getTargetContext()});
    }

    public void interceptActivityUsing(InterceptingActivityFactory interceptingActivityFactory2) {
        ThreadChecker threadChecker = Checks.f7689a;
        interceptingActivityFactory2.getClass();
        this.interceptingActivityFactory = interceptingActivityFactory2;
    }

    @Deprecated
    public boolean isPrimaryInstrProcess(String str) {
        return isPrimaryInstrProcess();
    }

    public Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) throws InstantiationException, IllegalAccessException {
        String name = cls.getPackage().getName();
        String packageName = context.getPackageName();
        ComponentName component = intent.getComponent();
        if (!packageName.equals(component.getPackageName()) && name.equals(component.getPackageName())) {
            intent.setComponent(new ComponentName(packageName, component.getClassName()));
        }
        return super.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }

    public void onCreate(Bundle bundle) {
        Log.i(TAG, "Instrumentation started!");
        logUncaughtExceptions();
        installMultidex();
        AtomicReference<Instrumentation> atomicReference = InstrumentationRegistry.f7702a;
        atomicReference.set(this);
        AtomicReference<Bundle> atomicReference2 = InstrumentationRegistry.f7703b;
        atomicReference2.set(new Bundle(bundle));
        atomicReference.set(this);
        atomicReference2.set(new Bundle(bundle));
        ActivityLifecycleMonitorRegistry.f7713a.set(this.lifecycleMonitor);
        ApplicationLifecycleMonitorRegistry.f7714a.set(this.applicationMonitor);
        IntentMonitorRegistry.f7711a.set(this.intentMonitor);
        this.handlerForMainLooper = new Handler(Looper.getMainLooper());
        this.executorService = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                Class<MonitoringInstrumentation> cls = MonitoringInstrumentation.class;
                newThread.setName("MonitoringInstrumentation");
                return newThread;
            }
        });
        Looper.myQueue().addIdleHandler(this.idleHandler);
        super.onCreate(bundle);
        specifyDexMakerCacheProperty();
        setupDexmakerClassloader();
        useDefaultInterceptingActivityFactory();
    }

    public void onDestroy() {
        Log.i(TAG, "Instrumentation Finished!");
        Looper.myQueue().removeIdleHandler(this.idleHandler);
        InstrumentationConnection.f7669d.mo12347b();
        super.onDestroy();
    }

    public boolean onException(Object obj, Throwable th) {
        Log.e(TAG, String.format("Exception encountered by: %s. Dumping thread state to outputs and pining for the fjords.", new Object[]{obj}), th);
        dumpThreadStateToOutputs("ThreadState-onException.txt");
        Log.e(TAG, "Dying now...");
        return super.onException(obj, th);
    }

    public void onStart() {
        super.onStart();
        String str = this.jsBridgeClassName;
        if (str != null) {
            tryLoadingJsBridge(str);
        }
        waitForIdleSync();
        setupDexmakerClassloader();
        InstrumentationConnection.f7669d.mo12346a(this, new ActivityFinisher());
    }

    public void restoreUncaughtExceptionHandler() {
        Thread.currentThread().setUncaughtExceptionHandler(this.standardHandler);
    }

    public void runOnMainSync(Runnable runnable) {
        FutureTask futureTask = new FutureTask(runnable, (Object) null);
        super.runOnMainSync(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException(cause);
            }
        }
    }

    public final void setJsBridgeClassName(String str) {
        if (str == null) {
            throw new NullPointerException("JsBridge class name cannot be null!");
        } else if (!this.isJsBridgeLoaded.get()) {
            this.jsBridgeClassName = str;
        } else {
            throw new IllegalStateException("JsBridge is already loaded!");
        }
    }

    public boolean shouldWaitForActivitiesToComplete() {
        Bundle bundle = InstrumentationRegistry.f7703b.get();
        if (bundle != null) {
            return Boolean.parseBoolean(new Bundle(bundle).getString("waitForActivitiesToComplete", "true"));
        }
        throw new IllegalStateException("No instrumentation arguments registered! Are you running under an Instrumentation which registers arguments?");
    }

    public void specifyDexMakerCacheProperty() {
        System.getProperties().put("dexmaker.dexcache", getTargetContext().getDir("dxmaker_cache", 0).getAbsolutePath());
    }

    public Activity startActivitySync(final Intent intent) {
        Checks.f7689a.mo12345a();
        long j = this.lastIdleTime.get();
        if (this.anActivityHasBeenLaunched.compareAndSet(false, true)) {
            intent.addFlags(67108864);
        }
        Future submit = this.executorService.submit(new Callable<Activity>() {
            public final Object call() throws Exception {
                return MonitoringInstrumentation.super.startActivitySync(intent);
            }
        });
        try {
            return (Activity) submit.get(ActivityLifecycleTimeout.m7963a(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            dumpThreadStateToOutputs("ThreadState-startActivityTimeout.txt");
            submit.cancel(true);
            throw new RuntimeException(String.format("Could not launch intent %s within %s milliseconds. Perhaps the main thread has not gone idle within a reasonable amount of time? There could be an animation or something constantly repainting the screen. Or the activity is doing network calls on creation? See the threaddump logs. For your reference the last time the event queue was idle before your activity launch request was %s and now the last time the queue went idle was: %s. If these numbers are the same your activity might be hogging the event queue.", new Object[]{intent, Long.valueOf(ActivityLifecycleTimeout.m7963a()), Long.valueOf(j), Long.valueOf(this.lastIdleTime.get())}));
        } catch (ExecutionException e) {
            throw new RuntimeException("Could not launch activity", e.getCause());
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("interrupted", e2);
        }
    }

    public void useDefaultInterceptingActivityFactory() {
        this.interceptingActivityFactory = new DefaultInterceptingActivityFactory();
    }

    public void waitForActivitiesToComplete() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            long currentTimeMillis = System.currentTimeMillis() + MILLIS_TO_WAIT_FOR_ACTIVITY_TO_STOP;
            int i = this.startedActivityCounter.get();
            while (i > 0 && System.currentTimeMillis() < currentTimeMillis) {
                try {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Unstopped activity count: ");
                    sb.append(i);
                    Log.i(TAG, sb.toString());
                    Thread.sleep(MILLIS_TO_POLL_FOR_ACTIVITY_STOP);
                    i = this.startedActivityCounter.get();
                } catch (InterruptedException e) {
                    Log.i(TAG, "Abandoning activity wait due to interruption.", e);
                }
            }
            if (i > 0) {
                dumpThreadStateToOutputs("ThreadState-unstopped.txt");
                Log.w(TAG, String.format("Still %s activities active after waiting %s ms.", new Object[]{Integer.valueOf(i), Long.valueOf(MILLIS_TO_WAIT_FOR_ACTIVITY_TO_STOP)}));
                return;
            }
            return;
        }
        throw new IllegalStateException("Cannot be called from main thread!");
    }

    public final boolean isPrimaryInstrProcess() {
        return isOriginalInstrumentationProcess();
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle) {
        this.intentMonitor.mo12357a(intent);
        Instrumentation.ActivityResult stubResultFor = stubResultFor(intent);
        if (stubResultFor == null) {
            return super.execStartActivity(context, iBinder, iBinder2, activity, intent, i, bundle);
        }
        Log.i(TAG, String.format("Stubbing intent %s", new Object[]{intent}));
        return stubResultFor;
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i, Bundle bundle) {
        this.intentMonitor.mo12357a(intent);
        Instrumentation.ActivityResult stubResultFor = stubResultFor(intent);
        if (stubResultFor == null) {
            return super.execStartActivity(context, iBinder, iBinder2, str, intent, i, bundle);
        }
        Log.i(TAG, String.format("Stubbing intent %s", new Object[]{intent}));
        return stubResultFor;
    }

    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        this.interceptingActivityFactory.getClass();
        return super.newActivity(classLoader, str, intent);
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle, UserHandle userHandle) {
        return super.execStartActivity(context, iBinder, iBinder2, activity, intent, i, bundle, userHandle);
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i, Bundle bundle) {
        Log.d(TAG, "execStartActivity(context, IBinder, IBinder, Fragment, Intent, int, Bundle)");
        this.intentMonitor.mo12357a(intent);
        Instrumentation.ActivityResult stubResultFor = stubResultFor(intent);
        if (stubResultFor == null) {
            return super.execStartActivity(context, iBinder, iBinder2, fragment, intent, i, bundle);
        }
        Log.i(TAG, String.format("Stubbing intent %s", new Object[]{intent}));
        return stubResultFor;
    }
}
