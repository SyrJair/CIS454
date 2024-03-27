import { createApp } from 'vue'
import {createRouter, createWebHistory} from 'vue-router'

import App from './App.vue'
import LoginPage from './views/LoginPage.vue'
import MainPage from './views/MainPage.vue'
import RegistrationPage from './views/RegistrationPage.vue'

// making the routes
const routes = [
    {path: '/main', component:MainPage},
    {path: '/', component:LoginPage},
    {path: '/register', component: RegistrationPage}
]

const router = createRouter({
    history: createWebHistory(),
    routes,
    scrollBehavior(to) {
        if (to.hash) {
          return { el: to.hash }
        } else {
          return { top: 0 }
        }
      }
})

// initializing the app
createApp(App).use(router).mount('#app')

