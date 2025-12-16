package com.mon.marketplace.qa;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chaos")
public class ChaosController {

    private final EmulatorChaosService emulator;
    public ChaosController(EmulatorChaosService emulator) { this.emulator = emulator; }

    @PostMapping("/network/drop")
    public String dropNetwork() { emulator.setNetworkOffline(); return "Network dropped"; }

    @PostMapping("/network/restore")
    public String restoreNetwork() { emulator.setNetworkOnline(); return "Network restored"; }

    @PostMapping("/battery/low")
    public String batteryLow() { emulator.setBatteryLevel(5); return "Battery set to 5%"; }

    @PostMapping("/permissions/revoke")
    public String revokeCamera() { emulator.revokePermission("com.demo", "android.permission.CAMERA"); return "Camera revoked"; }
}