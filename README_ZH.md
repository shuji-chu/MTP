# MTP (YS) 项目说明

## 一句话总结
本项目是一个基于 Android 原生开发的 Telegram MTProto (MTP) 代理客户端 UI 项目，应用名称为 YS。

## 项目现状
目前这是一个**界面空壳项目**。
- `AndroidManifest.xml` 中声明了 `.MainActivity`，但代码目录中**缺少对应的 Java/Kotlin 源文件**。
- 仅包含基础的 Gradle 配置和 XML 布局文件。
- 需要开发者补全后台代理逻辑（解析 `tg://proxy?...` 链接、启动本地代理服务等）。

## 目录结构
- `settings.gradle` - 项目名配置为 YS
- `app/build.gradle` - Android 应用配置（包名 com.shuji.ys，最低支持 Android 7.0）
- `app/src/main/AndroidManifest.xml` - 应用清单
- `app/src/main/res/layout/activity_main.xml` - 主界面布局
- `app/src/main/res/values/` - 字符串、主题等资源

## UI 界面说明
根据 `activity_main.xml`，主界面包含以下模块：
1. **状态卡片**：显示代理运行状态（已停止/运行中），点击可启动/停止。
2. **MTP 链接输入框**：用于粘贴 `tg://proxy?...` 格式的代理链接。
3. **连接按钮**：触发连接操作。
4. **功能列表**：包含“日志”、“设置”、“关于”三个入口。

## 构建方法
本项目为标准 Android Gradle 项目（AGP 8.1.4，compileSdk 33）。
1. 使用 Android Studio 导入项目。
2. 等待 Gradle 同步完成。
3. 编译打包 APK 或运行到设备。

## 待办事项 (TODO)
- 新建 `MainActivity.java` 或 `MainActivity.kt`。
- 实现 `tg://proxy?server=...&port=...&secret=...` 链接的解析。
- 实现后台 MTP 代理服务的启停逻辑。
- 绑定按钮点击事件与输入框内容校验。
