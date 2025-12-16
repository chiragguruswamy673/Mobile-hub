param([string]$Package, [string]$Permission)
adb shell pm revoke $Package $Permission