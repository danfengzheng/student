import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Login from '@/components/login'
import index from '@/components/backIndex'
import indexContent from '@/components/indexContent'
import adminList from '@/components/adminList'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'login',
      component: Login
    },{
      path:'/index',
      name:'index',
      component: index,
      children:[
        {
          path: '/', //首页统计
          component: indexContent
        },{
          path: 'adminList', 
          component: adminList
        }
      ]
    },{
      path:'*',
      component:index
    }
  ]
})
