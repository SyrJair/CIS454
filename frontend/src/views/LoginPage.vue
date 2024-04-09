<template>
    <a href="#loginSection" class="skip" tabindex="-1">Skip to Content</a> 
    <div class="parallax">
        <img src="../assets/tempLoginBackground.jpg" alt="peaceful sunset forest landscape">
    </div>
    <section class="titleScreen" id="top">
        <h1 id="title">Moo Meditations</h1>
        <div id="loginGo">
            <a href="#loginPointer"> <h2 id="loginButton">Login</h2> </a>
        </div>
        
    </section>
    
    <div class="container">
        <section class="loginSection">
            <a id="loginPointer"></a>
            <div class="top">
                <h3 id="login">Login</h3>
            </div>
            <div class="bottom">
                <h3>Have an account?</h3>
                <form action="#" class="signin-form" @submit.prevent="login">
                    <div class="userPass formItem" id="usernameInput">
                        <input type="text" placeholder="Username" required>
                    </div>
                    <div class="userPass formItem" id="passwordInput">
                        <input type="text" placeholder="Password" required>
                    </div>
                    <div class="formItem">
                        <button type="submit" id="loginSubmit">Sign In</button>
                    </div>
                    <div class="formItem" for="rememberCheck">
                        <label for="rememberCheck">
                            <input type="checkbox" id="rememberCheck">
                            <h5 id="rememberText">Remember Me</h5>
                        </label>
                    </div>
                    <div class="accountAlternative">
                        <div class="forgot">
                            <a href="#">Forgot Password</a>
                        </div>
                        <div class="make">
                            <RouterLink to="/register">Make an Account</RouterLink>
                        </div>
                    </div>
                    
                </form>
            </div>
        </section>
    </div>
</template>
<script>
    import { RouterLink  } from 'vue-router';

   export default {
    components: {
        RouterLink
    },
    methods: {
        login() {
        // login logic here...
        // if login is successful, navigate to MainPage
        this.$router.go('/main');
    }
  }
}
     
</script>
<style>
    /* https://www.canva.com/learn/website-color-schemes/ #18 color scheme for now */
    /* Navy: #0F1626 | Leather: #AB987A | Coral: #FF533D | Eggshell: #F5F5F5*/

    /* GENERAL */
    .skip {display: none;}
    html 
    {
        height:100%;
    }
    * 
    {
        font-family: "Lato", Arial, sans-serif;
        line-height: 1.8;
        font-weight: normal;
        position: relative;
        padding: 0;
        margin:0 auto 0 auto;
        max-width:100%;
        box-sizing:border-box;
    }
    .parallax 
    {
        position:sticky;
        top:0;
        bottom:0;
        z-index:1;
        background-image:url("../assets/tempLoginBackground.jpg");
        background-repeat:no-repeat;
        background-position:center;
        background-size: 100% 100%;
        height:100%;

    }
    .parallax img 
    {
        height:max-content;
        filter:blur(5px) saturate(120%) contrast(120%);
        object-fit:cover;
        display:none;
    }

    /* TITLE SCREEN */
    .titleScreen
    {
        text-align:center;
        display:flex;
        align-items: center;
        flex-direction:column;
        justify-content:center;
        z-index:2;
        position:relative;
        margin-top:-53%;
        width:80%;
        padding-bottom:8%;
        border: 2px solid #0F1626;
        height:100vh;
    }
    #title 
    {
        margin-top:10%;
        font-size:8em;
        font-weight:bold;
        background-color: rgb(171, 152, 122, 0.5);
        color: #f5f5f5;
        -webkit-text-stroke: 1.2px #0F1626;
        border-radius:20px;
        padding: 0px 10px 0px 10px;
        border: 2px solid black;
    }
    #loginGo 
    {
        margin-top: 5%;
        font-size:2.5em;
        background-color: rgb(15, 22, 38, 0.5);
        border-radius:20px;
        padding: 0px 18px 0px 18px;
        border: 1px solid black;
    }
    #loginGo a 
    {
        text-decoration: none;
        text-align: center;
        color: #f5f5f5c1;

    }

    /* FORM */
    .container 
    {
        padding: 50vh 0 50vh 0;
    }
    #loginPointer 
    {
        position:relative;
        top:-5vh;
    }
    .loginSection 
    {
        text-align: center;
        z-index:2;
        position:relative;
        display:flex;
        background-color: rgb(15, 22, 38, 0.5);
        flex-direction:column;
        justify-content:space-evenly;
        width:40%;
        padding: 10% 0 10% 0;
        border: 1px solid #FF533D;
        border-radius:3px;
    }
    .top h3 
    {
        font-size: 3em;
        font-weight:lighter;
        color:#f5f5f5;
    }
    .top, .bottom 
    {
        z-index: 2;
        margin-top:10%;
    }
    .top 
    {
        border-top:2px solid black;
        width:50%;
    }
    .bottom h3 
    {
        margin-top:2%;
        font-size:2em;
        color:#f5f5f5;
        font-weight:lighter;
        padding-bottom:20px;
    }
    .bottom form 
    {
        border-top: 2px solid #0F1626;
        padding-top:20px;
    }
    .formItem 
    {
        margin-top:1.5em;
    }
    .userPass input
    {
        font-size:1.1em;
        margin: 1.25% 0 1.25% 0;
        padding: 0 10% 0 10%;
        height:2em;
        opacity:0.5;
        background-color: #AB987A;
        
    }
    #rememberText
    {
        margin-top: -2.1em;
        text-align:left;
        margin-left:20px;
        font-weight:100;
        color:#AB987A;
        cursor:pointer;
    }
    
    #rememberCheck 
    {
        margin-left: -29em;
    }

    .accountAlternative
    {
        display:flex;
        justify-content:space-between;
        width:130%;
    }
    .accountAlternative a 
    {
        text-decoration:none;
        color:#f5f5f5;
        font-size:small;
        padding: 0 20px 0 20px;
    }
    .forgot, .make 
    {
        width: 200px;
        margin-top:5%;
    }
    #loginSubmit 
    {
        width:100px;
        border: 2px solid #FF533D;
        color:#0F1626;
    }
    
    
</style>