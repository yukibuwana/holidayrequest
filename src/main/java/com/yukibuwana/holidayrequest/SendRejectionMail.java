package com.yukibuwana.holidayrequest;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class SendRejectionMail implements JavaDelegate {
    public void execute(DelegateExecution delegateExecution) {
        System.out.println("Send Reject Email");
    }
}
