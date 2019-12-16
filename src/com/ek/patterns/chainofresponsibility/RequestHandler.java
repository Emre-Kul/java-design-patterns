package com.ek.patterns.chainofresponsibility;

public abstract class RequestHandler implements Process {

    public RequestHandler nextHandler;

    public void setNext(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void next(String req) {
        if(nextHandler != null){
            this.nextHandler.process(req);
        }
    }

}
