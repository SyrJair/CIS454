<template>
    <div class="overall-page">
        <div class="left-layout">
            <div class="username-section">
                <h3 id="username">Username goes here</h3>
            </div>
            <div class="logout-section">
                <button id="logout" class="button">Logout</button> <!-- Logout button -->
            </div>
        </div>
        <div class="main-layout">
            <div class="main-text">
                <h1>Welcome Back, (username)!</h1>
            </div>
            <div class="cow-section">
                <img id="cow" src="../assets/PixelCowCloud1.jpg">
                <RouterLink to="/Meditation" id="meditation-button">Meditate</RouterLink>
                <!-- cow section goes here -->
            </div>
            <div class="metrics-section">
                <div class="balance-section">
                    <h3>MooBucks Balance:</h3>
                </div>
                <div class="minutes-section">
                    <h3>Minutes Meditated:</h3>
                </div>
            </div>
        </div>
        <div class="right-layout">
            <div class="shop-section">
                <button id="shop" class="button">Shop</button> <!-- Shop button -->
            </div>
        </div>
    </div>
    \
</template>
<script>
    //function removeButton()
    //{ tbd on this one
    // document.getElementById("play-button-section").style.display="None"; 
    //}
</script> 
<style>
    /* All STUFF */
    .overall-page 
    {
        display:flex;
        justify-content:space-between;
        width:100%;
        max-height:100vh;
        z-index:1;
        background-repeat:no-repeat;
        background-size:cover;
    }
    .left-layout, .right-layout, .main-layout 
    {
        display:flex;
        flex-direction:column;
        height: 100vh;
    }
    .left-layout, .right-layout 
    {
        width:30%;
        padding: 3em 0 3em 0;
    }
    h3 
    {
        padding: 2em 0 2em 0;
    }
   
    /* LEFT LAYOUT */
    .left-layout 
    {
        justify-content:space-between;
        background-repeat: no-repeat; 
        background-image: url('../assets/cloud_LEFT.jpg'); 
        background-size:cover;
    }
    .username-section 
    {
        background-color:black;
        width: 50%;
        height:13%;
        text-align:center;
        display:flex;
        justify-content:center;
        flex-direction:column;
        border-radius:5%;
    }

    /* RIGHT LAYOUT */
    .right-layout 
    {
        justify-content:space-between;
        background-size: cover; 
        background-repeat: no-repeat; 
        background-image: url('../assets/cloud_RIGHT.jpg'); 

    }

    /* MAIN SECTION */
    .main-layout 
    {
        justify-content:space-evenly;
        background-color:pink;
        width:40vw;
    }
    .main-text 
    {
        background-color:pink;
        width:100%;
        height:15%;
        display:flex;
        justify-content:center;
        flex-direction:column;
        border-bottom: 2px solid black;
        border-top: 2px solid black;
    }
    .metrics-section 
    {
        display: flex;
        justify-content:space-apart;
        width:120%;
    }
    .cow-section 
    {
        background-color:black;
        z-index:5;
        width:110%;
        height:50%;
        margin: 0 auto 0 auto;
    }
    #cow 
    {
        width:80%;
        height:60%;
        left: 9.5%;
        position:absolute;
        z-index:5;
    }
    #meditation-button 
    {
        font-size:3em;
        text-align:center;
        text-decoration:none;
        top:80%;
        left:35%;
        color:white;
        padding:5px;
        background-color:black;
    }
    .balance-section, .minutes-section 
    {
        background-color:black;
        display:flex;
        justify-content:center;
        flex-direction:column;
        width:50%;
        height:60%;
    }
    
    /* Button styling */
    .button {
        background-color: #333; 
        color: white; 
        padding: 1rem 2rem; 
        font-size: 1rem; 
        border: none; 
        border-radius: 0.5rem; 
        cursor: pointer; 
        transition: background-color 0.3s ease; 
        text-align: center;
        display: block; 
        margin: 1rem auto; 
    }

    /* Button hover effect (darken button) */
    .button:hover {
        background-color: #555; 
    }

    

</style>