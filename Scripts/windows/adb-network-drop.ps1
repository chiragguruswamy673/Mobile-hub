param([switch]$Restore)
if ($Restore) {
  adb shell svc wifi enable
  adb shell svc data enable
} else {
  adb shell svc wifi disable
  adb shell svc data disable
}