import Vue from 'vue'
import Router from 'vue-router'
import Join from "../components/member/Join";

Vue.use(Router)

export default new Router({
    mode:'history',
    routes: [
        {path:'/join', component:Join}
    ]
})
