<template>
    <div class="content-container"> <!-- new code for border -->
        <!-- new code: Welcome text -->
        <div id="welcome-section">Welcome Back <span class="user-name">*insert username here*!</span></div> <!-- new code -->

        <div id="play-button-section">
            <h1 id="play-button">*COW ART*</h1>
        </div>
        
        <!-- new code: MooBucks and Minutes boxes -->
        <div class="info-boxes"> <!-- new code -->
            <div class="currency-box">MooBucks Balance:</div> <!-- new code -->
            <div class="minutes-box">Meditation Minutes:</div> <!-- new code -->
        </div> <!-- new code -->

        <div class="expandable-menu-section">
            <div>TBD icon placeholder</div>
            <ul class="menu">
                <li>Meditate</li>
                <li>Store</li>
            </ul>
        </div>
        
        <div class="cow">
            Cow here (TBD)
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
    #play-button-section {
        font-size: 2em;
        text-align: center;
        width: 50vw;
        margin: 0 auto;
        padding: 20px;
        cursor: pointer; /* added code, push later in class - Indicates the element is clickable */
    }

    .menu {
        list-style: none;
        display: none; /* added code, push later in class - Initially hides the menu */
    }

    .menu li:hover {
        background-color: lightgray; /* added code, push later in class - Adds hover effect on menu items */
    }

    .currency, .cow {
        text-align: center;
        margin: 10px 0; /* added code, push later in class - Adds consistent styling for currency and cow sections */
    }

    .content-container { /* new code for border */
        position: relative;
        margin: 0 auto;
        padding: 0 20%; /* Adjusts the padding to ensure the center area is larger. */
        text-align: center; /* new code - Ensure everything in content-container is centered */
    }

    .content-container::before,
    .content-container::after { /* new code for border */
        content: "";
        position: fixed;
        top: 0;
        bottom: 0;
        width: 3px; /* Width of the divider lines */
        background-color: #000; 
    }

    .content-container::before { /* new code for border */
        left: 15%; /* Adjust this value to control distance from the left border */
    }

    .content-container::after { /* new code for border */
        right: 15%; /* Adjust this value to control distance from the right border */
    }

    /* new code: Style for Welcome section */
    #welcome-section {
        position: relative; /* Fix the welcome section at the top */
        top: 0; /* new code */
        left: 0;
        right: 0;
        z-index: 1000; /* Ensure it's above other content */
        background-color: #fff; /* Background color for visibility */
        padding: 10px 0; /* new code - Add some padding */
    }

    .user-name {
        font-weight: bold; /* new code - Make the user name bold */
    }

    /* new code: Style for MooBucks and Minutes boxes */
    .info-boxes {
        display: flex;
        justify-content: space-around; /* new code - Distribute boxes evenly */
        margin-top: 20px; /* new code - Add some margin to the top */
    }

    .currency-box, .minutes-box {
        padding: 10px;
        border: 1px solid #000; /* new code - Add border for boxes */
        flex-basis: 30%; /* new code - Define the base width for flex items */
    }
</style> 

