fastjson-study

## 背景

fastjson 1.2.68 版本爆出高危漏洞，本次通过寻找改漏洞触发机制来学习 fastjson 的安全机制

[安全漏洞通告](https://github.com/alibaba/fastjson/wiki/security_update_20200601)

## bug 追踪

### 查看 bug 如何被修复

![img.png](./screenshots/img1.png)

升级到 *.sec10 可解决问题

### 下载代码查看修改点

1.2.8 到 1.2.8.sec10 改动最小，只有一行，说明这一行十分重要

下载 source.jar 解压获取源码 (已解压放到 fastjson-source-code 文件夹下)

[fastjson-1.2.8-sources.jar](https://repo1.maven.org/maven2/com/alibaba/fastjson/1.2.8/fastjson-1.2.8-sources.jar)

[fastjson-1.2.8.sec10-sources.jar](https://repo1.maven.org/maven2/com/alibaba/fastjson/1.2.8.sec10/fastjson-1.2.8.sec10-sources.jar)

![img.png](./screenshots/img2.png)

在 ParserConfig.denyHashCodes 中添加 0xD59EE91F0B09EA01L 解决了问题