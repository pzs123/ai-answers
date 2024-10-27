# AI 答题应用平台

[toc]



## 一、项目介绍

一款基于 Vue 3 + Spring Boot + Redis + ChatGLM + RxJava + SSE 的 **AI 答题应用平台。**

用户可以基于 AI 快速制作并发布答题应用，支持检索、分享、在线答题并基于 AI 得到回答总结；管理员可以集中管理和审核应用。

答题应用：比如 MBTI 性格测试，相当于一份试卷里有很多道题目，大家根据题目选择选项，最终提交答案并得到性格分析结果。

本项目可以在这种测试的基础上，再上升一个层次，开发 `答题应用平台`，所有人都可以在平台上制作发布自己的答题应用，畅玩别人的答题应用。

用户界面：

![用户主页](\photo\1.1用户主页.jpg)

管理员界面：

![管理员主页](\photo\1.2管理员主页.jpg)

进入任意一个模块可开始答题：

![模块答题](\photo\1.3模块答题.jpg)

答题结束以后可得到结果：

![结果分析](\photo\1.4结果分析.jpg)


## 二、基础功能介绍

### 应用创建

![创建应用](\photo\2.1创建应用.jpg)

这里评分策略有自定义和AI两项。使用自定义需要自己指定评分规则，而使用AI则可以根据回答自动判题。

### 题目设置

![设置题目](\photo\2.2设置题目.jpg)

可以手动或者AI添加题目。如果使用AI添加，AI会根据创建应用的标题和描述来设置题目，可以设定添加题目的数量和选项数量。

![AI生成题目](\photo\2.3AI生成题目.jpg)

这里一键生成和实时生成的结果是一样的。

一键生成：使用AI生成后的默认接口（AI将题目完全生成后一次性将数据全部返回前端）。

实时生成：基于 RxJava 的操作符链式调用处理 AI 异步数据流，使前端可以实时接收 AI 生成的问题结果。

### 评分设置

![设置评分](\photo\2.4设置评分.jpg)

如果是创建应用时选择的是自定义，则还需要补充评分设置规则。

### 查看答题记录

![我的答题](\photo\2.5我的答题.jpg)

点击“我的答题”模块即可看到答题的结果记录。


## 三、管理员功能

### 用户管理

![用户管理](\photo\3.1用户管理.jpg)

此模块管理员可查询到各个用户。

### 应用管理

![3.2应用管理](\photo\3.2应用管理.jpg)

管理员用来审核各个应用模块（其他用户创建）。只有通过了才可以显示在主页上。

### 其他管理

题目管理：

![3.3题目管理](\photo\3.3题目管理.jpg)

评分管理：

![3.4评分管理](\photo\3.4评分管理.jpg)

回答管理：

![3.5回答管理](\photo\3.5回答管理.jpg)

使用分页查询得到这三个模块的内容。

### 应用统计

![3.6应用统计](\photo\3.6应用统计.jpg)

可以看到各应用的用户使用次数，也可查询应用id来进行统计各个结果的分布情况。
