import { createApp } from 'vue'
import {createRouter, createWebHistory} from 'vue-router'
import BootstrapVue3 from 'bootstrap-vue-3';
import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap-vue-3/dist/bootstrap-vue-3.css';


import App from './App.vue'
import LoginPage from './views/LoginPage.vue'
import MainPage from './views/MainPage.vue'
import RegistrationPage from './views/RegistrationPage.vue'
import MeditationPage from './views/MeditationPage.vue'
import ShopPage from './views/ShopPage.vue'

// making the routes
const routes = [
    {path: '/main', component:MainPage},
    {path: '/', component:LoginPage},
    {path: '/register', component: RegistrationPage},
    {path: '/meditation', component:MeditationPage},
    {path: '/shop', component:ShopPage}
]

const router = createRouter({
    history: createWebHistory(),
    routes,
    scrollBehavior(to) {
        if (to.hash) {
          return { el: to.hash };
        } else {
          return { top: 0 };
        }
      }
});


// initializing the app
createApp(App).use(BootstrapVue3).use(router).mount('#app');

