# AI 答题应用平台

在线体验：https://www.code-pan.cn/

[toc]



## 一、项目介绍

一款基于 Vue 3 + Spring Boot + Redis + ChatGLM + RxJava + SSE 的 **AI 答题应用平台。**

用户可以基于 AI 快速制作并发布答题应用，支持检索、分享、在线答题并基于 AI 得到回答总结；管理员可以集中管理和审核应用。

答题应用：比如 MBTI 性格测试，相当于一份试卷里有很多道题目，大家根据题目选择选项，最终提交答案并得到性格分析结果。

本项目可以在这种测试的基础上，再上升一个层次，开发 `答题应用平台`，所有人都可以在平台上制作发布自己的答题应用，畅玩别人的答题应用。

用户界面：

![img](https://ai-answers.oss-cn-hangzhou.aliyuncs.com/1.1%E7%94%A8%E6%88%B7%E4%B8%BB%E9%A1%B5.jpg)

管理员界面：

![img](https://ai-answers.oss-cn-hangzhou.aliyuncs.com/1.2%E7%AE%A1%E7%90%86%E5%91%98%E4%B8%BB%E9%A1%B5.jpg)

进入任意一个模块可开始答题：

![img](https://ai-answers.oss-cn-hangzhou.aliyuncs.com/1.3%E6%A8%A1%E5%9D%97%E7%AD%94%E9%A2%98.jpg)

答题结束以后可得到结果：

![img](https://ai-answers.oss-cn-hangzhou.aliyuncs.com/1.4%E7%BB%93%E6%9E%9C%E5%88%86%E6%9E%90.jpg)


## 二、基础功能介绍

### 应用创建

![img](https://ai-answers.oss-cn-hangzhou.aliyuncs.com/2.1%E5%88%9B%E5%BB%BA%E5%BA%94%E7%94%A8.jpg)

这里评分策略有自定义和AI两项。使用自定义需要自己指定评分规则，而使用AI则可以根据回答自动判题。

### 题目设置

![img](https://ai-answers.oss-cn-hangzhou.aliyuncs.com/2.2%E8%AE%BE%E7%BD%AE%E9%A2%98%E7%9B%AE.jpg)

可以手动或者AI添加题目。如果使用AI添加，AI会根据创建应用的标题和描述来设置题目，可以设定添加题目的数量和选项数量。

![img](https://ai-answers.oss-cn-hangzhou.aliyuncs.com/2.3AI%E7%94%9F%E6%88%90%E9%A2%98%E7%9B%AE.jpg)

这里一键生成和实时生成的结果是一样的。

一键生成：使用AI生成后的默认接口（AI将题目完全生成后一次性将数据全部返回前端）。

实时生成：基于 RxJava 的操作符链式调用处理 AI 异步数据流，使前端可以实时接收 AI 生成的问题结果。

### 评分设置

![img](https://ai-answers.oss-cn-hangzhou.aliyuncs.com/2.4%E8%AE%BE%E7%BD%AE%E8%AF%84%E5%88%86.jpg)

如果是创建应用时选择的是自定义，则还需要补充评分设置规则。

### 查看答题记录

![img](https://ai-answers.oss-cn-hangzhou.aliyuncs.com/2.5%E6%88%91%E7%9A%84%E7%AD%94%E9%A2%98.jpg)

点击“我的答题”模块即可看到答题的结果记录。


## 三、管理员功能

### 用户管理

![img](https://ai-answers.oss-cn-hangzhou.aliyuncs.com/3.1%E7%94%A8%E6%88%B7%E7%AE%A1%E7%90%86.jpg)

此模块管理员可查询到各个用户。

### 应用管理

![img](https://ai-answers.oss-cn-hangzhou.aliyuncs.com/3.2%E5%BA%94%E7%94%A8%E7%AE%A1%E7%90%86.jpg)

管理员用来审核各个应用模块（其他用户创建）。只有通过了才可以显示在主页上。

### 其他管理

题目管理：

![img](https://ai-answers.oss-cn-hangzhou.aliyuncs.com/3.3%E9%A2%98%E7%9B%AE%E7%AE%A1%E7%90%86.jpg)

评分管理：

![img](https://ai-answers.oss-cn-hangzhou.aliyuncs.com/3.4%E8%AF%84%E5%88%86%E7%AE%A1%E7%90%86.jpg)

回答管理：

![img](https://ai-answers.oss-cn-hangzhou.aliyuncs.com/3.5%E5%9B%9E%E7%AD%94%E7%AE%A1%E7%90%86.jpg)

使用分页查询得到这三个模块的内容。

### 应用统计

![img](https://ai-answers.oss-cn-hangzhou.aliyuncs.com/3.6%E5%BA%94%E7%94%A8%E7%BB%9F%E8%AE%A1.jpg)

可以看到各应用的用户使用次数，也可查询应用id来进行统计各个结果的分布情况。
