package com.xworkz.inheritance.bridge;

public class BridgeRunner {
    public static void main(String[] args) {
        Bridge bridge = new Bridge();
        bridge.constructBridge();
        bridge.inspectBridge();

        HangingBridge hanging = new HangingBridge();
        hanging.constructBridge();
        hanging.inspectBridge();
    }
}
