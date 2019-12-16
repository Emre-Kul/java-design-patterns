package com.ek.patterns.chainofresponsibility;

public class ARequestHandler extends RequestHandler {

    @Override
    public void process(String req) {
        if(req.equals("A")) {
            System.out.println("Processing At 'A' ");
        } else {
            this.next(req);
        }
    }

}
