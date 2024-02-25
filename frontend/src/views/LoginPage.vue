<template>
    <a href="#loginSection" class="skip" tabindex="-1">Skip to Content</a>
    <div class="parallax">
        <img src="../assets/tempLoginBackground.jpg" alt="peaceful sunset forest landscape">
    </div>
    <section class="titleScreen" id="top">
        <h1 id="title">Moo Meditations</h1>
        <div id="loginGo">
            <a href="#login"> <h2 id="loginButton">Login</h2> </a>
        </div>
        
    </section>
    <div>
    <section class="loginSection" id="login">
        <div class="top">
            <h3>Login</h3>
        </div>
        <div class="bottom">
            <h3>Have an account?</h3>
            <form action="#" class="signin-form">
                <div class="userPass" id="usernameInput">
                    <input type="text" placeholder="Username" required>
                </div>
                <div class="userPass" id="passwordInput">
                    <input type="text" placeholder="Password" required>
                </div>
                <div class="submitButton" id="loginSubmit">
                    <button type="submit">Sign In</button>
                </div>
                <div class="remember/forgot" for="rememberCheck">
                    <div class="left">
                        <label>
                            <input type="checkbox" id="rememberCheck">
                            <h5>Remember Me</h5>
                        </label>
                    </div>
                    <div class="right">
                        <a href="#">Forgot Password</a>
                    </div>
                </div>
            </form>
            <div class="signInAlternative">
                <p> --Or Sign In With-- </p>
                <div class="social">
                    <a href="#">Google</a>
                    <a href="#">Facebook</a>
                </div>
            </div>
        </div>
    </section>

    </div>
</template>
<script>

</script>
<style>
    /* GENERAL */
    .skip {display: none;}
    body 
    {
        font-family: "Lato", Arial, sans-serif;
        line-height: 1.8;
        font-weight: normal;
        position: relative;
        z-index: 0;
        padding: 0;
    }
    .parallax 
    {
        position:sticky;
        top:0;
        z-index:1;
    }

    /* TITLE SCREEN */
    .titleScreen
    {
        text-align:center;
        display:flex;
        margin-top:3%;
        align-items: center;
        flex-direction:column;
        justify-content:center;
    }
    #title 
    {
        margin-top:10%;
        font-size:8em;
    }
    #loginGo 
    {
        margin-top: 5%;
        font-size:3em;
    }
    #loginGo a 
    {
        text-decoration: none;
        text-align: center;
    }

    /* FORM */
    .loginSection 
    {
        text-align: center;
        margin-top: 50%;
        margin-bottom: 50%;
    }
    .top h3 
    {
        font-size: 4em;
    }
    .userPass input
    {
        font-size:2em;
        margin: 1.25% 0 1.25% 0;
        border-radius:2em;
    }
</style>