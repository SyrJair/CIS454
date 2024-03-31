<template>
    <div id="play-button-section">
        <h1 id="play-button">Play</h1>
    </div>
    <div class="currency">this is the currency</div>
    <div class="expandable-menu-section">
        <div>this is the block</div>
        <ul class="menu">
            <li>Meditate</li>
            <li>Store</li>
        </ul>
    </div>
    <div class="cow">
        this is the cow
    </div>
</template>
<script>
    
    //function removeButton()
    //{ tbd on this one
    // document.getElementById("play-button-section").style.display="None"; // idk why this thing is displaying blue all of a sudden?
    //}
</script> 
<style>
    #play-button-section {
        font-size: 5em;
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
</style> 