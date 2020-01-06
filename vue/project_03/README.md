# project_03
---
## 组件嵌套、组件之间的通信、路由机制、solt传值 

### 组件嵌套  
> 在组件中使用 <b>components</b> 定义子组件，可以定义多个，定义好以后，就可以在组件的模板中使用子组件了。看下面示例：具体解释在注释中<a href="./project_03/Test_01.html">点击查看</a>

### 父子组件之间的通信
使用 v-bind：  （或直接用冒号） 传递数据，使用props接收数据，代码如下 <a href="./project_03/Test_02.html">点击查看</a>  
解释一下数据的传递流程（以msg2为例）：在父组件中的数据中有个msg2数据，在模板中调用子组件的时候 以名为 m2 传递给了子组件  
 ```<bbb :m1="msg1" :m2="msg2"></bbb>```  
 然后在子组件中就可以通过props接收到  
 ```props:["m1","m2"],```  
 这样在子组件中就可以使用变量 this.m2访问到 父组件的 msg2对应的值了。（如果传的值是对象，则传递引用指针，如果传递的是基本类型，则直接将值传递过去）

 ### 非父子组件之间的通信
 上面我们使用props只能解决父子组件之间的通信，当两个兄弟关系的组件，就不能这样传递了  
 兄弟节点之间需要使用 事件的触发方法 $emit去实现  
 看下面示例：具体解释在注释中<a href="./project_03/Test_03.html">点击查看</a>  

 ---
 ## 路由
 ---
 路由可以让我们在页面中加载不同的模板内容，使用vue的路由，需要借助vue-router.js  
 ```
<script src="https://unpkg.com/vue/dist/vue.js"></script>
<script src="https://unpkg.com/vue-router/dist/vue-router.js"></script>
```

代码如下：代码解释在注释中。<a href="./project_03/Test_04.html">点击查看</a>  

### 二级路由：具体解释在注释中
注：  
二级路由使用children来配置 ，内部配置和一级路由一样  
tab切换中的当前选项标签会自动添加 router-link-active类，我们只需要设置该类的样式，就可以实现当前选中的样式了。
代码如下：<a href="./project_03/Test_05.html">点击查看</a>  

###  url参数传递
 在配置路由的时候，路径名前面加 冒号，就表示此路径为参数  
 完整示例代码如下：<a href="./project_03/Test_06.html">点击查看</a> 