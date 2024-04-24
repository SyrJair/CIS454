<!-- README: Registration is currently not operational, could not link with back end -->

<template>
    <!-- Skip link for accessibility, allow users to navigate to the main content -->
    <a href="#signupSection" class="skip" tabindex="-1">Skip to Content</a>
    
    <!-- Parallax background for visual appeal -->
    <div class="parallax">
        <img src="../assets/tempLoginBackground.jpg" alt="peaceful sunset forest landscape">
    </div>
    
    <!-- Container for the signup form -->
    <div class="container">
        <!-- Signup section containing the form -->
        <section class="signupSection">
            <!-- Pointer for skip link to focus on the form -->
            <a id="signupPointer"></a>
            <!-- Top part of the form with a heading -->
            <div class="top">
                <h3 id="signup">Sign Up</h3>
            </div>
            <!-- Bottom part of the form with registration fields -->
            <div class="bottom">
                <h3>Register an Account</h3>
                <!-- Form for signup with prevention against default form submit behavior -->
                <form action="#" class="signup-form" @submit.prevent="register">
                    <!-- Username input field -->
                    <div class="userPass formItem" id="usernameInput">
                        <input type="text" placeholder="Username" required>
                    </div>
                    <!-- Password input field -->
                    <div class="userPass formItem" id="passwordInput">
                        <input type="text" placeholder="Password" required>
                    </div>
                    <!-- Email input field -->
                    <div class="userPass formItem" id="emailInput">
                        <input type="email" placeholder="Email" required>
                    </div>
                    <!-- Submit button for the form -->
                    <div class="formItem">
                        <button type="submit" id="signupSubmit">Sign Up</button>
                    </div>
                    
                    <!-- Link for users who already have an account -->
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
            // Method for handling user registration
            register() {
                // Implement registration logic here...
                // Navigate to the main page if registration is successful
                this.$router.go('/');
            }
        }
    }
</script>



<style>
    /* https://www.canva.com/learn/website-color-schemes/ #18 color scheme for now */
    /* Navy: #0F1626 | Leather: #AB987A | Coral: #FF533D | Eggshell: #F5F5F5*/

    /* General styles applying to all elements */
    .skip {display: none;}
    * {
        font-family: "Lato", Arial, sans-serif;
        line-height: 1.8;
        font-weight: normal;
        position: relative;
        padding: 0;
        margin:0 auto 0 auto;
        max-width:100%;
        box-sizing:border-box;
    }
    /* Parallax background setup */
    .parallax {
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
    /* Hides the img element used for the parallax to use CSS background instead */
    .parallax img {
        height:max-content;
        filter:blur(5px) saturate(120%) contrast(120%);
        object-fit:cover;
        display:none;
    }

    /* Form container styles */
    .container {
        padding: 50vh 0 50vh 0;
    }
    /* Signup pointer positioning */
    #signupPointer {
        position:relative;
        top:-10vh;
    }
    /* Styling for the signup form section */
    .signupSection {
        text-align: center;
        z-index:2;
        position:relative;
        display:flex;
        background-color: rgb(15, 22, 38, 0.5);
        flex-direction:column;
        justify-content:space-evenly;
        width:40%;
        padding: 5% 0 5% 0;
        border: 1px solid #FF533D;
        border-radius:3px;
        margin-top:-158vh;
    }
    /* Styling for form headings */
    .top h3, .bottom h3 {
        font-size: 3em;
        font-weight: lighter;
        color: #f5f5f5;
    }
    /* Adjustments for form layout */
    .top, .bottom {
        z-index: 2;
        margin-top:10%;
    }
    .bottom {
        margin-top: 5%;
    }
    .top {
        border-top:2px solid black;
        width:50%;
    }
    .bottom form {
        border-top: 2px solid #0F1626;
    }
    /* Form input styling */
    .formItem {
        margin-top:1.5em;
    }
    .userPass input {
        font-size:1.1em;
        margin: 1.25% 0 1.25% 0;
        padding: 0 10% 0 10%;
        height:2em;
        opacity:0.5;
        background-color: #AB987A;
    }

    /* Link styling for account alternatives */
    .accountAlternative {
        display:flex;
        justify-content:space-between;
        width:130%;
    }
    .accountAlternative a {
        text-decoration:none;
        color:#f5f5f5;
        font-size:small;
        padding: 0 20px 0 20px;
    }
    .forgot, .make {
        width: 200px;
        margin-top:5%;
    }
    #signupSubmit {
        width:100px;
        border: 2px solid #FF533D;
        color:#0F1626;
    }
</style>
