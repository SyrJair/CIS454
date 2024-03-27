<template>
    <div id="play-button-section" onclick="removeButton()">
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
    //{
    //   document.getElementById("play-button-section").style.display="None";
    //}
</script>
<style>
    #play-button-section 
    {
        font-size:5em;
        text-align:center;
        width: 50vw;
        margin: 0 auto 0 auto;
        padding:20px;
    }    

    .menu
    {
        list-style:none;
        display:none;
    }
    


</style>