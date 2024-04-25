<template>
    <!-- Overall Page Container -->
    <div class="overall-page">
        <!-- Left Layout: User Information and Actions -->
        <div class="left-layout">
            <div class="username-section">
                <h3 id="username">USERNAME SECTION</h3> <!-- Displays the username -->
            </div>
            <div class="logout-section">
                <!-- README: This logout button uses RouterLink-->
                <!-- We used RouterLink here because of its simplicity-->
                <!-- In a more applicable situation the logout button would have more strings attached-->
                <!-- This is because you would have to clear user data, invalidate sessions, and follow other security practices -->
                <RouterLink to="/" id="logout" class="button">Logout</RouterLink> <!-- Logout button -->
            </div>
        </div>
        <!-- Main Layout: Central Content Area -->
        <div class="main-layout">
            <div class="main-text">
                <h1>Welcome Back, (USERNAME)!</h1> <!-- Personalized welcome message -->
            </div>
            <div class="cow-section">
                <img id="cow" src="../assets/PixelCowCloud1.jpg"> <!-- Decorative image -->
                <RouterLink to="/Meditation" id="meditation-button">Go meditate!</RouterLink> <!-- Navigation link -->
            </div>
            <!-- Metrics Section: Displays User Stats -->
            <div class="metrics-section">
                <div class="balance-section">
                    <h3>MooBucks Balance:</h3> <!-- Shows current balance -->
                </div>
                <div class="minutes-section">
                    <h3>Minutes Meditated:</h3> <!-- Shows total meditation minutes -->
                </div>
            </div>
        </div>
        <!-- Right Layout: Additional Options -->
        <div class="right-layout">
            <div class="shop-section">
                <RouterLink to="/Shop" id="shop" class="button">Shop</RouterLink> <!-- Shop link button -->
            </div>
        </div>
    </div>
</template>
<script>
    //function removeButton()
    //{ tbd on this one
    // document.getElementById("play-button-section").style.display="None"; 
    //}
</script> 
<style>
    /* README: Overall Page Style - This section defines the basic layout and background properties for the overall application page */
    .overall-page {
        display: flex;
        justify-content: space-between;
        width: 100%;
        max-height: 100vh;
        z-index: 1;
        background-repeat: no-repeat;
        background-size: cover;
    }

    /* README: Layout Configuration - Styles for the left, right, and main layout areas, defining their display type, direction, and dimensions */
    .left-layout, .right-layout, .main-layout {
        display: flex;
        flex-direction: column;
        height: 100vh;
    }
    .left-layout, .right-layout {
        width: 30%;
        padding: 3em 0 3em 0;
    }

    /* README: Text Style - Basic styling for header elements within different sections */
    h3 {
        padding: 2em 0 2em 0;
    }

    /* README: Left Layout Background - Specific background styles for the left layout area */
    .left-layout {
        justify-content: space-between;
        background-repeat: no-repeat; 
        background-image: url('../assets/cloud_LEFT.jpg'); 
        background-size: cover;
    }

    /* README: Username Section - Style for username display area */
    .username-section {
        background-color: #333;
        width: 50%;
        height: 13%;
        text-align: center;
        display: flex;
        justify-content: center;
        flex-direction: column;
        border-radius: 5%;
    }

    /* README: Right Layout Background - Specific background styles for the right layout area */
    .right-layout {
        justify-content: space-between;
        background-size: cover; 
        background-repeat: no-repeat; 
        background-image: url('../assets/cloud_RIGHT.jpg'); 
    }

    /* README: Main Layout - Styling for the central content area including color and layout adjustments */
    .main-layout {
        justify-content: space-evenly;
        background-color: rgb(134, 226, 236);
        width: 40vw;
    }
    .main-text {
        background-color: rgb(134, 226, 236);
        width: 100%;
        height: 15%;
        display: flex;
        justify-content: center;
        flex-direction: column;
        border-bottom: 2px solid black;
        border-top: 2px solid black;
    }
    .metrics-section {
        display: flex;
        justify-content: space-apart;
        width: 120%;
    }

    /* README: Cow Section - Style for the section that includes a decorative image and navigation link */
    .cow-section {
        background-color: rgb(134, 226, 236);
        z-index: 5;
        width: 110%;
        height: 50%;
        margin: 0 auto 0 auto;
    }

    /* README: Image and Button Styles - Definitions for image dimensions and button aesthetics */
    #cow {
        width: 80%;
        height: 60%;
        left: 9.5%;
        position: absolute;
        z-index: 5;
    }
    #meditation-button {
        font-size: 3em;
        text-align: center;
        text-decoration: none;
        top: 80%;
        left: 35%;
        color: white;
        border: none; 
        border-radius: 0.5rem; 
        padding: 5px;
        background-color: #333;
    }
    .balance-section, .minutes-section {
        background-color: black;
        display: flex;
        justify-content: center;
        flex-direction: column;
        width: 50%;
        height: 60%;
    }

    /* README: Button Interaction - Styling for button hover effects to improve user experience */
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
    .button:hover {
        background-color: #555; 
    }
</style>
