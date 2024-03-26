import { createApp } from 'vue'
import {createRouter, createWebHistory} from 'vue-router'

import LoginPage from './views/LoginPage.vue'
import MainPage from './views/MainPage.vue'
import RegistrationPage from './views/RegistrationPage.vue'

// making the routes
const routes = [
    {path: '/main', component:MainPage},
    {path: '/login', component:LoginPage},
    {path: '/register', component: RegistrationPage}
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

// initializing the app
createApp(LoginPage).use(router).mount('#app')

