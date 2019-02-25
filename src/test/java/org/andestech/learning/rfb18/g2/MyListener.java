package org.andestech.learning.rfb18.g2;


import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MyListener implements ISuiteListener {
    @Override
    public void onStart(ISuite iSuite) {
        System.out.println("+++ listener, suite: " + iSuite.getName());

    }

    @Override
    public void onFinish(ISuite iSuite) {
        System.out.println("--- listener, suite: " + iSuite.getName());

    }
}
