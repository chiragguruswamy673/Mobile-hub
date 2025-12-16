package com.mon.marketplace.qa;
import org.springframework.stereotype.Service;

@Service
public class EmulatorChaosService {

    public void setNetworkOffline() {
        exec("powershell.exe", "-File", "scripts/windows/adb-network-drop.ps1");
    }

    public void setNetworkOnline() {
        exec("powershell.exe", "-File", "scripts/windows/adb-network-drop.ps1", "-Restore");
    }

    public void setBatteryLevel(int pct) {
        exec("powershell.exe", "-File", "scripts/windows/emulator-battery-low.ps1", "-Level", String.valueOf(pct));
    }

    public void revokePermission(String pkg, String perm) {
        exec("powershell.exe", "-File", "scripts/windows/adb-permission-revoke.ps1", "-Package", pkg, "-Permission", perm);
    }

    private void exec(String... cmd) {
        try { new ProcessBuilder(cmd).inheritIO().start().waitFor(); } catch (Exception ignored) {}
    }
}