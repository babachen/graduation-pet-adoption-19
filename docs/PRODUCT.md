# 基于微信小程序的流浪动物领养系统

本项目围绕“领养代替购买”的公益理念，构建了面向用户与管理员的全流程管理系统。用户侧以小程序为入口完成浏览、申请、沟通与回访；管理员侧提供动物管理、审核与运营配置。系统覆盖从信息发布到领养审核、回访跟踪的完整闭环。

---

## 一、项目目标
- 提升流浪动物信息触达与领养转化效率
- 让领养流程标准化、可追踪、可复盘
- 为志愿者与管理方提供协作平台

---

## 二、技术架构
- **前端（管理端）**：Vue3 + Element Plus + Pinia
- **前端（用户端）**：UniApp 小程序
- **后端**：Spring Boot + JPA/Hibernate
- **数据库**：MySQL
- **认证与安全**：JWT
- **文件上传**：支持图片上传与预览

---

## 三、核心功能
### 用户端（小程序）
- 动物浏览与详情展示（多图）
- 领养申请与申请进度
- 申请详情与留言沟通
- 回访记录查看
- 志愿者申请
- 个人资料编辑、头像上传、密码修改

### 管理端（Vue）
- 动物管理（图文、状态、图片）
- 领养申请审核与阶段管理
- 科普文章管理（多图上传）
- 轮播图管理（排序与预览）
- 回访记录管理
- 志愿者管理
- 用户管理与头像查看
- 消息管理（可搜索用户）

---

## 四、系统亮点
- 统一的图片上传与预览体验
- 管理端与用户端流程闭环
- 审核阶段清晰、状态可视化
- 数据库设计完整，支持扩展

---

## 五、数据库设计概览
- 用户与权限：`users`、`sessions`
- 动物与内容：`animal`、`animal_photo`、`article`、`article_image`
- 业务流程：`adoption_application`、`review_record`、`followup_record`
- 运营配置：`banner`
- 互动与服务：`message`、`volunteer_application`

---

## 六、总结
本系统从功能规划、数据建模到前后端联动，完成了流浪动物领养的完整业务闭环，并在体验与可维护性方面进行了优化。后续可进一步接入小程序订阅消息、地理位置与更多运营能力，以提升公益传播与领养效率。

## 演示与截图说明
![截图 1](./docs/screenshots/screen-01.png)

![截图 2](./docs/screenshots/screen-02.png)

![截图 3](./docs/screenshots/screen-03.png)

![截图 4](./docs/screenshots/screen-04.png)

![截图 5](./docs/screenshots/screen-05.png)

![截图 6](./docs/screenshots/screen-06.png)

![截图 7](http://file.bysj.site/blog/java/ab46d1fc419a4ab8a7d0cc5d0a4a0e84.png)

![截图 8](http://file.bysj.site/blog/java/5d3b5c38a7ef40a0a690078081580fde.png)