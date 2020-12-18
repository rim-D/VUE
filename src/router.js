import Vue from 'vue';
import VueRouter from 'vue-router';

import Bar from './components/Bar.vue';
import Foo from './components/Foo.vue';
import NotFound from './components/NotFound.vue';
import Baz from './components/Baz.vue'


Vue.use(VueRouter); // 라우터 사용하겠다는 명령

const routes = [
    {path:'/', component:Bar, name:'Bar'},
    {path:'/login', component:Foo, name:'Foo'}, 
    {path:'/my', component:Baz, name:'Baz'}, 
    {path:'*', component:NotFound, name:'NotFound'},
]

const router = new VueRouter({routes});
export default router; // main.js에 적용