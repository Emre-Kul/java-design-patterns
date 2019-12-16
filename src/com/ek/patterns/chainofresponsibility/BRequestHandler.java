package com.ek.patterns.chainofresponsibility;

public class BRequestHandler extends RequestHandler {

    @Override
    public void process(String req) {
        if(req.equals("B")) {
            System.out.println("Processing At 'B' ");
        } else {
            this.next(req);
        }
    }

}
