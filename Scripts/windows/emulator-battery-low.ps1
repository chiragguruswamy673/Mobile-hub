param([int]$Level=5)
adb shell dumpsys battery set level $Level
adb shell dumpsys battery set status 3