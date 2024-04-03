<template>
    <div class="overall-page">
        <div class="left-layout">
            <div class="username-section">
                <h3 id="username">Username goes here</h3>
            </div>
            <div class="logout-section">
                <h3 id="logout">Logout</h3>
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
                <h3 id="shop">Shop</h3>
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
    /* added 4 lines of code after background-color to add background into left-layout WP */
    .left-layout 
    {
        justify-content:space-between;
        background-color:rgb(255, 255, 255);
        background-image: url(C:\Users\wtpar\OneDrive\Pictures\pixelcloudleftactual.png);
        background-size: 100% 100%; 
        background-repeat: no-repeat; 
        background-position: left center;
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
    .logout-section 
    {
        background-color:black;
        width: 50%;
        height:8%;
        display:flex;
        justify-content:center;
        text-align:center;
        flex-direction:column;
    }

    /* RIGHT LAYOUT */
    /* added 4 lines of code after background-color to add background into right-layout WP */
    .right-layout 
    {
        justify-content:space-between;
        background-color:rgb(255, 255, 255);
        background-image: url(C:\Users\wtpar\OneDrive\Desktop\CIS454\CIS454\cloudartrightactual.png);
        background-size: 100% 100%; 
        background-repeat: no-repeat; 
        background-position: right center;
    }
    .shop-section 
    {
        background-color:black;
        width:50%;
        height:10%;
        display:flex;
        justify-content:center;
        flex-direction:column;
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
    

</style> 