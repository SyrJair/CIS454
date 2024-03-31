<template>
    <!-- this page is the same as signupPage except with a different form. I imagine there are more efficient ways of implementing this, but this is a small case. -->
    <a href="#signupSection" class="skip" tabindex="-1">Skip to Content</a>
    <div class="parallax">
        <img src="../assets/tempLoginBackground.jpg" alt="peaceful sunset forest landscape">
    </div>
    
    <div class="container">
        <section class="signupSection">
            <a id="signupPointer"></a>
            <div class="top">
                <h3 id="signup">Sign Up</h3>
            </div>
            <div class="bottom">
                <h3>Register an Account</h3>
                <form action="#" class="signup-form" @submit.prevent="register">
                    <div class="userPass formItem" id="usernameInput">
                        <input type="text" placeholder="Username" required>
                    </div>
                    <div class="userPass formItem" id="passwordInput">
                        <input type="text" placeholder="Password" required>
                    </div>
                    <div class="userPass formItem" id="emailInput">
                        <input type="email" placeholder="Email" required>
                    </div>
                    <div class="formItem">
                        <button type="submit" id="signupSubmit">Sign Up</button>
                    </div>
                    
                    <div class="accountAlternative">
                        <div class="make">
                            <RouterLink to="/">I already have an account</RouterLink>
                        </div>
                    </div>
                    
                </form>
            </div>
        </section>
    </div>
</template>
<script>
    import { RouterLink } from 'vue-router';
   export default {
    components: {
        RouterLink
    },
    methods: {
        register() {
        // register logic here...
        // if registration is successful, navigate to signupPage
        this.$router.go('/');
    }
  }
}
     
</script>
<style>
    /* https://www.canva.com/learn/website-color-schemes/ #18 color scheme for now */
    /* Navy: #0F1626 | Leather: #AB987A | Coral: #FF533D | Eggshell: #F5F5F5*/

    /* GENERAL */
    .skip {display: none;}
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
        z-index:1;
        background-image:url("../assets/tempLoginBackground.jpg");
        background-repeat:no-repeat;
        background-position:center;
        background-size: 100% 100%;
        width:100vw;
        height:100vh;

    }
    .parallax img 
    {
        height:max-content;
        filter:blur(5px) saturate(120%) contrast(120%);
        object-fit:cover;
        display:none;
    }

    /* FORM */
    .container 
    {
        padding: 50vh 0 50vh 0;
    }
    #signupPointer 
    {
        position:relative;
        top:-5vh;
    }
    .signupSection 
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
        margin-top:-168vh;
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
    #signupSubmit 
    {
        width:100px;
        border: 2px solid #FF533D;
        color:#0F1626;
    }
    
    
</style>