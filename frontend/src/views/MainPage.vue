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
    * 
    {
        max-height:100vh;
    }
    .overall-page 
    {
        display:flex;
        justify-content:space-apart;
        width:100%;
    }
    .left-layout, .right-layout, .main-layout 
    {
        display:flex;
        flex-direction:column;
        height: 100vh;
    }
    .left-layout, .right-layout 
    {
        width:22vw;
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
        background-image: url('../assets/cloud_LEFT.jpg'); 
        background-size: cover; 
        background-repeat: no-repeat; 
    }
    .username-section 
    {
        background-color:black;
        width: 70%;
        height:13%;
        text-align:center;
        display:flex;
        justify-content:center;
        flex-direction:column;
    }

    /* RIGHT LAYOUT */
    .right-layout 
    {
        justify-content:space-between;
        background-image: url('../assets/cloud_RIGHT.jpg'); 
        background-size: cover; 
        background-repeat: no-repeat; 
    }

    /* MAIN SECTION */
    .main-layout 
    {
        justify-content:space-evenly;
    }
    .main-text 
    {
        background-color:pink;
        width:100%;
        height:15%;
        display:flex;
        justify-content:center;
        flex-direction:column;
    }
    .metrics-section 
    {
        display: flex;
        justify-content:space-apart;
        width:120%;
    }
    .cow-section 
    {
        background-color:pink;
        z-index:5;
        width:110%;
        height:50%;
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