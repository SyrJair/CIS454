import { createApp } from 'vue'
import {createRouter, createWebHistory} from 'vue-router'

import LoginPage from './views/LoginPage.vue'
import MainPage from './views/MainPage.vue'

// making the routes
const routes = [
    {path: '/main', component:MainPage},
    {path: '/', component:LoginPage}
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

// initializing the app
createApp(LoginPage).use(router).mount('#app')

