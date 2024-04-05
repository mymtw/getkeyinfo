package com.paypal.pyplcheckout.interfaces;

public interface FinishListener {
    <T> void onTaskCompleted(T t);
}
